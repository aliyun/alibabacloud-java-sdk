// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class QueryEnsAssociationResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0x123456789012345678901234567890123456****</p>
     */
    @NameInMap("Address")
    public String address;

    /**
     * <strong>example:</strong>
     * <p>3ECD5439-39A2-477D-9A19-64FCA1F77EEB</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static QueryEnsAssociationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryEnsAssociationResponseBody self = new QueryEnsAssociationResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryEnsAssociationResponseBody setAddress(String address) {
        this.address = address;
        return this;
    }
    public String getAddress() {
        return this.address;
    }

    public QueryEnsAssociationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
