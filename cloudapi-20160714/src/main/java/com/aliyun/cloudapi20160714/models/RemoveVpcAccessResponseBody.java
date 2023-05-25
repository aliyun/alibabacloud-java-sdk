// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class RemoveVpcAccessResponseBody extends TeaModel {
    @NameInMap("Apis")
    public RemoveVpcAccessResponseBodyApis apis;

    @NameInMap("RequestId")
    public String requestId;

    public static RemoveVpcAccessResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RemoveVpcAccessResponseBody self = new RemoveVpcAccessResponseBody();
        return TeaModel.build(map, self);
    }

    public RemoveVpcAccessResponseBody setApis(RemoveVpcAccessResponseBodyApis apis) {
        this.apis = apis;
        return this;
    }
    public RemoveVpcAccessResponseBodyApis getApis() {
        return this.apis;
    }

    public RemoveVpcAccessResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class RemoveVpcAccessResponseBodyApisApi extends TeaModel {
        /**
         * <p>API Id</p>
         */
        @NameInMap("ApiId")
        public String apiId;

        @NameInMap("GroupId")
        public String groupId;

        @NameInMap("StageId")
        public String stageId;

        public static RemoveVpcAccessResponseBodyApisApi build(java.util.Map<String, ?> map) throws Exception {
            RemoveVpcAccessResponseBodyApisApi self = new RemoveVpcAccessResponseBodyApisApi();
            return TeaModel.build(map, self);
        }

        public RemoveVpcAccessResponseBodyApisApi setApiId(String apiId) {
            this.apiId = apiId;
            return this;
        }
        public String getApiId() {
            return this.apiId;
        }

        public RemoveVpcAccessResponseBodyApisApi setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public RemoveVpcAccessResponseBodyApisApi setStageId(String stageId) {
            this.stageId = stageId;
            return this;
        }
        public String getStageId() {
            return this.stageId;
        }

    }

    public static class RemoveVpcAccessResponseBodyApis extends TeaModel {
        @NameInMap("Api")
        public java.util.List<RemoveVpcAccessResponseBodyApisApi> api;

        public static RemoveVpcAccessResponseBodyApis build(java.util.Map<String, ?> map) throws Exception {
            RemoveVpcAccessResponseBodyApis self = new RemoveVpcAccessResponseBodyApis();
            return TeaModel.build(map, self);
        }

        public RemoveVpcAccessResponseBodyApis setApi(java.util.List<RemoveVpcAccessResponseBodyApisApi> api) {
            this.api = api;
            return this;
        }
        public java.util.List<RemoveVpcAccessResponseBodyApisApi> getApi() {
            return this.api;
        }

    }

}
