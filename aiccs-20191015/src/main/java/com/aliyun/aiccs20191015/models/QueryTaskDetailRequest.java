// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class QueryTaskDetailRequest extends TeaModel {
    /**
     * <p>The caller number.</p>
     * 
     * <strong>example:</strong>
     * <p>130****0000</p>
     */
    @NameInMap("Ani")
    public String ani;

    /**
     * <p>The current page number. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The list of department IDs.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("DepartmentIdList")
    public String departmentIdList;

    /**
     * <p>The called number.</p>
     * 
     * <strong>example:</strong>
     * <p>0571456****</p>
     */
    @NameInMap("Dnis")
    public String dnis;

    /**
     * <p>The call end reasons.</p>
     * 
     * <strong>example:</strong>
     * <p>110</p>
     */
    @NameInMap("EndReasonList")
    public String endReasonList;

    /**
     * <p>Instance ID of the AICCS instance. You can obtain instance ID in the <a href="https://aiccs.console.aliyun.com/overview">Artificial Intelligence Cloud Call Service console</a> by choosing Instances.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ccc_xp_pre***</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the outbound task.</p>
     * 
     * <strong>example:</strong>
     * <p>120001</p>
     */
    @NameInMap("OutboundTaskId")
    public String outboundTaskId;

    /**
     * <p>The number of entries per page. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The list of priorities. Valid values: <strong>1</strong> to <strong>100</strong>. A larger value indicates a higher priority.</p>
     * 
     * <strong>example:</strong>
     * <p>[1,2,3,5]</p>
     */
    @NameInMap("PriorityList")
    public String priorityList;

    /**
     * <p>The ID of the agent.</p>
     * 
     * <strong>example:</strong>
     * <p>1212</p>
     */
    @NameInMap("ServicerId")
    public String servicerId;

    /**
     * <p>The name of the agent.</p>
     * 
     * <strong>example:</strong>
     * <p>John Doe</p>
     */
    @NameInMap("ServicerName")
    public String servicerName;

    /**
     * <p>The ID of the session.</p>
     * 
     * <strong>example:</strong>
     * <p>1004849</p>
     */
    @NameInMap("Sid")
    public String sid;

    /**
     * <p>The ID of the skill group.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("SkillGroup")
    public String skillGroup;

    /**
     * <p>The list of task statuses. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: Not started.</li>
     * <li><strong>2</strong>: In progress.</li>
     * <li><strong>3</strong>: Paused.</li>
     * <li><strong>4</strong>: Expired.</li>
     * <li><strong>5</strong>: Completed.</li>
     * <li><strong>6</strong>: Deleted.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>[1,2,3,5]</p>
     */
    @NameInMap("StatusList")
    public String statusList;

    /**
     * <p>The ID of the task detail.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("TaskId")
    public Long taskId;

    public static QueryTaskDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryTaskDetailRequest self = new QueryTaskDetailRequest();
        return TeaModel.build(map, self);
    }

    public QueryTaskDetailRequest setAni(String ani) {
        this.ani = ani;
        return this;
    }
    public String getAni() {
        return this.ani;
    }

    public QueryTaskDetailRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public QueryTaskDetailRequest setDepartmentIdList(String departmentIdList) {
        this.departmentIdList = departmentIdList;
        return this;
    }
    public String getDepartmentIdList() {
        return this.departmentIdList;
    }

    public QueryTaskDetailRequest setDnis(String dnis) {
        this.dnis = dnis;
        return this;
    }
    public String getDnis() {
        return this.dnis;
    }

    public QueryTaskDetailRequest setEndReasonList(String endReasonList) {
        this.endReasonList = endReasonList;
        return this;
    }
    public String getEndReasonList() {
        return this.endReasonList;
    }

    public QueryTaskDetailRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public QueryTaskDetailRequest setOutboundTaskId(String outboundTaskId) {
        this.outboundTaskId = outboundTaskId;
        return this;
    }
    public String getOutboundTaskId() {
        return this.outboundTaskId;
    }

    public QueryTaskDetailRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryTaskDetailRequest setPriorityList(String priorityList) {
        this.priorityList = priorityList;
        return this;
    }
    public String getPriorityList() {
        return this.priorityList;
    }

    public QueryTaskDetailRequest setServicerId(String servicerId) {
        this.servicerId = servicerId;
        return this;
    }
    public String getServicerId() {
        return this.servicerId;
    }

    public QueryTaskDetailRequest setServicerName(String servicerName) {
        this.servicerName = servicerName;
        return this;
    }
    public String getServicerName() {
        return this.servicerName;
    }

    public QueryTaskDetailRequest setSid(String sid) {
        this.sid = sid;
        return this;
    }
    public String getSid() {
        return this.sid;
    }

    public QueryTaskDetailRequest setSkillGroup(String skillGroup) {
        this.skillGroup = skillGroup;
        return this;
    }
    public String getSkillGroup() {
        return this.skillGroup;
    }

    public QueryTaskDetailRequest setStatusList(String statusList) {
        this.statusList = statusList;
        return this;
    }
    public String getStatusList() {
        return this.statusList;
    }

    public QueryTaskDetailRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

}
