// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class ListProductAbilitiesResponseBody extends TeaModel {
    /**
     * <p>Products supported by the edge node.</p>
     */
    @NameInMap("ProductAbilities")
    public java.util.List<String> productAbilities;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxxx-75ED-422E-A022-7121FA18C968</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListProductAbilitiesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListProductAbilitiesResponseBody self = new ListProductAbilitiesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListProductAbilitiesResponseBody setProductAbilities(java.util.List<String> productAbilities) {
        this.productAbilities = productAbilities;
        return this;
    }
    public java.util.List<String> getProductAbilities() {
        return this.productAbilities;
    }

    public ListProductAbilitiesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
