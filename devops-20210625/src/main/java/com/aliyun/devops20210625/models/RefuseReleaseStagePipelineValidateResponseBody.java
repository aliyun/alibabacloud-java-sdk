// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class RefuseReleaseStagePipelineValidateResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static RefuseReleaseStagePipelineValidateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RefuseReleaseStagePipelineValidateResponseBody self = new RefuseReleaseStagePipelineValidateResponseBody();
        return TeaModel.build(map, self);
    }

    public RefuseReleaseStagePipelineValidateResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
