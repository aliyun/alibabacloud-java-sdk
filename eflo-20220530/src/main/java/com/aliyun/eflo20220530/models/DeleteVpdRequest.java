// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class DeleteVpdRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("VpdId")
    public String vpdId;

    public static DeleteVpdRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteVpdRequest self = new DeleteVpdRequest();
        return TeaModel.build(map, self);
    }

    public DeleteVpdRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteVpdRequest setVpdId(String vpdId) {
        this.vpdId = vpdId;
        return this;
    }
    public String getVpdId() {
        return this.vpdId;
    }

}
