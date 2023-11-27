// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class GetUserMuteSettingRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("RequestParams")
    public GetUserMuteSettingRequestRequestParams requestParams;

    public static GetUserMuteSettingRequest build(java.util.Map<String, ?> map) throws Exception {
        GetUserMuteSettingRequest self = new GetUserMuteSettingRequest();
        return TeaModel.build(map, self);
    }

    public GetUserMuteSettingRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public GetUserMuteSettingRequest setRequestParams(GetUserMuteSettingRequestRequestParams requestParams) {
        this.requestParams = requestParams;
        return this;
    }
    public GetUserMuteSettingRequestRequestParams getRequestParams() {
        return this.requestParams;
    }

    public static class GetUserMuteSettingRequestRequestParams extends TeaModel {
        @NameInMap("AppUids")
        public java.util.List<String> appUids;

        public static GetUserMuteSettingRequestRequestParams build(java.util.Map<String, ?> map) throws Exception {
            GetUserMuteSettingRequestRequestParams self = new GetUserMuteSettingRequestRequestParams();
            return TeaModel.build(map, self);
        }

        public GetUserMuteSettingRequestRequestParams setAppUids(java.util.List<String> appUids) {
            this.appUids = appUids;
            return this;
        }
        public java.util.List<String> getAppUids() {
            return this.appUids;
        }

    }

}
