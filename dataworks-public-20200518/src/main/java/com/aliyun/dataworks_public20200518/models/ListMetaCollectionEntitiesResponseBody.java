// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListMetaCollectionEntitiesResponseBody extends TeaModel {
    @NameInMap("Data")
    public ListMetaCollectionEntitiesResponseBodyData data;

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

    public static ListMetaCollectionEntitiesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMetaCollectionEntitiesResponseBody self = new ListMetaCollectionEntitiesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMetaCollectionEntitiesResponseBody setData(ListMetaCollectionEntitiesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListMetaCollectionEntitiesResponseBodyData getData() {
        return this.data;
    }

    public ListMetaCollectionEntitiesResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListMetaCollectionEntitiesResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListMetaCollectionEntitiesResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListMetaCollectionEntitiesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListMetaCollectionEntitiesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListMetaCollectionEntitiesResponseBodyData extends TeaModel {
        @NameInMap("EntityList")
        public java.util.List<Entity> entityList;

        @NameInMap("NextToken")
        public String nextToken;

        public static ListMetaCollectionEntitiesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListMetaCollectionEntitiesResponseBodyData self = new ListMetaCollectionEntitiesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListMetaCollectionEntitiesResponseBodyData setEntityList(java.util.List<Entity> entityList) {
            this.entityList = entityList;
            return this;
        }
        public java.util.List<Entity> getEntityList() {
            return this.entityList;
        }

        public ListMetaCollectionEntitiesResponseBodyData setNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }
        public String getNextToken() {
            return this.nextToken;
        }

    }

}
