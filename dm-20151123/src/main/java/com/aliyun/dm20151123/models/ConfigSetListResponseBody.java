// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class ConfigSetListResponseBody extends TeaModel {
    /**
     * <p>The list of configuration sets.</p>
     */
    @NameInMap("ConfigSets")
    public java.util.List<ConfigSetListResponseBodyConfigSets> configSets;

    /**
     * <p>The current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>Indicates whether a next page of results exists.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("HasMore")
    public Boolean hasMore;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries that match the request.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("TotalCounts")
    public Integer totalCounts;

    public static ConfigSetListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ConfigSetListResponseBody self = new ConfigSetListResponseBody();
        return TeaModel.build(map, self);
    }

    public ConfigSetListResponseBody setConfigSets(java.util.List<ConfigSetListResponseBodyConfigSets> configSets) {
        this.configSets = configSets;
        return this;
    }
    public java.util.List<ConfigSetListResponseBodyConfigSets> getConfigSets() {
        return this.configSets;
    }

    public ConfigSetListResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ConfigSetListResponseBody setHasMore(Boolean hasMore) {
        this.hasMore = hasMore;
        return this;
    }
    public Boolean getHasMore() {
        return this.hasMore;
    }

    public ConfigSetListResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ConfigSetListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ConfigSetListResponseBody setTotalCounts(Integer totalCounts) {
        this.totalCounts = totalCounts;
        return this;
    }
    public Integer getTotalCounts() {
        return this.totalCounts;
    }

    public static class ConfigSetListResponseBodyConfigSetsIpPool extends TeaModel {
        /**
         * <p>The ID of the associated IP pool.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("IpPoolId")
        public String ipPoolId;

        /**
         * <p>The name of the associated IP pool.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("IpPoolName")
        public String ipPoolName;

        public static ConfigSetListResponseBodyConfigSetsIpPool build(java.util.Map<String, ?> map) throws Exception {
            ConfigSetListResponseBodyConfigSetsIpPool self = new ConfigSetListResponseBodyConfigSetsIpPool();
            return TeaModel.build(map, self);
        }

        public ConfigSetListResponseBodyConfigSetsIpPool setIpPoolId(String ipPoolId) {
            this.ipPoolId = ipPoolId;
            return this;
        }
        public String getIpPoolId() {
            return this.ipPoolId;
        }

        public ConfigSetListResponseBodyConfigSetsIpPool setIpPoolName(String ipPoolName) {
            this.ipPoolName = ipPoolName;
            return this;
        }
        public String getIpPoolName() {
            return this.ipPoolName;
        }

    }

    public static class ConfigSetListResponseBodyConfigSets extends TeaModel {
        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The list of associated sender addresses.</p>
         */
        @NameInMap("FromAddresses")
        public java.util.List<String> fromAddresses;

        /**
         * <p>The ID of the configuration set.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The IP pool information.</p>
         */
        @NameInMap("IpPool")
        public ConfigSetListResponseBodyConfigSetsIpPool ipPool;

        /**
         * <p>The name of the configuration set.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("Name")
        public String name;

        public static ConfigSetListResponseBodyConfigSets build(java.util.Map<String, ?> map) throws Exception {
            ConfigSetListResponseBodyConfigSets self = new ConfigSetListResponseBodyConfigSets();
            return TeaModel.build(map, self);
        }

        public ConfigSetListResponseBodyConfigSets setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ConfigSetListResponseBodyConfigSets setFromAddresses(java.util.List<String> fromAddresses) {
            this.fromAddresses = fromAddresses;
            return this;
        }
        public java.util.List<String> getFromAddresses() {
            return this.fromAddresses;
        }

        public ConfigSetListResponseBodyConfigSets setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ConfigSetListResponseBodyConfigSets setIpPool(ConfigSetListResponseBodyConfigSetsIpPool ipPool) {
            this.ipPool = ipPool;
            return this;
        }
        public ConfigSetListResponseBodyConfigSetsIpPool getIpPool() {
            return this.ipPool;
        }

        public ConfigSetListResponseBodyConfigSets setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
