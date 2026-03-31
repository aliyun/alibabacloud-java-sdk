// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class StartAggregateRemediationResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Data")
    public Boolean data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>C7817373-78CB-4F9A-8AFA-E7A88E9D64A2</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static StartAggregateRemediationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StartAggregateRemediationResponseBody self = new StartAggregateRemediationResponseBody();
        return TeaModel.build(map, self);
    }

    public StartAggregateRemediationResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public StartAggregateRemediationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
