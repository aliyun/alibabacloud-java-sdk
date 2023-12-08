// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnWafFilterInfoRequest extends TeaModel {
    /**
     * <p>The type of the protection policy. Separate multiple types with commas (,). Valid values:</p>
     * <br>
     * <p>*   waf_group: basic web protection</p>
     * <p>*   custom_acl: custom protection</p>
     * <p>*   whitelist: IP address whitelist</p>
     * <br>
     * <p>>If you do not specify this parameter, all types are returned.</p>
     */
    @NameInMap("DefenseScenes")
    public String defenseScenes;

    /**
     * <p>The language of the returned information. Valid values:</p>
     * <br>
     * <p>*   en: English</p>
     * <p>*   cn: Simplified Chinese</p>
     */
    @NameInMap("Language")
    public String language;

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

}
