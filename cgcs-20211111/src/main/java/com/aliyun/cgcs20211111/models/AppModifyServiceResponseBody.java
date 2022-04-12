// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class AppModifyServiceResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public AppModifyServiceResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static AppModifyServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AppModifyServiceResponseBody self = new AppModifyServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public AppModifyServiceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public AppModifyServiceResponseBody setData(AppModifyServiceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public AppModifyServiceResponseBodyData getData() {
        return this.data;
    }

    public AppModifyServiceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AppModifyServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class AppModifyServiceResponseBodyData extends TeaModel {
        @NameInMap("AppId")
        public String appId;

        public static AppModifyServiceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            AppModifyServiceResponseBodyData self = new AppModifyServiceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public AppModifyServiceResponseBodyData setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

    }

}
