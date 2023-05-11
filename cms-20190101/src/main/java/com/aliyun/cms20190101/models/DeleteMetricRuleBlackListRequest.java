// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DeleteMetricRuleBlackListRequest extends TeaModel {
    /**
     * <p>The ID of the request.</p>
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
