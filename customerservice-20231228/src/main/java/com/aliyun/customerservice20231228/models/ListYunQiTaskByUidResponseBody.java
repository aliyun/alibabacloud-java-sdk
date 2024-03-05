// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.customerservice20231228.models;

import com.aliyun.tea.*;

public class ListYunQiTaskByUidResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public ListYunQiTaskByUidResponseBodyData data;

    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("message")
    public String message;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public Boolean success;

    public static ListYunQiTaskByUidResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListYunQiTaskByUidResponseBody self = new ListYunQiTaskByUidResponseBody();
        return TeaModel.build(map, self);
    }

    public ListYunQiTaskByUidResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListYunQiTaskByUidResponseBody setData(ListYunQiTaskByUidResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListYunQiTaskByUidResponseBodyData getData() {
        return this.data;
    }

    public ListYunQiTaskByUidResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListYunQiTaskByUidResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListYunQiTaskByUidResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListYunQiTaskByUidResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListYunQiTaskByUidResponseBodyDataList extends TeaModel {
        @NameInMap("chatId")
        public String chatId;

        @NameInMap("createTime")
        public Long createTime;

        @NameInMap("creatorName")
        public String creatorName;

        @NameInMap("endTime")
        public Long endTime;

        @NameInMap("evaluationStar")
        public Integer evaluationStar;

        @NameInMap("important")
        public String important;

        @NameInMap("mainDingDepartmentId")
        public String mainDingDepartmentId;

        @NameInMap("mainDingGroupId")
        public String mainDingGroupId;

        @NameInMap("mainDingGroupName")
        public String mainDingGroupName;

        @NameInMap("productName")
        public String productName;

        @NameInMap("recordId")
        public String recordId;

        @NameInMap("status")
        public String status;

        @NameInMap("subDingDepartmentId")
        public String subDingDepartmentId;

        @NameInMap("subDingGroupId")
        public String subDingGroupId;

        @NameInMap("subDingGroupName")
        public String subDingGroupName;

        @NameInMap("title")
        public String title;

        public static ListYunQiTaskByUidResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            ListYunQiTaskByUidResponseBodyDataList self = new ListYunQiTaskByUidResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public ListYunQiTaskByUidResponseBodyDataList setChatId(String chatId) {
            this.chatId = chatId;
            return this;
        }
        public String getChatId() {
            return this.chatId;
        }

        public ListYunQiTaskByUidResponseBodyDataList setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListYunQiTaskByUidResponseBodyDataList setCreatorName(String creatorName) {
            this.creatorName = creatorName;
            return this;
        }
        public String getCreatorName() {
            return this.creatorName;
        }

        public ListYunQiTaskByUidResponseBodyDataList setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public ListYunQiTaskByUidResponseBodyDataList setEvaluationStar(Integer evaluationStar) {
            this.evaluationStar = evaluationStar;
            return this;
        }
        public Integer getEvaluationStar() {
            return this.evaluationStar;
        }

        public ListYunQiTaskByUidResponseBodyDataList setImportant(String important) {
            this.important = important;
            return this;
        }
        public String getImportant() {
            return this.important;
        }

        public ListYunQiTaskByUidResponseBodyDataList setMainDingDepartmentId(String mainDingDepartmentId) {
            this.mainDingDepartmentId = mainDingDepartmentId;
            return this;
        }
        public String getMainDingDepartmentId() {
            return this.mainDingDepartmentId;
        }

        public ListYunQiTaskByUidResponseBodyDataList setMainDingGroupId(String mainDingGroupId) {
            this.mainDingGroupId = mainDingGroupId;
            return this;
        }
        public String getMainDingGroupId() {
            return this.mainDingGroupId;
        }

        public ListYunQiTaskByUidResponseBodyDataList setMainDingGroupName(String mainDingGroupName) {
            this.mainDingGroupName = mainDingGroupName;
            return this;
        }
        public String getMainDingGroupName() {
            return this.mainDingGroupName;
        }

        public ListYunQiTaskByUidResponseBodyDataList setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

        public ListYunQiTaskByUidResponseBodyDataList setRecordId(String recordId) {
            this.recordId = recordId;
            return this;
        }
        public String getRecordId() {
            return this.recordId;
        }

        public ListYunQiTaskByUidResponseBodyDataList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListYunQiTaskByUidResponseBodyDataList setSubDingDepartmentId(String subDingDepartmentId) {
            this.subDingDepartmentId = subDingDepartmentId;
            return this;
        }
        public String getSubDingDepartmentId() {
            return this.subDingDepartmentId;
        }

        public ListYunQiTaskByUidResponseBodyDataList setSubDingGroupId(String subDingGroupId) {
            this.subDingGroupId = subDingGroupId;
            return this;
        }
        public String getSubDingGroupId() {
            return this.subDingGroupId;
        }

        public ListYunQiTaskByUidResponseBodyDataList setSubDingGroupName(String subDingGroupName) {
            this.subDingGroupName = subDingGroupName;
            return this;
        }
        public String getSubDingGroupName() {
            return this.subDingGroupName;
        }

        public ListYunQiTaskByUidResponseBodyDataList setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class ListYunQiTaskByUidResponseBodyData extends TeaModel {
        @NameInMap("extend")
        public Object extend;

        @NameInMap("list")
        public java.util.List<ListYunQiTaskByUidResponseBodyDataList> list;

        @NameInMap("pageNum")
        public Integer pageNum;

        @NameInMap("pageSize")
        public Integer pageSize;

        @NameInMap("total")
        public Integer total;

        public static ListYunQiTaskByUidResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListYunQiTaskByUidResponseBodyData self = new ListYunQiTaskByUidResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListYunQiTaskByUidResponseBodyData setExtend(Object extend) {
            this.extend = extend;
            return this;
        }
        public Object getExtend() {
            return this.extend;
        }

        public ListYunQiTaskByUidResponseBodyData setList(java.util.List<ListYunQiTaskByUidResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<ListYunQiTaskByUidResponseBodyDataList> getList() {
            return this.list;
        }

        public ListYunQiTaskByUidResponseBodyData setPageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Integer getPageNum() {
            return this.pageNum;
        }

        public ListYunQiTaskByUidResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListYunQiTaskByUidResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
