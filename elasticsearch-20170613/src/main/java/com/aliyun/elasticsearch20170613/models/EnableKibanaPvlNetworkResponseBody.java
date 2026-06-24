// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class EnableKibanaPvlNetworkResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0DC92CFE-62AF-51AF-9D5B-F1078D7C451E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether private network access for Kibana is created. Valid values:</p>
     * <ul>
     * <li>true: The operation is successful.</li>
     * <li>false: The operation failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Result")
    public Boolean result;

    public static EnableKibanaPvlNetworkResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EnableKibanaPvlNetworkResponseBody self = new EnableKibanaPvlNetworkResponseBody();
        return TeaModel.build(map, self);
    }

    public EnableKibanaPvlNetworkResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public EnableKibanaPvlNetworkResponseBody setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

}
