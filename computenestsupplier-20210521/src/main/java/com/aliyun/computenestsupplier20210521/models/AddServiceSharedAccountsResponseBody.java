// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class AddServiceSharedAccountsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static AddServiceSharedAccountsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddServiceSharedAccountsResponseBody self = new AddServiceSharedAccountsResponseBody();
        return TeaModel.build(map, self);
    }

    public AddServiceSharedAccountsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
