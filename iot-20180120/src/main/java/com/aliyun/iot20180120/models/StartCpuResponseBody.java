// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class StartCpuResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Code")
    public String code;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Data")
    public StartCpuResponseBodyData data;

    public static StartCpuResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StartCpuResponseBody self = new StartCpuResponseBody();
        return TeaModel.build(map, self);
    }

    public StartCpuResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public StartCpuResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public StartCpuResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public StartCpuResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public StartCpuResponseBody setData(StartCpuResponseBodyData data) {
        this.data = data;
        return this;
    }
    public StartCpuResponseBodyData getData() {
        return this.data;
    }

    public static class StartCpuResponseBodyData extends TeaModel {
        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("GmtModified")
        public Long gmtModified;

        @NameInMap("TimeZone")
        public String timeZone;

        @NameInMap("IotInstanceId")
        public String iotInstanceId;

        public static StartCpuResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            StartCpuResponseBodyData self = new StartCpuResponseBodyData();
            return TeaModel.build(map, self);
        }

        public StartCpuResponseBodyData setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public StartCpuResponseBodyData setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public StartCpuResponseBodyData setTimeZone(String timeZone) {
            this.timeZone = timeZone;
            return this;
        }
        public String getTimeZone() {
            return this.timeZone;
        }

        public StartCpuResponseBodyData setIotInstanceId(String iotInstanceId) {
            this.iotInstanceId = iotInstanceId;
            return this;
        }
        public String getIotInstanceId() {
            return this.iotInstanceId;
        }

    }

}
