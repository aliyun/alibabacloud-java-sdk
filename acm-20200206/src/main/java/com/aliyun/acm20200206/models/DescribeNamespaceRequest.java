// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.acm20200206.models;

import com.aliyun.tea.*;

public class DescribeNamespaceRequest extends TeaModel {
    @NameInMap("NamespaceId")
    public String namespaceId;

    public static DescribeNamespaceRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeNamespaceRequest self = new DescribeNamespaceRequest();
        return TeaModel.build(map, self);
    }

    public DescribeNamespaceRequest setNamespaceId(String namespaceId) {
        this.namespaceId = namespaceId;
        return this;
    }
    public String getNamespaceId() {
        return this.namespaceId;
    }

}
