// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class UpdateScanRuleResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Code")
    public Long code;

    /**
     * <p>Request Id</p>
     * 
     * <strong>example:</strong>
     * <p>33EF1695-E2B7-5D57-B4E1-3D655FE1EBD8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The rule ID.</p>
     * 
     * <strong>example:</strong>
     * <p>crscnr-3qmkeiuggfpjkfrq</p>
     */
    @NameInMap("ScanRuleId")
    public String scanRuleId;

    public static UpdateScanRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateScanRuleResponseBody self = new UpdateScanRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateScanRuleResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public UpdateScanRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateScanRuleResponseBody setScanRuleId(String scanRuleId) {
        this.scanRuleId = scanRuleId;
        return this;
    }
    public String getScanRuleId() {
        return this.scanRuleId;
    }

}
