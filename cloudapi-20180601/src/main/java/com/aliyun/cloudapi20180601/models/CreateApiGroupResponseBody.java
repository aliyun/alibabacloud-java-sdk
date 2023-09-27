// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20180601.models;

import com.aliyun.tea.*;

public class CreateApiGroupResponseBody extends TeaModel {
    @NameInMap("Description")
    public String description;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("GroupName")
    public String groupName;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SubDomain")
    public String subDomain;

    public static CreateApiGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateApiGroupResponseBody self = new CreateApiGroupResponseBody();
        return TeaModel.build(map, self);
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

}
