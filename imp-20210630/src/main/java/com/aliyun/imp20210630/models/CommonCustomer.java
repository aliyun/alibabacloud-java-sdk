// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class CommonCustomer extends TeaModel {
    // 云帐号Id
    @NameInMap("CloudUid")
    public String cloudUid;

    public static CommonCustomer build(java.util.Map<String, ?> map) throws Exception {
        CommonCustomer self = new CommonCustomer();
        return TeaModel.build(map, self);
    }

    public CommonCustomer setCloudUid(String cloudUid) {
        this.cloudUid = cloudUid;
        return this;
    }
    public String getCloudUid() {
        return this.cloudUid;
    }

}
