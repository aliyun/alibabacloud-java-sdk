// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class BuildAICoachScriptRecordResponseBody extends TeaModel {
    @NameInMap("data")
    public BuildAICoachScriptRecordResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>PARAM_ERROR</p>
     */
    @NameInMap("errorCode")
    public String errorCode;

    /**
     * <strong>example:</strong>
     * <p>Deduct task already success,Please do not resubmit.token \&quot;369e8f2c-d283-424a-96c4-c83efe08c89e\&quot;</p>
     */
    @NameInMap("errorMessage")
    public String errorMessage;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>4830493A-728F-5F19-BBCC-1443292E9C49</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
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

    public BuildAICoachScriptRecordResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class BuildAICoachScriptRecordResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1234567</p>
         */
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
