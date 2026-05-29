// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class GetRuntimeChannelResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<GetRuntimeChannelResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>6</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static GetRuntimeChannelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRuntimeChannelResponseBody self = new GetRuntimeChannelResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRuntimeChannelResponseBody setData(java.util.List<GetRuntimeChannelResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetRuntimeChannelResponseBodyData> getData() {
        return this.data;
    }

    public GetRuntimeChannelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetRuntimeChannelResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class GetRuntimeChannelResponseBodyData extends TeaModel {
        @NameInMap("AvatarUrl")
        public String avatarUrl;

        @NameInMap("ChannelType")
        public String channelType;

        /**
         * <strong>example:</strong>
         * <p>dingtalk-connector</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <strong>example:</strong>
         * <p>{
         *     &quot;appKey&quot;: &quot;abc&quot;,
         *     &quot;appSecret&quot;: &quot;efg&quot;
         * }</p>
         */
        @NameInMap("Config")
        public String config;

        @NameInMap("ConfigMode")
        public String configMode;

        @NameInMap("QrCodeNotifyUrl")
        public String qrCodeNotifyUrl;

        @NameInMap("QrCodeStatus")
        public String qrCodeStatus;

        /**
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("RiskType")
        public String riskType;

        /**
         * <strong>example:</strong>
         * <p>Configured</p>
         */
        @NameInMap("Status")
        public String status;

        public static GetRuntimeChannelResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetRuntimeChannelResponseBodyData self = new GetRuntimeChannelResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetRuntimeChannelResponseBodyData setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
            return this;
        }
        public String getAvatarUrl() {
            return this.avatarUrl;
        }

        public GetRuntimeChannelResponseBodyData setChannelType(String channelType) {
            this.channelType = channelType;
            return this;
        }
        public String getChannelType() {
            return this.channelType;
        }

        public GetRuntimeChannelResponseBodyData setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public GetRuntimeChannelResponseBodyData setConfig(String config) {
            this.config = config;
            return this;
        }
        public String getConfig() {
            return this.config;
        }

        public GetRuntimeChannelResponseBodyData setConfigMode(String configMode) {
            this.configMode = configMode;
            return this;
        }
        public String getConfigMode() {
            return this.configMode;
        }

        public GetRuntimeChannelResponseBodyData setQrCodeNotifyUrl(String qrCodeNotifyUrl) {
            this.qrCodeNotifyUrl = qrCodeNotifyUrl;
            return this;
        }
        public String getQrCodeNotifyUrl() {
            return this.qrCodeNotifyUrl;
        }

        public GetRuntimeChannelResponseBodyData setQrCodeStatus(String qrCodeStatus) {
            this.qrCodeStatus = qrCodeStatus;
            return this;
        }
        public String getQrCodeStatus() {
            return this.qrCodeStatus;
        }

        public GetRuntimeChannelResponseBodyData setRiskType(String riskType) {
            this.riskType = riskType;
            return this;
        }
        public String getRiskType() {
            return this.riskType;
        }

        public GetRuntimeChannelResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
