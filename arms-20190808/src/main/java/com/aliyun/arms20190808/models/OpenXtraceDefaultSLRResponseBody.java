// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class OpenXtraceDefaultSLRResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><code>true</code></li>
     * <li><code>false</code></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>53CACA70-2CF7-490C-BD06-1A2AE4EB****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static OpenXtraceDefaultSLRResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OpenXtraceDefaultSLRResponseBody self = new OpenXtraceDefaultSLRResponseBody();
        return TeaModel.build(map, self);
    }

    public OpenXtraceDefaultSLRResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public OpenXtraceDefaultSLRResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
