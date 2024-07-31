// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListMetaCollectionEntitiesResponseBody extends TeaModel {
    /**
     * <p>The response parameters.</p>
     */
    @NameInMap("Data")
    public ListMetaCollectionEntitiesResponseBodyData data;

    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>Invalid.Collection.NotExists</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>The specified parameters are invalid.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The request ID. You can locate logs and troubleshoot issues based on the ID.</p>
     * 
     * <strong>example:</strong>
     * <p>E25887B7-579C-54A5-9C4F-83A0DE367DD</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <p>true: The request was successful.</p>
     * <p>false: The request failed.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        /**
         * <p>The entities.</p>
         */
        @NameInMap("EntityList")
        public java.util.List<Entity> entityList;

        /**
         * <p>A pagination token. It can be used in the next request to retrieve a new page of results.</p>
         * 
         * <strong>example:</strong>
         * <p>123344</p>
         */
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
