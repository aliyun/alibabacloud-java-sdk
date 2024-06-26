// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class GetOssPropertiesRequest extends TeaModel {
    @NameInMap("Bizid")
    public String bizid;

    public static GetOssPropertiesRequest build(java.util.Map<String, ?> map) throws Exception {
        GetOssPropertiesRequest self = new GetOssPropertiesRequest();
        return TeaModel.build(map, self);
    }

    public GetOssPropertiesRequest setBizid(String bizid) {
        this.bizid = bizid;
        return this;
    }
    public String getBizid() {
        return this.bizid;
    }

}
