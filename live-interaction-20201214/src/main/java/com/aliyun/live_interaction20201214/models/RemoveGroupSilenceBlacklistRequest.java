// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class RemoveGroupSilenceBlacklistRequest extends TeaModel {
    // AppId
    @NameInMap("AppId")
    public String appId;

    // 群禁言删除黑名单请求体
    @NameInMap("RequestParams")
    public RemoveGroupSilenceBlacklistRequestRequestParams requestParams;

    public static RemoveGroupSilenceBlacklistRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveGroupSilenceBlacklistRequest self = new RemoveGroupSilenceBlacklistRequest();
        return TeaModel.build(map, self);
    }

    public RemoveGroupSilenceBlacklistRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public RemoveGroupSilenceBlacklistRequest setRequestParams(RemoveGroupSilenceBlacklistRequestRequestParams requestParams) {
        this.requestParams = requestParams;
        return this;
    }
    public RemoveGroupSilenceBlacklistRequestRequestParams getRequestParams() {
        return this.requestParams;
    }

    public static class RemoveGroupSilenceBlacklistRequestRequestParams extends TeaModel {
        // 操作者
        @NameInMap("OperatorAppUid")
        public String operatorAppUid;

        // 群会话id
        @NameInMap("AppCid")
        public String appCid;

        // 禁言用户列表
        @NameInMap("Members")
        public java.util.List<String> members;

        public static RemoveGroupSilenceBlacklistRequestRequestParams build(java.util.Map<String, ?> map) throws Exception {
            RemoveGroupSilenceBlacklistRequestRequestParams self = new RemoveGroupSilenceBlacklistRequestRequestParams();
            return TeaModel.build(map, self);
        }

        public RemoveGroupSilenceBlacklistRequestRequestParams setOperatorAppUid(String operatorAppUid) {
            this.operatorAppUid = operatorAppUid;
            return this;
        }
        public String getOperatorAppUid() {
            return this.operatorAppUid;
        }

        public RemoveGroupSilenceBlacklistRequestRequestParams setAppCid(String appCid) {
            this.appCid = appCid;
            return this;
        }
        public String getAppCid() {
            return this.appCid;
        }

        public RemoveGroupSilenceBlacklistRequestRequestParams setMembers(java.util.List<String> members) {
            this.members = members;
            return this;
        }
        public java.util.List<String> getMembers() {
            return this.members;
        }

    }

}
