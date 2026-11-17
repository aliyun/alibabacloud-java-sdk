// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maasqiservice20260831.models;

import com.aliyun.tea.*;

public class CameraConsoleDebugStreamHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    /**
     * <p>实例 ID，非空 Header 优先于 Body。</p>
     */
    @NameInMap("X-QI-Instance-Id")
    public String xQIInstanceId;

    /**
     * <p>请求 ID 优先级：可信 POP 注入的 x-acs-request-id、非空 X-QI-Request-Id Header、Body.requestId。没有前两者时 Body.requestId 必填；没有可信 POP ID 时 Header 与 Body.requestId 至少提供一个。 1～128 位，仅字母、数字及 ._:-。成功重放还须复用同一 Session；已记录为失败的请求须换新 ID。POP 重试分配新 ID 时会按新请求处理。</p>
     */
    @NameInMap("X-QI-Request-Id")
    public String xQIRequestId;

    /**
     * <p>可选会话 ID，非空 Header 优先于 Body.sessionId；省略时生成。1～128 位，仅字母、数字及 ._:-。成功重放必须复用原 Session 和有效 Request ID；切换配置时换新 Session，人物识别同时换新 scene_id。</p>
     */
    @NameInMap("X-QI-Session-Id")
    public String xQISessionId;

    public static CameraConsoleDebugStreamHeaders build(java.util.Map<String, ?> map) throws Exception {
        CameraConsoleDebugStreamHeaders self = new CameraConsoleDebugStreamHeaders();
        return TeaModel.build(map, self);
    }

    public CameraConsoleDebugStreamHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public CameraConsoleDebugStreamHeaders setXQIInstanceId(String xQIInstanceId) {
        this.xQIInstanceId = xQIInstanceId;
        return this;
    }
    public String getXQIInstanceId() {
        return this.xQIInstanceId;
    }

    public CameraConsoleDebugStreamHeaders setXQIRequestId(String xQIRequestId) {
        this.xQIRequestId = xQIRequestId;
        return this;
    }
    public String getXQIRequestId() {
        return this.xQIRequestId;
    }

    public CameraConsoleDebugStreamHeaders setXQISessionId(String xQISessionId) {
        this.xQISessionId = xQISessionId;
        return this;
    }
    public String getXQISessionId() {
        return this.xQISessionId;
    }

}
