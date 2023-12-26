// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class DescribeServiceLogRequest extends TeaModel {
    @NameInMap("ContainerName")
    public String containerName;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("InstanceName")
    public String instanceName;

    @NameInMap("Ip")
    public String ip;

    @NameInMap("Keyword")
    public String keyword;

    @NameInMap("PageNum")
    public Long pageNum;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("Previous")
    public Boolean previous;

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
