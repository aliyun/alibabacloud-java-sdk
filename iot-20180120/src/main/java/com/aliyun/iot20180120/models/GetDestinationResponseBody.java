// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class GetDestinationResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Destination")
    public GetDestinationResponseBodyDestination destination;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("Configuration")
        public String configuration;

        @NameInMap("DestinationId")
        public String destinationId;

        @NameInMap("IsFailover")
        public Boolean isFailover;

        @NameInMap("Name")
        public String name;

        @NameInMap("Status")
        public String status;

        @NameInMap("Type")
        public String type;

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
