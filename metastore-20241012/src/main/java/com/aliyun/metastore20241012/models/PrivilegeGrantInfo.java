// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.metastore20241012.models;

import com.aliyun.tea.*;

public class PrivilegeGrantInfo extends TeaModel {
    @NameInMap("CreateTime")
    public Integer createTime;

    @NameInMap("GrantOption")
    public Boolean grantOption;

    @NameInMap("Grantor")
    public String grantor;

    @NameInMap("GrantorType")
    public String grantorType;

    @NameInMap("Privilege")
    public String privilege;

    public static PrivilegeGrantInfo build(java.util.Map<String, ?> map) throws Exception {
        PrivilegeGrantInfo self = new PrivilegeGrantInfo();
        return TeaModel.build(map, self);
    }

    public PrivilegeGrantInfo setCreateTime(Integer createTime) {
        this.createTime = createTime;
        return this;
    }
    public Integer getCreateTime() {
        return this.createTime;
    }

    public PrivilegeGrantInfo setGrantOption(Boolean grantOption) {
        this.grantOption = grantOption;
        return this;
    }
    public Boolean getGrantOption() {
        return this.grantOption;
    }

    public PrivilegeGrantInfo setGrantor(String grantor) {
        this.grantor = grantor;
        return this;
    }
    public String getGrantor() {
        return this.grantor;
    }

    public PrivilegeGrantInfo setGrantorType(String grantorType) {
        this.grantorType = grantorType;
        return this;
    }
    public String getGrantorType() {
        return this.grantorType;
    }

    public PrivilegeGrantInfo setPrivilege(String privilege) {
        this.privilege = privilege;
        return this;
    }
    public String getPrivilege() {
        return this.privilege;
    }

}
