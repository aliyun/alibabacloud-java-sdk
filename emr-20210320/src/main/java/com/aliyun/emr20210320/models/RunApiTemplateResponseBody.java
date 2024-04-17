// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class RunApiTemplateResponseBody extends TeaModel {
    @NameInMap("Data")
    public String data;

    /**
     * <p>请求ID。</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RunApiTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RunApiTemplateResponseBody self = new RunApiTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public RunApiTemplateResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public RunApiTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
