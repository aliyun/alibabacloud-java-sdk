// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeGroupMonitoringAgentProcessRequest extends TeaModel {
    /**
     * <p>The number of the page to return. Default value: 1.</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>Indicates whether the call was successful. The value true indicates a success. The value false indicates a failure.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The number of entries to return on each page. Default value: 10.</p>
     */
    @NameInMap("ProcessName")
    public String processName;

    @NameInMap("RegionId")
    public String regionId;

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

    public DescribeGroupMonitoringAgentProcessRequest setProcessName(String processName) {
        this.processName = processName;
        return this;
    }
    public String getProcessName() {
        return this.processName;
    }

    public DescribeGroupMonitoringAgentProcessRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
