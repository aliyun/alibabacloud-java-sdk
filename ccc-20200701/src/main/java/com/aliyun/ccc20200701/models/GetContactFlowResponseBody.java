// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class GetContactFlowResponseBody extends TeaModel {
    /**
     * <p>The response code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The response data.</p>
     */
    @NameInMap("Data")
    public GetContactFlowResponseBodyData data;

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
         * <p>The contact flow ID.</p>
         * 
         * <strong>example:</strong>
         * <p>274601be-a6d5-4429-bcef-32b51d031c6e</p>
         */
        @NameInMap("ContactFlowId")
        public String contactFlowId;

        /**
         * <p>The time when the contact flow draft was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-07-14 10:48:43.0</p>
         */
        @NameInMap("CreatedTime")
        public String createdTime;

        /**
         * <p>IVR content.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;activities&quot;:[{&quot;type&quot;:&quot;INCOMING_CALL&quot;,&quot;id&quot;:&quot;e98f0d47&quot;,&quot;name&quot;:&quot;开始&quot;,&quot;properties&quot;:{&quot;position&quot;:{&quot;x&quot;:263,&quot;y&quot;:164}},&quot;events&quot;:[{&quot;event&quot;:&quot;complete&quot;,&quot;next&quot;:&quot;2d3ad2c2&quot;,&quot;edgeId&quot;:&quot;41f7dbd0&quot;}],&quot;nodeIndex&quot;:0},{&quot;type&quot;:&quot;HANGUP&quot;,&quot;id&quot;:&quot;bd4f37e2&quot;,&quot;name&quot;:&quot;挂机&quot;,&quot;properties&quot;:{&quot;position&quot;:{&quot;x&quot;:765,&quot;y&quot;:185}},&quot;events&quot;:[{&quot;event&quot;:&quot;complete&quot;,&quot;next&quot;:null}],&quot;nodeIndex&quot;:999},{&quot;type&quot;:&quot;PLAY_SAY&quot;,&quot;id&quot;:&quot;2d3ad2c2&quot;,&quot;name&quot;:&quot;放音&quot;,&quot;properties&quot;:{&quot;say&quot;:&quot;您好，欢迎来到云联络中心。&quot;,&quot;audioResourceId&quot;:&quot;&quot;,&quot;position&quot;:{&quot;x&quot;:485.5,&quot;y&quot;:153.5},&quot;audioType&quot;:&quot;tts&quot;,&quot;audioInterrupt&quot;:false},&quot;events&quot;:[{&quot;event&quot;:&quot;complete&quot;,&quot;next&quot;:&quot;bd4f37e2&quot;,&quot;edgeId&quot;:&quot;e1af4f1f&quot;}],&quot;nodeIndex&quot;:1}],&quot;description&quot;:&quot;&quot;}</p>
         */
        @NameInMap("Definition")
        public String definition;

        /**
         * <p>The version description.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The draft ID. This is the ID of the editable draft version for the current contact flow.</p>
         * 
         * <strong>example:</strong>
         * <p>566399d7-5558-447c-a72f-9be2768b6a82</p>
         */
        @NameInMap("DraftId")
        public String draftId;

        /**
         * <p>The agent login name of the current editor of this draft.</p>
         * 
         * <strong>example:</strong>
         * <p>editor-xxx</p>
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
         * <p>The IVR name.</p>
         * 
         * <strong>example:</strong>
         * <p>欢迎语</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Indicates whether the contact flow is published.
         * True: Published
         * False: Not published</p>
         * 
         * <strong>example:</strong>
         * <p>False</p>
         */
        @NameInMap("Published")
        public Boolean published;

        /**
         * <p>The flow type:<br>
         * MAIN_FLOW (main flow)<br>
         * SUB_FLOW (child flow)<br>
         * SURVEY_FLOW (survey flow)<br><br><br></p>
         * 
         * <strong>example:</strong>
         * <p>MAIN_FLOW</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The time when the contact flow was last updated.</p>
         * 
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
