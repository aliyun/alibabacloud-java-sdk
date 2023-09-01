// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class ListVpcBindingsOutput extends TeaModel {
    @NameInMap("vpcIds")
    public java.util.List<String> vpcIds;

    public static ListVpcBindingsOutput build(java.util.Map<String, ?> map) throws Exception {
        ListVpcBindingsOutput self = new ListVpcBindingsOutput();
        return TeaModel.build(map, self);
    }

    public ListVpcBindingsOutput setVpcIds(java.util.List<String> vpcIds) {
        this.vpcIds = vpcIds;
        return this;
    }
    public java.util.List<String> getVpcIds() {
        return this.vpcIds;
    }

}
