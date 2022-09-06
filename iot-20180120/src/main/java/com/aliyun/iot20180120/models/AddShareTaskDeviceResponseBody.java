// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class AddShareTaskDeviceResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public AddShareTaskDeviceResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static AddShareTaskDeviceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddShareTaskDeviceResponseBody self = new AddShareTaskDeviceResponseBody();
        return TeaModel.build(map, self);
    }

    public AddShareTaskDeviceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public AddShareTaskDeviceResponseBody setData(AddShareTaskDeviceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public AddShareTaskDeviceResponseBodyData getData() {
        return this.data;
    }

    public AddShareTaskDeviceResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public AddShareTaskDeviceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddShareTaskDeviceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class AddShareTaskDeviceResponseBodyData extends TeaModel {
        @NameInMap("Progress")
        public Integer progress;

        @NameInMap("ProgressId")
        public String progressId;

        public static AddShareTaskDeviceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            AddShareTaskDeviceResponseBodyData self = new AddShareTaskDeviceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public AddShareTaskDeviceResponseBodyData setProgress(Integer progress) {
            this.progress = progress;
            return this;
        }
        public Integer getProgress() {
            return this.progress;
        }

        public AddShareTaskDeviceResponseBodyData setProgressId(String progressId) {
            this.progressId = progressId;
            return this;
        }
        public String getProgressId() {
            return this.progressId;
        }

    }

}
