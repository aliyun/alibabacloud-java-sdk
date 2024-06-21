// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetCloudClusterAllUrlResponseBody extends TeaModel {
    /**
     * <p>状态码。200为成功，其他状态码为异常。</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>An array object.</p>
     */
    @NameInMap("Data")
    public java.util.List<GetCloudClusterAllUrlResponseBodyData> data;

    /**
     * <p>详细信息。</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>99A663CB-8D7B-4B0D-A006-03C8EE38E7BB</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>操作是否成功：true：操作成功                                 false：操作失败</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetCloudClusterAllUrlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCloudClusterAllUrlResponseBody self = new GetCloudClusterAllUrlResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCloudClusterAllUrlResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetCloudClusterAllUrlResponseBody setData(java.util.List<GetCloudClusterAllUrlResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetCloudClusterAllUrlResponseBodyData> getData() {
        return this.data;
    }

    public GetCloudClusterAllUrlResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetCloudClusterAllUrlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetCloudClusterAllUrlResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetCloudClusterAllUrlResponseBodyDataRemoteUrl extends TeaModel {
        /**
         * <p>Indicates whether authentication is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AuthToken")
        public Boolean authToken;

        /**
         * <p>The internal URL for Grafana.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;<a href="http://cn-hangzhou-intranet.arms.aliyuncs.com:9090/api/v1/prometheus/XXXXXXXXXXXXXXXXX">http://cn-hangzhou-intranet.arms.aliyuncs.com:9090/api/v1/prometheus/XXXXXXXXXXXXXXXXX</a>&quot;</p>
         */
        @NameInMap("GrafanaUrl")
        public String grafanaUrl;

        /**
         * <p>The public URL for Grafana.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;<a href="http://cn-hangzhou.arms.aliyuncs.com:9090/api/v1/prometheus/XXXXXXXXXXXXXXXXX">http://cn-hangzhou.arms.aliyuncs.com:9090/api/v1/prometheus/XXXXXXXXXXXXXXXXX</a>&quot;</p>
         */
        @NameInMap("InternetGrafanaUrl")
        public String internetGrafanaUrl;

        /**
         * <p>The public URL for Pushgateway.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;<a href="http://cn-hangzhou.arms.aliyuncs.com:9090/api/v1/prometheus/XXXXXXXXXXXXXXXXX">http://cn-hangzhou.arms.aliyuncs.com:9090/api/v1/prometheus/XXXXXXXXXXXXXXXXX</a>&quot;</p>
         */
        @NameInMap("InternetPushGatewayUrl")
        public String internetPushGatewayUrl;

        /**
         * <p>The public URL for remote read.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;<a href="http://cn-hangzhou.arms.aliyuncs.com:9090/api/v1/prometheus/XXXXXXXXXXXXXXXXX">http://cn-hangzhou.arms.aliyuncs.com:9090/api/v1/prometheus/XXXXXXXXXXXXXXXXX</a>&quot;</p>
         */
        @NameInMap("InternetRemoteReadUrl")
        public String internetRemoteReadUrl;

        /**
         * <p>The public URL for remote write.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;<a href="http://cn-hangzhou.arms.aliyuncs.com:9090/api/v1/prometheus/XXXXXXXXXXXXXXXXX">http://cn-hangzhou.arms.aliyuncs.com:9090/api/v1/prometheus/XXXXXXXXXXXXXXXXX</a>&quot;</p>
         */
        @NameInMap("InternetRemoteWriteUrl")
        public String internetRemoteWriteUrl;

        /**
         * <p>The internal URL for Pushgateway.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;<a href="http://cn-hangzhou-intranet.arms.aliyuncs.com:9090/api/v1/prometheus/XXXXXXXXXXXXXXXXX">http://cn-hangzhou-intranet.arms.aliyuncs.com:9090/api/v1/prometheus/XXXXXXXXXXXXXXXXX</a>&quot;</p>
         */
        @NameInMap("PushGatewayUrl")
        public String pushGatewayUrl;

        /**
         * <p>The internal URL for remote read.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;<a href="http://cn-hangzhou-intranet.arms.aliyuncs.com:9090/api/v1/prometheus/XXXXXXXXXXXXXXXXX">http://cn-hangzhou-intranet.arms.aliyuncs.com:9090/api/v1/prometheus/XXXXXXXXXXXXXXXXX</a>&quot;</p>
         */
        @NameInMap("RemoteReadUrl")
        public String remoteReadUrl;

        /**
         * <p>The internal URL for remote write.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;<a href="http://cn-hangzhou-intranet.arms.aliyuncs.com:9090/api/v1/prometheus/XXXXXXXXXXXXXXXXX">http://cn-hangzhou-intranet.arms.aliyuncs.com:9090/api/v1/prometheus/XXXXXXXXXXXXXXXXX</a>&quot;</p>
         */
        @NameInMap("RemoteWriteUrl")
        public String remoteWriteUrl;

        /**
         * <p>The token value used for authentication.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;eyJhbGciOiJIUzI1NiJ9.DKEIFJSL.KYK6uOtNVxTVHXJbH5MNqlsAuUtKzNlUvmAIiKc-QXw&quot;</p>
         */
        @NameInMap("Token")
        public String token;

        public static GetCloudClusterAllUrlResponseBodyDataRemoteUrl build(java.util.Map<String, ?> map) throws Exception {
            GetCloudClusterAllUrlResponseBodyDataRemoteUrl self = new GetCloudClusterAllUrlResponseBodyDataRemoteUrl();
            return TeaModel.build(map, self);
        }

        public GetCloudClusterAllUrlResponseBodyDataRemoteUrl setAuthToken(Boolean authToken) {
            this.authToken = authToken;
            return this;
        }
        public Boolean getAuthToken() {
            return this.authToken;
        }

        public GetCloudClusterAllUrlResponseBodyDataRemoteUrl setGrafanaUrl(String grafanaUrl) {
            this.grafanaUrl = grafanaUrl;
            return this;
        }
        public String getGrafanaUrl() {
            return this.grafanaUrl;
        }

        public GetCloudClusterAllUrlResponseBodyDataRemoteUrl setInternetGrafanaUrl(String internetGrafanaUrl) {
            this.internetGrafanaUrl = internetGrafanaUrl;
            return this;
        }
        public String getInternetGrafanaUrl() {
            return this.internetGrafanaUrl;
        }

        public GetCloudClusterAllUrlResponseBodyDataRemoteUrl setInternetPushGatewayUrl(String internetPushGatewayUrl) {
            this.internetPushGatewayUrl = internetPushGatewayUrl;
            return this;
        }
        public String getInternetPushGatewayUrl() {
            return this.internetPushGatewayUrl;
        }

        public GetCloudClusterAllUrlResponseBodyDataRemoteUrl setInternetRemoteReadUrl(String internetRemoteReadUrl) {
            this.internetRemoteReadUrl = internetRemoteReadUrl;
            return this;
        }
        public String getInternetRemoteReadUrl() {
            return this.internetRemoteReadUrl;
        }

        public GetCloudClusterAllUrlResponseBodyDataRemoteUrl setInternetRemoteWriteUrl(String internetRemoteWriteUrl) {
            this.internetRemoteWriteUrl = internetRemoteWriteUrl;
            return this;
        }
        public String getInternetRemoteWriteUrl() {
            return this.internetRemoteWriteUrl;
        }

        public GetCloudClusterAllUrlResponseBodyDataRemoteUrl setPushGatewayUrl(String pushGatewayUrl) {
            this.pushGatewayUrl = pushGatewayUrl;
            return this;
        }
        public String getPushGatewayUrl() {
            return this.pushGatewayUrl;
        }

        public GetCloudClusterAllUrlResponseBodyDataRemoteUrl setRemoteReadUrl(String remoteReadUrl) {
            this.remoteReadUrl = remoteReadUrl;
            return this;
        }
        public String getRemoteReadUrl() {
            return this.remoteReadUrl;
        }

        public GetCloudClusterAllUrlResponseBodyDataRemoteUrl setRemoteWriteUrl(String remoteWriteUrl) {
            this.remoteWriteUrl = remoteWriteUrl;
            return this;
        }
        public String getRemoteWriteUrl() {
            return this.remoteWriteUrl;
        }

        public GetCloudClusterAllUrlResponseBodyDataRemoteUrl setToken(String token) {
            this.token = token;
            return this;
        }
        public String getToken() {
            return this.token;
        }

    }

    public static class GetCloudClusterAllUrlResponseBodyData extends TeaModel {
        /**
         * <p>The identifier of the cloud service.</p>
         * 
         * <strong>example:</strong>
         * <p>amp</p>
         */
        @NameInMap("ProductCode")
        public String productCode;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>The URLs for remote read and write. The value is a JSON string.</p>
         */
        @NameInMap("RemoteUrl")
        public GetCloudClusterAllUrlResponseBodyDataRemoteUrl remoteUrl;

        public static GetCloudClusterAllUrlResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetCloudClusterAllUrlResponseBodyData self = new GetCloudClusterAllUrlResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetCloudClusterAllUrlResponseBodyData setProductCode(String productCode) {
            this.productCode = productCode;
            return this;
        }
        public String getProductCode() {
            return this.productCode;
        }

        public GetCloudClusterAllUrlResponseBodyData setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public GetCloudClusterAllUrlResponseBodyData setRemoteUrl(GetCloudClusterAllUrlResponseBodyDataRemoteUrl remoteUrl) {
            this.remoteUrl = remoteUrl;
            return this;
        }
        public GetCloudClusterAllUrlResponseBodyDataRemoteUrl getRemoteUrl() {
            return this.remoteUrl;
        }

    }

}
