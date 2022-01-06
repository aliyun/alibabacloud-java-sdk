// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspace20191128.models;

import com.aliyun.tea.*;

public class ListSopFlowsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    // 返回结果
    @NameInMap("Data")
    public ListSopFlowsResponseBodyData data;

    @NameInMap("Message")
    public String message;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // 是否成功
    @NameInMap("Success")
    public Boolean success;

    public static ListSopFlowsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSopFlowsResponseBody self = new ListSopFlowsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSopFlowsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListSopFlowsResponseBody setData(ListSopFlowsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListSopFlowsResponseBodyData getData() {
        return this.data;
    }

    public ListSopFlowsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListSopFlowsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSopFlowsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListSopFlowsResponseBodyDataDataList extends TeaModel {
        // 类目ID
        @NameInMap("CateId")
        public Long cateId;

        // 类目名称
        @NameInMap("CateName")
        public String cateName;

        // 对应的xflow的ID
        @NameInMap("FlowId")
        public Long flowId;

        // 对应的xflow的场景Code
        @NameInMap("FlowSceneCode")
        public String flowSceneCode;

        // 最后修改时间
        @NameInMap("GmtModified")
        public Long gmtModified;

        // 最后修改时间
        @NameInMap("GmtModifiedStr")
        public String gmtModifiedStr;

        // 最后修改人
        @NameInMap("ModifierName")
        public String modifierName;

        // SOP编码
        @NameInMap("SopCode")
        public String sopCode;

        // SOP名称
        @NameInMap("SopName")
        public String sopName;

        // 状态，如released
        @NameInMap("Status")
        public String status;

        // 状态名称，如已发布
        @NameInMap("StatusDesc")
        public String statusDesc;

        public static ListSopFlowsResponseBodyDataDataList build(java.util.Map<String, ?> map) throws Exception {
            ListSopFlowsResponseBodyDataDataList self = new ListSopFlowsResponseBodyDataDataList();
            return TeaModel.build(map, self);
        }

        public ListSopFlowsResponseBodyDataDataList setCateId(Long cateId) {
            this.cateId = cateId;
            return this;
        }
        public Long getCateId() {
            return this.cateId;
        }

        public ListSopFlowsResponseBodyDataDataList setCateName(String cateName) {
            this.cateName = cateName;
            return this;
        }
        public String getCateName() {
            return this.cateName;
        }

        public ListSopFlowsResponseBodyDataDataList setFlowId(Long flowId) {
            this.flowId = flowId;
            return this;
        }
        public Long getFlowId() {
            return this.flowId;
        }

        public ListSopFlowsResponseBodyDataDataList setFlowSceneCode(String flowSceneCode) {
            this.flowSceneCode = flowSceneCode;
            return this;
        }
        public String getFlowSceneCode() {
            return this.flowSceneCode;
        }

        public ListSopFlowsResponseBodyDataDataList setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public ListSopFlowsResponseBodyDataDataList setGmtModifiedStr(String gmtModifiedStr) {
            this.gmtModifiedStr = gmtModifiedStr;
            return this;
        }
        public String getGmtModifiedStr() {
            return this.gmtModifiedStr;
        }

        public ListSopFlowsResponseBodyDataDataList setModifierName(String modifierName) {
            this.modifierName = modifierName;
            return this;
        }
        public String getModifierName() {
            return this.modifierName;
        }

        public ListSopFlowsResponseBodyDataDataList setSopCode(String sopCode) {
            this.sopCode = sopCode;
            return this;
        }
        public String getSopCode() {
            return this.sopCode;
        }

        public ListSopFlowsResponseBodyDataDataList setSopName(String sopName) {
            this.sopName = sopName;
            return this;
        }
        public String getSopName() {
            return this.sopName;
        }

        public ListSopFlowsResponseBodyDataDataList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListSopFlowsResponseBodyDataDataList setStatusDesc(String statusDesc) {
            this.statusDesc = statusDesc;
            return this;
        }
        public String getStatusDesc() {
            return this.statusDesc;
        }

    }

    public static class ListSopFlowsResponseBodyData extends TeaModel {
        // 当前页码
        @NameInMap("CurrentPage")
        public Integer currentPage;

        // 结果集
        @NameInMap("DataList")
        public java.util.List<ListSopFlowsResponseBodyDataDataList> dataList;

        // 当前页码查询数
        @NameInMap("PageSize")
        public Integer pageSize;

        // 总页数
        @NameInMap("TotalSize")
        public Integer totalSize;

        public static ListSopFlowsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListSopFlowsResponseBodyData self = new ListSopFlowsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListSopFlowsResponseBodyData setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public ListSopFlowsResponseBodyData setDataList(java.util.List<ListSopFlowsResponseBodyDataDataList> dataList) {
            this.dataList = dataList;
            return this;
        }
        public java.util.List<ListSopFlowsResponseBodyDataDataList> getDataList() {
            return this.dataList;
        }

        public ListSopFlowsResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListSopFlowsResponseBodyData setTotalSize(Integer totalSize) {
            this.totalSize = totalSize;
            return this;
        }
        public Integer getTotalSize() {
            return this.totalSize;
        }

    }

}
