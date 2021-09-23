// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ImportNacosConfigResponseBody extends TeaModel {
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("Code")
    public Integer code;

    @NameInMap("Message")
    public String message;

    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    @NameInMap("Data")
    public ImportNacosConfigResponseBodyData data;

    public static ImportNacosConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ImportNacosConfigResponseBody self = new ImportNacosConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public ImportNacosConfigResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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

    public ImportNacosConfigResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ImportNacosConfigResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ImportNacosConfigResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ImportNacosConfigResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public ImportNacosConfigResponseBody setData(ImportNacosConfigResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ImportNacosConfigResponseBodyData getData() {
        return this.data;
    }

    public static class ImportNacosConfigResponseBodyDataSkipData extends TeaModel {
        @NameInMap("DataId")
        public String dataId;

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

    public static class ImportNacosConfigResponseBodyDataFailData extends TeaModel {
        @NameInMap("DataId")
        public String dataId;

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

    public static class ImportNacosConfigResponseBodyData extends TeaModel {
        @NameInMap("SuccCount")
        public Integer succCount;

        @NameInMap("SkipCount")
        public Integer skipCount;

        @NameInMap("SkipData")
        public java.util.List<ImportNacosConfigResponseBodyDataSkipData> skipData;

        @NameInMap("FailData")
        public java.util.List<ImportNacosConfigResponseBodyDataFailData> failData;

        public static ImportNacosConfigResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ImportNacosConfigResponseBodyData self = new ImportNacosConfigResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ImportNacosConfigResponseBodyData setSuccCount(Integer succCount) {
            this.succCount = succCount;
            return this;
        }
        public Integer getSuccCount() {
            return this.succCount;
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

        public ImportNacosConfigResponseBodyData setFailData(java.util.List<ImportNacosConfigResponseBodyDataFailData> failData) {
            this.failData = failData;
            return this;
        }
        public java.util.List<ImportNacosConfigResponseBodyDataFailData> getFailData() {
            return this.failData;
        }

    }

}
