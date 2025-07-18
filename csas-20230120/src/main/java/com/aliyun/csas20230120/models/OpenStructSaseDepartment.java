// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class OpenStructSaseDepartment extends TeaModel {
    @NameInMap("DepartmentId")
    public String departmentId;

    @NameInMap("FullDn")
    public String fullDn;

    @NameInMap("Name")
    public String name;

    @NameInMap("ParentDepartmentId")
    public String parentDepartmentId;

    public static OpenStructSaseDepartment build(java.util.Map<String, ?> map) throws Exception {
        OpenStructSaseDepartment self = new OpenStructSaseDepartment();
        return TeaModel.build(map, self);
    }

    public OpenStructSaseDepartment setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
        return this;
    }
    public String getDepartmentId() {
        return this.departmentId;
    }

    public OpenStructSaseDepartment setFullDn(String fullDn) {
        this.fullDn = fullDn;
        return this;
    }
    public String getFullDn() {
        return this.fullDn;
    }

    public OpenStructSaseDepartment setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public OpenStructSaseDepartment setParentDepartmentId(String parentDepartmentId) {
        this.parentDepartmentId = parentDepartmentId;
        return this;
    }
    public String getParentDepartmentId() {
        return this.parentDepartmentId;
    }

}
