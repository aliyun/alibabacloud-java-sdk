// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class ListDeploymentJobResponseBody extends TeaModel {
    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("Data")
    public java.util.List<ListDeploymentJobResponseBodyData> data;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ShowSize")
    public Integer showSize;

    @NameInMap("Total")
    public Long total;

    public static ListDeploymentJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDeploymentJobResponseBody self = new ListDeploymentJobResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDeploymentJobResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListDeploymentJobResponseBody setData(java.util.List<ListDeploymentJobResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListDeploymentJobResponseBodyData> getData() {
        return this.data;
    }

    public ListDeploymentJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDeploymentJobResponseBody setShowSize(Integer showSize) {
        this.showSize = showSize;
        return this;
    }
    public Integer getShowSize() {
        return this.showSize;
    }

    public ListDeploymentJobResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public static class ListDeploymentJobResponseBodyData extends TeaModel {
        @NameInMap("CertDomain")
        public String certDomain;

        @NameInMap("CertType")
        public String certType;

        @NameInMap("Del")
        public Integer del;

        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("Id")
        public Long id;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("JobType")
        public String jobType;

        @NameInMap("Name")
        public String name;

        @NameInMap("ProductName")
        public String productName;

        @NameInMap("Rollback")
        public Integer rollback;

        @NameInMap("ScheduleTime")
        public String scheduleTime;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("Status")
        public String status;

        @NameInMap("UserId")
        public Long userId;

        public static ListDeploymentJobResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListDeploymentJobResponseBodyData self = new ListDeploymentJobResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListDeploymentJobResponseBodyData setCertDomain(String certDomain) {
            this.certDomain = certDomain;
            return this;
        }
        public String getCertDomain() {
            return this.certDomain;
        }

        public ListDeploymentJobResponseBodyData setCertType(String certType) {
            this.certType = certType;
            return this;
        }
        public String getCertType() {
            return this.certType;
        }

        public ListDeploymentJobResponseBodyData setDel(Integer del) {
            this.del = del;
            return this;
        }
        public Integer getDel() {
            return this.del;
        }

        public ListDeploymentJobResponseBodyData setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public ListDeploymentJobResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListDeploymentJobResponseBodyData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListDeploymentJobResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListDeploymentJobResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListDeploymentJobResponseBodyData setJobType(String jobType) {
            this.jobType = jobType;
            return this;
        }
        public String getJobType() {
            return this.jobType;
        }

        public ListDeploymentJobResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListDeploymentJobResponseBodyData setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

        public ListDeploymentJobResponseBodyData setRollback(Integer rollback) {
            this.rollback = rollback;
            return this;
        }
        public Integer getRollback() {
            return this.rollback;
        }

        public ListDeploymentJobResponseBodyData setScheduleTime(String scheduleTime) {
            this.scheduleTime = scheduleTime;
            return this;
        }
        public String getScheduleTime() {
            return this.scheduleTime;
        }

        public ListDeploymentJobResponseBodyData setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public ListDeploymentJobResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListDeploymentJobResponseBodyData setUserId(Long userId) {
            this.userId = userId;
            return this;
        }
        public Long getUserId() {
            return this.userId;
        }

    }

}
