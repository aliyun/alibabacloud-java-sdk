// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class SetLoginPreferenceRequest extends TeaModel {
    /**
     * <p>The ID of the directory.</p>
     */
    @NameInMap("DirectoryId")
    public String directoryId;

    /**
     * <p>The IP address whitelist. CloudSSO users can log on to the CloudSSO user portal only by using the IP addresses in the whitelist. Limits:</p>
     * <br>
     * <p>*   You can enter IP addresses or CIDR blocks. IPv4 addresses are supported.</p>
     * <p>*   You can enter up to 100 IP addresses or CIDR blocks. Separate multiple IP addresses or CIDR blocks with semicolons `(;)`.</p>
     * <p>*   If you do not specify this parameter, the original settings are retained.</p>
     * <p>*   If you set this parameter to a semicolon (`;`), the value of this parameter is cleared.</p>
     * <p>*   The IP address whitelist takes effect only on CloudSSO users who want to log on to the CloudSSO user portal by using the username-password logon or single sign-on (SSO) method. The IP address whitelist does not take effect on CloudSSO users who access accounts in a resource directory from the CloudSSO user portal.</p>
     */
    @NameInMap("LoginNetworkMasks")
    public String loginNetworkMasks;

    public static SetLoginPreferenceRequest build(java.util.Map<String, ?> map) throws Exception {
        SetLoginPreferenceRequest self = new SetLoginPreferenceRequest();
        return TeaModel.build(map, self);
    }

    public SetLoginPreferenceRequest setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

    public SetLoginPreferenceRequest setLoginNetworkMasks(String loginNetworkMasks) {
        this.loginNetworkMasks = loginNetworkMasks;
        return this;
    }
    public String getLoginNetworkMasks() {
        return this.loginNetworkMasks;
    }

}
