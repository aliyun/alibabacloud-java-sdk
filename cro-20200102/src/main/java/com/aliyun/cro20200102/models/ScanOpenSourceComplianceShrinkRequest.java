// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cro20200102.models;

import com.aliyun.tea.*;

public class ScanOpenSourceComplianceShrinkRequest extends TeaModel {
    @NameInMap("Data")
    public String dataShrink;

    public static ScanOpenSourceComplianceShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ScanOpenSourceComplianceShrinkRequest self = new ScanOpenSourceComplianceShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ScanOpenSourceComplianceShrinkRequest setDataShrink(String dataShrink) {
        this.dataShrink = dataShrink;
        return this;
    }
    public String getDataShrink() {
        return this.dataShrink;
    }

}
