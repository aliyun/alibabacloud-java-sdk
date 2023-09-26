// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160701.models;

import com.aliyun.tea.*;

public class DescribeApiGroupDetailForConsumerRequest extends TeaModel {
    @NameInMap("ApiId")
    public String apiId;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("StageName")
    public String stageName;

    public static DescribeApiGroupDetailForConsumerRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeApiGroupDetailForConsumerRequest self = new DescribeApiGroupDetailForConsumerRequest();
        return TeaModel.build(map, self);
    }

    public DescribeApiGroupDetailForConsumerRequest setApiId(String apiId) {
        this.apiId = apiId;
        return this;
    }
    public String getApiId() {
        return this.apiId;
    }

    public DescribeApiGroupDetailForConsumerRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public DescribeApiGroupDetailForConsumerRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public DescribeApiGroupDetailForConsumerRequest setStageName(String stageName) {
        this.stageName = stageName;
        return this;
    }
    public String getStageName() {
        return this.stageName;
    }

}
