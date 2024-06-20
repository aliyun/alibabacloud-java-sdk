// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeAutoCcListCountResponseBody extends TeaModel {
    /**
     * <p>The total number of IP addresses in the blacklist.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("BlackCount")
    public Integer blackCount;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>5AC3785F-C789-4622-87A4-F58BE7F6B184</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of IP addresses in the whitelist.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
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
