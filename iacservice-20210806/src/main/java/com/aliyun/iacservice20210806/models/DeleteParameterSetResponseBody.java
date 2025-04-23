// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class DeleteParameterSetResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>708D670B-67C4-5653-9F88-8F7800429EE1</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static DeleteParameterSetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteParameterSetResponseBody self = new DeleteParameterSetResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteParameterSetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
