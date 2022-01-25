// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class UpdateAppRequest extends TeaModel {
    @NameInMap("DepartmentId")
    public String departmentId;

    @NameInMap("Disabled")
    public Boolean disabled;

    @NameInMap("Id")
    public String id;

    @NameInMap("Name")
    public String name;

    @NameInMap("PackageName")
    public String packageName;

    public static UpdateAppRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAppRequest self = new UpdateAppRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAppRequest setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
        return this;
    }
    public String getDepartmentId() {
        return this.departmentId;
    }

    public UpdateAppRequest setDisabled(Boolean disabled) {
        this.disabled = disabled;
        return this;
    }
    public Boolean getDisabled() {
        return this.disabled;
    }

    public UpdateAppRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public UpdateAppRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateAppRequest setPackageName(String packageName) {
        this.packageName = packageName;
        return this;
    }
    public String getPackageName() {
        return this.packageName;
    }

}
