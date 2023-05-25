// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class CreateApiGroupResponseBody extends TeaModel {
    @NameInMap("BasePath")
    public String basePath;

    @NameInMap("Description")
    public String description;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("GroupName")
    public String groupName;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("InstanceType")
    public String instanceType;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SubDomain")
    public String subDomain;

    @NameInMap("TagStatus")
    public Boolean tagStatus;

    public static CreateApiGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateApiGroupResponseBody self = new CreateApiGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateApiGroupResponseBody setBasePath(String basePath) {
        this.basePath = basePath;
        return this;
    }
    public String getBasePath() {
        return this.basePath;
    }

    public CreateApiGroupResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateApiGroupResponseBody setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public CreateApiGroupResponseBody setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public CreateApiGroupResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateApiGroupResponseBody setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public CreateApiGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateApiGroupResponseBody setSubDomain(String subDomain) {
        this.subDomain = subDomain;
        return this;
    }
    public String getSubDomain() {
        return this.subDomain;
    }

    public CreateApiGroupResponseBody setTagStatus(Boolean tagStatus) {
        this.tagStatus = tagStatus;
        return this;
    }
    public Boolean getTagStatus() {
        return this.tagStatus;
    }

}
