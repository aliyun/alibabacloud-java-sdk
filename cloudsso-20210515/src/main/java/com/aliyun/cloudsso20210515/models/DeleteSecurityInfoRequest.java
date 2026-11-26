// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class DeleteSecurityInfoRequest extends TeaModel {
    /**
     * <p>The directory ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>d-00fc2p61****</p>
     */
    @NameInMap("DirectoryId")
    public String directoryId;

    /**
     * <p>The user ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>u-00q8wbq42wiltcrk****</p>
     */
    @NameInMap("UserId")
    public String userId;

    /**
     * <p>The verification type of the security information. Valid values:</p>
     * <ul>
     * <li>SecurityEmail: security email address.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>SecurityEmail</p>
     */
    @NameInMap("VerifyType")
    public String verifyType;

    public static DeleteSecurityInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteSecurityInfoRequest self = new DeleteSecurityInfoRequest();
        return TeaModel.build(map, self);
    }

    public DeleteSecurityInfoRequest setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

    public DeleteSecurityInfoRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public DeleteSecurityInfoRequest setVerifyType(String verifyType) {
        this.verifyType = verifyType;
        return this;
    }
    public String getVerifyType() {
        return this.verifyType;
    }

}
