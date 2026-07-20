// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class AddProjectManagerResponseBody extends TeaModel {
    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The response data.</p>
     */
    @NameInMap("module")
    public AddProjectManagerResponseBodyModule module;

    /**
     * <p>requestId</p>
     * 
     * <strong>example:</strong>
     * <p>B72B39C8-<strong><strong>-</strong></strong>-****-D53F11F6ADFE</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * <ul>
     * <li><p>true: Successful.</p>
     * </li>
     * <li><p>false: Failed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    /**
     * <p>traceId</p>
     * 
     * <strong>example:</strong>
     * <p>210f079e16603757182131635d866a</p>
     */
    @NameInMap("traceId")
    public String traceId;

    public static AddProjectManagerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddProjectManagerResponseBody self = new AddProjectManagerResponseBody();
        return TeaModel.build(map, self);
    }

    public AddProjectManagerResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public AddProjectManagerResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public AddProjectManagerResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AddProjectManagerResponseBody setModule(AddProjectManagerResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public AddProjectManagerResponseBodyModule getModule() {
        return this.module;
    }

    public AddProjectManagerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddProjectManagerResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public AddProjectManagerResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class AddProjectManagerResponseBodyModule extends TeaModel {
        /**
         * <p>The number of managers added in this operation (always 0 for the remove process).</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("add_num")
        public Integer addNum;

        /**
         * <p>The number of managers removed in this operation (always 0 for the add process).</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("remove_num")
        public Integer removeNum;

        /**
         * <p>The parsed btrip_rule.rule_code (501 + projectId), which helps callers with troubleshooting and reconciliation.</p>
         * 
         * <strong>example:</strong>
         * <p>500578154</p>
         */
        @NameInMap("rule_code")
        public Long ruleCode;

        public static AddProjectManagerResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            AddProjectManagerResponseBodyModule self = new AddProjectManagerResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public AddProjectManagerResponseBodyModule setAddNum(Integer addNum) {
            this.addNum = addNum;
            return this;
        }
        public Integer getAddNum() {
            return this.addNum;
        }

        public AddProjectManagerResponseBodyModule setRemoveNum(Integer removeNum) {
            this.removeNum = removeNum;
            return this;
        }
        public Integer getRemoveNum() {
            return this.removeNum;
        }

        public AddProjectManagerResponseBodyModule setRuleCode(Long ruleCode) {
            this.ruleCode = ruleCode;
            return this;
        }
        public Long getRuleCode() {
            return this.ruleCode;
        }

    }

}
