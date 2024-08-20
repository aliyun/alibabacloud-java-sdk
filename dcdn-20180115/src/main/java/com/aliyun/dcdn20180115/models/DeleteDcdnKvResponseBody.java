// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DeleteDcdnKvResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>D61E4801-EAFF-4A63-AAE1-FBF6CE1CFD1C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteDcdnKvResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteDcdnKvResponseBody self = new DeleteDcdnKvResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteDcdnKvResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
