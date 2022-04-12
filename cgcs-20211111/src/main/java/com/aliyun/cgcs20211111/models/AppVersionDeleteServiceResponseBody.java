// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class AppVersionDeleteServiceResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public AppVersionDeleteServiceResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static AppVersionDeleteServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AppVersionDeleteServiceResponseBody self = new AppVersionDeleteServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public AppVersionDeleteServiceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public AppVersionDeleteServiceResponseBody setData(AppVersionDeleteServiceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public AppVersionDeleteServiceResponseBodyData getData() {
        return this.data;
    }

    public AppVersionDeleteServiceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AppVersionDeleteServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class AppVersionDeleteServiceResponseBodyData extends TeaModel {
        @NameInMap("AppVersionId")
        public String appVersionId;

        public static AppVersionDeleteServiceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            AppVersionDeleteServiceResponseBodyData self = new AppVersionDeleteServiceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public AppVersionDeleteServiceResponseBodyData setAppVersionId(String appVersionId) {
            this.appVersionId = appVersionId;
            return this;
        }
        public String getAppVersionId() {
            return this.appVersionId;
        }

    }

}
