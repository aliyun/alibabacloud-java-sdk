// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class ListDataSourceTypesRequest extends TeaModel {
    @NameInMap("CloudCode")
    public String cloudCode;

    @NameInMap("RegionId")
    public String regionId;

    public static ListDataSourceTypesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDataSourceTypesRequest self = new ListDataSourceTypesRequest();
        return TeaModel.build(map, self);
    }

    public ListDataSourceTypesRequest setCloudCode(String cloudCode) {
        this.cloudCode = cloudCode;
        return this;
    }
    public String getCloudCode() {
        return this.cloudCode;
    }

    public ListDataSourceTypesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
