// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20180308.models;

import com.aliyun.tea.*;

public class QueryTaskConfigRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    public static QueryTaskConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryTaskConfigRequest self = new QueryTaskConfigRequest();
        return TeaModel.build(map, self);
    }

    public QueryTaskConfigRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
