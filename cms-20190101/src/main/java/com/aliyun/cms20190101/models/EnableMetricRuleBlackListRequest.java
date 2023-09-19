// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class EnableMetricRuleBlackListRequest extends TeaModel {
    /**
     * <p>The IDs of the blacklist policies. Separate multiple IDs with commas (,). You can specify up to 50 IDs.</p>
     * <br>
     * <p>For information about how to obtain the ID of a blacklist policy, see [DescribeMetricRuleBlackList](~~457257~~).</p>
     * <br>
     * <p>> You can also set this parameter to a JSON array. Example: `["a9ad2ac2-3ed9-11ed-b878-0242ac12****","5cb8a9a4-198f-4651-a353-f8b28788****"]`.</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>Specifies whether to enable the blacklist policy. Valid values:</p>
     * <br>
     * <p>*   true: The blacklist policy is enabled.</p>
     * <p>*   false (default): The blacklist policy is disabled.</p>
     */
    @NameInMap("IsEnable")
    public Boolean isEnable;

    @NameInMap("RegionId")
    public String regionId;

    public static EnableMetricRuleBlackListRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableMetricRuleBlackListRequest self = new EnableMetricRuleBlackListRequest();
        return TeaModel.build(map, self);
    }

    public EnableMetricRuleBlackListRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public EnableMetricRuleBlackListRequest setIsEnable(Boolean isEnable) {
        this.isEnable = isEnable;
        return this;
    }
    public Boolean getIsEnable() {
        return this.isEnable;
    }

    public EnableMetricRuleBlackListRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
