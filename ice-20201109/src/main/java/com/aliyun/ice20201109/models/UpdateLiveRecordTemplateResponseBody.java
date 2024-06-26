// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class UpdateLiveRecordTemplateResponseBody extends TeaModel {
    /**
     * <p>代表资源一级ID的资源属性字段</p>
     * 
     * <strong>example:</strong>
     * <p>0F3D5C03-4B6E-5F40-B7F6-B1956776E7D3</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateLiveRecordTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateLiveRecordTemplateResponseBody self = new UpdateLiveRecordTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateLiveRecordTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
