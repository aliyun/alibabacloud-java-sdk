// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dianjin20240628.models;

import com.aliyun.tea.*;

public class GetQualityCheckTaskResultResponseBody extends TeaModel {
    /**
     * <p>The duration.</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("cost")
    public Long cost;

    /**
     * <p>The response data.</p>
     */
    @NameInMap("data")
    public GetQualityCheckTaskResultResponseBodyData data;

    /**
     * <p>The data type.</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("dataType")
    public String dataType;

    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("errCode")
    public String errCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>ok</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>67C7021A-D268-553D-8C15-A087B9604028</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    /**
     * <p>The timestamp.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-01-01 00:00:00</p>
     */
    @NameInMap("time")
    public String time;

    public static GetQualityCheckTaskResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetQualityCheckTaskResultResponseBody self = new GetQualityCheckTaskResultResponseBody();
        return TeaModel.build(map, self);
    }

    public GetQualityCheckTaskResultResponseBody setCost(Long cost) {
        this.cost = cost;
        return this;
    }
    public Long getCost() {
        return this.cost;
    }

    public GetQualityCheckTaskResultResponseBody setData(GetQualityCheckTaskResultResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetQualityCheckTaskResultResponseBodyData getData() {
        return this.data;
    }

    public GetQualityCheckTaskResultResponseBody setDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }
    public String getDataType() {
        return this.dataType;
    }

    public GetQualityCheckTaskResultResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public GetQualityCheckTaskResultResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetQualityCheckTaskResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetQualityCheckTaskResultResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetQualityCheckTaskResultResponseBody setTime(String time) {
        this.time = time;
        return this;
    }
    public String getTime() {
        return this.time;
    }

    public static class GetQualityCheckTaskResultResponseBodyDataConversationListDialogueList extends TeaModel {
        /**
         * <p>The start time of the utterance, as an offset in milliseconds from the start of the conversation.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("begin")
        public Integer begin;

        /**
         * <p>The start time of the utterance.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-09-27 11:23:20</p>
         */
        @NameInMap("beginTime")
        public String beginTime;

        /**
         * <p>The specific content of the dialogue.</p>
         * 
         * <strong>example:</strong>
         * <p>Hello, this is 2001. How may I help you?</p>
         */
        @NameInMap("content")
        public String content;

        /**
         * <p>The unique identifier of the dialogue role.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("customerId")
        public String customerId;

        /**
         * <p>The customer service ID.</p>
         * 
         * <strong>example:</strong>
         * <p>Li Si</p>
         */
        @NameInMap("customerServiceId")
        public String customerServiceId;

        /**
         * <p>The agent type.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("customerServiceType")
        public String customerServiceType;

        /**
         * <p>The end time of the utterance, as an offset in milliseconds from the start of the conversation.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("end")
        public Integer end;

        /**
         * <p>The unique identifier of the utterance. This value is assigned internally.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("id")
        public Integer id;

        /**
         * <p>The role.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("role")
        public String role;

        /**
         * <p>The type of the dialogue content.</p>
         * 
         * <strong>example:</strong>
         * <p>TEXT</p>
         */
        @NameInMap("type")
        public String type;

        public static GetQualityCheckTaskResultResponseBodyDataConversationListDialogueList build(java.util.Map<String, ?> map) throws Exception {
            GetQualityCheckTaskResultResponseBodyDataConversationListDialogueList self = new GetQualityCheckTaskResultResponseBodyDataConversationListDialogueList();
            return TeaModel.build(map, self);
        }

        public GetQualityCheckTaskResultResponseBodyDataConversationListDialogueList setBegin(Integer begin) {
            this.begin = begin;
            return this;
        }
        public Integer getBegin() {
            return this.begin;
        }

        public GetQualityCheckTaskResultResponseBodyDataConversationListDialogueList setBeginTime(String beginTime) {
            this.beginTime = beginTime;
            return this;
        }
        public String getBeginTime() {
            return this.beginTime;
        }

        public GetQualityCheckTaskResultResponseBodyDataConversationListDialogueList setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public GetQualityCheckTaskResultResponseBodyDataConversationListDialogueList setCustomerId(String customerId) {
            this.customerId = customerId;
            return this;
        }
        public String getCustomerId() {
            return this.customerId;
        }

        public GetQualityCheckTaskResultResponseBodyDataConversationListDialogueList setCustomerServiceId(String customerServiceId) {
            this.customerServiceId = customerServiceId;
            return this;
        }
        public String getCustomerServiceId() {
            return this.customerServiceId;
        }

        public GetQualityCheckTaskResultResponseBodyDataConversationListDialogueList setCustomerServiceType(String customerServiceType) {
            this.customerServiceType = customerServiceType;
            return this;
        }
        public String getCustomerServiceType() {
            return this.customerServiceType;
        }

        public GetQualityCheckTaskResultResponseBodyDataConversationListDialogueList setEnd(Integer end) {
            this.end = end;
            return this;
        }
        public Integer getEnd() {
            return this.end;
        }

        public GetQualityCheckTaskResultResponseBodyDataConversationListDialogueList setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

        public GetQualityCheckTaskResultResponseBodyDataConversationListDialogueList setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public GetQualityCheckTaskResultResponseBodyDataConversationListDialogueList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetQualityCheckTaskResultResponseBodyDataConversationList extends TeaModel {
        /**
         * <p>The call type.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("callType")
        public String callType;

        /**
         * <p>The customer ID.</p>
         * 
         * <strong>example:</strong>
         * <p>234234</p>
         */
        @NameInMap("customerId")
        public String customerId;

        /**
         * <p>The customer name.</p>
         * 
         * <strong>example:</strong>
         * <p>Zhang San</p>
         */
        @NameInMap("customerName")
        public String customerName;

        /**
         * <p>The customer service ID.</p>
         * 
         * <strong>example:</strong>
         * <p>23984763826</p>
         */
        @NameInMap("customerServiceId")
        public String customerServiceId;

        /**
         * <p>The customer service name.</p>
         * 
         * <strong>example:</strong>
         * <p>Li Si</p>
         */
        @NameInMap("customerServiceName")
        public String customerServiceName;

        /**
         * <p>The list of dialogue details.</p>
         */
        @NameInMap("dialogueList")
        public java.util.List<GetQualityCheckTaskResultResponseBodyDataConversationListDialogueList> dialogueList;

        /**
         * <p>The conversation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-09-27 11:23:20</p>
         */
        @NameInMap("gmtService")
        public String gmtService;

        public static GetQualityCheckTaskResultResponseBodyDataConversationList build(java.util.Map<String, ?> map) throws Exception {
            GetQualityCheckTaskResultResponseBodyDataConversationList self = new GetQualityCheckTaskResultResponseBodyDataConversationList();
            return TeaModel.build(map, self);
        }

        public GetQualityCheckTaskResultResponseBodyDataConversationList setCallType(String callType) {
            this.callType = callType;
            return this;
        }
        public String getCallType() {
            return this.callType;
        }

        public GetQualityCheckTaskResultResponseBodyDataConversationList setCustomerId(String customerId) {
            this.customerId = customerId;
            return this;
        }
        public String getCustomerId() {
            return this.customerId;
        }

        public GetQualityCheckTaskResultResponseBodyDataConversationList setCustomerName(String customerName) {
            this.customerName = customerName;
            return this;
        }
        public String getCustomerName() {
            return this.customerName;
        }

        public GetQualityCheckTaskResultResponseBodyDataConversationList setCustomerServiceId(String customerServiceId) {
            this.customerServiceId = customerServiceId;
            return this;
        }
        public String getCustomerServiceId() {
            return this.customerServiceId;
        }

        public GetQualityCheckTaskResultResponseBodyDataConversationList setCustomerServiceName(String customerServiceName) {
            this.customerServiceName = customerServiceName;
            return this;
        }
        public String getCustomerServiceName() {
            return this.customerServiceName;
        }

        public GetQualityCheckTaskResultResponseBodyDataConversationList setDialogueList(java.util.List<GetQualityCheckTaskResultResponseBodyDataConversationListDialogueList> dialogueList) {
            this.dialogueList = dialogueList;
            return this;
        }
        public java.util.List<GetQualityCheckTaskResultResponseBodyDataConversationListDialogueList> getDialogueList() {
            return this.dialogueList;
        }

        public GetQualityCheckTaskResultResponseBodyDataConversationList setGmtService(String gmtService) {
            this.gmtService = gmtService;
            return this;
        }
        public String getGmtService() {
            return this.gmtService;
        }

    }

    public static class GetQualityCheckTaskResultResponseBodyDataQualityCheckListOriginDialogue extends TeaModel {
        /**
         * <p>The start time of the utterance, as an offset in milliseconds from the start of the conversation.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("begin")
        public Integer begin;

        /**
         * <p>The start time of the utterance.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-05-23 14:57:50</p>
         */
        @NameInMap("beginTime")
        public String beginTime;

        /**
         * <p>The specific content of the dialogue.</p>
         * 
         * <strong>example:</strong>
         * <p>Hello, this is 2001. How may I help you?</p>
         */
        @NameInMap("content")
        public String content;

        /**
         * <p>The unique identifier of the dialogue role.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("customerId")
        public String customerId;

        /**
         * <p>The customer service ID.</p>
         * 
         * <strong>example:</strong>
         * <p>23876432</p>
         */
        @NameInMap("customerServiceId")
        public String customerServiceId;

        /**
         * <p>The agent type.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("customerServiceType")
        public String customerServiceType;

        /**
         * <p>The end time of the utterance, as an offset in milliseconds from the start of the conversation.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("end")
        public Integer end;

        /**
         * <p>The unique identifier of the sentence, which is assigned internally.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("id")
        public Integer id;

        /**
         * <p>The role.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("role")
        public String role;

        /**
         * <p>The type of the dialogue content.</p>
         * 
         * <strong>example:</strong>
         * <p>TEXT</p>
         */
        @NameInMap("type")
        public String type;

        public static GetQualityCheckTaskResultResponseBodyDataQualityCheckListOriginDialogue build(java.util.Map<String, ?> map) throws Exception {
            GetQualityCheckTaskResultResponseBodyDataQualityCheckListOriginDialogue self = new GetQualityCheckTaskResultResponseBodyDataQualityCheckListOriginDialogue();
            return TeaModel.build(map, self);
        }

        public GetQualityCheckTaskResultResponseBodyDataQualityCheckListOriginDialogue setBegin(Integer begin) {
            this.begin = begin;
            return this;
        }
        public Integer getBegin() {
            return this.begin;
        }

        public GetQualityCheckTaskResultResponseBodyDataQualityCheckListOriginDialogue setBeginTime(String beginTime) {
            this.beginTime = beginTime;
            return this;
        }
        public String getBeginTime() {
            return this.beginTime;
        }

        public GetQualityCheckTaskResultResponseBodyDataQualityCheckListOriginDialogue setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public GetQualityCheckTaskResultResponseBodyDataQualityCheckListOriginDialogue setCustomerId(String customerId) {
            this.customerId = customerId;
            return this;
        }
        public String getCustomerId() {
            return this.customerId;
        }

        public GetQualityCheckTaskResultResponseBodyDataQualityCheckListOriginDialogue setCustomerServiceId(String customerServiceId) {
            this.customerServiceId = customerServiceId;
            return this;
        }
        public String getCustomerServiceId() {
            return this.customerServiceId;
        }

        public GetQualityCheckTaskResultResponseBodyDataQualityCheckListOriginDialogue setCustomerServiceType(String customerServiceType) {
            this.customerServiceType = customerServiceType;
            return this;
        }
        public String getCustomerServiceType() {
            return this.customerServiceType;
        }

        public GetQualityCheckTaskResultResponseBodyDataQualityCheckListOriginDialogue setEnd(Integer end) {
            this.end = end;
            return this;
        }
        public Integer getEnd() {
            return this.end;
        }

        public GetQualityCheckTaskResultResponseBodyDataQualityCheckListOriginDialogue setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

        public GetQualityCheckTaskResultResponseBodyDataQualityCheckListOriginDialogue setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public GetQualityCheckTaskResultResponseBodyDataQualityCheckListOriginDialogue setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetQualityCheckTaskResultResponseBodyDataQualityCheckList extends TeaModel {
        /**
         * <p>The business type of the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>No</p>
         */
        @NameInMap("bizType")
        public String bizType;

        /**
         * <p>The explanation for why the check passed or failed.</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        @NameInMap("checkExplanation")
        public String checkExplanation;

        /**
         * <p>Indicates whether the quality check passed.</p>
         * 
         * <strong>example:</strong>
         * <p>PASSED</p>
         */
        @NameInMap("checkPassed")
        public String checkPassed;

        /**
         * <p>The description of the quality check process.</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        @NameInMap("checkProcess")
        public String checkProcess;

        /**
         * <p>Indicates whether the rule was hit.</p>
         * 
         * <strong>example:</strong>
         * <p>HIT</p>
         */
        @NameInMap("checked")
        public String checked;

        /**
         * <p>The quality check completion time.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-05-23 14:57:50</p>
         */
        @NameInMap("gmtEnd")
        public String gmtEnd;

        /**
         * <p>The quality check start time.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-05-23 14:57:50</p>
         */
        @NameInMap("gmtStart")
        public String gmtStart;

        /**
         * <p>The internal quality check mode.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("mode")
        public String mode;

        /**
         * <p>The original dialogue list.</p>
         */
        @NameInMap("originDialogue")
        public java.util.List<GetQualityCheckTaskResultResponseBodyDataQualityCheckListOriginDialogue> originDialogue;

        /**
         * <p>The quality check group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>warning_customers</p>
         */
        @NameInMap("qualityGroupId")
        public String qualityGroupId;

        /**
         * <p>The quality check item description.</p>
         * 
         * <strong>example:</strong>
         * <p>Enter the early-warning customer detection process</p>
         */
        @NameInMap("ruleDescription")
        public String ruleDescription;

        /**
         * <p>The quality check item ID.</p>
         * 
         * <strong>example:</strong>
         * <p>wcm_start</p>
         */
        @NameInMap("ruleId")
        public String ruleId;

        /**
         * <p>The polarity type of the rule. Valid values: 0: negative. 1: positive.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ruleType")
        public String ruleType;

        /**
         * <p>The child node.</p>
         */
        @NameInMap("subNodeCol")
        public java.util.List<?> subNodeCol;

        public static GetQualityCheckTaskResultResponseBodyDataQualityCheckList build(java.util.Map<String, ?> map) throws Exception {
            GetQualityCheckTaskResultResponseBodyDataQualityCheckList self = new GetQualityCheckTaskResultResponseBodyDataQualityCheckList();
            return TeaModel.build(map, self);
        }

        public GetQualityCheckTaskResultResponseBodyDataQualityCheckList setBizType(String bizType) {
            this.bizType = bizType;
            return this;
        }
        public String getBizType() {
            return this.bizType;
        }

        public GetQualityCheckTaskResultResponseBodyDataQualityCheckList setCheckExplanation(String checkExplanation) {
            this.checkExplanation = checkExplanation;
            return this;
        }
        public String getCheckExplanation() {
            return this.checkExplanation;
        }

        public GetQualityCheckTaskResultResponseBodyDataQualityCheckList setCheckPassed(String checkPassed) {
            this.checkPassed = checkPassed;
            return this;
        }
        public String getCheckPassed() {
            return this.checkPassed;
        }

        public GetQualityCheckTaskResultResponseBodyDataQualityCheckList setCheckProcess(String checkProcess) {
            this.checkProcess = checkProcess;
            return this;
        }
        public String getCheckProcess() {
            return this.checkProcess;
        }

        public GetQualityCheckTaskResultResponseBodyDataQualityCheckList setChecked(String checked) {
            this.checked = checked;
            return this;
        }
        public String getChecked() {
            return this.checked;
        }

        public GetQualityCheckTaskResultResponseBodyDataQualityCheckList setGmtEnd(String gmtEnd) {
            this.gmtEnd = gmtEnd;
            return this;
        }
        public String getGmtEnd() {
            return this.gmtEnd;
        }

        public GetQualityCheckTaskResultResponseBodyDataQualityCheckList setGmtStart(String gmtStart) {
            this.gmtStart = gmtStart;
            return this;
        }
        public String getGmtStart() {
            return this.gmtStart;
        }

        public GetQualityCheckTaskResultResponseBodyDataQualityCheckList setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public GetQualityCheckTaskResultResponseBodyDataQualityCheckList setOriginDialogue(java.util.List<GetQualityCheckTaskResultResponseBodyDataQualityCheckListOriginDialogue> originDialogue) {
            this.originDialogue = originDialogue;
            return this;
        }
        public java.util.List<GetQualityCheckTaskResultResponseBodyDataQualityCheckListOriginDialogue> getOriginDialogue() {
            return this.originDialogue;
        }

        public GetQualityCheckTaskResultResponseBodyDataQualityCheckList setQualityGroupId(String qualityGroupId) {
            this.qualityGroupId = qualityGroupId;
            return this;
        }
        public String getQualityGroupId() {
            return this.qualityGroupId;
        }

        public GetQualityCheckTaskResultResponseBodyDataQualityCheckList setRuleDescription(String ruleDescription) {
            this.ruleDescription = ruleDescription;
            return this;
        }
        public String getRuleDescription() {
            return this.ruleDescription;
        }

        public GetQualityCheckTaskResultResponseBodyDataQualityCheckList setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

        public GetQualityCheckTaskResultResponseBodyDataQualityCheckList setRuleType(String ruleType) {
            this.ruleType = ruleType;
            return this;
        }
        public String getRuleType() {
            return this.ruleType;
        }

        public GetQualityCheckTaskResultResponseBodyDataQualityCheckList setSubNodeCol(java.util.List<?> subNodeCol) {
            this.subNodeCol = subNodeCol;
            return this;
        }
        public java.util.List<?> getSubNodeCol() {
            return this.subNodeCol;
        }

    }

    public static class GetQualityCheckTaskResultResponseBodyData extends TeaModel {
        /**
         * <p>The original conversation content.</p>
         */
        @NameInMap("conversationList")
        public GetQualityCheckTaskResultResponseBodyDataConversationList conversationList;

        /**
         * <p>The time when the task was created and submitted.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-09-27 11:23:20</p>
         */
        @NameInMap("gmtCreate")
        public String gmtCreate;

        /**
         * <p>The time when the system finished execution.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-09-27 11:23:20</p>
         */
        @NameInMap("gmtEnd")
        public String gmtEnd;

        /**
         * <p>The time when the system started execution.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-09-27 11:23:20</p>
         */
        @NameInMap("gmtStart")
        public String gmtStart;

        /**
         * <p>The quality check results.</p>
         */
        @NameInMap("qualityCheckList")
        public java.util.List<GetQualityCheckTaskResultResponseBodyDataQualityCheckList> qualityCheckList;

        /**
         * <p>The task status.</p>
         * 
         * <strong>example:</strong>
         * <p>INIT</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1703557101831</p>
         */
        @NameInMap("taskId")
        public String taskId;

        public static GetQualityCheckTaskResultResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetQualityCheckTaskResultResponseBodyData self = new GetQualityCheckTaskResultResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetQualityCheckTaskResultResponseBodyData setConversationList(GetQualityCheckTaskResultResponseBodyDataConversationList conversationList) {
            this.conversationList = conversationList;
            return this;
        }
        public GetQualityCheckTaskResultResponseBodyDataConversationList getConversationList() {
            return this.conversationList;
        }

        public GetQualityCheckTaskResultResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetQualityCheckTaskResultResponseBodyData setGmtEnd(String gmtEnd) {
            this.gmtEnd = gmtEnd;
            return this;
        }
        public String getGmtEnd() {
            return this.gmtEnd;
        }

        public GetQualityCheckTaskResultResponseBodyData setGmtStart(String gmtStart) {
            this.gmtStart = gmtStart;
            return this;
        }
        public String getGmtStart() {
            return this.gmtStart;
        }

        public GetQualityCheckTaskResultResponseBodyData setQualityCheckList(java.util.List<GetQualityCheckTaskResultResponseBodyDataQualityCheckList> qualityCheckList) {
            this.qualityCheckList = qualityCheckList;
            return this;
        }
        public java.util.List<GetQualityCheckTaskResultResponseBodyDataQualityCheckList> getQualityCheckList() {
            return this.qualityCheckList;
        }

        public GetQualityCheckTaskResultResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetQualityCheckTaskResultResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
