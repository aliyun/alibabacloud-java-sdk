// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class DepartmentSaveShrinkRequest extends TeaModel {
    @NameInMap("depart_list")
    public String departListShrink;

    public static DepartmentSaveShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DepartmentSaveShrinkRequest self = new DepartmentSaveShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DepartmentSaveShrinkRequest setDepartListShrink(String departListShrink) {
        this.departListShrink = departListShrink;
        return this;
    }
    public String getDepartListShrink() {
        return this.departListShrink;
    }

}
