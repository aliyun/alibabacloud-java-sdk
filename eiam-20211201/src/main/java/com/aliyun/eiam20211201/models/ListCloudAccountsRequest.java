// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListCloudAccountsRequest extends TeaModel {
    @NameInMap("Filter")
    public java.util.List<ListCloudAccountsRequestFilter> filter;

    /**
     * <p>IDaaS EIAM实例的ID。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>分页查询时每页行数。默认值为20，最大值为100。</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>查询凭证（Token），取值为上一次API调用返回的NextToken参数值。</p>
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
         * <strong>example:</strong>
         * <p>CloudAccountId</p>
         */
        @NameInMap("Name")
        public String name;

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
