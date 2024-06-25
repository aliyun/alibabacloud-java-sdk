// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class ListEventStreamingsRequest extends TeaModel {
    /**
     * <p>The maximum number of entries to be returned in a call. You can use this parameter and NextToken to implement paging. A maximum of 100 entries can be returned in a call.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Limit")
    public Integer limit;

    /**
     * <p>The name of the event stream that you want to query.</p>
     * 
     * <strong>example:</strong>
     * <p>name</p>
     */
    @NameInMap("NamePrefix")
    public String namePrefix;

    /**
     * <p>If you configure Limit and excess return values exist, this parameter is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ARN of the event target.</p>
     * 
     * <strong>example:</strong>
     * <p>acs:fc:cn-hangzhou:118609547428****:services/fw1.LATEST/functions/log1</p>
     */
    @NameInMap("SinkArn")
    public String sinkArn;

    /**
     * <p>The Alibaba Cloud Resource Name (ARN) of the event source.</p>
     */
    @NameInMap("SourceArn")
    public String sourceArn;

    public static ListEventStreamingsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListEventStreamingsRequest self = new ListEventStreamingsRequest();
        return TeaModel.build(map, self);
    }

    public ListEventStreamingsRequest setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }
    public Integer getLimit() {
        return this.limit;
    }

    public ListEventStreamingsRequest setNamePrefix(String namePrefix) {
        this.namePrefix = namePrefix;
        return this;
    }
    public String getNamePrefix() {
        return this.namePrefix;
    }

    public ListEventStreamingsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListEventStreamingsRequest setSinkArn(String sinkArn) {
        this.sinkArn = sinkArn;
        return this;
    }
    public String getSinkArn() {
        return this.sinkArn;
    }

    public ListEventStreamingsRequest setSourceArn(String sourceArn) {
        this.sourceArn = sourceArn;
        return this;
    }
    public String getSourceArn() {
        return this.sourceArn;
    }

}
