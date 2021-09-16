// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class ListProblemDetailOperationsResponseBody extends TeaModel {
    // requestId
    @NameInMap("requestId")
    public String requestId;

    // 总数
    @NameInMap("totalCount")
    public Integer totalCount;

    // 页
    @NameInMap("pageNumber")
    public Integer pageNumber;

    // 行
    @NameInMap("pageSize")
    public Integer pageSize;

    // data
    @NameInMap("data")
    public java.util.List<ListProblemDetailOperationsResponseBodyData> data;

    public static ListProblemDetailOperationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListProblemDetailOperationsResponseBody self = new ListProblemDetailOperationsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListProblemDetailOperationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListProblemDetailOperationsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListProblemDetailOperationsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListProblemDetailOperationsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListProblemDetailOperationsResponseBody setData(java.util.List<ListProblemDetailOperationsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListProblemDetailOperationsResponseBodyData> getData() {
        return this.data;
    }

    public static class ListProblemDetailOperationsResponseBodyData extends TeaModel {
        // 动态标题
        @NameInMap("title")
        public String title;

        // 描述
        @NameInMap("description")
        public String description;

        // 服务
        @NameInMap("relatedServiceName")
        public String relatedServiceName;

        // 创建时间
        @NameInMap("createTime")
        public String createTime;

        // 备注
        @NameInMap("remark")
        public String remark;

        // 升级 PROBLEM_UPGRADE 撤销 PROBLEM_REVOKE 恢复 PROBLEM_RESTORE 复盘 PROBLEM_IN_REVIEW 完结 PROBLEM_REOPENED 取消 PROBLEM_CANCEL 更新故障通告 PROBLEM_UPDATE_NOTIFY 添加故障小计 PROBLEM_ADD_SUBTOTAL 更新故障 PROBLEM_UPDATE
        @NameInMap("action")
        public String action;

        public static ListProblemDetailOperationsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListProblemDetailOperationsResponseBodyData self = new ListProblemDetailOperationsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListProblemDetailOperationsResponseBodyData setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public ListProblemDetailOperationsResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListProblemDetailOperationsResponseBodyData setRelatedServiceName(String relatedServiceName) {
            this.relatedServiceName = relatedServiceName;
            return this;
        }
        public String getRelatedServiceName() {
            return this.relatedServiceName;
        }

        public ListProblemDetailOperationsResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListProblemDetailOperationsResponseBodyData setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public ListProblemDetailOperationsResponseBodyData setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

    }

}
