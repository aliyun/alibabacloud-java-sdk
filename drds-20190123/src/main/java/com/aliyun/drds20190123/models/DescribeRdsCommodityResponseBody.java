// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeRdsCommodityResponseBody extends TeaModel {
    /**
     * <p>Indicates the returned result.</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>Indicates the ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DescribeRdsCommodityResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRdsCommodityResponseBody self = new DescribeRdsCommodityResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRdsCommodityResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public DescribeRdsCommodityResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRdsCommodityResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
