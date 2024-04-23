// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeClusterAddonMetadataRequest extends TeaModel {
    @NameInMap("version")
    public String version;

    public static DescribeClusterAddonMetadataRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterAddonMetadataRequest self = new DescribeClusterAddonMetadataRequest();
        return TeaModel.build(map, self);
    }

    public DescribeClusterAddonMetadataRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

}
