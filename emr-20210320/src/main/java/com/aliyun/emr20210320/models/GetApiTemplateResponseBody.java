// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class GetApiTemplateResponseBody extends TeaModel {
    /**
     * <p>The content of the API operation template.</p>
     */
    @NameInMap("Data")
    @Deprecated
    public ApiTemplate data;

    /**
     * <p>请求ID。</p>
     * 
     * <strong>example:</strong>
     * <p>DD6B1B2A-5837-5237-ABE4-FF0C8944****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetApiTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetApiTemplateResponseBody self = new GetApiTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public GetApiTemplateResponseBody setData(ApiTemplate data) {
        this.data = data;
        return this;
    }
    public ApiTemplate getData() {
        return this.data;
    }

    public GetApiTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
