// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class CheckAuthCodeBindForExtShrinkRequest extends TeaModel {
    /**
     * <p>The authCode obtained by specifying a user ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Aexfgc</p>
     */
    @NameInMap("AuthCode")
    public String authCode;

    /**
     * <p>The value corresponding to the encoding type. Enter the Project ID of the project containing the ProductKey of this product in the Tmall Genie AI platform.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("EncodeKey")
    public String encodeKey;

    /**
     * <p>Encoding type. Enter PROJECT_ID here.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>PROJECT_ID</p>
     */
    @NameInMap("EncodeType")
    public String encodeType;

    /**
     * <p>List of user identifier information.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("UserInfo")
    public String userInfoShrink;

    public static CheckAuthCodeBindForExtShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckAuthCodeBindForExtShrinkRequest self = new CheckAuthCodeBindForExtShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CheckAuthCodeBindForExtShrinkRequest setAuthCode(String authCode) {
        this.authCode = authCode;
        return this;
    }
    public String getAuthCode() {
        return this.authCode;
    }

    public CheckAuthCodeBindForExtShrinkRequest setEncodeKey(String encodeKey) {
        this.encodeKey = encodeKey;
        return this;
    }
    public String getEncodeKey() {
        return this.encodeKey;
    }

    public CheckAuthCodeBindForExtShrinkRequest setEncodeType(String encodeType) {
        this.encodeType = encodeType;
        return this;
    }
    public String getEncodeType() {
        return this.encodeType;
    }

    public CheckAuthCodeBindForExtShrinkRequest setUserInfoShrink(String userInfoShrink) {
        this.userInfoShrink = userInfoShrink;
        return this;
    }
    public String getUserInfoShrink() {
        return this.userInfoShrink;
    }

}
