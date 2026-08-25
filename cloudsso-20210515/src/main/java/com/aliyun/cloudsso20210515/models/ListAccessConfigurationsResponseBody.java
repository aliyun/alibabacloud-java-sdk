// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class ListAccessConfigurationsResponseBody extends TeaModel {
    /**
     * <p>The list of access configurations.</p>
     */
    @NameInMap("AccessConfigurations")
    public java.util.List<ListAccessConfigurationsResponseBodyAccessConfigurations> accessConfigurations;

    /**
     * <p>Indicates whether the results are truncated. Valid values:</p>
     * <ul>
     * <li>true: The results are truncated.</li>
     * <li>false: The results are not truncated.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IsTruncated")
    public Boolean isTruncated;

    /**
     * <p>The maximum number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token for the next page of results.</p>
     * <blockquote>
     * <p>This parameter is returned only when <code>IsTruncated</code> is <code>true</code>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>K1c3o9K7pFxoTtxH1Nm7MMLb7zrDGvftYBQBPDVv7AD3a8yhRb3Mk8L9ivmN6bFSjfkZNTAg3h4****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2BC0CBAC-45E1-5BD3-BF6E-F69D1D5391C2</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries that match the request parameters.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
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

    public static class ListAccessConfigurationsResponseBodyAccessConfigurationsTags extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>TestValue</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListAccessConfigurationsResponseBodyAccessConfigurationsTags build(java.util.Map<String, ?> map) throws Exception {
            ListAccessConfigurationsResponseBodyAccessConfigurationsTags self = new ListAccessConfigurationsResponseBodyAccessConfigurationsTags();
            return TeaModel.build(map, self);
        }

        public ListAccessConfigurationsResponseBodyAccessConfigurationsTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListAccessConfigurationsResponseBodyAccessConfigurationsTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListAccessConfigurationsResponseBodyAccessConfigurations extends TeaModel {
        /**
         * <p>The ID of the access configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>ac-00jhtfl8thteu6uj****</p>
         */
        @NameInMap("AccessConfigurationId")
        public String accessConfigurationId;

        /**
         * <p>The name of the access configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>ECS-Admin</p>
         */
        @NameInMap("AccessConfigurationName")
        public String accessConfigurationName;

        /**
         * <p>The time when the access configuration was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-11-02T08:44:23Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The description of the access configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>This is an access configuration.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The initial access page.</p>
         * <p>The URL of the initial page that is displayed when a CloudSSO user uses the access configuration to access an account in a resource directory.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://cloudsso.console.aliyun.com">https://cloudsso.console.aliyun.com</a></p>
         */
        @NameInMap("RelayState")
        public String relayState;

        /**
         * <p>The session duration.</p>
         * <p>The maximum duration of a session when a CloudSSO user uses the access configuration to access an account in a resource directory.</p>
         * <p>Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>900</p>
         */
        @NameInMap("SessionDuration")
        public Integer sessionDuration;

        /**
         * <p>The status notification information.</p>
         */
        @NameInMap("StatusNotifications")
        public java.util.List<String> statusNotifications;

        /**
         * <p>The list of tags.</p>
         */
        @NameInMap("Tags")
        public java.util.List<ListAccessConfigurationsResponseBodyAccessConfigurationsTags> tags;

        /**
         * <p>The time when the access configuration was last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-11-02T08:44:23Z</p>
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

        public ListAccessConfigurationsResponseBodyAccessConfigurations setTags(java.util.List<ListAccessConfigurationsResponseBodyAccessConfigurationsTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<ListAccessConfigurationsResponseBodyAccessConfigurationsTags> getTags() {
            return this.tags;
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
