// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class MealApplyQueryResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("message")
    public String message;

    @NameInMap("module")
    public MealApplyQueryResponseBodyModule module;

    /**
     * <strong>example:</strong>
     * <p>A5009956-1077-52FB-B520-EA8C7E91D722</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    /**
     * <p>traceId</p>
     * 
     * <strong>example:</strong>
     * <p>210f07f316603757445272547d959f</p>
     */
    @NameInMap("traceId")
    public String traceId;

    public static MealApplyQueryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        MealApplyQueryResponseBody self = new MealApplyQueryResponseBody();
        return TeaModel.build(map, self);
    }

    public MealApplyQueryResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public MealApplyQueryResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public MealApplyQueryResponseBody setModule(MealApplyQueryResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public MealApplyQueryResponseBodyModule getModule() {
        return this.module;
    }

    public MealApplyQueryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public MealApplyQueryResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public MealApplyQueryResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class MealApplyQueryResponseBodyModuleApplyUser extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2123</p>
         */
        @NameInMap("user_id")
        public String userId;

        @NameInMap("user_name")
        public String userName;

        public static MealApplyQueryResponseBodyModuleApplyUser build(java.util.Map<String, ?> map) throws Exception {
            MealApplyQueryResponseBodyModuleApplyUser self = new MealApplyQueryResponseBodyModuleApplyUser();
            return TeaModel.build(map, self);
        }

        public MealApplyQueryResponseBodyModuleApplyUser setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public MealApplyQueryResponseBodyModuleApplyUser setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

    public static class MealApplyQueryResponseBodyModuleItineraryListCities extends TeaModel {
        @NameInMap("city_code")
        public String cityCode;

        @NameInMap("city_name")
        public String cityName;

        public static MealApplyQueryResponseBodyModuleItineraryListCities build(java.util.Map<String, ?> map) throws Exception {
            MealApplyQueryResponseBodyModuleItineraryListCities self = new MealApplyQueryResponseBodyModuleItineraryListCities();
            return TeaModel.build(map, self);
        }

        public MealApplyQueryResponseBodyModuleItineraryListCities setCityCode(String cityCode) {
            this.cityCode = cityCode;
            return this;
        }
        public String getCityCode() {
            return this.cityCode;
        }

        public MealApplyQueryResponseBodyModuleItineraryListCities setCityName(String cityName) {
            this.cityName = cityName;
            return this;
        }
        public String getCityName() {
            return this.cityName;
        }

    }

    public static class MealApplyQueryResponseBodyModuleItineraryList extends TeaModel {
        @NameInMap("cities")
        public java.util.List<MealApplyQueryResponseBodyModuleItineraryListCities> cities;

        @NameInMap("end_date")
        public String endDate;

        @NameInMap("start_date")
        public String startDate;

        @NameInMap("thirdpart_itinerary_id")
        public String thirdpartItineraryId;

        public static MealApplyQueryResponseBodyModuleItineraryList build(java.util.Map<String, ?> map) throws Exception {
            MealApplyQueryResponseBodyModuleItineraryList self = new MealApplyQueryResponseBodyModuleItineraryList();
            return TeaModel.build(map, self);
        }

        public MealApplyQueryResponseBodyModuleItineraryList setCities(java.util.List<MealApplyQueryResponseBodyModuleItineraryListCities> cities) {
            this.cities = cities;
            return this;
        }
        public java.util.List<MealApplyQueryResponseBodyModuleItineraryListCities> getCities() {
            return this.cities;
        }

        public MealApplyQueryResponseBodyModuleItineraryList setEndDate(String endDate) {
            this.endDate = endDate;
            return this;
        }
        public String getEndDate() {
            return this.endDate;
        }

        public MealApplyQueryResponseBodyModuleItineraryList setStartDate(String startDate) {
            this.startDate = startDate;
            return this;
        }
        public String getStartDate() {
            return this.startDate;
        }

        public MealApplyQueryResponseBodyModuleItineraryList setThirdpartItineraryId(String thirdpartItineraryId) {
            this.thirdpartItineraryId = thirdpartItineraryId;
            return this;
        }
        public String getThirdpartItineraryId() {
            return this.thirdpartItineraryId;
        }

    }

    public static class MealApplyQueryResponseBodyModule extends TeaModel {
        @NameInMap("apply_user")
        public MealApplyQueryResponseBodyModuleApplyUser applyUser;

        /**
         * <strong>example:</strong>
         * <p>11376</p>
         */
        @NameInMap("cost_center_id")
        public Long costCenterId;

        /**
         * <strong>example:</strong>
         * <p>2022-07-04T16:13Z</p>
         */
        @NameInMap("gmt_create")
        public String gmtCreate;

        /**
         * <strong>example:</strong>
         * <p>11876</p>
         */
        @NameInMap("invoice_id")
        public Long invoiceId;

        @NameInMap("itinerary_list")
        public java.util.List<MealApplyQueryResponseBodyModuleItineraryList> itineraryList;

        @NameInMap("meal_amount")
        public Long mealAmount;

        @NameInMap("meal_cause")
        public String mealCause;

        /**
         * <strong>example:</strong>
         * <p>11546</p>
         */
        @NameInMap("project_id")
        public Long projectId;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("status")
        public Integer status;

        /**
         * <strong>example:</strong>
         * <p>2024073128454753</p>
         */
        @NameInMap("third_part_apply_id")
        public String thirdPartApplyId;

        /**
         * <strong>example:</strong>
         * <p>330000303010292572</p>
         */
        @NameInMap("third_part_cost_center_id")
        public String thirdPartCostCenterId;

        /**
         * <strong>example:</strong>
         * <p>405009</p>
         */
        @NameInMap("third_part_invoice_id")
        public String thirdPartInvoiceId;

        /**
         * <strong>example:</strong>
         * <p>CS-PROJECT</p>
         */
        @NameInMap("third_part_project_id")
        public String thirdPartProjectId;

        public static MealApplyQueryResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            MealApplyQueryResponseBodyModule self = new MealApplyQueryResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public MealApplyQueryResponseBodyModule setApplyUser(MealApplyQueryResponseBodyModuleApplyUser applyUser) {
            this.applyUser = applyUser;
            return this;
        }
        public MealApplyQueryResponseBodyModuleApplyUser getApplyUser() {
            return this.applyUser;
        }

        public MealApplyQueryResponseBodyModule setCostCenterId(Long costCenterId) {
            this.costCenterId = costCenterId;
            return this;
        }
        public Long getCostCenterId() {
            return this.costCenterId;
        }

        public MealApplyQueryResponseBodyModule setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public MealApplyQueryResponseBodyModule setInvoiceId(Long invoiceId) {
            this.invoiceId = invoiceId;
            return this;
        }
        public Long getInvoiceId() {
            return this.invoiceId;
        }

        public MealApplyQueryResponseBodyModule setItineraryList(java.util.List<MealApplyQueryResponseBodyModuleItineraryList> itineraryList) {
            this.itineraryList = itineraryList;
            return this;
        }
        public java.util.List<MealApplyQueryResponseBodyModuleItineraryList> getItineraryList() {
            return this.itineraryList;
        }

        public MealApplyQueryResponseBodyModule setMealAmount(Long mealAmount) {
            this.mealAmount = mealAmount;
            return this;
        }
        public Long getMealAmount() {
            return this.mealAmount;
        }

        public MealApplyQueryResponseBodyModule setMealCause(String mealCause) {
            this.mealCause = mealCause;
            return this;
        }
        public String getMealCause() {
            return this.mealCause;
        }

        public MealApplyQueryResponseBodyModule setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public MealApplyQueryResponseBodyModule setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public MealApplyQueryResponseBodyModule setThirdPartApplyId(String thirdPartApplyId) {
            this.thirdPartApplyId = thirdPartApplyId;
            return this;
        }
        public String getThirdPartApplyId() {
            return this.thirdPartApplyId;
        }

        public MealApplyQueryResponseBodyModule setThirdPartCostCenterId(String thirdPartCostCenterId) {
            this.thirdPartCostCenterId = thirdPartCostCenterId;
            return this;
        }
        public String getThirdPartCostCenterId() {
            return this.thirdPartCostCenterId;
        }

        public MealApplyQueryResponseBodyModule setThirdPartInvoiceId(String thirdPartInvoiceId) {
            this.thirdPartInvoiceId = thirdPartInvoiceId;
            return this;
        }
        public String getThirdPartInvoiceId() {
            return this.thirdPartInvoiceId;
        }

        public MealApplyQueryResponseBodyModule setThirdPartProjectId(String thirdPartProjectId) {
            this.thirdPartProjectId = thirdPartProjectId;
            return this;
        }
        public String getThirdPartProjectId() {
            return this.thirdPartProjectId;
        }

    }

}
