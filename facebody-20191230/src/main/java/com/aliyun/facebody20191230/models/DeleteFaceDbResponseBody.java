// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class DeleteFaceDbResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>203AE658-CFE1-507D-B105-F88CD1F1F71B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteFaceDbResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteFaceDbResponseBody self = new DeleteFaceDbResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteFaceDbResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
