// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dianjin20240628.models;

import com.aliyun.tea.*;

public class CreateQualityCheckTaskRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("conversationList")
    public CreateQualityCheckTaskRequestConversationList conversationList;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-09-27 11:23:20</p>
     */
    @NameInMap("gmtService")
    public String gmtService;

    @NameInMap("metaData")
    public java.util.Map<String, String> metaData;

    @NameInMap("qualityGroup")
    public java.util.List<String> qualityGroup;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0FC6636E-380A-5369-AE01-D1C15BB9B254</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("sceneCode")
    public String sceneCode;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("type")
    public String type;

    public static CreateQualityCheckTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateQualityCheckTaskRequest self = new CreateQualityCheckTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateQualityCheckTaskRequest setConversationList(CreateQualityCheckTaskRequestConversationList conversationList) {
        this.conversationList = conversationList;
        return this;
    }
    public CreateQualityCheckTaskRequestConversationList getConversationList() {
        return this.conversationList;
    }

    public CreateQualityCheckTaskRequest setGmtService(String gmtService) {
        this.gmtService = gmtService;
        return this;
    }
    public String getGmtService() {
        return this.gmtService;
    }

    public CreateQualityCheckTaskRequest setMetaData(java.util.Map<String, String> metaData) {
        this.metaData = metaData;
        return this;
    }
    public java.util.Map<String, String> getMetaData() {
        return this.metaData;
    }

    public CreateQualityCheckTaskRequest setQualityGroup(java.util.List<String> qualityGroup) {
        this.qualityGroup = qualityGroup;
        return this;
    }
    public java.util.List<String> getQualityGroup() {
        return this.qualityGroup;
    }

    public CreateQualityCheckTaskRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateQualityCheckTaskRequest setSceneCode(String sceneCode) {
        this.sceneCode = sceneCode;
        return this;
    }
    public String getSceneCode() {
        return this.sceneCode;
    }

    public CreateQualityCheckTaskRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public static class CreateQualityCheckTaskRequestConversationListDialogueList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("begin")
        public Integer begin;

        /**
         * <strong>example:</strong>
         * <p>2024-05-23 14:57:50</p>
         */
        @NameInMap("beginTime")
        public String beginTime;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("content")
        public String content;

        /**
         * <strong>example:</strong>
         * <p>2348234</p>
         */
        @NameInMap("customerId")
        public String customerId;

        /**
         * <strong>example:</strong>
         * <p>23874627346</p>
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
         * <p>0</p>
         */
        @NameInMap("end")
        public Integer end;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("role")
        public String role;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>TEXT</p>
         */
        @NameInMap("type")
        public String type;

        public static CreateQualityCheckTaskRequestConversationListDialogueList build(java.util.Map<String, ?> map) throws Exception {
            CreateQualityCheckTaskRequestConversationListDialogueList self = new CreateQualityCheckTaskRequestConversationListDialogueList();
            return TeaModel.build(map, self);
        }

        public CreateQualityCheckTaskRequestConversationListDialogueList setBegin(Integer begin) {
            this.begin = begin;
            return this;
        }
        public Integer getBegin() {
            return this.begin;
        }

        public CreateQualityCheckTaskRequestConversationListDialogueList setBeginTime(String beginTime) {
            this.beginTime = beginTime;
            return this;
        }
        public String getBeginTime() {
            return this.beginTime;
        }

        public CreateQualityCheckTaskRequestConversationListDialogueList setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public CreateQualityCheckTaskRequestConversationListDialogueList setCustomerId(String customerId) {
            this.customerId = customerId;
            return this;
        }
        public String getCustomerId() {
            return this.customerId;
        }

        public CreateQualityCheckTaskRequestConversationListDialogueList setCustomerServiceId(String customerServiceId) {
            this.customerServiceId = customerServiceId;
            return this;
        }
        public String getCustomerServiceId() {
            return this.customerServiceId;
        }

        public CreateQualityCheckTaskRequestConversationListDialogueList setCustomerServiceType(String customerServiceType) {
            this.customerServiceType = customerServiceType;
            return this;
        }
        public String getCustomerServiceType() {
            return this.customerServiceType;
        }

        public CreateQualityCheckTaskRequestConversationListDialogueList setEnd(Integer end) {
            this.end = end;
            return this;
        }
        public Integer getEnd() {
            return this.end;
        }

        public CreateQualityCheckTaskRequestConversationListDialogueList setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public CreateQualityCheckTaskRequestConversationListDialogueList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class CreateQualityCheckTaskRequestConversationList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("callType")
        public String callType;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("customerId")
        public String customerId;

        @NameInMap("customerName")
        public String customerName;

        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("customerServiceId")
        public String customerServiceId;

        @NameInMap("customerServiceName")
        public String customerServiceName;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("dialogueList")
        public java.util.List<CreateQualityCheckTaskRequestConversationListDialogueList> dialogueList;

        /**
         * <strong>example:</strong>
         * <p>2024-09-27 11:23:20</p>
         */
        @NameInMap("gmtService")
        public String gmtService;

        public static CreateQualityCheckTaskRequestConversationList build(java.util.Map<String, ?> map) throws Exception {
            CreateQualityCheckTaskRequestConversationList self = new CreateQualityCheckTaskRequestConversationList();
            return TeaModel.build(map, self);
        }

        public CreateQualityCheckTaskRequestConversationList setCallType(String callType) {
            this.callType = callType;
            return this;
        }
        public String getCallType() {
            return this.callType;
        }

        public CreateQualityCheckTaskRequestConversationList setCustomerId(String customerId) {
            this.customerId = customerId;
            return this;
        }
        public String getCustomerId() {
            return this.customerId;
        }

        public CreateQualityCheckTaskRequestConversationList setCustomerName(String customerName) {
            this.customerName = customerName;
            return this;
        }
        public String getCustomerName() {
            return this.customerName;
        }

        public CreateQualityCheckTaskRequestConversationList setCustomerServiceId(String customerServiceId) {
            this.customerServiceId = customerServiceId;
            return this;
        }
        public String getCustomerServiceId() {
            return this.customerServiceId;
        }

        public CreateQualityCheckTaskRequestConversationList setCustomerServiceName(String customerServiceName) {
            this.customerServiceName = customerServiceName;
            return this;
        }
        public String getCustomerServiceName() {
            return this.customerServiceName;
        }

        public CreateQualityCheckTaskRequestConversationList setDialogueList(java.util.List<CreateQualityCheckTaskRequestConversationListDialogueList> dialogueList) {
            this.dialogueList = dialogueList;
            return this;
        }
        public java.util.List<CreateQualityCheckTaskRequestConversationListDialogueList> getDialogueList() {
            return this.dialogueList;
        }

        public CreateQualityCheckTaskRequestConversationList setGmtService(String gmtService) {
            this.gmtService = gmtService;
            return this;
        }
        public String getGmtService() {
            return this.gmtService;
        }

    }

}
