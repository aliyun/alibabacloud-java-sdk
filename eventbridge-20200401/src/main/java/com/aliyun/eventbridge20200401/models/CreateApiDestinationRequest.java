// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class CreateApiDestinationRequest extends TeaModel {
    /**
     * <p>The name of the API destination. The name must be 2 to 127 characters in length.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>api-destination-name</p>
     */
    @NameInMap("ApiDestinationName")
    public String apiDestinationName;

    /**
     * <p>The name of the connection. The name must be 2 to 127 characters in length.</p>
     * <blockquote>
     * <p>Before you configure this parameter, you must call the CreateConnection operation to create a connection. Then, set this parameter to the name of the connection that you created.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>connection-name</p>
     */
    @NameInMap("ConnectionName")
    public String connectionName;

    /**
     * <p>The description of the API destination. The description can be up to 255 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>Description of the connection configuration</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The parameters that are configured for the API destination.</p>
     * <p>This parameter is required.</p>
     */
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
        /**
         * <p>The endpoint of the API destination. The endpoint can be up to 127 characters in length.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://127.0.0.1:8001/api">http://127.0.0.1:8001/api</a></p>
         */
        @NameInMap("Endpoint")
        public String endpoint;

        /**
         * <p>The HTTP request method. Valid values:</p>
         * <ul>
         * <li><p>GET</p>
         * </li>
         * <li><p>POST</p>
         * </li>
         * <li><p>HEAD</p>
         * </li>
         * <li><p>DELETE</p>
         * </li>
         * <li><p>PUT</p>
         * </li>
         * <li><p>PATCH</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>POST</p>
         */
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
