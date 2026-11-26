// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class SendVerificationMessageRequest extends TeaModel {
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
     * <p>The verification type for the security information. Valid values:</p>
     * <ul>
     * <li>SecurityEmail: security email address</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>SecurityEmail</p>
     */
    @NameInMap("VerifyType")
    public String verifyType;

    public static SendVerificationMessageRequest build(java.util.Map<String, ?> map) throws Exception {
        SendVerificationMessageRequest self = new SendVerificationMessageRequest();
        return TeaModel.build(map, self);
    }

    public SendVerificationMessageRequest setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

    public SendVerificationMessageRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public SendVerificationMessageRequest setVerifyType(String verifyType) {
        this.verifyType = verifyType;
        return this;
    }
    public String getVerifyType() {
        return this.verifyType;
    }

}
