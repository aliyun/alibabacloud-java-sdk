// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class ListProjectMetaColumnsResponseBody extends TeaModel {
    @NameInMap("Code")
    public Long code;

    @NameInMap("Data")
    public java.util.List<ListProjectMetaColumnsResponseBodyData> data;

    @NameInMap("HttpStatusCode")
    public Long httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListProjectMetaColumnsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListProjectMetaColumnsResponseBody self = new ListProjectMetaColumnsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListProjectMetaColumnsResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public ListProjectMetaColumnsResponseBody setData(java.util.List<ListProjectMetaColumnsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListProjectMetaColumnsResponseBodyData> getData() {
        return this.data;
    }

    public ListProjectMetaColumnsResponseBody setHttpStatusCode(Long httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Long getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListProjectMetaColumnsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListProjectMetaColumnsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListProjectMetaColumnsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListProjectMetaColumnsResponseBodyData extends TeaModel {
        @NameInMap("Col")
        public String col;

        @NameInMap("Comment")
        public String comment;

        @NameInMap("DataType")
        public String dataType;

        @NameInMap("Id")
        public Long id;

        @NameInMap("IsPrimaryKey")
        public Integer isPrimaryKey;

        @NameInMap("IsPt")
        public Integer isPt;

        @NameInMap("Sn")
        public Integer sn;

        @NameInMap("SqlType")
        public Integer sqlType;

        public static ListProjectMetaColumnsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListProjectMetaColumnsResponseBodyData self = new ListProjectMetaColumnsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListProjectMetaColumnsResponseBodyData setCol(String col) {
            this.col = col;
            return this;
        }
        public String getCol() {
            return this.col;
        }

        public ListProjectMetaColumnsResponseBodyData setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public ListProjectMetaColumnsResponseBodyData setDataType(String dataType) {
            this.dataType = dataType;
            return this;
        }
        public String getDataType() {
            return this.dataType;
        }

        public ListProjectMetaColumnsResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListProjectMetaColumnsResponseBodyData setIsPrimaryKey(Integer isPrimaryKey) {
            this.isPrimaryKey = isPrimaryKey;
            return this;
        }
        public Integer getIsPrimaryKey() {
            return this.isPrimaryKey;
        }

        public ListProjectMetaColumnsResponseBodyData setIsPt(Integer isPt) {
            this.isPt = isPt;
            return this;
        }
        public Integer getIsPt() {
            return this.isPt;
        }

        public ListProjectMetaColumnsResponseBodyData setSn(Integer sn) {
            this.sn = sn;
            return this;
        }
        public Integer getSn() {
            return this.sn;
        }

        public ListProjectMetaColumnsResponseBodyData setSqlType(Integer sqlType) {
            this.sqlType = sqlType;
            return this;
        }
        public Integer getSqlType() {
            return this.sqlType;
        }

    }

}
