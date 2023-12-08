// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alicloudproc20240104.models;

import com.aliyun.tea.*;

public class ExtendInfo extends TeaModel {
    @NameInMap("depositAmount")
    public Double depositAmount;

    @NameInMap("desc")
    public String desc;

    public static ExtendInfo build(java.util.Map<String, ?> map) throws Exception {
        ExtendInfo self = new ExtendInfo();
        return TeaModel.build(map, self);
    }

    public ExtendInfo setDepositAmount(Double depositAmount) {
        this.depositAmount = depositAmount;
        return this;
    }
    public Double getDepositAmount() {
        return this.depositAmount;
    }

    public ExtendInfo setDesc(String desc) {
        this.desc = desc;
        return this;
    }
    public String getDesc() {
        return this.desc;
    }

}
