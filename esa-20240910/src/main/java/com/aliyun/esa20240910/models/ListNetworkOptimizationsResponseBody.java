// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListNetworkOptimizationsResponseBody extends TeaModel {
    @NameInMap("Configs")
    public java.util.List<ListNetworkOptimizationsResponseBodyConfigs> configs;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>EEEBE525-F576-1196-8DAF-2D70CA3F4D2F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("TotalPage")
    public Integer totalPage;

    public static ListNetworkOptimizationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListNetworkOptimizationsResponseBody self = new ListNetworkOptimizationsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListNetworkOptimizationsResponseBody setConfigs(java.util.List<ListNetworkOptimizationsResponseBodyConfigs> configs) {
        this.configs = configs;
        return this;
    }
    public java.util.List<ListNetworkOptimizationsResponseBodyConfigs> getConfigs() {
        return this.configs;
    }

    public ListNetworkOptimizationsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListNetworkOptimizationsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListNetworkOptimizationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListNetworkOptimizationsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListNetworkOptimizationsResponseBody setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Integer getTotalPage() {
        return this.totalPage;
    }

    public static class ListNetworkOptimizationsResponseBodyConfigs extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>395386449776640</p>
         */
        @NameInMap("ConfigId")
        public Long configId;

        /**
         * <strong>example:</strong>
         * <p>global</p>
         */
        @NameInMap("ConfigType")
        public String configType;

        /**
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("Grpc")
        public String grpc;

        /**
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("Http2Origin")
        public String http2Origin;

        /**
         * <strong>example:</strong>
         * <p>(http.host eq \&quot;video.example.com\&quot;)</p>
         */
        @NameInMap("Rule")
        public String rule;

        /**
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("RuleEnable")
        public String ruleEnable;

        /**
         * <strong>example:</strong>
         * <p>rule_example</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Sequence")
        public Integer sequence;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SiteVersion")
        public Integer siteVersion;

        /**
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("SmartRouting")
        public String smartRouting;

        /**
         * <strong>example:</strong>
         * <p>500</p>
         */
        @NameInMap("UploadMaxFilesize")
        public String uploadMaxFilesize;

        /**
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("Websocket")
        public String websocket;

        public static ListNetworkOptimizationsResponseBodyConfigs build(java.util.Map<String, ?> map) throws Exception {
            ListNetworkOptimizationsResponseBodyConfigs self = new ListNetworkOptimizationsResponseBodyConfigs();
            return TeaModel.build(map, self);
        }

        public ListNetworkOptimizationsResponseBodyConfigs setConfigId(Long configId) {
            this.configId = configId;
            return this;
        }
        public Long getConfigId() {
            return this.configId;
        }

        public ListNetworkOptimizationsResponseBodyConfigs setConfigType(String configType) {
            this.configType = configType;
            return this;
        }
        public String getConfigType() {
            return this.configType;
        }

        public ListNetworkOptimizationsResponseBodyConfigs setGrpc(String grpc) {
            this.grpc = grpc;
            return this;
        }
        public String getGrpc() {
            return this.grpc;
        }

        public ListNetworkOptimizationsResponseBodyConfigs setHttp2Origin(String http2Origin) {
            this.http2Origin = http2Origin;
            return this;
        }
        public String getHttp2Origin() {
            return this.http2Origin;
        }

        public ListNetworkOptimizationsResponseBodyConfigs setRule(String rule) {
            this.rule = rule;
            return this;
        }
        public String getRule() {
            return this.rule;
        }

        public ListNetworkOptimizationsResponseBodyConfigs setRuleEnable(String ruleEnable) {
            this.ruleEnable = ruleEnable;
            return this;
        }
        public String getRuleEnable() {
            return this.ruleEnable;
        }

        public ListNetworkOptimizationsResponseBodyConfigs setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public ListNetworkOptimizationsResponseBodyConfigs setSequence(Integer sequence) {
            this.sequence = sequence;
            return this;
        }
        public Integer getSequence() {
            return this.sequence;
        }

        public ListNetworkOptimizationsResponseBodyConfigs setSiteVersion(Integer siteVersion) {
            this.siteVersion = siteVersion;
            return this;
        }
        public Integer getSiteVersion() {
            return this.siteVersion;
        }

        public ListNetworkOptimizationsResponseBodyConfigs setSmartRouting(String smartRouting) {
            this.smartRouting = smartRouting;
            return this;
        }
        public String getSmartRouting() {
            return this.smartRouting;
        }

        public ListNetworkOptimizationsResponseBodyConfigs setUploadMaxFilesize(String uploadMaxFilesize) {
            this.uploadMaxFilesize = uploadMaxFilesize;
            return this;
        }
        public String getUploadMaxFilesize() {
            return this.uploadMaxFilesize;
        }

        public ListNetworkOptimizationsResponseBodyConfigs setWebsocket(String websocket) {
            this.websocket = websocket;
            return this;
        }
        public String getWebsocket() {
            return this.websocket;
        }

    }

}
