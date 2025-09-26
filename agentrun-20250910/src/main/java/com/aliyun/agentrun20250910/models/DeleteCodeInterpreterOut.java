// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class DeleteCodeInterpreterOut extends TeaModel {
    @NameInMap("codeInterpreterId")
    public String codeInterpreterId;

    @NameInMap("codeInterpreterName")
    public String codeInterpreterName;

    @NameInMap("status")
    public String status;

    public static DeleteCodeInterpreterOut build(java.util.Map<String, ?> map) throws Exception {
        DeleteCodeInterpreterOut self = new DeleteCodeInterpreterOut();
        return TeaModel.build(map, self);
    }

    public DeleteCodeInterpreterOut setCodeInterpreterId(String codeInterpreterId) {
        this.codeInterpreterId = codeInterpreterId;
        return this;
    }
    public String getCodeInterpreterId() {
        return this.codeInterpreterId;
    }

    public DeleteCodeInterpreterOut setCodeInterpreterName(String codeInterpreterName) {
        this.codeInterpreterName = codeInterpreterName;
        return this;
    }
    public String getCodeInterpreterName() {
        return this.codeInterpreterName;
    }

    public DeleteCodeInterpreterOut setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
