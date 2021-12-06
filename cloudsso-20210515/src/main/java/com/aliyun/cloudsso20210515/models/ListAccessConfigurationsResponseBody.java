// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class ListAccessConfigurationsResponseBody extends TeaModel {
    @NameInMap("AccessConfigurations")
    public java.util.List<ListAccessConfigurationsResponseBodyAccessConfigurations> accessConfigurations;

    @NameInMap("IsTruncated")
    public Boolean isTruncated;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCounts")
    public Integer totalCounts;

    public static ListAccessConfigurationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAccessConfigurationsResponseBody self = new ListAccessConfigurationsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAccessConfigurationsResponseBody setAccessConfigurations(java.util.List<ListAccessConfigurationsResponseBodyAccessConfigurations> accessConfigurations) {
        this.accessConfigurations = accessConfigurations;
        return this;
    }
    public java.util.List<ListAccessConfigurationsResponseBodyAccessConfigurations> getAccessConfigurations() {
        return this.accessConfigurations;
    }

    public ListAccessConfigurationsResponseBody setIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
        return this;
    }
    public Boolean getIsTruncated() {
        return this.isTruncated;
    }

    public ListAccessConfigurationsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListAccessConfigurationsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListAccessConfigurationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAccessConfigurationsResponseBody setTotalCounts(Integer totalCounts) {
        this.totalCounts = totalCounts;
        return this;
    }
    public Integer getTotalCounts() {
        return this.totalCounts;
    }

    public static class ListAccessConfigurationsResponseBodyAccessConfigurations extends TeaModel {
        @NameInMap("AccessConfigurationId")
        public String accessConfigurationId;

        @NameInMap("AccessConfigurationName")
        public String accessConfigurationName;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("RelayState")
        public String relayState;

        @NameInMap("SessionDuration")
        public Integer sessionDuration;

        @NameInMap("StatusNotifications")
        public java.util.List<String> statusNotifications;

        @NameInMap("UpdateTime")
        public String updateTime;

        public static ListAccessConfigurationsResponseBodyAccessConfigurations build(java.util.Map<String, ?> map) throws Exception {
            ListAccessConfigurationsResponseBodyAccessConfigurations self = new ListAccessConfigurationsResponseBodyAccessConfigurations();
            return TeaModel.build(map, self);
        }

        public ListAccessConfigurationsResponseBodyAccessConfigurations setAccessConfigurationId(String accessConfigurationId) {
            this.accessConfigurationId = accessConfigurationId;
            return this;
        }
        public String getAccessConfigurationId() {
            return this.accessConfigurationId;
        }

        public ListAccessConfigurationsResponseBodyAccessConfigurations setAccessConfigurationName(String accessConfigurationName) {
            this.accessConfigurationName = accessConfigurationName;
            return this;
        }
        public String getAccessConfigurationName() {
            return this.accessConfigurationName;
        }

        public ListAccessConfigurationsResponseBodyAccessConfigurations setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListAccessConfigurationsResponseBodyAccessConfigurations setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListAccessConfigurationsResponseBodyAccessConfigurations setRelayState(String relayState) {
            this.relayState = relayState;
            return this;
        }
        public String getRelayState() {
            return this.relayState;
        }

        public ListAccessConfigurationsResponseBodyAccessConfigurations setSessionDuration(Integer sessionDuration) {
            this.sessionDuration = sessionDuration;
            return this;
        }
        public Integer getSessionDuration() {
            return this.sessionDuration;
        }

        public ListAccessConfigurationsResponseBodyAccessConfigurations setStatusNotifications(java.util.List<String> statusNotifications) {
            this.statusNotifications = statusNotifications;
            return this;
        }
        public java.util.List<String> getStatusNotifications() {
            return this.statusNotifications;
        }

        public ListAccessConfigurationsResponseBodyAccessConfigurations setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
