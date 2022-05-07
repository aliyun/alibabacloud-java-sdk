// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListUsageForResourceGroupResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<ListUsageForResourceGroupResponseBodyData> data;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListUsageForResourceGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListUsageForResourceGroupResponseBody self = new ListUsageForResourceGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public ListUsageForResourceGroupResponseBody setData(java.util.List<ListUsageForResourceGroupResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListUsageForResourceGroupResponseBodyData> getData() {
        return this.data;
    }

    public ListUsageForResourceGroupResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListUsageForResourceGroupResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListUsageForResourceGroupResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListUsageForResourceGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListUsageForResourceGroupResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListUsageForResourceGroupResponseBodyData extends TeaModel {
        @NameInMap("RecodeTime")
        public Long recodeTime;

        @NameInMap("Usage")
        public Double usage;

        public static ListUsageForResourceGroupResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListUsageForResourceGroupResponseBodyData self = new ListUsageForResourceGroupResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListUsageForResourceGroupResponseBodyData setRecodeTime(Long recodeTime) {
            this.recodeTime = recodeTime;
            return this;
        }
        public Long getRecodeTime() {
            return this.recodeTime;
        }

        public ListUsageForResourceGroupResponseBodyData setUsage(Double usage) {
            this.usage = usage;
            return this;
        }
        public Double getUsage() {
            return this.usage;
        }

    }

}
