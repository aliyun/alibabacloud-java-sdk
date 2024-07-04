// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class RunApiTemplateResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>{\&quot;clusterId\&quot;:\&quot;c-b7be171f1928****\&quot;,\&quot;operationId\&quot;:\&quot;op-61126efe629d****\&quot;}</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>请求ID。</p>
     * 
     * <strong>example:</strong>
     * <p>DD6B1B2A-5837-5237-ABE4-FF0C8944****</p>
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
