// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class MobileOnlineStatusRequest extends TeaModel {
    /**
     * <p>Mobile number:</p>
     * <ul>
     * <li>When <code>paramType</code> is <code>normal</code>: provide the plaintext mobile number.</li>
     * <li>When <code>paramType</code> is <code>md5</code>: provide the encrypted mobile number.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>13665148158</p>
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
