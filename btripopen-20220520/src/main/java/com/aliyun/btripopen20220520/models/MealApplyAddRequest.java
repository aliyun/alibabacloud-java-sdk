// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class MealApplyAddRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("apply_user")
    public MealApplyAddRequestApplyUser applyUser;

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
    public java.util.List<MealApplyAddRequestItineraryList> itineraryList;

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

    public static MealApplyAddRequest build(java.util.Map<String, ?> map) throws Exception {
        MealApplyAddRequest self = new MealApplyAddRequest();
        return TeaModel.build(map, self);
    }

    public MealApplyAddRequest setApplyUser(MealApplyAddRequestApplyUser applyUser) {
        this.applyUser = applyUser;
        return this;
    }
    public MealApplyAddRequestApplyUser getApplyUser() {
        return this.applyUser;
    }

    public MealApplyAddRequest setCostCenterId(Long costCenterId) {
        this.costCenterId = costCenterId;
        return this;
    }
    public Long getCostCenterId() {
        return this.costCenterId;
    }

    public MealApplyAddRequest setInvoiceId(Long invoiceId) {
        this.invoiceId = invoiceId;
        return this;
    }
    public Long getInvoiceId() {
        return this.invoiceId;
    }

    public MealApplyAddRequest setItineraryList(java.util.List<MealApplyAddRequestItineraryList> itineraryList) {
        this.itineraryList = itineraryList;
        return this;
    }
    public java.util.List<MealApplyAddRequestItineraryList> getItineraryList() {
        return this.itineraryList;
    }

    public MealApplyAddRequest setMealAmount(Long mealAmount) {
        this.mealAmount = mealAmount;
        return this;
    }
    public Long getMealAmount() {
        return this.mealAmount;
    }

    public MealApplyAddRequest setMealCause(String mealCause) {
        this.mealCause = mealCause;
        return this;
    }
    public String getMealCause() {
        return this.mealCause;
    }

    public MealApplyAddRequest setProjectCode(String projectCode) {
        this.projectCode = projectCode;
        return this;
    }
    public String getProjectCode() {
        return this.projectCode;
    }

    public MealApplyAddRequest setProjectTitle(String projectTitle) {
        this.projectTitle = projectTitle;
        return this;
    }
    public String getProjectTitle() {
        return this.projectTitle;
    }

    public MealApplyAddRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public MealApplyAddRequest setThirdPartApplyId(String thirdPartApplyId) {
        this.thirdPartApplyId = thirdPartApplyId;
        return this;
    }
    public String getThirdPartApplyId() {
        return this.thirdPartApplyId;
    }

    public MealApplyAddRequest setThirdPartCostCenterId(String thirdPartCostCenterId) {
        this.thirdPartCostCenterId = thirdPartCostCenterId;
        return this;
    }
    public String getThirdPartCostCenterId() {
        return this.thirdPartCostCenterId;
    }

    public MealApplyAddRequest setThirdPartInvoiceId(String thirdPartInvoiceId) {
        this.thirdPartInvoiceId = thirdPartInvoiceId;
        return this;
    }
    public String getThirdPartInvoiceId() {
        return this.thirdPartInvoiceId;
    }

    public static class MealApplyAddRequestApplyUser extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>userId1</p>
         */
        @NameInMap("user_id")
        public String userId;

        public static MealApplyAddRequestApplyUser build(java.util.Map<String, ?> map) throws Exception {
            MealApplyAddRequestApplyUser self = new MealApplyAddRequestApplyUser();
            return TeaModel.build(map, self);
        }

        public MealApplyAddRequestApplyUser setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class MealApplyAddRequestItineraryListCities extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>330702</p>
         */
        @NameInMap("city_code")
        public String cityCode;

        @NameInMap("city_name")
        public String cityName;

        public static MealApplyAddRequestItineraryListCities build(java.util.Map<String, ?> map) throws Exception {
            MealApplyAddRequestItineraryListCities self = new MealApplyAddRequestItineraryListCities();
            return TeaModel.build(map, self);
        }

        public MealApplyAddRequestItineraryListCities setCityCode(String cityCode) {
            this.cityCode = cityCode;
            return this;
        }
        public String getCityCode() {
            return this.cityCode;
        }

        public MealApplyAddRequestItineraryListCities setCityName(String cityName) {
            this.cityName = cityName;
            return this;
        }
        public String getCityName() {
            return this.cityName;
        }

    }

    public static class MealApplyAddRequestItineraryList extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("cities")
        public java.util.List<MealApplyAddRequestItineraryListCities> cities;

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

        public static MealApplyAddRequestItineraryList build(java.util.Map<String, ?> map) throws Exception {
            MealApplyAddRequestItineraryList self = new MealApplyAddRequestItineraryList();
            return TeaModel.build(map, self);
        }

        public MealApplyAddRequestItineraryList setCities(java.util.List<MealApplyAddRequestItineraryListCities> cities) {
            this.cities = cities;
            return this;
        }
        public java.util.List<MealApplyAddRequestItineraryListCities> getCities() {
            return this.cities;
        }

        public MealApplyAddRequestItineraryList setEndDate(String endDate) {
            this.endDate = endDate;
            return this;
        }
        public String getEndDate() {
            return this.endDate;
        }

        public MealApplyAddRequestItineraryList setStartDate(String startDate) {
            this.startDate = startDate;
            return this;
        }
        public String getStartDate() {
            return this.startDate;
        }

        public MealApplyAddRequestItineraryList setThirdpartItineraryId(String thirdpartItineraryId) {
            this.thirdpartItineraryId = thirdpartItineraryId;
            return this;
        }
        public String getThirdpartItineraryId() {
            return this.thirdpartItineraryId;
        }

    }

}
