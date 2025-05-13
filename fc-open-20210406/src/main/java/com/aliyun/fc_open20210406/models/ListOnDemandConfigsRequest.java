// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class ListOnDemandConfigsRequest extends TeaModel {
    /**
     * <p>The maximum number of results to return. If this parameter is not set, 20 is returned by default, and the maximum value cannot exceed 100. The number of returned configurations is less than or equal to the specified number.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("limit")
    public Integer limit;

    /**
     * <p>The token required to obtain more results. If the number of layers exceeds the limit, the nextToken parameter is returned. You can include the parameter in subsequent calls to obtain more results. You do not need to provide this parameter in the first call.</p>
     * 
     * <strong>example:</strong>
     * <p>8bj81uI8n****</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The prefix that names of returned resources must contain. For example, if you set prefix to a, the names of returned resources must start with a.</p>
     * 
     * <strong>example:</strong>
     * <p>prefix_text</p>
     */
    @NameInMap("prefix")
    public String prefix;

    /**
     * <p>The position from which the list begins. Results are sorted in alphabetical order and those results following startKey (inclusive) are listed.</p>
     * 
     * <strong>example:</strong>
     * <p>nextservice</p>
     */
    @NameInMap("startKey")
    public String startKey;

    public static ListOnDemandConfigsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListOnDemandConfigsRequest self = new ListOnDemandConfigsRequest();
        return TeaModel.build(map, self);
    }

    public ListOnDemandConfigsRequest setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }
    public Integer getLimit() {
        return this.limit;
    }

    public ListOnDemandConfigsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListOnDemandConfigsRequest setPrefix(String prefix) {
        this.prefix = prefix;
        return this;
    }
    public String getPrefix() {
        return this.prefix;
    }

    public ListOnDemandConfigsRequest setStartKey(String startKey) {
        this.startKey = startKey;
        return this;
    }
    public String getStartKey() {
        return this.startKey;
    }

}
