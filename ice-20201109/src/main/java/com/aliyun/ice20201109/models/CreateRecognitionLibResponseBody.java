// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class CreateRecognitionLibResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p><em><strong><strong><strong><strong><strong><strong>24b47865c6</strong></strong></strong></strong></strong></strong></em>*</p>
     */
    @NameInMap("LibId")
    public String libId;

    /**
     * <strong>example:</strong>
     * <p><strong><strong><strong>11-DB8D-4A9A-875B-275798</strong></strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateRecognitionLibResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateRecognitionLibResponseBody self = new CreateRecognitionLibResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateRecognitionLibResponseBody setLibId(String libId) {
        this.libId = libId;
        return this;
    }
    public String getLibId() {
        return this.libId;
    }

    public CreateRecognitionLibResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
