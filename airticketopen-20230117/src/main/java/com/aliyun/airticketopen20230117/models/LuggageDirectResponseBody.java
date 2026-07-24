// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class LuggageDirectResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>51593418-8C73-5E47-8BA8-3F1D4A00CC0B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The data returned for a successful request.</p>
     */
    @NameInMap("data")
    public java.util.List<LuggageDirectResponseBodyData> data;

    /**
     * <p>The business error code.</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("error_code")
    public String errorCode;

    /**
     * <p>The data returned with the error response.</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("error_data")
    public Object errorData;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("error_msg")
    public String errorMsg;

    /**
     * <p>The HTTP status code. The value is always 200 for successful requests.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("status")
    public Integer status;

    /**
     * <p>Indicates whether the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static LuggageDirectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        LuggageDirectResponseBody self = new LuggageDirectResponseBody();
        return TeaModel.build(map, self);
    }

    public LuggageDirectResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public LuggageDirectResponseBody setData(java.util.List<LuggageDirectResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<LuggageDirectResponseBodyData> getData() {
        return this.data;
    }

    public LuggageDirectResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public LuggageDirectResponseBody setErrorData(Object errorData) {
        this.errorData = errorData;
        return this;
    }
    public Object getErrorData() {
        return this.errorData;
    }

    public LuggageDirectResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public LuggageDirectResponseBody setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public LuggageDirectResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class LuggageDirectResponseBodyData extends TeaModel {
        /**
         * <p>The three-letter IATA code of the city.</p>
         * 
         * <strong>example:</strong>
         * <p>BJS</p>
         */
        @NameInMap("city_code")
        public String cityCode;

        /**
         * <p>The luggage through-check rule type. Valid values:</p>
         * <ul>
         * <li>0: luggage through-check is not supported.</li>
         * <li>1: luggage through-check is supported.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("direct_type")
        public Integer directType;

        public static LuggageDirectResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            LuggageDirectResponseBodyData self = new LuggageDirectResponseBodyData();
            return TeaModel.build(map, self);
        }

        public LuggageDirectResponseBodyData setCityCode(String cityCode) {
            this.cityCode = cityCode;
            return this;
        }
        public String getCityCode() {
            return this.cityCode;
        }

        public LuggageDirectResponseBodyData setDirectType(Integer directType) {
            this.directType = directType;
            return this;
        }
        public Integer getDirectType() {
            return this.directType;
        }

    }

}
