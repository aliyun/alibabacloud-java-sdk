// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ScanSensitiveDataRequest extends TeaModel {
    @NameInMap("Data")
    @Validation(required = true)
    public String data;

    public static ScanSensitiveDataRequest build(java.util.Map<String, ?> map) throws Exception {
        ScanSensitiveDataRequest self = new ScanSensitiveDataRequest();
        return TeaModel.build(map, self);
    }

    public ScanSensitiveDataRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

}
