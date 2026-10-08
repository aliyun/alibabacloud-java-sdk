// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetSourceTableMetaResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetSourceTableMetaResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>internal error</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>82E78D6B-AA8F-1FEF-8AA3-5C9DA2A79140</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetSourceTableMetaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSourceTableMetaResponseBody self = new GetSourceTableMetaResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSourceTableMetaResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetSourceTableMetaResponseBody setData(GetSourceTableMetaResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetSourceTableMetaResponseBodyData getData() {
        return this.data;
    }

    public GetSourceTableMetaResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetSourceTableMetaResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetSourceTableMetaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSourceTableMetaResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetSourceTableMetaResponseBodyDataColumns extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>unique id</p>
         */
        @NameInMap("Comment")
        public String comment;

        /**
         * <strong>example:</strong>
         * <p>bigint</p>
         */
        @NameInMap("DataType")
        public String dataType;

        /**
         * <strong>example:</strong>
         * <p>id</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Pk")
        public Boolean pk;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Pt")
        public Boolean pt;

        /**
         * <strong>example:</strong>
         * <p>bigint</p>
         */
        @NameInMap("RawDataType")
        public String rawDataType;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SeqNumber")
        public Integer seqNumber;

        public static GetSourceTableMetaResponseBodyDataColumns build(java.util.Map<String, ?> map) throws Exception {
            GetSourceTableMetaResponseBodyDataColumns self = new GetSourceTableMetaResponseBodyDataColumns();
            return TeaModel.build(map, self);
        }

        public GetSourceTableMetaResponseBodyDataColumns setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public GetSourceTableMetaResponseBodyDataColumns setDataType(String dataType) {
            this.dataType = dataType;
            return this;
        }
        public String getDataType() {
            return this.dataType;
        }

        public GetSourceTableMetaResponseBodyDataColumns setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetSourceTableMetaResponseBodyDataColumns setPk(Boolean pk) {
            this.pk = pk;
            return this;
        }
        public Boolean getPk() {
            return this.pk;
        }

        public GetSourceTableMetaResponseBodyDataColumns setPt(Boolean pt) {
            this.pt = pt;
            return this;
        }
        public Boolean getPt() {
            return this.pt;
        }

        public GetSourceTableMetaResponseBodyDataColumns setRawDataType(String rawDataType) {
            this.rawDataType = rawDataType;
            return this;
        }
        public String getRawDataType() {
            return this.rawDataType;
        }

        public GetSourceTableMetaResponseBodyDataColumns setSeqNumber(Integer seqNumber) {
            this.seqNumber = seqNumber;
            return this;
        }
        public Integer getSeqNumber() {
            return this.seqNumber;
        }

    }

    public static class GetSourceTableMetaResponseBodyData extends TeaModel {
        @NameInMap("Columns")
        public java.util.List<GetSourceTableMetaResponseBodyDataColumns> columns;

        /**
         * <strong>example:</strong>
         * <p>300001410.default.sample</p>
         */
        @NameInMap("Guid")
        public String guid;

        /**
         * <strong>example:</strong>
         * <p>sample</p>
         */
        @NameInMap("TableComment")
        public String tableComment;

        /**
         * <strong>example:</strong>
         * <p>sample</p>
         */
        @NameInMap("TableName")
        public String tableName;

        public static GetSourceTableMetaResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetSourceTableMetaResponseBodyData self = new GetSourceTableMetaResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetSourceTableMetaResponseBodyData setColumns(java.util.List<GetSourceTableMetaResponseBodyDataColumns> columns) {
            this.columns = columns;
            return this;
        }
        public java.util.List<GetSourceTableMetaResponseBodyDataColumns> getColumns() {
            return this.columns;
        }

        public GetSourceTableMetaResponseBodyData setGuid(String guid) {
            this.guid = guid;
            return this;
        }
        public String getGuid() {
            return this.guid;
        }

        public GetSourceTableMetaResponseBodyData setTableComment(String tableComment) {
            this.tableComment = tableComment;
            return this;
        }
        public String getTableComment() {
            return this.tableComment;
        }

        public GetSourceTableMetaResponseBodyData setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

    }

}
