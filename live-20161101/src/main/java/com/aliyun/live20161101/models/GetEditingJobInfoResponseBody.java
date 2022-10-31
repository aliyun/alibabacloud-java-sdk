// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class GetEditingJobInfoResponseBody extends TeaModel {
    @NameInMap("CasterId")
    public String casterId;

    @NameInMap("EditingTasksInfo")
    public String editingTasksInfo;

    @NameInMap("RequestId")
    public String requestId;

    public static GetEditingJobInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetEditingJobInfoResponseBody self = new GetEditingJobInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetEditingJobInfoResponseBody setCasterId(String casterId) {
        this.casterId = casterId;
        return this;
    }
    public String getCasterId() {
        return this.casterId;
    }

    public GetEditingJobInfoResponseBody setEditingTasksInfo(String editingTasksInfo) {
        this.editingTasksInfo = editingTasksInfo;
        return this;
    }
    public String getEditingTasksInfo() {
        return this.editingTasksInfo;
    }

    public GetEditingJobInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
