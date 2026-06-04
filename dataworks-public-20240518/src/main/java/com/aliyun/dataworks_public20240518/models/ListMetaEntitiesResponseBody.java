// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListMetaEntitiesResponseBody extends TeaModel {
    @NameInMap("PagingInfo")
    public ListMetaEntitiesResponseBodyPagingInfo pagingInfo;

    /**
     * <p>RequestId</p>
     * 
     * <strong>example:</strong>
     * <p>ADFASDFASDFA-ADFASDF-ASDFADSDF-AFFADS</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListMetaEntitiesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMetaEntitiesResponseBody self = new ListMetaEntitiesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMetaEntitiesResponseBody setPagingInfo(ListMetaEntitiesResponseBodyPagingInfo pagingInfo) {
        this.pagingInfo = pagingInfo;
        return this;
    }
    public ListMetaEntitiesResponseBodyPagingInfo getPagingInfo() {
        return this.pagingInfo;
    }

    public ListMetaEntitiesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListMetaEntitiesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListMetaEntitiesResponseBodyPagingInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("MaxResults")
        public Integer maxResults;

        @NameInMap("MetaEntities")
        public java.util.List<MetaEntity> metaEntities;

        /**
         * <strong>example:</strong>
         * <p>AAAAAdEdsXbwG2ZlbWCzN4wTTg6NmTbhyvglcoMCJsiEdngaTov15YaMyduvjIHYeTOIcEeXqCevM1qffZkwCkUTUYc=</p>
         */
        @NameInMap("NextToken")
        public String nextToken;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("TotalCount")
        public Long totalCount;

        public static ListMetaEntitiesResponseBodyPagingInfo build(java.util.Map<String, ?> map) throws Exception {
            ListMetaEntitiesResponseBodyPagingInfo self = new ListMetaEntitiesResponseBodyPagingInfo();
            return TeaModel.build(map, self);
        }

        public ListMetaEntitiesResponseBodyPagingInfo setMaxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }
        public Integer getMaxResults() {
            return this.maxResults;
        }

        public ListMetaEntitiesResponseBodyPagingInfo setMetaEntities(java.util.List<MetaEntity> metaEntities) {
            this.metaEntities = metaEntities;
            return this;
        }
        public java.util.List<MetaEntity> getMetaEntities() {
            return this.metaEntities;
        }

        public ListMetaEntitiesResponseBodyPagingInfo setNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }
        public String getNextToken() {
            return this.nextToken;
        }

        public ListMetaEntitiesResponseBodyPagingInfo setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
