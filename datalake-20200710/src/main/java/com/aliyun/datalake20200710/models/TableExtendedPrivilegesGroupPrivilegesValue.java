// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class TableExtendedPrivilegesGroupPrivilegesValue extends TeaModel {
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

    public static TableExtendedPrivilegesGroupPrivilegesValue build(java.util.Map<String, ?> map) throws Exception {
        TableExtendedPrivilegesGroupPrivilegesValue self = new TableExtendedPrivilegesGroupPrivilegesValue();
        return TeaModel.build(map, self);
    }

    public TableExtendedPrivilegesGroupPrivilegesValue setCreateTime(Integer createTime) {
        this.createTime = createTime;
        return this;
    }
    public Integer getCreateTime() {
        return this.createTime;
    }

    public TableExtendedPrivilegesGroupPrivilegesValue setGrantOption(Boolean grantOption) {
        this.grantOption = grantOption;
        return this;
    }
    public Boolean getGrantOption() {
        return this.grantOption;
    }

    public TableExtendedPrivilegesGroupPrivilegesValue setGrantor(String grantor) {
        this.grantor = grantor;
        return this;
    }
    public String getGrantor() {
        return this.grantor;
    }

    public TableExtendedPrivilegesGroupPrivilegesValue setGrantorType(String grantorType) {
        this.grantorType = grantorType;
        return this;
    }
    public String getGrantorType() {
        return this.grantorType;
    }

    public TableExtendedPrivilegesGroupPrivilegesValue setPrivilege(String privilege) {
        this.privilege = privilege;
        return this;
    }
    public String getPrivilege() {
        return this.privilege;
    }

}
