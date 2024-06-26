// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeMemberRoleRequest extends TeaModel {
    @NameInMap("Bizid")
    public String bizid;

    public static DescribeMemberRoleRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeMemberRoleRequest self = new DescribeMemberRoleRequest();
        return TeaModel.build(map, self);
    }

    public DescribeMemberRoleRequest setBizid(String bizid) {
        this.bizid = bizid;
        return this;
    }
    public String getBizid() {
        return this.bizid;
    }

}
