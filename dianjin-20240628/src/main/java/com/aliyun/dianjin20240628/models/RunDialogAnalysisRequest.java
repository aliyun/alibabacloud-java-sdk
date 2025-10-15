// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dianjin20240628.models;

import com.aliyun.tea.*;

public class RunDialogAnalysisRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1759457905S001vejpvd6vej</p>
     */
    @NameInMap("sessionId")
    public String sessionId;

    public static RunDialogAnalysisRequest build(java.util.Map<String, ?> map) throws Exception {
        RunDialogAnalysisRequest self = new RunDialogAnalysisRequest();
        return TeaModel.build(map, self);
    }

    public RunDialogAnalysisRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

}
