// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.epg20260715.models;

import com.aliyun.tea.*;

public class ListEgressProxyConfigurationsResponseBody extends TeaModel {
    /**
     * <p>The list of egress proxy configurations.</p>
     */
    @NameInMap("EgressProxyConfigurations")
    public java.util.List<ListEgressProxyConfigurationsResponseBodyEgressProxyConfigurations> egressProxyConfigurations;

    /**
     * <p>The maximum number of entries returned for the current request.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token for the next query. Valid values:</p>
     * <ul>
     * <li>If NextToken is empty, no next query is required.</li>
     * <li>If NextToken is returned, the value indicates the token for the next query.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>FFmyTO70tTpLG6I3FmYAXGKPd****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>01A05ABD-A4C0-5F6B-A554-AEEEC73F9F70</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of egress proxy configurations that meet the query conditions.</p>
     * 
     * <strong>example:</strong>
     * <p>19</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListEgressProxyConfigurationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListEgressProxyConfigurationsResponseBody self = new ListEgressProxyConfigurationsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListEgressProxyConfigurationsResponseBody setEgressProxyConfigurations(java.util.List<ListEgressProxyConfigurationsResponseBodyEgressProxyConfigurations> egressProxyConfigurations) {
        this.egressProxyConfigurations = egressProxyConfigurations;
        return this;
    }
    public java.util.List<ListEgressProxyConfigurationsResponseBodyEgressProxyConfigurations> getEgressProxyConfigurations() {
        return this.egressProxyConfigurations;
    }

    public ListEgressProxyConfigurationsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListEgressProxyConfigurationsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListEgressProxyConfigurationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListEgressProxyConfigurationsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListEgressProxyConfigurationsResponseBodyEgressProxyConfigurationsTags extends TeaModel {
        /**
         * <p>The tag key. The key can be up to 128 characters in length. It cannot start with <code>aliyun</code> or <code>acs:</code>, and cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>testKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value. The value can be up to 256 characters in length and cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>testValue</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListEgressProxyConfigurationsResponseBodyEgressProxyConfigurationsTags build(java.util.Map<String, ?> map) throws Exception {
            ListEgressProxyConfigurationsResponseBodyEgressProxyConfigurationsTags self = new ListEgressProxyConfigurationsResponseBodyEgressProxyConfigurationsTags();
            return TeaModel.build(map, self);
        }

        public ListEgressProxyConfigurationsResponseBodyEgressProxyConfigurationsTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListEgressProxyConfigurationsResponseBodyEgressProxyConfigurationsTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListEgressProxyConfigurationsResponseBodyEgressProxyConfigurations extends TeaModel {
        /**
         * <p>The time when the egress proxy configuration was created. The time is displayed in UTC in the yyyy-MM-ddTHH:mm:ssZ format.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-07-02T02:49:05Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The description of the egress proxy configuration. The description must be 2 to 256 characters in length, and can contain Chinese characters, letters, digits, hyphens (-), forward slashes (/), periods (.), and underscores (_).</p>
         * 
         * <strong>example:</strong>
         * <p>testEpg</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The ID of the egress proxy configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>epc-gw80d16a969933e7****</p>
         */
        @NameInMap("EgressProxyConfigurationId")
        public String egressProxyConfigurationId;

        /**
         * <p>The name of the egress proxy configuration. The name must be 2 to 128 characters in length, and must start with a letter or a Chinese character. It can contain digits, periods (.), underscores (_), and hyphens (-).</p>
         * 
         * <strong>example:</strong>
         * <p>testEpg</p>
         */
        @NameInMap("EgressProxyConfigurationName")
        public String egressProxyConfigurationName;

        /**
         * <p>The ID of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-aek6jw4dpt****</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The status of the egress proxy configuration. Valid values:</p>
         * <ul>
         * <li><p><strong>Provisioning</strong>: The egress proxy configuration is being created.</p>
         * </li>
         * <li><p><strong>Available</strong>: The egress proxy configuration is available.</p>
         * </li>
         * <li><p><strong>Configuring</strong>: The specifications of the egress proxy configuration are being changed.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Available</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The list of tags.</p>
         */
        @NameInMap("Tags")
        public java.util.List<ListEgressProxyConfigurationsResponseBodyEgressProxyConfigurationsTags> tags;

        public static ListEgressProxyConfigurationsResponseBodyEgressProxyConfigurations build(java.util.Map<String, ?> map) throws Exception {
            ListEgressProxyConfigurationsResponseBodyEgressProxyConfigurations self = new ListEgressProxyConfigurationsResponseBodyEgressProxyConfigurations();
            return TeaModel.build(map, self);
        }

        public ListEgressProxyConfigurationsResponseBodyEgressProxyConfigurations setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListEgressProxyConfigurationsResponseBodyEgressProxyConfigurations setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListEgressProxyConfigurationsResponseBodyEgressProxyConfigurations setEgressProxyConfigurationId(String egressProxyConfigurationId) {
            this.egressProxyConfigurationId = egressProxyConfigurationId;
            return this;
        }
        public String getEgressProxyConfigurationId() {
            return this.egressProxyConfigurationId;
        }

        public ListEgressProxyConfigurationsResponseBodyEgressProxyConfigurations setEgressProxyConfigurationName(String egressProxyConfigurationName) {
            this.egressProxyConfigurationName = egressProxyConfigurationName;
            return this;
        }
        public String getEgressProxyConfigurationName() {
            return this.egressProxyConfigurationName;
        }

        public ListEgressProxyConfigurationsResponseBodyEgressProxyConfigurations setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public ListEgressProxyConfigurationsResponseBodyEgressProxyConfigurations setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListEgressProxyConfigurationsResponseBodyEgressProxyConfigurations setTags(java.util.List<ListEgressProxyConfigurationsResponseBodyEgressProxyConfigurationsTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<ListEgressProxyConfigurationsResponseBodyEgressProxyConfigurationsTags> getTags() {
            return this.tags;
        }

    }

}
