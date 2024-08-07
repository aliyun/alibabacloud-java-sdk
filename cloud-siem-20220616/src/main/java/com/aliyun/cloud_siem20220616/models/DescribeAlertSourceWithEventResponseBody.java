// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DescribeAlertSourceWithEventResponseBody extends TeaModel {
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
    public java.util.List<DescribeAlertSourceWithEventResponseBodyData> data;

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

    public static DescribeAlertSourceWithEventResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAlertSourceWithEventResponseBody self = new DescribeAlertSourceWithEventResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAlertSourceWithEventResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DescribeAlertSourceWithEventResponseBody setData(java.util.List<DescribeAlertSourceWithEventResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeAlertSourceWithEventResponseBodyData> getData() {
        return this.data;
    }

    public DescribeAlertSourceWithEventResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeAlertSourceWithEventResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAlertSourceWithEventResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeAlertSourceWithEventResponseBodyData extends TeaModel {
        /**
         * <p>The internal code of the alert data source.</p>
         * 
         * <strong>example:</strong>
         * <p>aliyun.siem.alert_datasource.sas</p>
         */
        @NameInMap("Source")
        public String source;

        /**
         * <p>The name of the alert data source.</p>
         * 
         * <strong>example:</strong>
         * <p>sas</p>
         */
        @NameInMap("SourceName")
        public String sourceName;

        public static DescribeAlertSourceWithEventResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeAlertSourceWithEventResponseBodyData self = new DescribeAlertSourceWithEventResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeAlertSourceWithEventResponseBodyData setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public DescribeAlertSourceWithEventResponseBodyData setSourceName(String sourceName) {
            this.sourceName = sourceName;
            return this;
        }
        public String getSourceName() {
            return this.sourceName;
        }

    }

}
