// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cro20200102.models;

import com.aliyun.tea.*;

public class ScanMobileAppShrinkRequest extends TeaModel {
    @NameInMap("Data")
    public String dataShrink;

    public static ScanMobileAppShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ScanMobileAppShrinkRequest self = new ScanMobileAppShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ScanMobileAppShrinkRequest setDataShrink(String dataShrink) {
        this.dataShrink = dataShrink;
        return this;
    }
    public String getDataShrink() {
        return this.dataShrink;
    }

}
