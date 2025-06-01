// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class OpenStructSaseUserSimple extends TeaModel {
    @NameInMap("Departments")
    public java.util.List<OpenStructSaseUserSimpleDepartments> departments;

    @NameInMap("Email")
    public String email;

    @NameInMap("IdpConfigId")
    public String idpConfigId;

    @NameInMap("SaseUserId")
    public String saseUserId;

    @NameInMap("Telephone")
    public String telephone;

    @NameInMap("Username")
    public String username;

    public static OpenStructSaseUserSimple build(java.util.Map<String, ?> map) throws Exception {
        OpenStructSaseUserSimple self = new OpenStructSaseUserSimple();
        return TeaModel.build(map, self);
    }

    public OpenStructSaseUserSimple setDepartments(java.util.List<OpenStructSaseUserSimpleDepartments> departments) {
        this.departments = departments;
        return this;
    }
    public java.util.List<OpenStructSaseUserSimpleDepartments> getDepartments() {
        return this.departments;
    }

    public OpenStructSaseUserSimple setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public OpenStructSaseUserSimple setIdpConfigId(String idpConfigId) {
        this.idpConfigId = idpConfigId;
        return this;
    }
    public String getIdpConfigId() {
        return this.idpConfigId;
    }

    public OpenStructSaseUserSimple setSaseUserId(String saseUserId) {
        this.saseUserId = saseUserId;
        return this;
    }
    public String getSaseUserId() {
        return this.saseUserId;
    }

    public OpenStructSaseUserSimple setTelephone(String telephone) {
        this.telephone = telephone;
        return this;
    }
    public String getTelephone() {
        return this.telephone;
    }

    public OpenStructSaseUserSimple setUsername(String username) {
        this.username = username;
        return this;
    }
    public String getUsername() {
        return this.username;
    }

    public static class OpenStructSaseUserSimpleDepartments extends TeaModel {
        @NameInMap("DepartmentId")
        public String departmentId;

        @NameInMap("Name")
        public String name;

        public static OpenStructSaseUserSimpleDepartments build(java.util.Map<String, ?> map) throws Exception {
            OpenStructSaseUserSimpleDepartments self = new OpenStructSaseUserSimpleDepartments();
            return TeaModel.build(map, self);
        }

        public OpenStructSaseUserSimpleDepartments setDepartmentId(String departmentId) {
            this.departmentId = departmentId;
            return this;
        }
        public String getDepartmentId() {
            return this.departmentId;
        }

        public OpenStructSaseUserSimpleDepartments setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
