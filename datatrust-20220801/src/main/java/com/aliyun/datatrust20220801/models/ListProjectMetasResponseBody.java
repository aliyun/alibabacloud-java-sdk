// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class ListProjectMetasResponseBody extends TeaModel {
    @NameInMap("Code")
    public Long code;

    @NameInMap("Data")
    public ListProjectMetasResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Long httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListProjectMetasResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListProjectMetasResponseBody self = new ListProjectMetasResponseBody();
        return TeaModel.build(map, self);
    }

    public ListProjectMetasResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public ListProjectMetasResponseBody setData(ListProjectMetasResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListProjectMetasResponseBodyData getData() {
        return this.data;
    }

    public ListProjectMetasResponseBody setHttpStatusCode(Long httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Long getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListProjectMetasResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListProjectMetasResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListProjectMetasResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListProjectMetasResponseBodyDataContent extends TeaModel {
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

        public static ListProjectMetasResponseBodyDataContent build(java.util.Map<String, ?> map) throws Exception {
            ListProjectMetasResponseBodyDataContent self = new ListProjectMetasResponseBodyDataContent();
            return TeaModel.build(map, self);
        }

        public ListProjectMetasResponseBodyDataContent setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public ListProjectMetasResponseBodyDataContent setDataSetId(String dataSetId) {
            this.dataSetId = dataSetId;
            return this;
        }
        public String getDataSetId() {
            return this.dataSetId;
        }

        public ListProjectMetasResponseBodyDataContent setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListProjectMetasResponseBodyDataContent setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListProjectMetasResponseBodyDataContent setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListProjectMetasResponseBodyDataContent setMetaStatus(Integer metaStatus) {
            this.metaStatus = metaStatus;
            return this;
        }
        public Integer getMetaStatus() {
            return this.metaStatus;
        }

        public ListProjectMetasResponseBodyDataContent setOwnerId(Long ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public Long getOwnerId() {
            return this.ownerId;
        }

        public ListProjectMetasResponseBodyDataContent setOwnerName(String ownerName) {
            this.ownerName = ownerName;
            return this;
        }
        public String getOwnerName() {
            return this.ownerName;
        }

        public ListProjectMetasResponseBodyDataContent setPrj(String prj) {
            this.prj = prj;
            return this;
        }
        public String getPrj() {
            return this.prj;
        }

        public ListProjectMetasResponseBodyDataContent setSrcType(Integer srcType) {
            this.srcType = srcType;
            return this;
        }
        public Integer getSrcType() {
            return this.srcType;
        }

        public ListProjectMetasResponseBodyDataContent setTab(String tab) {
            this.tab = tab;
            return this;
        }
        public String getTab() {
            return this.tab;
        }

        public ListProjectMetasResponseBodyDataContent setTableAlias(String tableAlias) {
            this.tableAlias = tableAlias;
            return this;
        }
        public String getTableAlias() {
            return this.tableAlias;
        }

        public ListProjectMetasResponseBodyDataContent setTableId(Long tableId) {
            this.tableId = tableId;
            return this;
        }
        public Long getTableId() {
            return this.tableId;
        }

    }

    public static class ListProjectMetasResponseBodyData extends TeaModel {
        @NameInMap("Content")
        public java.util.List<ListProjectMetasResponseBodyDataContent> content;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListProjectMetasResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListProjectMetasResponseBodyData self = new ListProjectMetasResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListProjectMetasResponseBodyData setContent(java.util.List<ListProjectMetasResponseBodyDataContent> content) {
            this.content = content;
            return this;
        }
        public java.util.List<ListProjectMetasResponseBodyDataContent> getContent() {
            return this.content;
        }

        public ListProjectMetasResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListProjectMetasResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
