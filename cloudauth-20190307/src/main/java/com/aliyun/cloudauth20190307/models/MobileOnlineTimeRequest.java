// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class MobileOnlineTimeRequest extends TeaModel {
    /**
     * <p>The mobile phone number.</p>
     * <ul>
     * <li>If paramType is set to normal, enter the mobile phone number in plaintext.</li>
     * <li>If paramType is set to md5, enter the mobile phone number in ciphertext.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Plaintext: 186****2055</p>
     * <p>Ciphertext:</p>
     * <p>849169cd3b20621c1c78bd61a11a4fc2</p>
     */
    @NameInMap("Mobile")
    public String mobile;

    /**
     * <p>The parameter type. Valid values:</p>
     * <ul>
     * <li>normal: Not encrypted.</li>
     * <li>md5: MD5 encrypted.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>normal</p>
     */
    @NameInMap("ParamType")
    public String paramType;

    public static MobileOnlineTimeRequest build(java.util.Map<String, ?> map) throws Exception {
        MobileOnlineTimeRequest self = new MobileOnlineTimeRequest();
        return TeaModel.build(map, self);
    }

    public MobileOnlineTimeRequest setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }
    public String getMobile() {
        return this.mobile;
    }

    public MobileOnlineTimeRequest setParamType(String paramType) {
        this.paramType = paramType;
        return this;
    }
    public String getParamType() {
        return this.paramType;
    }

}
