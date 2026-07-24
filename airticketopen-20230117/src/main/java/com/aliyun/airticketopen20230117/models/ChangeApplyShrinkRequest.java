// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class ChangeApplyShrinkRequest extends TeaModel {
    /**
     * <p>The list of passengers for the change.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("change_passenger_list")
    public String changePassengerListShrink;

    /**
     * <p>The target journey for the change.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("changed_journeys")
    public String changedJourneysShrink;

    /**
     * <p>The contact information for the change.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("contact")
    public String contactShrink;

    /**
     * <p>The order number.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>4988430***950</p>
     */
    @NameInMap("order_num")
    public Long orderNum;

    /**
     * <p>The buyer remarks.</p>
     * 
     * <strong>example:</strong>
     * <p>remark desc</p>
     */
    @NameInMap("remark")
    public String remark;

    /**
     * <p>The change type. Valid values:</p>
     * <ul>
     * <li>0: voluntary change</li>
     * <li>1: flight schedule change or flight cancellation.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("type")
    public Integer type;

    public static ChangeApplyShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ChangeApplyShrinkRequest self = new ChangeApplyShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ChangeApplyShrinkRequest setChangePassengerListShrink(String changePassengerListShrink) {
        this.changePassengerListShrink = changePassengerListShrink;
        return this;
    }
    public String getChangePassengerListShrink() {
        return this.changePassengerListShrink;
    }

    public ChangeApplyShrinkRequest setChangedJourneysShrink(String changedJourneysShrink) {
        this.changedJourneysShrink = changedJourneysShrink;
        return this;
    }
    public String getChangedJourneysShrink() {
        return this.changedJourneysShrink;
    }

    public ChangeApplyShrinkRequest setContactShrink(String contactShrink) {
        this.contactShrink = contactShrink;
        return this;
    }
    public String getContactShrink() {
        return this.contactShrink;
    }

    public ChangeApplyShrinkRequest setOrderNum(Long orderNum) {
        this.orderNum = orderNum;
        return this;
    }
    public Long getOrderNum() {
        return this.orderNum;
    }

    public ChangeApplyShrinkRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public ChangeApplyShrinkRequest setType(Integer type) {
        this.type = type;
        return this;
    }
    public Integer getType() {
        return this.type;
    }

}
