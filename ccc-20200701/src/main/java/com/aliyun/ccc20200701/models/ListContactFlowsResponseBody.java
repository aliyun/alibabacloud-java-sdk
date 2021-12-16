// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListContactFlowsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ListContactFlowsResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static ListContactFlowsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListContactFlowsResponseBody self = new ListContactFlowsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListContactFlowsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListContactFlowsResponseBody setData(ListContactFlowsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListContactFlowsResponseBodyData getData() {
        return this.data;
    }

    public ListContactFlowsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListContactFlowsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListContactFlowsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListContactFlowsResponseBodyDataList extends TeaModel {
        @NameInMap("ContactFlowId")
        public String contactFlowId;

        @NameInMap("CreatedTime")
        public String createdTime;

        @NameInMap("Definition")
        public String definition;

        @NameInMap("Description")
        public String description;

        @NameInMap("DraftId")
        public String draftId;

        @NameInMap("Editor")
        public String editor;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Name")
        public String name;

        @NameInMap("NumberList")
        public java.util.List<String> numberList;

        @NameInMap("Published")
        public Boolean published;

        @NameInMap("Type")
        public String type;

        @NameInMap("UpdatedTime")
        public String updatedTime;

        public static ListContactFlowsResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            ListContactFlowsResponseBodyDataList self = new ListContactFlowsResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public ListContactFlowsResponseBodyDataList setContactFlowId(String contactFlowId) {
            this.contactFlowId = contactFlowId;
            return this;
        }
        public String getContactFlowId() {
            return this.contactFlowId;
        }

        public ListContactFlowsResponseBodyDataList setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public ListContactFlowsResponseBodyDataList setDefinition(String definition) {
            this.definition = definition;
            return this;
        }
        public String getDefinition() {
            return this.definition;
        }

        public ListContactFlowsResponseBodyDataList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListContactFlowsResponseBodyDataList setDraftId(String draftId) {
            this.draftId = draftId;
            return this;
        }
        public String getDraftId() {
            return this.draftId;
        }

        public ListContactFlowsResponseBodyDataList setEditor(String editor) {
            this.editor = editor;
            return this;
        }
        public String getEditor() {
            return this.editor;
        }

        public ListContactFlowsResponseBodyDataList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListContactFlowsResponseBodyDataList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListContactFlowsResponseBodyDataList setNumberList(java.util.List<String> numberList) {
            this.numberList = numberList;
            return this;
        }
        public java.util.List<String> getNumberList() {
            return this.numberList;
        }

        public ListContactFlowsResponseBodyDataList setPublished(Boolean published) {
            this.published = published;
            return this;
        }
        public Boolean getPublished() {
            return this.published;
        }

        public ListContactFlowsResponseBodyDataList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListContactFlowsResponseBodyDataList setUpdatedTime(String updatedTime) {
            this.updatedTime = updatedTime;
            return this;
        }
        public String getUpdatedTime() {
            return this.updatedTime;
        }

    }

    public static class ListContactFlowsResponseBodyData extends TeaModel {
        @NameInMap("List")
        public java.util.List<ListContactFlowsResponseBodyDataList> list;

        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListContactFlowsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListContactFlowsResponseBodyData self = new ListContactFlowsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListContactFlowsResponseBodyData setList(java.util.List<ListContactFlowsResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<ListContactFlowsResponseBodyDataList> getList() {
            return this.list;
        }

        public ListContactFlowsResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListContactFlowsResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListContactFlowsResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
