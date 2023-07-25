// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class UpdateHotelSceneItemRequest extends TeaModel {
    /**
     * <p>hotelID</p>
     */
    @NameInMap("HotelId")
    public String hotelId;

    /**
     * <p>updateHotelSceneReq</p>
     */
    @NameInMap("UpdateHotelSceneOperateReq")
    public UpdateHotelSceneItemRequestUpdateHotelSceneOperateReq updateHotelSceneOperateReq;

    /**
     * <p>UpdateHotelSceneReq</p>
     */
    @NameInMap("UpdateHotelSceneReq")
    public UpdateHotelSceneItemRequestUpdateHotelSceneReq updateHotelSceneReq;

    public static UpdateHotelSceneItemRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateHotelSceneItemRequest self = new UpdateHotelSceneItemRequest();
        return TeaModel.build(map, self);
    }

    public UpdateHotelSceneItemRequest setHotelId(String hotelId) {
        this.hotelId = hotelId;
        return this;
    }
    public String getHotelId() {
        return this.hotelId;
    }

    public UpdateHotelSceneItemRequest setUpdateHotelSceneOperateReq(UpdateHotelSceneItemRequestUpdateHotelSceneOperateReq updateHotelSceneOperateReq) {
        this.updateHotelSceneOperateReq = updateHotelSceneOperateReq;
        return this;
    }
    public UpdateHotelSceneItemRequestUpdateHotelSceneOperateReq getUpdateHotelSceneOperateReq() {
        return this.updateHotelSceneOperateReq;
    }

    public UpdateHotelSceneItemRequest setUpdateHotelSceneReq(UpdateHotelSceneItemRequestUpdateHotelSceneReq updateHotelSceneReq) {
        this.updateHotelSceneReq = updateHotelSceneReq;
        return this;
    }
    public UpdateHotelSceneItemRequestUpdateHotelSceneReq getUpdateHotelSceneReq() {
        return this.updateHotelSceneReq;
    }

    public static class UpdateHotelSceneItemRequestUpdateHotelSceneOperateReq extends TeaModel {
        @NameInMap("IsUseTemplateAnswer")
        public Boolean isUseTemplateAnswer;

        @NameInMap("OperateType")
        public String operateType;

        public static UpdateHotelSceneItemRequestUpdateHotelSceneOperateReq build(java.util.Map<String, ?> map) throws Exception {
            UpdateHotelSceneItemRequestUpdateHotelSceneOperateReq self = new UpdateHotelSceneItemRequestUpdateHotelSceneOperateReq();
            return TeaModel.build(map, self);
        }

        public UpdateHotelSceneItemRequestUpdateHotelSceneOperateReq setIsUseTemplateAnswer(Boolean isUseTemplateAnswer) {
            this.isUseTemplateAnswer = isUseTemplateAnswer;
            return this;
        }
        public Boolean getIsUseTemplateAnswer() {
            return this.isUseTemplateAnswer;
        }

        public UpdateHotelSceneItemRequestUpdateHotelSceneOperateReq setOperateType(String operateType) {
            this.operateType = operateType;
            return this;
        }
        public String getOperateType() {
            return this.operateType;
        }

    }

    public static class UpdateHotelSceneItemRequestUpdateHotelSceneReqDialogueList extends TeaModel {
        @NameInMap("DialogueId")
        public String dialogueId;

        @NameInMap("NoAnswer")
        public String noAnswer;

        @NameInMap("NoAnswerTemplate")
        public String noAnswerTemplate;

        @NameInMap("Process")
        public Integer process;

        @NameInMap("Question")
        public String question;

        /**
         * <p>itemId</p>
         */
        @NameInMap("ServiceId")
        public String serviceId;

        @NameInMap("YesAnswer")
        public String yesAnswer;

        @NameInMap("YesAnswerTemplate")
        public String yesAnswerTemplate;

        public static UpdateHotelSceneItemRequestUpdateHotelSceneReqDialogueList build(java.util.Map<String, ?> map) throws Exception {
            UpdateHotelSceneItemRequestUpdateHotelSceneReqDialogueList self = new UpdateHotelSceneItemRequestUpdateHotelSceneReqDialogueList();
            return TeaModel.build(map, self);
        }

        public UpdateHotelSceneItemRequestUpdateHotelSceneReqDialogueList setDialogueId(String dialogueId) {
            this.dialogueId = dialogueId;
            return this;
        }
        public String getDialogueId() {
            return this.dialogueId;
        }

        public UpdateHotelSceneItemRequestUpdateHotelSceneReqDialogueList setNoAnswer(String noAnswer) {
            this.noAnswer = noAnswer;
            return this;
        }
        public String getNoAnswer() {
            return this.noAnswer;
        }

        public UpdateHotelSceneItemRequestUpdateHotelSceneReqDialogueList setNoAnswerTemplate(String noAnswerTemplate) {
            this.noAnswerTemplate = noAnswerTemplate;
            return this;
        }
        public String getNoAnswerTemplate() {
            return this.noAnswerTemplate;
        }

        public UpdateHotelSceneItemRequestUpdateHotelSceneReqDialogueList setProcess(Integer process) {
            this.process = process;
            return this;
        }
        public Integer getProcess() {
            return this.process;
        }

        public UpdateHotelSceneItemRequestUpdateHotelSceneReqDialogueList setQuestion(String question) {
            this.question = question;
            return this;
        }
        public String getQuestion() {
            return this.question;
        }

        public UpdateHotelSceneItemRequestUpdateHotelSceneReqDialogueList setServiceId(String serviceId) {
            this.serviceId = serviceId;
            return this;
        }
        public String getServiceId() {
            return this.serviceId;
        }

        public UpdateHotelSceneItemRequestUpdateHotelSceneReqDialogueList setYesAnswer(String yesAnswer) {
            this.yesAnswer = yesAnswer;
            return this;
        }
        public String getYesAnswer() {
            return this.yesAnswer;
        }

        public UpdateHotelSceneItemRequestUpdateHotelSceneReqDialogueList setYesAnswerTemplate(String yesAnswerTemplate) {
            this.yesAnswerTemplate = yesAnswerTemplate;
            return this;
        }
        public String getYesAnswerTemplate() {
            return this.yesAnswerTemplate;
        }

    }

    public static class UpdateHotelSceneItemRequestUpdateHotelSceneReq extends TeaModel {
        @NameInMap("DeliveryMethod")
        public String deliveryMethod;

        @NameInMap("DialogueList")
        public java.util.List<UpdateHotelSceneItemRequestUpdateHotelSceneReqDialogueList> dialogueList;

        /**
         * <p>icon</p>
         */
        @NameInMap("Icon")
        public String icon;

        /**
         * <p>itemID</p>
         */
        @NameInMap("Id")
        public Long id;

        @NameInMap("Name")
        public String name;

        @NameInMap("PaymentMethod")
        public String paymentMethod;

        @NameInMap("Price")
        public Long price;

        @NameInMap("RobotName")
        public String robotName;

        @NameInMap("Status")
        public String status;

        public static UpdateHotelSceneItemRequestUpdateHotelSceneReq build(java.util.Map<String, ?> map) throws Exception {
            UpdateHotelSceneItemRequestUpdateHotelSceneReq self = new UpdateHotelSceneItemRequestUpdateHotelSceneReq();
            return TeaModel.build(map, self);
        }

        public UpdateHotelSceneItemRequestUpdateHotelSceneReq setDeliveryMethod(String deliveryMethod) {
            this.deliveryMethod = deliveryMethod;
            return this;
        }
        public String getDeliveryMethod() {
            return this.deliveryMethod;
        }

        public UpdateHotelSceneItemRequestUpdateHotelSceneReq setDialogueList(java.util.List<UpdateHotelSceneItemRequestUpdateHotelSceneReqDialogueList> dialogueList) {
            this.dialogueList = dialogueList;
            return this;
        }
        public java.util.List<UpdateHotelSceneItemRequestUpdateHotelSceneReqDialogueList> getDialogueList() {
            return this.dialogueList;
        }

        public UpdateHotelSceneItemRequestUpdateHotelSceneReq setIcon(String icon) {
            this.icon = icon;
            return this;
        }
        public String getIcon() {
            return this.icon;
        }

        public UpdateHotelSceneItemRequestUpdateHotelSceneReq setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public UpdateHotelSceneItemRequestUpdateHotelSceneReq setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateHotelSceneItemRequestUpdateHotelSceneReq setPaymentMethod(String paymentMethod) {
            this.paymentMethod = paymentMethod;
            return this;
        }
        public String getPaymentMethod() {
            return this.paymentMethod;
        }

        public UpdateHotelSceneItemRequestUpdateHotelSceneReq setPrice(Long price) {
            this.price = price;
            return this;
        }
        public Long getPrice() {
            return this.price;
        }

        public UpdateHotelSceneItemRequestUpdateHotelSceneReq setRobotName(String robotName) {
            this.robotName = robotName;
            return this;
        }
        public String getRobotName() {
            return this.robotName;
        }

        public UpdateHotelSceneItemRequestUpdateHotelSceneReq setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
