// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class UpdateImageLibFreeInspectionRequest extends TeaModel {
    /**
     * <p>Configuration.</p>
     */
    @NameInMap("Config")
    public java.util.Map<String, Integer> config;

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

    public static UpdateImageLibFreeInspectionRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateImageLibFreeInspectionRequest self = new UpdateImageLibFreeInspectionRequest();
        return TeaModel.build(map, self);
    }

    public UpdateImageLibFreeInspectionRequest setConfig(java.util.Map<String, Integer> config) {
        this.config = config;
        return this;
    }
    public java.util.Map<String, Integer> getConfig() {
        return this.config;
    }

    public UpdateImageLibFreeInspectionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateImageLibFreeInspectionRequest setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }
    public String getServiceCode() {
        return this.serviceCode;
    }

}
