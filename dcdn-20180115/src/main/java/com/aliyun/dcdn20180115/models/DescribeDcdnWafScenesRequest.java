// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnWafScenesRequest extends TeaModel {
    /**
     * <p>The types of the protection policies that you want to query. Separate multiple types with commas (,). Valid values:</p>
     * <ul>
     * <li>waf_group: basic web protection</li>
     * <li>custom_acl: custom protection</li>
     * <li>whitelist: IP address whitelist</li>
     * <li>ip_blacklist: IP address blacklist</li>
     * <li>region_block: region blacklist</li>
     * <li>bot: bot management</li>
     * </ul>
     * <blockquote>
     * <p>If you do not set this parameter, all types of protection policies are queried.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>waf_group,custom_acl,whitelist</p>
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
