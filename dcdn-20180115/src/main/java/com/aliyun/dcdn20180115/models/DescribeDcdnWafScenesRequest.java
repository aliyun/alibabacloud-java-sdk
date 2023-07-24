// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnWafScenesRequest extends TeaModel {
    /**
     * <p>The types of the protection policies that you want to query. Separate multiple types with commas (,). Valid values:</p>
     * <br>
     * <p>*   waf_group: basic web protection</p>
     * <p>*   custom_acl: custom protection</p>
     * <p>*   whitelist: IP address whitelist</p>
     * <p>*   ip_blacklist: IP address blacklist</p>
     * <p>*   region_block: region blacklist</p>
     * <p>*   bot: bot management</p>
     * <br>
     * <p>> If you do not set this parameter, all types of protection policies are queried.</p>
     */
    @NameInMap("DefenseScenes")
    public String defenseScenes;

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

}
