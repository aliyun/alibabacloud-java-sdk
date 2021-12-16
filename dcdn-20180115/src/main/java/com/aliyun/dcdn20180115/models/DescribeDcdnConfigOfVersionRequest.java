// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnConfigOfVersionRequest extends TeaModel {
    @NameInMap("FunctionId")
    public Integer functionId;

    @NameInMap("FunctionName")
    public String functionName;

    @NameInMap("GroupId")
    public Long groupId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("VersionId")
    public String versionId;

    public static DescribeDcdnConfigOfVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnConfigOfVersionRequest self = new DescribeDcdnConfigOfVersionRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnConfigOfVersionRequest setFunctionId(Integer functionId) {
        this.functionId = functionId;
        return this;
    }
    public Integer getFunctionId() {
        return this.functionId;
    }

    public DescribeDcdnConfigOfVersionRequest setFunctionName(String functionName) {
        this.functionName = functionName;
        return this;
    }
    public String getFunctionName() {
        return this.functionName;
    }

    public DescribeDcdnConfigOfVersionRequest setGroupId(Long groupId) {
        this.groupId = groupId;
        return this;
    }
    public Long getGroupId() {
        return this.groupId;
    }

    public DescribeDcdnConfigOfVersionRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeDcdnConfigOfVersionRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public DescribeDcdnConfigOfVersionRequest setVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }
    public String getVersionId() {
        return this.versionId;
    }

}
