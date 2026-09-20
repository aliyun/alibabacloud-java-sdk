// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class EvaluateMultiZoneResourceResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>FB703B69-D4D4-4879-B9FE-6A37F67C46FD</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether available resources exist. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Available resources exist.</li>
     * <li><strong>false</strong>: No available resources exist.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static EvaluateMultiZoneResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EvaluateMultiZoneResourceResponseBody self = new EvaluateMultiZoneResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public EvaluateMultiZoneResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public EvaluateMultiZoneResourceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
