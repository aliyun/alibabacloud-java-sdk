// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class ModifyBizCategoryRequest extends TeaModel {
    @NameInMap("ParamList")
    public String paramList;

    @NameInMap("UserId")
    public Long userId;

    public static ModifyBizCategoryRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyBizCategoryRequest self = new ModifyBizCategoryRequest();
        return TeaModel.build(map, self);
    }

    public ModifyBizCategoryRequest setParamList(String paramList) {
        this.paramList = paramList;
        return this;
    }
    public String getParamList() {
        return this.paramList;
    }

    public ModifyBizCategoryRequest setUserId(Long userId) {
        this.userId = userId;
        return this;
    }
    public Long getUserId() {
        return this.userId;
    }

}
