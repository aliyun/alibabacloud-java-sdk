// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListContactFlowsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ListContactFlowsResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>EEEE671A-3E24-4A04-81E6-6C4F5B39DF75</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>78128960-bb00-4ddc-8e82-923a8c5bd22d</p>
         */
        @NameInMap("ContactFlowId")
        public String contactFlowId;

        /**
         * <strong>example:</strong>
         * <p>2021-03-05 17:35:45.0</p>
         */
        @NameInMap("CreatedTime")
        public String createdTime;

        @NameInMap("Definition")
        public String definition;

        /**
         * <strong>example:</strong>
         * <p>1.0</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>db07c0bb-6b1f-47d2-b37e-2451c617562d</p>
         */
        @NameInMap("DraftId")
        public String draftId;

        /**
         * <strong>example:</strong>
         * <p>ccc-test</p>
         */
        @NameInMap("Editor")
        public String editor;

        /**
         * <strong>example:</strong>
         * <p>ccc-test</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Name")
        public String name;

        @NameInMap("NumberList")
        public java.util.List<String> numberList;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Published")
        public Boolean published;

        /**
         * <strong>example:</strong>
         * <p>MAIN_FLOW</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <strong>example:</strong>
         * <p>2021-03-08 15:34:49.0</p>
         */
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

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
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
