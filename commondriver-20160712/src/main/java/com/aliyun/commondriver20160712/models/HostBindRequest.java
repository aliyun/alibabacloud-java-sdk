// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.commondriver20160712.models;

import com.aliyun.tea.*;

public class HostBindRequest extends TeaModel {
    @NameInMap("Param")
    public String param;

    public static HostBindRequest build(java.util.Map<String, ?> map) throws Exception {
        HostBindRequest self = new HostBindRequest();
        return TeaModel.build(map, self);
    }

    public HostBindRequest setParam(String param) {
        this.param = param;
        return this;
    }
    public String getParam() {
        return this.param;
    }

}
