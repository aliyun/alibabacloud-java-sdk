// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class ListDeploymentJobResponseBody extends TeaModel {
    /**
     * <p>The current page number. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The data returned by the API.</p>
     */
    @NameInMap("Data")
    public java.util.List<ListDeploymentJobResponseBodyData> data;

    /**
     * <p>The request ID. Alibaba Cloud generates a unique identifier for each request. You can use this ID to troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>12345678-1234-1234-1234-123456789ABC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of deployment tasks per page. Default value: <strong>50</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("ShowSize")
    public Integer showSize;

    /**
     * <p>The total number of deployment tasks returned.</p>
     * 
     * <strong>example:</strong>
     * <p>7</p>
     */
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
        /**
         * <p>The domain names included in the certificate of the deployment task.</p>
         * 
         * <strong>example:</strong>
         * <p>aliyundoc1.com,aliyundoc2.com,aliyundoc3.com</p>
         */
        @NameInMap("CertDomain")
        public String certDomain;

        /**
         * <p>The certificate type. Valid values:</p>
         * <ul>
         * <li><strong>upload</strong>: uploaded certificate</li>
         * <li><strong>buy</strong>: purchased certificate</li>
         * <li><strong>free</strong>: personal test certificate (supported only on the China site)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>upload</p>
         */
        @NameInMap("CertType")
        public String certType;

        /**
         * <p>The deletion flag. This parameter has no practical significance. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: not deleted.</li>
         * <li><strong>1</strong>: deleted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Del")
        public Integer del;

        /**
         * <p>The end time of the deployment task execution, in UNIX timestamp format (seconds).</p>
         * 
         * <strong>example:</strong>
         * <p>1606482979000</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The time when the deployment task was created, in UNIX timestamp format (seconds).</p>
         * 
         * <strong>example:</strong>
         * <p>1624343180000</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The time when the deployment task was last modified, in UNIX timestamp format (seconds).</p>
         * 
         * <strong>example:</strong>
         * <p>1606482979000</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The deployment task ID. You can use this ID to query the deployment task details and status.</p>
         * 
         * <strong>example:</strong>
         * <p>19975</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The instance ID of the deployment task.</p>
         * 
         * <strong>example:</strong>
         * <p>cas-job-user-***</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The task type. Valid values:</p>
         * <ul>
         * <li><strong>cloud</strong>: multi-cloud deployment task.</li>
         * <li><strong>user</strong>: cloud service deployment task (excluding ECS instances).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>user</p>
         */
        @NameInMap("JobType")
        public String jobType;

        /**
         * <p>The name of the deployment task.</p>
         * 
         * <strong>example:</strong>
         * <p>job-test</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The cloud services included in the deployment task resources.</p>
         * 
         * <strong>example:</strong>
         * <p>NLB</p>
         */
        @NameInMap("ProductName")
        public String productName;

        /**
         * <p>Indicates whether the task contains a rollback worker. For example, if a cloud service in the task has been rolled back, the value <strong>1</strong> is returned. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: does not contain a rollback worker.</li>
         * <li><strong>1</strong>: contains a rollback worker.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Rollback")
        public Integer rollback;

        /**
         * <p>The scheduled time of the task, in UNIX timestamp format (seconds).</p>
         * 
         * <strong>example:</strong>
         * <p>1606482979000</p>
         */
        @NameInMap("ScheduleTime")
        public String scheduleTime;

        /**
         * <p>The start time of the deployment task execution, in UNIX timestamp format (seconds).</p>
         * 
         * <strong>example:</strong>
         * <p>1606482979000</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The deployment task status. Valid values:</p>
         * <ul>
         * <li><strong>pending</strong>: pending execution.</li>
         * <li><strong>editing</strong>: being edited.</li>
         * <li><strong>scheduling</strong>: being scheduled.</li>
         * <li><strong>processing</strong>: being deployed.</li>
         * <li><strong>error</strong>: deployment failed.</li>
         * <li><strong>success</strong>: deployment succeeded.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>scheduling</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The user account ID (UID).</p>
         * 
         * <strong>example:</strong>
         * <p>166688437*****</p>
         */
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
