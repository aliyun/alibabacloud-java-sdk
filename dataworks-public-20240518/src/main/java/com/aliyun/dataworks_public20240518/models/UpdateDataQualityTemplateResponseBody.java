// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class UpdateDataQualityTemplateResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0bc14115***159376359</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static UpdateDataQualityTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateDataQualityTemplateResponseBody self = new UpdateDataQualityTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateDataQualityTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateDataQualityTemplateResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
