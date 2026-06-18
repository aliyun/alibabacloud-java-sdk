// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetAiOutboundTaskExecDetailRequest extends TeaModel {
    /**
     * <p>The job batch version.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("BatchVersion")
    public Integer batchVersion;

    /**
     * <p>Activity ID associated with this outbound call.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("CaseId")
    public Long caseId;

    /**
     * <p>Job execution status for a single phone number. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: Pending call.</li>
     * <li><strong>2</strong>: Calling.</li>
     * <li><strong>3</strong>: Completed.</li>
     * <li><strong>4</strong>: Stopped.</li>
     * <li><strong>5</strong>: Pending retry.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CaseStatus")
    public Integer caseStatus;

    /**
     * <p>End time of phone number import. Format: UNIX timestamp in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1632290119000</p>
     */
    @NameInMap("CreateTimeEnd")
    public Long createTimeEnd;

    /**
     * <p>Start time of phone number import. Format: UNIX timestamp in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1632289999000</p>
     */
    @NameInMap("CreateTimeStart")
    public Long createTimeStart;

    /**
     * <p>Page size. The value must be greater than <strong>0</strong>. Default Value: <strong>20</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The Artificial Intelligence Cloud Call Service (AICCS) instance ID.</p>
     * <p>You can obtain it from <strong>Instance Management</strong> in the left-side navigation pane of the <a href="https://aiccs.console.aliyun.com/overview">Artificial Intelligence Cloud Call Service console</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>agent_***</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The number of entries per page. The value must be greater than <strong>0</strong>. Default value: <strong>20</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The outbound phone number.</p>
     * 
     * <strong>example:</strong>
     * <p>150****000</p>
     */
    @NameInMap("PhoneNum")
    public String phoneNum;

    /**
     * <p>The job ID.</p>
     * <p>You can invoke the <a href="https://help.aliyun.com/document_detail/312260.html">CreateAiOutboundTask</a> API and check the <strong>Data</strong> field in the response, or invoke the <a href="https://help.aliyun.com/document_detail/2718026.html">GetAiOutboundTaskList</a> API and check the <strong>TaskId</strong> field in the response.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
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
