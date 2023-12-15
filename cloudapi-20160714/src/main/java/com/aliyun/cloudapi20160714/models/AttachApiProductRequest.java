// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class AttachApiProductRequest extends TeaModel {
    /**
     * <p>The ID of the API product.</p>
     */
    @NameInMap("ApiProductId")
    public String apiProductId;

    /**
     * <p>The APIs to be attached.</p>
     */
    @NameInMap("Apis")
    public java.util.List<AttachApiProductRequestApis> apis;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static AttachApiProductRequest build(java.util.Map<String, ?> map) throws Exception {
        AttachApiProductRequest self = new AttachApiProductRequest();
        return TeaModel.build(map, self);
    }

    public AttachApiProductRequest setApiProductId(String apiProductId) {
        this.apiProductId = apiProductId;
        return this;
    }
    public String getApiProductId() {
        return this.apiProductId;
    }

    public AttachApiProductRequest setApis(java.util.List<AttachApiProductRequestApis> apis) {
        this.apis = apis;
        return this;
    }
    public java.util.List<AttachApiProductRequestApis> getApis() {
        return this.apis;
    }

    public AttachApiProductRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public static class AttachApiProductRequestApis extends TeaModel {
        /**
         * <p>The API ID.</p>
         */
        @NameInMap("ApiId")
        public String apiId;

        /**
         * <p>The environment. Valid values:</p>
         * <br>
         * <p>*   **RELEASE**: the production environment</p>
         * <p>*   **PRE**: the staging environment</p>
         * <p>*   **TEST**: the test environment</p>
         */
        @NameInMap("StageName")
        public String stageName;

        public static AttachApiProductRequestApis build(java.util.Map<String, ?> map) throws Exception {
            AttachApiProductRequestApis self = new AttachApiProductRequestApis();
            return TeaModel.build(map, self);
        }

        public AttachApiProductRequestApis setApiId(String apiId) {
            this.apiId = apiId;
            return this;
        }
        public String getApiId() {
            return this.apiId;
        }

        public AttachApiProductRequestApis setStageName(String stageName) {
            this.stageName = stageName;
            return this;
        }
        public String getStageName() {
            return this.stageName;
        }

    }

}
