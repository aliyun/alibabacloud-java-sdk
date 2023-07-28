// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnKvNamespaceRequest extends TeaModel {
    /**
     * <p>The name of the namespace.</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    public static DescribeDcdnKvNamespaceRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnKvNamespaceRequest self = new DescribeDcdnKvNamespaceRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnKvNamespaceRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

}
