// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class MealApplyAddShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("apply_user")
    public String applyUserShrink;

    /**
     * <strong>example:</strong>
     * <p>23</p>
     */
    @NameInMap("cost_center_id")
    public Long costCenterId;

    /**
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("invoice_id")
    public Long invoiceId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("itinerary_list")
    public String itineraryListShrink;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("meal_amount")
    public Long mealAmount;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("meal_cause")
    public String mealCause;

    /**
     * <strong>example:</strong>
     * <p>project123</p>
     */
    @NameInMap("project_code")
    public String projectCode;

    @NameInMap("project_title")
    public String projectTitle;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("status")
    public Integer status;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1234</p>
     */
    @NameInMap("third_part_apply_id")
    public String thirdPartApplyId;

    /**
     * <strong>example:</strong>
     * <p>1200F00010</p>
     */
    @NameInMap("third_part_cost_center_id")
    public String thirdPartCostCenterId;

    /**
     * <strong>example:</strong>
     * <p>GA15131</p>
     */
    @NameInMap("third_part_invoice_id")
    public String thirdPartInvoiceId;

    public static MealApplyAddShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        MealApplyAddShrinkRequest self = new MealApplyAddShrinkRequest();
        return TeaModel.build(map, self);
    }

    public MealApplyAddShrinkRequest setApplyUserShrink(String applyUserShrink) {
        this.applyUserShrink = applyUserShrink;
        return this;
    }
    public String getApplyUserShrink() {
        return this.applyUserShrink;
    }

    public MealApplyAddShrinkRequest setCostCenterId(Long costCenterId) {
        this.costCenterId = costCenterId;
        return this;
    }
    public Long getCostCenterId() {
        return this.costCenterId;
    }

    public MealApplyAddShrinkRequest setInvoiceId(Long invoiceId) {
        this.invoiceId = invoiceId;
        return this;
    }
    public Long getInvoiceId() {
        return this.invoiceId;
    }

    public MealApplyAddShrinkRequest setItineraryListShrink(String itineraryListShrink) {
        this.itineraryListShrink = itineraryListShrink;
        return this;
    }
    public String getItineraryListShrink() {
        return this.itineraryListShrink;
    }

    public MealApplyAddShrinkRequest setMealAmount(Long mealAmount) {
        this.mealAmount = mealAmount;
        return this;
    }
    public Long getMealAmount() {
        return this.mealAmount;
    }

    public MealApplyAddShrinkRequest setMealCause(String mealCause) {
        this.mealCause = mealCause;
        return this;
    }
    public String getMealCause() {
        return this.mealCause;
    }

    public MealApplyAddShrinkRequest setProjectCode(String projectCode) {
        this.projectCode = projectCode;
        return this;
    }
    public String getProjectCode() {
        return this.projectCode;
    }

    public MealApplyAddShrinkRequest setProjectTitle(String projectTitle) {
        this.projectTitle = projectTitle;
        return this;
    }
    public String getProjectTitle() {
        return this.projectTitle;
    }

    public MealApplyAddShrinkRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public MealApplyAddShrinkRequest setThirdPartApplyId(String thirdPartApplyId) {
        this.thirdPartApplyId = thirdPartApplyId;
        return this;
    }
    public String getThirdPartApplyId() {
        return this.thirdPartApplyId;
    }

    public MealApplyAddShrinkRequest setThirdPartCostCenterId(String thirdPartCostCenterId) {
        this.thirdPartCostCenterId = thirdPartCostCenterId;
        return this;
    }
    public String getThirdPartCostCenterId() {
        return this.thirdPartCostCenterId;
    }

    public MealApplyAddShrinkRequest setThirdPartInvoiceId(String thirdPartInvoiceId) {
        this.thirdPartInvoiceId = thirdPartInvoiceId;
        return this;
    }
    public String getThirdPartInvoiceId() {
        return this.thirdPartInvoiceId;
    }

}
