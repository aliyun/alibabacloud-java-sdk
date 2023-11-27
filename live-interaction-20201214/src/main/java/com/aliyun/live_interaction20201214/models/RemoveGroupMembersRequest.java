// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class RemoveGroupMembersRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("RequestParams")
    public RemoveGroupMembersRequestRequestParams requestParams;

    public static RemoveGroupMembersRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveGroupMembersRequest self = new RemoveGroupMembersRequest();
        return TeaModel.build(map, self);
    }

    public RemoveGroupMembersRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public RemoveGroupMembersRequest setRequestParams(RemoveGroupMembersRequestRequestParams requestParams) {
        this.requestParams = requestParams;
        return this;
    }
    public RemoveGroupMembersRequestRequestParams getRequestParams() {
        return this.requestParams;
    }

    public static class RemoveGroupMembersRequestRequestParams extends TeaModel {
        @NameInMap("AppCid")
        public String appCid;

        @NameInMap("AppUidsRemoved")
        public java.util.List<String> appUidsRemoved;

        @NameInMap("OperatorAppUid")
        public String operatorAppUid;

        public static RemoveGroupMembersRequestRequestParams build(java.util.Map<String, ?> map) throws Exception {
            RemoveGroupMembersRequestRequestParams self = new RemoveGroupMembersRequestRequestParams();
            return TeaModel.build(map, self);
        }

        public RemoveGroupMembersRequestRequestParams setAppCid(String appCid) {
            this.appCid = appCid;
            return this;
        }
        public String getAppCid() {
            return this.appCid;
        }

        public RemoveGroupMembersRequestRequestParams setAppUidsRemoved(java.util.List<String> appUidsRemoved) {
            this.appUidsRemoved = appUidsRemoved;
            return this;
        }
        public java.util.List<String> getAppUidsRemoved() {
            return this.appUidsRemoved;
        }

        public RemoveGroupMembersRequestRequestParams setOperatorAppUid(String operatorAppUid) {
            this.operatorAppUid = operatorAppUid;
            return this;
        }
        public String getOperatorAppUid() {
            return this.operatorAppUid;
        }

    }

}
