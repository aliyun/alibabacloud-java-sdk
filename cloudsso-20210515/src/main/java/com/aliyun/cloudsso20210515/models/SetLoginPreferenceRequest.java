// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class SetLoginPreferenceRequest extends TeaModel {
    @NameInMap("DirectoryId")
    public String directoryId;

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
