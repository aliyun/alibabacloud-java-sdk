// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.advisor20180120.models;

import com.aliyun.tea.*;

public class GetInspectProgressRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>14********37</p>
     */
    @NameInMap("AssumeAliyunId")
    public Long assumeAliyunId;

    /**
     * <strong>example:</strong>
     * <p>95***135</p>
     */
    @NameInMap("TaskId")
    public Long taskId;

    /**
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("Token")
    public String token;

    public static GetInspectProgressRequest build(java.util.Map<String, ?> map) throws Exception {
        GetInspectProgressRequest self = new GetInspectProgressRequest();
        return TeaModel.build(map, self);
    }

    public GetInspectProgressRequest setAssumeAliyunId(Long assumeAliyunId) {
        this.assumeAliyunId = assumeAliyunId;
        return this;
    }
    public Long getAssumeAliyunId() {
        return this.assumeAliyunId;
    }

    public GetInspectProgressRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

    public GetInspectProgressRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

}
