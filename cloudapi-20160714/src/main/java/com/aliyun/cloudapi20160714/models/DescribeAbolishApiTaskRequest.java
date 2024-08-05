// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeAbolishApiTaskRequest extends TeaModel {
    /**
     * <p>The ID of the unpublishing operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>fc54<em><em><strong>dd4c4</strong></em>ad7edd7</em>***39401</p>
     */
    @NameInMap("OperationUid")
    public String operationUid;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static DescribeAbolishApiTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAbolishApiTaskRequest self = new DescribeAbolishApiTaskRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAbolishApiTaskRequest setOperationUid(String operationUid) {
        this.operationUid = operationUid;
        return this;
    }
    public String getOperationUid() {
        return this.operationUid;
    }

    public DescribeAbolishApiTaskRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
