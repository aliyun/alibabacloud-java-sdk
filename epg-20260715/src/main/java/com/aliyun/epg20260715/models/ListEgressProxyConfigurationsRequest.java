// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.epg20260715.models;

import com.aliyun.tea.*;

public class ListEgressProxyConfigurationsRequest extends TeaModel {
    /**
     * <p>The list of egress proxy configuration IDs.</p>
     */
    @NameInMap("EgressProxyConfigurationIds")
    public java.util.List<String> egressProxyConfigurationIds;

    /**
     * <p>The list of egress proxy configuration names.</p>
     */
    @NameInMap("EgressProxyConfigurationNames")
    public java.util.List<String> egressProxyConfigurationNames;

    /**
     * <p>The maximum number of entries to return per page during paging in a paged query. Valid values: 0 to 1000. Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token for the next query. Valid values:</p>
     * <ul>
     * <li>Leave this parameter empty for the first query or when no next query is required.</li>
     * <li>If a next query is required, set this parameter to the value of NextToken returned from the previous API call.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>FFmyTO70tTpLG6I3FmYAXGKPd****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfm4jcyx5e****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The number of entries to skip during paging in a paged query. The value must be greater than or equal to 0. Default value: 0.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Skip")
    public Integer skip;

    /**
     * <p>Filters egress proxy configurations by status. Valid values:</p>
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
    @NameInMap("Tag")
    public java.util.List<ListEgressProxyConfigurationsRequestTag> tag;

    public static ListEgressProxyConfigurationsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListEgressProxyConfigurationsRequest self = new ListEgressProxyConfigurationsRequest();
        return TeaModel.build(map, self);
    }

    public ListEgressProxyConfigurationsRequest setEgressProxyConfigurationIds(java.util.List<String> egressProxyConfigurationIds) {
        this.egressProxyConfigurationIds = egressProxyConfigurationIds;
        return this;
    }
    public java.util.List<String> getEgressProxyConfigurationIds() {
        return this.egressProxyConfigurationIds;
    }

    public ListEgressProxyConfigurationsRequest setEgressProxyConfigurationNames(java.util.List<String> egressProxyConfigurationNames) {
        this.egressProxyConfigurationNames = egressProxyConfigurationNames;
        return this;
    }
    public java.util.List<String> getEgressProxyConfigurationNames() {
        return this.egressProxyConfigurationNames;
    }

    public ListEgressProxyConfigurationsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListEgressProxyConfigurationsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListEgressProxyConfigurationsRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ListEgressProxyConfigurationsRequest setSkip(Integer skip) {
        this.skip = skip;
        return this;
    }
    public Integer getSkip() {
        return this.skip;
    }

    public ListEgressProxyConfigurationsRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListEgressProxyConfigurationsRequest setTag(java.util.List<ListEgressProxyConfigurationsRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<ListEgressProxyConfigurationsRequestTag> getTag() {
        return this.tag;
    }

    public static class ListEgressProxyConfigurationsRequestTag extends TeaModel {
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

        public static ListEgressProxyConfigurationsRequestTag build(java.util.Map<String, ?> map) throws Exception {
            ListEgressProxyConfigurationsRequestTag self = new ListEgressProxyConfigurationsRequestTag();
            return TeaModel.build(map, self);
        }

        public ListEgressProxyConfigurationsRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListEgressProxyConfigurationsRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
