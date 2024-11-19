// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CreateDestinationResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>iot.system.SystemException</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Destination")
    public CreateDestinationResponseBodyDestination destination;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <strong>example:</strong>
     * <p>E4C0FF92-2A86-41DB-92D3-73B60310D25E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CreateDestinationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDestinationResponseBody self = new CreateDestinationResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDestinationResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateDestinationResponseBody setDestination(CreateDestinationResponseBodyDestination destination) {
        this.destination = destination;
        return this;
    }
    public CreateDestinationResponseBodyDestination getDestination() {
        return this.destination;
    }

    public CreateDestinationResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public CreateDestinationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateDestinationResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateDestinationResponseBodyDestination extends TeaModel {
        @NameInMap("Configuration")
        public String configuration;

        /**
         * <strong>example:</strong>
         * <p>1003</p>
         */
        @NameInMap("DestinationId")
        public Long destinationId;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsFailover")
        public Boolean isFailover;

        /**
         * <strong>example:</strong>
         * <p>DataPurpose</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>REPUBLISH</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <strong>example:</strong>
         * <p>2022-03-27T12:45:43.000Z</p>
         */
        @NameInMap("UtcCreated")
        public String utcCreated;

        public static CreateDestinationResponseBodyDestination build(java.util.Map<String, ?> map) throws Exception {
            CreateDestinationResponseBodyDestination self = new CreateDestinationResponseBodyDestination();
            return TeaModel.build(map, self);
        }

        public CreateDestinationResponseBodyDestination setConfiguration(String configuration) {
            this.configuration = configuration;
            return this;
        }
        public String getConfiguration() {
            return this.configuration;
        }

        public CreateDestinationResponseBodyDestination setDestinationId(Long destinationId) {
            this.destinationId = destinationId;
            return this;
        }
        public Long getDestinationId() {
            return this.destinationId;
        }

        public CreateDestinationResponseBodyDestination setIsFailover(Boolean isFailover) {
            this.isFailover = isFailover;
            return this;
        }
        public Boolean getIsFailover() {
            return this.isFailover;
        }

        public CreateDestinationResponseBodyDestination setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateDestinationResponseBodyDestination setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public CreateDestinationResponseBodyDestination setUtcCreated(String utcCreated) {
            this.utcCreated = utcCreated;
            return this;
        }
        public String getUtcCreated() {
            return this.utcCreated;
        }

    }

}
