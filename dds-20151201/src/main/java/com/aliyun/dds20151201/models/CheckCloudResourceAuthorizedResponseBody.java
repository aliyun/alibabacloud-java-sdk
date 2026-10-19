// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class CheckCloudResourceAuthorizedResponseBody extends TeaModel {
    /**
     * <p>The authorization status. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: Not authorized.</li>
     * <li><strong>1</strong>: Authorized.</li>
     * <li><strong>2</strong>: The user has not enabled KMS.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AuthorizationState")
    public Integer authorizationState;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A0181AC4-F186-46ED-87CA-100C70B86729</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information about the role that is authorized to access Alibaba Cloud resources.</p>
     * <blockquote>
     * <p>The response includes this parameter only when the return value of <strong>AuthorizationState</strong> is <strong>1</strong>.</p>
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
