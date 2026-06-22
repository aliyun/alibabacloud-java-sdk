// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class AddDatasetDataResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("affectedRows")
    public Integer affectedRows;

    /**
     * <strong>example:</strong>
     * <p>D0173835-9E0F-508F-8BFA-9F556E59C302</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static AddDatasetDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddDatasetDataResponseBody self = new AddDatasetDataResponseBody();
        return TeaModel.build(map, self);
    }

    public AddDatasetDataResponseBody setAffectedRows(Integer affectedRows) {
        this.affectedRows = affectedRows;
        return this;
    }
    public Integer getAffectedRows() {
        return this.affectedRows;
    }

    public AddDatasetDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
