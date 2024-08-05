// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class AttachApiProductRequest extends TeaModel {
    /**
     * <p>The ID of the API product.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>117b7a64a8b3f064eaa4a47ac62aac5e</p>
     */
    @NameInMap("ApiProductId")
    public String apiProductId;

    /**
     * <p>The APIs to be attached.</p>
     * <p>This parameter is required.</p>
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>551877242a4b4f3a84a56b7c3570e4a7</p>
         */
        @NameInMap("ApiId")
        public String apiId;

        /**
         * <p>The environment. Valid values:</p>
         * <ul>
         * <li><strong>RELEASE</strong>: the production environment</li>
         * <li><strong>PRE</strong>: the staging environment</li>
         * <li><strong>TEST</strong>: the test environment</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>RELEASE</p>
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
