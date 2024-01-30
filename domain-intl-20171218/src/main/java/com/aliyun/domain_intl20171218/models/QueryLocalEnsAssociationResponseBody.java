// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain_intl20171218.models;

import com.aliyun.tea.*;

public class QueryLocalEnsAssociationResponseBody extends TeaModel {
    @NameInMap("Address")
    public String address;

    @NameInMap("RequestId")
    public String requestId;

    public static QueryLocalEnsAssociationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryLocalEnsAssociationResponseBody self = new QueryLocalEnsAssociationResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryLocalEnsAssociationResponseBody setAddress(String address) {
        this.address = address;
        return this;
    }
    public String getAddress() {
        return this.address;
    }

    public QueryLocalEnsAssociationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
