// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class CheckCloudResourceAuthorizedResponseBody extends TeaModel {
    /**
     * <p>Indicates whether KMS keys are authorized to ApsaraDB for MongoDB instances. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: KMS keys are not authorized.</li>
     * <li><strong>1</strong>: KMS keys are authorized.</li>
     * <li><strong>2</strong>: KMS is not enabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AuthorizationState")
    public Integer authorizationState;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>A0181AC4-F186-46ED-87CA-100C70B86729</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The role information of the authorized Alibaba Resource Name (ARN).</p>
     * <blockquote>
     * <p> This parameter is returned only when the value of the <strong>AuthorizationState</strong> parameter is <strong>1</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>acs:ram::140****:role/aliyunrdsinstanceencryptiondefaultrole</p>
     */
    @NameInMap("RoleArn")
    public String roleArn;

    public static CheckCloudResourceAuthorizedResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckCloudResourceAuthorizedResponseBody self = new CheckCloudResourceAuthorizedResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckCloudResourceAuthorizedResponseBody setAuthorizationState(Integer authorizationState) {
        this.authorizationState = authorizationState;
        return this;
    }
    public Integer getAuthorizationState() {
        return this.authorizationState;
    }

    public CheckCloudResourceAuthorizedResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckCloudResourceAuthorizedResponseBody setRoleArn(String roleArn) {
        this.roleArn = roleArn;
        return this;
    }
    public String getRoleArn() {
        return this.roleArn;
    }

}
