// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListLineageResponseBody extends TeaModel {
    @NameInMap("Data")
    public ListLineageResponseBodyData data;

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

    public static ListLineageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListLineageResponseBody self = new ListLineageResponseBody();
        return TeaModel.build(map, self);
    }

    public ListLineageResponseBody setData(ListLineageResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListLineageResponseBodyData getData() {
        return this.data;
    }

    public ListLineageResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListLineageResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListLineageResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListLineageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListLineageResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListLineageResponseBodyDataDataEntityListRelationList extends TeaModel {
        @NameInMap("Channel")
        public String channel;

        @NameInMap("Datasource")
        public String datasource;

        @NameInMap("Guid")
        public String guid;

        @NameInMap("Type")
        public String type;

        public static ListLineageResponseBodyDataDataEntityListRelationList build(java.util.Map<String, ?> map) throws Exception {
            ListLineageResponseBodyDataDataEntityListRelationList self = new ListLineageResponseBodyDataDataEntityListRelationList();
            return TeaModel.build(map, self);
        }

        public ListLineageResponseBodyDataDataEntityListRelationList setChannel(String channel) {
            this.channel = channel;
            return this;
        }
        public String getChannel() {
            return this.channel;
        }

        public ListLineageResponseBodyDataDataEntityListRelationList setDatasource(String datasource) {
            this.datasource = datasource;
            return this;
        }
        public String getDatasource() {
            return this.datasource;
        }

        public ListLineageResponseBodyDataDataEntityListRelationList setGuid(String guid) {
            this.guid = guid;
            return this;
        }
        public String getGuid() {
            return this.guid;
        }

        public ListLineageResponseBodyDataDataEntityListRelationList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListLineageResponseBodyDataDataEntityList extends TeaModel {
        @NameInMap("CreateTimestamp")
        public Long createTimestamp;

        @NameInMap("Entity")
        public Entity entity;

        @NameInMap("RelationList")
        public java.util.List<ListLineageResponseBodyDataDataEntityListRelationList> relationList;

        public static ListLineageResponseBodyDataDataEntityList build(java.util.Map<String, ?> map) throws Exception {
            ListLineageResponseBodyDataDataEntityList self = new ListLineageResponseBodyDataDataEntityList();
            return TeaModel.build(map, self);
        }

        public ListLineageResponseBodyDataDataEntityList setCreateTimestamp(Long createTimestamp) {
            this.createTimestamp = createTimestamp;
            return this;
        }
        public Long getCreateTimestamp() {
            return this.createTimestamp;
        }

        public ListLineageResponseBodyDataDataEntityList setEntity(Entity entity) {
            this.entity = entity;
            return this;
        }
        public Entity getEntity() {
            return this.entity;
        }

        public ListLineageResponseBodyDataDataEntityList setRelationList(java.util.List<ListLineageResponseBodyDataDataEntityListRelationList> relationList) {
            this.relationList = relationList;
            return this;
        }
        public java.util.List<ListLineageResponseBodyDataDataEntityListRelationList> getRelationList() {
            return this.relationList;
        }

    }

    public static class ListLineageResponseBodyData extends TeaModel {
        @NameInMap("DataEntityList")
        public java.util.List<ListLineageResponseBodyDataDataEntityList> dataEntityList;

        @NameInMap("NextToken")
        public String nextToken;

        public static ListLineageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListLineageResponseBodyData self = new ListLineageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListLineageResponseBodyData setDataEntityList(java.util.List<ListLineageResponseBodyDataDataEntityList> dataEntityList) {
            this.dataEntityList = dataEntityList;
            return this;
        }
        public java.util.List<ListLineageResponseBodyDataDataEntityList> getDataEntityList() {
            return this.dataEntityList;
        }

        public ListLineageResponseBodyData setNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }
        public String getNextToken() {
            return this.nextToken;
        }

    }

}
