// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class PrivilegeTransferResultEntrie extends TeaModel {
    @NameInMap("Children")
    public java.util.List<PrivilegeTransferResultEntrie> children;

    @NameInMap("ErrMsg")
    public String errMsg;

    @NameInMap("IsLeaf")
    public Boolean isLeaf;

    @NameInMap("Privilege")
    public String privilege;

    @NameInMap("PrivilegeDisplayName")
    public String privilegeDisplayName;

    @NameInMap("Status")
    public String status;

    @NameInMap("Test")
    public String test;

    public static PrivilegeTransferResultEntrie build(java.util.Map<String, ?> map) throws Exception {
        PrivilegeTransferResultEntrie self = new PrivilegeTransferResultEntrie();
        return TeaModel.build(map, self);
    }

    public PrivilegeTransferResultEntrie setChildren(java.util.List<PrivilegeTransferResultEntrie> children) {
        this.children = children;
        return this;
    }
    public java.util.List<PrivilegeTransferResultEntrie> getChildren() {
        return this.children;
    }

    public PrivilegeTransferResultEntrie setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

    public PrivilegeTransferResultEntrie setIsLeaf(Boolean isLeaf) {
        this.isLeaf = isLeaf;
        return this;
    }
    public Boolean getIsLeaf() {
        return this.isLeaf;
    }

    public PrivilegeTransferResultEntrie setPrivilege(String privilege) {
        this.privilege = privilege;
        return this;
    }
    public String getPrivilege() {
        return this.privilege;
    }

    public PrivilegeTransferResultEntrie setPrivilegeDisplayName(String privilegeDisplayName) {
        this.privilegeDisplayName = privilegeDisplayName;
        return this;
    }
    public String getPrivilegeDisplayName() {
        return this.privilegeDisplayName;
    }

    public PrivilegeTransferResultEntrie setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public PrivilegeTransferResultEntrie setTest(String test) {
        this.test = test;
        return this;
    }
    public String getTest() {
        return this.test;
    }

}
