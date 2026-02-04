// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class CreateCustomFieldResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>ufd_001</p>
     */
    @NameInMap("FieldId")
    public String fieldId;

    /**
     * <strong>example:</strong>
     * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateCustomFieldResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateCustomFieldResponseBody self = new CreateCustomFieldResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateCustomFieldResponseBody setFieldId(String fieldId) {
        this.fieldId = fieldId;
        return this;
    }
    public String getFieldId() {
        return this.fieldId;
    }

    public CreateCustomFieldResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
