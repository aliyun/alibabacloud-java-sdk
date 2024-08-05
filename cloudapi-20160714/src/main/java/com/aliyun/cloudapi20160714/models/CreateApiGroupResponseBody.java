// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class CreateApiGroupResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>/qqq</p>
     */
    @NameInMap("BasePath")
    public String basePath;

    /**
     * <strong>example:</strong>
     * <p>The weather informations</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <strong>example:</strong>
     * <p>523e8dc7bbe04613b5b1d726c2a7xx</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <strong>example:</strong>
     * <p>Weather</p>
     */
    @NameInMap("GroupName")
    public String groupName;

    /**
     * <strong>example:</strong>
     * <p>apigateway-cn-v6419k43xxxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>VPC_SHARED</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <strong>example:</strong>
     * <p>FF3B7D81-66AE-47E0-BF69-157DCF187514</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>523e8dc7bbe04613b5b1d726xxxxxxxx-cn-hangzhou.alicloudapi.com</p>
     */
    @NameInMap("SubDomain")
    public String subDomain;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
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
