// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class ListMyAgenticNotificationChannelConfigsRequest extends TeaModel {
    /**
     * <p>The notification channel type used to filter results. If you do not specify this parameter, all personal notification channels are returned. Currently, only FEISHU (Lark) is supported. Specifying other values results in a parameter error.</p>
     * 
     * <strong>example:</strong>
     * <p>FEISHU</p>
     */
    @NameInMap("Channel")
    public String channel;

    /**
     * <p>The maximum number of records to return per page. Valid values: 1 to 100. Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The paging token for the paged query. Do not specify this parameter for the first query. To query the next page, specify the NextToken value returned in the previous response.</p>
     * 
     * <strong>example:</strong>
     * <p>MjA</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    public static ListMyAgenticNotificationChannelConfigsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMyAgenticNotificationChannelConfigsRequest self = new ListMyAgenticNotificationChannelConfigsRequest();
        return TeaModel.build(map, self);
    }

    public ListMyAgenticNotificationChannelConfigsRequest setChannel(String channel) {
        this.channel = channel;
        return this;
    }
    public String getChannel() {
        return this.channel;
    }

    public ListMyAgenticNotificationChannelConfigsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListMyAgenticNotificationChannelConfigsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

}
