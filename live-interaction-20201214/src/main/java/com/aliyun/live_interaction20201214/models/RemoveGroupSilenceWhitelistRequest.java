// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class RemoveGroupSilenceWhitelistRequest extends TeaModel {
    // AppId
    @NameInMap("AppId")
    public String appId;

    // 群禁言添加白名单请求体
    @NameInMap("RequestParams")
    public RemoveGroupSilenceWhitelistRequestRequestParams requestParams;

    public static RemoveGroupSilenceWhitelistRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveGroupSilenceWhitelistRequest self = new RemoveGroupSilenceWhitelistRequest();
        return TeaModel.build(map, self);
    }

    public RemoveGroupSilenceWhitelistRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public RemoveGroupSilenceWhitelistRequest setRequestParams(RemoveGroupSilenceWhitelistRequestRequestParams requestParams) {
        this.requestParams = requestParams;
        return this;
    }
    public RemoveGroupSilenceWhitelistRequestRequestParams getRequestParams() {
        return this.requestParams;
    }

    public static class RemoveGroupSilenceWhitelistRequestRequestParams extends TeaModel {
        // 操作者
        @NameInMap("OperatorAppUid")
        public String operatorAppUid;

        // 群会话id
        @NameInMap("AppCid")
        public String appCid;

        // 禁言用户列表
        @NameInMap("Members")
        public java.util.List<String> members;

        public static RemoveGroupSilenceWhitelistRequestRequestParams build(java.util.Map<String, ?> map) throws Exception {
            RemoveGroupSilenceWhitelistRequestRequestParams self = new RemoveGroupSilenceWhitelistRequestRequestParams();
            return TeaModel.build(map, self);
        }

        public RemoveGroupSilenceWhitelistRequestRequestParams setOperatorAppUid(String operatorAppUid) {
            this.operatorAppUid = operatorAppUid;
            return this;
        }
        public String getOperatorAppUid() {
            return this.operatorAppUid;
        }

        public RemoveGroupSilenceWhitelistRequestRequestParams setAppCid(String appCid) {
            this.appCid = appCid;
            return this;
        }
        public String getAppCid() {
            return this.appCid;
        }

        public RemoveGroupSilenceWhitelistRequestRequestParams setMembers(java.util.List<String> members) {
            this.members = members;
            return this;
        }
        public java.util.List<String> getMembers() {
            return this.members;
        }

    }

}
