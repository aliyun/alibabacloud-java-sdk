// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class CreateVersionDeviceGroupRequest extends TeaModel {
    @NameInMap("MaxCount")
    public String maxCount;

    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("Name")
    public String name;

    @NameInMap("Description")
    public String description;

    public static CreateVersionDeviceGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateVersionDeviceGroupRequest self = new CreateVersionDeviceGroupRequest();
        return TeaModel.build(map, self);
    }

    public CreateVersionDeviceGroupRequest setMaxCount(String maxCount) {
        this.maxCount = maxCount;
        return this;
    }
    public String getMaxCount() {
        return this.maxCount;
    }

    public CreateVersionDeviceGroupRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public CreateVersionDeviceGroupRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateVersionDeviceGroupRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

}
