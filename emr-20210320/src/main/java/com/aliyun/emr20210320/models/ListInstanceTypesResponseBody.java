// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class ListInstanceTypesResponseBody extends TeaModel {
    /**
     * <p>The instance types.</p>
     */
    @NameInMap("InstanceTypes")
    public java.util.List<InstanceType> instanceTypes;

    /**
     * <p>本次请求所返回的最大记录条数。</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>返回读取到的数据位置，空代表数据已经读取完毕。</p>
     * 
     * <strong>example:</strong>
     * <p>DD6B1B2A-5837-5237-ABE4-FF0C89568980</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>请求ID。</p>
     * 
     * <strong>example:</strong>
     * <p>DD6B1B2A-5837-5237-ABE4-FF0C8944****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>本次请求条件下的数据总量。</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListInstanceTypesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListInstanceTypesResponseBody self = new ListInstanceTypesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListInstanceTypesResponseBody setInstanceTypes(java.util.List<InstanceType> instanceTypes) {
        this.instanceTypes = instanceTypes;
        return this;
    }
    public java.util.List<InstanceType> getInstanceTypes() {
        return this.instanceTypes;
    }

    public ListInstanceTypesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListInstanceTypesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListInstanceTypesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListInstanceTypesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

}
