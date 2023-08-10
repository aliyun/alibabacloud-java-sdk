// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListEntitiesByTagsResponseBody extends TeaModel {
    @NameInMap("Data")
    public ListEntitiesByTagsResponseBodyData data;

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

    public static ListEntitiesByTagsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListEntitiesByTagsResponseBody self = new ListEntitiesByTagsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListEntitiesByTagsResponseBody setData(ListEntitiesByTagsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListEntitiesByTagsResponseBodyData getData() {
        return this.data;
    }

    public ListEntitiesByTagsResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListEntitiesByTagsResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListEntitiesByTagsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListEntitiesByTagsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListEntitiesByTagsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListEntitiesByTagsResponseBodyData extends TeaModel {
        @NameInMap("EntityList")
        public java.util.List<Entity> entityList;

        @NameInMap("NextToken")
        public String nextToken;

        public static ListEntitiesByTagsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListEntitiesByTagsResponseBodyData self = new ListEntitiesByTagsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListEntitiesByTagsResponseBodyData setEntityList(java.util.List<Entity> entityList) {
            this.entityList = entityList;
            return this;
        }
        public java.util.List<Entity> getEntityList() {
            return this.entityList;
        }

        public ListEntitiesByTagsResponseBodyData setNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }
        public String getNextToken() {
            return this.nextToken;
        }

    }

}
