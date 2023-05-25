// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeTrafficControlsByApiRequest extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("ApiId")
    public String apiId;

    /**
     * <p>The runtime environment of the API. Valid values:</p>
     * <br>
     * <p>*   **RELEASE**</p>
     * <p>*   **TEST**</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>The returned throttling policy information. It is an array consisting of TrafficControlItem data.</p>
     */
    @NameInMap("StageName")
    public String stageName;

    public static DescribeTrafficControlsByApiRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeTrafficControlsByApiRequest self = new DescribeTrafficControlsByApiRequest();
        return TeaModel.build(map, self);
    }

    public DescribeTrafficControlsByApiRequest setApiId(String apiId) {
        this.apiId = apiId;
        return this;
    }
    public String getApiId() {
        return this.apiId;
    }

    public DescribeTrafficControlsByApiRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public DescribeTrafficControlsByApiRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public DescribeTrafficControlsByApiRequest setStageName(String stageName) {
        this.stageName = stageName;
        return this;
    }
    public String getStageName() {
        return this.stageName;
    }

}
