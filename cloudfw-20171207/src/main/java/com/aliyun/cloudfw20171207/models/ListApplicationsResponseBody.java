// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class ListApplicationsResponseBody extends TeaModel {
    /**
     * <p>The list of applications. In the Chinese environment, the applications are sorted in descending order of group name and ascending order of application level.</p>
     */
    @NameInMap("Applications")
    public java.util.List<ListApplicationsResponseBodyApplications> applications;

    /**
     * <p>The current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Long pageNo;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>CBF1E9B7-D6A0-4E9E-AD3E-2B47E6C2837D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of applications that meet the filter conditions.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListApplicationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListApplicationsResponseBody self = new ListApplicationsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListApplicationsResponseBody setApplications(java.util.List<ListApplicationsResponseBodyApplications> applications) {
        this.applications = applications;
        return this;
    }
    public java.util.List<ListApplicationsResponseBodyApplications> getApplications() {
        return this.applications;
    }

    public ListApplicationsResponseBody setPageNo(Long pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Long getPageNo() {
        return this.pageNo;
    }

    public ListApplicationsResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListApplicationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListApplicationsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListApplicationsResponseBodyApplications extends TeaModel {
        /**
         * <p>The application ID in the built-in application signature library.</p>
         * 
         * <strong>example:</strong>
         * <p>10012150000</p>
         */
        @NameInMap("ApplicationId")
        public Long applicationId;

        /**
         * <p>The application name. The name is returned in Chinese or English based on the Lang parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>DingTalk</p>
         */
        @NameInMap("ApplicationName")
        public String applicationName;

        /**
         * <p>The application category ID.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("CategoryId")
        public Long categoryId;

        /**
         * <p>The application category name. The name is returned in Chinese or English based on the Lang parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>Office collaboration</p>
         */
        @NameInMap("CategoryName")
        public String categoryName;

        /**
         * <p>The default action for the application in the built-in application library. The value is fixed as Alert (Monitor).</p>
         * 
         * <strong>example:</strong>
         * <p>Alert</p>
         */
        @NameInMap("DefaultAction")
        public String defaultAction;

        /**
         * <p>The application description. The description is returned in Chinese or English based on the Lang parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>An enterprise-grade intelligent mobile office and collaboration platform that provides features such as instant messaging, audio and video conferencing, organizational management, online documents, approval and attendance, and AI office assistants</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The application group name.</p>
         * 
         * <strong>example:</strong>
         * <p>Dingtalk</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        /**
         * <p>The level value of the application. The value is obtained from the built-in application signature library and used for list sorting.</p>
         * 
         * <strong>example:</strong>
         * <p>700</p>
         */
        @NameInMap("Level")
        public Long level;

        /**
         * <p>The list of protocols used by the application.</p>
         */
        @NameInMap("Protocol")
        public java.util.List<String> protocol;

        /**
         * <p>The list of detection prerequisites for the application.</p>
         */
        @NameInMap("Requirements")
        public java.util.List<String> requirements;

        /**
         * <p>The risk level. Valid values:</p>
         * <ul>
         * <li><strong>Information</strong>: Informational.</li>
         * <li><strong>Low</strong>: Low.</li>
         * <li><strong>Medium</strong>: Medium.</li>
         * <li><strong>High</strong>: High.</li>
         * <li><strong>Critical</strong>: Critical.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Low</p>
         */
        @NameInMap("Risk")
        public String risk;

        /**
         * <p>The technology type name. The name is returned in Chinese or English based on the Lang parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>Browser-based</p>
         */
        @NameInMap("Technology")
        public String technology;

        /**
         * <p>The last update time of the application information. The value is a UNIX timestamp in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1731465600</p>
         */
        @NameInMap("UpdatedTime")
        public Long updatedTime;

        /**
         * <p>The application vendor name. The name is returned in Chinese or English based on the Lang parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>DingTalk Technology Co., Ltd</p>
         */
        @NameInMap("Vendor")
        public String vendor;

        public static ListApplicationsResponseBodyApplications build(java.util.Map<String, ?> map) throws Exception {
            ListApplicationsResponseBodyApplications self = new ListApplicationsResponseBodyApplications();
            return TeaModel.build(map, self);
        }

        public ListApplicationsResponseBodyApplications setApplicationId(Long applicationId) {
            this.applicationId = applicationId;
            return this;
        }
        public Long getApplicationId() {
            return this.applicationId;
        }

        public ListApplicationsResponseBodyApplications setApplicationName(String applicationName) {
            this.applicationName = applicationName;
            return this;
        }
        public String getApplicationName() {
            return this.applicationName;
        }

        public ListApplicationsResponseBodyApplications setCategoryId(Long categoryId) {
            this.categoryId = categoryId;
            return this;
        }
        public Long getCategoryId() {
            return this.categoryId;
        }

        public ListApplicationsResponseBodyApplications setCategoryName(String categoryName) {
            this.categoryName = categoryName;
            return this;
        }
        public String getCategoryName() {
            return this.categoryName;
        }

        public ListApplicationsResponseBodyApplications setDefaultAction(String defaultAction) {
            this.defaultAction = defaultAction;
            return this;
        }
        public String getDefaultAction() {
            return this.defaultAction;
        }

        public ListApplicationsResponseBodyApplications setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListApplicationsResponseBodyApplications setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public ListApplicationsResponseBodyApplications setLevel(Long level) {
            this.level = level;
            return this;
        }
        public Long getLevel() {
            return this.level;
        }

        public ListApplicationsResponseBodyApplications setProtocol(java.util.List<String> protocol) {
            this.protocol = protocol;
            return this;
        }
        public java.util.List<String> getProtocol() {
            return this.protocol;
        }

        public ListApplicationsResponseBodyApplications setRequirements(java.util.List<String> requirements) {
            this.requirements = requirements;
            return this;
        }
        public java.util.List<String> getRequirements() {
            return this.requirements;
        }

        public ListApplicationsResponseBodyApplications setRisk(String risk) {
            this.risk = risk;
            return this;
        }
        public String getRisk() {
            return this.risk;
        }

        public ListApplicationsResponseBodyApplications setTechnology(String technology) {
            this.technology = technology;
            return this;
        }
        public String getTechnology() {
            return this.technology;
        }

        public ListApplicationsResponseBodyApplications setUpdatedTime(Long updatedTime) {
            this.updatedTime = updatedTime;
            return this;
        }
        public Long getUpdatedTime() {
            return this.updatedTime;
        }

        public ListApplicationsResponseBodyApplications setVendor(String vendor) {
            this.vendor = vendor;
            return this;
        }
        public String getVendor() {
            return this.vendor;
        }

    }

}
