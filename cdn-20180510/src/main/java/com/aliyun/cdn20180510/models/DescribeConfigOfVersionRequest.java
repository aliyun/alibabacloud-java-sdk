// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeConfigOfVersionRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("VersionId")
    public String versionId;

    @NameInMap("FunctionId")
    public Integer functionId;

    @NameInMap("FunctionName")
    public String functionName;

    @NameInMap("GroupId")
    public Long groupId;

    public static DescribeConfigOfVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeConfigOfVersionRequest self = new DescribeConfigOfVersionRequest();
        return TeaModel.build(map, self);
    }

    public DescribeConfigOfVersionRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeConfigOfVersionRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public DescribeConfigOfVersionRequest setVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }
    public String getVersionId() {
        return this.versionId;
    }

    public DescribeConfigOfVersionRequest setFunctionId(Integer functionId) {
        this.functionId = functionId;
        return this;
    }
    public Integer getFunctionId() {
        return this.functionId;
    }

    public DescribeConfigOfVersionRequest setFunctionName(String functionName) {
        this.functionName = functionName;
        return this;
    }
    public String getFunctionName() {
        return this.functionName;
    }

    public DescribeConfigOfVersionRequest setGroupId(Long groupId) {
        this.groupId = groupId;
        return this;
    }
    public Long getGroupId() {
        return this.groupId;
    }

}
