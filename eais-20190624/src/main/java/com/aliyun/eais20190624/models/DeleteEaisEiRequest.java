// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eais20190624.models;

import com.aliyun.tea.*;

public class DeleteEaisEiRequest extends TeaModel {
    @NameInMap("EiInstanceId")
    public String eiInstanceId;

    @NameInMap("Force")
    public Boolean force;

    @NameInMap("RegionId")
    public String regionId;

    public static DeleteEaisEiRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteEaisEiRequest self = new DeleteEaisEiRequest();
        return TeaModel.build(map, self);
    }

    public DeleteEaisEiRequest setEiInstanceId(String eiInstanceId) {
        this.eiInstanceId = eiInstanceId;
        return this;
    }
    public String getEiInstanceId() {
        return this.eiInstanceId;
    }

    public DeleteEaisEiRequest setForce(Boolean force) {
        this.force = force;
        return this;
    }
    public Boolean getForce() {
        return this.force;
    }

    public DeleteEaisEiRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
