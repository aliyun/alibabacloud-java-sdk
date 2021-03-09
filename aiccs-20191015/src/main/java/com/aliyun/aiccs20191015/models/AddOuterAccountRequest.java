// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class AddOuterAccountRequest extends TeaModel {
    @NameInMap("OuterAccountId")
    public String outerAccountId;

    @NameInMap("OuterAccountType")
    public String outerAccountType;

    @NameInMap("OuterAccountName")
    public String outerAccountName;

    @NameInMap("Avatar")
    public String avatar;

    @NameInMap("RealName")
    public String realName;

    @NameInMap("OuterDepartmentId")
    public String outerDepartmentId;

    @NameInMap("OuterGroupIds")
    public String outerGroupIds;

    @NameInMap("Ext")
    public String ext;

    @NameInMap("OuterDepartmentType")
    public String outerDepartmentType;

    @NameInMap("OuterGroupType")
    public String outerGroupType;

    public static AddOuterAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        AddOuterAccountRequest self = new AddOuterAccountRequest();
        return TeaModel.build(map, self);
    }

    public AddOuterAccountRequest setOuterAccountId(String outerAccountId) {
        this.outerAccountId = outerAccountId;
        return this;
    }
    public String getOuterAccountId() {
        return this.outerAccountId;
    }

    public AddOuterAccountRequest setOuterAccountType(String outerAccountType) {
        this.outerAccountType = outerAccountType;
        return this;
    }
    public String getOuterAccountType() {
        return this.outerAccountType;
    }

    public AddOuterAccountRequest setOuterAccountName(String outerAccountName) {
        this.outerAccountName = outerAccountName;
        return this;
    }
    public String getOuterAccountName() {
        return this.outerAccountName;
    }

    public AddOuterAccountRequest setAvatar(String avatar) {
        this.avatar = avatar;
        return this;
    }
    public String getAvatar() {
        return this.avatar;
    }

    public AddOuterAccountRequest setRealName(String realName) {
        this.realName = realName;
        return this;
    }
    public String getRealName() {
        return this.realName;
    }

    public AddOuterAccountRequest setOuterDepartmentId(String outerDepartmentId) {
        this.outerDepartmentId = outerDepartmentId;
        return this;
    }
    public String getOuterDepartmentId() {
        return this.outerDepartmentId;
    }

    public AddOuterAccountRequest setOuterGroupIds(String outerGroupIds) {
        this.outerGroupIds = outerGroupIds;
        return this;
    }
    public String getOuterGroupIds() {
        return this.outerGroupIds;
    }

    public AddOuterAccountRequest setExt(String ext) {
        this.ext = ext;
        return this;
    }
    public String getExt() {
        return this.ext;
    }

    public AddOuterAccountRequest setOuterDepartmentType(String outerDepartmentType) {
        this.outerDepartmentType = outerDepartmentType;
        return this;
    }
    public String getOuterDepartmentType() {
        return this.outerDepartmentType;
    }

    public AddOuterAccountRequest setOuterGroupType(String outerGroupType) {
        this.outerGroupType = outerGroupType;
        return this;
    }
    public String getOuterGroupType() {
        return this.outerGroupType;
    }

}
