// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class InitializeOperationRoleResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>29101430-4797-4D1D-96C3-9FCBCCA8F845</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the service-linked role is created. Valid values:</p>
     * <ul>
     * <li>true: The service-linked role is created.</li>
     * <li>false: The service-linked role fails to be created.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Result")
    public Boolean result;

    public static InitializeOperationRoleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        InitializeOperationRoleResponseBody self = new InitializeOperationRoleResponseBody();
        return TeaModel.build(map, self);
    }

    public InitializeOperationRoleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public InitializeOperationRoleResponseBody setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

}
