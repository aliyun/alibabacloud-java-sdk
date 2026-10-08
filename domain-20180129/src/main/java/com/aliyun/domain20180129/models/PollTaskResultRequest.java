// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class PollTaskResultRequest extends TeaModel {
    /**
     * <p>Domain name.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>Domain instance ID.</p>
     * <p>The system automatically generates this after the information template is created successfully. You can invoke the <a href="https://help.aliyun.com/document_detail/67701.html">QueryRegistrantProfiles</a> API to query the information template ID.</p>
     * 
     * <strong>example:</strong>
     * <p>S20181T0WLI85212</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Language of error messages returned by the API. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese.</li>
     * <li><strong>en</strong>: English.</li>
     * </ul>
     * <p>Default value is <strong>en</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>Page number.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNum")
    public Integer pageNum;

    /**
     * <p>Page size. Maximum value is <strong>1000</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Job number.</p>
     * 
     * <strong>example:</strong>
     * <p>75addb07-28a3-450e-b5ec-test</p>
     */
    @NameInMap("TaskNo")
    public String taskNo;

    /**
     * <p>Task result status. Valid values:</p>
     * <ul>
     * <li><strong>2</strong>: Succeeded.</li>
     * <li><strong>3</strong>: Failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("TaskResultStatus")
    public Integer taskResultStatus;

    /**
     * <p>User IP address. It can be set to <strong>127.0.0.1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>127.0.0.1</p>
     */
    @NameInMap("UserClientIp")
    public String userClientIp;

    public static PollTaskResultRequest build(java.util.Map<String, ?> map) throws Exception {
        PollTaskResultRequest self = new PollTaskResultRequest();
        return TeaModel.build(map, self);
    }

    public PollTaskResultRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public PollTaskResultRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public PollTaskResultRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public PollTaskResultRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public PollTaskResultRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public PollTaskResultRequest setTaskNo(String taskNo) {
        this.taskNo = taskNo;
        return this;
    }
    public String getTaskNo() {
        return this.taskNo;
    }

    public PollTaskResultRequest setTaskResultStatus(Integer taskResultStatus) {
        this.taskResultStatus = taskResultStatus;
        return this;
    }
    public Integer getTaskResultStatus() {
        return this.taskResultStatus;
    }

    public PollTaskResultRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

}
