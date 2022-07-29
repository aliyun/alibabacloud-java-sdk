// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class ListCateInfoRequest extends TeaModel {
    @NameInMap("Type")
    public String type;

    public static ListCateInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCateInfoRequest self = new ListCateInfoRequest();
        return TeaModel.build(map, self);
    }

    public ListCateInfoRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
