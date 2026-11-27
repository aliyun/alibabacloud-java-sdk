// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class UpdateOuterAccountRequest extends TeaModel {
    /**
     * <p>The profile picture.</p>
     * 
     * <strong>example:</strong>
     * <p>http://****</p>
     */
    @NameInMap("Avatar")
    public String avatar;

    /**
     * <p>The extension field. A JSON string.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Note&quot;:&quot;Temporary skill group&quot;}</p>
     */
    @NameInMap("Ext")
    public String ext;

    /**
     * <p>The external account ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("OuterAccountId")
    public String outerAccountId;

    /**
     * <p>The external account name.</p>
     * 
     * <strong>example:</strong>
     * <p>Test</p>
     */
    @NameInMap("OuterAccountName")
    public String outerAccountName;

    /**
     * <p>The external account type.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>alipay</p>
     */
    @NameInMap("OuterAccountType")
    public String outerAccountType;

    /**
     * <p>The external department ID.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("OuterDepartmentId")
    public String outerDepartmentId;

    /**
     * <p>The external department type: invalid department type.</p>
     * 
     * <strong>example:</strong>
     * <p>type_invalid</p>
     */
    @NameInMap("OuterDepartmentType")
    public String outerDepartmentType;

    /**
     * <p>The list of external skill group IDs. Separate multiple IDs with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;222&quot;,&quot;333&quot;,&quot;444&quot;]</p>
     */
    @NameInMap("OuterGroupIds")
    public String outerGroupIds;

    /**
     * <p>The skill group type.</p>
     * 
     * <strong>example:</strong>
     * <p>mybank</p>
     */
    @NameInMap("OuterGroupType")
    public String outerGroupType;

    /**
     * <p>The real name of the account.</p>
     * 
     * <strong>example:</strong>
     * <p>Zhang San</p>
     */
    @NameInMap("RealName")
    public String realName;

    public static UpdateOuterAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateOuterAccountRequest self = new UpdateOuterAccountRequest();
        return TeaModel.build(map, self);
    }

    public UpdateOuterAccountRequest setAvatar(String avatar) {
        this.avatar = avatar;
        return this;
    }
    public String getAvatar() {
        return this.avatar;
    }

    public UpdateOuterAccountRequest setExt(String ext) {
        this.ext = ext;
        return this;
    }
    public String getExt() {
        return this.ext;
    }

    public UpdateOuterAccountRequest setOuterAccountId(String outerAccountId) {
        this.outerAccountId = outerAccountId;
        return this;
    }
    public String getOuterAccountId() {
        return this.outerAccountId;
    }

    public UpdateOuterAccountRequest setOuterAccountName(String outerAccountName) {
        this.outerAccountName = outerAccountName;
        return this;
    }
    public String getOuterAccountName() {
        return this.outerAccountName;
    }

    public UpdateOuterAccountRequest setOuterAccountType(String outerAccountType) {
        this.outerAccountType = outerAccountType;
        return this;
    }
    public String getOuterAccountType() {
        return this.outerAccountType;
    }

    public UpdateOuterAccountRequest setOuterDepartmentId(String outerDepartmentId) {
        this.outerDepartmentId = outerDepartmentId;
        return this;
    }
    public String getOuterDepartmentId() {
        return this.outerDepartmentId;
    }

    public UpdateOuterAccountRequest setOuterDepartmentType(String outerDepartmentType) {
        this.outerDepartmentType = outerDepartmentType;
        return this;
    }
    public String getOuterDepartmentType() {
        return this.outerDepartmentType;
    }

    public UpdateOuterAccountRequest setOuterGroupIds(String outerGroupIds) {
        this.outerGroupIds = outerGroupIds;
        return this;
    }
    public String getOuterGroupIds() {
        return this.outerGroupIds;
    }

    public UpdateOuterAccountRequest setOuterGroupType(String outerGroupType) {
        this.outerGroupType = outerGroupType;
        return this;
    }
    public String getOuterGroupType() {
        return this.outerGroupType;
    }

    public UpdateOuterAccountRequest setRealName(String realName) {
        this.realName = realName;
        return this;
    }
    public String getRealName() {
        return this.realName;
    }

}
