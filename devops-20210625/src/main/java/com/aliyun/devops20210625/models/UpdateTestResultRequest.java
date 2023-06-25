// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class UpdateTestResultRequest extends TeaModel {
    @NameInMap("executor")
    public String executor;

    @NameInMap("status")
    public String status;

    public static UpdateTestResultRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTestResultRequest self = new UpdateTestResultRequest();
        return TeaModel.build(map, self);
    }

    public UpdateTestResultRequest setExecutor(String executor) {
        this.executor = executor;
        return this;
    }
    public String getExecutor() {
        return this.executor;
    }

    public UpdateTestResultRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
