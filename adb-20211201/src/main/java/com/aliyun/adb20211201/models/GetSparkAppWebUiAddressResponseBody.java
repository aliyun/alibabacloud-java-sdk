// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class GetSparkAppWebUiAddressResponseBody extends TeaModel {
    @NameInMap("Data")
    public GetSparkAppWebUiAddressResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static GetSparkAppWebUiAddressResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSparkAppWebUiAddressResponseBody self = new GetSparkAppWebUiAddressResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSparkAppWebUiAddressResponseBody setData(GetSparkAppWebUiAddressResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetSparkAppWebUiAddressResponseBodyData getData() {
        return this.data;
    }

    public GetSparkAppWebUiAddressResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetSparkAppWebUiAddressResponseBodyData extends TeaModel {
        @NameInMap("AppId")
        public String appId;

        @NameInMap("DBClusterId")
        public String DBClusterId;

        @NameInMap("ExpirationTimeInMillis")
        public Long expirationTimeInMillis;

        @NameInMap("WebUiAddress")
        public String webUiAddress;

        public static GetSparkAppWebUiAddressResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetSparkAppWebUiAddressResponseBodyData self = new GetSparkAppWebUiAddressResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetSparkAppWebUiAddressResponseBodyData setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public GetSparkAppWebUiAddressResponseBodyData setDBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }
        public String getDBClusterId() {
            return this.DBClusterId;
        }

        public GetSparkAppWebUiAddressResponseBodyData setExpirationTimeInMillis(Long expirationTimeInMillis) {
            this.expirationTimeInMillis = expirationTimeInMillis;
            return this;
        }
        public Long getExpirationTimeInMillis() {
            return this.expirationTimeInMillis;
        }

        public GetSparkAppWebUiAddressResponseBodyData setWebUiAddress(String webUiAddress) {
            this.webUiAddress = webUiAddress;
            return this;
        }
        public String getWebUiAddress() {
            return this.webUiAddress;
        }

    }

}
