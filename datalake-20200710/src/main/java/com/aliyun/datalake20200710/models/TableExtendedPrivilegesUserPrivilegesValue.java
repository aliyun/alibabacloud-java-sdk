// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class TableExtendedPrivilegesUserPrivilegesValue extends TeaModel {
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

    public static TableExtendedPrivilegesUserPrivilegesValue build(java.util.Map<String, ?> map) throws Exception {
        TableExtendedPrivilegesUserPrivilegesValue self = new TableExtendedPrivilegesUserPrivilegesValue();
        return TeaModel.build(map, self);
    }

    public TableExtendedPrivilegesUserPrivilegesValue setCreateTime(Integer createTime) {
        this.createTime = createTime;
        return this;
    }
    public Integer getCreateTime() {
        return this.createTime;
    }

    public TableExtendedPrivilegesUserPrivilegesValue setGrantOption(Boolean grantOption) {
        this.grantOption = grantOption;
        return this;
    }
    public Boolean getGrantOption() {
        return this.grantOption;
    }

    public TableExtendedPrivilegesUserPrivilegesValue setGrantor(String grantor) {
        this.grantor = grantor;
        return this;
    }
    public String getGrantor() {
        return this.grantor;
    }

    public TableExtendedPrivilegesUserPrivilegesValue setGrantorType(String grantorType) {
        this.grantorType = grantorType;
        return this;
    }
    public String getGrantorType() {
        return this.grantorType;
    }

    public TableExtendedPrivilegesUserPrivilegesValue setPrivilege(String privilege) {
        this.privilege = privilege;
        return this;
    }
    public String getPrivilege() {
        return this.privilege;
    }

}
