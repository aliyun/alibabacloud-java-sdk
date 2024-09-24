// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_user20210308.models;

import com.aliyun.tea.*;

public class DeleteUserPropertyValueResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>D6C62E40-F937-5803-B008-92E813399BA5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteUserPropertyValueResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteUserPropertyValueResponseBody self = new DeleteUserPropertyValueResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteUserPropertyValueResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
