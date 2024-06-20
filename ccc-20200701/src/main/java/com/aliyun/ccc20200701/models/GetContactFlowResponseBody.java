// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class GetContactFlowResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetContactFlowResponseBodyData data;

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
     * <p>2263B273-AC1B-44EB-BA98-87F2322C6780</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetContactFlowResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetContactFlowResponseBody self = new GetContactFlowResponseBody();
        return TeaModel.build(map, self);
    }

    public GetContactFlowResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetContactFlowResponseBody setData(GetContactFlowResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetContactFlowResponseBodyData getData() {
        return this.data;
    }

    public GetContactFlowResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetContactFlowResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetContactFlowResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetContactFlowResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>274601be-a6d5-4429-bcef-32b51d031c6e</p>
         */
        @NameInMap("ContactFlowId")
        public String contactFlowId;

        /**
         * <strong>example:</strong>
         * <p>2021-07-14 10:48:43.0</p>
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
         * <p>566399d7-5558-447c-a72f-9be2768b6a82</p>
         */
        @NameInMap("DraftId")
        public String draftId;

        /**
         * <strong>example:</strong>
         * <p>editor-xxx</p>
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

        /**
         * <strong>example:</strong>
         * <p>False</p>
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
         * <p>2021-07-14 10:48:43.0</p>
         */
        @NameInMap("UpdatedTime")
        public String updatedTime;

        public static GetContactFlowResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetContactFlowResponseBodyData self = new GetContactFlowResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetContactFlowResponseBodyData setContactFlowId(String contactFlowId) {
            this.contactFlowId = contactFlowId;
            return this;
        }
        public String getContactFlowId() {
            return this.contactFlowId;
        }

        public GetContactFlowResponseBodyData setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public GetContactFlowResponseBodyData setDefinition(String definition) {
            this.definition = definition;
            return this;
        }
        public String getDefinition() {
            return this.definition;
        }

        public GetContactFlowResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetContactFlowResponseBodyData setDraftId(String draftId) {
            this.draftId = draftId;
            return this;
        }
        public String getDraftId() {
            return this.draftId;
        }

        public GetContactFlowResponseBodyData setEditor(String editor) {
            this.editor = editor;
            return this;
        }
        public String getEditor() {
            return this.editor;
        }

        public GetContactFlowResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetContactFlowResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetContactFlowResponseBodyData setPublished(Boolean published) {
            this.published = published;
            return this;
        }
        public Boolean getPublished() {
            return this.published;
        }

        public GetContactFlowResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetContactFlowResponseBodyData setUpdatedTime(String updatedTime) {
            this.updatedTime = updatedTime;
            return this;
        }
        public String getUpdatedTime() {
            return this.updatedTime;
        }

    }

}
