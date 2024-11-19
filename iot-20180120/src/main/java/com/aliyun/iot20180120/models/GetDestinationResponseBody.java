// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class GetDestinationResponseBody extends TeaModel {
    /**
     * <p>The error code returned if the request fails. For more information, see <a href="https://help.aliyun.com/document_detail/87387.html">Error codes</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>iot.system.SystemException</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The information about the data destination.</p>
     */
    @NameInMap("Destination")
    public GetDestinationResponseBodyDestination destination;

    /**
     * <p>The error message returned if the request fails.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>E4C0FF92-2A86-41DB-92D3-73B60310D25E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetDestinationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDestinationResponseBody self = new GetDestinationResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDestinationResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetDestinationResponseBody setDestination(GetDestinationResponseBodyDestination destination) {
        this.destination = destination;
        return this;
    }
    public GetDestinationResponseBodyDestination getDestination() {
        return this.destination;
    }

    public GetDestinationResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetDestinationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDestinationResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetDestinationResponseBodyDestination extends TeaModel {
        /**
         * <p>The configuration data of the data destination.</p>
         */
        @NameInMap("Configuration")
        public String configuration;

        /**
         * <p>The ID of the data destination.</p>
         * 
         * <strong>example:</strong>
         * <p>1003</p>
         */
        @NameInMap("DestinationId")
        public String destinationId;

        /**
         * <p>Indicates whether the data destination is configured to receive error operation data. Error operation data is data that failed to be forwarded for two consecutive times.</p>
         * <ul>
         * <li><strong>true</strong>: The data destination is configured to receive error operation data.</li>
         * <li><strong>false</strong>: The data destination is configured to receive regular data instead of error operation data.</li>
         * </ul>
         * <p>Default value: <strong>false</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsFailover")
        public Boolean isFailover;

        /**
         * <p>The name of the data destination.</p>
         * 
         * <strong>example:</strong>
         * <p>DataPurpose</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>NORMAL</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The operation that is performed on the data of the data destination.</p>
         * <ul>
         * <li><strong>REPUBLISH</strong>: forwards topic data that is processed by a parser script to an IoT Platform communication topic.</li>
         * <li><strong>AMQP</strong>: forwards topic data that is processed by a parser script to an Advanced Message Queuing Protocol (AMQP) consumer group.</li>
         * <li><strong>DATAHUB</strong>: forwards topic data to Alibaba Cloud DataHub for stream data processing.</li>
         * <li><strong>ONS</strong>: forwards topic data that is processed by a parser script to Message Queue for Apache RocketMQ for message distribution.</li>
         * <li><strong>MNS</strong>: forwards topic data to Message Service (MNS) for message transmission.</li>
         * <li><strong>FC</strong>: forwards topic data to Function Compute for event computing.</li>
         * <li><strong>OTS</strong>: forwards topic data to Tablestore for NoSQL data storage.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>REPUBLISH</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The time when the data destination was created. The time is displayed in UTC. Format: <code>yyyy-MM-dd\\&quot;T\\&quot;HH:mm:ss.SSS\\&quot;Z\\&quot;</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-03-27T12:45:43.000Z</p>
         */
        @NameInMap("UtcCreated")
        public String utcCreated;

        public static GetDestinationResponseBodyDestination build(java.util.Map<String, ?> map) throws Exception {
            GetDestinationResponseBodyDestination self = new GetDestinationResponseBodyDestination();
            return TeaModel.build(map, self);
        }

        public GetDestinationResponseBodyDestination setConfiguration(String configuration) {
            this.configuration = configuration;
            return this;
        }
        public String getConfiguration() {
            return this.configuration;
        }

        public GetDestinationResponseBodyDestination setDestinationId(String destinationId) {
            this.destinationId = destinationId;
            return this;
        }
        public String getDestinationId() {
            return this.destinationId;
        }

        public GetDestinationResponseBodyDestination setIsFailover(Boolean isFailover) {
            this.isFailover = isFailover;
            return this;
        }
        public Boolean getIsFailover() {
            return this.isFailover;
        }

        public GetDestinationResponseBodyDestination setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetDestinationResponseBodyDestination setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetDestinationResponseBodyDestination setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetDestinationResponseBodyDestination setUtcCreated(String utcCreated) {
            this.utcCreated = utcCreated;
            return this;
        }
        public String getUtcCreated() {
            return this.utcCreated;
        }

    }

}
