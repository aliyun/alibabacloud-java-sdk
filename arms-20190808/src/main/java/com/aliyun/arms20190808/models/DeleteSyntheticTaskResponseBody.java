// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DeleteSyntheticTaskResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1A9C645C-C83F-4C9D-8CCB-29BEC9E1****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the specified tasks are deleted.</p>
     * <ul>
     * <li><code>true</code>: The tasks are deleted.</li>
     * <li><code>false</code>: The tasks fail to be deleted.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Result")
    public String result;

    public static DeleteSyntheticTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteSyntheticTaskResponseBody self = new DeleteSyntheticTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteSyntheticTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteSyntheticTaskResponseBody setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

}
