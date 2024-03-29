// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class GetLoginPreferenceResponseBody extends TeaModel {
    /**
     * <p>The logon preference.</p>
     */
    @NameInMap("LoginPreference")
    public GetLoginPreferenceResponseBodyLoginPreference loginPreference;

    /**
     * <p>The request ID.</p>
     */
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
        /**
         * <p>The IP address whitelist. CloudSSO users can log on to the CloudSSO user portal only by using the IP addresses in the whitelist.</p>
         * <br>
         * <p>The IP address whitelist takes effect only on CloudSSO users who want to log on to the CloudSSO user portal by using the username-password logon or single sign-on (SSO) method. The IP address whitelist does not take effect on CloudSSO users who access accounts in a resource directory from the CloudSSO user portal.</p>
         * <br>
         * <p>If the return value of this parameter is empty, no IP address whitelists are configured.</p>
         */
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
