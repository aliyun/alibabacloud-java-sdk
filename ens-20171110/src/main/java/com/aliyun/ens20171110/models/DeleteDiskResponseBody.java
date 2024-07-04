// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DeleteDiskResponseBody extends TeaModel {
    /**
     * <p>The returned service code. 0 indicates that the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>3ABEEB76-1976-55AB-B884-3D65CA6A4743</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteDiskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteDiskResponseBody self = new DeleteDiskResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteDiskResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DeleteDiskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
