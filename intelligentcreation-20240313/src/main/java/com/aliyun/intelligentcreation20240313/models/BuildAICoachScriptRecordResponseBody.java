// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class BuildAICoachScriptRecordResponseBody extends TeaModel {
    @NameInMap("data")
    public BuildAICoachScriptRecordResponseBodyData data;

    @NameInMap("errorCode")
    public String errorCode;

    @NameInMap("errorMessage")
    public String errorMessage;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("scriptRecordId")
    public String scriptRecordId;

    @NameInMap("success")
    public Boolean success;

    public static BuildAICoachScriptRecordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BuildAICoachScriptRecordResponseBody self = new BuildAICoachScriptRecordResponseBody();
        return TeaModel.build(map, self);
    }

    public BuildAICoachScriptRecordResponseBody setData(BuildAICoachScriptRecordResponseBodyData data) {
        this.data = data;
        return this;
    }
    public BuildAICoachScriptRecordResponseBodyData getData() {
        return this.data;
    }

    public BuildAICoachScriptRecordResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public BuildAICoachScriptRecordResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public BuildAICoachScriptRecordResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BuildAICoachScriptRecordResponseBody setScriptRecordId(String scriptRecordId) {
        this.scriptRecordId = scriptRecordId;
        return this;
    }
    public String getScriptRecordId() {
        return this.scriptRecordId;
    }

    public BuildAICoachScriptRecordResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class BuildAICoachScriptRecordResponseBodyData extends TeaModel {
        @NameInMap("scriptId")
        public String scriptId;

        public static BuildAICoachScriptRecordResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            BuildAICoachScriptRecordResponseBodyData self = new BuildAICoachScriptRecordResponseBodyData();
            return TeaModel.build(map, self);
        }

        public BuildAICoachScriptRecordResponseBodyData setScriptId(String scriptId) {
            this.scriptId = scriptId;
            return this;
        }
        public String getScriptId() {
            return this.scriptId;
        }

    }

}
