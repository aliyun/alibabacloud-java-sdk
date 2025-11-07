// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class ModifyBlackListStrategyShrinkRequest extends TeaModel {
    /**
     * <p>Blacklist rule.</p>
     */
    @NameInMap("BlackListStrategy")
    public String blackListStrategyShrink;

    /**
     * <p>Region ID</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static ModifyBlackListStrategyShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyBlackListStrategyShrinkRequest self = new ModifyBlackListStrategyShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ModifyBlackListStrategyShrinkRequest setBlackListStrategyShrink(String blackListStrategyShrink) {
        this.blackListStrategyShrink = blackListStrategyShrink;
        return this;
    }
    public String getBlackListStrategyShrink() {
        return this.blackListStrategyShrink;
    }

    public ModifyBlackListStrategyShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
