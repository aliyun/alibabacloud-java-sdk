// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class ListCommonCateSecondFloorRequest extends TeaModel {
    @NameInMap("ParentCateId")
    public Long parentCateId;

    public static ListCommonCateSecondFloorRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCommonCateSecondFloorRequest self = new ListCommonCateSecondFloorRequest();
        return TeaModel.build(map, self);
    }

    public ListCommonCateSecondFloorRequest setParentCateId(Long parentCateId) {
        this.parentCateId = parentCateId;
        return this;
    }
    public Long getParentCateId() {
        return this.parentCateId;
    }

}
