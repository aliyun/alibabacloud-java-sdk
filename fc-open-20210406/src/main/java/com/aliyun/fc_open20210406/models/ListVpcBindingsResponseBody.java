// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class ListVpcBindingsResponseBody extends TeaModel {
    @NameInMap("vpcIds")
    public java.util.List<String> vpcIds;

    public static ListVpcBindingsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListVpcBindingsResponseBody self = new ListVpcBindingsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListVpcBindingsResponseBody setVpcIds(java.util.List<String> vpcIds) {
        this.vpcIds = vpcIds;
        return this;
    }
    public java.util.List<String> getVpcIds() {
        return this.vpcIds;
    }

}
