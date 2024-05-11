// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class BatchAbolishApisRequest extends TeaModel {
    /**
     * <p>The APIs that you want to operate.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Api")
    public java.util.List<BatchAbolishApisRequestApi> api;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static BatchAbolishApisRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchAbolishApisRequest self = new BatchAbolishApisRequest();
        return TeaModel.build(map, self);
    }

    public BatchAbolishApisRequest setApi(java.util.List<BatchAbolishApisRequestApi> api) {
        this.api = api;
        return this;
    }
    public java.util.List<BatchAbolishApisRequestApi> getApi() {
        return this.api;
    }

    public BatchAbolishApisRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public static class BatchAbolishApisRequestApi extends TeaModel {
        /**
         * <p>The ID of the API.</p>
         * <br>
         * <p>This parameter is required.</p>
         */
        @NameInMap("ApiUid")
        public String apiUid;

        /**
         * <p>The ID of the API group.</p>
         * <br>
         * <p>This parameter is required.</p>
         */
        @NameInMap("GroupId")
        public String groupId;

        /**
         * <p>The ID of the environment.</p>
         */
        @NameInMap("StageId")
        public String stageId;

        /**
         * <p>The name of the environment.</p>
         */
        @NameInMap("StageName")
        public String stageName;

        public static BatchAbolishApisRequestApi build(java.util.Map<String, ?> map) throws Exception {
            BatchAbolishApisRequestApi self = new BatchAbolishApisRequestApi();
            return TeaModel.build(map, self);
        }

        public BatchAbolishApisRequestApi setApiUid(String apiUid) {
            this.apiUid = apiUid;
            return this;
        }
        public String getApiUid() {
            return this.apiUid;
        }

        public BatchAbolishApisRequestApi setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public BatchAbolishApisRequestApi setStageId(String stageId) {
            this.stageId = stageId;
            return this;
        }
        public String getStageId() {
            return this.stageId;
        }

        public BatchAbolishApisRequestApi setStageName(String stageName) {
            this.stageName = stageName;
            return this;
        }
        public String getStageName() {
            return this.stageName;
        }

    }

}
