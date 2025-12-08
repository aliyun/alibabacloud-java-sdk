// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class CreateFaceDbResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>818D24A6-E368-46B3-99C5-3CF36D98CCA3</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateFaceDbResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateFaceDbResponseBody self = new CreateFaceDbResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateFaceDbResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
