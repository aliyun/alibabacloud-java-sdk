// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class DescribeServiceLogRequest extends TeaModel {
    /**
     * <p>The name of the container that runs the service.</p>
     * 
     * <strong>example:</strong>
     * <p>worker0</p>
     */
    @NameInMap("ContainerName")
    public String containerName;

    /**
     * <p>The end of the time range to query. The time must be in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2006-01-02 15:04:05</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The name of the instance that runs the service. For more information about how to query the instance name, see <a href="https://help.aliyun.com/document_detail/412108.html">ListServiceInstances</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>echo-da290ac8-7fckm</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>The IP address of the instance whose logs you want to query. For more information about how to query the IP address of an instance, see <a href="https://help.aliyun.com/document_detail/412108.html">ListServiceInstances</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>10.0.0.1</p>
     */
    @NameInMap("Ip")
    public String ip;

    /**
     * <p>The keyword that you use to query the logs of the service.</p>
     * 
     * <strong>example:</strong>
     * <p>key</p>
     */
    @NameInMap("Keyword")
    public String keyword;

    /**
     * <p>The page number. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNum")
    public Long pageNum;

    /**
     * <p>The number of entries per page. Default value: 500.</p>
     * 
     * <strong>example:</strong>
     * <p>500</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>Specifies whether to query the logs that are generated before the instance last restarts. This parameter is available only if the instance restarts.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><p>true</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- -->
     * </li>
     * <li><p>false</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- --></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Previous")
    public Boolean previous;

    /**
     * <p>The beginning of the time range to query. The time must be in Coordinated Universal Time (UTC).</p>
     * 
     * <strong>example:</strong>
     * <p>2006-01-02 15:04:05</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeServiceLogRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeServiceLogRequest self = new DescribeServiceLogRequest();
        return TeaModel.build(map, self);
    }

    public DescribeServiceLogRequest setContainerName(String containerName) {
        this.containerName = containerName;
        return this;
    }
    public String getContainerName() {
        return this.containerName;
    }

    public DescribeServiceLogRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeServiceLogRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public DescribeServiceLogRequest setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

    public DescribeServiceLogRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public DescribeServiceLogRequest setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public DescribeServiceLogRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeServiceLogRequest setPrevious(Boolean previous) {
        this.previous = previous;
        return this;
    }
    public Boolean getPrevious() {
        return this.previous;
    }

    public DescribeServiceLogRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
