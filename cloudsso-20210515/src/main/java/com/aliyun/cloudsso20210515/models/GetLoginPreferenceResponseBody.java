// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class GetLoginPreferenceResponseBody extends TeaModel {
    @NameInMap("LoginPreference")
    public GetLoginPreferenceResponseBodyLoginPreference loginPreference;

    @NameInMap("RequestId")
    public String requestId;

    public static GetLoginPreferenceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLoginPreferenceResponseBody self = new GetLoginPreferenceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLoginPreferenceResponseBody setLoginPreference(GetLoginPreferenceResponseBodyLoginPreference loginPreference) {
        this.loginPreference = loginPreference;
        return this;
    }
    public GetLoginPreferenceResponseBodyLoginPreference getLoginPreference() {
        return this.loginPreference;
    }

    public GetLoginPreferenceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetLoginPreferenceResponseBodyLoginPreference extends TeaModel {
        @NameInMap("LoginNetworkMasks")
        public String loginNetworkMasks;

        public static GetLoginPreferenceResponseBodyLoginPreference build(java.util.Map<String, ?> map) throws Exception {
            GetLoginPreferenceResponseBodyLoginPreference self = new GetLoginPreferenceResponseBodyLoginPreference();
            return TeaModel.build(map, self);
        }

        public GetLoginPreferenceResponseBodyLoginPreference setLoginNetworkMasks(String loginNetworkMasks) {
            this.loginNetworkMasks = loginNetworkMasks;
            return this;
        }
        public String getLoginNetworkMasks() {
            return this.loginNetworkMasks;
        }

    }

}
