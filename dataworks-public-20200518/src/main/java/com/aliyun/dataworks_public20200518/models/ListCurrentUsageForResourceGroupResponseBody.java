// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListCurrentUsageForResourceGroupResponseBody extends TeaModel {
    @NameInMap("Data")
    public ListCurrentUsageForResourceGroupResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListCurrentUsageForResourceGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCurrentUsageForResourceGroupResponseBody self = new ListCurrentUsageForResourceGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCurrentUsageForResourceGroupResponseBody setData(ListCurrentUsageForResourceGroupResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListCurrentUsageForResourceGroupResponseBodyData getData() {
        return this.data;
    }

    public ListCurrentUsageForResourceGroupResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListCurrentUsageForResourceGroupResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListCurrentUsageForResourceGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCurrentUsageForResourceGroupResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListCurrentUsageForResourceGroupResponseBodyData extends TeaModel {
        @NameInMap("RecodeTime")
        public Long recodeTime;

        @NameInMap("Usage")
        public Float usage;

        public static ListCurrentUsageForResourceGroupResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListCurrentUsageForResourceGroupResponseBodyData self = new ListCurrentUsageForResourceGroupResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListCurrentUsageForResourceGroupResponseBodyData setRecodeTime(Long recodeTime) {
            this.recodeTime = recodeTime;
            return this;
        }
        public Long getRecodeTime() {
            return this.recodeTime;
        }

        public ListCurrentUsageForResourceGroupResponseBodyData setUsage(Float usage) {
            this.usage = usage;
            return this;
        }
        public Float getUsage() {
            return this.usage;
        }

    }

}
