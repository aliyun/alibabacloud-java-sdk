// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20201002.models;

import com.aliyun.tea.*;

public class SetFingerPrintTemplateResponseBody extends TeaModel {
    /**
     * <p>The encrypted password.</p>
     * 
     * <strong>example:</strong>
     * <p>0711abb9-4cf8-41b2-9d0e-b51209468631;da4VFPNxwY3CZegFjOrCNw==;iHp2l9/qGcfD4tWx7jZIZQ==</p>
     */
    @NameInMap("EncryptedPassword")
    public String encryptedPassword;

    /**
     * <p>The index.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Index")
    public Integer index;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>CDE666EA-4FCD-5024-895C-8698E3D3****</p>
     */
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
