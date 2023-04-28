// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ImportNacosConfigResponseBody extends TeaModel {
    /**
     * <p>mse-200-021</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>systemError</p>
     */
    @NameInMap("Data")
    public ImportNacosConfigResponseBodyData data;

    /**
     * <p>mse-100-001</p>
     */
    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    /**
     * <p>illegal request:%s</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>duplicated cluster alias name</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>clusterNotFound</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>mse-100-007</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>illegalRequest</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ImportNacosConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ImportNacosConfigResponseBody self = new ImportNacosConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public ImportNacosConfigResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ImportNacosConfigResponseBody setData(ImportNacosConfigResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ImportNacosConfigResponseBodyData getData() {
        return this.data;
    }

    public ImportNacosConfigResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public ImportNacosConfigResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ImportNacosConfigResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ImportNacosConfigResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ImportNacosConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ImportNacosConfigResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ImportNacosConfigResponseBodyDataFailData extends TeaModel {
        /**
         * <p>The ID of the request.</p>
         */
        @NameInMap("DataId")
        public String dataId;

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <br>
         * <p>*   `true`: The request was successful.</p>
         * <p>*   `false`: The request failed.</p>
         */
        @NameInMap("Group")
        public String group;

        public static ImportNacosConfigResponseBodyDataFailData build(java.util.Map<String, ?> map) throws Exception {
            ImportNacosConfigResponseBodyDataFailData self = new ImportNacosConfigResponseBodyDataFailData();
            return TeaModel.build(map, self);
        }

        public ImportNacosConfigResponseBodyDataFailData setDataId(String dataId) {
            this.dataId = dataId;
            return this;
        }
        public String getDataId() {
            return this.dataId;
        }

        public ImportNacosConfigResponseBodyDataFailData setGroup(String group) {
            this.group = group;
            return this;
        }
        public String getGroup() {
            return this.group;
        }

    }

    public static class ImportNacosConfigResponseBodyDataSkipData extends TeaModel {
        /**
         * <p>The URL that is used to download the configuration file.</p>
         */
        @NameInMap("DataId")
        public String dataId;

        /**
         * <p>The language of the response. Valid values:</p>
         * <br>
         * <p>*   zh: Chinese</p>
         * <p>*   en: English</p>
         */
        @NameInMap("Group")
        public String group;

        public static ImportNacosConfigResponseBodyDataSkipData build(java.util.Map<String, ?> map) throws Exception {
            ImportNacosConfigResponseBodyDataSkipData self = new ImportNacosConfigResponseBodyDataSkipData();
            return TeaModel.build(map, self);
        }

        public ImportNacosConfigResponseBodyDataSkipData setDataId(String dataId) {
            this.dataId = dataId;
            return this;
        }
        public String getDataId() {
            return this.dataId;
        }

        public ImportNacosConfigResponseBodyDataSkipData setGroup(String group) {
            this.group = group;
            return this;
        }
        public String getGroup() {
            return this.group;
        }

    }

    public static class ImportNacosConfigResponseBodyData extends TeaModel {
        /**
         * <p>The data structure.</p>
         */
        @NameInMap("FailData")
        public java.util.List<ImportNacosConfigResponseBodyDataFailData> failData;

        /**
         * <p>The ID of the instance.</p>
         */
        @NameInMap("SkipCount")
        public Integer skipCount;

        /**
         * <p>The ID of the namespace.</p>
         */
        @NameInMap("SkipData")
        public java.util.List<ImportNacosConfigResponseBodyDataSkipData> skipData;

        /**
         * <p>system error</p>
         */
        @NameInMap("SuccCount")
        public Integer succCount;

        public static ImportNacosConfigResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ImportNacosConfigResponseBodyData self = new ImportNacosConfigResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ImportNacosConfigResponseBodyData setFailData(java.util.List<ImportNacosConfigResponseBodyDataFailData> failData) {
            this.failData = failData;
            return this;
        }
        public java.util.List<ImportNacosConfigResponseBodyDataFailData> getFailData() {
            return this.failData;
        }

        public ImportNacosConfigResponseBodyData setSkipCount(Integer skipCount) {
            this.skipCount = skipCount;
            return this;
        }
        public Integer getSkipCount() {
            return this.skipCount;
        }

        public ImportNacosConfigResponseBodyData setSkipData(java.util.List<ImportNacosConfigResponseBodyDataSkipData> skipData) {
            this.skipData = skipData;
            return this;
        }
        public java.util.List<ImportNacosConfigResponseBodyDataSkipData> getSkipData() {
            return this.skipData;
        }

        public ImportNacosConfigResponseBodyData setSuccCount(Integer succCount) {
            this.succCount = succCount;
            return this;
        }
        public Integer getSuccCount() {
            return this.succCount;
        }

    }

}
