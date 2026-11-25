// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListDeviceBelongIdentifiersResponseBody extends TeaModel {
    @NameInMap("Identifiers")
    public java.util.List<ListDeviceBelongIdentifiersResponseBodyIdentifiers> identifiers;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListDeviceBelongIdentifiersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDeviceBelongIdentifiersResponseBody self = new ListDeviceBelongIdentifiersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDeviceBelongIdentifiersResponseBody setIdentifiers(java.util.List<ListDeviceBelongIdentifiersResponseBodyIdentifiers> identifiers) {
        this.identifiers = identifiers;
        return this;
    }
    public java.util.List<ListDeviceBelongIdentifiersResponseBodyIdentifiers> getIdentifiers() {
        return this.identifiers;
    }

    public ListDeviceBelongIdentifiersResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListDeviceBelongIdentifiersResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListDeviceBelongIdentifiersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDeviceBelongIdentifiersResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListDeviceBelongIdentifiersResponseBodyIdentifiers extends TeaModel {
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("IdentifierId")
        public String identifierId;

        @NameInMap("IdentifierType")
        public String identifierType;

        @NameInMap("IdentifierValue")
        public String identifierValue;

        public static ListDeviceBelongIdentifiersResponseBodyIdentifiers build(java.util.Map<String, ?> map) throws Exception {
            ListDeviceBelongIdentifiersResponseBodyIdentifiers self = new ListDeviceBelongIdentifiersResponseBodyIdentifiers();
            return TeaModel.build(map, self);
        }

        public ListDeviceBelongIdentifiersResponseBodyIdentifiers setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListDeviceBelongIdentifiersResponseBodyIdentifiers setIdentifierId(String identifierId) {
            this.identifierId = identifierId;
            return this;
        }
        public String getIdentifierId() {
            return this.identifierId;
        }

        public ListDeviceBelongIdentifiersResponseBodyIdentifiers setIdentifierType(String identifierType) {
            this.identifierType = identifierType;
            return this;
        }
        public String getIdentifierType() {
            return this.identifierType;
        }

        public ListDeviceBelongIdentifiersResponseBodyIdentifiers setIdentifierValue(String identifierValue) {
            this.identifierValue = identifierValue;
            return this;
        }
        public String getIdentifierValue() {
            return this.identifierValue;
        }

    }

}
