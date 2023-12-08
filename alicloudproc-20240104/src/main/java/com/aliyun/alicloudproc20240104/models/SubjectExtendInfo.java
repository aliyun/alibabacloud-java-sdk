// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alicloudproc20240104.models;

import com.aliyun.tea.*;

public class SubjectExtendInfo extends TeaModel {
    @NameInMap("deliveryDesc")
    public String deliveryDesc;

    @NameInMap("desc")
    public String desc;

    public static SubjectExtendInfo build(java.util.Map<String, ?> map) throws Exception {
        SubjectExtendInfo self = new SubjectExtendInfo();
        return TeaModel.build(map, self);
    }

    public SubjectExtendInfo setDeliveryDesc(String deliveryDesc) {
        this.deliveryDesc = deliveryDesc;
        return this;
    }
    public String getDeliveryDesc() {
        return this.deliveryDesc;
    }

    public SubjectExtendInfo setDesc(String desc) {
        this.desc = desc;
        return this;
    }
    public String getDesc() {
        return this.desc;
    }

}
