// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class GetHotelSceneItemDetailResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public GetHotelSceneItemDetailResponseBodyResult result;

    public static GetHotelSceneItemDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetHotelSceneItemDetailResponseBody self = new GetHotelSceneItemDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public GetHotelSceneItemDetailResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetHotelSceneItemDetailResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetHotelSceneItemDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetHotelSceneItemDetailResponseBody setResult(GetHotelSceneItemDetailResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetHotelSceneItemDetailResponseBodyResult getResult() {
        return this.result;
    }

    public static class GetHotelSceneItemDetailResponseBodyResultDialogueList extends TeaModel {
        @NameInMap("CreateTime")
        public Long createTime;

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

        @NameInMap("ServiceId")
        public String serviceId;

        @NameInMap("UpdateTime")
        public Long updateTime;

        @NameInMap("YesAnswer")
        public String yesAnswer;

        @NameInMap("YesAnswerTemplate")
        public String yesAnswerTemplate;

        public static GetHotelSceneItemDetailResponseBodyResultDialogueList build(java.util.Map<String, ?> map) throws Exception {
            GetHotelSceneItemDetailResponseBodyResultDialogueList self = new GetHotelSceneItemDetailResponseBodyResultDialogueList();
            return TeaModel.build(map, self);
        }

        public GetHotelSceneItemDetailResponseBodyResultDialogueList setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetHotelSceneItemDetailResponseBodyResultDialogueList setDialogueId(String dialogueId) {
            this.dialogueId = dialogueId;
            return this;
        }
        public String getDialogueId() {
            return this.dialogueId;
        }

        public GetHotelSceneItemDetailResponseBodyResultDialogueList setNoAnswer(String noAnswer) {
            this.noAnswer = noAnswer;
            return this;
        }
        public String getNoAnswer() {
            return this.noAnswer;
        }

        public GetHotelSceneItemDetailResponseBodyResultDialogueList setNoAnswerTemplate(String noAnswerTemplate) {
            this.noAnswerTemplate = noAnswerTemplate;
            return this;
        }
        public String getNoAnswerTemplate() {
            return this.noAnswerTemplate;
        }

        public GetHotelSceneItemDetailResponseBodyResultDialogueList setProcess(Integer process) {
            this.process = process;
            return this;
        }
        public Integer getProcess() {
            return this.process;
        }

        public GetHotelSceneItemDetailResponseBodyResultDialogueList setQuestion(String question) {
            this.question = question;
            return this;
        }
        public String getQuestion() {
            return this.question;
        }

        public GetHotelSceneItemDetailResponseBodyResultDialogueList setServiceId(String serviceId) {
            this.serviceId = serviceId;
            return this;
        }
        public String getServiceId() {
            return this.serviceId;
        }

        public GetHotelSceneItemDetailResponseBodyResultDialogueList setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public GetHotelSceneItemDetailResponseBodyResultDialogueList setYesAnswer(String yesAnswer) {
            this.yesAnswer = yesAnswer;
            return this;
        }
        public String getYesAnswer() {
            return this.yesAnswer;
        }

        public GetHotelSceneItemDetailResponseBodyResultDialogueList setYesAnswerTemplate(String yesAnswerTemplate) {
            this.yesAnswerTemplate = yesAnswerTemplate;
            return this;
        }
        public String getYesAnswerTemplate() {
            return this.yesAnswerTemplate;
        }

    }

    public static class GetHotelSceneItemDetailResponseBodyResult extends TeaModel {
        @NameInMap("Category")
        public String category;

        @NameInMap("DialogueList")
        public java.util.List<GetHotelSceneItemDetailResponseBodyResultDialogueList> dialogueList;

        @NameInMap("Icon")
        public String icon;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Name")
        public String name;

        @NameInMap("Price")
        public Long price;

        @NameInMap("Status")
        public String status;

        @NameInMap("Type")
        public String type;

        @NameInMap("UpdateTime")
        public Long updateTime;

        public static GetHotelSceneItemDetailResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetHotelSceneItemDetailResponseBodyResult self = new GetHotelSceneItemDetailResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetHotelSceneItemDetailResponseBodyResult setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public GetHotelSceneItemDetailResponseBodyResult setDialogueList(java.util.List<GetHotelSceneItemDetailResponseBodyResultDialogueList> dialogueList) {
            this.dialogueList = dialogueList;
            return this;
        }
        public java.util.List<GetHotelSceneItemDetailResponseBodyResultDialogueList> getDialogueList() {
            return this.dialogueList;
        }

        public GetHotelSceneItemDetailResponseBodyResult setIcon(String icon) {
            this.icon = icon;
            return this;
        }
        public String getIcon() {
            return this.icon;
        }

        public GetHotelSceneItemDetailResponseBodyResult setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetHotelSceneItemDetailResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetHotelSceneItemDetailResponseBodyResult setPrice(Long price) {
            this.price = price;
            return this;
        }
        public Long getPrice() {
            return this.price;
        }

        public GetHotelSceneItemDetailResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetHotelSceneItemDetailResponseBodyResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetHotelSceneItemDetailResponseBodyResult setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

    }

}
