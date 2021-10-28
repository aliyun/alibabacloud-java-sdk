// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class QueryTaskDetailRequest extends TeaModel {
    @NameInMap("Ani")
    public String ani;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("DepartmentIdList")
    public String departmentIdList;

    @NameInMap("Dnis")
    public String dnis;

    @NameInMap("EndReasonList")
    public String endReasonList;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("OutboundTaskId")
    public String outboundTaskId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PriorityList")
    public String priorityList;

    @NameInMap("ServicerId")
    public String servicerId;

    @NameInMap("ServicerName")
    public String servicerName;

    @NameInMap("Sid")
    public String sid;

    @NameInMap("SkillGroup")
    public String skillGroup;

    @NameInMap("StatusList")
    public String statusList;

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
