// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeSignaturesByApiRequest extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("ApiId")
    public String apiId;

    /**
     * <p>The runtime environment. Valid values:</p>
     * <br>
     * <p>*   **RELEASE**</p>
     * <p>*   **TEST**</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>The returned signature key information. It is an array consisting of SignatureItem data.</p>
     */
    @NameInMap("StageName")
    public String stageName;

    public static DescribeSignaturesByApiRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSignaturesByApiRequest self = new DescribeSignaturesByApiRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSignaturesByApiRequest setApiId(String apiId) {
        this.apiId = apiId;
        return this;
    }
    public String getApiId() {
        return this.apiId;
    }

    public DescribeSignaturesByApiRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public DescribeSignaturesByApiRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public DescribeSignaturesByApiRequest setStageName(String stageName) {
        this.stageName = stageName;
        return this;
    }
    public String getStageName() {
        return this.stageName;
    }

}
