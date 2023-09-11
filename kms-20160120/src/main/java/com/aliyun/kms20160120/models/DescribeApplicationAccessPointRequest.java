// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class DescribeApplicationAccessPointRequest extends TeaModel {
    @NameInMap("Name")
    public String name;

    public static DescribeApplicationAccessPointRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeApplicationAccessPointRequest self = new DescribeApplicationAccessPointRequest();
        return TeaModel.build(map, self);
    }

    public DescribeApplicationAccessPointRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
