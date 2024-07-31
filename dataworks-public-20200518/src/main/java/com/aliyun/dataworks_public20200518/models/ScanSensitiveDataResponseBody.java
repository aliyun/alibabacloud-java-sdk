// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ScanSensitiveDataResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0000-ABCD-EFG****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The check result. sensDatas indicates the rules that are used to check the sensitive data. sensDatas includes the following parameters:</p>
     * <ul>
     * <li>hitCount: the number of times that the sensitive data hits the rule.</li>
     * <li>ruleName: the name of the rule.</li>
     * </ul>
     */
    @NameInMap("Sensitives")
    public java.util.Map<String, ?> sensitives;

    public static ScanSensitiveDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ScanSensitiveDataResponseBody self = new ScanSensitiveDataResponseBody();
        return TeaModel.build(map, self);
    }

    public ScanSensitiveDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ScanSensitiveDataResponseBody setSensitives(java.util.Map<String, ?> sensitives) {
        this.sensitives = sensitives;
        return this;
    }
    public java.util.Map<String, ?> getSensitives() {
        return this.sensitives;
    }

}
