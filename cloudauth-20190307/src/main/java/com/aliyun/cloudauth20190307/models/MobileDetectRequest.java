// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class MobileDetectRequest extends TeaModel {
    /**
     * <p>List of phone numbers.</p>
     * 
     * <strong>example:</strong>
     * <p>19833232569</p>
     */
    @NameInMap("Mobiles")
    public String mobiles;

    /**
     * <p>Encryption method:</p>
     * <ul>
     * <li>normal: plaintext, no encryption</li>
     * <li>md5: MD5 encryption</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>normal</p>
     */
    @NameInMap("ParamType")
    public String paramType;

    public static MobileDetectRequest build(java.util.Map<String, ?> map) throws Exception {
        MobileDetectRequest self = new MobileDetectRequest();
        return TeaModel.build(map, self);
    }

    public MobileDetectRequest setMobiles(String mobiles) {
        this.mobiles = mobiles;
        return this;
    }
    public String getMobiles() {
        return this.mobiles;
    }

    public MobileDetectRequest setParamType(String paramType) {
        this.paramType = paramType;
        return this;
    }
    public String getParamType() {
        return this.paramType;
    }

}
