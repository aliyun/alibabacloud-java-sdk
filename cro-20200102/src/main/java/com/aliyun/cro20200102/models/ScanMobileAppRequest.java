// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cro20200102.models;

import com.aliyun.tea.*;

public class ScanMobileAppRequest extends TeaModel {
    @NameInMap("Data")
    public java.util.Map<String, ?> data;

    public static ScanMobileAppRequest build(java.util.Map<String, ?> map) throws Exception {
        ScanMobileAppRequest self = new ScanMobileAppRequest();
        return TeaModel.build(map, self);
    }

    public ScanMobileAppRequest setData(java.util.Map<String, ?> data) {
        this.data = data;
        return this;
    }
    public java.util.Map<String, ?> getData() {
        return this.data;
    }

}
