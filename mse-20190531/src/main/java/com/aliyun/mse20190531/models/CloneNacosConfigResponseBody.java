// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class CloneNacosConfigResponseBody extends TeaModel {
    // The status code returned.
    @NameInMap("Code")
    public Integer code;

    // The details of the data.
    @NameInMap("Data")
    public CloneNacosConfigResponseBodyData data;

    // The dynamic part in the error message. This parameter is used to replace the **%s** variable in the **Message** parameter. 
    // > If the specified **InstanceId** parameter is invalid, **The Value of Input Parameter %s is not valid** is returned for **Message** and **InstanceId** is returned for **DynamicMessage**.
    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    // The error code returned if the request fails.
    @NameInMap("ErrorCode")
    public String errorCode;

    // The HTTP status code returned.
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    // The message returned.
    @NameInMap("Message")
    public String message;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // Indicates whether the request is successful. Valid values:
    // - `true`: The request is successful. 
    // - `false`: The request fails.
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
        // The data ID.
        @NameInMap("DataId")
        public String dataId;

        // The ID of the group.
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
        // The data ID.
        @NameInMap("DataId")
        public String dataId;

        // The ID of the group.
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
        // The details of the failed configurations.
        @NameInMap("FailData")
        public java.util.List<CloneNacosConfigResponseBodyDataFailData> failData;

        // The number of skipped operations.
        @NameInMap("SkipCount")
        public Integer skipCount;

        // The details of the skipped configurations.
        @NameInMap("SkipData")
        public java.util.List<CloneNacosConfigResponseBodyDataSkipData> skipData;

        // The number of successful operations.
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
