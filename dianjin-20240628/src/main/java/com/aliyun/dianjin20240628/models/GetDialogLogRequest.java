// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dianjin20240628.models;

import com.aliyun.tea.*;

public class GetDialogLogRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>175600129454077743fb03ac54955a4be72ec08f9c216</p>
     */
    @NameInMap("id")
    public String id;

    /**
     * <strong>example:</strong>
     * <p>1758010668S001w4paq82azm</p>
     */
    @NameInMap("sessionId")
    public String sessionId;

    public static GetDialogLogRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDialogLogRequest self = new GetDialogLogRequest();
        return TeaModel.build(map, self);
    }

    public GetDialogLogRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public GetDialogLogRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

}
