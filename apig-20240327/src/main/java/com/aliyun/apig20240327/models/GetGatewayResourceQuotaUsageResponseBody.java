// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class GetGatewayResourceQuotaUsageResponseBody extends TeaModel {
    /**
     * <p>The response code.</p>
     * 
     * <strong>example:</strong>
     * <p>Ok</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The quota query result.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;gatewayId&quot;:&quot;gw-d5be0s9q5z6f1234567g&quot;,&quot;observedAt&quot;:&quot;2026-09-17T08:00:00Z&quot;,&quot;items&quot;:[{&quot;quotaKey&quot;:&quot;Route&quot;,&quot;usedScope&quot;:&quot;GATEWAY&quot;,&quot;limitScope&quot;:&quot;GATEWAY&quot;,&quot;applicable&quot;:true,&quot;used&quot;:12,&quot;limit&quot;:800},{&quot;quotaKey&quot;:&quot;ConsumerAuthorizationRule&quot;,&quot;usedScope&quot;:&quot;GATEWAY&quot;,&quot;limitScope&quot;:&quot;GATEWAY&quot;,&quot;applicable&quot;:true,&quot;used&quot;:20,&quot;limit&quot;:1000},{&quot;quotaKey&quot;:&quot;McpServer&quot;,&quot;usedScope&quot;:&quot;GATEWAY&quot;,&quot;limitScope&quot;:&quot;GATEWAY&quot;,&quot;applicable&quot;:false},{&quot;quotaKey&quot;:&quot;Domain&quot;,&quot;usedScope&quot;:&quot;GATEWAY&quot;,&quot;limitScope&quot;:&quot;GATEWAY&quot;,&quot;applicable&quot;:true,&quot;used&quot;:2,&quot;limit&quot;:100},{&quot;quotaKey&quot;:&quot;Service&quot;,&quot;usedScope&quot;:&quot;GATEWAY&quot;,&quot;limitScope&quot;:&quot;GATEWAY&quot;,&quot;applicable&quot;:true,&quot;used&quot;:5,&quot;limit&quot;:800},{&quot;quotaKey&quot;:&quot;ConsumerQuotaRule&quot;,&quot;usedScope&quot;:&quot;GATEWAY&quot;,&quot;limitScope&quot;:&quot;GATEWAY&quot;,&quot;applicable&quot;:true,&quot;used&quot;:0,&quot;limit&quot;:1000},{&quot;quotaKey&quot;:&quot;K8sServiceSource&quot;,&quot;usedScope&quot;:&quot;GATEWAY&quot;,&quot;limitScope&quot;:&quot;GATEWAY&quot;,&quot;applicable&quot;:true,&quot;used&quot;:1,&quot;limit&quot;:3},{&quot;quotaKey&quot;:&quot;InstalledPlugin&quot;,&quot;usedScope&quot;:&quot;GATEWAY&quot;,&quot;limitScope&quot;:&quot;GATEWAY&quot;,&quot;applicable&quot;:true,&quot;used&quot;:2,&quot;limit&quot;:5},{&quot;quotaKey&quot;:&quot;CustomPlugin&quot;,&quot;usedScope&quot;:&quot;ACCOUNT_REGION&quot;,&quot;limitScope&quot;:&quot;ACCOUNT_GATEWAY_TYPE&quot;,&quot;applicable&quot;:false}]}</p>
     */
    @NameInMap("data")
    public GetGatewayResourceQuotaUsageResponseBodyData data;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>The specified gateway does not exist.</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>D0A6A1A0-8793-4C10-AB1A-2C03E770A912</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetGatewayResourceQuotaUsageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetGatewayResourceQuotaUsageResponseBody self = new GetGatewayResourceQuotaUsageResponseBody();
        return TeaModel.build(map, self);
    }

    public GetGatewayResourceQuotaUsageResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetGatewayResourceQuotaUsageResponseBody setData(GetGatewayResourceQuotaUsageResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetGatewayResourceQuotaUsageResponseBodyData getData() {
        return this.data;
    }

    public GetGatewayResourceQuotaUsageResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetGatewayResourceQuotaUsageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetGatewayResourceQuotaUsageResponseBodyDataItems extends TeaModel {
        /**
         * <p>Indicates whether quota numerical values are provided.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("applicable")
        public Boolean applicable;

        /**
         * <p>The effective limit.</p>
         * 
         * <strong>example:</strong>
         * <p>800</p>
         */
        @NameInMap("limit")
        public Long limit;

        /**
         * <p>The scope to which the limit applies.</p>
         * 
         * <strong>example:</strong>
         * <p>GATEWAY</p>
         */
        @NameInMap("limitScope")
        public String limitScope;

        /**
         * <p>The quota metric.</p>
         * 
         * <strong>example:</strong>
         * <p>Route</p>
         */
        @NameInMap("quotaKey")
        public String quotaKey;

        /**
         * <p>The current usage.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("used")
        public Long used;

        /**
         * <p>The scope for usage statistics.</p>
         * 
         * <strong>example:</strong>
         * <p>GATEWAY</p>
         */
        @NameInMap("usedScope")
        public String usedScope;

        public static GetGatewayResourceQuotaUsageResponseBodyDataItems build(java.util.Map<String, ?> map) throws Exception {
            GetGatewayResourceQuotaUsageResponseBodyDataItems self = new GetGatewayResourceQuotaUsageResponseBodyDataItems();
            return TeaModel.build(map, self);
        }

        public GetGatewayResourceQuotaUsageResponseBodyDataItems setApplicable(Boolean applicable) {
            this.applicable = applicable;
            return this;
        }
        public Boolean getApplicable() {
            return this.applicable;
        }

        public GetGatewayResourceQuotaUsageResponseBodyDataItems setLimit(Long limit) {
            this.limit = limit;
            return this;
        }
        public Long getLimit() {
            return this.limit;
        }

        public GetGatewayResourceQuotaUsageResponseBodyDataItems setLimitScope(String limitScope) {
            this.limitScope = limitScope;
            return this;
        }
        public String getLimitScope() {
            return this.limitScope;
        }

        public GetGatewayResourceQuotaUsageResponseBodyDataItems setQuotaKey(String quotaKey) {
            this.quotaKey = quotaKey;
            return this;
        }
        public String getQuotaKey() {
            return this.quotaKey;
        }

        public GetGatewayResourceQuotaUsageResponseBodyDataItems setUsed(Long used) {
            this.used = used;
            return this;
        }
        public Long getUsed() {
            return this.used;
        }

        public GetGatewayResourceQuotaUsageResponseBodyDataItems setUsedScope(String usedScope) {
            this.usedScope = usedScope;
            return this;
        }
        public String getUsedScope() {
            return this.usedScope;
        }

    }

    public static class GetGatewayResourceQuotaUsageResponseBodyData extends TeaModel {
        /**
         * <p>The gateway ID.</p>
         * 
         * <strong>example:</strong>
         * <p>gw-d5be0s9q5z6f1234567g</p>
         */
        @NameInMap("gatewayId")
        public String gatewayId;

        /**
         * <p>The resource quota items.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;quotaKey&quot;:&quot;Route&quot;,&quot;usedScope&quot;:&quot;GATEWAY&quot;,&quot;limitScope&quot;:&quot;GATEWAY&quot;,&quot;applicable&quot;:true,&quot;used&quot;:12,&quot;limit&quot;:800},{&quot;quotaKey&quot;:&quot;ConsumerAuthorizationRule&quot;,&quot;usedScope&quot;:&quot;GATEWAY&quot;,&quot;limitScope&quot;:&quot;GATEWAY&quot;,&quot;applicable&quot;:true,&quot;used&quot;:20,&quot;limit&quot;:1000},{&quot;quotaKey&quot;:&quot;McpServer&quot;,&quot;usedScope&quot;:&quot;GATEWAY&quot;,&quot;limitScope&quot;:&quot;GATEWAY&quot;,&quot;applicable&quot;:false},{&quot;quotaKey&quot;:&quot;Domain&quot;,&quot;usedScope&quot;:&quot;GATEWAY&quot;,&quot;limitScope&quot;:&quot;GATEWAY&quot;,&quot;applicable&quot;:true,&quot;used&quot;:2,&quot;limit&quot;:100},{&quot;quotaKey&quot;:&quot;Service&quot;,&quot;usedScope&quot;:&quot;GATEWAY&quot;,&quot;limitScope&quot;:&quot;GATEWAY&quot;,&quot;applicable&quot;:true,&quot;used&quot;:5,&quot;limit&quot;:800},{&quot;quotaKey&quot;:&quot;ConsumerQuotaRule&quot;,&quot;usedScope&quot;:&quot;GATEWAY&quot;,&quot;limitScope&quot;:&quot;GATEWAY&quot;,&quot;applicable&quot;:true,&quot;used&quot;:0,&quot;limit&quot;:1000},{&quot;quotaKey&quot;:&quot;K8sServiceSource&quot;,&quot;usedScope&quot;:&quot;GATEWAY&quot;,&quot;limitScope&quot;:&quot;GATEWAY&quot;,&quot;applicable&quot;:true,&quot;used&quot;:1,&quot;limit&quot;:3},{&quot;quotaKey&quot;:&quot;InstalledPlugin&quot;,&quot;usedScope&quot;:&quot;GATEWAY&quot;,&quot;limitScope&quot;:&quot;GATEWAY&quot;,&quot;applicable&quot;:true,&quot;used&quot;:2,&quot;limit&quot;:5},{&quot;quotaKey&quot;:&quot;CustomPlugin&quot;,&quot;usedScope&quot;:&quot;ACCOUNT_REGION&quot;,&quot;limitScope&quot;:&quot;ACCOUNT_GATEWAY_TYPE&quot;,&quot;applicable&quot;:false}]</p>
         */
        @NameInMap("items")
        public java.util.List<GetGatewayResourceQuotaUsageResponseBodyDataItems> items;

        /**
         * <p>The time when the statistics collection was completed.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-09-17T08:00:00Z</p>
         */
        @NameInMap("observedAt")
        public String observedAt;

        public static GetGatewayResourceQuotaUsageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetGatewayResourceQuotaUsageResponseBodyData self = new GetGatewayResourceQuotaUsageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetGatewayResourceQuotaUsageResponseBodyData setGatewayId(String gatewayId) {
            this.gatewayId = gatewayId;
            return this;
        }
        public String getGatewayId() {
            return this.gatewayId;
        }

        public GetGatewayResourceQuotaUsageResponseBodyData setItems(java.util.List<GetGatewayResourceQuotaUsageResponseBodyDataItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<GetGatewayResourceQuotaUsageResponseBodyDataItems> getItems() {
            return this.items;
        }

        public GetGatewayResourceQuotaUsageResponseBodyData setObservedAt(String observedAt) {
            this.observedAt = observedAt;
            return this;
        }
        public String getObservedAt() {
            return this.observedAt;
        }

    }

}
