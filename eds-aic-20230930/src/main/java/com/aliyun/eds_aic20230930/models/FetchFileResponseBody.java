// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class FetchFileResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>425F351C-3F8E-5218-A520-B6311D0D****</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <strong>example:</strong>
     * <p>425F351C-3F8E-5218-A520-B6311D0D****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static FetchFileResponseBody build(java.util.Map<String, ?> map) throws Exception {
        FetchFileResponseBody self = new FetchFileResponseBody();
        return TeaModel.build(map, self);
    }

    public FetchFileResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public FetchFileResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
