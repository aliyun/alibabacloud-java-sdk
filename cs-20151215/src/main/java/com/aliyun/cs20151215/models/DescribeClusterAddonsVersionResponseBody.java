// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeClusterAddonsVersionResponseBody extends TeaModel {
    // 组件名称。
    @NameInMap("AddonsName")
    public java.util.Map<String, java.util.Map<String, ?>> addonsName;

    public static DescribeClusterAddonsVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterAddonsVersionResponseBody self = new DescribeClusterAddonsVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeClusterAddonsVersionResponseBody setAddonsName(java.util.Map<String, java.util.Map<String, ?>> addonsName) {
        this.addonsName = addonsName;
        return this;
    }
    public java.util.Map<String, java.util.Map<String, ?>> getAddonsName() {
        return this.addonsName;
    }

}
