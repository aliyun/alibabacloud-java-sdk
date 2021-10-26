// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class BatchDeployApisRequest extends TeaModel {
    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("StageName")
    public String stageName;

    @NameInMap("Description")
    public String description;

    @NameInMap("Api")
    public java.util.List<BatchDeployApisRequestApi> api;

    public static BatchDeployApisRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchDeployApisRequest self = new BatchDeployApisRequest();
        return TeaModel.build(map, self);
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

    public BatchDeployApisRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public BatchDeployApisRequest setApi(java.util.List<BatchDeployApisRequestApi> api) {
        this.api = api;
        return this;
    }
    public java.util.List<BatchDeployApisRequestApi> getApi() {
        return this.api;
    }

    public static class BatchDeployApisRequestApi extends TeaModel {
        @NameInMap("GroupId")
        public String groupId;

        @NameInMap("ApiUid")
        public String apiUid;

        public static BatchDeployApisRequestApi build(java.util.Map<String, ?> map) throws Exception {
            BatchDeployApisRequestApi self = new BatchDeployApisRequestApi();
            return TeaModel.build(map, self);
        }

        public BatchDeployApisRequestApi setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public BatchDeployApisRequestApi setApiUid(String apiUid) {
            this.apiUid = apiUid;
            return this;
        }
        public String getApiUid() {
            return this.apiUid;
        }

    }

}
