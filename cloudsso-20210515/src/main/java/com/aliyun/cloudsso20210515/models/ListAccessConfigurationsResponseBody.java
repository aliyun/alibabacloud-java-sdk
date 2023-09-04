// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class ListAccessConfigurationsResponseBody extends TeaModel {
    /**
     * <p>The access configurations.</p>
     */
    @NameInMap("AccessConfigurations")
    public java.util.List<ListAccessConfigurationsResponseBodyAccessConfigurations> accessConfigurations;

    /**
     * <p>Indicates whether the queried entries are truncated. Valid values:</p>
     * <br>
     * <p>*   true: The queried entries are truncated.</p>
     * <p>*   false: The queried entries are not truncated.</p>
     */
    @NameInMap("IsTruncated")
    public Boolean isTruncated;

    /**
     * <p>The number of entries returned per page.</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token that is returned for the next page.</p>
     * <br>
     * <p>>  This parameter is returned only when the `IsTruncated` parameter is set to `true`.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     */
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
        /**
         * <p>The ID of the access configuration.</p>
         */
        @NameInMap("AccessConfigurationId")
        public String accessConfigurationId;

        /**
         * <p>The name of the access configuration.</p>
         */
        @NameInMap("AccessConfigurationName")
        public String accessConfigurationName;

        /**
         * <p>The time when the access configuration was created.</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The description of the access configuration.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The initial web page that is displayed after a CloudSSO user accesses an account in your resource directory by using the access configuration.</p>
         */
        @NameInMap("RelayState")
        public String relayState;

        /**
         * <p>The duration of a session in which a CloudSSO user accesses an account in your resource directory by using the access configuration.</p>
         * <br>
         * <p>Unit: seconds.</p>
         */
        @NameInMap("SessionDuration")
        public Integer sessionDuration;

        /**
         * <p>The status notification.</p>
         */
        @NameInMap("StatusNotifications")
        public java.util.List<String> statusNotifications;

        /**
         * <p>The time when the information about the access configuration was modified.</p>
         */
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
