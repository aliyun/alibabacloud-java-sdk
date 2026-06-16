// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListCloudAccountsRequest extends TeaModel {
    /**
     * <p>The filter conditions.</p>
     */
    @NameInMap("Filter")
    public java.util.List<ListCloudAccountsRequestFilter> filter;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The maximum number of records to return on each page.</p>
     * <ul>
     * <li><p>The default value is 20.</p>
     * </li>
     * <li><p>The maximum value is 100.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token that specifies the start of the next page.</p>
     * <ul>
     * <li>If you leave this parameter empty, the query starts from the first page.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>NTxxxxxexample</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    public static ListCloudAccountsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCloudAccountsRequest self = new ListCloudAccountsRequest();
        return TeaModel.build(map, self);
    }

    public ListCloudAccountsRequest setFilter(java.util.List<ListCloudAccountsRequestFilter> filter) {
        this.filter = filter;
        return this;
    }
    public java.util.List<ListCloudAccountsRequestFilter> getFilter() {
        return this.filter;
    }

    public ListCloudAccountsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListCloudAccountsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListCloudAccountsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public static class ListCloudAccountsRequestFilter extends TeaModel {
        /**
         * <p>The name of the filter field. Valid values:</p>
         * <ul>
         * <li><p>CloudAccountId: The ID of the Alibaba Cloud account.</p>
         * </li>
         * <li><p>CloudAccountExternalId: The external unique ID of the Alibaba Cloud account.</p>
         * </li>
         * <li><p>CloudAccountVendorType: The type of the Alibaba Cloud account.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CloudAccountId</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>A list of values for the filter field.</p>
         */
        @NameInMap("Value")
        public java.util.List<String> value;

        public static ListCloudAccountsRequestFilter build(java.util.Map<String, ?> map) throws Exception {
            ListCloudAccountsRequestFilter self = new ListCloudAccountsRequestFilter();
            return TeaModel.build(map, self);
        }

        public ListCloudAccountsRequestFilter setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListCloudAccountsRequestFilter setValue(java.util.List<String> value) {
            this.value = value;
            return this;
        }
        public java.util.List<String> getValue() {
            return this.value;
        }

    }

}
