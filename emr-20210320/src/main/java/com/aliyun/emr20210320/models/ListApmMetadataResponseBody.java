// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class ListApmMetadataResponseBody extends TeaModel {
    /**
     * <p>本次请求所返回的最大记录条数。</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("Metadata")
    public java.util.List<Metadata> metadata;

    /**
     * <p>返回读取到的数据位置，空代表数据已经读取完毕。</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>请求ID。</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>本次请求条件下的数据总量。</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListApmMetadataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListApmMetadataResponseBody self = new ListApmMetadataResponseBody();
        return TeaModel.build(map, self);
    }

    public ListApmMetadataResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListApmMetadataResponseBody setMetadata(java.util.List<Metadata> metadata) {
        this.metadata = metadata;
        return this;
    }
    public java.util.List<Metadata> getMetadata() {
        return this.metadata;
    }

    public ListApmMetadataResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListApmMetadataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListApmMetadataResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class Metadata extends TeaModel {
        /**
         * <p>元数据值。</p>
         */
        @NameInMap("Value")
        public String value;

        public static Metadata build(java.util.Map<String, ?> map) throws Exception {
            Metadata self = new Metadata();
            return TeaModel.build(map, self);
        }

        public Metadata setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
