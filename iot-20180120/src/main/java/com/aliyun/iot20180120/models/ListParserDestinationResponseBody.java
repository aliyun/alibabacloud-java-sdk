// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class ListParserDestinationResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>iot.system.SystemException</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ListParserDestinationResponseBodyData data;

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

    public static ListParserDestinationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListParserDestinationResponseBody self = new ListParserDestinationResponseBody();
        return TeaModel.build(map, self);
    }

    public ListParserDestinationResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListParserDestinationResponseBody setData(ListParserDestinationResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListParserDestinationResponseBodyData getData() {
        return this.data;
    }

    public ListParserDestinationResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListParserDestinationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListParserDestinationResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListParserDestinationResponseBodyDataDestinations extends TeaModel {
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

        /**
         * <strong>example:</strong>
         * <p>2022-05-27T12:45:43.000Z</p>
         */
        @NameInMap("UtcModified")
        public String utcModified;

        public static ListParserDestinationResponseBodyDataDestinations build(java.util.Map<String, ?> map) throws Exception {
            ListParserDestinationResponseBodyDataDestinations self = new ListParserDestinationResponseBodyDataDestinations();
            return TeaModel.build(map, self);
        }

        public ListParserDestinationResponseBodyDataDestinations setConfiguration(String configuration) {
            this.configuration = configuration;
            return this;
        }
        public String getConfiguration() {
            return this.configuration;
        }

        public ListParserDestinationResponseBodyDataDestinations setDestinationId(Long destinationId) {
            this.destinationId = destinationId;
            return this;
        }
        public Long getDestinationId() {
            return this.destinationId;
        }

        public ListParserDestinationResponseBodyDataDestinations setIsFailover(Boolean isFailover) {
            this.isFailover = isFailover;
            return this;
        }
        public Boolean getIsFailover() {
            return this.isFailover;
        }

        public ListParserDestinationResponseBodyDataDestinations setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListParserDestinationResponseBodyDataDestinations setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListParserDestinationResponseBodyDataDestinations setUtcCreated(String utcCreated) {
            this.utcCreated = utcCreated;
            return this;
        }
        public String getUtcCreated() {
            return this.utcCreated;
        }

        public ListParserDestinationResponseBodyDataDestinations setUtcModified(String utcModified) {
            this.utcModified = utcModified;
            return this;
        }
        public String getUtcModified() {
            return this.utcModified;
        }

    }

    public static class ListParserDestinationResponseBodyData extends TeaModel {
        @NameInMap("destinations")
        public java.util.List<ListParserDestinationResponseBodyDataDestinations> destinations;

        public static ListParserDestinationResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListParserDestinationResponseBodyData self = new ListParserDestinationResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListParserDestinationResponseBodyData setDestinations(java.util.List<ListParserDestinationResponseBodyDataDestinations> destinations) {
            this.destinations = destinations;
            return this;
        }
        public java.util.List<ListParserDestinationResponseBodyDataDestinations> getDestinations() {
            return this.destinations;
        }

    }

}
