// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class AddAppAgentResponseBody extends TeaModel {
    /**
     * <p>The returned data.</p>
     * 
     * <strong>example:</strong>
     * <p>ag.abcxxx</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>The ID assigned by the backend to uniquely identify a request. You can use this ID to troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAA-BBBB-CCCCC-DDDD-EEEEEEEE****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AddAppAgentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddAppAgentResponseBody self = new AddAppAgentResponseBody();
        return TeaModel.build(map, self);
    }

    public AddAppAgentResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public AddAppAgentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
