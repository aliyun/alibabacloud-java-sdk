// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class MobileOnlineTimeRequest extends TeaModel {
    /**
     * <p>Mobile number:</p>
     * <ul>
     * <li>When <code>paramType</code> is <code>normal</code>: provide the plaintext mobile number.</li>
     * <li>When <code>paramType</code> is <code>md5</code>: provide the encrypted mobile number.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>明文：186****2055</p>
     * <p>密文：</p>
     * <p>849169cd3b20621c1c78bd61a11a4fc2</p>
     */
    @NameInMap("Mobile")
    public String mobile;

    /**
     * <p>Parameter type:</p>
     * <ul>
     * <li>normal: unencrypted.</li>
     * <li>md5: md5 encrypted.</li>
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
