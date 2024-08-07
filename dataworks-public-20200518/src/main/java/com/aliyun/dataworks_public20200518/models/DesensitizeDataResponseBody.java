// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DesensitizeDataResponseBody extends TeaModel {
    /**
     * <p>The data returned after masking.</p>
     * 
     * <strong>example:</strong>
     * <p>{     &quot;desensData&quot;: &quot;<strong>198807120510</strong>&quot;   }</p>
     */
    @NameInMap("DesensitizeData")
    public String desensitizeData;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>BCA321BA-46C5-40E9-8A08-6******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DesensitizeDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DesensitizeDataResponseBody self = new DesensitizeDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DesensitizeDataResponseBody setDesensitizeData(String desensitizeData) {
        this.desensitizeData = desensitizeData;
        return this;
    }
    public String getDesensitizeData() {
        return this.desensitizeData;
    }

    public DesensitizeDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
