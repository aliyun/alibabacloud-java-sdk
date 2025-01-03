// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class CancelExecutionReleaseStageResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static CancelExecutionReleaseStageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CancelExecutionReleaseStageResponseBody self = new CancelExecutionReleaseStageResponseBody();
        return TeaModel.build(map, self);
    }

    public CancelExecutionReleaseStageResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
