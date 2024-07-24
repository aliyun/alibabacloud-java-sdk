// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.es_serverless20230627.models;

import com.aliyun.tea.*;

public class UpdateSnapshotSettingRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("enable")
    public Boolean enable;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0 0 01 ? * * *</p>
     */
    @NameInMap("quartzRegex")
    public String quartzRegex;

    public static UpdateSnapshotSettingRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSnapshotSettingRequest self = new UpdateSnapshotSettingRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSnapshotSettingRequest setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
    public Boolean getEnable() {
        return this.enable;
    }

    public UpdateSnapshotSettingRequest setQuartzRegex(String quartzRegex) {
        this.quartzRegex = quartzRegex;
        return this;
    }
    public String getQuartzRegex() {
        return this.quartzRegex;
    }

}
