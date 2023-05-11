// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeMonitoringAgentHostsRequest extends TeaModel {
    /**
     * <p>Specifies whether to query Elastic Compute Service (ECS) instances that are provided by Alibaba Cloud or to query hosts that are not provided by Alibaba Cloud. Valid values:</p>
     * <br>
     * <p>*   true (default value): queries all the ECS instances that are provided by Alibaba Cloud.</p>
     * <p>*   false: queries all the hosts that are not provided by Alibaba Cloud.</p>
     */
    @NameInMap("AliyunHost")
    public Boolean aliyunHost;

    /**
     * <p>The name of the host.</p>
     */
    @NameInMap("HostName")
    public String hostName;

    /**
     * <p>The ID of the instance.</p>
     */
    @NameInMap("InstanceIds")
    public String instanceIds;

    /**
     * <p>The region ID of the instance.</p>
     */
    @NameInMap("InstanceRegionId")
    public String instanceRegionId;

    /**
     * <p>The keyword that is used in fuzzy match.</p>
     */
    @NameInMap("KeyWord")
    public String keyWord;

    /**
     * <p>The number of the page to return.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. Valid values:</p>
     * <br>
     * <p>*   10</p>
     * <p>*   20</p>
     * <p>*   50</p>
     * <p>*   100</p>
     * <br>
     * <p>> Although Alibaba Cloud does not limit the maximum value of this parameter, we recommend that you do not set it to an excessively large value. If you set it to an excessively large value, a timeout error may occur.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The serial number of the host.</p>
     * <br>
     * <p>After the CloudMonitor agent is installed on a host, a globally unique serial number is generated. A host that is not provided by Alibaba Cloud has a serial number instead of an instance ID.</p>
     * <br>
     * <p>> This parameter can be used to accurately search for a monitored host.</p>
     */
    @NameInMap("SerialNumbers")
    public String serialNumbers;

    /**
     * <p>The status of the hosts that you want to query. Valid values:</p>
     * <br>
     * <p>*   Running: queries the hosts that are running.</p>
     * <p>*   Stopped: queries the hosts that are stopped, are not installed, or fail to be installed.</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The status of SysOM. Valid values:</p>
     * <br>
     * <p>*   installing: SysOM is being installed.</p>
     * <p>*   running: SysOM is running.</p>
     * <p>*   stopped: SysOM is stopped.</p>
     * <p>*   uninstalling: SysOM is being uninstalled.</p>
     */
    @NameInMap("SysomStatus")
    public String sysomStatus;

    public static DescribeMonitoringAgentHostsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeMonitoringAgentHostsRequest self = new DescribeMonitoringAgentHostsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeMonitoringAgentHostsRequest setAliyunHost(Boolean aliyunHost) {
        this.aliyunHost = aliyunHost;
        return this;
    }
    public Boolean getAliyunHost() {
        return this.aliyunHost;
    }

    public DescribeMonitoringAgentHostsRequest setHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }
    public String getHostName() {
        return this.hostName;
    }

    public DescribeMonitoringAgentHostsRequest setInstanceIds(String instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public String getInstanceIds() {
        return this.instanceIds;
    }

    public DescribeMonitoringAgentHostsRequest setInstanceRegionId(String instanceRegionId) {
        this.instanceRegionId = instanceRegionId;
        return this;
    }
    public String getInstanceRegionId() {
        return this.instanceRegionId;
    }

    public DescribeMonitoringAgentHostsRequest setKeyWord(String keyWord) {
        this.keyWord = keyWord;
        return this;
    }
    public String getKeyWord() {
        return this.keyWord;
    }

    public DescribeMonitoringAgentHostsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeMonitoringAgentHostsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeMonitoringAgentHostsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeMonitoringAgentHostsRequest setSerialNumbers(String serialNumbers) {
        this.serialNumbers = serialNumbers;
        return this;
    }
    public String getSerialNumbers() {
        return this.serialNumbers;
    }

    public DescribeMonitoringAgentHostsRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeMonitoringAgentHostsRequest setSysomStatus(String sysomStatus) {
        this.sysomStatus = sysomStatus;
        return this;
    }
    public String getSysomStatus() {
        return this.sysomStatus;
    }

}
