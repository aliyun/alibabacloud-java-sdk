// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20201002.models;

import com.aliyun.tea.*;

public class SetFingerPrintTemplateDescriptionResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>BBD7DFD1-A5DE-51D9-8FD6-3BF54EF4****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SetFingerPrintTemplateDescriptionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetFingerPrintTemplateDescriptionResponseBody self = new SetFingerPrintTemplateDescriptionResponseBody();
        return TeaModel.build(map, self);
    }

    public SetFingerPrintTemplateDescriptionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
