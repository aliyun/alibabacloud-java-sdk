// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class MobileRecycledMetaVerifyRequest extends TeaModel {
    /**
     * <p>The phone number. Valid values:</p>
     * <ul>
     * <li>If ParamType is set to normal, pass in the phone number in plaintext.</li>
     * <li>If ParamType is set to md5, pass in the MD5-encrypted phone number.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>明文：186****2055</p>
     * <p>密文：</p>
     * <p>849169cd3b20621c1c78bd61a11a4fc2</p>
     */
    @NameInMap("Mobile")
    public String mobile;

    /**
     * <p>The encryption method. Valid values:</p>
     * <ul>
     * <li>normal: plaintext without encryption</li>
     * <li>md5: MD5 encryption.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>normal</p>
     */
    @NameInMap("ParamType")
    public String paramType;

    /**
     * <p>The registration date in the format YYYYMMDD. For example, 19800101 indicates January 1, 1980.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>20200505</p>
     */
    @NameInMap("RegisterDate")
    public String registerDate;

    public static MobileRecycledMetaVerifyRequest build(java.util.Map<String, ?> map) throws Exception {
        MobileRecycledMetaVerifyRequest self = new MobileRecycledMetaVerifyRequest();
        return TeaModel.build(map, self);
    }

    public MobileRecycledMetaVerifyRequest setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }
    public String getMobile() {
        return this.mobile;
    }

    public MobileRecycledMetaVerifyRequest setParamType(String paramType) {
        this.paramType = paramType;
        return this;
    }
    public String getParamType() {
        return this.paramType;
    }

    public MobileRecycledMetaVerifyRequest setRegisterDate(String registerDate) {
        this.registerDate = registerDate;
        return this;
    }
    public String getRegisterDate() {
        return this.registerDate;
    }

}
