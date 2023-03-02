// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ScanSensitiveDataResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The result of the check.</p>
     * <br>
     * <p>sensDatas indicates the rules that are used to check the sensitive data. sensDatas includes the following parameters:</p>
     * <br>
     * <p>*   hitCount: the number of times that the sensitive data hits the rule</p>
     * <p>*   ruleName: the name of the rule</p>
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
