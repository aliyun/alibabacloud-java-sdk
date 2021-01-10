// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class ListTriggersResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TriggerList")
    public ListTriggersResponseBodyTriggerList triggerList;

    public static ListTriggersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTriggersResponseBody self = new ListTriggersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTriggersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTriggersResponseBody setTriggerList(ListTriggersResponseBodyTriggerList triggerList) {
        this.triggerList = triggerList;
        return this;
    }
    public ListTriggersResponseBodyTriggerList getTriggerList() {
        return this.triggerList;
    }

    public static class ListTriggersResponseBodyTriggerListPagination extends TeaModel {
        @NameInMap("PageIndex")
        public Integer pageIndex;

        @NameInMap("TotalPageCount")
        public Integer totalPageCount;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListTriggersResponseBodyTriggerListPagination build(java.util.Map<String, ?> map) throws Exception {
            ListTriggersResponseBodyTriggerListPagination self = new ListTriggersResponseBodyTriggerListPagination();
            return TeaModel.build(map, self);
        }

        public ListTriggersResponseBodyTriggerListPagination setPageIndex(Integer pageIndex) {
            this.pageIndex = pageIndex;
            return this;
        }
        public Integer getPageIndex() {
            return this.pageIndex;
        }

        public ListTriggersResponseBodyTriggerListPagination setTotalPageCount(Integer totalPageCount) {
            this.totalPageCount = totalPageCount;
            return this;
        }
        public Integer getTotalPageCount() {
            return this.totalPageCount;
        }

        public ListTriggersResponseBodyTriggerListPagination setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListTriggersResponseBodyTriggerListPagination setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

    public static class ListTriggersResponseBodyTriggerListTriggersFunctions extends TeaModel {
        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("FileName")
        public String fileName;

        @NameInMap("Name")
        public String name;

        @NameInMap("GmtModified")
        public Long gmtModified;

        @NameInMap("Id")
        public Long id;

        @NameInMap("FileId")
        public Long fileId;

        public static ListTriggersResponseBodyTriggerListTriggersFunctions build(java.util.Map<String, ?> map) throws Exception {
            ListTriggersResponseBodyTriggerListTriggersFunctions self = new ListTriggersResponseBodyTriggerListTriggersFunctions();
            return TeaModel.build(map, self);
        }

        public ListTriggersResponseBodyTriggerListTriggersFunctions setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public ListTriggersResponseBodyTriggerListTriggersFunctions setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public ListTriggersResponseBodyTriggerListTriggersFunctions setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListTriggersResponseBodyTriggerListTriggersFunctions setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public ListTriggersResponseBodyTriggerListTriggersFunctions setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListTriggersResponseBodyTriggerListTriggersFunctions setFileId(Long fileId) {
            this.fileId = fileId;
            return this;
        }
        public Long getFileId() {
            return this.fileId;
        }

    }

    public static class ListTriggersResponseBodyTriggerListTriggers extends TeaModel {
        @NameInMap("Status")
        public Integer status;

        @NameInMap("Type")
        public Integer type;

        @NameInMap("Production")
        public Integer production;

        @NameInMap("Functions")
        public java.util.List<ListTriggersResponseBodyTriggerListTriggersFunctions> functions;

        @NameInMap("Sandbox")
        public Integer sandbox;

        @NameInMap("Namespace")
        public String namespace;

        @NameInMap("GmtModified")
        public Long gmtModified;

        @NameInMap("Source")
        public String source;

        @NameInMap("ChainedFunctionIds")
        public String chainedFunctionIds;

        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("InvocationMode")
        public Integer invocationMode;

        @NameInMap("Id")
        public Long id;

        public static ListTriggersResponseBodyTriggerListTriggers build(java.util.Map<String, ?> map) throws Exception {
            ListTriggersResponseBodyTriggerListTriggers self = new ListTriggersResponseBodyTriggerListTriggers();
            return TeaModel.build(map, self);
        }

        public ListTriggersResponseBodyTriggerListTriggers setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListTriggersResponseBodyTriggerListTriggers setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

        public ListTriggersResponseBodyTriggerListTriggers setProduction(Integer production) {
            this.production = production;
            return this;
        }
        public Integer getProduction() {
            return this.production;
        }

        public ListTriggersResponseBodyTriggerListTriggers setFunctions(java.util.List<ListTriggersResponseBodyTriggerListTriggersFunctions> functions) {
            this.functions = functions;
            return this;
        }
        public java.util.List<ListTriggersResponseBodyTriggerListTriggersFunctions> getFunctions() {
            return this.functions;
        }

        public ListTriggersResponseBodyTriggerListTriggers setSandbox(Integer sandbox) {
            this.sandbox = sandbox;
            return this;
        }
        public Integer getSandbox() {
            return this.sandbox;
        }

        public ListTriggersResponseBodyTriggerListTriggers setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public ListTriggersResponseBodyTriggerListTriggers setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public ListTriggersResponseBodyTriggerListTriggers setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public ListTriggersResponseBodyTriggerListTriggers setChainedFunctionIds(String chainedFunctionIds) {
            this.chainedFunctionIds = chainedFunctionIds;
            return this;
        }
        public String getChainedFunctionIds() {
            return this.chainedFunctionIds;
        }

        public ListTriggersResponseBodyTriggerListTriggers setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public ListTriggersResponseBodyTriggerListTriggers setInvocationMode(Integer invocationMode) {
            this.invocationMode = invocationMode;
            return this;
        }
        public Integer getInvocationMode() {
            return this.invocationMode;
        }

        public ListTriggersResponseBodyTriggerListTriggers setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

    public static class ListTriggersResponseBodyTriggerList extends TeaModel {
        @NameInMap("Pagination")
        public ListTriggersResponseBodyTriggerListPagination pagination;

        @NameInMap("Triggers")
        public java.util.List<ListTriggersResponseBodyTriggerListTriggers> triggers;

        public static ListTriggersResponseBodyTriggerList build(java.util.Map<String, ?> map) throws Exception {
            ListTriggersResponseBodyTriggerList self = new ListTriggersResponseBodyTriggerList();
            return TeaModel.build(map, self);
        }

        public ListTriggersResponseBodyTriggerList setPagination(ListTriggersResponseBodyTriggerListPagination pagination) {
            this.pagination = pagination;
            return this;
        }
        public ListTriggersResponseBodyTriggerListPagination getPagination() {
            return this.pagination;
        }

        public ListTriggersResponseBodyTriggerList setTriggers(java.util.List<ListTriggersResponseBodyTriggerListTriggers> triggers) {
            this.triggers = triggers;
            return this;
        }
        public java.util.List<ListTriggersResponseBodyTriggerListTriggers> getTriggers() {
            return this.triggers;
        }

    }

}
