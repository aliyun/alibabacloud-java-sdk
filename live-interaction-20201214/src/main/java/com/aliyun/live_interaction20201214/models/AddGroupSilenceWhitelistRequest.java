// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class AddGroupSilenceWhitelistRequest extends TeaModel {
    // AppId
    @NameInMap("AppId")
    public String appId;

    // 群禁言添加白名单请求体
    @NameInMap("RequestParams")
    public AddGroupSilenceWhitelistRequestRequestParams requestParams;

    public static AddGroupSilenceWhitelistRequest build(java.util.Map<String, ?> map) throws Exception {
        AddGroupSilenceWhitelistRequest self = new AddGroupSilenceWhitelistRequest();
        return TeaModel.build(map, self);
    }

    public AddGroupSilenceWhitelistRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public AddGroupSilenceWhitelistRequest setRequestParams(AddGroupSilenceWhitelistRequestRequestParams requestParams) {
        this.requestParams = requestParams;
        return this;
    }
    public AddGroupSilenceWhitelistRequestRequestParams getRequestParams() {
        return this.requestParams;
    }

    public static class AddGroupSilenceWhitelistRequestRequestParams extends TeaModel {
        // 操作者
        @NameInMap("OperatorAppUid")
        public String operatorAppUid;

        // 群会话id
        @NameInMap("AppCid")
        public String appCid;

        // 禁言用户列表
        @NameInMap("Members")
        public java.util.List<String> members;

        public static AddGroupSilenceWhitelistRequestRequestParams build(java.util.Map<String, ?> map) throws Exception {
            AddGroupSilenceWhitelistRequestRequestParams self = new AddGroupSilenceWhitelistRequestRequestParams();
            return TeaModel.build(map, self);
        }

        public AddGroupSilenceWhitelistRequestRequestParams setOperatorAppUid(String operatorAppUid) {
            this.operatorAppUid = operatorAppUid;
            return this;
        }
        public String getOperatorAppUid() {
            return this.operatorAppUid;
        }

        public AddGroupSilenceWhitelistRequestRequestParams setAppCid(String appCid) {
            this.appCid = appCid;
            return this;
        }
        public String getAppCid() {
            return this.appCid;
        }

        public AddGroupSilenceWhitelistRequestRequestParams setMembers(java.util.List<String> members) {
            this.members = members;
            return this;
        }
        public java.util.List<String> getMembers() {
            return this.members;
        }

    }

}
