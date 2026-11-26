// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class SetSecurityInfoRequest extends TeaModel {
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
     * <p>The security email address of the user.</p>
     * <p>The value can be up to 64 characters in length, must conform to the standard email format, and cannot contain whitespace characters. The security email address of each user in the same directory must be unique. The uniqueness check is case-insensitive, but the original case is preserved when the address is saved.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="mailto:Alice@example.com">Alice@example.com</a></p>
     */
    @NameInMap("SecurityEmail")
    public String securityEmail;

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
     * <li>SecurityEmail: security email address.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>SecurityEmail</p>
     */
    @NameInMap("VerifyType")
    public String verifyType;

    public static SetSecurityInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        SetSecurityInfoRequest self = new SetSecurityInfoRequest();
        return TeaModel.build(map, self);
    }

    public SetSecurityInfoRequest setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

    public SetSecurityInfoRequest setSecurityEmail(String securityEmail) {
        this.securityEmail = securityEmail;
        return this;
    }
    public String getSecurityEmail() {
        return this.securityEmail;
    }

    public SetSecurityInfoRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public SetSecurityInfoRequest setVerifyType(String verifyType) {
        this.verifyType = verifyType;
        return this;
    }
    public String getVerifyType() {
        return this.verifyType;
    }

}
