// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class ListAccountAccessIdRequest extends TeaModel {
    @NameInMap("CloudCode")
    public String cloudCode;

    @NameInMap("RegionId")
    public String regionId;

    public static ListAccountAccessIdRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAccountAccessIdRequest self = new ListAccountAccessIdRequest();
        return TeaModel.build(map, self);
    }

    public ListAccountAccessIdRequest setCloudCode(String cloudCode) {
        this.cloudCode = cloudCode;
        return this;
    }
    public String getCloudCode() {
        return this.cloudCode;
    }

    public ListAccountAccessIdRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
