// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class AppDeleteServiceResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public AppDeleteServiceResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static AppDeleteServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AppDeleteServiceResponseBody self = new AppDeleteServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public AppDeleteServiceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public AppDeleteServiceResponseBody setData(AppDeleteServiceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public AppDeleteServiceResponseBodyData getData() {
        return this.data;
    }

    public AppDeleteServiceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AppDeleteServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class AppDeleteServiceResponseBodyData extends TeaModel {
        @NameInMap("AppId")
        public String appId;

        public static AppDeleteServiceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            AppDeleteServiceResponseBodyData self = new AppDeleteServiceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public AppDeleteServiceResponseBodyData setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

    }

}
