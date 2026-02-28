// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class OpenStructSaseDepartment extends TeaModel {
    @NameInMap("DepartmentId")
    public String departmentId;

    @NameInMap("FullDepartmentIdPath")
    public String fullDepartmentIdPath;

    @NameInMap("FullDn")
    public String fullDn;

    @NameInMap("IdpId")
    public Long idpId;

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

    public OpenStructSaseDepartment setFullDepartmentIdPath(String fullDepartmentIdPath) {
        this.fullDepartmentIdPath = fullDepartmentIdPath;
        return this;
    }
    public String getFullDepartmentIdPath() {
        return this.fullDepartmentIdPath;
    }

    public OpenStructSaseDepartment setFullDn(String fullDn) {
        this.fullDn = fullDn;
        return this;
    }
    public String getFullDn() {
        return this.fullDn;
    }

    public OpenStructSaseDepartment setIdpId(Long idpId) {
        this.idpId = idpId;
        return this;
    }
    public Long getIdpId() {
        return this.idpId;
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
