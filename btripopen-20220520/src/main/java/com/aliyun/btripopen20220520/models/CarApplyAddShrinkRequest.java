// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class CarApplyAddShrinkRequest extends TeaModel {
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
     * <p>The cities for car service. Separate multiple cities with Chinese commas (，).
     * Note: A maximum of 10 cities are supported. The values in city and city_code_set must correspond one to one.</p>
     * 
     * <strong>example:</strong>
     * <p>北京，杭州</p>
     */
    @NameInMap("city")
    public String city;

    /**
     * <p>The city code set for intra-city car service. Separate multiple cities with Chinese commas (，).
     * Note: 1) Either city_code_set or city is required. If both are specified, city_code_set takes precedence.
     * A maximum of 10 cities are supported.</p>
     * 
     * <strong>example:</strong>
     * <p>110100，330100</p>
     */
    @NameInMap("city_code_set")
    public String cityCodeSet;

    /**
     * <p>The car service time. This parameter is controlled on a daily basis. For example, a value of 2021-03-18 20:26:56 indicates that the car service is available on 2021-03-18. For multi-day scenarios, use this parameter together with the finished_date parameter. The time must be in the yyyy-MM-dd HH:mm:ss format.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-07-12 14:52:52</p>
     */
    @NameInMap("date")
    public String date;

    /**
     * <p>The car service end time. This parameter is controlled on a daily basis. For example, if date is set to 2021-03-18 20:26:56 and finished_date is set to 2021-03-30 20:26:56, the car service is available from 2021-03-18 (inclusive) to 2021-03-30 (inclusive). If this parameter is not specified, the value of date is used as the end time. The time must be in the yyyy-MM-dd HH:mm:ss format.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-07-12 18:51:25</p>
     */
    @NameInMap("finished_date")
    public String finishedDate;

    @NameInMap("itinerary_list")
    public String itineraryListShrink;

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
     * <p>Warning: This field is required. To make it optional, contact operations.</p>
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
     * <p>Warning: This field is required. To make it optional, contact operations.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>GA15131</p>
     */
    @NameInMap("third_part_invoice_id")
    public String thirdPartInvoiceId;

    /**
     * <p>The total number of times the approval form can be used.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("times_total")
    public Integer timesTotal;

    /**
     * <p>The usage count type of the approval form. If the enterprise does not need to limit the number of times the approval form can be used, set this parameter to 1 (unlimited) and set both times_total and times_used to 0.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>1: Unlimited.</li>
     * <li>2: User-specified count.</li>
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
    public String travelerStandardShrink;

    /**
     * <p>The third-party employee ID of the user who initiates the approval.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>OPEN1415614</p>
     */
    @NameInMap("user_id")
    public String userId;

    public static CarApplyAddShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CarApplyAddShrinkRequest self = new CarApplyAddShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CarApplyAddShrinkRequest setCause(String cause) {
        this.cause = cause;
        return this;
    }
    public String getCause() {
        return this.cause;
    }

    public CarApplyAddShrinkRequest setCity(String city) {
        this.city = city;
        return this;
    }
    public String getCity() {
        return this.city;
    }

    public CarApplyAddShrinkRequest setCityCodeSet(String cityCodeSet) {
        this.cityCodeSet = cityCodeSet;
        return this;
    }
    public String getCityCodeSet() {
        return this.cityCodeSet;
    }

    public CarApplyAddShrinkRequest setDate(String date) {
        this.date = date;
        return this;
    }
    public String getDate() {
        return this.date;
    }

    public CarApplyAddShrinkRequest setFinishedDate(String finishedDate) {
        this.finishedDate = finishedDate;
        return this;
    }
    public String getFinishedDate() {
        return this.finishedDate;
    }

    public CarApplyAddShrinkRequest setItineraryListShrink(String itineraryListShrink) {
        this.itineraryListShrink = itineraryListShrink;
        return this;
    }
    public String getItineraryListShrink() {
        return this.itineraryListShrink;
    }

    public CarApplyAddShrinkRequest setProjectCode(String projectCode) {
        this.projectCode = projectCode;
        return this;
    }
    public String getProjectCode() {
        return this.projectCode;
    }

    public CarApplyAddShrinkRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public CarApplyAddShrinkRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public CarApplyAddShrinkRequest setThirdPartApplyId(String thirdPartApplyId) {
        this.thirdPartApplyId = thirdPartApplyId;
        return this;
    }
    public String getThirdPartApplyId() {
        return this.thirdPartApplyId;
    }

    public CarApplyAddShrinkRequest setThirdPartCostCenterId(String thirdPartCostCenterId) {
        this.thirdPartCostCenterId = thirdPartCostCenterId;
        return this;
    }
    public String getThirdPartCostCenterId() {
        return this.thirdPartCostCenterId;
    }

    public CarApplyAddShrinkRequest setThirdPartInvoiceId(String thirdPartInvoiceId) {
        this.thirdPartInvoiceId = thirdPartInvoiceId;
        return this;
    }
    public String getThirdPartInvoiceId() {
        return this.thirdPartInvoiceId;
    }

    public CarApplyAddShrinkRequest setTimesTotal(Integer timesTotal) {
        this.timesTotal = timesTotal;
        return this;
    }
    public Integer getTimesTotal() {
        return this.timesTotal;
    }

    public CarApplyAddShrinkRequest setTimesType(Integer timesType) {
        this.timesType = timesType;
        return this;
    }
    public Integer getTimesType() {
        return this.timesType;
    }

    public CarApplyAddShrinkRequest setTimesUsed(Integer timesUsed) {
        this.timesUsed = timesUsed;
        return this;
    }
    public Integer getTimesUsed() {
        return this.timesUsed;
    }

    public CarApplyAddShrinkRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public CarApplyAddShrinkRequest setTravelerStandardShrink(String travelerStandardShrink) {
        this.travelerStandardShrink = travelerStandardShrink;
        return this;
    }
    public String getTravelerStandardShrink() {
        return this.travelerStandardShrink;
    }

    public CarApplyAddShrinkRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
