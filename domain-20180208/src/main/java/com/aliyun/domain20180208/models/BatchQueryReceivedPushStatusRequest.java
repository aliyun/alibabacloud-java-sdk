// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180208.models;

import com.aliyun.tea.*;

public class BatchQueryReceivedPushStatusRequest extends TeaModel {
    /**
     * <p>本次请求最多返回的记录条数</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>标记当前开始读取的位置，置空表示从头开始</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>Push编号列表，最多50个</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;push_20250101_abc123&quot;,&quot;push_20250101_def456&quot;]</p>
     */
    @NameInMap("PushNos")
    public java.util.List<String> pushNos;

    public static BatchQueryReceivedPushStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchQueryReceivedPushStatusRequest self = new BatchQueryReceivedPushStatusRequest();
        return TeaModel.build(map, self);
    }

    public BatchQueryReceivedPushStatusRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public BatchQueryReceivedPushStatusRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public BatchQueryReceivedPushStatusRequest setPushNos(java.util.List<String> pushNos) {
        this.pushNos = pushNos;
        return this;
    }
    public java.util.List<String> getPushNos() {
        return this.pushNos;
    }

}
