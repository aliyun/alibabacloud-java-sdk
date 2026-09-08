// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListContactFlowsResponseBody extends TeaModel {
    /**
     * <p>The response code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public ListContactFlowsResponseBodyData data;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>无</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
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
         * <p>The ID of the IVR contact flow.</p>
         * 
         * <strong>example:</strong>
         * <p>78128960-bb00-4ddc-8e82-923a8c5bd22d</p>
         */
        @NameInMap("ContactFlowId")
        public String contactFlowId;

        /**
         * <p>When the contact flow was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-03-05 17:35:45.0</p>
         */
        @NameInMap("CreatedTime")
        public String createdTime;

        /**
         * <p>The JSON-formatted definition of the IVR contact flow. This parameter is for internal use and is parsed by the backend.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;activities&quot;:[{&quot;type&quot;:&quot;INCOMING_CALL&quot;,&quot;id&quot;:&quot;e98f0d47&quot;,&quot;name&quot;:&quot;开始&quot;,&quot;properties&quot;:{&quot;position&quot;:{&quot;x&quot;:263,&quot;y&quot;:164}},&quot;events&quot;:[{&quot;event&quot;:&quot;complete&quot;,&quot;next&quot;:&quot;2d3ad2c2&quot;,&quot;edgeId&quot;:&quot;41f7dbd0&quot;}],&quot;nodeIndex&quot;:0},{&quot;type&quot;:&quot;HANGUP&quot;,&quot;id&quot;:&quot;bd4f37e2&quot;,&quot;name&quot;:&quot;挂机&quot;,&quot;properties&quot;:{&quot;position&quot;:{&quot;x&quot;:765,&quot;y&quot;:185}},&quot;events&quot;:[{&quot;event&quot;:&quot;complete&quot;,&quot;next&quot;:null}],&quot;nodeIndex&quot;:999},{&quot;type&quot;:&quot;PLAY_SAY&quot;,&quot;id&quot;:&quot;2d3ad2c2&quot;,&quot;name&quot;:&quot;放音&quot;,&quot;properties&quot;:{&quot;say&quot;:&quot;您好，欢迎来到云联络中心。&quot;,&quot;audioResourceId&quot;:&quot;&quot;,&quot;position&quot;:{&quot;x&quot;:485.5,&quot;y&quot;:153.5},&quot;audioType&quot;:&quot;tts&quot;,&quot;audioInterrupt&quot;:false},&quot;events&quot;:[{&quot;event&quot;:&quot;complete&quot;,&quot;next&quot;:&quot;bd4f37e2&quot;,&quot;edgeId&quot;:&quot;e1af4f1f&quot;}],&quot;nodeIndex&quot;:1}],&quot;description&quot;:&quot;&quot;}</p>
         */
        @NameInMap("Definition")
        public String definition;

        /**
         * <p>The description of the contact flow version.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The draft ID. This parameter is returned only when the contact flow is unpublished.</p>
         * 
         * <strong>example:</strong>
         * <p>db07c0bb-6b1f-47d2-b37e-2451c617562d</p>
         */
        @NameInMap("DraftId")
        public String draftId;

        /**
         * <p>The login name of the agent currently editing this draft.</p>
         * 
         * <strong>example:</strong>
         * <p>ccc-test</p>
         */
        @NameInMap("Editor")
        public String editor;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ccc-test</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The name of the IVR contact flow.</p>
         * 
         * <strong>example:</strong>
         * <p>默认流程</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>A list of phone numbers that are bound to the IVR contact flow.</p>
         */
        @NameInMap("NumberList")
        public java.util.List<String> numberList;

        /**
         * <p>Indicates whether the contact flow has been published.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Published")
        public Boolean published;

        /**
         * <p>The type of the IVR contact flow.</p>
         * 
         * <strong>example:</strong>
         * <p>MAIN_FLOW</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The last time the contact flow was updated.</p>
         * 
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
        /**
         * <p>A list of contact flows.</p>
         */
        @NameInMap("List")
        public java.util.List<ListContactFlowsResponseBodyDataList> list;

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of entries.</p>
         * 
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
