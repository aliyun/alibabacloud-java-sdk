// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class ListCustomizeRuleTestResultRequest extends TeaModel {
    /**
     * <p>The page number. The value must be greater than or equal to 1.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The ID of the custom rule. You can obtain the rule ID from the rule list.</p>
     * 
     * <strong>example:</strong>
     * <p>dr-53np4nguf5jmh1vc****</p>
     */
    @NameInMap("DetectionRuleId")
    public String detectionRuleId;

    /**
     * <p>The end time.</p>
     * 
     * <strong>example:</strong>
     * <p>1731797891000</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The ID of the custom rule.</p>
     * 
     * <strong>example:</strong>
     * <p>123456789</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The number of entries per page. The maximum value is 100.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The region where the Data Management center of Threat Analysis is located. Select a region based on the region where your assets are deployed. Valid values:</p>
     * <ul>
     * <li><p>cn-hangzhou: assets in the Chinese mainland and China (Hong Kong)</p>
     * </li>
     * <li><p>ap-southeast-1: assets outside China</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The user ID of a member. This parameter is used by an administrator to switch to the perspective of the member.</p>
     * 
     * <strong>example:</strong>
     * <p>113091674488****</p>
     */
    @NameInMap("RoleFor")
    public Long roleFor;

    /**
     * <p>The type of the view.</p>
     * <ul>
     * <li><p>0: the view of the current Alibaba Cloud account.</p>
     * </li>
     * <li><p>1: the view of all accounts that belong to the enterprise.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RoleType")
    public Integer roleType;

    /**
     * <p>The start time.</p>
     * 
     * <strong>example:</strong>
     * <p>1723057091000</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    /**
     * <p>The verification result for the accuracy of alert fields based on the alert template.</p>
     * <ul>
     * <li><p>true: The verification is passed. Alerts that are generated for enabled rules can be synchronized to the product.</p>
     * </li>
     * <li><p>false: The verification failed. Alerts cannot be synchronized to the product.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("VerifyType")
    public String verifyType;

    public static ListCustomizeRuleTestResultRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCustomizeRuleTestResultRequest self = new ListCustomizeRuleTestResultRequest();
        return TeaModel.build(map, self);
    }

    public ListCustomizeRuleTestResultRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListCustomizeRuleTestResultRequest setDetectionRuleId(String detectionRuleId) {
        this.detectionRuleId = detectionRuleId;
        return this;
    }
    public String getDetectionRuleId() {
        return this.detectionRuleId;
    }

    public ListCustomizeRuleTestResultRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public ListCustomizeRuleTestResultRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public ListCustomizeRuleTestResultRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListCustomizeRuleTestResultRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListCustomizeRuleTestResultRequest setRoleFor(Long roleFor) {
        this.roleFor = roleFor;
        return this;
    }
    public Long getRoleFor() {
        return this.roleFor;
    }

    public ListCustomizeRuleTestResultRequest setRoleType(Integer roleType) {
        this.roleType = roleType;
        return this;
    }
    public Integer getRoleType() {
        return this.roleType;
    }

    public ListCustomizeRuleTestResultRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public ListCustomizeRuleTestResultRequest setVerifyType(String verifyType) {
        this.verifyType = verifyType;
        return this;
    }
    public String getVerifyType() {
        return this.verifyType;
    }

}
