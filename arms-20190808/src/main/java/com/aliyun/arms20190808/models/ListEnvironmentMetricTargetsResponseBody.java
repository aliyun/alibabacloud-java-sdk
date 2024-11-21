// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ListEnvironmentMetricTargetsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public ListEnvironmentMetricTargetsResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>16AF921B-8187-489F-9913-43C808B4****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListEnvironmentMetricTargetsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListEnvironmentMetricTargetsResponseBody self = new ListEnvironmentMetricTargetsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListEnvironmentMetricTargetsResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListEnvironmentMetricTargetsResponseBody setData(ListEnvironmentMetricTargetsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListEnvironmentMetricTargetsResponseBodyData getData() {
        return this.data;
    }

    public ListEnvironmentMetricTargetsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListEnvironmentMetricTargetsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListEnvironmentMetricTargetsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListEnvironmentMetricTargetsResponseBodyDataActiveTargets extends TeaModel {
        @NameInMap("DiscoveredLabels")
        public java.util.Map<String, String> discoveredLabels;

        /**
         * <strong>example:</strong>
         * <p><a href="http://xxx">http://xxx</a></p>
         */
        @NameInMap("GlobalUrl")
        public String globalUrl;

        /**
         * <strong>example:</strong>
         * <p>up</p>
         */
        @NameInMap("Health")
        public String health;

        @NameInMap("Labels")
        public java.util.Map<String, String> labels;

        /**
         * <strong>example:</strong>
         * <p>Get \&quot;<a href="http://172.16.0.86:9104/metrics%5C%5C">http://172.16.0.86:9104/metrics\\</a>&quot;: dial tcp 172.16.0.86:9104: connect: connection refused</p>
         */
        @NameInMap("LastError")
        public String lastError;

        /**
         * <strong>example:</strong>
         * <p>2023-10-12T07:15:47.306691514Z</p>
         */
        @NameInMap("LastScrape")
        public String lastScrape;

        /**
         * <strong>example:</strong>
         * <p>0.00127593</p>
         */
        @NameInMap("LastScrapeDuration")
        public Double lastScrapeDuration;

        /**
         * <strong>example:</strong>
         * <p>122</p>
         */
        @NameInMap("LastScrapeSeries")
        public Long lastScrapeSeries;

        /**
         * <strong>example:</strong>
         * <p>arms-prom/mysql-exporter-mysql-1694429267986-sm/0&quot;</p>
         */
        @NameInMap("ScrapePool")
        public String scrapePool;

        /**
         * <strong>example:</strong>
         * <p><a href="http://xxxx">http://xxxx</a></p>
         */
        @NameInMap("ScrapeUrl")
        public String scrapeUrl;

        public static ListEnvironmentMetricTargetsResponseBodyDataActiveTargets build(java.util.Map<String, ?> map) throws Exception {
            ListEnvironmentMetricTargetsResponseBodyDataActiveTargets self = new ListEnvironmentMetricTargetsResponseBodyDataActiveTargets();
            return TeaModel.build(map, self);
        }

        public ListEnvironmentMetricTargetsResponseBodyDataActiveTargets setDiscoveredLabels(java.util.Map<String, String> discoveredLabels) {
            this.discoveredLabels = discoveredLabels;
            return this;
        }
        public java.util.Map<String, String> getDiscoveredLabels() {
            return this.discoveredLabels;
        }

        public ListEnvironmentMetricTargetsResponseBodyDataActiveTargets setGlobalUrl(String globalUrl) {
            this.globalUrl = globalUrl;
            return this;
        }
        public String getGlobalUrl() {
            return this.globalUrl;
        }

        public ListEnvironmentMetricTargetsResponseBodyDataActiveTargets setHealth(String health) {
            this.health = health;
            return this;
        }
        public String getHealth() {
            return this.health;
        }

        public ListEnvironmentMetricTargetsResponseBodyDataActiveTargets setLabels(java.util.Map<String, String> labels) {
            this.labels = labels;
            return this;
        }
        public java.util.Map<String, String> getLabels() {
            return this.labels;
        }

        public ListEnvironmentMetricTargetsResponseBodyDataActiveTargets setLastError(String lastError) {
            this.lastError = lastError;
            return this;
        }
        public String getLastError() {
            return this.lastError;
        }

        public ListEnvironmentMetricTargetsResponseBodyDataActiveTargets setLastScrape(String lastScrape) {
            this.lastScrape = lastScrape;
            return this;
        }
        public String getLastScrape() {
            return this.lastScrape;
        }

        public ListEnvironmentMetricTargetsResponseBodyDataActiveTargets setLastScrapeDuration(Double lastScrapeDuration) {
            this.lastScrapeDuration = lastScrapeDuration;
            return this;
        }
        public Double getLastScrapeDuration() {
            return this.lastScrapeDuration;
        }

        public ListEnvironmentMetricTargetsResponseBodyDataActiveTargets setLastScrapeSeries(Long lastScrapeSeries) {
            this.lastScrapeSeries = lastScrapeSeries;
            return this;
        }
        public Long getLastScrapeSeries() {
            return this.lastScrapeSeries;
        }

        public ListEnvironmentMetricTargetsResponseBodyDataActiveTargets setScrapePool(String scrapePool) {
            this.scrapePool = scrapePool;
            return this;
        }
        public String getScrapePool() {
            return this.scrapePool;
        }

        public ListEnvironmentMetricTargetsResponseBodyDataActiveTargets setScrapeUrl(String scrapeUrl) {
            this.scrapeUrl = scrapeUrl;
            return this;
        }
        public String getScrapeUrl() {
            return this.scrapeUrl;
        }

    }

    public static class ListEnvironmentMetricTargetsResponseBodyDataDroppedTargets extends TeaModel {
        @NameInMap("DiscoveredLabels")
        public java.util.Map<String, String> discoveredLabels;

        /**
         * <strong>example:</strong>
         * <p><a href="http://xxx">http://xxx</a></p>
         */
        @NameInMap("GlobalUrl")
        public String globalUrl;

        /**
         * <strong>example:</strong>
         * <p>up</p>
         */
        @NameInMap("Health")
        public String health;

        @NameInMap("Labels")
        public java.util.Map<String, String> labels;

        /**
         * <strong>example:</strong>
         * <p>Get \&quot;<a href="http://172.16.0.86:9104/metrics%5C%5C">http://172.16.0.86:9104/metrics\\</a>&quot;: dial tcp 172.16.0.86:9104: connect: connection refused</p>
         */
        @NameInMap("LastError")
        public String lastError;

        /**
         * <strong>example:</strong>
         * <p>2023-10-12T07:15:47.306691514Z</p>
         */
        @NameInMap("LastScrape")
        public String lastScrape;

        /**
         * <strong>example:</strong>
         * <p>0.00127593</p>
         */
        @NameInMap("LastScrapeDuration")
        public Double lastScrapeDuration;

        /**
         * <strong>example:</strong>
         * <p>122</p>
         */
        @NameInMap("LastScrapeSeries")
        public Long lastScrapeSeries;

        /**
         * <strong>example:</strong>
         * <p>arms-prom/mysql-exporter-mysql-1694429267986-sm/0&quot;</p>
         */
        @NameInMap("ScrapePool")
        public String scrapePool;

        /**
         * <strong>example:</strong>
         * <p><a href="http://xxxx">http://xxxx</a></p>
         */
        @NameInMap("ScrapeUrl")
        public String scrapeUrl;

        public static ListEnvironmentMetricTargetsResponseBodyDataDroppedTargets build(java.util.Map<String, ?> map) throws Exception {
            ListEnvironmentMetricTargetsResponseBodyDataDroppedTargets self = new ListEnvironmentMetricTargetsResponseBodyDataDroppedTargets();
            return TeaModel.build(map, self);
        }

        public ListEnvironmentMetricTargetsResponseBodyDataDroppedTargets setDiscoveredLabels(java.util.Map<String, String> discoveredLabels) {
            this.discoveredLabels = discoveredLabels;
            return this;
        }
        public java.util.Map<String, String> getDiscoveredLabels() {
            return this.discoveredLabels;
        }

        public ListEnvironmentMetricTargetsResponseBodyDataDroppedTargets setGlobalUrl(String globalUrl) {
            this.globalUrl = globalUrl;
            return this;
        }
        public String getGlobalUrl() {
            return this.globalUrl;
        }

        public ListEnvironmentMetricTargetsResponseBodyDataDroppedTargets setHealth(String health) {
            this.health = health;
            return this;
        }
        public String getHealth() {
            return this.health;
        }

        public ListEnvironmentMetricTargetsResponseBodyDataDroppedTargets setLabels(java.util.Map<String, String> labels) {
            this.labels = labels;
            return this;
        }
        public java.util.Map<String, String> getLabels() {
            return this.labels;
        }

        public ListEnvironmentMetricTargetsResponseBodyDataDroppedTargets setLastError(String lastError) {
            this.lastError = lastError;
            return this;
        }
        public String getLastError() {
            return this.lastError;
        }

        public ListEnvironmentMetricTargetsResponseBodyDataDroppedTargets setLastScrape(String lastScrape) {
            this.lastScrape = lastScrape;
            return this;
        }
        public String getLastScrape() {
            return this.lastScrape;
        }

        public ListEnvironmentMetricTargetsResponseBodyDataDroppedTargets setLastScrapeDuration(Double lastScrapeDuration) {
            this.lastScrapeDuration = lastScrapeDuration;
            return this;
        }
        public Double getLastScrapeDuration() {
            return this.lastScrapeDuration;
        }

        public ListEnvironmentMetricTargetsResponseBodyDataDroppedTargets setLastScrapeSeries(Long lastScrapeSeries) {
            this.lastScrapeSeries = lastScrapeSeries;
            return this;
        }
        public Long getLastScrapeSeries() {
            return this.lastScrapeSeries;
        }

        public ListEnvironmentMetricTargetsResponseBodyDataDroppedTargets setScrapePool(String scrapePool) {
            this.scrapePool = scrapePool;
            return this;
        }
        public String getScrapePool() {
            return this.scrapePool;
        }

        public ListEnvironmentMetricTargetsResponseBodyDataDroppedTargets setScrapeUrl(String scrapeUrl) {
            this.scrapeUrl = scrapeUrl;
            return this;
        }
        public String getScrapeUrl() {
            return this.scrapeUrl;
        }

    }

    public static class ListEnvironmentMetricTargetsResponseBodyData extends TeaModel {
        @NameInMap("ActiveTargets")
        public java.util.List<ListEnvironmentMetricTargetsResponseBodyDataActiveTargets> activeTargets;

        @NameInMap("DroppedTargets")
        public java.util.List<ListEnvironmentMetricTargetsResponseBodyDataDroppedTargets> droppedTargets;

        public static ListEnvironmentMetricTargetsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListEnvironmentMetricTargetsResponseBodyData self = new ListEnvironmentMetricTargetsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListEnvironmentMetricTargetsResponseBodyData setActiveTargets(java.util.List<ListEnvironmentMetricTargetsResponseBodyDataActiveTargets> activeTargets) {
            this.activeTargets = activeTargets;
            return this;
        }
        public java.util.List<ListEnvironmentMetricTargetsResponseBodyDataActiveTargets> getActiveTargets() {
            return this.activeTargets;
        }

        public ListEnvironmentMetricTargetsResponseBodyData setDroppedTargets(java.util.List<ListEnvironmentMetricTargetsResponseBodyDataDroppedTargets> droppedTargets) {
            this.droppedTargets = droppedTargets;
            return this;
        }
        public java.util.List<ListEnvironmentMetricTargetsResponseBodyDataDroppedTargets> getDroppedTargets() {
            return this.droppedTargets;
        }

    }

}
