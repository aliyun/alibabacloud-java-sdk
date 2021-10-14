// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudwifi_pop20191118.models;

import com.aliyun.tea.*;

public class ListJobOrdersWithSizeResponseBody extends TeaModel {
    @NameInMap("Data")
    public ListJobOrdersWithSizeResponseBodyData data;

    @NameInMap("ErrorCode")
    public Integer errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("IsSuccess")
    public Boolean isSuccess;

    @NameInMap("RequestId")
    public String requestId;

    public static ListJobOrdersWithSizeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListJobOrdersWithSizeResponseBody self = new ListJobOrdersWithSizeResponseBody();
        return TeaModel.build(map, self);
    }

    public ListJobOrdersWithSizeResponseBody setData(ListJobOrdersWithSizeResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListJobOrdersWithSizeResponseBodyData getData() {
        return this.data;
    }

    public ListJobOrdersWithSizeResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public ListJobOrdersWithSizeResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListJobOrdersWithSizeResponseBody setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    public ListJobOrdersWithSizeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListJobOrdersWithSizeResponseBodyData extends TeaModel {
        @NameInMap("Count")
        public Long count;

        @NameInMap("Data")
        public java.util.List<java.util.Map<String, ?>> data;

        public static ListJobOrdersWithSizeResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListJobOrdersWithSizeResponseBodyData self = new ListJobOrdersWithSizeResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListJobOrdersWithSizeResponseBodyData setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public ListJobOrdersWithSizeResponseBodyData setData(java.util.List<java.util.Map<String, ?>> data) {
            this.data = data;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getData() {
            return this.data;
        }

    }

}
