// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeImportOASTaskRequest extends TeaModel {
    /**
     * <p>The ID of the asynchronous API import task that was generated during the import operation. This ID is used to query the execution status of the API import task.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("OperationId")
    public String operationId;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static DescribeImportOASTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeImportOASTaskRequest self = new DescribeImportOASTaskRequest();
        return TeaModel.build(map, self);
    }

    public DescribeImportOASTaskRequest setOperationId(String operationId) {
        this.operationId = operationId;
        return this;
    }
    public String getOperationId() {
        return this.operationId;
    }

    public DescribeImportOASTaskRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
