// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class ListProjectTablesResponseBody extends TeaModel {
    @NameInMap("Code")
    public Long code;

    @NameInMap("Data")
    public java.util.List<ListProjectTablesResponseBodyData> data;

    @NameInMap("HttpStatusCode")
    public Long httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListProjectTablesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListProjectTablesResponseBody self = new ListProjectTablesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListProjectTablesResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public ListProjectTablesResponseBody setData(java.util.List<ListProjectTablesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListProjectTablesResponseBodyData> getData() {
        return this.data;
    }

    public ListProjectTablesResponseBody setHttpStatusCode(Long httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Long getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListProjectTablesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListProjectTablesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListProjectTablesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListProjectTablesResponseBodyData extends TeaModel {
        @NameInMap("Comment")
        public String comment;

        @NameInMap("DataSetId")
        public String dataSetId;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("Id")
        public Long id;

        @NameInMap("MetaStatus")
        public Integer metaStatus;

        @NameInMap("OwnerId")
        public Long ownerId;

        @NameInMap("OwnerName")
        public String ownerName;

        @NameInMap("Prj")
        public String prj;

        @NameInMap("SrcType")
        public Integer srcType;

        @NameInMap("Tab")
        public String tab;

        @NameInMap("TableAlias")
        public String tableAlias;

        @NameInMap("TableId")
        public Long tableId;

        public static ListProjectTablesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListProjectTablesResponseBodyData self = new ListProjectTablesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListProjectTablesResponseBodyData setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public ListProjectTablesResponseBodyData setDataSetId(String dataSetId) {
            this.dataSetId = dataSetId;
            return this;
        }
        public String getDataSetId() {
            return this.dataSetId;
        }

        public ListProjectTablesResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListProjectTablesResponseBodyData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListProjectTablesResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListProjectTablesResponseBodyData setMetaStatus(Integer metaStatus) {
            this.metaStatus = metaStatus;
            return this;
        }
        public Integer getMetaStatus() {
            return this.metaStatus;
        }

        public ListProjectTablesResponseBodyData setOwnerId(Long ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public Long getOwnerId() {
            return this.ownerId;
        }

        public ListProjectTablesResponseBodyData setOwnerName(String ownerName) {
            this.ownerName = ownerName;
            return this;
        }
        public String getOwnerName() {
            return this.ownerName;
        }

        public ListProjectTablesResponseBodyData setPrj(String prj) {
            this.prj = prj;
            return this;
        }
        public String getPrj() {
            return this.prj;
        }

        public ListProjectTablesResponseBodyData setSrcType(Integer srcType) {
            this.srcType = srcType;
            return this;
        }
        public Integer getSrcType() {
            return this.srcType;
        }

        public ListProjectTablesResponseBodyData setTab(String tab) {
            this.tab = tab;
            return this;
        }
        public String getTab() {
            return this.tab;
        }

        public ListProjectTablesResponseBodyData setTableAlias(String tableAlias) {
            this.tableAlias = tableAlias;
            return this;
        }
        public String getTableAlias() {
            return this.tableAlias;
        }

        public ListProjectTablesResponseBodyData setTableId(Long tableId) {
            this.tableId = tableId;
            return this;
        }
        public Long getTableId() {
            return this.tableId;
        }

    }

}
