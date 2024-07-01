// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain_intl20171218.models;

import com.aliyun.tea.*;

public class PollTaskResultRequest extends TeaModel {
    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Lang")
    public String lang;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("PageNum")
    public Integer pageNum;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("TaskNo")
    public String taskNo;

    @NameInMap("TaskResultStatus")
    public Integer taskResultStatus;

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
