// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20201002.models;

import com.aliyun.tea.*;

public class SetFingerPrintTemplateResponseBody extends TeaModel {
    @NameInMap("EncryptedPassword")
    public String encryptedPassword;

    @NameInMap("Index")
    public Integer index;

    @NameInMap("RequestId")
    public String requestId;

    public static SetFingerPrintTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetFingerPrintTemplateResponseBody self = new SetFingerPrintTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public SetFingerPrintTemplateResponseBody setEncryptedPassword(String encryptedPassword) {
        this.encryptedPassword = encryptedPassword;
        return this;
    }
    public String getEncryptedPassword() {
        return this.encryptedPassword;
    }

    public SetFingerPrintTemplateResponseBody setIndex(Integer index) {
        this.index = index;
        return this;
    }
    public Integer getIndex() {
        return this.index;
    }

    public SetFingerPrintTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
