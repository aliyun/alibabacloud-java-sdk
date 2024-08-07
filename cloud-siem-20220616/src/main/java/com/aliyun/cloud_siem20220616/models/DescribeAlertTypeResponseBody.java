// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DescribeAlertTypeResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The data returned.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("Data")
    public java.util.List<DescribeAlertTypeResponseBodyData> data;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>9AAA9ED9-78F4-5021-86DC-D51C7511****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        /**
         * <p>The type of the risk.</p>
         * 
         * <strong>example:</strong>
         * <p>WEBSHELL</p>
         */
        @NameInMap("AlertType")
        public String alertType;

        /**
         * <p>The internal code of the risk type.</p>
         * 
         * <strong>example:</strong>
         * <p>siem_rule_type_process_abnormal_command</p>
         */
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
