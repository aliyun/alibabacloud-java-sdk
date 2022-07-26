// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class CommonApplyQueryRequest extends TeaModel {
    @NameInMap("apply_id")
    public Long applyId;

    @NameInMap("biz_category")
    public Integer bizCategory;

    @NameInMap("corp_id")
    public String corpId;

    @NameInMap("user_id")
    public String userId;

    public static CommonApplyQueryRequest build(java.util.Map<String, ?> map) throws Exception {
        CommonApplyQueryRequest self = new CommonApplyQueryRequest();
        return TeaModel.build(map, self);
    }

    public CommonApplyQueryRequest setApplyId(Long applyId) {
        this.applyId = applyId;
        return this;
    }
    public Long getApplyId() {
        return this.applyId;
    }

    public CommonApplyQueryRequest setBizCategory(Integer bizCategory) {
        this.bizCategory = bizCategory;
        return this;
    }
    public Integer getBizCategory() {
        return this.bizCategory;
    }

    public CommonApplyQueryRequest setCorpId(String corpId) {
        this.corpId = corpId;
        return this;
    }
    public String getCorpId() {
        return this.corpId;
    }

    public CommonApplyQueryRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
