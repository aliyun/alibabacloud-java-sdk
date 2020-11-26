// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class DescribeExcpetionCountResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("ExceptionIpCount")
    @Validation(required = true)
    public Integer exceptionIpCount;

    @NameInMap("ExpireTimeCount")
    @Validation(required = true)
    public Integer expireTimeCount;

    public static DescribeExcpetionCountResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeExcpetionCountResponse self = new DescribeExcpetionCountResponse();
        return TeaModel.build(map, self);
    }

    public DescribeExcpetionCountResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeExcpetionCountResponse setExceptionIpCount(Integer exceptionIpCount) {
        this.exceptionIpCount = exceptionIpCount;
        return this;
    }
    public Integer getExceptionIpCount() {
        return this.exceptionIpCount;
    }

    public DescribeExcpetionCountResponse setExpireTimeCount(Integer expireTimeCount) {
        this.expireTimeCount = expireTimeCount;
        return this;
    }
    public Integer getExpireTimeCount() {
        return this.expireTimeCount;
    }

}
