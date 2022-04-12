// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class GetAppListResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<GetAppListResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static GetAppListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAppListResponseBody self = new GetAppListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAppListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetAppListResponseBody setData(java.util.List<GetAppListResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetAppListResponseBodyData> getData() {
        return this.data;
    }

    public GetAppListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetAppListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetAppListResponseBodyData extends TeaModel {
        // 应用ID
        @NameInMap("AppId")
        public String appId;

        // 应用名称
        @NameInMap("AppName")
        public String appName;

        public static GetAppListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetAppListResponseBodyData self = new GetAppListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetAppListResponseBodyData setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public GetAppListResponseBodyData setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

    }

}
