// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimath20241114.models;

import com.aliyun.tea.*;

public class GenStepResponseBody extends TeaModel {
    @NameInMap("Content")
    public String content;

    /**
     * <strong>example:</strong>
     * <p>40020503</p>
     */
    @NameInMap("ErrCode")
    public String errCode;

    /**
     * <strong>example:</strong>
     * <p>Parameter value validation failed</p>
     */
    @NameInMap("ErrMsg")
    public String errMsg;

    @NameInMap("EventType")
    public String eventType;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>696acaa9-eb29-4c1f-b48a-1f901579acc5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GenStepResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GenStepResponseBody self = new GenStepResponseBody();
        return TeaModel.build(map, self);
    }

    public GenStepResponseBody setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public GenStepResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public GenStepResponseBody setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

    public GenStepResponseBody setEventType(String eventType) {
        this.eventType = eventType;
        return this;
    }
    public String getEventType() {
        return this.eventType;
    }

    public GenStepResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
