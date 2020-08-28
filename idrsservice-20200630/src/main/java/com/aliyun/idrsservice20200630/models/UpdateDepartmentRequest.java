// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class UpdateDepartmentRequest extends TeaModel {
    @NameInMap("Description")
    public String description;

    @NameInMap("Label")
    public String label;

    @NameInMap("Name")
    public String name;

    @NameInMap("Id")
    @Validation(required = true)
    public String id;

    public static UpdateDepartmentRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDepartmentRequest self = new UpdateDepartmentRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDepartmentRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateDepartmentRequest setLabel(String label) {
        this.label = label;
        return this;
    }
    public String getLabel() {
        return this.label;
    }

    public UpdateDepartmentRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateDepartmentRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
