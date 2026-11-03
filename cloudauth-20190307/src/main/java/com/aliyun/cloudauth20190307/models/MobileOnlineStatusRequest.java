// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class MobileOnlineStatusRequest extends TeaModel {
    /**
     * <p>The mobile phone number.</p>
     * <ul>
     * <li>If paramType is set to normal, specify the plaintext mobile phone number.</li>
     * <li>If paramType is set to md5, specify the ciphertext mobile phone number.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>13665148158</p>
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

    public static MobileOnlineStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        MobileOnlineStatusRequest self = new MobileOnlineStatusRequest();
        return TeaModel.build(map, self);
    }

    public MobileOnlineStatusRequest setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }
    public String getMobile() {
        return this.mobile;
    }

    public MobileOnlineStatusRequest setParamType(String paramType) {
        this.paramType = paramType;
        return this;
    }
    public String getParamType() {
        return this.paramType;
    }

}
