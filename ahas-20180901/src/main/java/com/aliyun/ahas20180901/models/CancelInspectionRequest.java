// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class CancelInspectionRequest extends TeaModel {
    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    @NameInMap("InspectResultId")
    public Long inspectResultId;

    public static CancelInspectionRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelInspectionRequest self = new CancelInspectionRequest();
        return TeaModel.build(map, self);
    }

    public CancelInspectionRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

    public CancelInspectionRequest setInspectResultId(Long inspectResultId) {
        this.inspectResultId = inspectResultId;
        return this;
    }
    public Long getInspectResultId() {
        return this.inspectResultId;
    }

}
