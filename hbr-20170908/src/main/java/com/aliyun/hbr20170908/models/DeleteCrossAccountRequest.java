// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class DeleteCrossAccountRequest extends TeaModel {
    /**
     * <p>The name of the RAM role of the account to back up. This parameter is required when you configure cross-account backup by assuming a RAM role.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>hbrcrossrole</p>
     */
    @NameInMap("CrossAccountRoleName")
    public String crossAccountRoleName;

    /**
     * <p>The type of cross-account backup. Valid values:</p>
     * <ul>
     * <li><p><strong>CROSS_ACCOUNT</strong>: Cross-account backup is configured by assuming a RAM role.</p>
     * </li>
     * <li><p><strong>CROSS_ACCOUNT_BY_RD</strong>: Cross-account backup is configured based on a resource directory.</p>
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
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1841xxxxx3649795</p>
     */
    @NameInMap("CrossAccountUserId")
    public Long crossAccountUserId;

    public static DeleteCrossAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteCrossAccountRequest self = new DeleteCrossAccountRequest();
        return TeaModel.build(map, self);
    }

    public DeleteCrossAccountRequest setCrossAccountRoleName(String crossAccountRoleName) {
        this.crossAccountRoleName = crossAccountRoleName;
        return this;
    }
    public String getCrossAccountRoleName() {
        return this.crossAccountRoleName;
    }

    public DeleteCrossAccountRequest setCrossAccountType(String crossAccountType) {
        this.crossAccountType = crossAccountType;
        return this;
    }
    public String getCrossAccountType() {
        return this.crossAccountType;
    }

    public DeleteCrossAccountRequest setCrossAccountUserId(Long crossAccountUserId) {
        this.crossAccountUserId = crossAccountUserId;
        return this;
    }
    public Long getCrossAccountUserId() {
        return this.crossAccountUserId;
    }

}
