// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class UpdateApiDestinationRequest extends TeaModel {
    /**
     * <p>The name of the API destination. The name must be 2 to 127 characters in length.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ApiDestinationName")
    public String apiDestinationName;

    /**
     * <p>The name of the connection. The name must be 2 to 127 characters in length.</p>
     * <br>
     * <p>Note: Before you configure this parameter, you must call the CreateConnection operation to create a connection. Then, set this parameter to the name of the connection that you created.</p>
     */
    @NameInMap("ConnectionName")
    public String connectionName;

    /**
     * <p>The description of the API destination. The description can be up to 255 characters in length.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The parameters that are configured for the API destination.</p>
     */
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
        /**
         * <p>The endpoint of the API destination. The endpoint can be up to 127 characters in length.</p>
         */
        @NameInMap("Endpoint")
        public String endpoint;

        /**
         * <p>The HTTP request method. Valid values:</p>
         * <br>
         * <p>- GET</p>
         * <p>- POST</p>
         * <p>- HEAD</p>
         * <p>- DELETE</p>
         * <p>- PUT</p>
         * <p>- PATCH</p>
         */
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
