// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class DeleteErRequest extends TeaModel {
    @NameInMap("ErId")
    public String erId;

    @NameInMap("RegionId")
    public String regionId;

    public static DeleteErRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteErRequest self = new DeleteErRequest();
        return TeaModel.build(map, self);
    }

    public DeleteErRequest setErId(String erId) {
        this.erId = erId;
        return this;
    }
    public String getErId() {
        return this.erId;
    }

    public DeleteErRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
