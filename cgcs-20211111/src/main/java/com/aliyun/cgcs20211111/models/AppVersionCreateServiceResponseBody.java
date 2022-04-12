// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class AppVersionCreateServiceResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public AppVersionCreateServiceResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static AppVersionCreateServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AppVersionCreateServiceResponseBody self = new AppVersionCreateServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public AppVersionCreateServiceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public AppVersionCreateServiceResponseBody setData(AppVersionCreateServiceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public AppVersionCreateServiceResponseBodyData getData() {
        return this.data;
    }

    public AppVersionCreateServiceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AppVersionCreateServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class AppVersionCreateServiceResponseBodyData extends TeaModel {
        @NameInMap("AppVersionId")
        public String appVersionId;

        public static AppVersionCreateServiceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            AppVersionCreateServiceResponseBodyData self = new AppVersionCreateServiceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public AppVersionCreateServiceResponseBodyData setAppVersionId(String appVersionId) {
            this.appVersionId = appVersionId;
            return this;
        }
        public String getAppVersionId() {
            return this.appVersionId;
        }

    }

}
