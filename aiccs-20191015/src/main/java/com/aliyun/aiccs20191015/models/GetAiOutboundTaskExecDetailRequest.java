// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetAiOutboundTaskExecDetailRequest extends TeaModel {
    // 实例ID
    @NameInMap("InstanceId")
    public String instanceId;

    // 任务id
    @NameInMap("TaskId")
    public Long taskId;

    // 任务批次
    @NameInMap("BatchVersion")
    public Integer batchVersion;

    // 手机号
    @NameInMap("PhoneNum")
    public String phoneNum;

    // 单条号码任务执行状态（1：待呼叫，2:呼叫中，3:已完成，4:已终止，5:待重呼）
    @NameInMap("CaseStatus")
    public Integer caseStatus;

    // 号码导入起始时间戳（毫秒）
    @NameInMap("CreateTimeStart")
    public Long createTimeStart;

    // 号码导入结束时间戳（毫秒）
    @NameInMap("CreateTimeEnd")
    public Long createTimeEnd;

    // 分页大小（<=50）
    @NameInMap("PageSize")
    public Integer pageSize;

    // 当前页数
    @NameInMap("CurrentPage")
    public Integer currentPage;

    // 单条外呼id
    @NameInMap("CaseId")
    public Long caseId;

    public static GetAiOutboundTaskExecDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAiOutboundTaskExecDetailRequest self = new GetAiOutboundTaskExecDetailRequest();
        return TeaModel.build(map, self);
    }

    public GetAiOutboundTaskExecDetailRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetAiOutboundTaskExecDetailRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

    public GetAiOutboundTaskExecDetailRequest setBatchVersion(Integer batchVersion) {
        this.batchVersion = batchVersion;
        return this;
    }
    public Integer getBatchVersion() {
        return this.batchVersion;
    }

    public GetAiOutboundTaskExecDetailRequest setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
        return this;
    }
    public String getPhoneNum() {
        return this.phoneNum;
    }

    public GetAiOutboundTaskExecDetailRequest setCaseStatus(Integer caseStatus) {
        this.caseStatus = caseStatus;
        return this;
    }
    public Integer getCaseStatus() {
        return this.caseStatus;
    }

    public GetAiOutboundTaskExecDetailRequest setCreateTimeStart(Long createTimeStart) {
        this.createTimeStart = createTimeStart;
        return this;
    }
    public Long getCreateTimeStart() {
        return this.createTimeStart;
    }

    public GetAiOutboundTaskExecDetailRequest setCreateTimeEnd(Long createTimeEnd) {
        this.createTimeEnd = createTimeEnd;
        return this;
    }
    public Long getCreateTimeEnd() {
        return this.createTimeEnd;
    }

    public GetAiOutboundTaskExecDetailRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetAiOutboundTaskExecDetailRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public GetAiOutboundTaskExecDetailRequest setCaseId(Long caseId) {
        this.caseId = caseId;
        return this;
    }
    public Long getCaseId() {
        return this.caseId;
    }

}
