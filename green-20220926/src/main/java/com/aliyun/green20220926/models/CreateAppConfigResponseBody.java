// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class CreateAppConfigResponseBody extends TeaModel {
    /**
     * <p>The returned data.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Data")
    public Boolean data;

    /**
     * <p>The ID assigned by the backend to uniquely identify a request. You can use this ID to troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAA-BBBB-CCCCC-DDDD-EEEEEEEE****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateAppConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAppConfigResponseBody self = new CreateAppConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAppConfigResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public CreateAppConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
