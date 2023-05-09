// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class DescribeExcpetionCountResponseBody extends TeaModel {
    /**
     * <p>WB269094</p>
     */
    @NameInMap("ExceptionIpCount")
    public Integer exceptionIpCount;

    @NameInMap("ExpireTimeCount")
    public Integer expireTimeCount;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeExcpetionCountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeExcpetionCountResponseBody self = new DescribeExcpetionCountResponseBody();
        return TeaModel.build(map, self);
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

    public DescribeExcpetionCountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
