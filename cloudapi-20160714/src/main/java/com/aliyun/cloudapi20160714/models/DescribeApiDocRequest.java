// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeApiDocRequest extends TeaModel {
    /**
     * <p>The ID of the API.</p>
     */
    @NameInMap("ApiId")
    public String apiId;

    /**
     * <p>The ID of the API group.</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>The environment to which the API is published. Valid values:</p>
     * <br>
     * <p>*   **RELEASE**</p>
     * <p>*   **TEST**</p>
     * <br>
     * <p>If this parameter is not specified, the default value is used, which is RELEASE.</p>
     */
    @NameInMap("StageName")
    public String stageName;

    public static DescribeApiDocRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeApiDocRequest self = new DescribeApiDocRequest();
        return TeaModel.build(map, self);
    }

    public DescribeApiDocRequest setApiId(String apiId) {
        this.apiId = apiId;
        return this;
    }
    public String getApiId() {
        return this.apiId;
    }

    public DescribeApiDocRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public DescribeApiDocRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public DescribeApiDocRequest setStageName(String stageName) {
        this.stageName = stageName;
        return this;
    }
    public String getStageName() {
        return this.stageName;
    }

}
