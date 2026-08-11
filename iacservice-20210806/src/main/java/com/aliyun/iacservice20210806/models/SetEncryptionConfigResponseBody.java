// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class SetEncryptionConfigResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>7FA0FF4A-ABD4-54F6-BEAC-B4273EBA10A2</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static SetEncryptionConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetEncryptionConfigResponseBody self = new SetEncryptionConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public SetEncryptionConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
