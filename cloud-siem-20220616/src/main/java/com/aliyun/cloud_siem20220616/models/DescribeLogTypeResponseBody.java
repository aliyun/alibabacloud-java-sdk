// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DescribeLogTypeResponseBody extends TeaModel {
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
    public java.util.List<DescribeLogTypeResponseBodyData> data;

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

    public static DescribeLogTypeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLogTypeResponseBody self = new DescribeLogTypeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLogTypeResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DescribeLogTypeResponseBody setData(java.util.List<DescribeLogTypeResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeLogTypeResponseBodyData> getData() {
        return this.data;
    }

    public DescribeLogTypeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeLogTypeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLogTypeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeLogTypeResponseBodyData extends TeaModel {
        /**
         * <p>The log type of the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>HTTP_ACTIVITY</p>
         */
        @NameInMap("LogType")
        public String logType;

        /**
         * <p>The internal code of the log type.</p>
         * 
         * <strong>example:</strong>
         * <p>sas.cloudsiem.prod.http_activity</p>
         */
        @NameInMap("LogTypeName")
        public String logTypeName;

        public static DescribeLogTypeResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeLogTypeResponseBodyData self = new DescribeLogTypeResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeLogTypeResponseBodyData setLogType(String logType) {
            this.logType = logType;
            return this;
        }
        public String getLogType() {
            return this.logType;
        }

        public DescribeLogTypeResponseBodyData setLogTypeName(String logTypeName) {
            this.logTypeName = logTypeName;
            return this;
        }
        public String getLogTypeName() {
            return this.logTypeName;
        }

    }

}
