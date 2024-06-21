// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class CloneNacosConfigResponseBody extends TeaModel {
    /**
     * <p>The dynamic part in the error message. This parameter is used to replace the \<em>\</em>%s\<em>\</em> variable in the <strong>ErrMessage</strong> parameter.</p>
     * <blockquote>
     * <p> If the return value of the <strong>ErrMessage</strong> parameter is <strong>The Value of Input Parameter %s is not valid</strong> and the return value of the <strong>DynamicMessage</strong> parameter is <strong>DtsJobId</strong>, the specified <strong>DtsJobId</strong> parameter is invalid.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The number of skipped operations.</p>
     */
    @NameInMap("Data")
    public CloneNacosConfigResponseBodyData data;

    /**
     * <p>The number of successful operations.</p>
     * 
     * <strong>example:</strong>
     * <p>The specified parameter is invalid.</p>
     */
    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    /**
     * <p>The message returned.</p>
     * 
     * <strong>example:</strong>
     * <p>mse-100-000</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><code>true</code>: The request was successful.</li>
     * <li><code>false</code>: The request failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The details of the data.</p>
     * 
     * <strong>example:</strong>
     * <p>Clone Completed Successfully</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The error code returned if the request failed.</p>
     * 
     * <strong>example:</strong>
     * <p>6678DBA9-5600-5948-ACF8-ED3105B288A3</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The response code returned.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CloneNacosConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CloneNacosConfigResponseBody self = new CloneNacosConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public CloneNacosConfigResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public CloneNacosConfigResponseBody setData(CloneNacosConfigResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CloneNacosConfigResponseBodyData getData() {
        return this.data;
    }

    public CloneNacosConfigResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public CloneNacosConfigResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public CloneNacosConfigResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public CloneNacosConfigResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CloneNacosConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CloneNacosConfigResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CloneNacosConfigResponseBodyDataFailData extends TeaModel {
        /**
         * <p>mse-200-105</p>
         * 
         * <strong>example:</strong>
         * <p>test2.yaml</p>
         */
        @NameInMap("DataId")
        public String dataId;

        /**
         * <p>duplicatedClusterAliasName</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Group")
        public String group;

        public static CloneNacosConfigResponseBodyDataFailData build(java.util.Map<String, ?> map) throws Exception {
            CloneNacosConfigResponseBodyDataFailData self = new CloneNacosConfigResponseBodyDataFailData();
            return TeaModel.build(map, self);
        }

        public CloneNacosConfigResponseBodyDataFailData setDataId(String dataId) {
            this.dataId = dataId;
            return this;
        }
        public String getDataId() {
            return this.dataId;
        }

        public CloneNacosConfigResponseBodyDataFailData setGroup(String group) {
            this.group = group;
            return this;
        }
        public String getGroup() {
            return this.group;
        }

    }

    public static class CloneNacosConfigResponseBodyDataSkipData extends TeaModel {
        /**
         * <p>The details of the failed configurations.</p>
         * 
         * <strong>example:</strong>
         * <p>test.yaml</p>
         */
        @NameInMap("DataId")
        public String dataId;

        /**
         * <p>The data structure.</p>
         * 
         * <strong>example:</strong>
         * <p>public</p>
         */
        @NameInMap("Group")
        public String group;

        public static CloneNacosConfigResponseBodyDataSkipData build(java.util.Map<String, ?> map) throws Exception {
            CloneNacosConfigResponseBodyDataSkipData self = new CloneNacosConfigResponseBodyDataSkipData();
            return TeaModel.build(map, self);
        }

        public CloneNacosConfigResponseBodyDataSkipData setDataId(String dataId) {
            this.dataId = dataId;
            return this;
        }
        public String getDataId() {
            return this.dataId;
        }

        public CloneNacosConfigResponseBodyDataSkipData setGroup(String group) {
            this.group = group;
            return this;
        }
        public String getGroup() {
            return this.group;
        }

    }

    public static class CloneNacosConfigResponseBodyData extends TeaModel {
        /**
         * <p>The ID of the data.</p>
         */
        @NameInMap("FailData")
        public java.util.List<CloneNacosConfigResponseBodyDataFailData> failData;

        /**
         * <p>The data structure.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SkipCount")
        public Integer skipCount;

        /**
         * <p>The ID of the data.</p>
         */
        @NameInMap("SkipData")
        public java.util.List<CloneNacosConfigResponseBodyDataSkipData> skipData;

        /**
         * <p>The details of the skipped configurations.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("SuccCount")
        public Integer succCount;

        public static CloneNacosConfigResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CloneNacosConfigResponseBodyData self = new CloneNacosConfigResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CloneNacosConfigResponseBodyData setFailData(java.util.List<CloneNacosConfigResponseBodyDataFailData> failData) {
            this.failData = failData;
            return this;
        }
        public java.util.List<CloneNacosConfigResponseBodyDataFailData> getFailData() {
            return this.failData;
        }

        public CloneNacosConfigResponseBodyData setSkipCount(Integer skipCount) {
            this.skipCount = skipCount;
            return this;
        }
        public Integer getSkipCount() {
            return this.skipCount;
        }

        public CloneNacosConfigResponseBodyData setSkipData(java.util.List<CloneNacosConfigResponseBodyDataSkipData> skipData) {
            this.skipData = skipData;
            return this;
        }
        public java.util.List<CloneNacosConfigResponseBodyDataSkipData> getSkipData() {
            return this.skipData;
        }

        public CloneNacosConfigResponseBodyData setSuccCount(Integer succCount) {
            this.succCount = succCount;
            return this;
        }
        public Integer getSuccCount() {
            return this.succCount;
        }

    }

}
