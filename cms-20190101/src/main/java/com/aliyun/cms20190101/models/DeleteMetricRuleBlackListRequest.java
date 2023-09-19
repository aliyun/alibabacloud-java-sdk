// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DeleteMetricRuleBlackListRequest extends TeaModel {
    /**
     * <p>The IDs of the blacklist policies. Separate multiple IDs with commas (,). You can specify up to 50 IDs.</p>
     * <br>
     * <p>For more information about how to obtain the ID of a blacklist policy, see [DescribeMetricRuleBlackList](~~457257~~).</p>
     * <br>
     * <p>>  You can also set this parameter to a JSON array. Example: `["a9ad2ac2-3ed9-11ed-b878-0242ac12****","5cb8a9a4-198f-4651-a353-f8b28788****"]`.</p>
     */
    @NameInMap("Id")
    public String id;

    @NameInMap("RegionId")
    public String regionId;

    public static DeleteMetricRuleBlackListRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteMetricRuleBlackListRequest self = new DeleteMetricRuleBlackListRequest();
        return TeaModel.build(map, self);
    }

    public DeleteMetricRuleBlackListRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public DeleteMetricRuleBlackListRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
