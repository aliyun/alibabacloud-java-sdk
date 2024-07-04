// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class AttachDiskResponseBody extends TeaModel {
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
     * <p>916777D9-42D3-5928-92CE-373B1874B674</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AttachDiskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AttachDiskResponseBody self = new AttachDiskResponseBody();
        return TeaModel.build(map, self);
    }

    public AttachDiskResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public AttachDiskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
