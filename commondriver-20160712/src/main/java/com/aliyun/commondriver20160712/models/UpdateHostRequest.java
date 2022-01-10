// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.commondriver20160712.models;

import com.aliyun.tea.*;

public class UpdateHostRequest extends TeaModel {
    @NameInMap("Param")
    public String param;

    public static UpdateHostRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateHostRequest self = new UpdateHostRequest();
        return TeaModel.build(map, self);
    }

    public UpdateHostRequest setParam(String param) {
        this.param = param;
        return this;
    }
    public String getParam() {
        return this.param;
    }

}
