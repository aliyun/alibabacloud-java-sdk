// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class DescribeServiceLogRequest extends TeaModel {
    // 查询的结束时间
    @NameInMap("EndTime")
    public String endTime;

    // 要查询的机器ip
    @NameInMap("Ip")
    public String ip;

    // 查询的关键字
    @NameInMap("Keyword")
    public String keyword;

    // 请求的页码（默认为1）
    @NameInMap("PageNum")
    public Long pageNum;

    // 每页的大小（默认为500）
    @NameInMap("PageSize")
    public Long pageSize;

    // 查询的开始时间
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeServiceLogRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeServiceLogRequest self = new DescribeServiceLogRequest();
        return TeaModel.build(map, self);
    }

    public DescribeServiceLogRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
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

    public DescribeServiceLogRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
