// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class AddGroupSilenceBlacklistRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("RequestParams")
    public AddGroupSilenceBlacklistRequestRequestParams requestParams;

    public static AddGroupSilenceBlacklistRequest build(java.util.Map<String, ?> map) throws Exception {
        AddGroupSilenceBlacklistRequest self = new AddGroupSilenceBlacklistRequest();
        return TeaModel.build(map, self);
    }

    public AddGroupSilenceBlacklistRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public AddGroupSilenceBlacklistRequest setRequestParams(AddGroupSilenceBlacklistRequestRequestParams requestParams) {
        this.requestParams = requestParams;
        return this;
    }
    public AddGroupSilenceBlacklistRequestRequestParams getRequestParams() {
        return this.requestParams;
    }

    public static class AddGroupSilenceBlacklistRequestRequestParams extends TeaModel {
        @NameInMap("AppCid")
        public String appCid;

        @NameInMap("Members")
        public java.util.List<String> members;

        @NameInMap("OperatorAppUid")
        public String operatorAppUid;

        @NameInMap("SilenceDuration")
        public Long silenceDuration;

        public static AddGroupSilenceBlacklistRequestRequestParams build(java.util.Map<String, ?> map) throws Exception {
            AddGroupSilenceBlacklistRequestRequestParams self = new AddGroupSilenceBlacklistRequestRequestParams();
            return TeaModel.build(map, self);
        }

        public AddGroupSilenceBlacklistRequestRequestParams setAppCid(String appCid) {
            this.appCid = appCid;
            return this;
        }
        public String getAppCid() {
            return this.appCid;
        }

        public AddGroupSilenceBlacklistRequestRequestParams setMembers(java.util.List<String> members) {
            this.members = members;
            return this;
        }
        public java.util.List<String> getMembers() {
            return this.members;
        }

        public AddGroupSilenceBlacklistRequestRequestParams setOperatorAppUid(String operatorAppUid) {
            this.operatorAppUid = operatorAppUid;
            return this;
        }
        public String getOperatorAppUid() {
            return this.operatorAppUid;
        }

        public AddGroupSilenceBlacklistRequestRequestParams setSilenceDuration(Long silenceDuration) {
            this.silenceDuration = silenceDuration;
            return this;
        }
        public Long getSilenceDuration() {
            return this.silenceDuration;
        }

    }

}
