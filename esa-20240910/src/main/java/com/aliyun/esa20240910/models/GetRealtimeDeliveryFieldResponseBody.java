// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetRealtimeDeliveryFieldResponseBody extends TeaModel {
    /**
     * <p>The fields returned.</p>
     */
    @NameInMap("FieldContent")
    public java.util.Map<String, FieldContentValue> fieldContent;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>15C66C7B-671A-4297-9187-2C4477247B78</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetRealtimeDeliveryFieldResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRealtimeDeliveryFieldResponseBody self = new GetRealtimeDeliveryFieldResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRealtimeDeliveryFieldResponseBody setFieldContent(java.util.Map<String, FieldContentValue> fieldContent) {
        this.fieldContent = fieldContent;
        return this;
    }
    public java.util.Map<String, FieldContentValue> getFieldContent() {
        return this.fieldContent;
    }

    public GetRealtimeDeliveryFieldResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
