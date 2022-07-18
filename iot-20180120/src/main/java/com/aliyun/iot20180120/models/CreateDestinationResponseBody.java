// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CreateDestinationResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Destination")
    public CreateDestinationResponseBodyDestination destination;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

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

        @NameInMap("DestinationId")
        public Long destinationId;

        @NameInMap("IsFailover")
        public Boolean isFailover;

        @NameInMap("Name")
        public String name;

        @NameInMap("Type")
        public String type;

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
