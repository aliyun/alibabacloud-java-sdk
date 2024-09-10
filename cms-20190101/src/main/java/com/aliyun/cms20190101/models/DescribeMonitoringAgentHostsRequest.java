// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeMonitoringAgentHostsRequest extends TeaModel {
    /**
     * <p>Specifies whether to query Elastic Compute Service (ECS) instances that are provided by Alibaba Cloud or to query hosts that are not provided by Alibaba Cloud. Valid values:</p>
     * <ul>
     * <li>true (default value): queries all the ECS instances that are provided by Alibaba Cloud.</li>
     * <li>false: queries all the hosts that are not provided by Alibaba Cloud.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AliyunHost")
    public Boolean aliyunHost;

    /**
     * <p>The name of the host.</p>
     * 
     * <strong>example:</strong>
     * <p>hostNam1</p>
     */
    @NameInMap("HostName")
    public String hostName;

    /**
     * <p>The ID of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>i-a3d1q1pm2f9yr29e****</p>
     */
    @NameInMap("InstanceIds")
    public String instanceIds;

    /**
     * <p>The region ID of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("InstanceRegionId")
    public String instanceRegionId;

    /**
     * <p>The keyword that is used in fuzzy match.</p>
     * 
     * <strong>example:</strong>
     * <p>host1</p>
     */
    @NameInMap("KeyWord")
    public String keyWord;

    /**
     * <p>The number of the page to return.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. Valid values:</p>
     * <ul>
     * <li>10</li>
     * <li>20</li>
     * <li>50</li>
     * <li>100</li>
     * </ul>
     * <blockquote>
     * <p>Although Alibaba Cloud does not limit the maximum value of this parameter, we recommend that you do not set it to an excessively large value. If you set it to an excessively large value, a timeout error may occur.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The serial number of the host.</p>
     * <p>After the CloudMonitor agent is installed on a host, a globally unique serial number is generated. A host that is not provided by Alibaba Cloud has a serial number instead of an instance ID.</p>
     * <blockquote>
     * <p>This parameter can be used to accurately search for a monitored host.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>a1ab31a3-1234-40f2-9e95-c8caa8f0****</p>
     */
    @NameInMap("SerialNumbers")
    public String serialNumbers;

    /**
     * <p>The status of the hosts that you want to query. Valid values:</p>
     * <ul>
     * <li>Running: queries the hosts that are running.</li>
     * <li>Stopped: queries the hosts that are stopped, are not installed, or fail to be installed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Running</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The status of SysOM. Valid values:</p>
     * <ul>
     * <li>installing: SysOM is being installed.</li>
     * <li>running: SysOM is running.</li>
     * <li>stopped: SysOM is stopped.</li>
     * <li>uninstalling: SysOM is being uninstalled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>running</p>
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
