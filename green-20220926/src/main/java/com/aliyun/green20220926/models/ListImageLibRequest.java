// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class ListImageLibRequest extends TeaModel {
    /**
     * <p>Region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ServiceCode")
    public String serviceCode;

    public static ListImageLibRequest build(java.util.Map<String, ?> map) throws Exception {
        ListImageLibRequest self = new ListImageLibRequest();
        return TeaModel.build(map, self);
    }

    public ListImageLibRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListImageLibRequest setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }
    public String getServiceCode() {
        return this.serviceCode;
    }

}
