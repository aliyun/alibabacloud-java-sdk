// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class PreviewSqlRequest extends TeaModel {
    @NameInMap("EtlCalculator")
    public String etlCalculator;

    @NameInMap("RegionId")
    public String regionId;

    public static PreviewSqlRequest build(java.util.Map<String, ?> map) throws Exception {
        PreviewSqlRequest self = new PreviewSqlRequest();
        return TeaModel.build(map, self);
    }

    public PreviewSqlRequest setEtlCalculator(String etlCalculator) {
        this.etlCalculator = etlCalculator;
        return this;
    }
    public String getEtlCalculator() {
        return this.etlCalculator;
    }

    public PreviewSqlRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
