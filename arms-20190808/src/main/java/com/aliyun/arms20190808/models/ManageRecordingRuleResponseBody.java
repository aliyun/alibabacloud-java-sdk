// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ManageRecordingRuleResponseBody extends TeaModel {
    /**
     * <p>The result of the operation.</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>The ID of the request. You can use the ID to troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ManageRecordingRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ManageRecordingRuleResponseBody self = new ManageRecordingRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public ManageRecordingRuleResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public ManageRecordingRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
