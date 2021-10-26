// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class BatchAbolishApisRequest extends TeaModel {
    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("Api")
    public java.util.List<BatchAbolishApisRequestApi> api;

    public static BatchAbolishApisRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchAbolishApisRequest self = new BatchAbolishApisRequest();
        return TeaModel.build(map, self);
    }

    public BatchAbolishApisRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public BatchAbolishApisRequest setApi(java.util.List<BatchAbolishApisRequestApi> api) {
        this.api = api;
        return this;
    }
    public java.util.List<BatchAbolishApisRequestApi> getApi() {
        return this.api;
    }

    public static class BatchAbolishApisRequestApi extends TeaModel {
        @NameInMap("StageId")
        public String stageId;

        @NameInMap("GroupId")
        public String groupId;

        @NameInMap("ApiUid")
        public String apiUid;

        public static BatchAbolishApisRequestApi build(java.util.Map<String, ?> map) throws Exception {
            BatchAbolishApisRequestApi self = new BatchAbolishApisRequestApi();
            return TeaModel.build(map, self);
        }

        public BatchAbolishApisRequestApi setStageId(String stageId) {
            this.stageId = stageId;
            return this;
        }
        public String getStageId() {
            return this.stageId;
        }

        public BatchAbolishApisRequestApi setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public BatchAbolishApisRequestApi setApiUid(String apiUid) {
            this.apiUid = apiUid;
            return this;
        }
        public String getApiUid() {
            return this.apiUid;
        }

    }

}
