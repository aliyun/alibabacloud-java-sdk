// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class AddCrossAccountRequest extends TeaModel {
    /**
     * <p>The alias. The maximum length is 32 characters. This parameter is not required for cross-account backups that are configured based on a resource directory.</p>
     * 
     * <strong>example:</strong>
     * <p>Source account 1</p>
     */
    @NameInMap("Alias")
    public String alias;

    /**
     * <p>The name of the RAM role for the account to back up. This parameter is used when you configure a cross-account backup by assuming a RAM role.</p>
     * 
     * <strong>example:</strong>
     * <p>hbrcrossrole</p>
     */
    @NameInMap("CrossAccountRoleName")
    public String crossAccountRoleName;

    /**
     * <p>The type of cross-account backup. Valid values:</p>
     * <ul>
     * <li><p><strong>CROSS_ACCOUNT</strong>: Configures a cross-account backup by assuming a RAM role.</p>
     * </li>
     * <li><p><strong>CROSS_ACCOUNT_BY_RD</strong>: Configures a cross-account backup based on a resource directory.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>CROSS_ACCOUNT</p>
     */
    @NameInMap("CrossAccountType")
    public String crossAccountType;

    /**
     * <p>The UID of the account to back up.</p>
     * 
     * <strong>example:</strong>
     * <p>1589753xxxxxx625</p>
     */
    @NameInMap("CrossAccountUserId")
    public Long crossAccountUserId;

    public static AddCrossAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        AddCrossAccountRequest self = new AddCrossAccountRequest();
        return TeaModel.build(map, self);
    }

    public AddCrossAccountRequest setAlias(String alias) {
        this.alias = alias;
        return this;
    }
    public String getAlias() {
        return this.alias;
    }

    public AddCrossAccountRequest setCrossAccountRoleName(String crossAccountRoleName) {
        this.crossAccountRoleName = crossAccountRoleName;
        return this;
    }
    public String getCrossAccountRoleName() {
        return this.crossAccountRoleName;
    }

    public AddCrossAccountRequest setCrossAccountType(String crossAccountType) {
        this.crossAccountType = crossAccountType;
        return this;
    }
    public String getCrossAccountType() {
        return this.crossAccountType;
    }

    public AddCrossAccountRequest setCrossAccountUserId(Long crossAccountUserId) {
        this.crossAccountUserId = crossAccountUserId;
        return this;
    }
    public Long getCrossAccountUserId() {
        return this.crossAccountUserId;
    }

}
