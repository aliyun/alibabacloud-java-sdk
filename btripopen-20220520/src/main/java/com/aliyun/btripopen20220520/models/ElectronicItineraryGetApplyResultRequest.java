// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class ElectronicItineraryGetApplyResultRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("batch_apply_no")
    public String batchApplyNo;

    public static ElectronicItineraryGetApplyResultRequest build(java.util.Map<String, ?> map) throws Exception {
        ElectronicItineraryGetApplyResultRequest self = new ElectronicItineraryGetApplyResultRequest();
        return TeaModel.build(map, self);
    }

    public ElectronicItineraryGetApplyResultRequest setBatchApplyNo(String batchApplyNo) {
        this.batchApplyNo = batchApplyNo;
        return this;
    }
    public String getBatchApplyNo() {
        return this.batchApplyNo;
    }

}
