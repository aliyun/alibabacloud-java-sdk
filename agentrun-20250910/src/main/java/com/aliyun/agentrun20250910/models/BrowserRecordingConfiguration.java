// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class BrowserRecordingConfiguration extends TeaModel {
    @NameInMap("enabled")
    public Boolean enabled;

    @NameInMap("ossLocation")
    public BrowserOssLocation ossLocation;

    public static BrowserRecordingConfiguration build(java.util.Map<String, ?> map) throws Exception {
        BrowserRecordingConfiguration self = new BrowserRecordingConfiguration();
        return TeaModel.build(map, self);
    }

    public BrowserRecordingConfiguration setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

    public BrowserRecordingConfiguration setOssLocation(BrowserOssLocation ossLocation) {
        this.ossLocation = ossLocation;
        return this;
    }
    public BrowserOssLocation getOssLocation() {
        return this.ossLocation;
    }

}
