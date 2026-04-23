// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class CreateInventoryJobRequest extends TeaModel {
    @NameInMap("Param")
    public String param;

    public static CreateInventoryJobRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateInventoryJobRequest self = new CreateInventoryJobRequest();
        return TeaModel.build(map, self);
    }

    public CreateInventoryJobRequest setParam(String param) {
        this.param = param;
        return this;
    }
    public String getParam() {
        return this.param;
    }

}
