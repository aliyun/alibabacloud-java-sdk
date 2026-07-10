// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class Mobile2MetaVerifyRequest extends TeaModel {
    /**
     * <p>The mobile phone number. Valid values:</p>
     * <ul>
     * <li>If ParamType is set to normal, pass in the mobile phone number in plaintext.</li>
     * <li>If ParamType is set to md5, pass in the MD5-encrypted mobile phone number.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>● 明文：186****2055
     * ● 密文：
     * 849169cd3b20621c1c78bd61a11a4fc2</p>
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
     * <p>The name. Valid values:</p>
     * <ul>
     * <li>If ParamType is set to normal, pass in the name in plaintext.</li>
     * <li>If ParamType is set to md5, pass in the MD5-encrypted name.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>● 明文：张三
     * ● 密文：
     * 32fa7bcd874161bea8ec8fd98f390ec9</p>
     */
    @NameInMap("UserName")
    public String userName;

    public static Mobile2MetaVerifyRequest build(java.util.Map<String, ?> map) throws Exception {
        Mobile2MetaVerifyRequest self = new Mobile2MetaVerifyRequest();
        return TeaModel.build(map, self);
    }

    public Mobile2MetaVerifyRequest setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }
    public String getMobile() {
        return this.mobile;
    }

    public Mobile2MetaVerifyRequest setParamType(String paramType) {
        this.paramType = paramType;
        return this;
    }
    public String getParamType() {
        return this.paramType;
    }

    public Mobile2MetaVerifyRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

}
