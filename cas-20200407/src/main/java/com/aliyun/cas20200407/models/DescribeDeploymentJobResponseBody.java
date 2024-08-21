// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class DescribeDeploymentJobResponseBody extends TeaModel {
    /**
     * <p>The information about the contact.</p>
     */
    @NameInMap("CasContacts")
    public java.util.List<DescribeDeploymentJobResponseBodyCasContacts> casContacts;

    /**
     * <p>The domain names bound to the certificate of the deployment task.</p>
     * 
     * <strong>example:</strong>
     * <p>example.aliyundoc.com,demo.aliyundoc.com</p>
     */
    @NameInMap("CertDomain")
    public String certDomain;

    /**
     * <p>The type of the certificate. Valid values:</p>
     * <ul>
     * <li><strong>upload</strong>: uploaded certificate</li>
     * <li><strong>buy</strong>: purchased certificate</li>
     * <li><strong>free</strong>: free certificate available only on the China site (aliyun.com)</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>buy</p>
     */
    @NameInMap("CertType")
    public String certType;

    /**
     * <p>The configurations of the deployment task.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;shareCertIds\&quot;:[],\&quot;certIds\&quot;:[12342649,12304338,12067351,9957285]}</p>
     */
    @NameInMap("Config")
    public String config;

    /**
     * <p>Indicates whether the deployment job was deleted. Valid values:</p>
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
     * <p>The end time of the deployment job. The value is a UNIX timestamp. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1679541809000</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The time when the deployment job was created. The value is a UNIX timestamp. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1679541809000</p>
     */
    @NameInMap("GmtCreate")
    public String gmtCreate;

    /**
     * <p>The time when the deployment job was last modified. The value is a UNIX timestamp. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1679541809000</p>
     */
    @NameInMap("GmtModified")
    public String gmtModified;

    /**
     * <p>The ID of the deployment job.</p>
     * 
     * <strong>example:</strong>
     * <p>8888</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The instance ID of the deployment task.</p>
     * 
     * <strong>example:</strong>
     * <p>14dcc8afc7578e1f</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The type of the deployment job. Valid values:</p>
     * <ul>
     * <li><strong>cloud</strong>: multi-cloud deployment job.</li>
     * <li><strong>trustee</strong>: hosted deployment job available only on the China site (aliyun.com).</li>
     * <li><strong>user</strong>: cloud service deployment job. The cloud server is not included.</li>
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
     * <p>auto-test-AXX</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The cloud services included in the deployment task.</p>
     * 
     * <strong>example:</strong>
     * <p>CDN</p>
     */
    @NameInMap("ProductName")
    public String productName;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>15C66C7B-671A-4297-9187-2C4477247A74</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the deployment job includes the rollback worker. For example, if a cloud service in a deployment job has been rolled back, <strong>1</strong> is returned. Valid values:</p>
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
     * <p>The time when the deployment job was scheduled. The value is a UNIX timestamp. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1678083209335</p>
     */
    @NameInMap("ScheduleTime")
    public String scheduleTime;

    /**
     * <p>The start time of the deployment job. The value is a UNIX timestamp. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1679541809000</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The status of the deployment job. Valid values:</p>
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
     * <p>editing</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The ID of the Alibaba Cloud account in which the deployment job is created.</p>
     * 
     * <strong>example:</strong>
     * <p>166688437XXXX785</p>
     */
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
        /**
         * <p>The email address of the contact.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:username@example.com">username@example.com</a></p>
         */
        @NameInMap("Email")
        public String email;

        /**
         * <p>The ID of the contact.</p>
         * 
         * <strong>example:</strong>
         * <p>3304</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The phone number of the contact.</p>
         * 
         * <strong>example:</strong>
         * <p>139****0000</p>
         */
        @NameInMap("Mobile")
        public String mobile;

        /**
         * <p>The name of the contact.</p>
         * 
         * <strong>example:</strong>
         * <p>zhangsan</p>
         */
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
