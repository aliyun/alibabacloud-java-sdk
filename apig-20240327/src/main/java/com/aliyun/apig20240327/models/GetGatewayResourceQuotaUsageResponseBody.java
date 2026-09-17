// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class GetGatewayResourceQuotaUsageResponseBody extends TeaModel {
    /**
     * <p>业务响应码。成功时为 Ok；失败时为具体错误码，应结合 HTTP 状态码处理。</p>
     * 
     * <strong>example:</strong>
     * <p>Ok</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>目标网关及其九项资源配额观测结果。示例数值只说明格式，实际有效上限以本次响应为准。</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;gatewayId&quot;:&quot;gw-d5be0s9q5z6f1234567g&quot;,&quot;observedAt&quot;:&quot;2026-09-17T08:00:00Z&quot;,&quot;items&quot;:[{&quot;quotaKey&quot;:&quot;Route&quot;,&quot;usedScope&quot;:&quot;GATEWAY&quot;,&quot;limitScope&quot;:&quot;GATEWAY&quot;,&quot;applicable&quot;:true,&quot;used&quot;:12,&quot;limit&quot;:800},{&quot;quotaKey&quot;:&quot;ConsumerAuthorizationRule&quot;,&quot;usedScope&quot;:&quot;GATEWAY&quot;,&quot;limitScope&quot;:&quot;GATEWAY&quot;,&quot;applicable&quot;:true,&quot;used&quot;:20,&quot;limit&quot;:1000},{&quot;quotaKey&quot;:&quot;McpServer&quot;,&quot;usedScope&quot;:&quot;GATEWAY&quot;,&quot;limitScope&quot;:&quot;GATEWAY&quot;,&quot;applicable&quot;:false},{&quot;quotaKey&quot;:&quot;Domain&quot;,&quot;usedScope&quot;:&quot;GATEWAY&quot;,&quot;limitScope&quot;:&quot;GATEWAY&quot;,&quot;applicable&quot;:true,&quot;used&quot;:2,&quot;limit&quot;:100},{&quot;quotaKey&quot;:&quot;Service&quot;,&quot;usedScope&quot;:&quot;GATEWAY&quot;,&quot;limitScope&quot;:&quot;GATEWAY&quot;,&quot;applicable&quot;:true,&quot;used&quot;:5,&quot;limit&quot;:800},{&quot;quotaKey&quot;:&quot;ConsumerQuotaRule&quot;,&quot;usedScope&quot;:&quot;GATEWAY&quot;,&quot;limitScope&quot;:&quot;GATEWAY&quot;,&quot;applicable&quot;:true,&quot;used&quot;:0,&quot;limit&quot;:1000},{&quot;quotaKey&quot;:&quot;K8sServiceSource&quot;,&quot;usedScope&quot;:&quot;GATEWAY&quot;,&quot;limitScope&quot;:&quot;GATEWAY&quot;,&quot;applicable&quot;:true,&quot;used&quot;:1,&quot;limit&quot;:3},{&quot;quotaKey&quot;:&quot;InstalledPlugin&quot;,&quot;usedScope&quot;:&quot;GATEWAY&quot;,&quot;limitScope&quot;:&quot;GATEWAY&quot;,&quot;applicable&quot;:true,&quot;used&quot;:2,&quot;limit&quot;:5},{&quot;quotaKey&quot;:&quot;CustomPlugin&quot;,&quot;usedScope&quot;:&quot;ACCOUNT_REGION&quot;,&quot;limitScope&quot;:&quot;ACCOUNT_GATEWAY_TYPE&quot;,&quot;applicable&quot;:false}]}</p>
     */
    @NameInMap("data")
    public GetGatewayResourceQuotaUsageResponseBodyData data;

    /**
     * <p>失败时返回的错误说明，成功响应通常省略本字段。示例为错误信息，不是成功响应。</p>
     * 
     * <strong>example:</strong>
     * <p>The specified gateway does not exist.</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>请求的唯一标识，用于排查问题。</p>
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
         * <p>true 时返回 used 和 limit；false 时省略二者。CustomPlugin 当前固定为 false，仅表示暂时隐藏配额展示，不影响插件上传、安装或既有配额校验。其他项按网关能力及有效额度判定，不能仅凭本字段推断写入操作是否允许。</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("applicable")
        public Boolean applicable;

        /**
         * <p>当前生效的非负整数配额上限，单位与 used 相同，已考虑现有配置、加白及适用的购买额度。仅 applicable=true 时返回，包括合法零值；示例不是所有网关的固定上限。</p>
         * 
         * <strong>example:</strong>
         * <p>800</p>
         */
        @NameInMap("limit")
        public Long limit;

        /**
         * <p>GATEWAY 表示当前网关；ACCOUNT_GATEWAY_TYPE 表示当前账号、地域及网关类型的范围。仅 CustomPlugin 保留 ACCOUNT_GATEWAY_TYPE 标识；该项当前不读取或返回上限。</p>
         * 
         * <strong>example:</strong>
         * <p>GATEWAY</p>
         */
        @NameInMap("limitScope")
        public String limitScope;

        /**
         * <p>指标标识：Route（路由）、ConsumerAuthorizationRule（消费者授权规则）、McpServer（MCP Server）、Domain（域名）、Service（服务）、ConsumerQuotaRule（消费者配额规则）、K8sServiceSource（K8s 服务来源）、InstalledPlugin（已安装插件）、CustomPlugin（自定义插件）。</p>
         * 
         * <strong>example:</strong>
         * <p>Route</p>
         */
        @NameInMap("quotaKey")
        public String quotaKey;

        /**
         * <p>实际占用数量，为非负整数，单位与 quotaKey 对应。仅 applicable=true 时返回；零值为真实零用量，历史超额可大于 limit，不截断。</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("used")
        public Long used;

        /**
         * <p>GATEWAY 表示当前网关；ACCOUNT_REGION 表示当前账号在当前地域的共享范围。仅 CustomPlugin 保留 ACCOUNT_REGION 标识；该项当前不读取或返回用量。</p>
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
         * <p>本次查询的目标网关唯一标识，与请求路径 gatewayId 一致。</p>
         * 
         * <strong>example:</strong>
         * <p>gw-d5be0s9q5z6f1234567g</p>
         */
        @NameInMap("gatewayId")
        public String gatewayId;

        /**
         * <p>固定返回九项，每个 quotaKey 仅出现一次。不适用或暂不展示的项仍保留，applicable=false 且省略 used/limit。不返回剩余额度或百分比；示例数值不是固定默认上限。</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;quotaKey&quot;:&quot;Route&quot;,&quot;usedScope&quot;:&quot;GATEWAY&quot;,&quot;limitScope&quot;:&quot;GATEWAY&quot;,&quot;applicable&quot;:true,&quot;used&quot;:12,&quot;limit&quot;:800},{&quot;quotaKey&quot;:&quot;ConsumerAuthorizationRule&quot;,&quot;usedScope&quot;:&quot;GATEWAY&quot;,&quot;limitScope&quot;:&quot;GATEWAY&quot;,&quot;applicable&quot;:true,&quot;used&quot;:20,&quot;limit&quot;:1000},{&quot;quotaKey&quot;:&quot;McpServer&quot;,&quot;usedScope&quot;:&quot;GATEWAY&quot;,&quot;limitScope&quot;:&quot;GATEWAY&quot;,&quot;applicable&quot;:false},{&quot;quotaKey&quot;:&quot;Domain&quot;,&quot;usedScope&quot;:&quot;GATEWAY&quot;,&quot;limitScope&quot;:&quot;GATEWAY&quot;,&quot;applicable&quot;:true,&quot;used&quot;:2,&quot;limit&quot;:100},{&quot;quotaKey&quot;:&quot;Service&quot;,&quot;usedScope&quot;:&quot;GATEWAY&quot;,&quot;limitScope&quot;:&quot;GATEWAY&quot;,&quot;applicable&quot;:true,&quot;used&quot;:5,&quot;limit&quot;:800},{&quot;quotaKey&quot;:&quot;ConsumerQuotaRule&quot;,&quot;usedScope&quot;:&quot;GATEWAY&quot;,&quot;limitScope&quot;:&quot;GATEWAY&quot;,&quot;applicable&quot;:true,&quot;used&quot;:0,&quot;limit&quot;:1000},{&quot;quotaKey&quot;:&quot;K8sServiceSource&quot;,&quot;usedScope&quot;:&quot;GATEWAY&quot;,&quot;limitScope&quot;:&quot;GATEWAY&quot;,&quot;applicable&quot;:true,&quot;used&quot;:1,&quot;limit&quot;:3},{&quot;quotaKey&quot;:&quot;InstalledPlugin&quot;,&quot;usedScope&quot;:&quot;GATEWAY&quot;,&quot;limitScope&quot;:&quot;GATEWAY&quot;,&quot;applicable&quot;:true,&quot;used&quot;:2,&quot;limit&quot;:5},{&quot;quotaKey&quot;:&quot;CustomPlugin&quot;,&quot;usedScope&quot;:&quot;ACCOUNT_REGION&quot;,&quot;limitScope&quot;:&quot;ACCOUNT_GATEWAY_TYPE&quot;,&quot;applicable&quot;:false}]</p>
         */
        @NameInMap("items")
        public java.util.List<GetGatewayResourceQuotaUsageResponseBodyDataItems> items;

        /**
         * <p>服务端完成本次统计的 UTC 时间，格式为 RFC 3339，可包含小数秒。各来源独立读取，不保证跨来源瞬时原子快照。</p>
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
