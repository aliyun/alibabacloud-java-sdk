// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class ExceedApplySyncRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>823744</p>
     */
    @NameInMap("apply_id")
    public Long applyId;

    /**
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("biz_category")
    public Integer bizCategory;

    @NameInMap("remark")
    public String remark;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("status")
    public Integer status;

    /**
     * <strong>example:</strong>
     * <p>123421</p>
     */
    @NameInMap("thirdparty_flow_id")
    public String thirdpartyFlowId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>open5145141</p>
     */
    @NameInMap("user_id")
    public String userId;

    public static ExceedApplySyncRequest build(java.util.Map<String, ?> map) throws Exception {
        ExceedApplySyncRequest self = new ExceedApplySyncRequest();
        return TeaModel.build(map, self);
    }

    public ExceedApplySyncRequest setApplyId(Long applyId) {
        this.applyId = applyId;
        return this;
    }
    public Long getApplyId() {
        return this.applyId;
    }

    public ExceedApplySyncRequest setBizCategory(Integer bizCategory) {
        this.bizCategory = bizCategory;
        return this;
    }
    public Integer getBizCategory() {
        return this.bizCategory;
    }

    public ExceedApplySyncRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public ExceedApplySyncRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public ExceedApplySyncRequest setThirdpartyFlowId(String thirdpartyFlowId) {
        this.thirdpartyFlowId = thirdpartyFlowId;
        return this;
    }
    public String getThirdpartyFlowId() {
        return this.thirdpartyFlowId;
    }

    public ExceedApplySyncRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
