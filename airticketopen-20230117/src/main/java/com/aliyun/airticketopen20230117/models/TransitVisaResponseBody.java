// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class TransitVisaResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>51593418-8C73-5E47-8BA8-3F1D4A00CC0B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("data")
    public java.util.List<TransitVisaResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("error_code")
    public String errorCode;

    /**
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("error_data")
    public Object errorData;

    /**
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("error_msg")
    public String errorMsg;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("status")
    public Integer status;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static TransitVisaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TransitVisaResponseBody self = new TransitVisaResponseBody();
        return TeaModel.build(map, self);
    }

    public TransitVisaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public TransitVisaResponseBody setData(java.util.List<TransitVisaResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<TransitVisaResponseBodyData> getData() {
        return this.data;
    }

    public TransitVisaResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public TransitVisaResponseBody setErrorData(Object errorData) {
        this.errorData = errorData;
        return this;
    }
    public Object getErrorData() {
        return this.errorData;
    }

    public TransitVisaResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public TransitVisaResponseBody setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public TransitVisaResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class TransitVisaResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>HGH</p>
         */
        @NameInMap("city_code")
        public String cityCode;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("visa_type")
        public Integer visaType;

        public static TransitVisaResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            TransitVisaResponseBodyData self = new TransitVisaResponseBodyData();
            return TeaModel.build(map, self);
        }

        public TransitVisaResponseBodyData setCityCode(String cityCode) {
            this.cityCode = cityCode;
            return this;
        }
        public String getCityCode() {
            return this.cityCode;
        }

        public TransitVisaResponseBodyData setVisaType(Integer visaType) {
            this.visaType = visaType;
            return this;
        }
        public Integer getVisaType() {
            return this.visaType;
        }

    }

}
