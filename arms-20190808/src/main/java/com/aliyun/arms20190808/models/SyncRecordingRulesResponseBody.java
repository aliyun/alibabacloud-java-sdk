// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class SyncRecordingRulesResponseBody extends TeaModel {
    /**
     * <p>状态码。200表示成功。</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The struct returned.</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>返回结果的提示信息。</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request. You can use the ID to query logs and troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SyncRecordingRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SyncRecordingRulesResponseBody self = new SyncRecordingRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public SyncRecordingRulesResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public SyncRecordingRulesResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public SyncRecordingRulesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SyncRecordingRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
