// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class ListCommonCateFirstFloorRequest extends TeaModel {
    @NameInMap("Type")
    public String type;

    public static ListCommonCateFirstFloorRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCommonCateFirstFloorRequest self = new ListCommonCateFirstFloorRequest();
        return TeaModel.build(map, self);
    }

    public ListCommonCateFirstFloorRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
