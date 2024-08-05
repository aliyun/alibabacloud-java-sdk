// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DetachApiProductRequest extends TeaModel {
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
     * <p>The APIs that you want to detach from the API product.</p>
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ba84c55eca46488598da17c0609f3ead</p>
         */
        @NameInMap("ApiId")
        public String apiId;

        /**
         * <p>The environment to which the API is published. Valid values:</p>
         * <ul>
         * <li><strong>RELEASE</strong>: the production environment</li>
         * <li><strong>PRE</strong>: the pre-release environment</li>
         * <li><strong>TEST</strong>: the test environment</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>RELEASE</p>
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
