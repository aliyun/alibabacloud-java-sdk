// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class DescribeFlowEntitySnapshotResponseBody extends TeaModel {
    @NameInMap("EntityId")
    public String entityId;

    @NameInMap("EntityType")
    public String entityType;

    @NameInMap("Active")
    public Boolean active;

    @NameInMap("GmtCreate")
    public Long gmtCreate;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Message")
    public String message;

    @NameInMap("Revision")
    public String revision;

    @NameInMap("UserId")
    public String userId;

    @NameInMap("Data")
    public String data;

    @NameInMap("EntityGroupId")
    public String entityGroupId;

    @NameInMap("CommitterId")
    public String committerId;

    public static DescribeFlowEntitySnapshotResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeFlowEntitySnapshotResponseBody self = new DescribeFlowEntitySnapshotResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeFlowEntitySnapshotResponseBody setEntityId(String entityId) {
        this.entityId = entityId;
        return this;
    }
    public String getEntityId() {
        return this.entityId;
    }

    public DescribeFlowEntitySnapshotResponseBody setEntityType(String entityType) {
        this.entityType = entityType;
        return this;
    }
    public String getEntityType() {
        return this.entityType;
    }

    public DescribeFlowEntitySnapshotResponseBody setActive(Boolean active) {
        this.active = active;
        return this;
    }
    public Boolean getActive() {
        return this.active;
    }

    public DescribeFlowEntitySnapshotResponseBody setGmtCreate(Long gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public Long getGmtCreate() {
        return this.gmtCreate;
    }

    public DescribeFlowEntitySnapshotResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeFlowEntitySnapshotResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeFlowEntitySnapshotResponseBody setRevision(String revision) {
        this.revision = revision;
        return this;
    }
    public String getRevision() {
        return this.revision;
    }

    public DescribeFlowEntitySnapshotResponseBody setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public DescribeFlowEntitySnapshotResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public DescribeFlowEntitySnapshotResponseBody setEntityGroupId(String entityGroupId) {
        this.entityGroupId = entityGroupId;
        return this;
    }
    public String getEntityGroupId() {
        return this.entityGroupId;
    }

    public DescribeFlowEntitySnapshotResponseBody setCommitterId(String committerId) {
        this.committerId = committerId;
        return this;
    }
    public String getCommitterId() {
        return this.committerId;
    }

}
