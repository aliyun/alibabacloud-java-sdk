// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class RestartCollectorResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>84B4038A-AF38-4BF4-9FAD-EA92A4FFF00A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the shipper is restarted. Valid values:</p>
     * <ul>
     * <li>true: The shipper is restarted.</li>
     * <li>false: The shipper fails to be restarted.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Result")
    public Boolean result;

    public static RestartCollectorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RestartCollectorResponseBody self = new RestartCollectorResponseBody();
        return TeaModel.build(map, self);
    }

    public RestartCollectorResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RestartCollectorResponseBody setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

}
