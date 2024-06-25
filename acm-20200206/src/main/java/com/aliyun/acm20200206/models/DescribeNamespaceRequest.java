// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.acm20200206.models;

import com.aliyun.tea.*;

public class DescribeNamespaceRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3115d2bf-1f44-47bf-a855-****</p>
     */
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
