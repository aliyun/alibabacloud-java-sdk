// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class GetMatchedResourcesResponseBody extends TeaModel {
    /**
     * <p>请求接口返回的数据。</p>
     * 
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("Data")
    public Object data;

    /**
     * <p>分页参数：结果集的最大数量，默认值为 20。</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>下一个查询开始 Token，NextToken 为空说明没有下一个。</p>
     * 
     * <strong>example:</strong>
     * <p>1d2db86sca4384811e0b5e8707e68181f</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>本次请求的 ID。</p>
     * 
     * <strong>example:</strong>
     * <p>26F62CED-1E0E-51AA-B8EB-BCD61C5B0C50</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetMatchedResourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMatchedResourcesResponseBody self = new GetMatchedResourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMatchedResourcesResponseBody setData(Object data) {
        this.data = data;
        return this;
    }
    public Object getData() {
        return this.data;
    }

    public GetMatchedResourcesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public GetMatchedResourcesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public GetMatchedResourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
