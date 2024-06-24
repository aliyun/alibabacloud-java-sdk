// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class CommonApplyQueryRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1003366164</p>
     */
    @NameInMap("apply_id")
    public Long applyId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("biz_category")
    public Integer bizCategory;

    @NameInMap("business_instance_id")
    public String businessInstanceId;

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

    public CommonApplyQueryRequest setBusinessInstanceId(String businessInstanceId) {
        this.businessInstanceId = businessInstanceId;
        return this;
    }
    public String getBusinessInstanceId() {
        return this.businessInstanceId;
    }

    public CommonApplyQueryRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
