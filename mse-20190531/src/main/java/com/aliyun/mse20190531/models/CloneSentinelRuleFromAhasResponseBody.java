// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class CloneSentinelRuleFromAhasResponseBody extends TeaModel {
    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public java.util.Map<String, java.util.List<String>> data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>EE5C32A1-BC0E-4B79-817C-103E4EDF****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CloneSentinelRuleFromAhasResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CloneSentinelRuleFromAhasResponseBody self = new CloneSentinelRuleFromAhasResponseBody();
        return TeaModel.build(map, self);
    }

    public CloneSentinelRuleFromAhasResponseBody setData(java.util.Map<String, java.util.List<String>> data) {
        this.data = data;
        return this;
    }
    public java.util.Map<String, java.util.List<String>> getData() {
        return this.data;
    }

    public CloneSentinelRuleFromAhasResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
