// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class CreateDepartmentRequest extends TeaModel {
    @NameInMap("Description")
    public String description;

    @NameInMap("Label")
    public String label;

    @NameInMap("Name")
    public String name;

    @NameInMap("ClientToken")
    public String clientToken;

    public static CreateDepartmentRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDepartmentRequest self = new CreateDepartmentRequest();
        return TeaModel.build(map, self);
    }

    public CreateDepartmentRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateDepartmentRequest setLabel(String label) {
        this.label = label;
        return this;
    }
    public String getLabel() {
        return this.label;
    }

    public CreateDepartmentRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateDepartmentRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
