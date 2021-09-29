// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudwifi_pop20191118.models;

import com.aliyun.tea.*;

public class GetNetDeviceInfoWithSizeResponseBody extends TeaModel {
    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("IsSuccess")
    public Boolean isSuccess;

    @NameInMap("ErrorCode")
    public Integer errorCode;

    @NameInMap("Data")
    public GetNetDeviceInfoWithSizeResponseBodyData data;

    public static GetNetDeviceInfoWithSizeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetNetDeviceInfoWithSizeResponseBody self = new GetNetDeviceInfoWithSizeResponseBody();
        return TeaModel.build(map, self);
    }

    public GetNetDeviceInfoWithSizeResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetNetDeviceInfoWithSizeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetNetDeviceInfoWithSizeResponseBody setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    public GetNetDeviceInfoWithSizeResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public GetNetDeviceInfoWithSizeResponseBody setData(GetNetDeviceInfoWithSizeResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetNetDeviceInfoWithSizeResponseBodyData getData() {
        return this.data;
    }

    public static class GetNetDeviceInfoWithSizeResponseBodyData extends TeaModel {
        @NameInMap("Count")
        public Long count;

        @NameInMap("Data")
        public java.util.List<java.util.Map<String, ?>> data;

        public static GetNetDeviceInfoWithSizeResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetNetDeviceInfoWithSizeResponseBodyData self = new GetNetDeviceInfoWithSizeResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetNetDeviceInfoWithSizeResponseBodyData setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public GetNetDeviceInfoWithSizeResponseBodyData setData(java.util.List<java.util.Map<String, ?>> data) {
            this.data = data;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getData() {
            return this.data;
        }

    }

}
