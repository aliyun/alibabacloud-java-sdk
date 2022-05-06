// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.educloud20220202.models;

import com.aliyun.tea.*;

public class ListLabTokensResponseBody extends TeaModel {
    @NameInMap("Code")
    public Long code;

    @NameInMap("Data")
    public ListLabTokensResponseBodyData data;

    @NameInMap("Message")
    public String message;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListLabTokensResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListLabTokensResponseBody self = new ListLabTokensResponseBody();
        return TeaModel.build(map, self);
    }

    public ListLabTokensResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public ListLabTokensResponseBody setData(ListLabTokensResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListLabTokensResponseBodyData getData() {
        return this.data;
    }

    public ListLabTokensResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListLabTokensResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListLabTokensResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListLabTokensResponseBodyDataList extends TeaModel {
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("FinishStatus")
        public Long finishStatus;

        @NameInMap("LabId")
        public String labId;

        @NameInMap("OrderId")
        public String orderId;

        @NameInMap("ResourceActualReleaseTime")
        public String resourceActualReleaseTime;

        @NameInMap("ResourcePlanedReleaseTime")
        public String resourcePlanedReleaseTime;

        @NameInMap("ResourceStatus")
        public Long resourceStatus;

        @NameInMap("Url")
        public String url;

        public static ListLabTokensResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            ListLabTokensResponseBodyDataList self = new ListLabTokensResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public ListLabTokensResponseBodyDataList setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListLabTokensResponseBodyDataList setFinishStatus(Long finishStatus) {
            this.finishStatus = finishStatus;
            return this;
        }
        public Long getFinishStatus() {
            return this.finishStatus;
        }

        public ListLabTokensResponseBodyDataList setLabId(String labId) {
            this.labId = labId;
            return this;
        }
        public String getLabId() {
            return this.labId;
        }

        public ListLabTokensResponseBodyDataList setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        public String getOrderId() {
            return this.orderId;
        }

        public ListLabTokensResponseBodyDataList setResourceActualReleaseTime(String resourceActualReleaseTime) {
            this.resourceActualReleaseTime = resourceActualReleaseTime;
            return this;
        }
        public String getResourceActualReleaseTime() {
            return this.resourceActualReleaseTime;
        }

        public ListLabTokensResponseBodyDataList setResourcePlanedReleaseTime(String resourcePlanedReleaseTime) {
            this.resourcePlanedReleaseTime = resourcePlanedReleaseTime;
            return this;
        }
        public String getResourcePlanedReleaseTime() {
            return this.resourcePlanedReleaseTime;
        }

        public ListLabTokensResponseBodyDataList setResourceStatus(Long resourceStatus) {
            this.resourceStatus = resourceStatus;
            return this;
        }
        public Long getResourceStatus() {
            return this.resourceStatus;
        }

        public ListLabTokensResponseBodyDataList setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class ListLabTokensResponseBodyData extends TeaModel {
        @NameInMap("List")
        public java.util.List<ListLabTokensResponseBodyDataList> list;

        @NameInMap("Page")
        public Long page;

        @NameInMap("PageSize")
        public Long pageSize;

        @NameInMap("Total")
        public Long total;

        public static ListLabTokensResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListLabTokensResponseBodyData self = new ListLabTokensResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListLabTokensResponseBodyData setList(java.util.List<ListLabTokensResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<ListLabTokensResponseBodyDataList> getList() {
            return this.list;
        }

        public ListLabTokensResponseBodyData setPage(Long page) {
            this.page = page;
            return this;
        }
        public Long getPage() {
            return this.page;
        }

        public ListLabTokensResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public ListLabTokensResponseBodyData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
