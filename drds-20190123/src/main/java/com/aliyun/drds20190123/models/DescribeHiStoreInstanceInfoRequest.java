// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeHiStoreInstanceInfoRequest extends TeaModel {
    @NameInMap("DrdsInstanceId")
    public String drdsInstanceId;

    @NameInMap("HistoreInstanceId")
    public String historeInstanceId;

    public static DescribeHiStoreInstanceInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeHiStoreInstanceInfoRequest self = new DescribeHiStoreInstanceInfoRequest();
        return TeaModel.build(map, self);
    }

    public DescribeHiStoreInstanceInfoRequest setDrdsInstanceId(String drdsInstanceId) {
        this.drdsInstanceId = drdsInstanceId;
        return this;
    }
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

    public DescribeHiStoreInstanceInfoRequest setHistoreInstanceId(String historeInstanceId) {
        this.historeInstanceId = historeInstanceId;
        return this;
    }
    public String getHistoreInstanceId() {
        return this.historeInstanceId;
    }

}
