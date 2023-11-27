// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class GetLoginTokenRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("RequestParams")
    public GetLoginTokenRequestRequestParams requestParams;

    public static GetLoginTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLoginTokenRequest self = new GetLoginTokenRequest();
        return TeaModel.build(map, self);
    }

    public GetLoginTokenRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public GetLoginTokenRequest setRequestParams(GetLoginTokenRequestRequestParams requestParams) {
        this.requestParams = requestParams;
        return this;
    }
    public GetLoginTokenRequestRequestParams getRequestParams() {
        return this.requestParams;
    }

    public static class GetLoginTokenRequestRequestParams extends TeaModel {
        @NameInMap("AppKey")
        public String appKey;

        @NameInMap("AppUid")
        public String appUid;

        @NameInMap("DeviceId")
        public String deviceId;

        public static GetLoginTokenRequestRequestParams build(java.util.Map<String, ?> map) throws Exception {
            GetLoginTokenRequestRequestParams self = new GetLoginTokenRequestRequestParams();
            return TeaModel.build(map, self);
        }

        public GetLoginTokenRequestRequestParams setAppKey(String appKey) {
            this.appKey = appKey;
            return this;
        }
        public String getAppKey() {
            return this.appKey;
        }

        public GetLoginTokenRequestRequestParams setAppUid(String appUid) {
            this.appUid = appUid;
            return this;
        }
        public String getAppUid() {
            return this.appUid;
        }

        public GetLoginTokenRequestRequestParams setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

    }

}
