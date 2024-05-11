// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DetachApiProductRequest extends TeaModel {
    /**
     * <p>The ID of the API product.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ApiProductId")
    public String apiProductId;

    /**
     * <p>The APIs that you want to detach from the API product.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Apis")
    public java.util.List<DetachApiProductRequestApis> apis;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static DetachApiProductRequest build(java.util.Map<String, ?> map) throws Exception {
        DetachApiProductRequest self = new DetachApiProductRequest();
        return TeaModel.build(map, self);
    }

    public DetachApiProductRequest setApiProductId(String apiProductId) {
        this.apiProductId = apiProductId;
        return this;
    }
    public String getApiProductId() {
        return this.apiProductId;
    }

    public DetachApiProductRequest setApis(java.util.List<DetachApiProductRequestApis> apis) {
        this.apis = apis;
        return this;
    }
    public java.util.List<DetachApiProductRequestApis> getApis() {
        return this.apis;
    }

    public DetachApiProductRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public static class DetachApiProductRequestApis extends TeaModel {
        /**
         * <p>The API ID.</p>
         * <br>
         * <p>This parameter is required.</p>
         */
        @NameInMap("ApiId")
        public String apiId;

        /**
         * <p>The environment to which the API is published. Valid values:</p>
         * <br>
         * <p>*   **RELEASE**: the production environment</p>
         * <p>*   **PRE**: the pre-release environment</p>
         * <p>*   **TEST**: the test environment</p>
         * <br>
         * <p>This parameter is required.</p>
         */
        @NameInMap("StageName")
        public String stageName;

        public static DetachApiProductRequestApis build(java.util.Map<String, ?> map) throws Exception {
            DetachApiProductRequestApis self = new DetachApiProductRequestApis();
            return TeaModel.build(map, self);
        }

        public DetachApiProductRequestApis setApiId(String apiId) {
            this.apiId = apiId;
            return this;
        }
        public String getApiId() {
            return this.apiId;
        }

        public DetachApiProductRequestApis setStageName(String stageName) {
            this.stageName = stageName;
            return this;
        }
        public String getStageName() {
            return this.stageName;
        }

    }

}
