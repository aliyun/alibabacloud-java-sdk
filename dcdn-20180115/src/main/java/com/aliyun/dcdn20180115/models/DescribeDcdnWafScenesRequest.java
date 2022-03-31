// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnWafScenesRequest extends TeaModel {
    @NameInMap("DefenseScenes")
    public String defenseScenes;

    @NameInMap("OwnerId")
    public Long ownerId;

    public static DescribeDcdnWafScenesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnWafScenesRequest self = new DescribeDcdnWafScenesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnWafScenesRequest setDefenseScenes(String defenseScenes) {
        this.defenseScenes = defenseScenes;
        return this;
    }
    public String getDefenseScenes() {
        return this.defenseScenes;
    }

    public DescribeDcdnWafScenesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

}
