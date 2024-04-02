// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class GetAuditItemListResponseBody extends TeaModel {
    @NameInMap("CurrentPage")
    public Long currentPage;

    @NameInMap("Items")
    public java.util.List<GetAuditItemListResponseBodyItems> items;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static GetAuditItemListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAuditItemListResponseBody self = new GetAuditItemListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAuditItemListResponseBody setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public GetAuditItemListResponseBody setItems(java.util.List<GetAuditItemListResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<GetAuditItemListResponseBodyItems> getItems() {
        return this.items;
    }

    public GetAuditItemListResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public GetAuditItemListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAuditItemListResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class GetAuditItemListResponseBodyItems extends TeaModel {
        @NameInMap("BizType")
        public String bizType;

        @NameInMap("Content")
        public String content;

        @NameInMap("Create")
        public String create;

        @NameInMap("CustomResult")
        public String customResult;

        @NameInMap("CustomRiskType")
        public String customRiskType;

        @NameInMap("CustomTs")
        public String customTs;

        @NameInMap("DataId")
        public String dataId;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Operator")
        public String operator;

        @NameInMap("RcpResult")
        public String rcpResult;

        @NameInMap("RcpRiskType")
        public String rcpRiskType;

        @NameInMap("RcpTs")
        public String rcpTs;

        @NameInMap("SubUid")
        public String subUid;

        @NameInMap("TaskId")
        public String taskId;

        @NameInMap("Thumbnail")
        public String thumbnail;

        @NameInMap("Type")
        public String type;

        @NameInMap("Uid")
        public String uid;

        @NameInMap("Url")
        public String url;

        public static GetAuditItemListResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            GetAuditItemListResponseBodyItems self = new GetAuditItemListResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public GetAuditItemListResponseBodyItems setBizType(String bizType) {
            this.bizType = bizType;
            return this;
        }
        public String getBizType() {
            return this.bizType;
        }

        public GetAuditItemListResponseBodyItems setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public GetAuditItemListResponseBodyItems setCreate(String create) {
            this.create = create;
            return this;
        }
        public String getCreate() {
            return this.create;
        }

        public GetAuditItemListResponseBodyItems setCustomResult(String customResult) {
            this.customResult = customResult;
            return this;
        }
        public String getCustomResult() {
            return this.customResult;
        }

        public GetAuditItemListResponseBodyItems setCustomRiskType(String customRiskType) {
            this.customRiskType = customRiskType;
            return this;
        }
        public String getCustomRiskType() {
            return this.customRiskType;
        }

        public GetAuditItemListResponseBodyItems setCustomTs(String customTs) {
            this.customTs = customTs;
            return this;
        }
        public String getCustomTs() {
            return this.customTs;
        }

        public GetAuditItemListResponseBodyItems setDataId(String dataId) {
            this.dataId = dataId;
            return this;
        }
        public String getDataId() {
            return this.dataId;
        }

        public GetAuditItemListResponseBodyItems setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetAuditItemListResponseBodyItems setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public GetAuditItemListResponseBodyItems setRcpResult(String rcpResult) {
            this.rcpResult = rcpResult;
            return this;
        }
        public String getRcpResult() {
            return this.rcpResult;
        }

        public GetAuditItemListResponseBodyItems setRcpRiskType(String rcpRiskType) {
            this.rcpRiskType = rcpRiskType;
            return this;
        }
        public String getRcpRiskType() {
            return this.rcpRiskType;
        }

        public GetAuditItemListResponseBodyItems setRcpTs(String rcpTs) {
            this.rcpTs = rcpTs;
            return this;
        }
        public String getRcpTs() {
            return this.rcpTs;
        }

        public GetAuditItemListResponseBodyItems setSubUid(String subUid) {
            this.subUid = subUid;
            return this;
        }
        public String getSubUid() {
            return this.subUid;
        }

        public GetAuditItemListResponseBodyItems setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public GetAuditItemListResponseBodyItems setThumbnail(String thumbnail) {
            this.thumbnail = thumbnail;
            return this;
        }
        public String getThumbnail() {
            return this.thumbnail;
        }

        public GetAuditItemListResponseBodyItems setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetAuditItemListResponseBodyItems setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

        public GetAuditItemListResponseBodyItems setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
