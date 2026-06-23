// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dianjin20240628.models;

import com.aliyun.tea.*;

public class GetDialogDetailResponseBody extends TeaModel {
    /**
     * <p>Processing time in milliseconds</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("cost")
    public Long cost;

    /**
     * <p>Response data</p>
     */
    @NameInMap("data")
    public GetDialogDetailResponseBodyData data;

    /**
     * <p>Data type</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("dataType")
    public String dataType;

    /**
     * <p>Error code</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("errCode")
    public String errCode;

    /**
     * <p>Error message</p>
     * 
     * <strong>example:</strong>
     * <p>ok</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>Request ID</p>
     * 
     * <strong>example:</strong>
     * <p>5E3FBAF1-17AF-53B7-AF0A-CDCEEB6DE658</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the operation succeeded</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    /**
     * <p>Timestamp</p>
     * 
     * <strong>example:</strong>
     * <p>2024-04-24 11:54:34</p>
     */
    @NameInMap("time")
    public String time;

    public static GetDialogDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDialogDetailResponseBody self = new GetDialogDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDialogDetailResponseBody setCost(Long cost) {
        this.cost = cost;
        return this;
    }
    public Long getCost() {
        return this.cost;
    }

    public GetDialogDetailResponseBody setData(GetDialogDetailResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetDialogDetailResponseBodyData getData() {
        return this.data;
    }

    public GetDialogDetailResponseBody setDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }
    public String getDataType() {
        return this.dataType;
    }

    public GetDialogDetailResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public GetDialogDetailResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetDialogDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDialogDetailResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetDialogDetailResponseBody setTime(String time) {
        this.time = time;
        return this;
    }
    public String getTime() {
        return this.time;
    }

    public static class GetDialogDetailResponseBodyDataDialogueList extends TeaModel {
        /**
         * <p>Dialogue content</p>
         * 
         * <strong>example:</strong>
         * <p>请问具体怎么操作呢？</p>
         */
        @NameInMap("content")
        public String content;

        /**
         * <p>Customer ID</p>
         * 
         * <strong>example:</strong>
         * <p>123761283</p>
         */
        @NameInMap("customerId")
        public String customerId;

        /**
         * <p>Agent ID</p>
         * 
         * <strong>example:</strong>
         * <p>BOT</p>
         */
        @NameInMap("customerServiceId")
        public String customerServiceId;

        /**
         * <p>Agent type:</p>
         * <ul>
         * <li><p>0: Bot</p>
         * </li>
         * <li><p>1: Human</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("customerServiceType")
        public String customerServiceType;

        /**
         * <p>Indicates whether the session ended with this message</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("hangUpDialog")
        public Boolean hangUpDialog;

        /**
         * <p>Unique identifier for this message. Assigned internally. May be empty. Use recordId instead.</p>
         * 
         * <strong>example:</strong>
         * <p>1742869659849</p>
         */
        @NameInMap("id")
        public Long id;

        /**
         * <p>Intent code</p>
         * 
         * <strong>example:</strong>
         * <p>193874634xxx</p>
         */
        @NameInMap("intentCode")
        public String intentCode;

        /**
         * <p>Intent name</p>
         * 
         * <strong>example:</strong>
         * <p>客户询问如何操作</p>
         */
        @NameInMap("intentName")
        public String intentName;

        /**
         * <p>Unique identifier for this message. Assigned internally. String type.</p>
         * 
         * <strong>example:</strong>
         * <p>19387872364736xdhcb</p>
         */
        @NameInMap("recordId")
        public String recordId;

        /**
         * <p>Role:</p>
         * <ul>
         * <li><p>0: Customer</p>
         * </li>
         * <li><p>1: Agent</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("role")
        public String role;

        /**
         * <p>Content type: text, audio, or image. Only text is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>text</p>
         */
        @NameInMap("type")
        public String type;

        public static GetDialogDetailResponseBodyDataDialogueList build(java.util.Map<String, ?> map) throws Exception {
            GetDialogDetailResponseBodyDataDialogueList self = new GetDialogDetailResponseBodyDataDialogueList();
            return TeaModel.build(map, self);
        }

