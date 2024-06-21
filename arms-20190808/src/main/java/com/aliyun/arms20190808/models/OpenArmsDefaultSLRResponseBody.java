// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class OpenArmsDefaultSLRResponseBody extends TeaModel {
    /**
     * <p>The returned result.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>53CACA70-2CF7-490C-BD06-1A2AE4EB****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static OpenArmsDefaultSLRResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OpenArmsDefaultSLRResponseBody self = new OpenArmsDefaultSLRResponseBody();
        return TeaModel.build(map, self);
    }

    public OpenArmsDefaultSLRResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public OpenArmsDefaultSLRResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
