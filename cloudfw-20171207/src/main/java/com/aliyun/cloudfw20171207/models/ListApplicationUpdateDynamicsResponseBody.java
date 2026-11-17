// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class ListApplicationUpdateDynamicsResponseBody extends TeaModel {
    /**
     * <p>The list of update records for the application signature library, sorted in descending order of update time.</p>
     */
    @NameInMap("Dynamics")
    public java.util.List<ListApplicationUpdateDynamicsResponseBodyDynamics> dynamics;

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
     * <p>The total number of update records that meet the filter conditions.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListApplicationUpdateDynamicsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListApplicationUpdateDynamicsResponseBody self = new ListApplicationUpdateDynamicsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListApplicationUpdateDynamicsResponseBody setDynamics(java.util.List<ListApplicationUpdateDynamicsResponseBodyDynamics> dynamics) {
        this.dynamics = dynamics;
        return this;
    }
    public java.util.List<ListApplicationUpdateDynamicsResponseBodyDynamics> getDynamics() {
        return this.dynamics;
    }

    public ListApplicationUpdateDynamicsResponseBody setPageNo(Long pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Long getPageNo() {
        return this.pageNo;
    }

    public ListApplicationUpdateDynamicsResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListApplicationUpdateDynamicsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListApplicationUpdateDynamicsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListApplicationUpdateDynamicsResponseBodyDynamicsApplications extends TeaModel {
        /**
         * <p>The ID of the application in the built-in application signature library.</p>
         * 
         * <strong>example:</strong>
         * <p>10012150000</p>
         */
        @NameInMap("ApplicationId")
        public Long applicationId;

        /**
         * <p>The name of the application. The name is returned in Chinese or English based on the Lang parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>DingTalk</p>
         */
        @NameInMap("ApplicationName")
        public String applicationName;

        public static ListApplicationUpdateDynamicsResponseBodyDynamicsApplications build(java.util.Map<String, ?> map) throws Exception {
            ListApplicationUpdateDynamicsResponseBodyDynamicsApplications self = new ListApplicationUpdateDynamicsResponseBodyDynamicsApplications();
            return TeaModel.build(map, self);
        }

        public ListApplicationUpdateDynamicsResponseBodyDynamicsApplications setApplicationId(Long applicationId) {
            this.applicationId = applicationId;
            return this;
        }
        public Long getApplicationId() {
            return this.applicationId;
        }

        public ListApplicationUpdateDynamicsResponseBodyDynamicsApplications setApplicationName(String applicationName) {
            this.applicationName = applicationName;
            return this;
        }
        public String getApplicationName() {
            return this.applicationName;
        }

    }

    public static class ListApplicationUpdateDynamicsResponseBodyDynamics extends TeaModel {
        /**
         * <p>The list of applications added or updated in this update.</p>
         */
        @NameInMap("Applications")
        public java.util.List<ListApplicationUpdateDynamicsResponseBodyDynamicsApplications> applications;

        /**
         * <p>The update description. The description is returned in Chinese or English based on the Lang parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>Added 1 application signature library, such as DingTalk</p>
         */
        @NameInMap("DynamicInfo")
        public String dynamicInfo;

        /**
         * <p>The time when the signature library was updated. The value is a UNIX timestamp in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1731465600</p>
         */
        @NameInMap("UpdateTime")
        public Long updateTime;

        public static ListApplicationUpdateDynamicsResponseBodyDynamics build(java.util.Map<String, ?> map) throws Exception {
            ListApplicationUpdateDynamicsResponseBodyDynamics self = new ListApplicationUpdateDynamicsResponseBodyDynamics();
            return TeaModel.build(map, self);
        }

        public ListApplicationUpdateDynamicsResponseBodyDynamics setApplications(java.util.List<ListApplicationUpdateDynamicsResponseBodyDynamicsApplications> applications) {
            this.applications = applications;
            return this;
        }
        public java.util.List<ListApplicationUpdateDynamicsResponseBodyDynamicsApplications> getApplications() {
            return this.applications;
        }

        public ListApplicationUpdateDynamicsResponseBodyDynamics setDynamicInfo(String dynamicInfo) {
            this.dynamicInfo = dynamicInfo;
            return this;
        }
        public String getDynamicInfo() {
            return this.dynamicInfo;
        }

        public ListApplicationUpdateDynamicsResponseBodyDynamics setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

    }

}
