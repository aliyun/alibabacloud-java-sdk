// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class CreateAirflowLoginTokenResponseBody extends TeaModel {
    /**
     * <p>The status code. A value of 200 indicates that the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public CreateAirflowLoginTokenResponseBodyData data;

    /**
     * <p>The error code.</p>
     * <ul>
     * <li><p>If the request is successful, this parameter is not returned.</p>
     * </li>
     * <li><p>If the request fails, this parameter is returned.</p>
     * </li>
     * </ul>
     * <p>For more information, see the error codes in this topic.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error code description.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>Successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4284D079-30F4-5B23-ADC4-28F291622C9A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><p>True: The request was successful.</p>
     * </li>
     * <li><p>False: The request failed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CreateAirflowLoginTokenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAirflowLoginTokenResponseBody self = new CreateAirflowLoginTokenResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAirflowLoginTokenResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateAirflowLoginTokenResponseBody setData(CreateAirflowLoginTokenResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateAirflowLoginTokenResponseBodyData getData() {
        return this.data;
    }

    public CreateAirflowLoginTokenResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public CreateAirflowLoginTokenResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public CreateAirflowLoginTokenResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateAirflowLoginTokenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateAirflowLoginTokenResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateAirflowLoginTokenResponseBodyData extends TeaModel {
        /**
         * <p>The endpoint of the Airflow instance.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://data-dms.aliyuncs.com/airflow/x/xxxx/af-ehrmszb">https://data-dms.aliyuncs.com/airflow/x/xxxx/af-ehrmszb</a>****</p>
         */
        @NameInMap("Host")
        public String host;

        /**
         * <p>The generated token.</p>
         * 
         * <strong>example:</strong>
         * <p>f432d77de03b6b95fc24f9****</p>
         */
        @NameInMap("Token")
        public String token;

        public static CreateAirflowLoginTokenResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateAirflowLoginTokenResponseBodyData self = new CreateAirflowLoginTokenResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateAirflowLoginTokenResponseBodyData setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public CreateAirflowLoginTokenResponseBodyData setToken(String token) {
            this.token = token;
            return this;
        }
        public String getToken() {
            return this.token;
        }

    }

}
