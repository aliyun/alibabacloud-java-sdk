// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210730.models;

import com.aliyun.tea.*;

public class ListAppGroupAdaptorResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<ListAppGroupAdaptorResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static ListAppGroupAdaptorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAppGroupAdaptorResponseBody self = new ListAppGroupAdaptorResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAppGroupAdaptorResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListAppGroupAdaptorResponseBody setData(java.util.List<ListAppGroupAdaptorResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListAppGroupAdaptorResponseBodyData> getData() {
        return this.data;
    }

    public ListAppGroupAdaptorResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListAppGroupAdaptorResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListAppGroupAdaptorResponseBodyData extends TeaModel {
        @NameInMap("AppName")
        public String appName;

        @NameInMap("AppVersionName")
        public String appVersionName;

        @NameInMap("AppVersionNumber")
        public String appVersionNumber;

        @NameInMap("FileSize")
        public Long fileSize;

        @NameInMap("Uid")
        public String uid;

        public static ListAppGroupAdaptorResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListAppGroupAdaptorResponseBodyData self = new ListAppGroupAdaptorResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListAppGroupAdaptorResponseBodyData setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public ListAppGroupAdaptorResponseBodyData setAppVersionName(String appVersionName) {
            this.appVersionName = appVersionName;
            return this;
        }
        public String getAppVersionName() {
            return this.appVersionName;
        }

        public ListAppGroupAdaptorResponseBodyData setAppVersionNumber(String appVersionNumber) {
            this.appVersionNumber = appVersionNumber;
            return this;
        }
        public String getAppVersionNumber() {
            return this.appVersionNumber;
        }

        public ListAppGroupAdaptorResponseBodyData setFileSize(Long fileSize) {
            this.fileSize = fileSize;
            return this;
        }
        public Long getFileSize() {
            return this.fileSize;
        }

        public ListAppGroupAdaptorResponseBodyData setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

    }

}
