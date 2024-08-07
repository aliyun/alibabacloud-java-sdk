// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DescribeLogFieldsResponseBody extends TeaModel {
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
    public java.util.List<DescribeLogFieldsResponseBodyData> data;

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

    public static DescribeLogFieldsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLogFieldsResponseBody self = new DescribeLogFieldsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLogFieldsResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DescribeLogFieldsResponseBody setData(java.util.List<DescribeLogFieldsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeLogFieldsResponseBodyData> getData() {
        return this.data;
    }

    public DescribeLogFieldsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeLogFieldsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLogFieldsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeLogFieldsResponseBodyData extends TeaModel {
        /**
         * <p>The type of the log to which the field belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>HTTP_ACTIVITY</p>
         */
        @NameInMap("ActivityName")
        public String activityName;

        /**
         * <p>The internal code of the field description.</p>
         * 
         * <strong>example:</strong>
         * <p>sas.cloudsiem.prod.activity_name</p>
         */
        @NameInMap("FieldDesc")
        public String fieldDesc;

        /**
         * <p>The name of the field.</p>
         * 
         * <strong>example:</strong>
         * <p>activity_name</p>
         */
        @NameInMap("FieldName")
        public String fieldName;

        /**
         * <p>The data type of the field. Valid values:</p>
         * <ul>
         * <li>varchar</li>
         * <li>bigint</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>varchar</p>
         */
        @NameInMap("FieldType")
        public String fieldType;

        /**
         * <p>The log source to which the field belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>cloud_siem_aegis_sas_alert</p>
         */
        @NameInMap("LogCode")
        public String logCode;

        public static DescribeLogFieldsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeLogFieldsResponseBodyData self = new DescribeLogFieldsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeLogFieldsResponseBodyData setActivityName(String activityName) {
            this.activityName = activityName;
            return this;
        }
        public String getActivityName() {
            return this.activityName;
        }

        public DescribeLogFieldsResponseBodyData setFieldDesc(String fieldDesc) {
            this.fieldDesc = fieldDesc;
            return this;
        }
        public String getFieldDesc() {
            return this.fieldDesc;
        }

        public DescribeLogFieldsResponseBodyData setFieldName(String fieldName) {
            this.fieldName = fieldName;
            return this;
        }
        public String getFieldName() {
            return this.fieldName;
        }

        public DescribeLogFieldsResponseBodyData setFieldType(String fieldType) {
            this.fieldType = fieldType;
            return this;
        }
        public String getFieldType() {
            return this.fieldType;
        }

        public DescribeLogFieldsResponseBodyData setLogCode(String logCode) {
            this.logCode = logCode;
            return this;
        }
        public String getLogCode() {
            return this.logCode;
        }

    }

}
