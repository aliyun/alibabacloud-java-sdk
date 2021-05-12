// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class UpdateComponentToProductRequest extends TeaModel {
    // the component Version ID
    @NameInMap("componentVersionID")
    public String componentVersionID;

    public static UpdateComponentToProductRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateComponentToProductRequest self = new UpdateComponentToProductRequest();
        return TeaModel.build(map, self);
    }

    public UpdateComponentToProductRequest setComponentVersionID(String componentVersionID) {
        this.componentVersionID = componentVersionID;
        return this;
    }
    public String getComponentVersionID() {
        return this.componentVersionID;
    }

}
