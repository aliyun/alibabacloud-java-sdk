// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class TableExtendedPrivilegesRolePrivilegesValue extends TeaModel {
    // CreateTime
    @NameInMap("CreateTime")
    public Integer createTime;

    // GrantOption
    @NameInMap("GrantOption")
    public Boolean grantOption;

    // Grantor
    @NameInMap("Grantor")
    public String grantor;

    // GrantorType
    @NameInMap("GrantorType")
    public String grantorType;

    // Privilege
    @NameInMap("Privilege")
    public String privilege;

    public static TableExtendedPrivilegesRolePrivilegesValue build(java.util.Map<String, ?> map) throws Exception {
        TableExtendedPrivilegesRolePrivilegesValue self = new TableExtendedPrivilegesRolePrivilegesValue();
        return TeaModel.build(map, self);
    }

    public TableExtendedPrivilegesRolePrivilegesValue setCreateTime(Integer createTime) {
        this.createTime = createTime;
        return this;
    }
    public Integer getCreateTime() {
        return this.createTime;
    }

    public TableExtendedPrivilegesRolePrivilegesValue setGrantOption(Boolean grantOption) {
        this.grantOption = grantOption;
        return this;
    }
    public Boolean getGrantOption() {
        return this.grantOption;
    }

    public TableExtendedPrivilegesRolePrivilegesValue setGrantor(String grantor) {
        this.grantor = grantor;
        return this;
    }
    public String getGrantor() {
        return this.grantor;
    }

    public TableExtendedPrivilegesRolePrivilegesValue setGrantorType(String grantorType) {
        this.grantorType = grantorType;
        return this;
    }
    public String getGrantorType() {
        return this.grantorType;
    }

    public TableExtendedPrivilegesRolePrivilegesValue setPrivilege(String privilege) {
        this.privilege = privilege;
        return this;
    }
    public String getPrivilege() {
        return this.privilege;
    }

}
