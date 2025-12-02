// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class GetImageSceneLabelListConfResponseBody extends TeaModel {
    /**
     * <p>Returned data.</p>
     */
    @NameInMap("Data")
    public java.util.List<?> data;

    /**
     * <p>ID assigned by the backend, used to uniquely identify a request. Can be used for troubleshooting.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAA-BBBB-CCCCC-DDDD-EEEEEEEE****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetImageSceneLabelListConfResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetImageSceneLabelListConfResponseBody self = new GetImageSceneLabelListConfResponseBody();
        return TeaModel.build(map, self);
    }

    public GetImageSceneLabelListConfResponseBody setData(java.util.List<?> data) {
        this.data = data;
        return this;
    }
    public java.util.List<?> getData() {
        return this.data;
    }

    public GetImageSceneLabelListConfResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
