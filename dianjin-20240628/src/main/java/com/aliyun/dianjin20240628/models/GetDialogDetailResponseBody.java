// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dianjin20240628.models;

import com.aliyun.tea.*;

public class GetDialogDetailResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("cost")
    public Long cost;

    @NameInMap("data")
    public GetDialogDetailResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("dataType")
    public String dataType;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("errCode")
    public String errCode;

    /**
     * <strong>example:</strong>
     * <p>ok</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>5E3FBAF1-17AF-53B7-AF0A-CDCEEB6DE658</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    /**
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
        @NameInMap("content")
        public String content;

        /**
         * <strong>example:</strong>
         * <p>123761283</p>
         */
        @NameInMap("customerId")
        public String customerId;

        /**
         * <strong>example:</strong>
         * <p>BOT</p>
         */
        @NameInMap("customerServiceId")
        public String customerServiceId;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("customerServiceType")
        public String customerServiceType;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("hangUpDialog")
        public Boolean hangUpDialog;

        /**
         * <strong>example:</strong>
         * <p>1742869659849</p>
         */
        @NameInMap("id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>193874634xxx</p>
         */
        @NameInMap("intentCode")
        public String intentCode;

        @NameInMap("intentName")
        public String intentName;

        /**
         * <strong>example:</strong>
         * <p>19387872364736xdhcb</p>
         */
        @NameInMap("recordId")
        public String recordId;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("role")
        public String role;

        /**
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
        @NameInMap("dialogueList")
        public java.util.List<GetDialogDetailResponseBodyDataDialogueList> dialogueList;

        /**
         * <strong>example:</strong>
         * <p>2024-09-27 11:23:20</p>
         */
        @NameInMap("gmtCreate")
        public String gmtCreate;

        /**
         * <strong>example:</strong>
         * <p>COMPLETED</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("totalDialogTurns")
        public Integer totalDialogTurns;

        /**
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
