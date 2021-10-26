// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeVarDiffBetweenGroupRequest extends TeaModel {
    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("TargetGroupId")
    public String targetGroupId;

    @NameInMap("SourceGroupId")
    public String sourceGroupId;

    @NameInMap("SourceRegionId")
    public String sourceRegionId;

    public static DescribeVarDiffBetweenGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVarDiffBetweenGroupRequest self = new DescribeVarDiffBetweenGroupRequest();
        return TeaModel.build(map, self);
    }

    public DescribeVarDiffBetweenGroupRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public DescribeVarDiffBetweenGroupRequest setTargetGroupId(String targetGroupId) {
        this.targetGroupId = targetGroupId;
        return this;
    }
    public String getTargetGroupId() {
        return this.targetGroupId;
    }

    public DescribeVarDiffBetweenGroupRequest setSourceGroupId(String sourceGroupId) {
        this.sourceGroupId = sourceGroupId;
        return this;
    }
    public String getSourceGroupId() {
        return this.sourceGroupId;
    }

    public DescribeVarDiffBetweenGroupRequest setSourceRegionId(String sourceRegionId) {
        this.sourceRegionId = sourceRegionId;
        return this;
    }
    public String getSourceRegionId() {
        return this.sourceRegionId;
    }

}
