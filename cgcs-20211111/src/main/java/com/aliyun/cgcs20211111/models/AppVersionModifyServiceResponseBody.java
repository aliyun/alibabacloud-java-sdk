// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class AppVersionModifyServiceResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public AppVersionModifyServiceResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static AppVersionModifyServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AppVersionModifyServiceResponseBody self = new AppVersionModifyServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public AppVersionModifyServiceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public AppVersionModifyServiceResponseBody setData(AppVersionModifyServiceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public AppVersionModifyServiceResponseBodyData getData() {
        return this.data;
    }

    public AppVersionModifyServiceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AppVersionModifyServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class AppVersionModifyServiceResponseBodyData extends TeaModel {
        @NameInMap("AppVersionId")
        public String appVersionId;

        public static AppVersionModifyServiceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            AppVersionModifyServiceResponseBodyData self = new AppVersionModifyServiceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public AppVersionModifyServiceResponseBodyData setAppVersionId(String appVersionId) {
            this.appVersionId = appVersionId;
            return this;
        }
        public String getAppVersionId() {
            return this.appVersionId;
        }

    }

}
