// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class TransitVisaResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("data")
    public java.util.List<TransitVisaResponseBodyData> data;

    @NameInMap("error_code")
    public String errorCode;

    @NameInMap("error_data")
    public Object errorData;

    @NameInMap("error_msg")
    public String errorMsg;

    @NameInMap("status")
    public Integer status;

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
        @NameInMap("city_code")
        public String cityCode;

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
