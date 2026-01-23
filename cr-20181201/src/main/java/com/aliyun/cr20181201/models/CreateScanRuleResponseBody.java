// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class CreateScanRuleResponseBody extends TeaModel {
    /**
     * <p>The returned HTTP or HTTPS status code.</p>
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
     * <p>EAEAB520-2456-5BF2-BCB5-AC998DFA3A51</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The rule ID.</p>
     * 
     * <strong>example:</strong>
     * <p>crscnr-k3gdm5vrn2nzf5hw</p>
     */
    @NameInMap("ScanRuleId")
    public String scanRuleId;

    public static CreateScanRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateScanRuleResponseBody self = new CreateScanRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateScanRuleResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public CreateScanRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateScanRuleResponseBody setScanRuleId(String scanRuleId) {
        this.scanRuleId = scanRuleId;
        return this;
    }
    public String getScanRuleId() {
        return this.scanRuleId;
    }

}
