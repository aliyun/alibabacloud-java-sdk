// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iotcc20210513.models;

import com.aliyun.tea.*;

public class ListIoTCloudConnectorGroupsResponseBody extends TeaModel {
    @NameInMap("IoTCloudConnectorGroups")
    public java.util.List<ListIoTCloudConnectorGroupsResponseBodyIoTCloudConnectorGroups> ioTCloudConnectorGroups;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListIoTCloudConnectorGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListIoTCloudConnectorGroupsResponseBody self = new ListIoTCloudConnectorGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListIoTCloudConnectorGroupsResponseBody setIoTCloudConnectorGroups(java.util.List<ListIoTCloudConnectorGroupsResponseBodyIoTCloudConnectorGroups> ioTCloudConnectorGroups) {
        this.ioTCloudConnectorGroups = ioTCloudConnectorGroups;
        return this;
    }
    public java.util.List<ListIoTCloudConnectorGroupsResponseBodyIoTCloudConnectorGroups> getIoTCloudConnectorGroups() {
        return this.ioTCloudConnectorGroups;
    }

    public ListIoTCloudConnectorGroupsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListIoTCloudConnectorGroupsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListIoTCloudConnectorGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListIoTCloudConnectorGroupsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListIoTCloudConnectorGroupsResponseBodyIoTCloudConnectorGroupsIoTCloudConnectors extends TeaModel {
        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("IoTCloudConnectorDescription")
        public String ioTCloudConnectorDescription;

        @NameInMap("IoTCloudConnectorId")
        public String ioTCloudConnectorId;

        @NameInMap("IoTCloudConnectorName")
        public String ioTCloudConnectorName;

        @NameInMap("IoTCloudConnectorStatus")
        public String ioTCloudConnectorStatus;

        public static ListIoTCloudConnectorGroupsResponseBodyIoTCloudConnectorGroupsIoTCloudConnectors build(java.util.Map<String, ?> map) throws Exception {
            ListIoTCloudConnectorGroupsResponseBodyIoTCloudConnectorGroupsIoTCloudConnectors self = new ListIoTCloudConnectorGroupsResponseBodyIoTCloudConnectorGroupsIoTCloudConnectors();
            return TeaModel.build(map, self);
        }

        public ListIoTCloudConnectorGroupsResponseBodyIoTCloudConnectorGroupsIoTCloudConnectors setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListIoTCloudConnectorGroupsResponseBodyIoTCloudConnectorGroupsIoTCloudConnectors setIoTCloudConnectorDescription(String ioTCloudConnectorDescription) {
            this.ioTCloudConnectorDescription = ioTCloudConnectorDescription;
            return this;
        }
        public String getIoTCloudConnectorDescription() {
            return this.ioTCloudConnectorDescription;
        }

        public ListIoTCloudConnectorGroupsResponseBodyIoTCloudConnectorGroupsIoTCloudConnectors setIoTCloudConnectorId(String ioTCloudConnectorId) {
            this.ioTCloudConnectorId = ioTCloudConnectorId;
            return this;
        }
        public String getIoTCloudConnectorId() {
            return this.ioTCloudConnectorId;
        }

        public ListIoTCloudConnectorGroupsResponseBodyIoTCloudConnectorGroupsIoTCloudConnectors setIoTCloudConnectorName(String ioTCloudConnectorName) {
            this.ioTCloudConnectorName = ioTCloudConnectorName;
            return this;
        }
        public String getIoTCloudConnectorName() {
            return this.ioTCloudConnectorName;
        }

        public ListIoTCloudConnectorGroupsResponseBodyIoTCloudConnectorGroupsIoTCloudConnectors setIoTCloudConnectorStatus(String ioTCloudConnectorStatus) {
            this.ioTCloudConnectorStatus = ioTCloudConnectorStatus;
            return this;
        }
        public String getIoTCloudConnectorStatus() {
            return this.ioTCloudConnectorStatus;
        }

    }

    public static class ListIoTCloudConnectorGroupsResponseBodyIoTCloudConnectorGroups extends TeaModel {
        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("IoTCloudConnectorGroupId")
        public String ioTCloudConnectorGroupId;

        @NameInMap("IoTCloudConnectorGroupStatus")
        public String ioTCloudConnectorGroupStatus;

        @NameInMap("IoTCloudConnectors")
        public java.util.List<ListIoTCloudConnectorGroupsResponseBodyIoTCloudConnectorGroupsIoTCloudConnectors> ioTCloudConnectors;

        @NameInMap("Name")
        public String name;

        public static ListIoTCloudConnectorGroupsResponseBodyIoTCloudConnectorGroups build(java.util.Map<String, ?> map) throws Exception {
            ListIoTCloudConnectorGroupsResponseBodyIoTCloudConnectorGroups self = new ListIoTCloudConnectorGroupsResponseBodyIoTCloudConnectorGroups();
            return TeaModel.build(map, self);
        }

        public ListIoTCloudConnectorGroupsResponseBodyIoTCloudConnectorGroups setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListIoTCloudConnectorGroupsResponseBodyIoTCloudConnectorGroups setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListIoTCloudConnectorGroupsResponseBodyIoTCloudConnectorGroups setIoTCloudConnectorGroupId(String ioTCloudConnectorGroupId) {
            this.ioTCloudConnectorGroupId = ioTCloudConnectorGroupId;
            return this;
        }
        public String getIoTCloudConnectorGroupId() {
            return this.ioTCloudConnectorGroupId;
        }

        public ListIoTCloudConnectorGroupsResponseBodyIoTCloudConnectorGroups setIoTCloudConnectorGroupStatus(String ioTCloudConnectorGroupStatus) {
            this.ioTCloudConnectorGroupStatus = ioTCloudConnectorGroupStatus;
            return this;
        }
        public String getIoTCloudConnectorGroupStatus() {
            return this.ioTCloudConnectorGroupStatus;
        }

        public ListIoTCloudConnectorGroupsResponseBodyIoTCloudConnectorGroups setIoTCloudConnectors(java.util.List<ListIoTCloudConnectorGroupsResponseBodyIoTCloudConnectorGroupsIoTCloudConnectors> ioTCloudConnectors) {
            this.ioTCloudConnectors = ioTCloudConnectors;
            return this;
        }
        public java.util.List<ListIoTCloudConnectorGroupsResponseBodyIoTCloudConnectorGroupsIoTCloudConnectors> getIoTCloudConnectors() {
            return this.ioTCloudConnectors;
        }

        public ListIoTCloudConnectorGroupsResponseBodyIoTCloudConnectorGroups setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
