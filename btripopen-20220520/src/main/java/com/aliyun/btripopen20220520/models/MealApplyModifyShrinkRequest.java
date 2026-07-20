// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class MealApplyModifyShrinkRequest extends TeaModel {
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
     * <p>{&quot;extend_key&quot;:&quot;extend_value&quot;}</p>
     */
    @NameInMap("extend_field")
    public String extendField;

    /**
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("invoice_id")
    public Long invoiceId;

    @NameInMap("itinerary_list")
    public String itineraryListShrink;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("meal_amount")
    public Long mealAmount;

    /**
     * <strong>example:</strong>
     * <p>测试</p>
     */
    @NameInMap("meal_cause")
    public String mealCause;

    /**
     * <strong>example:</strong>
     * <p>project123</p>
     */
    @NameInMap("project_code")
    public String projectCode;

    /**
     * <strong>example:</strong>
     * <p>项目1</p>
     */
    @NameInMap("project_title")
    public String projectTitle;

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

    public static MealApplyModifyShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        MealApplyModifyShrinkRequest self = new MealApplyModifyShrinkRequest();
        return TeaModel.build(map, self);
    }

    public MealApplyModifyShrinkRequest setApplyUserShrink(String applyUserShrink) {
        this.applyUserShrink = applyUserShrink;
        return this;
    }
    public String getApplyUserShrink() {
        return this.applyUserShrink;
    }

    public MealApplyModifyShrinkRequest setCostCenterId(Long costCenterId) {
        this.costCenterId = costCenterId;
        return this;
    }
    public Long getCostCenterId() {
        return this.costCenterId;
    }

    public MealApplyModifyShrinkRequest setExtendField(String extendField) {
        this.extendField = extendField;
        return this;
    }
    public String getExtendField() {
        return this.extendField;
    }

    public MealApplyModifyShrinkRequest setInvoiceId(Long invoiceId) {
        this.invoiceId = invoiceId;
        return this;
    }
    public Long getInvoiceId() {
        return this.invoiceId;
    }

    public MealApplyModifyShrinkRequest setItineraryListShrink(String itineraryListShrink) {
        this.itineraryListShrink = itineraryListShrink;
        return this;
    }
    public String getItineraryListShrink() {
        return this.itineraryListShrink;
    }

    public MealApplyModifyShrinkRequest setMealAmount(Long mealAmount) {
        this.mealAmount = mealAmount;
        return this;
    }
    public Long getMealAmount() {
        return this.mealAmount;
    }

    public MealApplyModifyShrinkRequest setMealCause(String mealCause) {
        this.mealCause = mealCause;
        return this;
    }
    public String getMealCause() {
        return this.mealCause;
    }

    public MealApplyModifyShrinkRequest setProjectCode(String projectCode) {
        this.projectCode = projectCode;
        return this;
    }
    public String getProjectCode() {
        return this.projectCode;
    }

    public MealApplyModifyShrinkRequest setProjectTitle(String projectTitle) {
        this.projectTitle = projectTitle;
        return this;
    }
    public String getProjectTitle() {
        return this.projectTitle;
    }

    public MealApplyModifyShrinkRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public MealApplyModifyShrinkRequest setThirdPartApplyId(String thirdPartApplyId) {
        this.thirdPartApplyId = thirdPartApplyId;
        return this;
    }
    public String getThirdPartApplyId() {
        return this.thirdPartApplyId;
    }

    public MealApplyModifyShrinkRequest setThirdPartCostCenterId(String thirdPartCostCenterId) {
        this.thirdPartCostCenterId = thirdPartCostCenterId;
        return this;
    }
    public String getThirdPartCostCenterId() {
        return this.thirdPartCostCenterId;
    }

    public MealApplyModifyShrinkRequest setThirdPartInvoiceId(String thirdPartInvoiceId) {
        this.thirdPartInvoiceId = thirdPartInvoiceId;
        return this;
    }
    public String getThirdPartInvoiceId() {
        return this.thirdPartInvoiceId;
    }

}
