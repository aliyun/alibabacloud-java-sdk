// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class MobileOnlineTimeRequest extends TeaModel {
    @NameInMap("Mobile")
    public String mobile;

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
