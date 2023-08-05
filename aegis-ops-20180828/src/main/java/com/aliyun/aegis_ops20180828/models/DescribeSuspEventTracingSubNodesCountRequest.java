// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aegis_ops20180828.models;

import com.aliyun.tea.*;

public class DescribeSuspEventTracingSubNodesCountRequest extends TeaModel {
    @NameInMap("AliUid")
    public Long aliUid;

    @NameInMap("Bid")
    public String bid;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("MaxId")
    public Long maxId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("Uuid")
    public String uuid;

    @NameInMap("VertexList")
    public java.util.List<DescribeSuspEventTracingSubNodesCountRequestVertexList> vertexList;

    public static DescribeSuspEventTracingSubNodesCountRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSuspEventTracingSubNodesCountRequest self = new DescribeSuspEventTracingSubNodesCountRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSuspEventTracingSubNodesCountRequest setAliUid(Long aliUid) {
        this.aliUid = aliUid;
        return this;
    }
    public Long getAliUid() {
        return this.aliUid;
    }

    public DescribeSuspEventTracingSubNodesCountRequest setBid(String bid) {
        this.bid = bid;
        return this;
    }
    public String getBid() {
        return this.bid;
    }

    public DescribeSuspEventTracingSubNodesCountRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeSuspEventTracingSubNodesCountRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeSuspEventTracingSubNodesCountRequest setMaxId(Long maxId) {
        this.maxId = maxId;
        return this;
    }
    public Long getMaxId() {
        return this.maxId;
    }

    public DescribeSuspEventTracingSubNodesCountRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeSuspEventTracingSubNodesCountRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

    public DescribeSuspEventTracingSubNodesCountRequest setVertexList(java.util.List<DescribeSuspEventTracingSubNodesCountRequestVertexList> vertexList) {
        this.vertexList = vertexList;
        return this;
    }
    public java.util.List<DescribeSuspEventTracingSubNodesCountRequestVertexList> getVertexList() {
        return this.vertexList;
    }

    public static class DescribeSuspEventTracingSubNodesCountRequestVertexListDisplayInfo extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Value")
        public String value;

        public static DescribeSuspEventTracingSubNodesCountRequestVertexListDisplayInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeSuspEventTracingSubNodesCountRequestVertexListDisplayInfo self = new DescribeSuspEventTracingSubNodesCountRequestVertexListDisplayInfo();
            return TeaModel.build(map, self);
        }

        public DescribeSuspEventTracingSubNodesCountRequestVertexListDisplayInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeSuspEventTracingSubNodesCountRequestVertexListDisplayInfo setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeSuspEventTracingSubNodesCountRequestVertexListNeighborList extends TeaModel {
        @NameInMap("Count")
        public Integer count;

        @NameInMap("HasMore")
        public Boolean hasMore;

        @NameInMap("Type")
        public String type;

        public static DescribeSuspEventTracingSubNodesCountRequestVertexListNeighborList build(java.util.Map<String, ?> map) throws Exception {
            DescribeSuspEventTracingSubNodesCountRequestVertexListNeighborList self = new DescribeSuspEventTracingSubNodesCountRequestVertexListNeighborList();
            return TeaModel.build(map, self);
        }

        public DescribeSuspEventTracingSubNodesCountRequestVertexListNeighborList setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public DescribeSuspEventTracingSubNodesCountRequestVertexListNeighborList setHasMore(Boolean hasMore) {
            this.hasMore = hasMore;
            return this;
        }
        public Boolean getHasMore() {
            return this.hasMore;
        }

        public DescribeSuspEventTracingSubNodesCountRequestVertexListNeighborList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeSuspEventTracingSubNodesCountRequestVertexList extends TeaModel {
        @NameInMap("Aliuid")
        public String aliuid;

        @NameInMap("DisplayInfo")
        public java.util.List<DescribeSuspEventTracingSubNodesCountRequestVertexListDisplayInfo> displayInfo;

        @NameInMap("Id")
        public String id;

        @NameInMap("Lang")
        public String lang;

        @NameInMap("Name")
        public String name;

        @NameInMap("NeighborList")
        public java.util.List<DescribeSuspEventTracingSubNodesCountRequestVertexListNeighborList> neighborList;

        @NameInMap("Properties")
        public String properties;

        @NameInMap("Property")
        public java.util.Map<String, ?> property;

        @NameInMap("RuleId")
        public String ruleId;

        @NameInMap("Time")
        public String time;

        @NameInMap("Timestamp")
        public Long timestamp;

        @NameInMap("Type")
        public String type;

        @NameInMap("UpdateTime")
        public String updateTime;

        @NameInMap("Uuid")
        public String uuid;

        public static DescribeSuspEventTracingSubNodesCountRequestVertexList build(java.util.Map<String, ?> map) throws Exception {
            DescribeSuspEventTracingSubNodesCountRequestVertexList self = new DescribeSuspEventTracingSubNodesCountRequestVertexList();
            return TeaModel.build(map, self);
        }

        public DescribeSuspEventTracingSubNodesCountRequestVertexList setAliuid(String aliuid) {
            this.aliuid = aliuid;
            return this;
        }
        public String getAliuid() {
            return this.aliuid;
        }

        public DescribeSuspEventTracingSubNodesCountRequestVertexList setDisplayInfo(java.util.List<DescribeSuspEventTracingSubNodesCountRequestVertexListDisplayInfo> displayInfo) {
            this.displayInfo = displayInfo;
            return this;
        }
        public java.util.List<DescribeSuspEventTracingSubNodesCountRequestVertexListDisplayInfo> getDisplayInfo() {
            return this.displayInfo;
        }

        public DescribeSuspEventTracingSubNodesCountRequestVertexList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeSuspEventTracingSubNodesCountRequestVertexList setLang(String lang) {
            this.lang = lang;
            return this;
        }
        public String getLang() {
            return this.lang;
        }

        public DescribeSuspEventTracingSubNodesCountRequestVertexList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeSuspEventTracingSubNodesCountRequestVertexList setNeighborList(java.util.List<DescribeSuspEventTracingSubNodesCountRequestVertexListNeighborList> neighborList) {
            this.neighborList = neighborList;
            return this;
        }
        public java.util.List<DescribeSuspEventTracingSubNodesCountRequestVertexListNeighborList> getNeighborList() {
            return this.neighborList;
        }

        public DescribeSuspEventTracingSubNodesCountRequestVertexList setProperties(String properties) {
            this.properties = properties;
            return this;
        }
        public String getProperties() {
            return this.properties;
        }

        public DescribeSuspEventTracingSubNodesCountRequestVertexList setProperty(java.util.Map<String, ?> property) {
            this.property = property;
            return this;
        }
        public java.util.Map<String, ?> getProperty() {
            return this.property;
        }

        public DescribeSuspEventTracingSubNodesCountRequestVertexList setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

        public DescribeSuspEventTracingSubNodesCountRequestVertexList setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

        public DescribeSuspEventTracingSubNodesCountRequestVertexList setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public DescribeSuspEventTracingSubNodesCountRequestVertexList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeSuspEventTracingSubNodesCountRequestVertexList setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public DescribeSuspEventTracingSubNodesCountRequestVertexList setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

}
