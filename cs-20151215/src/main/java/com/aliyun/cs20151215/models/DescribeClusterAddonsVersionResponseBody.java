// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeClusterAddonsVersionResponseBody extends TeaModel {
    // 组件信息详情。
    @NameInMap("AddonsVersion")
    public java.util.Map<String, AddonsVersionValue> addonsVersion;

    public static DescribeClusterAddonsVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterAddonsVersionResponseBody self = new DescribeClusterAddonsVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeClusterAddonsVersionResponseBody setAddonsVersion(java.util.Map<String, AddonsVersionValue> addonsVersion) {
        this.addonsVersion = addonsVersion;
        return this;
    }
    public java.util.Map<String, AddonsVersionValue> getAddonsVersion() {
        return this.addonsVersion;
    }

}
