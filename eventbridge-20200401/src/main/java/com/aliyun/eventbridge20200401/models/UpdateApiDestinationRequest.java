// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class UpdateApiDestinationRequest extends TeaModel {
    @NameInMap("ApiDestinationName")
    public String apiDestinationName;

    @NameInMap("ConnectionName")
    public String connectionName;

    @NameInMap("Description")
    public String description;

    @NameInMap("HttpApiParameters")
    public UpdateApiDestinationRequestHttpApiParameters httpApiParameters;

    public static UpdateApiDestinationRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateApiDestinationRequest self = new UpdateApiDestinationRequest();
        return TeaModel.build(map, self);
    }

    public UpdateApiDestinationRequest setApiDestinationName(String apiDestinationName) {
        this.apiDestinationName = apiDestinationName;
        return this;
    }
    public String getApiDestinationName() {
        return this.apiDestinationName;
    }

    public UpdateApiDestinationRequest setConnectionName(String connectionName) {
        this.connectionName = connectionName;
        return this;
    }
    public String getConnectionName() {
        return this.connectionName;
    }

    public UpdateApiDestinationRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateApiDestinationRequest setHttpApiParameters(UpdateApiDestinationRequestHttpApiParameters httpApiParameters) {
        this.httpApiParameters = httpApiParameters;
        return this;
    }
    public UpdateApiDestinationRequestHttpApiParameters getHttpApiParameters() {
        return this.httpApiParameters;
    }

    public static class UpdateApiDestinationRequestHttpApiParameters extends TeaModel {
        @NameInMap("Endpoint")
        public String endpoint;

        @NameInMap("Method")
        public String method;

        public static UpdateApiDestinationRequestHttpApiParameters build(java.util.Map<String, ?> map) throws Exception {
            UpdateApiDestinationRequestHttpApiParameters self = new UpdateApiDestinationRequestHttpApiParameters();
            return TeaModel.build(map, self);
        }

        public UpdateApiDestinationRequestHttpApiParameters setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public UpdateApiDestinationRequestHttpApiParameters setMethod(String method) {
            this.method = method;
            return this;
        }
        public String getMethod() {
            return this.method;
        }

    }

}
