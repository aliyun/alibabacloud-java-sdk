// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class BatchDeployApisRequest extends TeaModel {
    /**
     * <p>The APIs that you want to publish.</p>
     */
    @NameInMap("Api")
    public java.util.List<BatchDeployApisRequestApi> api;

    /**
     * <p>The description.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Description")
    public String description;

    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>The name of the runtime environment. Valid values:</p>
     * <ul>
     * <li><strong>RELEASE</strong></li>
     * <li><strong>TEST</strong></li>
     * <li>PRE: the pre-release environment</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>RELEASE</p>
     */
    @NameInMap("StageName")
    public String stageName;

    public static BatchDeployApisRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchDeployApisRequest self = new BatchDeployApisRequest();
        return TeaModel.build(map, self);
    }

    public BatchDeployApisRequest setApi(java.util.List<BatchDeployApisRequestApi> api) {
        this.api = api;
        return this;
    }
    public java.util.List<BatchDeployApisRequestApi> getApi() {
        return this.api;
    }

    public BatchDeployApisRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public BatchDeployApisRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public BatchDeployApisRequest setStageName(String stageName) {
        this.stageName = stageName;
        return this;
    }
    public String getStageName() {
        return this.stageName;
    }

    public static class BatchDeployApisRequestApi extends TeaModel {
        /**
         * <p>The API ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2b35dd68345b472f8051647306a16415</p>
         */
        @NameInMap("ApiUid")
        public String apiUid;

        /**
         * <p>The API group ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>b4f5c342b8bc4ef88ccda0332402e0fa</p>
         */
        @NameInMap("GroupId")
        public String groupId;

        public static BatchDeployApisRequestApi build(java.util.Map<String, ?> map) throws Exception {
            BatchDeployApisRequestApi self = new BatchDeployApisRequestApi();
            return TeaModel.build(map, self);
        }

        public BatchDeployApisRequestApi setApiUid(String apiUid) {
            this.apiUid = apiUid;
            return this;
        }
        public String getApiUid() {
            return this.apiUid;
        }

        public BatchDeployApisRequestApi setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

    }

}
