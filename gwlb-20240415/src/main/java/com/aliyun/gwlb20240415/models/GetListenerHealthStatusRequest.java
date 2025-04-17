// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gwlb20240415.models;

import com.aliyun.tea.*;

public class GetListenerHealthStatusRequest extends TeaModel {
    /**
     * <p>The filter conditions. You can specify at most 20 filter conditions.</p>
     */
    @NameInMap("Filter")
    public java.util.List<GetListenerHealthStatusRequestFilter> filter;

    /**
     * <p>The listener ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>lsn-7sixpvm5fc3v0b****</p>
     */
    @NameInMap("ListenerId")
    public String listenerId;

    /**
     * <p>The number of entries per page. Valid values: 1 to 1000. Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. Valid values:</p>
     * <ul>
     * <li>If <strong>NextToken</strong> is empty, no next page exists.</li>
     * <li>If a value of <strong>NextToken</strong> is returned, the value indicates the token that is used for the next query.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>4f1d7cc9f51e18904e8a063603a6b0c3d03bc69f78734254e0b5e8707e68****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The number of entries to be skipped in the call.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Skip")
    public Integer skip;

    public static GetListenerHealthStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        GetListenerHealthStatusRequest self = new GetListenerHealthStatusRequest();
        return TeaModel.build(map, self);
    }

    public GetListenerHealthStatusRequest setFilter(java.util.List<GetListenerHealthStatusRequestFilter> filter) {
        this.filter = filter;
        return this;
    }
    public java.util.List<GetListenerHealthStatusRequestFilter> getFilter() {
        return this.filter;
    }

    public GetListenerHealthStatusRequest setListenerId(String listenerId) {
        this.listenerId = listenerId;
        return this;
    }
    public String getListenerId() {
        return this.listenerId;
    }

    public GetListenerHealthStatusRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public GetListenerHealthStatusRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public GetListenerHealthStatusRequest setSkip(Integer skip) {
        this.skip = skip;
        return this;
    }
    public Integer getSkip() {
        return this.skip;
    }

    public static class GetListenerHealthStatusRequestFilter extends TeaModel {
        /**
         * <p>The filter condition name. You can filter by one or more filter condition names. The URL must meet the following requirements:</p>
         * <ul>
         * <li><strong>Status</strong>: the health status.</li>
         * <li><strong>ReasonCode</strong>: the cause of an unhealthy server.</li>
         * <li><strong>ServerId</strong>: the ID of the backend server.</li>
         * <li><strong>ServerIp</strong>: the IP address of the backend server.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Status</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The filter condition values. You can specify at most 20 condition values.</p>
         */
        @NameInMap("Values")
        public java.util.List<String> values;

        public static GetListenerHealthStatusRequestFilter build(java.util.Map<String, ?> map) throws Exception {
            GetListenerHealthStatusRequestFilter self = new GetListenerHealthStatusRequestFilter();
            return TeaModel.build(map, self);
        }

        public GetListenerHealthStatusRequestFilter setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetListenerHealthStatusRequestFilter setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

}
