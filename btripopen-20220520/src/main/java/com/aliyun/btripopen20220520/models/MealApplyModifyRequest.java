// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class MealApplyModifyRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("apply_user")
    public MealApplyModifyRequestApplyUser applyUser;

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
    public java.util.List<MealApplyModifyRequestItineraryList> itineraryList;

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

    public static MealApplyModifyRequest build(java.util.Map<String, ?> map) throws Exception {
        MealApplyModifyRequest self = new MealApplyModifyRequest();
        return TeaModel.build(map, self);
    }

    public MealApplyModifyRequest setApplyUser(MealApplyModifyRequestApplyUser applyUser) {
        this.applyUser = applyUser;
        return this;
    }
    public MealApplyModifyRequestApplyUser getApplyUser() {
        return this.applyUser;
    }

    public MealApplyModifyRequest setCostCenterId(Long costCenterId) {
        this.costCenterId = costCenterId;
        return this;
    }
    public Long getCostCenterId() {
        return this.costCenterId;
    }

    public MealApplyModifyRequest setExtendField(String extendField) {
        this.extendField = extendField;
        return this;
    }
    public String getExtendField() {
        return this.extendField;
    }

    public MealApplyModifyRequest setInvoiceId(Long invoiceId) {
        this.invoiceId = invoiceId;
        return this;
    }
    public Long getInvoiceId() {
        return this.invoiceId;
    }

    public MealApplyModifyRequest setItineraryList(java.util.List<MealApplyModifyRequestItineraryList> itineraryList) {
        this.itineraryList = itineraryList;
        return this;
    }
    public java.util.List<MealApplyModifyRequestItineraryList> getItineraryList() {
        return this.itineraryList;
    }

    public MealApplyModifyRequest setMealAmount(Long mealAmount) {
        this.mealAmount = mealAmount;
        return this;
    }
    public Long getMealAmount() {
        return this.mealAmount;
    }

    public MealApplyModifyRequest setMealCause(String mealCause) {
        this.mealCause = mealCause;
        return this;
    }
    public String getMealCause() {
        return this.mealCause;
    }

    public MealApplyModifyRequest setProjectCode(String projectCode) {
        this.projectCode = projectCode;
        return this;
    }
    public String getProjectCode() {
        return this.projectCode;
    }

    public MealApplyModifyRequest setProjectTitle(String projectTitle) {
        this.projectTitle = projectTitle;
        return this;
    }
    public String getProjectTitle() {
        return this.projectTitle;
    }

    public MealApplyModifyRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public MealApplyModifyRequest setThirdPartApplyId(String thirdPartApplyId) {
        this.thirdPartApplyId = thirdPartApplyId;
        return this;
    }
    public String getThirdPartApplyId() {
        return this.thirdPartApplyId;
    }

    public MealApplyModifyRequest setThirdPartCostCenterId(String thirdPartCostCenterId) {
        this.thirdPartCostCenterId = thirdPartCostCenterId;
        return this;
    }
    public String getThirdPartCostCenterId() {
        return this.thirdPartCostCenterId;
    }

    public MealApplyModifyRequest setThirdPartInvoiceId(String thirdPartInvoiceId) {
        this.thirdPartInvoiceId = thirdPartInvoiceId;
        return this;
    }
    public String getThirdPartInvoiceId() {
        return this.thirdPartInvoiceId;
    }

    public static class MealApplyModifyRequestApplyUser extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>userId1</p>
         */
        @NameInMap("user_id")
        public String userId;

        public static MealApplyModifyRequestApplyUser build(java.util.Map<String, ?> map) throws Exception {
            MealApplyModifyRequestApplyUser self = new MealApplyModifyRequestApplyUser();
            return TeaModel.build(map, self);
        }

        public MealApplyModifyRequestApplyUser setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class MealApplyModifyRequestItineraryListCities extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>330702</p>
         */
        @NameInMap("city_code")
        public String cityCode;

        /**
         * <strong>example:</strong>
         * <p>杭州</p>
         */
        @NameInMap("city_name")
        public String cityName;

        public static MealApplyModifyRequestItineraryListCities build(java.util.Map<String, ?> map) throws Exception {
            MealApplyModifyRequestItineraryListCities self = new MealApplyModifyRequestItineraryListCities();
            return TeaModel.build(map, self);
        }

        public MealApplyModifyRequestItineraryListCities setCityCode(String cityCode) {
            this.cityCode = cityCode;
            return this;
        }
        public String getCityCode() {
            return this.cityCode;
        }

        public MealApplyModifyRequestItineraryListCities setCityName(String cityName) {
            this.cityName = cityName;
            return this;
        }
        public String getCityName() {
            return this.cityName;
        }

    }

    public static class MealApplyModifyRequestItineraryList extends TeaModel {
        @NameInMap("cities")
        public java.util.List<MealApplyModifyRequestItineraryListCities> cities;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-02-05 00:00:00</p>
         */
        @NameInMap("end_date")
        public String endDate;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-02-05 00:00:00</p>
         */
        @NameInMap("start_date")
        public String startDate;

        /**
         * <strong>example:</strong>
         * <p>2134</p>
         */
        @NameInMap("thirdpart_itinerary_id")
        public String thirdpartItineraryId;

        public static MealApplyModifyRequestItineraryList build(java.util.Map<String, ?> map) throws Exception {
            MealApplyModifyRequestItineraryList self = new MealApplyModifyRequestItineraryList();
            return TeaModel.build(map, self);
        }

        public MealApplyModifyRequestItineraryList setCities(java.util.List<MealApplyModifyRequestItineraryListCities> cities) {
            this.cities = cities;
            return this;
        }
        public java.util.List<MealApplyModifyRequestItineraryListCities> getCities() {
            return this.cities;
        }

        public MealApplyModifyRequestItineraryList setEndDate(String endDate) {
            this.endDate = endDate;
            return this;
        }
        public String getEndDate() {
            return this.endDate;
        }

        public MealApplyModifyRequestItineraryList setStartDate(String startDate) {
            this.startDate = startDate;
            return this;
        }
        public String getStartDate() {
            return this.startDate;
        }

        public MealApplyModifyRequestItineraryList setThirdpartItineraryId(String thirdpartItineraryId) {
            this.thirdpartItineraryId = thirdpartItineraryId;
            return this;
        }
        public String getThirdpartItineraryId() {
            return this.thirdpartItineraryId;
        }

    }

}
