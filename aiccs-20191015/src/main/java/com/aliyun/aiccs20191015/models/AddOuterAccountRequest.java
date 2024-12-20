// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class AddOuterAccountRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>http://****</p>
     */
    @NameInMap("Avatar")
    public String avatar;

    @NameInMap("Ext")
    public String ext;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1212</p>
     */
    @NameInMap("OuterAccountId")
    public String outerAccountId;

    @NameInMap("OuterAccountName")
    public String outerAccountName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>alipay</p>
     */
    @NameInMap("OuterAccountType")
    public String outerAccountType;

    /**
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("OuterDepartmentId")
    public String outerDepartmentId;

    /**
     * <strong>example:</strong>
     * <p>type_invalid</p>
     */
    @NameInMap("OuterDepartmentType")
    public String outerDepartmentType;

    /**
     * <strong>example:</strong>
     * <p>[&quot;222&quot;,&quot;333&quot;,&quot;444&quot;]</p>
     */
    @NameInMap("OuterGroupIds")
    public String outerGroupIds;

    /**
     * <strong>example:</strong>
     * <p>mybank</p>
     */
    @NameInMap("OuterGroupType")
    public String outerGroupType;

    @NameInMap("RealName")
    public String realName;

    public static AddOuterAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        AddOuterAccountRequest self = new AddOuterAccountRequest();
        return TeaModel.build(map, self);
    }

    public AddOuterAccountRequest setAvatar(String avatar) {
        this.avatar = avatar;
        return this;
    }
    public String getAvatar() {
        return this.avatar;
    }

    public AddOuterAccountRequest setExt(String ext) {
        this.ext = ext;
        return this;
    }
    public String getExt() {
        return this.ext;
    }

    public AddOuterAccountRequest setOuterAccountId(String outerAccountId) {
        this.outerAccountId = outerAccountId;
        return this;
    }
    public String getOuterAccountId() {
        return this.outerAccountId;
    }

    public AddOuterAccountRequest setOuterAccountName(String outerAccountName) {
        this.outerAccountName = outerAccountName;
        return this;
    }
    public String getOuterAccountName() {
        return this.outerAccountName;
    }

    public AddOuterAccountRequest setOuterAccountType(String outerAccountType) {
        this.outerAccountType = outerAccountType;
        return this;
    }
    public String getOuterAccountType() {
        return this.outerAccountType;
    }

    public AddOuterAccountRequest setOuterDepartmentId(String outerDepartmentId) {
        this.outerDepartmentId = outerDepartmentId;
        return this;
    }
    public String getOuterDepartmentId() {
        return this.outerDepartmentId;
    }

    public AddOuterAccountRequest setOuterDepartmentType(String outerDepartmentType) {
        this.outerDepartmentType = outerDepartmentType;
        return this;
    }
    public String getOuterDepartmentType() {
        return this.outerDepartmentType;
    }

    public AddOuterAccountRequest setOuterGroupIds(String outerGroupIds) {
        this.outerGroupIds = outerGroupIds;
        return this;
    }
    public String getOuterGroupIds() {
        return this.outerGroupIds;
    }

    public AddOuterAccountRequest setOuterGroupType(String outerGroupType) {
        this.outerGroupType = outerGroupType;
        return this;
    }
    public String getOuterGroupType() {
        return this.outerGroupType;
    }

    public AddOuterAccountRequest setRealName(String realName) {
        this.realName = realName;
        return this;
    }
    public String getRealName() {
        return this.realName;
    }

}
