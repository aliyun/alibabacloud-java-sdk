// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class AppCreateServiceResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public AppCreateServiceResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static AppCreateServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AppCreateServiceResponseBody self = new AppCreateServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public AppCreateServiceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public AppCreateServiceResponseBody setData(AppCreateServiceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public AppCreateServiceResponseBodyData getData() {
        return this.data;
    }

    public AppCreateServiceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AppCreateServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class AppCreateServiceResponseBodyData extends TeaModel {
        @NameInMap("AppId")
        public String appId;

        public static AppCreateServiceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            AppCreateServiceResponseBodyData self = new AppCreateServiceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public AppCreateServiceResponseBodyData setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

    }

}
