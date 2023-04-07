// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class CreateApiDestinationRequest extends TeaModel {
    @NameInMap("ApiDestinationName")
    public String apiDestinationName;

    @NameInMap("ConnectionName")
    public String connectionName;

    @NameInMap("Description")
    public String description;

    @NameInMap("HttpApiParameters")
    public CreateApiDestinationRequestHttpApiParameters httpApiParameters;

    public static CreateApiDestinationRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateApiDestinationRequest self = new CreateApiDestinationRequest();
        return TeaModel.build(map, self);
    }

    public CreateApiDestinationRequest setApiDestinationName(String apiDestinationName) {
        this.apiDestinationName = apiDestinationName;
        return this;
    }
    public String getApiDestinationName() {
        return this.apiDestinationName;
    }

    public CreateApiDestinationRequest setConnectionName(String connectionName) {
        this.connectionName = connectionName;
        return this;
    }
    public String getConnectionName() {
        return this.connectionName;
    }

    public CreateApiDestinationRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateApiDestinationRequest setHttpApiParameters(CreateApiDestinationRequestHttpApiParameters httpApiParameters) {
        this.httpApiParameters = httpApiParameters;
        return this;
    }
    public CreateApiDestinationRequestHttpApiParameters getHttpApiParameters() {
        return this.httpApiParameters;
    }

    public static class CreateApiDestinationRequestHttpApiParameters extends TeaModel {
        @NameInMap("Endpoint")
        public String endpoint;

        @NameInMap("Method")
        public String method;

        public static CreateApiDestinationRequestHttpApiParameters build(java.util.Map<String, ?> map) throws Exception {
            CreateApiDestinationRequestHttpApiParameters self = new CreateApiDestinationRequestHttpApiParameters();
            return TeaModel.build(map, self);
        }

        public CreateApiDestinationRequestHttpApiParameters setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public CreateApiDestinationRequestHttpApiParameters setMethod(String method) {
            this.method = method;
            return this;
        }
        public String getMethod() {
            return this.method;
        }

    }

}
