// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UpdateFalconSeekRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable the FalconSeek cloud-native kernel feature. Valid values:</p>
     * <ul>
     * <li>true: Enable the feature.</li>
     * <li>false: Disable the feature.</li>
     * </ul>
     * <p>This parameter is required.</p>
     */
    @NameInMap("enable")
    public Boolean enable;

    public static UpdateFalconSeekRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateFalconSeekRequest self = new UpdateFalconSeekRequest();
        return TeaModel.build(map, self);
    }

    public UpdateFalconSeekRequest setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
    public Boolean getEnable() {
        return this.enable;
    }

}
