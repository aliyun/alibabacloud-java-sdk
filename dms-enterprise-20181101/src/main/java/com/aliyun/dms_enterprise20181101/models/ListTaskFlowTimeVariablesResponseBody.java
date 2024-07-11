// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListTaskFlowTimeVariablesResponseBody extends TeaModel {
    /**
     * <p>The error code returned if the request failed.</p>
     * 
     * <strong>example:</strong>
     * <p>UnknownError</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message returned if the request failed.</p>
     * 
     * <strong>example:</strong>
     * <p>UnknownError</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>EC12A3BE-149F-5365-AF33-12CC8C963923</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The request was successful.</li>
     * <li><strong>false</strong>: The request failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The time variables for the task flow.</p>
     */
    @NameInMap("TimeVariables")
    public ListTaskFlowTimeVariablesResponseBodyTimeVariables timeVariables;

    public static ListTaskFlowTimeVariablesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTaskFlowTimeVariablesResponseBody self = new ListTaskFlowTimeVariablesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTaskFlowTimeVariablesResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListTaskFlowTimeVariablesResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListTaskFlowTimeVariablesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTaskFlowTimeVariablesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListTaskFlowTimeVariablesResponseBody setTimeVariables(ListTaskFlowTimeVariablesResponseBodyTimeVariables timeVariables) {
        this.timeVariables = timeVariables;
        return this;
    }
    public ListTaskFlowTimeVariablesResponseBodyTimeVariables getTimeVariables() {
        return this.timeVariables;
    }

    public static class ListTaskFlowTimeVariablesResponseBodyTimeVariablesTimeVariable extends TeaModel {
        /**
         * <p>The name of the time variable.</p>
         * 
         * <strong>example:</strong>
         * <p>time_test</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The format of the time variable.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-09-26|+7h</p>
         */
        @NameInMap("Pattern")
        public String pattern;

        public static ListTaskFlowTimeVariablesResponseBodyTimeVariablesTimeVariable build(java.util.Map<String, ?> map) throws Exception {
            ListTaskFlowTimeVariablesResponseBodyTimeVariablesTimeVariable self = new ListTaskFlowTimeVariablesResponseBodyTimeVariablesTimeVariable();
            return TeaModel.build(map, self);
        }

        public ListTaskFlowTimeVariablesResponseBodyTimeVariablesTimeVariable setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListTaskFlowTimeVariablesResponseBodyTimeVariablesTimeVariable setPattern(String pattern) {
            this.pattern = pattern;
            return this;
        }
        public String getPattern() {
            return this.pattern;
        }

    }

    public static class ListTaskFlowTimeVariablesResponseBodyTimeVariables extends TeaModel {
        @NameInMap("TimeVariable")
        public java.util.List<ListTaskFlowTimeVariablesResponseBodyTimeVariablesTimeVariable> timeVariable;

        public static ListTaskFlowTimeVariablesResponseBodyTimeVariables build(java.util.Map<String, ?> map) throws Exception {
            ListTaskFlowTimeVariablesResponseBodyTimeVariables self = new ListTaskFlowTimeVariablesResponseBodyTimeVariables();
            return TeaModel.build(map, self);
        }

        public ListTaskFlowTimeVariablesResponseBodyTimeVariables setTimeVariable(java.util.List<ListTaskFlowTimeVariablesResponseBodyTimeVariablesTimeVariable> timeVariable) {
            this.timeVariable = timeVariable;
            return this;
        }
        public java.util.List<ListTaskFlowTimeVariablesResponseBodyTimeVariablesTimeVariable> getTimeVariable() {
            return this.timeVariable;
        }

    }

}
