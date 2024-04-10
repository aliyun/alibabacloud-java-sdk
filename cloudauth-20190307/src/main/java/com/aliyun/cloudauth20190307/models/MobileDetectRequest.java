// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class MobileDetectRequest extends TeaModel {
    @NameInMap("Mobiles")
    public String mobiles;

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
