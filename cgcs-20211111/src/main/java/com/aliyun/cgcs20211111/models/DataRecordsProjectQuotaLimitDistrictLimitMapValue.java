// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class DataRecordsProjectQuotaLimitDistrictLimitMapValue extends TeaModel {
    // 大区ID
    @NameInMap("DistrictId")
    public String districtId;

    // 大区名称
    @NameInMap("DistrictName")
    public String districtName;

    // 上限
    @NameInMap("MaxLimit")
    public Long maxLimit;

    public static DataRecordsProjectQuotaLimitDistrictLimitMapValue build(java.util.Map<String, ?> map) throws Exception {
        DataRecordsProjectQuotaLimitDistrictLimitMapValue self = new DataRecordsProjectQuotaLimitDistrictLimitMapValue();
        return TeaModel.build(map, self);
    }

    public DataRecordsProjectQuotaLimitDistrictLimitMapValue setDistrictId(String districtId) {
        this.districtId = districtId;
        return this;
    }
    public String getDistrictId() {
        return this.districtId;
    }

    public DataRecordsProjectQuotaLimitDistrictLimitMapValue setDistrictName(String districtName) {
        this.districtName = districtName;
        return this;
    }
    public String getDistrictName() {
        return this.districtName;
    }

    public DataRecordsProjectQuotaLimitDistrictLimitMapValue setMaxLimit(Long maxLimit) {
        this.maxLimit = maxLimit;
        return this;
    }
    public Long getMaxLimit() {
        return this.maxLimit;
    }

}
