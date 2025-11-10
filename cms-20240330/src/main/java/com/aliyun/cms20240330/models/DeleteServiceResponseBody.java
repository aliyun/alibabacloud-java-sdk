// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class DeleteServiceResponseBody extends TeaModel {
    /**
     * <p>Request ID</p>
     * 
     * <strong>example:</strong>
     * <p>51B6A3E8-EA9E-5143-BE11-8E5F83474C95</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static DeleteServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteServiceResponseBody self = new DeleteServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