        public GetDialogDetailResponseBodyDataDialogueList setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public GetDialogDetailResponseBodyDataDialogueList setCustomerId(String customerId) {
            this.customerId = customerId;
            return this;
        }
        public String getCustomerId() {
            return this.customerId;
        }

        public GetDialogDetailResponseBodyDataDialogueList setCustomerServiceId(String customerServiceId) {
            this.customerServiceId = customerServiceId;
            return this;
        }
        public String getCustomerServiceId() {
            return this.customerServiceId;
        }

        public GetDialogDetailResponseBodyDataDialogueList setCustomerServiceType(String customerServiceType) {
            this.customerServiceType = customerServiceType;
            return this;
        }
        public String getCustomerServiceType() {
            return this.customerServiceType;
        }

        public GetDialogDetailResponseBodyDataDialogueList setHangUpDialog(Boolean hangUpDialog) {
            this.hangUpDialog = hangUpDialog;
            return this;
        }
        public Boolean getHangUpDialog() {
            return this.hangUpDialog;
        }

        public GetDialogDetailResponseBodyDataDialogueList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetDialogDetailResponseBodyDataDialogueList setIntentCode(String intentCode) {
            this.intentCode = intentCode;
            return this;
        }
        public String getIntentCode() {
            return this.intentCode;
        }

        public GetDialogDetailResponseBodyDataDialogueList setIntentName(String intentName) {
            this.intentName = intentName;
            return this;
        }
        public String getIntentName() {
            return this.intentName;
        }

        public GetDialogDetailResponseBodyDataDialogueList setRecordId(String recordId) {
            this.recordId = recordId;
            return this;
        }
        public String getRecordId() {
            return this.recordId;
        }

        public GetDialogDetailResponseBodyDataDialogueList setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public GetDialogDetailResponseBodyDataDialogueList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetDialogDetailResponseBodyData extends TeaModel {
        /**
         * <p>List of dialogue details</p>
         */
        @NameInMap("dialogueList")
        public java.util.List<GetDialogDetailResponseBodyDataDialogueList> dialogueList;

        /**
         * <p>Session time</p>
         * 
         * <strong>example:</strong>
         * <p>2024-09-27 11:23:20</p>
         */
        @NameInMap("gmtCreate")
        public String gmtCreate;

        /**
         * <p>Session status</p>
         * 
         * <strong>example:</strong>
         * <p>COMPLETED</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>Total conversation rounds. Each round counts one exchange between AI and the customer. Multiple consecutive messages from either side count as one round. If the last message is from the AI and is not a hang-up, subtract one from the total round count.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("totalDialogTurns")
        public Integer totalDialogTurns;

        /**
         * <p>Valid conversation rounds. Each valid round counts one question-and-answer pair between AI and the customer. This differs from the total round count method.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("validDialogTurns")
        public Integer validDialogTurns;

        public static GetDialogDetailResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetDialogDetailResponseBodyData self = new GetDialogDetailResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetDialogDetailResponseBodyData setDialogueList(java.util.List<GetDialogDetailResponseBodyDataDialogueList> dialogueList) {
            this.dialogueList = dialogueList;
            return this;
        }
        public java.util.List<GetDialogDetailResponseBodyDataDialogueList> getDialogueList() {
            return this.dialogueList;
        }

        public GetDialogDetailResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetDialogDetailResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetDialogDetailResponseBodyData setTotalDialogTurns(Integer totalDialogTurns) {
            this.totalDialogTurns = totalDialogTurns;
            return this;
        }
        public Integer getTotalDialogTurns() {
            return this.totalDialogTurns;
        }

        public GetDialogDetailResponseBodyData setValidDialogTurns(Integer validDialogTurns) {
            this.validDialogTurns = validDialogTurns;
            return this;
        }
        public Integer getValidDialogTurns() {
            return this.validDialogTurns;
        }

    }

}
