// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dianjin20240628.models;

import com.aliyun.tea.*;

public class EndToEndRealTimeDialogResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1C98B466-D6E0-5252-A60B-F345CBB33DDB</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static EndToEndRealTimeDialogResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EndToEndRealTimeDialogResponseBody self = new EndToEndRealTimeDialogResponseBody();
        return TeaModel.build(map, self);
    }

    public EndToEndRealTimeDialogResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
