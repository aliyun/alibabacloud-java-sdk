// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetAiOutboundTaskExecDetailRequest extends TeaModel {
    @NameInMap("BatchVersion")
    public Integer batchVersion;

    @NameInMap("CaseId")
    public Long caseId;

    @NameInMap("CaseStatus")
    public Integer caseStatus;

    @NameInMap("CreateTimeEnd")
    public Long createTimeEnd;

    @NameInMap("CreateTimeStart")
    public Long createTimeStart;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PhoneNum")
    public String phoneNum;

    @NameInMap("TaskId")
    public Long taskId;

    public static GetAiOutboundTaskExecDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAiOutboundTaskExecDetailRequest self = new GetAiOutboundTaskExecDetailRequest();
        return TeaModel.build(map, self);
    }

    public GetAiOutboundTaskExecDetailRequest setBatchVersion(Integer batchVersion) {
        this.batchVersion = batchVersion;
        return this;
    }
    public Integer getBatchVersion() {
        return this.batchVersion;
    }

    public GetAiOutboundTaskExecDetailRequest setCaseId(Long caseId) {
        this.caseId = caseId;
        return this;
    }
    public Long getCaseId() {
        return this.caseId;
    }

    public GetAiOutboundTaskExecDetailRequest setCaseStatus(Integer caseStatus) {
        this.caseStatus = caseStatus;
        return this;
    }
    public Integer getCaseStatus() {
        return this.caseStatus;
    }

    public GetAiOutboundTaskExecDetailRequest setCreateTimeEnd(Long createTimeEnd) {
        this.createTimeEnd = createTimeEnd;
        return this;
    }
    public Long getCreateTimeEnd() {
        return this.createTimeEnd;
    }

    public GetAiOutboundTaskExecDetailRequest setCreateTimeStart(Long createTimeStart) {
        this.createTimeStart = createTimeStart;
        return this;
    }
    public Long getCreateTimeStart() {
        return this.createTimeStart;
    }

    public GetAiOutboundTaskExecDetailRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public GetAiOutboundTaskExecDetailRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetAiOutboundTaskExecDetailRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetAiOutboundTaskExecDetailRequest setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
        return this;
    }
    public String getPhoneNum() {
        return this.phoneNum;
    }

    public GetAiOutboundTaskExecDetailRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

}
