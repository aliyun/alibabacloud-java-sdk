// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class CreateProcessDefinitionWithScheduleResponseBody extends TeaModel {
    /**
     * <p>The code that is returned by the backend server.</p>
     * 
     * <strong>example:</strong>
     * <p>1400009</p>
     */
    @NameInMap("code")
    public Integer code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("data")
    public CreateProcessDefinitionWithScheduleResponseBodyData data;

    /**
     * <p>Indicates whether the request failed.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("failed")
    public String failed;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The description of the returned code.</p>
     * 
     * <strong>example:</strong>
     * <p>No permission for resource action</p>
     */
    @NameInMap("msg")
    public String msg;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>DD6B1B2A-5837-5237-ABE4-FF0C8944****</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public String success;

    public static CreateProcessDefinitionWithScheduleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateProcessDefinitionWithScheduleResponseBody self = new CreateProcessDefinitionWithScheduleResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateProcessDefinitionWithScheduleResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public CreateProcessDefinitionWithScheduleResponseBody setData(CreateProcessDefinitionWithScheduleResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateProcessDefinitionWithScheduleResponseBodyData getData() {
        return this.data;
    }

    public CreateProcessDefinitionWithScheduleResponseBody setFailed(String failed) {
        this.failed = failed;
        return this;
    }
    public String getFailed() {
        return this.failed;
    }

    public CreateProcessDefinitionWithScheduleResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public CreateProcessDefinitionWithScheduleResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public CreateProcessDefinitionWithScheduleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateProcessDefinitionWithScheduleResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class CreateProcessDefinitionWithScheduleResponseBodyData extends TeaModel {
        /**
         * <p>The workflow ID.</p>
         * 
         * <strong>example:</strong>
         * <p>160************</p>
         */
        @NameInMap("code")
        public Long code;

        /**
         * <p>The serial number of the workflow.</p>
         * 
         * <strong>example:</strong>
         * <p>12342</p>
         */
        @NameInMap("id")
        public Integer id;

        public static CreateProcessDefinitionWithScheduleResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateProcessDefinitionWithScheduleResponseBodyData self = new CreateProcessDefinitionWithScheduleResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateProcessDefinitionWithScheduleResponseBodyData setCode(Long code) {
            this.code = code;
            return this;
        }
        public Long getCode() {
            return this.code;
        }

        public CreateProcessDefinitionWithScheduleResponseBodyData setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

    }

}
