// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class RecordingConfiguration extends TeaModel {
    /**
     * <p>是否启用录制</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("enabled")
    public Boolean enabled;

    @NameInMap("ossLocation")
    public OssConfiguration ossLocation;

    public static RecordingConfiguration build(java.util.Map<String, ?> map) throws Exception {
        RecordingConfiguration self = new RecordingConfiguration();
        return TeaModel.build(map, self);
    }

    public RecordingConfiguration setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

    public RecordingConfiguration setOssLocation(OssConfiguration ossLocation) {
        this.ossLocation = ossLocation;
        return this;
    }
    public OssConfiguration getOssLocation() {
        return this.ossLocation;
    }

}
