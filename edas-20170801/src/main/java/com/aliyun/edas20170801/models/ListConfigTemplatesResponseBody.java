// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ListConfigTemplatesResponseBody extends TeaModel {
    // 响应码
    @NameInMap("Code")
    public Integer code;

    // 查询结果
    @NameInMap("Data")
    public ListConfigTemplatesResponseBodyData data;

    // 响应码文本描述
    @NameInMap("Message")
    public String message;

    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    public static ListConfigTemplatesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListConfigTemplatesResponseBody self = new ListConfigTemplatesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListConfigTemplatesResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListConfigTemplatesResponseBody setData(ListConfigTemplatesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListConfigTemplatesResponseBodyData getData() {
        return this.data;
    }

    public ListConfigTemplatesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListConfigTemplatesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListConfigTemplatesResponseBodyDataResult extends TeaModel {
        // 模板内容
        @NameInMap("Content")
        public String content;

        // 模板描述
        @NameInMap("Description")
        public String description;

        // 模板数据格式
        @NameInMap("Format")
        public String format;

        // 创建时间
        @NameInMap("GmtCreate")
        public Long gmtCreate;

        // 更新时间
        @NameInMap("GmtModified")
        public Long gmtModified;

        // 配置模板ID
        @NameInMap("Id")
        public String id;

        // 配置模板名称
        @NameInMap("Name")
        public String name;

        public static ListConfigTemplatesResponseBodyDataResult build(java.util.Map<String, ?> map) throws Exception {
            ListConfigTemplatesResponseBodyDataResult self = new ListConfigTemplatesResponseBodyDataResult();
            return TeaModel.build(map, self);
        }

        public ListConfigTemplatesResponseBodyDataResult setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public ListConfigTemplatesResponseBodyDataResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListConfigTemplatesResponseBodyDataResult setFormat(String format) {
            this.format = format;
            return this;
        }
        public String getFormat() {
            return this.format;
        }

        public ListConfigTemplatesResponseBodyDataResult setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public ListConfigTemplatesResponseBodyDataResult setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public ListConfigTemplatesResponseBodyDataResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListConfigTemplatesResponseBodyDataResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ListConfigTemplatesResponseBodyData extends TeaModel {
        // 当前分页
        @NameInMap("CurrentPage")
        public Integer currentPage;

        // 页大小
        @NameInMap("PageSize")
        public Integer pageSize;

        // 配置模板列表
        @NameInMap("Result")
        public java.util.List<ListConfigTemplatesResponseBodyDataResult> result;

        // 配置模板总数
        @NameInMap("TotalSize")
        public Long totalSize;

        public static ListConfigTemplatesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListConfigTemplatesResponseBodyData self = new ListConfigTemplatesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListConfigTemplatesResponseBodyData setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public ListConfigTemplatesResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListConfigTemplatesResponseBodyData setResult(java.util.List<ListConfigTemplatesResponseBodyDataResult> result) {
            this.result = result;
            return this;
        }
        public java.util.List<ListConfigTemplatesResponseBodyDataResult> getResult() {
            return this.result;
        }

        public ListConfigTemplatesResponseBodyData setTotalSize(Long totalSize) {
            this.totalSize = totalSize;
            return this;
        }
        public Long getTotalSize() {
            return this.totalSize;
        }

    }

}
