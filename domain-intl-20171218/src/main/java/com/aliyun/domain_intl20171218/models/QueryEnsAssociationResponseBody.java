// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain_intl20171218.models;

import com.aliyun.tea.*;

public class QueryEnsAssociationResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0x0000000000000000000000000000000000000003</p>
     */
    @NameInMap("Address")
    public String address;

    /**
     * <strong>example:</strong>
     * <p>AF7D4DCE-0776-47F2-A9B2-6FB85A87AA60</p>
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
