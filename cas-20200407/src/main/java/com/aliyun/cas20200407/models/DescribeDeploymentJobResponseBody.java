// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class DescribeDeploymentJobResponseBody extends TeaModel {
    @NameInMap("CasContacts")
    public java.util.List<DescribeDeploymentJobResponseBodyCasContacts> casContacts;

    @NameInMap("CertDomain")
    public String certDomain;

    @NameInMap("CertType")
    public String certType;

    @NameInMap("Config")
    public String config;

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

    @NameInMap("RequestId")
    public String requestId;

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

    public static DescribeDeploymentJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDeploymentJobResponseBody self = new DescribeDeploymentJobResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDeploymentJobResponseBody setCasContacts(java.util.List<DescribeDeploymentJobResponseBodyCasContacts> casContacts) {
        this.casContacts = casContacts;
        return this;
    }
    public java.util.List<DescribeDeploymentJobResponseBodyCasContacts> getCasContacts() {
        return this.casContacts;
    }

    public DescribeDeploymentJobResponseBody setCertDomain(String certDomain) {
        this.certDomain = certDomain;
        return this;
    }
    public String getCertDomain() {
        return this.certDomain;
    }

    public DescribeDeploymentJobResponseBody setCertType(String certType) {
        this.certType = certType;
        return this;
    }
    public String getCertType() {
        return this.certType;
    }

    public DescribeDeploymentJobResponseBody setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public DescribeDeploymentJobResponseBody setDel(Integer del) {
        this.del = del;
        return this;
    }
    public Integer getDel() {
        return this.del;
    }

    public DescribeDeploymentJobResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeDeploymentJobResponseBody setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public DescribeDeploymentJobResponseBody setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public DescribeDeploymentJobResponseBody setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public DescribeDeploymentJobResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeDeploymentJobResponseBody setJobType(String jobType) {
        this.jobType = jobType;
        return this;
    }
    public String getJobType() {
        return this.jobType;
    }

    public DescribeDeploymentJobResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeDeploymentJobResponseBody setProductName(String productName) {
        this.productName = productName;
        return this;
    }
    public String getProductName() {
        return this.productName;
    }

    public DescribeDeploymentJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDeploymentJobResponseBody setRollback(Integer rollback) {
        this.rollback = rollback;
        return this;
    }
    public Integer getRollback() {
        return this.rollback;
    }

    public DescribeDeploymentJobResponseBody setScheduleTime(String scheduleTime) {
        this.scheduleTime = scheduleTime;
        return this;
    }
    public String getScheduleTime() {
        return this.scheduleTime;
    }

    public DescribeDeploymentJobResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeDeploymentJobResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeDeploymentJobResponseBody setUserId(Long userId) {
        this.userId = userId;
        return this;
    }
    public Long getUserId() {
        return this.userId;
    }

    public static class DescribeDeploymentJobResponseBodyCasContacts extends TeaModel {
        @NameInMap("Email")
        public String email;

        @NameInMap("Id")
        public String id;

        @NameInMap("Mobile")
        public String mobile;

        @NameInMap("Name")
        public String name;

        public static DescribeDeploymentJobResponseBodyCasContacts build(java.util.Map<String, ?> map) throws Exception {
            DescribeDeploymentJobResponseBodyCasContacts self = new DescribeDeploymentJobResponseBodyCasContacts();
            return TeaModel.build(map, self);
        }

        public DescribeDeploymentJobResponseBodyCasContacts setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public DescribeDeploymentJobResponseBodyCasContacts setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeDeploymentJobResponseBodyCasContacts setMobile(String mobile) {
            this.mobile = mobile;
            return this;
        }
        public String getMobile() {
            return this.mobile;
        }

        public DescribeDeploymentJobResponseBodyCasContacts setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
