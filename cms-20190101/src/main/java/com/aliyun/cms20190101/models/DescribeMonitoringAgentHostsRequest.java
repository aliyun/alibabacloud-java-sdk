// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeMonitoringAgentHostsRequest extends TeaModel {
    /**
     * <p>Specifies whether to filter for Alibaba Cloud Elastic Compute Service (ECS) instances. Valid values:</p>
     * <ul>
     * <li><p>true (default): Returns only ECS instances.</p>
     * </li>
     * <li><p>false: Returns only hosts that are not ECS instances.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AliyunHost")
    public Boolean aliyunHost;

    /**
     * <p>The hostname.</p>
     * 
     * <strong>example:</strong>
     * <p>hostNam1</p>
     */
    @NameInMap("HostName")
    public String hostName;

    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>i-a3d1q1pm2f9yr29e****</p>
     */
    @NameInMap("InstanceIds")
    public String instanceIds;

    /**
     * <p>The region where the instance resides.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("InstanceRegionId")
    public String instanceRegionId;

    /**
     * <p>The keyword for a fuzzy search.</p>
     * 
     * <strong>example:</strong>
     * <p>host1</p>
     */
    @NameInMap("KeyWord")
    public String keyWord;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. Valid values:</p>
     * <ul>
     * <li><p>10</p>
     * </li>
     * <li><p>20</p>
     * </li>
     * <li><p>50</p>
     * </li>
     * <li><p>100</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>Alibaba Cloud does not limit the maximum value of this parameter. However, setting this parameter to a large value may cause a timeout.</p>
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
     * <p>A globally unique serial number is generated after the CloudMonitor agent is successfully installed on a host. Hosts that are not Alibaba Cloud instances do not have an instance ID, but have a serial number.</p>
     * <blockquote>
     * <p>Use this parameter to find a specific monitored host.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>a1ab31a3-1234-40f2-9e95-c8caa8f0****</p>
     */
    @NameInMap("SerialNumbers")
    public String serialNumbers;

    /**
     * <p>The status of the host. Valid values:</p>
     * <ul>
     * <li><p>Running: The host is running.</p>
     * </li>
     * <li><p>Stopped: The host is stopped, the agent is not installed, or the agent installation failed.</p>
     * </li>
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
     * <li><p>installing: SysOM is being enabled.</p>
     * </li>
     * <li><p>running: SysOM is running.</p>
     * </li>
     * <li><p>stopped: SysOM is stopped.</p>
     * </li>
     * <li><p>uninstalling: SysOM is being disabled.</p>
     * </li>
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
