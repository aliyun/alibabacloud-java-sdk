// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb_inc20211201.models;

import com.aliyun.tea.*;

public class InnerGetSparkAppWebUiAddressResponseBody extends TeaModel {
    @NameInMap("Data")
    public InnerGetSparkAppWebUiAddressResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static InnerGetSparkAppWebUiAddressResponseBody build(java.util.Map<String, ?> map) throws Exception {
        InnerGetSparkAppWebUiAddressResponseBody self = new InnerGetSparkAppWebUiAddressResponseBody();
        return TeaModel.build(map, self);
    }

    public InnerGetSparkAppWebUiAddressResponseBody setData(InnerGetSparkAppWebUiAddressResponseBodyData data) {
        this.data = data;
        return this;
    }
    public InnerGetSparkAppWebUiAddressResponseBodyData getData() {
        return this.data;
    }

    public InnerGetSparkAppWebUiAddressResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class InnerGetSparkAppWebUiAddressResponseBodyData extends TeaModel {
        @NameInMap("AppId")
        public String appId;

        @NameInMap("ExpirationTimeInMillis")
        public Long expirationTimeInMillis;

        @NameInMap("WebUiAddress")
        public String webUiAddress;

        public static InnerGetSparkAppWebUiAddressResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            InnerGetSparkAppWebUiAddressResponseBodyData self = new InnerGetSparkAppWebUiAddressResponseBodyData();
            return TeaModel.build(map, self);
        }

        public InnerGetSparkAppWebUiAddressResponseBodyData setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public InnerGetSparkAppWebUiAddressResponseBodyData setExpirationTimeInMillis(Long expirationTimeInMillis) {
            this.expirationTimeInMillis = expirationTimeInMillis;
            return this;
        }
        public Long getExpirationTimeInMillis() {
            return this.expirationTimeInMillis;
        }

        public InnerGetSparkAppWebUiAddressResponseBodyData setWebUiAddress(String webUiAddress) {
            this.webUiAddress = webUiAddress;
            return this;
        }
        public String getWebUiAddress() {
            return this.webUiAddress;
        }

    }

}
