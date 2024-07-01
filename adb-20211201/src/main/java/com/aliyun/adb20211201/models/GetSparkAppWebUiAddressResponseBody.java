// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class GetSparkAppWebUiAddressResponseBody extends TeaModel {
    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public GetSparkAppWebUiAddressResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>D65A809F-34CE-4550-9BC1-0ED21ETG380</p>
     */
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
        /**
         * <p>The Spark application ID.</p>
         * 
         * <strong>example:</strong>
         * <p>s202205201533hz1209892000****</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>The database ID.</p>
         * 
         * <strong>example:</strong>
         * <p>amv-clusterxxx</p>
         */
        @NameInMap("DBClusterId")
        public String DBClusterId;

        /**
         * <p>The expiration time. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1655801973000</p>
         */
        @NameInMap("ExpirationTimeInMillis")
        public Long expirationTimeInMillis;

        /**
         * <p>The URL of the web UI for the Spark application.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://adbsparkui-cn-hangzhou.aliyuncs.com/?token=">https://adbsparkui-cn-hangzhou.aliyuncs.com/?token=</a>****</p>
         */
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
