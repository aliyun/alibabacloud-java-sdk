// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class ModifyVpcAccessAndUpdateApisResponseBody extends TeaModel {
    /**
     * <p>The ID of the asynchronous task.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li>If the associated API is updated, you can use the task ID in the <strong>DescribeUpdateVpcInfoTask</strong> operation to query the update result.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>7b6d0cb72b2e4215b0129f675c889746</p>
     */
    @NameInMap("OperationId")
    public String operationId;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>C2CEC6EA-EEBA-5FD6-8BD9-2CF01980FE39</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyVpcAccessAndUpdateApisResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyVpcAccessAndUpdateApisResponseBody self = new ModifyVpcAccessAndUpdateApisResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyVpcAccessAndUpdateApisResponseBody setOperationId(String operationId) {
        this.operationId = operationId;
        return this;
    }
    public String getOperationId() {
        return this.operationId;
    }

    public ModifyVpcAccessAndUpdateApisResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
