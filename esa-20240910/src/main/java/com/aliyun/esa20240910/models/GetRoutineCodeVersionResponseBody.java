// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetRoutineCodeVersionResponseBody extends TeaModel {
    /**
     * <p>The description of the code version.</p>
     * 
     * <strong>example:</strong>
     * <p>test ver code desc</p>
     */
    @NameInMap("CodeDescription")
    public String codeDescription;

    /**
     * <p>The time when the version was created.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-03-11T01:23:21Z</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>EDBD3EB3-97DA-5465-AEF5-8DCA5DC5E395</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The code content.</p>
     * 
     * <strong>example:</strong>
     * <p>PD94bWwgdmVyc2lvbj0iMS4wIiBlbmNvZGluZz0iVVRGLTgiPz4KPEVycm9yPgogIDxDb2RlPk5vU3VjaEtleTwvQ29kZT4KICA8TWVzc2FnZT5UaGUgc3BlY2lmaWVkIGtleSBkb2VzIG5vdCBleGlzdC48L01lc3NhZ2U</p>
     */
    @NameInMap("RoutineCode")
    public String routineCode;

    public static GetRoutineCodeVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRoutineCodeVersionResponseBody self = new GetRoutineCodeVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRoutineCodeVersionResponseBody setCodeDescription(String codeDescription) {
        this.codeDescription = codeDescription;
        return this;
    }
    public String getCodeDescription() {
        return this.codeDescription;
    }

    public GetRoutineCodeVersionResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public GetRoutineCodeVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetRoutineCodeVersionResponseBody setRoutineCode(String routineCode) {
        this.routineCode = routineCode;
        return this;
    }
    public String getRoutineCode() {
        return this.routineCode;
    }

}
