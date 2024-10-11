// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbfs20200418.models;

import com.aliyun.tea.*;

public class DetachDbfsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>i-bp67acfmxazb4ph***</p>
     */
    @NameInMap("ECSInstanceId")
    public String ECSInstanceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>d-bp131n0q38u3a4zi*****</p>
     */
    @NameInMap("FsId")
    public String fsId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DetachDbfsRequest build(java.util.Map<String, ?> map) throws Exception {
        DetachDbfsRequest self = new DetachDbfsRequest();
        return TeaModel.build(map, self);
    }

    public DetachDbfsRequest setECSInstanceId(String ECSInstanceId) {
        this.ECSInstanceId = ECSInstanceId;
        return this;
    }
    public String getECSInstanceId() {
        return this.ECSInstanceId;
    }

    public DetachDbfsRequest setFsId(String fsId) {
        this.fsId = fsId;
        return this;
    }
    public String getFsId() {
        return this.fsId;
    }

    public DetachDbfsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
