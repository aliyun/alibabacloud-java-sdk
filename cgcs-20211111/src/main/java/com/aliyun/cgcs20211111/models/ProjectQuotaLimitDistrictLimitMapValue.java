// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class ProjectQuotaLimitDistrictLimitMapValue extends TeaModel {
    // 大区ID
    @NameInMap("DistrictId")
    public String districtId;

    // 大区名称
    @NameInMap("DistrictName")
    public String districtName;

    // 上限
    @NameInMap("MaxLimit")
    public Long maxLimit;

    public static ProjectQuotaLimitDistrictLimitMapValue build(java.util.Map<String, ?> map) throws Exception {
        ProjectQuotaLimitDistrictLimitMapValue self = new ProjectQuotaLimitDistrictLimitMapValue();
        return TeaModel.build(map, self);
    }

    public ProjectQuotaLimitDistrictLimitMapValue setDistrictId(String districtId) {
        this.districtId = districtId;
        return this;
    }
    public String getDistrictId() {
        return this.districtId;
    }

    public ProjectQuotaLimitDistrictLimitMapValue setDistrictName(String districtName) {
        this.districtName = districtName;
        return this;
    }
    public String getDistrictName() {
        return this.districtName;
    }

    public ProjectQuotaLimitDistrictLimitMapValue setMaxLimit(Long maxLimit) {
        this.maxLimit = maxLimit;
        return this;
    }
    public Long getMaxLimit() {
        return this.maxLimit;
    }

}
