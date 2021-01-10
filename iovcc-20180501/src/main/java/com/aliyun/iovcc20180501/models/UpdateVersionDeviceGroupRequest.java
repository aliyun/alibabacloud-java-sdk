// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class UpdateVersionDeviceGroupRequest extends TeaModel {
    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("Name")
    public String name;

    @NameInMap("Description")
    public String description;

    @NameInMap("Id")
    public String id;

    public static UpdateVersionDeviceGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateVersionDeviceGroupRequest self = new UpdateVersionDeviceGroupRequest();
        return TeaModel.build(map, self);
    }

    public UpdateVersionDeviceGroupRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public UpdateVersionDeviceGroupRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateVersionDeviceGroupRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateVersionDeviceGroupRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
