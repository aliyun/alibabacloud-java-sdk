// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class CreateAppRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DepartmentId")
    public String departmentId;

    @NameInMap("Name")
    public String name;

    @NameInMap("PackageName")
    public String packageName;

    public static CreateAppRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAppRequest self = new CreateAppRequest();
        return TeaModel.build(map, self);
    }

    public CreateAppRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateAppRequest setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
        return this;
    }
    public String getDepartmentId() {
        return this.departmentId;
    }

    public CreateAppRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateAppRequest setPackageName(String packageName) {
        this.packageName = packageName;
        return this;
    }
    public String getPackageName() {
        return this.packageName;
    }

}
