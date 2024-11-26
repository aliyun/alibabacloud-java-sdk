// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class GetEnvironmentResponseBody extends TeaModel {
    /**
     * <p>Response code.</p>
     * 
     * <strong>example:</strong>
     * <p>Ok</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>Response data.</p>
     */
    @NameInMap("data")
    public GetEnvironmentResponseBodyData data;

    /**
     * <p>Response message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>Request ID, used for tracing the API call chain.</p>
     * 
     * <strong>example:</strong>
     * <p>3F8EE674-BB08-5E92-BE6F-E4756A748B0F</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetEnvironmentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetEnvironmentResponseBody self = new GetEnvironmentResponseBody();
        return TeaModel.build(map, self);
    }

    public GetEnvironmentResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetEnvironmentResponseBody setData(GetEnvironmentResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetEnvironmentResponseBodyData getData() {
        return this.data;
    }

    public GetEnvironmentResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetEnvironmentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetEnvironmentResponseBodyDataStatisticsInfo extends TeaModel {
        @NameInMap("resourceStatistics")
        public java.util.List<ResourceStatistic> resourceStatistics;

        @NameInMap("totalCount")
        public Integer totalCount;

        public static GetEnvironmentResponseBodyDataStatisticsInfo build(java.util.Map<String, ?> map) throws Exception {
            GetEnvironmentResponseBodyDataStatisticsInfo self = new GetEnvironmentResponseBodyDataStatisticsInfo();
            return TeaModel.build(map, self);
        }

        public GetEnvironmentResponseBodyDataStatisticsInfo setResourceStatistics(java.util.List<ResourceStatistic> resourceStatistics) {
            this.resourceStatistics = resourceStatistics;
            return this;
        }
        public java.util.List<ResourceStatistic> getResourceStatistics() {
            return this.resourceStatistics;
        }

        public GetEnvironmentResponseBodyDataStatisticsInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

    public static class GetEnvironmentResponseBodyData extends TeaModel {
        /**
         * <p>Environment alias.</p>
         * 
         * <strong>example:</strong>
         * <p>测试环境</p>
         */
        @NameInMap("alias")
        public String alias;

        /**
         * <p>Creation timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1719386834548</p>
         */
        @NameInMap("createTimestamp")
        public Long createTimestamp;

        /**
         * <p>Whether it is the default environment.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("default")
        public Boolean _default;

        /**
         * <p>Environment description.</p>
         * 
         * <strong>example:</strong>
         * <p>这是xxx的xx项目测试环境</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>Environment ID.</p>
         * 
         * <strong>example:</strong>
         * <p>env-cq7l5s5lhtgi6qasrdc0</p>
         */
        @NameInMap("environmentId")
        public String environmentId;

        /**
         * <p>Gateway information</p>
         */
        @NameInMap("gatewayInfo")
        public GatewayInfo gatewayInfo;

        /**
         * <p>Environment name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("name")
        public String name;

        @NameInMap("resourceGroupId")
        public String resourceGroupId;

        @NameInMap("statisticsInfo")
        public GetEnvironmentResponseBodyDataStatisticsInfo statisticsInfo;

        /**
         * <p>List of subdomains.</p>
         */
        @NameInMap("subDomainInfos")
        public java.util.List<SubDomainInfo> subDomainInfos;

        /**
         * <p>Update timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1719386834548</p>
         */
        @NameInMap("updateTimestamp")
        public Long updateTimestamp;

        public static GetEnvironmentResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetEnvironmentResponseBodyData self = new GetEnvironmentResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetEnvironmentResponseBodyData setAlias(String alias) {
            this.alias = alias;
            return this;
        }
        public String getAlias() {
            return this.alias;
        }

        public GetEnvironmentResponseBodyData setCreateTimestamp(Long createTimestamp) {
            this.createTimestamp = createTimestamp;
            return this;
        }
        public Long getCreateTimestamp() {
            return this.createTimestamp;
        }

        public GetEnvironmentResponseBodyData set_default(Boolean _default) {
            this._default = _default;
            return this;
        }
        public Boolean get_default() {
            return this._default;
        }

        public GetEnvironmentResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetEnvironmentResponseBodyData setEnvironmentId(String environmentId) {
            this.environmentId = environmentId;
            return this;
        }
        public String getEnvironmentId() {
            return this.environmentId;
        }

        public GetEnvironmentResponseBodyData setGatewayInfo(GatewayInfo gatewayInfo) {
            this.gatewayInfo = gatewayInfo;
            return this;
        }
        public GatewayInfo getGatewayInfo() {
            return this.gatewayInfo;
        }

        public GetEnvironmentResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetEnvironmentResponseBodyData setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public GetEnvironmentResponseBodyData setStatisticsInfo(GetEnvironmentResponseBodyDataStatisticsInfo statisticsInfo) {
            this.statisticsInfo = statisticsInfo;
            return this;
        }
        public GetEnvironmentResponseBodyDataStatisticsInfo getStatisticsInfo() {
            return this.statisticsInfo;
        }

        public GetEnvironmentResponseBodyData setSubDomainInfos(java.util.List<SubDomainInfo> subDomainInfos) {
            this.subDomainInfos = subDomainInfos;
            return this;
        }
        public java.util.List<SubDomainInfo> getSubDomainInfos() {
            return this.subDomainInfos;
        }

        public GetEnvironmentResponseBodyData setUpdateTimestamp(Long updateTimestamp) {
            this.updateTimestamp = updateTimestamp;
            return this;
        }
        public Long getUpdateTimestamp() {
            return this.updateTimestamp;
        }

    }

}
