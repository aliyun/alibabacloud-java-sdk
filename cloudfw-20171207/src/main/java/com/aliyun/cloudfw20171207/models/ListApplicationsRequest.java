// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class ListApplicationsRequest extends TeaModel {
    /**
     * <p>The application ID. Exact match is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>10012150000</p>
     */
    @NameInMap("ApplicationId")
    public Long applicationId;

    /**
     * <p>The application name. Fuzzy match is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>DingTalk</p>
     */
    @NameInMap("ApplicationName")
    public String applicationName;

    /**
     * <p>The application category ID. Exact match is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>8</p>
     */
    @NameInMap("CategoryId")
    public Long categoryId;

    /**
     * <p>The application category name. Fuzzy match is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>Office collaboration</p>
     */
    @NameInMap("CategoryName")
    public String categoryName;

    /**
     * <p>The application description. Fuzzy match is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>Office</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The application group name. Fuzzy match is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>Dingtalk</p>
     */
    @NameInMap("GroupName")
    public String groupName;

    /**
     * <p>The language of the returned information. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese. This is the default value.</li>
     * <li><strong>en</strong>: English.
     * This parameter determines whether the application name, category name, technology type, vendor, and description are returned in Chinese or English.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The page number. Pages start from 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Long pageNo;

    /**
     * <p>The number of entries per page. The value must be greater than or equal to 1. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The risk level. Exact match is supported. Valid values:</p>
     * <ul>
     * <li><strong>Information</strong>: Informational.</li>
     * <li><strong>Low</strong>: Low.</li>
     * <li><strong>Medium</strong>: Medium.</li>
     * <li><strong>High</strong>: High.</li>
     * <li><strong>Critical</strong>: Critical.
     * If an invalid value is passed, this filter condition is ignored.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Low</p>
     */
    @NameInMap("Risk")
    public String risk;

    /**
     * <p>The technology type name. Fuzzy match is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>Browser-based</p>
     */
    @NameInMap("Technology")
    public String technology;

    public static ListApplicationsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListApplicationsRequest self = new ListApplicationsRequest();
        return TeaModel.build(map, self);
    }

    public ListApplicationsRequest setApplicationId(Long applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public Long getApplicationId() {
        return this.applicationId;
    }

    public ListApplicationsRequest setApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }
    public String getApplicationName() {
        return this.applicationName;
    }

    public ListApplicationsRequest setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
        return this;
    }
    public Long getCategoryId() {
        return this.categoryId;
    }

    public ListApplicationsRequest setCategoryName(String categoryName) {
        this.categoryName = categoryName;
        return this;
    }
    public String getCategoryName() {
        return this.categoryName;
    }

    public ListApplicationsRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ListApplicationsRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public ListApplicationsRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ListApplicationsRequest setPageNo(Long pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Long getPageNo() {
        return this.pageNo;
    }

    public ListApplicationsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListApplicationsRequest setRisk(String risk) {
        this.risk = risk;
        return this;
    }
    public String getRisk() {
        return this.risk;
    }

    public ListApplicationsRequest setTechnology(String technology) {
        this.technology = technology;
        return this;
    }
    public String getTechnology() {
        return this.technology;
    }

}
