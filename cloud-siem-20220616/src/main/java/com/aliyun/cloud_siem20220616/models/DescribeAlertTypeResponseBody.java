// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DescribeAlertTypeResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public java.util.List<DescribeAlertTypeResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeAlertTypeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAlertTypeResponseBody self = new DescribeAlertTypeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAlertTypeResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DescribeAlertTypeResponseBody setData(java.util.List<DescribeAlertTypeResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeAlertTypeResponseBodyData> getData() {
        return this.data;
    }

    public DescribeAlertTypeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeAlertTypeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAlertTypeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeAlertTypeResponseBodyData extends TeaModel {
        @NameInMap("AlertType")
        public String alertType;

        @NameInMap("AlertTypeMds")
        public String alertTypeMds;

        public static DescribeAlertTypeResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeAlertTypeResponseBodyData self = new DescribeAlertTypeResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeAlertTypeResponseBodyData setAlertType(String alertType) {
            this.alertType = alertType;
            return this;
        }
        public String getAlertType() {
            return this.alertType;
        }

        public DescribeAlertTypeResponseBodyData setAlertTypeMds(String alertTypeMds) {
            this.alertTypeMds = alertTypeMds;
            return this;
        }
        public String getAlertTypeMds() {
            return this.alertTypeMds;
        }

    }

}
