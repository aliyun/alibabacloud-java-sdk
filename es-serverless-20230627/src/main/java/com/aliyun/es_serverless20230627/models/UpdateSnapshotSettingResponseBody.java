// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.es_serverless20230627.models;

import com.aliyun.tea.*;

public class UpdateSnapshotSettingResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>A7B03723-AA73-5A5F-B71C-270792614DD8</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>{
     *     &quot;quartzRegex&quot;: &quot;0 0 01 ? * * *&quot;,
     *     &quot;enable&quot;: true
     *   }</p>
     */
    @NameInMap("result")
    public java.util.Map<String, ?> result;

    public static UpdateSnapshotSettingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateSnapshotSettingResponseBody self = new UpdateSnapshotSettingResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateSnapshotSettingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateSnapshotSettingResponseBody setResult(java.util.Map<String, ?> result) {
        this.result = result;
        return this;
    }
    public java.util.Map<String, ?> getResult() {
        return this.result;
    }

}
