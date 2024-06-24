// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class CarApplyModifyRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2022-07-12 16:12:53</p>
     */
    @NameInMap("operate_time")
    public String operateTime;

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
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>IRGS1413</p>
     */
    @NameInMap("third_part_apply_id")
    public String thirdPartApplyId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>open62141</p>
     */
    @NameInMap("user_id")
    public String userId;

    public static CarApplyModifyRequest build(java.util.Map<String, ?> map) throws Exception {
        CarApplyModifyRequest self = new CarApplyModifyRequest();
        return TeaModel.build(map, self);
    }

    public CarApplyModifyRequest setOperateTime(String operateTime) {
        this.operateTime = operateTime;
        return this;
    }
    public String getOperateTime() {
        return this.operateTime;
    }

    public CarApplyModifyRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public CarApplyModifyRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public CarApplyModifyRequest setThirdPartApplyId(String thirdPartApplyId) {
        this.thirdPartApplyId = thirdPartApplyId;
        return this;
    }
    public String getThirdPartApplyId() {
        return this.thirdPartApplyId;
    }

    public CarApplyModifyRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
