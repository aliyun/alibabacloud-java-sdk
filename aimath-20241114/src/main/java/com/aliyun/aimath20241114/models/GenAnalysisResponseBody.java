// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimath20241114.models;

import com.aliyun.tea.*;

public class GenAnalysisResponseBody extends TeaModel {
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
     * <p>1d31b11b-4b82-4db1-b3c0-001529fc78eb</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GenAnalysisResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GenAnalysisResponseBody self = new GenAnalysisResponseBody();
        return TeaModel.build(map, self);
    }

    public GenAnalysisResponseBody setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public GenAnalysisResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public GenAnalysisResponseBody setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

    public GenAnalysisResponseBody setEventType(String eventType) {
        this.eventType = eventType;
        return this;
    }
    public String getEventType() {
        return this.eventType;
    }

    public GenAnalysisResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
