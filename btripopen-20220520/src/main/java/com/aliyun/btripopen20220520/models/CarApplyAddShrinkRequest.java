// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class CarApplyAddShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("cause")
    public String cause;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("city")
    public String city;

    @NameInMap("city_code_set")
    public String cityCodeSet;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("date")
    public String date;

    @NameInMap("finished_date")
    public String finishedDate;

    @NameInMap("project_code")
    public String projectCode;

    @NameInMap("project_name")
    public String projectName;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("status")
    public Integer status;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("third_part_apply_id")
    public String thirdPartApplyId;

    @NameInMap("third_part_cost_center_id")
    public String thirdPartCostCenterId;

    @NameInMap("third_part_invoice_id")
    public String thirdPartInvoiceId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("times_total")
    public Integer timesTotal;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("times_type")
    public Integer timesType;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("times_used")
    public Integer timesUsed;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("title")
    public String title;

    @NameInMap("traveler_standard")
    public String travelerStandardShrink;

    /**
     * <p>This parameter is required.</p>
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
