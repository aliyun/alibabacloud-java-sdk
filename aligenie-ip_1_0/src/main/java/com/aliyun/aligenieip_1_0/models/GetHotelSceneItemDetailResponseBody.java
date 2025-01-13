// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class GetHotelSceneItemDetailResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>0EC7*726E</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>1666164774</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <strong>example:</strong>
         * <p>336</p>
         */
        @NameInMap("DialogueId")
        public String dialogueId;

        @NameInMap("NoAnswer")
        public String noAnswer;

        /**
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("NoAnswerTemplate")
        public String noAnswerTemplate;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Process")
        public Integer process;

        @NameInMap("Question")
        public String question;

        /**
         * <strong>example:</strong>
         * <p>10336</p>
         */
        @NameInMap("ServiceId")
        public String serviceId;

        /**
         * <strong>example:</strong>
         * <p>1666164774</p>
         */
        @NameInMap("UpdateTime")
        public Long updateTime;

        @NameInMap("YesAnswer")
        public String yesAnswer;

        /**
         * <strong>example:</strong>
         * <p>4</p>
         */
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
        /**
         * <strong>example:</strong>
         * <p>客用品类</p>
         */
        @NameInMap("Category")
        public String category;

        @NameInMap("DialogueList")
        public java.util.List<GetHotelSceneItemDetailResponseBodyResultDialogueList> dialogueList;

        /**
         * <strong>example:</strong>
         * <p><a href="https://ailabsaicloudservice.alicdn.com/hotel/icon/jiudianmianban_fuwushangpintu/wupin/keyongpinlei/zhijin.png">https://ailabsaicloudservice.alicdn.com/hotel/icon/jiudianmianban_fuwushangpintu/wupin/keyongpinlei/zhijin.png</a></p>
         */
        @NameInMap("Icon")
        public String icon;

        /**
         * <strong>example:</strong>
         * <p>10336</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>擦鞋布</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>170</p>
         */
        @NameInMap("Price")
        public Long price;

        /**
         * <strong>example:</strong>
         * <p>已添加</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>GOODS</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <strong>example:</strong>
         * <p>1666168828</p>
         */
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
