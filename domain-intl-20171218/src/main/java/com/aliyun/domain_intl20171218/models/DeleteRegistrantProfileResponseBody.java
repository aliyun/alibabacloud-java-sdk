// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain_intl20171218.models;

import com.aliyun.tea.*;

public class DeleteRegistrantProfileResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteRegistrantProfileResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteRegistrantProfileResponseBody self = new DeleteRegistrantProfileResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteRegistrantProfileResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
