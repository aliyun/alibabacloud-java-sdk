// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class DescribeExcpetionCountResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ExceptionIpCount")
    public Integer exceptionIpCount;

    @NameInMap("ExpireTimeCount")
    public Integer expireTimeCount;

    public static DescribeExcpetionCountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeExcpetionCountResponseBody self = new DescribeExcpetionCountResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeExcpetionCountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeExcpetionCountResponseBody setExceptionIpCount(Integer exceptionIpCount) {
        this.exceptionIpCount = exceptionIpCount;
        return this;
    }
    public Integer getExceptionIpCount() {
        return this.exceptionIpCount;
    }

    public DescribeExcpetionCountResponseBody setExpireTimeCount(Integer expireTimeCount) {
        this.expireTimeCount = expireTimeCount;
        return this;
    }
    public Integer getExpireTimeCount() {
        return this.expireTimeCount;
    }

}
