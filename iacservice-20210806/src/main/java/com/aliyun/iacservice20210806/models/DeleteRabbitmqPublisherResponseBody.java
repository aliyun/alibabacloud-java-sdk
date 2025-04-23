// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class DeleteRabbitmqPublisherResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>BF72A6FB-B071-5F2E-A036-9D62545B962C</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static DeleteRabbitmqPublisherResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteRabbitmqPublisherResponseBody self = new DeleteRabbitmqPublisherResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteRabbitmqPublisherResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
