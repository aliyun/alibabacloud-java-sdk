// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DeleteMetricRulesRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ab05733c97b7ce239fb1b53393dc1697c7e12****</p>
     */
    @NameInMap("Id")
    public java.util.List<String> id;

    @NameInMap("RegionId")
    public String regionId;

    public static DeleteMetricRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteMetricRulesRequest self = new DeleteMetricRulesRequest();
        return TeaModel.build(map, self);
    }

    public DeleteMetricRulesRequest setId(java.util.List<String> id) {
        this.id = id;
        return this;
    }
    public java.util.List<String> getId() {
        return this.id;
    }

    public DeleteMetricRulesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
