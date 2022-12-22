// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListMetaCollectionsResponseBody extends TeaModel {
    @NameInMap("Data")
    public ListMetaCollectionsResponseBodyData data;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListMetaCollectionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMetaCollectionsResponseBody self = new ListMetaCollectionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMetaCollectionsResponseBody setData(ListMetaCollectionsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListMetaCollectionsResponseBodyData getData() {
        return this.data;
    }

    public ListMetaCollectionsResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListMetaCollectionsResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListMetaCollectionsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListMetaCollectionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListMetaCollectionsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListMetaCollectionsResponseBodyData extends TeaModel {
        @NameInMap("CollectionList")
        public java.util.List<Collection> collectionList;

        @NameInMap("NextToken")
        public String nextToken;

        public static ListMetaCollectionsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListMetaCollectionsResponseBodyData self = new ListMetaCollectionsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListMetaCollectionsResponseBodyData setCollectionList(java.util.List<Collection> collectionList) {
            this.collectionList = collectionList;
            return this;
        }
        public java.util.List<Collection> getCollectionList() {
            return this.collectionList;
        }

        public ListMetaCollectionsResponseBodyData setNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }
        public String getNextToken() {
            return this.nextToken;
        }

    }

}
