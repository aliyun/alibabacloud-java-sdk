// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class PassReleaseStagePipelineValidateResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static PassReleaseStagePipelineValidateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PassReleaseStagePipelineValidateResponseBody self = new PassReleaseStagePipelineValidateResponseBody();
        return TeaModel.build(map, self);
    }

    public PassReleaseStagePipelineValidateResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
