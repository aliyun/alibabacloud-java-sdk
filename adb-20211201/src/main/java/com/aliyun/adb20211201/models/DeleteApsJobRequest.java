// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DeleteApsJobRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>aps-*****</p>
     */
    @NameInMap("ApsJobId")
    public String apsJobId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DeleteApsJobRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteApsJobRequest self = new DeleteApsJobRequest();
        return TeaModel.build(map, self);
    }

    public DeleteApsJobRequest setApsJobId(String apsJobId) {
        this.apsJobId = apsJobId;
        return this;
    }
    public String getApsJobId() {
        return this.apsJobId;
    }

    public DeleteApsJobRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
