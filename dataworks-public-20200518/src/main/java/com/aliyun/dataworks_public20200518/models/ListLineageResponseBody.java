// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListLineageResponseBody extends TeaModel {
    /**
     * <p>The structure returned.</p>
     */
    @NameInMap("Data")
    public ListLineageResponseBodyData data;

    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>1010040007</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>qualifiedName should be in format as entity-table.entity-guid</p>
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
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>64B-587A-8CED-969E1973887FXXX-TT</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        /**
         * <p>The data channel. Valid values:</p>
         * <ul>
         * <li><strong>FIRST_PARTY: DataWorks platform</strong></li>
         * <li><strong>THIRD_PARTY: user registration</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>THIRD_PARTY</p>
         */
        @NameInMap("Channel")
        public String channel;

        /**
         * <p>The data source.</p>
         * 
         * <strong>example:</strong>
         * <p>mysql</p>
         */
        @NameInMap("Datasource")
        public String datasource;

        /**
         * <p>The unique relationship ID.</p>
         * 
         * <strong>example:</strong>
         * <p>aaabbccddguid</p>
         */
        @NameInMap("Guid")
        public String guid;

        /**
         * <p>The task type, which is used to describe the relationship between entities, such as SQL-based calculation, mapping based on report fields, or API operation definition.</p>
         * 
         * <strong>example:</strong>
         * <p>sql</p>
         */
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
        /**
         * <p>The time when the lineage was generated.</p>
         * 
         * <strong>example:</strong>
         * <p>1686215809269</p>
         */
        @NameInMap("CreateTimestamp")
        public Long createTimestamp;

        /**
         * <p>The information about the entity.</p>
         */
        @NameInMap("Entity")
        public Entity entity;

        /**
         * <p>The array of the relationship structure.</p>
         */
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
        /**
         * <p>The array of the entity structure.</p>
         */
        @NameInMap("DataEntityList")
        public java.util.List<ListLineageResponseBodyDataDataEntityList> dataEntityList;

        /**
         * <p>A pagination token. It can be used in the next request to retrieve a new page of results.</p>
         * 
         * <strong>example:</strong>
         * <p>nextTokenFromRequest-xxxsd-ff</p>
         */
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
