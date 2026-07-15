// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class CarApplyAddRequest extends TeaModel {
    /**
     * <p>The reason for the business trip.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>访问客户</p>
     */
    @NameInMap("cause")
    public String cause;

    /**
     * <p>The car service cities. Separate multiple cities with Chinese commas (，).
     * Note: A maximum of 10 cities can be specified. The values in city and city_code_set must correspond one-to-one.</p>
     * 
     * <strong>example:</strong>
     * <p>北京，杭州</p>
     */
    @NameInMap("city")
    public String city;

    /**
     * <p>The set of city codes for intra-city car service. Separate multiple cities with Chinese commas (，).
     * Note: 1) Either city_code_set or city is required. If both are specified, city_code_set takes precedence.
     * A maximum of 10 cities can be specified.</p>
     * 
     * <strong>example:</strong>
     * <p>110100，330100</p>
     */
    @NameInMap("city_code_set")
    public String cityCodeSet;

    /**
     * <p>The car service date. Access is controlled on a daily basis. For example, a value of 2021-03-18 20:26:56 indicates that the car service is available on 2021-03-18. For cross-day scenarios, use this parameter together with the finished_date parameter. The time parameter must be in the yyyy-MM-dd HH:mm:ss string format.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-07-12 14:52:52</p>
     */
    @NameInMap("date")
    public String date;

    /**
     * <p>The car service end date. Access is controlled on a daily basis. For example, if date is set to 2021-03-18 20:26:56 and finished_date is set to 2021-03-30 20:26:56, the car service is available from 2021-03-18 (inclusive) to 2021-03-30 (inclusive). If this parameter is not specified, the value of date is used as the end date. The time parameter must be in the yyyy-MM-dd HH:mm:ss string format.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-07-12 18:51:25</p>
     */
    @NameInMap("finished_date")
    public String finishedDate;

    /**
     * <p>The intra-city car service itinerary.</p>
     */
    @NameInMap("itinerary_list")
    public java.util.List<CarApplyAddRequestItineraryList> itineraryList;

    /**
     * <p>The project code associated with the approval form.</p>
     * 
     * <strong>example:</strong>
     * <p>project1413</p>
     */
    @NameInMap("project_code")
    public String projectCode;

    /**
     * <p>The project name associated with the approval form.</p>
     * 
     * <strong>example:</strong>
     * <p>项目1</p>
     */
    @NameInMap("project_name")
    public String projectName;

    /**
     * <p>The approval status.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("status")
    public Integer status;

    /**
     * <p>The ID of the third-party approval form.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>IRGS1413</p>
     */
    @NameInMap("third_part_apply_id")
    public String thirdPartApplyId;

    /**
     * <p>The ID of the third-party cost center associated with the approval form.</p>
     * <blockquote>
     * <p>Warning: This field is required. To configure it as optional, contact operations.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>QA1411</p>
     */
    @NameInMap("third_part_cost_center_id")
    public String thirdPartCostCenterId;

    /**
     * <p>The ID of the third-party invoice header associated with the approval form.</p>
     * <blockquote>
     * <p>Warning: This field is required. To configure it as optional, contact operations.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>GA15131</p>
     */
    @NameInMap("third_part_invoice_id")
    public String thirdPartInvoiceId;

    /**
     * <p>The total available count for the approval form.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("times_total")
    public Integer timesTotal;

    /**
     * <p>The type of available usage count for the approval form. If the enterprise does not need to limit the number of times the approval form can be used, set this parameter to 1 (unlimited) and set both times_total and times_used to 0.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>1: Unlimited.</li>
     * <li>2: User-specified count.</li>
     * <li>3: Admin-limited count.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("times_type")
    public Integer timesType;

    /**
     * <p>The number of times the approval form has been used.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("times_used")
    public Integer timesUsed;

    /**
     * <p>The title of the approval form.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>访问客户</p>
     */
    @NameInMap("title")
    public String title;

    /**
     * <p>The intra-city car service rules.</p>
     */
    @NameInMap("traveler_standard")
    public java.util.List<CarApplyAddRequestTravelerStandard> travelerStandard;

    /**
     * <p>The third-party employee ID of the user who initiates the approval.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>OPEN1415614</p>
     */
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

    public CarApplyAddRequest setItineraryList(java.util.List<CarApplyAddRequestItineraryList> itineraryList) {
        this.itineraryList = itineraryList;
        return this;
    }
    public java.util.List<CarApplyAddRequestItineraryList> getItineraryList() {
        return this.itineraryList;
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

    public static class CarApplyAddRequestItineraryList extends TeaModel {
        /**
         * <p>The car service cities. Separate multiple cities with Chinese commas (，).
         * Note: A maximum of 10 cities can be specified. The values in city and city_code_set must correspond one-to-one.</p>
         * 
         * <strong>example:</strong>
         * <p>北京，杭州</p>
         */
        @NameInMap("city")
        public String city;

        /**
         * <p>The set of city codes for intra-city car service. Separate multiple cities with Chinese commas (，).
         * Note: 1) Either city_code_set or city is required. If both are specified, city_code_set takes precedence.
         * A maximum of 10 cities can be specified.</p>
         * 
         * <strong>example:</strong>
         * <p>440600，440100</p>
         */
        @NameInMap("city_code_set")
        public String cityCodeSet;

        /**
         * <p>The car service date. Access is controlled on a daily basis. For example, a value of 2021-03-18 20:26:56 indicates that the car service is available on 2021-03-18. For cross-day scenarios, use this parameter together with the finished_date parameter. The time parameter must be in the yyyy-MM-dd HH:mm:ss string format.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-07-12 14:52:52</p>
         */
        @NameInMap("date")
        public String date;

        /**
         * <p>The car service end date. Access is controlled on a daily basis. For example, if date is set to 2021-03-18 20:26:56 and finished_date is set to 2021-03-30 20:26:56, the car service is available from 2021-03-18 (inclusive) to 2021-03-30 (inclusive). If this parameter is not specified, the value of date is used as the end date. The time parameter must be in the yyyy-MM-dd HH:mm:ss string format.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-11-25 21:00:00</p>
         */
        @NameInMap("finished_date")
        public String finishedDate;

        public static CarApplyAddRequestItineraryList build(java.util.Map<String, ?> map) throws Exception {
            CarApplyAddRequestItineraryList self = new CarApplyAddRequestItineraryList();
            return TeaModel.build(map, self);
        }

        public CarApplyAddRequestItineraryList setCity(String city) {
            this.city = city;
            return this;
        }
        public String getCity() {
            return this.city;
        }

        public CarApplyAddRequestItineraryList setCityCodeSet(String cityCodeSet) {
            this.cityCodeSet = cityCodeSet;
            return this;
        }
        public String getCityCodeSet() {
            return this.cityCodeSet;
        }

        public CarApplyAddRequestItineraryList setDate(String date) {
            this.date = date;
            return this;
        }
        public String getDate() {
            return this.date;
        }

        public CarApplyAddRequestItineraryList setFinishedDate(String finishedDate) {
            this.finishedDate = finishedDate;
            return this;
        }
        public String getFinishedDate() {
            return this.finishedDate;
        }

    }

    public static class CarApplyAddRequestTravelerStandardCarCitySet extends TeaModel {
        /**
         * <p>The cross-city city code. Only 6-digit codes are supported. Separate multiple values with Chinese commas.
         * Note: A maximum of 10 cities can be specified. The values in city_code and city_name must correspond one-to-one.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>110100，330100</p>
         */
        @NameInMap("city_code")
        public String cityCode;

        /**
         * <p>The cross-city city name. Separate multiple values with Chinese commas.
         * Note: A maximum of 10 cities can be specified. The values in city_code and city_name must correspond one-to-one.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>北京，杭州</p>
         */
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
        /**
         * <p>The cross-city car service rules. Optional. If specified, cross-city rules are read from the approval form data.</p>
         */
        @NameInMap("car_city_set")
        public java.util.List<CarApplyAddRequestTravelerStandardCarCitySet> carCitySet;

        /**
         * <p>The user ID of the traveler.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>userid</p>
         */
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
