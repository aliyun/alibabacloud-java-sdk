// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dianjin20240628.models;

import com.aliyun.tea.*;

public class GetDialogDetailRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1906623923815534xxx</p>
     */
    @NameInMap("sessionId")
    public String sessionId;

    public static GetDialogDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDialogDetailRequest self = new GetDialogDetailRequest();
        return TeaModel.build(map, self);
    }

    public GetDialogDetailRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

}
