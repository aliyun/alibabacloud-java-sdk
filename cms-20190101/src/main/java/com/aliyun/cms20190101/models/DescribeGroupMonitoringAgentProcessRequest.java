// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeGroupMonitoringAgentProcessRequest extends TeaModel {
    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("ProcessName")
    public String processName;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static DescribeGroupMonitoringAgentProcessRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeGroupMonitoringAgentProcessRequest self = new DescribeGroupMonitoringAgentProcessRequest();
        return TeaModel.build(map, self);
    }

    public DescribeGroupMonitoringAgentProcessRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public DescribeGroupMonitoringAgentProcessRequest setProcessName(String processName) {
        this.processName = processName;
        return this;
    }
    public String getProcessName() {
        return this.processName;
    }

    public DescribeGroupMonitoringAgentProcessRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeGroupMonitoringAgentProcessRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
