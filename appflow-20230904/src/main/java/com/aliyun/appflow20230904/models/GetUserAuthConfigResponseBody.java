// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appflow20230904.models;

import com.aliyun.tea.*;

public class GetUserAuthConfigResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>458CB9FE-8C71-58A8-AD49-97EF28D58FAB</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Contains the credential details.</p>
     */
    @NameInMap("UserAuthConfig")
    public GetUserAuthConfigResponseBodyUserAuthConfig userAuthConfig;

    public static GetUserAuthConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetUserAuthConfigResponseBody self = new GetUserAuthConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public GetUserAuthConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetUserAuthConfigResponseBody setUserAuthConfig(GetUserAuthConfigResponseBodyUserAuthConfig userAuthConfig) {
        this.userAuthConfig = userAuthConfig;
        return this;
    }
    public GetUserAuthConfigResponseBodyUserAuthConfig getUserAuthConfig() {
        return this.userAuthConfig;
    }

    public static class GetUserAuthConfigResponseBodyUserAuthConfig extends TeaModel {
        /**
         * <p>The auth config, specified as a JSON string.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;apiKey&quot;:\&quot;xxxxxxxxxx\&quot;}</p>
         */
        @NameInMap("AuthConfig")
        public String authConfig;

        /**
         * <p>The credential ID.</p>
         * 
         * <strong>example:</strong>
         * <p>uac-111111111</p>
         */
        @NameInMap("AuthConfigId")
        public String authConfigId;

        /**
         * <p>The credential name.</p>
         * 
         * <strong>example:</strong>
         * <p>dingtlak_name</p>
         */
        @NameInMap("AuthConfigName")
        public String authConfigName;

        /**
         * <p>The authentication type.</p>
         * 
         * <strong>example:</strong>
         * <p>ApiKey</p>
         */
        @NameInMap("AuthType")
        public String authType;

        /**
         * <p>The connector ID.</p>
         * 
         * <strong>example:</strong>
         * <p>connector-172176821387</p>
         */
        @NameInMap("ConnectorId")
        public String connectorId;

        /**
         * <p>The connector version.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ConnectorVersion")
        public String connectorVersion;

        public static GetUserAuthConfigResponseBodyUserAuthConfig build(java.util.Map<String, ?> map) throws Exception {
            GetUserAuthConfigResponseBodyUserAuthConfig self = new GetUserAuthConfigResponseBodyUserAuthConfig();
            return TeaModel.build(map, self);
        }

        public GetUserAuthConfigResponseBodyUserAuthConfig setAuthConfig(String authConfig) {
            this.authConfig = authConfig;
            return this;
        }
        public String getAuthConfig() {
            return this.authConfig;
        }

        public GetUserAuthConfigResponseBodyUserAuthConfig setAuthConfigId(String authConfigId) {
            this.authConfigId = authConfigId;
            return this;
        }
        public String getAuthConfigId() {
            return this.authConfigId;
        }

        public GetUserAuthConfigResponseBodyUserAuthConfig setAuthConfigName(String authConfigName) {
            this.authConfigName = authConfigName;
            return this;
        }
        public String getAuthConfigName() {
            return this.authConfigName;
        }

        public GetUserAuthConfigResponseBodyUserAuthConfig setAuthType(String authType) {
            this.authType = authType;
            return this;
        }
        public String getAuthType() {
            return this.authType;
        }

        public GetUserAuthConfigResponseBodyUserAuthConfig setConnectorId(String connectorId) {
            this.connectorId = connectorId;
            return this;
        }
        public String getConnectorId() {
            return this.connectorId;
        }

        public GetUserAuthConfigResponseBodyUserAuthConfig setConnectorVersion(String connectorVersion) {
            this.connectorVersion = connectorVersion;
            return this;
        }
        public String getConnectorVersion() {
            return this.connectorVersion;
        }

    }

}
