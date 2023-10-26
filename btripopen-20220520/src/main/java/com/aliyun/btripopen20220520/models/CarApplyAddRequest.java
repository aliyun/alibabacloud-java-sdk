// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class CarApplyAddRequest extends TeaModel {
    @NameInMap("cause")
    public String cause;

    @NameInMap("city")
    public String city;

    @NameInMap("city_code_set")
    public String cityCodeSet;

    @NameInMap("date")
    public String date;

    @NameInMap("finished_date")
    public String finishedDate;

    @NameInMap("project_code")
    public String projectCode;

    @NameInMap("project_name")
    public String projectName;

    @NameInMap("status")
    public Integer status;

    @NameInMap("third_part_apply_id")
    public String thirdPartApplyId;

    @NameInMap("third_part_cost_center_id")
    public String thirdPartCostCenterId;

    @NameInMap("third_part_invoice_id")
    public String thirdPartInvoiceId;

    @NameInMap("times_total")
    public Integer timesTotal;

    @NameInMap("times_type")
    public Integer timesType;

    @NameInMap("times_used")
    public Integer timesUsed;

    @NameInMap("title")
    public String title;

    @NameInMap("traveler_standard")
    public java.util.List<CarApplyAddRequestTravelerStandard> travelerStandard;

    @NameInMap("user_id")
    public String userId;

    public static CarApplyAddRequest build(java.util.Map<String, ?> map) throws Exception {
        CarApplyAddRequest self = new CarApplyAddRequest();
        return TeaModel.build(map, self);
    }

    public CarApplyAddRequest setCause(String cause) {
        this.cause = cause;
        return this;
    }
    public String getCause() {
        return this.cause;
    }

    public CarApplyAddRequest setCity(String city) {
        this.city = city;
        return this;
    }
    public String getCity() {
        return this.city;
    }

    public CarApplyAddRequest setCityCodeSet(String cityCodeSet) {
        this.cityCodeSet = cityCodeSet;
        return this;
    }
    public String getCityCodeSet() {
        return this.cityCodeSet;
    }

    public CarApplyAddRequest setDate(String date) {
        this.date = date;
        return this;
    }
    public String getDate() {
        return this.date;
    }

    public CarApplyAddRequest setFinishedDate(String finishedDate) {
        this.finishedDate = finishedDate;
        return this;
    }
    public String getFinishedDate() {
        return this.finishedDate;
    }

    public CarApplyAddRequest setProjectCode(String projectCode) {
        this.projectCode = projectCode;
        return this;
    }
    public String getProjectCode() {
        return this.projectCode;
    }

    public CarApplyAddRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public CarApplyAddRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public CarApplyAddRequest setThirdPartApplyId(String thirdPartApplyId) {
        this.thirdPartApplyId = thirdPartApplyId;
        return this;
    }
    public String getThirdPartApplyId() {
        return this.thirdPartApplyId;
    }

    public CarApplyAddRequest setThirdPartCostCenterId(String thirdPartCostCenterId) {
        this.thirdPartCostCenterId = thirdPartCostCenterId;
        return this;
    }
    public String getThirdPartCostCenterId() {
        return this.thirdPartCostCenterId;
    }

    public CarApplyAddRequest setThirdPartInvoiceId(String thirdPartInvoiceId) {
        this.thirdPartInvoiceId = thirdPartInvoiceId;
        return this;
    }
    public String getThirdPartInvoiceId() {
        return this.thirdPartInvoiceId;
    }

    public CarApplyAddRequest setTimesTotal(Integer timesTotal) {
        this.timesTotal = timesTotal;
        return this;
    }
    public Integer getTimesTotal() {
        return this.timesTotal;
    }

    public CarApplyAddRequest setTimesType(Integer timesType) {
        this.timesType = timesType;
        return this;
    }
    public Integer getTimesType() {
        return this.timesType;
    }

    public CarApplyAddRequest setTimesUsed(Integer timesUsed) {
        this.timesUsed = timesUsed;
        return this;
    }
    public Integer getTimesUsed() {
        return this.timesUsed;
    }

    public CarApplyAddRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public CarApplyAddRequest setTravelerStandard(java.util.List<CarApplyAddRequestTravelerStandard> travelerStandard) {
        this.travelerStandard = travelerStandard;
        return this;
    }
    public java.util.List<CarApplyAddRequestTravelerStandard> getTravelerStandard() {
        return this.travelerStandard;
    }

    public CarApplyAddRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public static class CarApplyAddRequestTravelerStandardCarCitySet extends TeaModel {
        @NameInMap("city_code")
        public String cityCode;

        @NameInMap("city_name")
        public String cityName;

        public static CarApplyAddRequestTravelerStandardCarCitySet build(java.util.Map<String, ?> map) throws Exception {
            CarApplyAddRequestTravelerStandardCarCitySet self = new CarApplyAddRequestTravelerStandardCarCitySet();
            return TeaModel.build(map, self);
        }

        public CarApplyAddRequestTravelerStandardCarCitySet setCityCode(String cityCode) {
            this.cityCode = cityCode;
            return this;
        }
        public String getCityCode() {
            return this.cityCode;
        }

        public CarApplyAddRequestTravelerStandardCarCitySet setCityName(String cityName) {
            this.cityName = cityName;
            return this;
        }
        public String getCityName() {
            return this.cityName;
        }

    }

    public static class CarApplyAddRequestTravelerStandard extends TeaModel {
        @NameInMap("car_city_set")
        public java.util.List<CarApplyAddRequestTravelerStandardCarCitySet> carCitySet;

        @NameInMap("user_id")
        public String userId;

        public static CarApplyAddRequestTravelerStandard build(java.util.Map<String, ?> map) throws Exception {
            CarApplyAddRequestTravelerStandard self = new CarApplyAddRequestTravelerStandard();
            return TeaModel.build(map, self);
        }

        public CarApplyAddRequestTravelerStandard setCarCitySet(java.util.List<CarApplyAddRequestTravelerStandardCarCitySet> carCitySet) {
            this.carCitySet = carCitySet;
            return this;
        }
        public java.util.List<CarApplyAddRequestTravelerStandardCarCitySet> getCarCitySet() {
            return this.carCitySet;
        }

        public CarApplyAddRequestTravelerStandard setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
