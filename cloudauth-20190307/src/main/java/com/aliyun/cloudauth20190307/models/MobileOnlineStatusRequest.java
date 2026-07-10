// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class MobileOnlineStatusRequest extends TeaModel {
    /**
     * <p>The phone number. Valid values:</p>
     * <ul>
     * <li>If paramType is set to normal, pass in the phone number in plaintext.</li>
     * <li>If paramType is set to md5, pass in the MD5-encrypted phone number.</li>
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
     * <li>normal: not encrypted.</li>
     * <li>md5: MD5-encrypted.</li>
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
