// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class MuteUsersRequest extends TeaModel {
    // AppId
    @NameInMap("AppId")
    public String appId;

    @NameInMap("RequestParams")
    public MuteUsersRequestRequestParams requestParams;

    public static MuteUsersRequest build(java.util.Map<String, ?> map) throws Exception {
        MuteUsersRequest self = new MuteUsersRequest();
        return TeaModel.build(map, self);
    }

    public MuteUsersRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public MuteUsersRequest setRequestParams(MuteUsersRequestRequestParams requestParams) {
        this.requestParams = requestParams;
        return this;
    }
    public MuteUsersRequestRequestParams getRequestParams() {
        return this.requestParams;
    }

    public static class MuteUsersRequestRequestParams extends TeaModel {
        // 需要禁言的用户
        @NameInMap("AppUids")
        public java.util.List<String> appUids;

        // 单位秒
        @NameInMap("MuteDuration")
        public Long muteDuration;

        // true: 禁言, false: 解除禁言
        @NameInMap("Mute")
        public Boolean mute;

        public static MuteUsersRequestRequestParams build(java.util.Map<String, ?> map) throws Exception {
            MuteUsersRequestRequestParams self = new MuteUsersRequestRequestParams();
            return TeaModel.build(map, self);
        }

        public MuteUsersRequestRequestParams setAppUids(java.util.List<String> appUids) {
            this.appUids = appUids;
            return this;
        }
        public java.util.List<String> getAppUids() {
            return this.appUids;
        }

        public MuteUsersRequestRequestParams setMuteDuration(Long muteDuration) {
            this.muteDuration = muteDuration;
            return this;
        }
        public Long getMuteDuration() {
            return this.muteDuration;
        }

        public MuteUsersRequestRequestParams setMute(Boolean mute) {
            this.mute = mute;
            return this;
        }
        public Boolean getMute() {
            return this.mute;
        }

    }

}
