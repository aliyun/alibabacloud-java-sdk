// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetCloudClusterAllUrlResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<GetCloudClusterAllUrlResponseBodyData> data;

    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetCloudClusterAllUrlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCloudClusterAllUrlResponseBody self = new GetCloudClusterAllUrlResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCloudClusterAllUrlResponseBody setData(java.util.List<GetCloudClusterAllUrlResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetCloudClusterAllUrlResponseBodyData> getData() {
        return this.data;
    }

    public GetCloudClusterAllUrlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetCloudClusterAllUrlResponseBodyDataRemoteUrl extends TeaModel {
        @NameInMap("AuthToken")
        public Boolean authToken;

        @NameInMap("GrafanaUrl")
        public String grafanaUrl;

        @NameInMap("InternetGrafanaUrl")
        public String internetGrafanaUrl;

        @NameInMap("InternetPushGatewayUrl")
        public String internetPushGatewayUrl;

        @NameInMap("InternetRemoteReadUrl")
        public String internetRemoteReadUrl;

        @NameInMap("InternetRemoteWriteUrl")
        public String internetRemoteWriteUrl;

        @NameInMap("PushGatewayUrl")
        public String pushGatewayUrl;

        @NameInMap("RemoteReadUrl")
        public String remoteReadUrl;

        @NameInMap("RemoteWriteUrl")
        public String remoteWriteUrl;

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
        @NameInMap("ProductCode")
        public String productCode;

        @NameInMap("Region")
        public String region;

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
