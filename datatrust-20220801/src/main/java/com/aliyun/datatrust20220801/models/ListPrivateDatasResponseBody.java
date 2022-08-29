// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class ListPrivateDatasResponseBody extends TeaModel {
    @NameInMap("Code")
    public Long code;

    @NameInMap("Data")
    public ListPrivateDatasResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Long httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListPrivateDatasResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPrivateDatasResponseBody self = new ListPrivateDatasResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPrivateDatasResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public ListPrivateDatasResponseBody setData(ListPrivateDatasResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListPrivateDatasResponseBodyData getData() {
        return this.data;
    }

    public ListPrivateDatasResponseBody setHttpStatusCode(Long httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Long getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListPrivateDatasResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListPrivateDatasResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListPrivateDatasResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListPrivateDatasResponseBodyDataContent extends TeaModel {
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

        public static ListPrivateDatasResponseBodyDataContent build(java.util.Map<String, ?> map) throws Exception {
            ListPrivateDatasResponseBodyDataContent self = new ListPrivateDatasResponseBodyDataContent();
            return TeaModel.build(map, self);
        }

        public ListPrivateDatasResponseBodyDataContent setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public ListPrivateDatasResponseBodyDataContent setDataSetId(String dataSetId) {
            this.dataSetId = dataSetId;
            return this;
        }
        public String getDataSetId() {
            return this.dataSetId;
        }

        public ListPrivateDatasResponseBodyDataContent setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListPrivateDatasResponseBodyDataContent setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListPrivateDatasResponseBodyDataContent setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListPrivateDatasResponseBodyDataContent setMetaStatus(Integer metaStatus) {
            this.metaStatus = metaStatus;
            return this;
        }
        public Integer getMetaStatus() {
            return this.metaStatus;
        }

        public ListPrivateDatasResponseBodyDataContent setOwnerId(Long ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public Long getOwnerId() {
            return this.ownerId;
        }

        public ListPrivateDatasResponseBodyDataContent setOwnerName(String ownerName) {
            this.ownerName = ownerName;
            return this;
        }
        public String getOwnerName() {
            return this.ownerName;
        }

        public ListPrivateDatasResponseBodyDataContent setPrj(String prj) {
            this.prj = prj;
            return this;
        }
        public String getPrj() {
            return this.prj;
        }

        public ListPrivateDatasResponseBodyDataContent setSrcType(Integer srcType) {
            this.srcType = srcType;
            return this;
        }
        public Integer getSrcType() {
            return this.srcType;
        }

        public ListPrivateDatasResponseBodyDataContent setTab(String tab) {
            this.tab = tab;
            return this;
        }
        public String getTab() {
            return this.tab;
        }

        public ListPrivateDatasResponseBodyDataContent setTableAlias(String tableAlias) {
            this.tableAlias = tableAlias;
            return this;
        }
        public String getTableAlias() {
            return this.tableAlias;
        }

        public ListPrivateDatasResponseBodyDataContent setTableId(Long tableId) {
            this.tableId = tableId;
            return this;
        }
        public Long getTableId() {
            return this.tableId;
        }

    }

    public static class ListPrivateDatasResponseBodyData extends TeaModel {
        @NameInMap("Content")
        public java.util.List<ListPrivateDatasResponseBodyDataContent> content;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListPrivateDatasResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListPrivateDatasResponseBodyData self = new ListPrivateDatasResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListPrivateDatasResponseBodyData setContent(java.util.List<ListPrivateDatasResponseBodyDataContent> content) {
            this.content = content;
            return this;
        }
        public java.util.List<ListPrivateDatasResponseBodyDataContent> getContent() {
            return this.content;
        }

        public ListPrivateDatasResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListPrivateDatasResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
