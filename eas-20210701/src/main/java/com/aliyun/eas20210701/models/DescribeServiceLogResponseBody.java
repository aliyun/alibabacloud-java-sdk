// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class DescribeServiceLogResponseBody extends TeaModel {
    // 返回的日志信息
    @NameInMap("Logs")
    public java.util.List<String> logs;

    // 当前页码
    @NameInMap("PageNum")
    public Long pageNum;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // 总计数量
    @NameInMap("TotalCount")
    public Long totalCount;

    // 总计页码
    @NameInMap("TotalPageNum")
    public Long totalPageNum;

    public static DescribeServiceLogResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeServiceLogResponseBody self = new DescribeServiceLogResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeServiceLogResponseBody setLogs(java.util.List<String> logs) {
        this.logs = logs;
        return this;
    }
    public java.util.List<String> getLogs() {
        return this.logs;
    }

    public DescribeServiceLogResponseBody setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public DescribeServiceLogResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeServiceLogResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public DescribeServiceLogResponseBody setTotalPageNum(Long totalPageNum) {
        this.totalPageNum = totalPageNum;
        return this;
    }
    public Long getTotalPageNum() {
        return this.totalPageNum;
    }

}
