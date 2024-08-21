// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class ListDeploymentJobResponseBody extends TeaModel {
    /**
     * <p>The page number. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The data returned for the request.</p>
     */
    @NameInMap("Data")
    public java.util.List<ListDeploymentJobResponseBodyData> data;

    /**
     * <p>The request ID.</p>
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
     * <p>20</p>
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
         * <p>The domain names bound to the certificate of the deployment task.</p>
         * 
         * <strong>example:</strong>
         * <p>aliyundoc1.com,aliyundoc2.com,aliyundoc3.com</p>
         */
        @NameInMap("CertDomain")
        public String certDomain;

        /**
         * <p>The type of the certificate. Valid values:</p>
         * <ul>
         * <li><strong>upload</strong>: uploaded certificate</li>
         * <li><strong>buy</strong>: purchased certificate</li>
         * <li><strong>free</strong>: free certificate, available only on the China site (aliyun.com)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>upload</p>
         */
        @NameInMap("CertType")
        public String certType;

        /**
         * <p>Indicates whether the deployment task is deleted. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: not deleted</li>
         * <li><strong>1</strong>: deleted</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Del")
        public Integer del;

        /**
         * <p>The end time of the deployment task.</p>
         * 
         * <strong>example:</strong>
         * <p>1606482979000</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The time when the deployment task was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1624343180000</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The time when the deployment task was last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>1606482979000</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The ID of the deployment task. You can use the ID to query the details and status of the deployment task.</p>
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
         * <p>cas-job-user-0gvntn</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The type of the deployment task.</p>
         * <ul>
         * <li><strong>cloud</strong>: multi-cloud deployment task.</li>
         * <li><strong>user</strong>: cloud service deployment task. This type of task does not support ECS instances.</li>
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
         * <p>The cloud service included in the resources of the deployment task.</p>
         * 
         * <strong>example:</strong>
         * <p>NLB</p>
         */
        @NameInMap("ProductName")
        public String productName;

        /**
         * <p>Indicates whether the rollback worker is included. For example, if a cloud service involved in a deployment task has been rolled back, <strong>1</strong> is returned. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: The rollback worker is not included.</li>
         * <li><strong>1</strong>: The rollback worker is included.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Rollback")
        public Integer rollback;

        /**
         * <p>The time when the deployment task was scheduled.</p>
         * 
         * <strong>example:</strong>
         * <p>1606482979000</p>
         */
        @NameInMap("ScheduleTime")
        public String scheduleTime;

        /**
         * <p>The start time of the deployment task.</p>
         * 
         * <strong>example:</strong>
         * <p>1606482979000</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The status of the deployment task. Valid values:</p>
         * <ul>
         * <li><strong>pending</strong></li>
         * <li><strong>editing</strong></li>
         * <li><strong>scheduling</strong></li>
         * <li><strong>processing</strong></li>
         * <li><strong>error</strong></li>
         * <li><strong>success</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>scheduling</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The ID of the user.</p>
         * 
         * <strong>example:</strong>
         * <p>1666884372152785</p>
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
