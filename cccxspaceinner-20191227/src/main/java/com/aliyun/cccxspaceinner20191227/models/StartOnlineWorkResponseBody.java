// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspaceinner20191227.models;

import com.aliyun.tea.*;

public class StartOnlineWorkResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("Data")
    public StartOnlineWorkResponseBodyData data;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    public static StartOnlineWorkResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StartOnlineWorkResponseBody self = new StartOnlineWorkResponseBody();
        return TeaModel.build(map, self);
    }

    public StartOnlineWorkResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public StartOnlineWorkResponseBody setData(StartOnlineWorkResponseBodyData data) {
        this.data = data;
        return this;
    }
    public StartOnlineWorkResponseBodyData getData() {
        return this.data;
    }

    public StartOnlineWorkResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public StartOnlineWorkResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class StartOnlineWorkResponseBodyDataInitStatus extends TeaModel {
        @NameInMap("Status")
        public Boolean status;

        public static StartOnlineWorkResponseBodyDataInitStatus build(java.util.Map<String, ?> map) throws Exception {
            StartOnlineWorkResponseBodyDataInitStatus self = new StartOnlineWorkResponseBodyDataInitStatus();
            return TeaModel.build(map, self);
        }

        public StartOnlineWorkResponseBodyDataInitStatus setStatus(Boolean status) {
            this.status = status;
            return this;
        }
        public Boolean getStatus() {
            return this.status;
        }

    }

    public static class StartOnlineWorkResponseBodyData extends TeaModel {
        @NameInMap("InitStatus")
        public StartOnlineWorkResponseBodyDataInitStatus initStatus;

        public static StartOnlineWorkResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            StartOnlineWorkResponseBodyData self = new StartOnlineWorkResponseBodyData();
            return TeaModel.build(map, self);
        }

        public StartOnlineWorkResponseBodyData setInitStatus(StartOnlineWorkResponseBodyDataInitStatus initStatus) {
            this.initStatus = initStatus;
            return this;
        }
        public StartOnlineWorkResponseBodyDataInitStatus getInitStatus() {
            return this.initStatus;
        }

    }

}
