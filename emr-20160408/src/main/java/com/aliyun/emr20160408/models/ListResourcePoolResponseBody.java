// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class ListResourcePoolResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("Total")
    public Integer total;

    @NameInMap("PoolInfoList")
    public ListResourcePoolResponseBodyPoolInfoList poolInfoList;

    public static ListResourcePoolResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListResourcePoolResponseBody self = new ListResourcePoolResponseBody();
        return TeaModel.build(map, self);
    }

    public ListResourcePoolResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListResourcePoolResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListResourcePoolResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListResourcePoolResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public ListResourcePoolResponseBody setPoolInfoList(ListResourcePoolResponseBodyPoolInfoList poolInfoList) {
        this.poolInfoList = poolInfoList;
        return this;
    }
    public ListResourcePoolResponseBodyPoolInfoList getPoolInfoList() {
        return this.poolInfoList;
    }

    public static class ListResourcePoolResponseBodyPoolInfoListPoolInfoEcmResourcePoolConfigListEcmResourcePoolConfig extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("ConfigType")
        public String configType;

        @NameInMap("ConfigValue")
        public String configValue;

        @NameInMap("Note")
        public String note;

        @NameInMap("Category")
        public String category;

        @NameInMap("ConfigKey")
        public String configKey;

        @NameInMap("Id")
        public Long id;

        public static ListResourcePoolResponseBodyPoolInfoListPoolInfoEcmResourcePoolConfigListEcmResourcePoolConfig build(java.util.Map<String, ?> map) throws Exception {
            ListResourcePoolResponseBodyPoolInfoListPoolInfoEcmResourcePoolConfigListEcmResourcePoolConfig self = new ListResourcePoolResponseBodyPoolInfoListPoolInfoEcmResourcePoolConfigListEcmResourcePoolConfig();
            return TeaModel.build(map, self);
        }

        public ListResourcePoolResponseBodyPoolInfoListPoolInfoEcmResourcePoolConfigListEcmResourcePoolConfig setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListResourcePoolResponseBodyPoolInfoListPoolInfoEcmResourcePoolConfigListEcmResourcePoolConfig setConfigType(String configType) {
            this.configType = configType;
            return this;
        }
        public String getConfigType() {
            return this.configType;
        }

        public ListResourcePoolResponseBodyPoolInfoListPoolInfoEcmResourcePoolConfigListEcmResourcePoolConfig setConfigValue(String configValue) {
            this.configValue = configValue;
            return this;
        }
        public String getConfigValue() {
            return this.configValue;
        }

        public ListResourcePoolResponseBodyPoolInfoListPoolInfoEcmResourcePoolConfigListEcmResourcePoolConfig setNote(String note) {
            this.note = note;
            return this;
        }
        public String getNote() {
            return this.note;
        }

        public ListResourcePoolResponseBodyPoolInfoListPoolInfoEcmResourcePoolConfigListEcmResourcePoolConfig setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public ListResourcePoolResponseBodyPoolInfoListPoolInfoEcmResourcePoolConfigListEcmResourcePoolConfig setConfigKey(String configKey) {
            this.configKey = configKey;
            return this;
        }
        public String getConfigKey() {
            return this.configKey;
        }

        public ListResourcePoolResponseBodyPoolInfoListPoolInfoEcmResourcePoolConfigListEcmResourcePoolConfig setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

    public static class ListResourcePoolResponseBodyPoolInfoListPoolInfoEcmResourcePoolConfigList extends TeaModel {
        @NameInMap("EcmResourcePoolConfig")
        public java.util.List<ListResourcePoolResponseBodyPoolInfoListPoolInfoEcmResourcePoolConfigListEcmResourcePoolConfig> ecmResourcePoolConfig;

        public static ListResourcePoolResponseBodyPoolInfoListPoolInfoEcmResourcePoolConfigList build(java.util.Map<String, ?> map) throws Exception {
            ListResourcePoolResponseBodyPoolInfoListPoolInfoEcmResourcePoolConfigList self = new ListResourcePoolResponseBodyPoolInfoListPoolInfoEcmResourcePoolConfigList();
            return TeaModel.build(map, self);
        }

        public ListResourcePoolResponseBodyPoolInfoListPoolInfoEcmResourcePoolConfigList setEcmResourcePoolConfig(java.util.List<ListResourcePoolResponseBodyPoolInfoListPoolInfoEcmResourcePoolConfigListEcmResourcePoolConfig> ecmResourcePoolConfig) {
            this.ecmResourcePoolConfig = ecmResourcePoolConfig;
            return this;
        }
        public java.util.List<ListResourcePoolResponseBodyPoolInfoListPoolInfoEcmResourcePoolConfigListEcmResourcePoolConfig> getEcmResourcePoolConfig() {
            return this.ecmResourcePoolConfig;
        }

    }

    public static class ListResourcePoolResponseBodyPoolInfoListPoolInfoEcmResourcePool extends TeaModel {
        @NameInMap("Active")
        public Boolean active;

        @NameInMap("PoolType")
        public String poolType;

        @NameInMap("UserId")
        public String userId;

        @NameInMap("Note")
        public String note;

        @NameInMap("YarnSiteConfig")
        public String yarnSiteConfig;

        @NameInMap("Name")
        public String name;

        @NameInMap("Id")
        public Long id;

        public static ListResourcePoolResponseBodyPoolInfoListPoolInfoEcmResourcePool build(java.util.Map<String, ?> map) throws Exception {
            ListResourcePoolResponseBodyPoolInfoListPoolInfoEcmResourcePool self = new ListResourcePoolResponseBodyPoolInfoListPoolInfoEcmResourcePool();
            return TeaModel.build(map, self);
        }

        public ListResourcePoolResponseBodyPoolInfoListPoolInfoEcmResourcePool setActive(Boolean active) {
            this.active = active;
            return this;
        }
        public Boolean getActive() {
            return this.active;
        }

        public ListResourcePoolResponseBodyPoolInfoListPoolInfoEcmResourcePool setPoolType(String poolType) {
            this.poolType = poolType;
            return this;
        }
        public String getPoolType() {
            return this.poolType;
        }

        public ListResourcePoolResponseBodyPoolInfoListPoolInfoEcmResourcePool setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public ListResourcePoolResponseBodyPoolInfoListPoolInfoEcmResourcePool setNote(String note) {
            this.note = note;
            return this;
        }
        public String getNote() {
            return this.note;
        }

        public ListResourcePoolResponseBodyPoolInfoListPoolInfoEcmResourcePool setYarnSiteConfig(String yarnSiteConfig) {
            this.yarnSiteConfig = yarnSiteConfig;
            return this;
        }
        public String getYarnSiteConfig() {
            return this.yarnSiteConfig;
        }

        public ListResourcePoolResponseBodyPoolInfoListPoolInfoEcmResourcePool setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListResourcePoolResponseBodyPoolInfoListPoolInfoEcmResourcePool setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

    public static class ListResourcePoolResponseBodyPoolInfoListPoolInfoQueueListQueueEcmResourcePoolConfigListEcmResourcePoolConfig extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("ConfigType")
        public String configType;

        @NameInMap("ConfigValue")
        public String configValue;

        @NameInMap("Note")
        public String note;

        @NameInMap("Category")
        public String category;

        @NameInMap("ConfigKey")
        public String configKey;

        @NameInMap("Id")
        public Long id;

        public static ListResourcePoolResponseBodyPoolInfoListPoolInfoQueueListQueueEcmResourcePoolConfigListEcmResourcePoolConfig build(java.util.Map<String, ?> map) throws Exception {
            ListResourcePoolResponseBodyPoolInfoListPoolInfoQueueListQueueEcmResourcePoolConfigListEcmResourcePoolConfig self = new ListResourcePoolResponseBodyPoolInfoListPoolInfoQueueListQueueEcmResourcePoolConfigListEcmResourcePoolConfig();
            return TeaModel.build(map, self);
        }

        public ListResourcePoolResponseBodyPoolInfoListPoolInfoQueueListQueueEcmResourcePoolConfigListEcmResourcePoolConfig setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListResourcePoolResponseBodyPoolInfoListPoolInfoQueueListQueueEcmResourcePoolConfigListEcmResourcePoolConfig setConfigType(String configType) {
            this.configType = configType;
            return this;
        }
        public String getConfigType() {
            return this.configType;
        }

        public ListResourcePoolResponseBodyPoolInfoListPoolInfoQueueListQueueEcmResourcePoolConfigListEcmResourcePoolConfig setConfigValue(String configValue) {
            this.configValue = configValue;
            return this;
        }
        public String getConfigValue() {
            return this.configValue;
        }

        public ListResourcePoolResponseBodyPoolInfoListPoolInfoQueueListQueueEcmResourcePoolConfigListEcmResourcePoolConfig setNote(String note) {
            this.note = note;
            return this;
        }
        public String getNote() {
            return this.note;
        }

        public ListResourcePoolResponseBodyPoolInfoListPoolInfoQueueListQueueEcmResourcePoolConfigListEcmResourcePoolConfig setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public ListResourcePoolResponseBodyPoolInfoListPoolInfoQueueListQueueEcmResourcePoolConfigListEcmResourcePoolConfig setConfigKey(String configKey) {
            this.configKey = configKey;
            return this;
        }
        public String getConfigKey() {
            return this.configKey;
        }

        public ListResourcePoolResponseBodyPoolInfoListPoolInfoQueueListQueueEcmResourcePoolConfigListEcmResourcePoolConfig setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

    public static class ListResourcePoolResponseBodyPoolInfoListPoolInfoQueueListQueueEcmResourcePoolConfigList extends TeaModel {
        @NameInMap("EcmResourcePoolConfig")
        public java.util.List<ListResourcePoolResponseBodyPoolInfoListPoolInfoQueueListQueueEcmResourcePoolConfigListEcmResourcePoolConfig> ecmResourcePoolConfig;

        public static ListResourcePoolResponseBodyPoolInfoListPoolInfoQueueListQueueEcmResourcePoolConfigList build(java.util.Map<String, ?> map) throws Exception {
            ListResourcePoolResponseBodyPoolInfoListPoolInfoQueueListQueueEcmResourcePoolConfigList self = new ListResourcePoolResponseBodyPoolInfoListPoolInfoQueueListQueueEcmResourcePoolConfigList();
            return TeaModel.build(map, self);
        }

        public ListResourcePoolResponseBodyPoolInfoListPoolInfoQueueListQueueEcmResourcePoolConfigList setEcmResourcePoolConfig(java.util.List<ListResourcePoolResponseBodyPoolInfoListPoolInfoQueueListQueueEcmResourcePoolConfigListEcmResourcePoolConfig> ecmResourcePoolConfig) {
            this.ecmResourcePoolConfig = ecmResourcePoolConfig;
            return this;
        }
        public java.util.List<ListResourcePoolResponseBodyPoolInfoListPoolInfoQueueListQueueEcmResourcePoolConfigListEcmResourcePoolConfig> getEcmResourcePoolConfig() {
            return this.ecmResourcePoolConfig;
        }

    }

    public static class ListResourcePoolResponseBodyPoolInfoListPoolInfoQueueListQueueEcmResourceQueue extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("ResourcePoolId")
        public Long resourcePoolId;

        @NameInMap("Leaf")
        public Boolean leaf;

        @NameInMap("ParentQueueId")
        public Long parentQueueId;

        @NameInMap("UserId")
        public String userId;

        @NameInMap("QueueType")
        public String queueType;

        @NameInMap("Name")
        public String name;

        @NameInMap("QualifiedName")
        public String qualifiedName;

        @NameInMap("Id")
        public Long id;

        public static ListResourcePoolResponseBodyPoolInfoListPoolInfoQueueListQueueEcmResourceQueue build(java.util.Map<String, ?> map) throws Exception {
            ListResourcePoolResponseBodyPoolInfoListPoolInfoQueueListQueueEcmResourceQueue self = new ListResourcePoolResponseBodyPoolInfoListPoolInfoQueueListQueueEcmResourceQueue();
            return TeaModel.build(map, self);
        }

        public ListResourcePoolResponseBodyPoolInfoListPoolInfoQueueListQueueEcmResourceQueue setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListResourcePoolResponseBodyPoolInfoListPoolInfoQueueListQueueEcmResourceQueue setResourcePoolId(Long resourcePoolId) {
            this.resourcePoolId = resourcePoolId;
            return this;
        }
        public Long getResourcePoolId() {
            return this.resourcePoolId;
        }

        public ListResourcePoolResponseBodyPoolInfoListPoolInfoQueueListQueueEcmResourceQueue setLeaf(Boolean leaf) {
            this.leaf = leaf;
            return this;
        }
        public Boolean getLeaf() {
            return this.leaf;
        }

        public ListResourcePoolResponseBodyPoolInfoListPoolInfoQueueListQueueEcmResourceQueue setParentQueueId(Long parentQueueId) {
            this.parentQueueId = parentQueueId;
            return this;
        }
        public Long getParentQueueId() {
            return this.parentQueueId;
        }

        public ListResourcePoolResponseBodyPoolInfoListPoolInfoQueueListQueueEcmResourceQueue setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public ListResourcePoolResponseBodyPoolInfoListPoolInfoQueueListQueueEcmResourceQueue setQueueType(String queueType) {
            this.queueType = queueType;
            return this;
        }
        public String getQueueType() {
            return this.queueType;
        }

        public ListResourcePoolResponseBodyPoolInfoListPoolInfoQueueListQueueEcmResourceQueue setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListResourcePoolResponseBodyPoolInfoListPoolInfoQueueListQueueEcmResourceQueue setQualifiedName(String qualifiedName) {
            this.qualifiedName = qualifiedName;
            return this;
        }
        public String getQualifiedName() {
            return this.qualifiedName;
        }

        public ListResourcePoolResponseBodyPoolInfoListPoolInfoQueueListQueueEcmResourceQueue setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

    public static class ListResourcePoolResponseBodyPoolInfoListPoolInfoQueueListQueue extends TeaModel {
        @NameInMap("EcmResourcePoolConfigList")
        public ListResourcePoolResponseBodyPoolInfoListPoolInfoQueueListQueueEcmResourcePoolConfigList ecmResourcePoolConfigList;

        @NameInMap("EcmResourceQueue")
        public ListResourcePoolResponseBodyPoolInfoListPoolInfoQueueListQueueEcmResourceQueue ecmResourceQueue;

        public static ListResourcePoolResponseBodyPoolInfoListPoolInfoQueueListQueue build(java.util.Map<String, ?> map) throws Exception {
            ListResourcePoolResponseBodyPoolInfoListPoolInfoQueueListQueue self = new ListResourcePoolResponseBodyPoolInfoListPoolInfoQueueListQueue();
            return TeaModel.build(map, self);
        }

        public ListResourcePoolResponseBodyPoolInfoListPoolInfoQueueListQueue setEcmResourcePoolConfigList(ListResourcePoolResponseBodyPoolInfoListPoolInfoQueueListQueueEcmResourcePoolConfigList ecmResourcePoolConfigList) {
            this.ecmResourcePoolConfigList = ecmResourcePoolConfigList;
            return this;
        }
        public ListResourcePoolResponseBodyPoolInfoListPoolInfoQueueListQueueEcmResourcePoolConfigList getEcmResourcePoolConfigList() {
            return this.ecmResourcePoolConfigList;
        }

        public ListResourcePoolResponseBodyPoolInfoListPoolInfoQueueListQueue setEcmResourceQueue(ListResourcePoolResponseBodyPoolInfoListPoolInfoQueueListQueueEcmResourceQueue ecmResourceQueue) {
            this.ecmResourceQueue = ecmResourceQueue;
            return this;
        }
        public ListResourcePoolResponseBodyPoolInfoListPoolInfoQueueListQueueEcmResourceQueue getEcmResourceQueue() {
            return this.ecmResourceQueue;
        }

    }

    public static class ListResourcePoolResponseBodyPoolInfoListPoolInfoQueueList extends TeaModel {
        @NameInMap("Queue")
        public java.util.List<ListResourcePoolResponseBodyPoolInfoListPoolInfoQueueListQueue> queue;

        public static ListResourcePoolResponseBodyPoolInfoListPoolInfoQueueList build(java.util.Map<String, ?> map) throws Exception {
            ListResourcePoolResponseBodyPoolInfoListPoolInfoQueueList self = new ListResourcePoolResponseBodyPoolInfoListPoolInfoQueueList();
            return TeaModel.build(map, self);
        }

        public ListResourcePoolResponseBodyPoolInfoListPoolInfoQueueList setQueue(java.util.List<ListResourcePoolResponseBodyPoolInfoListPoolInfoQueueListQueue> queue) {
            this.queue = queue;
            return this;
        }
        public java.util.List<ListResourcePoolResponseBodyPoolInfoListPoolInfoQueueListQueue> getQueue() {
            return this.queue;
        }

    }

    public static class ListResourcePoolResponseBodyPoolInfoListPoolInfo extends TeaModel {
        @NameInMap("EcmResourcePoolConfigList")
        public ListResourcePoolResponseBodyPoolInfoListPoolInfoEcmResourcePoolConfigList ecmResourcePoolConfigList;

        @NameInMap("EcmResourcePool")
        public ListResourcePoolResponseBodyPoolInfoListPoolInfoEcmResourcePool ecmResourcePool;

        @NameInMap("QueueList")
        public ListResourcePoolResponseBodyPoolInfoListPoolInfoQueueList queueList;

        public static ListResourcePoolResponseBodyPoolInfoListPoolInfo build(java.util.Map<String, ?> map) throws Exception {
            ListResourcePoolResponseBodyPoolInfoListPoolInfo self = new ListResourcePoolResponseBodyPoolInfoListPoolInfo();
            return TeaModel.build(map, self);
        }

        public ListResourcePoolResponseBodyPoolInfoListPoolInfo setEcmResourcePoolConfigList(ListResourcePoolResponseBodyPoolInfoListPoolInfoEcmResourcePoolConfigList ecmResourcePoolConfigList) {
            this.ecmResourcePoolConfigList = ecmResourcePoolConfigList;
            return this;
        }
        public ListResourcePoolResponseBodyPoolInfoListPoolInfoEcmResourcePoolConfigList getEcmResourcePoolConfigList() {
            return this.ecmResourcePoolConfigList;
        }

        public ListResourcePoolResponseBodyPoolInfoListPoolInfo setEcmResourcePool(ListResourcePoolResponseBodyPoolInfoListPoolInfoEcmResourcePool ecmResourcePool) {
            this.ecmResourcePool = ecmResourcePool;
            return this;
        }
        public ListResourcePoolResponseBodyPoolInfoListPoolInfoEcmResourcePool getEcmResourcePool() {
            return this.ecmResourcePool;
        }

        public ListResourcePoolResponseBodyPoolInfoListPoolInfo setQueueList(ListResourcePoolResponseBodyPoolInfoListPoolInfoQueueList queueList) {
            this.queueList = queueList;
            return this;
        }
        public ListResourcePoolResponseBodyPoolInfoListPoolInfoQueueList getQueueList() {
            return this.queueList;
        }

    }

    public static class ListResourcePoolResponseBodyPoolInfoList extends TeaModel {
        @NameInMap("PoolInfo")
        public java.util.List<ListResourcePoolResponseBodyPoolInfoListPoolInfo> poolInfo;

        public static ListResourcePoolResponseBodyPoolInfoList build(java.util.Map<String, ?> map) throws Exception {
            ListResourcePoolResponseBodyPoolInfoList self = new ListResourcePoolResponseBodyPoolInfoList();
            return TeaModel.build(map, self);
        }

        public ListResourcePoolResponseBodyPoolInfoList setPoolInfo(java.util.List<ListResourcePoolResponseBodyPoolInfoListPoolInfo> poolInfo) {
            this.poolInfo = poolInfo;
            return this;
        }
        public java.util.List<ListResourcePoolResponseBodyPoolInfoListPoolInfo> getPoolInfo() {
            return this.poolInfo;
        }

    }

}
