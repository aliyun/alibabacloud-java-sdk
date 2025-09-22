// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetRoutineCodeVersionResponseBody extends TeaModel {
    @NameInMap("CodeDescription")
    public String codeDescription;

    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

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
