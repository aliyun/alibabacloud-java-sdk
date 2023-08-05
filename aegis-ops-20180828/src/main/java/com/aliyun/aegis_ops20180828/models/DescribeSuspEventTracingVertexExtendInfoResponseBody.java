// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aegis_ops20180828.models;

import com.aliyun.tea.*;

public class DescribeSuspEventTracingVertexExtendInfoResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Count")
    public Integer count;

    @NameInMap("Data")
    public java.util.List<DescribeSuspEventTracingVertexExtendInfoResponseBodyData> data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TimeCost")
    public Long timeCost;

    public static DescribeSuspEventTracingVertexExtendInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSuspEventTracingVertexExtendInfoResponseBody self = new DescribeSuspEventTracingVertexExtendInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSuspEventTracingVertexExtendInfoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeSuspEventTracingVertexExtendInfoResponseBody setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public DescribeSuspEventTracingVertexExtendInfoResponseBody setData(java.util.List<DescribeSuspEventTracingVertexExtendInfoResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeSuspEventTracingVertexExtendInfoResponseBodyData> getData() {
        return this.data;
    }

    public DescribeSuspEventTracingVertexExtendInfoResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeSuspEventTracingVertexExtendInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeSuspEventTracingVertexExtendInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSuspEventTracingVertexExtendInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeSuspEventTracingVertexExtendInfoResponseBody setTimeCost(Long timeCost) {
        this.timeCost = timeCost;
        return this;
    }
    public Long getTimeCost() {
        return this.timeCost;
    }

    public static class DescribeSuspEventTracingVertexExtendInfoResponseBodyDataDisplayInfo extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Value")
        public String value;

        public static DescribeSuspEventTracingVertexExtendInfoResponseBodyDataDisplayInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeSuspEventTracingVertexExtendInfoResponseBodyDataDisplayInfo self = new DescribeSuspEventTracingVertexExtendInfoResponseBodyDataDisplayInfo();
            return TeaModel.build(map, self);
        }

        public DescribeSuspEventTracingVertexExtendInfoResponseBodyDataDisplayInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeSuspEventTracingVertexExtendInfoResponseBodyDataDisplayInfo setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeSuspEventTracingVertexExtendInfoResponseBodyDataNeighborList extends TeaModel {
        @NameInMap("Count")
        public Integer count;

        @NameInMap("HasMore")
        public Boolean hasMore;

        @NameInMap("Type")
        public String type;

        public static DescribeSuspEventTracingVertexExtendInfoResponseBodyDataNeighborList build(java.util.Map<String, ?> map) throws Exception {
            DescribeSuspEventTracingVertexExtendInfoResponseBodyDataNeighborList self = new DescribeSuspEventTracingVertexExtendInfoResponseBodyDataNeighborList();
            return TeaModel.build(map, self);
        }

        public DescribeSuspEventTracingVertexExtendInfoResponseBodyDataNeighborList setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public DescribeSuspEventTracingVertexExtendInfoResponseBodyDataNeighborList setHasMore(Boolean hasMore) {
            this.hasMore = hasMore;
            return this;
        }
        public Boolean getHasMore() {
            return this.hasMore;
        }

        public DescribeSuspEventTracingVertexExtendInfoResponseBodyDataNeighborList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeSuspEventTracingVertexExtendInfoResponseBodyData extends TeaModel {
        @NameInMap("Aliuid")
        public String aliuid;

        @NameInMap("DisplayInfo")
        public java.util.List<DescribeSuspEventTracingVertexExtendInfoResponseBodyDataDisplayInfo> displayInfo;

        @NameInMap("Id")
        public String id;

        @NameInMap("Lang")
        public String lang;

        @NameInMap("Name")
        public String name;

        @NameInMap("NeighborList")
        public java.util.List<DescribeSuspEventTracingVertexExtendInfoResponseBodyDataNeighborList> neighborList;

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

        public static DescribeSuspEventTracingVertexExtendInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeSuspEventTracingVertexExtendInfoResponseBodyData self = new DescribeSuspEventTracingVertexExtendInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeSuspEventTracingVertexExtendInfoResponseBodyData setAliuid(String aliuid) {
            this.aliuid = aliuid;
            return this;
        }
        public String getAliuid() {
            return this.aliuid;
        }

        public DescribeSuspEventTracingVertexExtendInfoResponseBodyData setDisplayInfo(java.util.List<DescribeSuspEventTracingVertexExtendInfoResponseBodyDataDisplayInfo> displayInfo) {
            this.displayInfo = displayInfo;
            return this;
        }
        public java.util.List<DescribeSuspEventTracingVertexExtendInfoResponseBodyDataDisplayInfo> getDisplayInfo() {
            return this.displayInfo;
        }

        public DescribeSuspEventTracingVertexExtendInfoResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeSuspEventTracingVertexExtendInfoResponseBodyData setLang(String lang) {
            this.lang = lang;
            return this;
        }
        public String getLang() {
            return this.lang;
        }

        public DescribeSuspEventTracingVertexExtendInfoResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeSuspEventTracingVertexExtendInfoResponseBodyData setNeighborList(java.util.List<DescribeSuspEventTracingVertexExtendInfoResponseBodyDataNeighborList> neighborList) {
            this.neighborList = neighborList;
            return this;
        }
        public java.util.List<DescribeSuspEventTracingVertexExtendInfoResponseBodyDataNeighborList> getNeighborList() {
            return this.neighborList;
        }

        public DescribeSuspEventTracingVertexExtendInfoResponseBodyData setProperties(String properties) {
            this.properties = properties;
            return this;
        }
        public String getProperties() {
            return this.properties;
        }

        public DescribeSuspEventTracingVertexExtendInfoResponseBodyData setProperty(java.util.Map<String, ?> property) {
            this.property = property;
            return this;
        }
        public java.util.Map<String, ?> getProperty() {
            return this.property;
        }

        public DescribeSuspEventTracingVertexExtendInfoResponseBodyData setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

        public DescribeSuspEventTracingVertexExtendInfoResponseBodyData setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

        public DescribeSuspEventTracingVertexExtendInfoResponseBodyData setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public DescribeSuspEventTracingVertexExtendInfoResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeSuspEventTracingVertexExtendInfoResponseBodyData setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public DescribeSuspEventTracingVertexExtendInfoResponseBodyData setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

}
