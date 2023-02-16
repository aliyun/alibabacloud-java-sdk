// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class ApplyAdviceByIdRequest extends TeaModel {
    @NameInMap("AdviceDate")
    public Long adviceDate;

    @NameInMap("AdviceId")
    public String adviceId;

    @NameInMap("DBClusterId")
    public String DBClusterId;

    @NameInMap("RegionId")
    public String regionId;

    public static ApplyAdviceByIdRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyAdviceByIdRequest self = new ApplyAdviceByIdRequest();
        return TeaModel.build(map, self);
    }

    public ApplyAdviceByIdRequest setAdviceDate(Long adviceDate) {
        this.adviceDate = adviceDate;
        return this;
    }
    public Long getAdviceDate() {
        return this.adviceDate;
    }

    public ApplyAdviceByIdRequest setAdviceId(String adviceId) {
        this.adviceId = adviceId;
        return this;
    }
    public String getAdviceId() {
        return this.adviceId;
    }

    public ApplyAdviceByIdRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public ApplyAdviceByIdRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
