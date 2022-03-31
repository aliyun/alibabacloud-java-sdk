// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnWafFilterInfoRequest extends TeaModel {
    @NameInMap("DefenseScenes")
    public String defenseScenes;

    @NameInMap("Language")
    public String language;

    @NameInMap("OwnerId")
    public Long ownerId;

    public static DescribeDcdnWafFilterInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnWafFilterInfoRequest self = new DescribeDcdnWafFilterInfoRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnWafFilterInfoRequest setDefenseScenes(String defenseScenes) {
        this.defenseScenes = defenseScenes;
        return this;
    }
    public String getDefenseScenes() {
        return this.defenseScenes;
    }

    public DescribeDcdnWafFilterInfoRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public DescribeDcdnWafFilterInfoRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

}
