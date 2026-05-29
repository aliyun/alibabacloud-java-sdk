// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class DeleteRoleResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("data")
    public String data;

    /**
     * <strong>example:</strong>
     * <p>0adb901117579891946416405d0409</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static DeleteRoleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteRoleResponseBody self = new DeleteRoleResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteRoleResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public DeleteRoleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
