// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeActiveVersionOfConfigGroupResponseBody extends TeaModel {
    @NameInMap("Status")
    public String status;

    @NameInMap("UpdateTime")
    public String updateTime;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SeqId")
    public Long seqId;

    @NameInMap("Description")
    public String description;

    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("VersionId")
    public String versionId;

    @NameInMap("ConfigGroupId")
    public String configGroupId;

    @NameInMap("Operator")
    public String operator;

    @NameInMap("BaseVersionId")
    public String baseVersionId;

    public static DescribeActiveVersionOfConfigGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeActiveVersionOfConfigGroupResponseBody self = new DescribeActiveVersionOfConfigGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeActiveVersionOfConfigGroupResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeActiveVersionOfConfigGroupResponseBody setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

    public DescribeActiveVersionOfConfigGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeActiveVersionOfConfigGroupResponseBody setSeqId(Long seqId) {
        this.seqId = seqId;
        return this;
    }
    public Long getSeqId() {
        return this.seqId;
    }

    public DescribeActiveVersionOfConfigGroupResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DescribeActiveVersionOfConfigGroupResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public DescribeActiveVersionOfConfigGroupResponseBody setVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }
    public String getVersionId() {
        return this.versionId;
    }

    public DescribeActiveVersionOfConfigGroupResponseBody setConfigGroupId(String configGroupId) {
        this.configGroupId = configGroupId;
        return this;
    }
    public String getConfigGroupId() {
        return this.configGroupId;
    }

    public DescribeActiveVersionOfConfigGroupResponseBody setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public DescribeActiveVersionOfConfigGroupResponseBody setBaseVersionId(String baseVersionId) {
        this.baseVersionId = baseVersionId;
        return this;
    }
    public String getBaseVersionId() {
        return this.baseVersionId;
    }

}
