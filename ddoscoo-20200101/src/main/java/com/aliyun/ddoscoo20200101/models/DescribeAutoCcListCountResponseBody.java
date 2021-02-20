// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeAutoCcListCountResponseBody extends TeaModel {
    @NameInMap("BlackCount")
    public Integer blackCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("WhiteCount")
    public Integer whiteCount;

    public static DescribeAutoCcListCountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAutoCcListCountResponseBody self = new DescribeAutoCcListCountResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAutoCcListCountResponseBody setBlackCount(Integer blackCount) {
        this.blackCount = blackCount;
        return this;
    }
    public Integer getBlackCount() {
        return this.blackCount;
    }

    public DescribeAutoCcListCountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAutoCcListCountResponseBody setWhiteCount(Integer whiteCount) {
        this.whiteCount = whiteCount;
        return this;
    }
    public Integer getWhiteCount() {
        return this.whiteCount;
    }

}
