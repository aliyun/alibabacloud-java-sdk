// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class GetAsyncResultResponseBody extends TeaModel {
    /**
     * <p>The execution result data of the customer service.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;message&quot;:&quot;Execution completed&quot;}</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>F79E7305-5314-5069-A701-9591AD051902</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The execution status.</p>
     * <table>
     * <thead>
     * <tr>
     * <th>Value</th>
     * <th>Description</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>Success</td>
     * <td>The task is executed.</td>
     * </tr>
     * <tr>
     * <td>Runninig</td>
     * <td>The task is being executed.</td>
     * </tr>
     * <tr>
     * <td>Fail</td>
     * <td>The task failed to be executed.</td>
     * </tr>
     * </tbody></table>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Status")
    public String status;

    public static GetAsyncResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAsyncResultResponseBody self = new GetAsyncResultResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAsyncResultResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public GetAsyncResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAsyncResultResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
