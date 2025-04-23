// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class UpdateProjectResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>C62888F6-254D-5589-BF05-0D9EE698C187</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static UpdateProjectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateProjectResponseBody self = new UpdateProjectResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateProjectResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
