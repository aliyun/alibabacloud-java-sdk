// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class MealApplyQueryRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1234</p>
     */
    @NameInMap("third_part_apply_id")
    public String thirdPartApplyId;

    public static MealApplyQueryRequest build(java.util.Map<String, ?> map) throws Exception {
        MealApplyQueryRequest self = new MealApplyQueryRequest();
        return TeaModel.build(map, self);
    }

    public MealApplyQueryRequest setThirdPartApplyId(String thirdPartApplyId) {
        this.thirdPartApplyId = thirdPartApplyId;
        return this;
    }
    public String getThirdPartApplyId() {
        return this.thirdPartApplyId;
    }

}
