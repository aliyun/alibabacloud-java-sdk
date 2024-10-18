// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetTicketResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2021-07-09 14:45:01</p>
     */
    @NameInMap("createTime")
    public String createTime;

    @NameInMap("creator")
    public GetTicketResponseBodyCreator creator;

    /**
     * <strong>example:</strong>
     * <p>[{ &quot;customerVisible&quot;: true,&quot;editable&quot;: false,&quot;identifier&quot;: &quot;input1&quot;,&quot;name&quot;: &quot;正文&quot;,&quot;placeholder&quot;: &quot;请输入&quot;,&quot;required&quot;: false,&quot;type&quot;: &quot;TEXT_AREA&quot;,&quot;value&quot;: &quot;123&quot;},{&quot;customerVisible&quot;: true,&quot;editable&quot;: false,&quot;identifier&quot;: &quot;input2&quot;,&quot;name&quot;: &quot;单选&quot;,&quot;options&quot;: [{&quot;color&quot;: &quot;#000000&quot;,&quot;value&quot;: &quot;选项1&quot;},{&quot;color&quot;: &quot;#000000&quot;,&quot;value&quot;: &quot;选项2&quot;},{&quot;color&quot;: &quot;#000000&quot;,&quot;value&quot;: &quot;选项3&quot;}],&quot;required&quot;: false,&quot;type&quot;: &quot;RADIO&quot;},{&quot;customerVisible&quot;: true,&quot;editable&quot;: false,&quot;identifier&quot;: &quot;input3&quot;,&quot;name&quot;: &quot;多选&quot;,&quot;options&quot;: [{&quot;color&quot;: &quot;#000000&quot;,&quot;value&quot;: &quot;选项1&quot;},{&quot;color&quot;: &quot;#000000&quot;,&quot;value&quot;: &quot;选项2&quot;},{&quot;color&quot;: &quot;#000000&quot;,&quot;value&quot;: &quot;选项3&quot;}],&quot;required&quot;: false,&quot;type&quot;: &quot;CHECKBOX&quot;},{&quot;customerVisible&quot;: true,&quot;editable&quot;: false,&quot;identifier&quot;: &quot;input5&quot;,&quot;name&quot;: &quot;数字&quot;,&quot;required&quot;: false,&quot;type&quot;: &quot;INPUT_NUMBER&quot;},{&quot;customerVisible&quot;: true,&quot;editable&quot;: false,&quot;identifier&quot;: &quot;input6&quot;,&quot;maxFileNum&quot;: 20,&quot;name&quot;: &quot;上传&quot;,&quot;required&quot;: false,&quot;type&quot;: &quot;FILE&quot;},{&quot;customerVisible&quot;: true,&quot;editable&quot;: false,&quot;identifier&quot;: &quot;input7&quot;,&quot;maxFileNum&quot;: 20,&quot;name&quot;: &quot;图片&quot;,&quot;required&quot;: false,&quot;type&quot;: &quot;IMAGE&quot;},{&quot;customerVisible&quot;: true,&quot;editable&quot;: false,&quot;format&quot;: &quot;DATE_TIME&quot;,&quot;identifier&quot;: &quot;input8&quot;,&quot;name&quot;: &quot;日期&quot;,&quot;required&quot;: false,&quot;type&quot;: &quot;DATE_TIME_PICKER&quot;}]</p>
     */
    @NameInMap("customFields")
    public String customFields;

    /**
     * <strong>example:</strong>
     * <p>cidZBSNxxxxXUCrAA==</p>
     */
    @NameInMap("openConversationId")
    public String openConversationId;

    /**
     * <strong>example:</strong>
     * <p>a8iSxxxxtgiE</p>
     */
    @NameInMap("openTicketId")
    public String openTicketId;

    @NameInMap("processor")
    public GetTicketResponseBodyProcessor processor;

    /**
     * <strong>example:</strong>
     * <p>0FAAEC9C-C6C8-5C87-AF8E-1195889BBXXX</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>SG</p>
     */
    @NameInMap("scene")
    public String scene;

    /**
     * <strong>example:</strong>
     * <p>{&quot;groupId&quot;:1893227,&quot;groupIsNormal&quot;:true,&quot;groupName&quot;:&quot;API和SPI测试群&quot;,&quot;groupSetId&quot;:29003,&quot;groupSetName&quot;:&quot;默认服务群组&quot;,&quot;scene&quot;:&quot;SG&quot;}</p>
     */
    @NameInMap("sceneContext")
    public String sceneContext;

    /**
     * <strong>example:</strong>
     * <p>FINISHED</p>
     */
    @NameInMap("stage")
    public String stage;

    @NameInMap("takers")
    public java.util.List<GetTicketResponseBodyTakers> takers;

    @NameInMap("template")
    public GetTicketResponseBodyTemplate template;

    /**
     * <strong>example:</strong>
     * <p>贤文api测试，处理人王鸿程和李航宇</p>
     */
    @NameInMap("title")
    public String title;

    /**
     * <strong>example:</strong>
     * <p>2021-07-09 19:26:09</p>
     */
    @NameInMap("updateTime")
    public String updateTime;

    /**
     * <strong>example:</strong>
     * <p>0FAAEC9C-C6C8-5C87-AF8E-1195889BBXXX</p>
     */
    @NameInMap("vendorRequestId")
    public String vendorRequestId;

    /**
     * <strong>example:</strong>
     * <p>dingtalk</p>
     */
    @NameInMap("vendorType")
    public String vendorType;

    public static GetTicketResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTicketResponseBody self = new GetTicketResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTicketResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public GetTicketResponseBody setCreator(GetTicketResponseBodyCreator creator) {
        this.creator = creator;
        return this;
    }
    public GetTicketResponseBodyCreator getCreator() {
        return this.creator;
    }

    public GetTicketResponseBody setCustomFields(String customFields) {
        this.customFields = customFields;
        return this;
    }
    public String getCustomFields() {
        return this.customFields;
    }

    public GetTicketResponseBody setOpenConversationId(String openConversationId) {
        this.openConversationId = openConversationId;
        return this;
    }
    public String getOpenConversationId() {
        return this.openConversationId;
    }

    public GetTicketResponseBody setOpenTicketId(String openTicketId) {
        this.openTicketId = openTicketId;
        return this;
    }
    public String getOpenTicketId() {
        return this.openTicketId;
    }

    public GetTicketResponseBody setProcessor(GetTicketResponseBodyProcessor processor) {
        this.processor = processor;
        return this;
    }
    public GetTicketResponseBodyProcessor getProcessor() {
        return this.processor;
    }

    public GetTicketResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTicketResponseBody setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

    public GetTicketResponseBody setSceneContext(String sceneContext) {
        this.sceneContext = sceneContext;
        return this;
    }
    public String getSceneContext() {
        return this.sceneContext;
    }

    public GetTicketResponseBody setStage(String stage) {
        this.stage = stage;
        return this;
    }
    public String getStage() {
        return this.stage;
    }

    public GetTicketResponseBody setTakers(java.util.List<GetTicketResponseBodyTakers> takers) {
        this.takers = takers;
        return this;
    }
    public java.util.List<GetTicketResponseBodyTakers> getTakers() {
        return this.takers;
    }

    public GetTicketResponseBody setTemplate(GetTicketResponseBodyTemplate template) {
        this.template = template;
        return this;
    }
    public GetTicketResponseBodyTemplate getTemplate() {
        return this.template;
    }

    public GetTicketResponseBody setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public GetTicketResponseBody setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

    public GetTicketResponseBody setVendorRequestId(String vendorRequestId) {
        this.vendorRequestId = vendorRequestId;
        return this;
    }
    public String getVendorRequestId() {
        return this.vendorRequestId;
    }

    public GetTicketResponseBody setVendorType(String vendorType) {
        this.vendorType = vendorType;
        return this;
    }
    public String getVendorType() {
        return this.vendorType;
    }

    public static class GetTicketResponseBodyCreator extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>贤文</p>
         */
        @NameInMap("NickName")
        public String nickName;

        /**
         * <strong>example:</strong>
         * <p>012345</p>
         */
        @NameInMap("UnionId")
        public String unionId;

        public static GetTicketResponseBodyCreator build(java.util.Map<String, ?> map) throws Exception {
            GetTicketResponseBodyCreator self = new GetTicketResponseBodyCreator();
            return TeaModel.build(map, self);
        }

        public GetTicketResponseBodyCreator setNickName(String nickName) {
            this.nickName = nickName;
            return this;
        }
        public String getNickName() {
            return this.nickName;
        }

        public GetTicketResponseBodyCreator setUnionId(String unionId) {
            this.unionId = unionId;
            return this;
        }
        public String getUnionId() {
            return this.unionId;
        }

    }

    public static class GetTicketResponseBodyProcessor extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>贤文</p>
         */
        @NameInMap("NickName")
        public String nickName;

        /**
         * <strong>example:</strong>
         * <p>012345</p>
         */
        @NameInMap("UnionId")
        public String unionId;

        public static GetTicketResponseBodyProcessor build(java.util.Map<String, ?> map) throws Exception {
            GetTicketResponseBodyProcessor self = new GetTicketResponseBodyProcessor();
            return TeaModel.build(map, self);
        }

        public GetTicketResponseBodyProcessor setNickName(String nickName) {
            this.nickName = nickName;
            return this;
        }
        public String getNickName() {
            return this.nickName;
        }

        public GetTicketResponseBodyProcessor setUnionId(String unionId) {
            this.unionId = unionId;
            return this;
        }
        public String getUnionId() {
            return this.unionId;
        }

    }

    public static class GetTicketResponseBodyTakers extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>贤文</p>
         */
        @NameInMap("NickName")
        public String nickName;

        /**
         * <strong>example:</strong>
         * <p>012345</p>
         */
        @NameInMap("UnionId")
        public String unionId;

        public static GetTicketResponseBodyTakers build(java.util.Map<String, ?> map) throws Exception {
            GetTicketResponseBodyTakers self = new GetTicketResponseBodyTakers();
            return TeaModel.build(map, self);
        }

        public GetTicketResponseBodyTakers setNickName(String nickName) {
            this.nickName = nickName;
            return this;
        }
        public String getNickName() {
            return this.nickName;
        }

        public GetTicketResponseBodyTakers setUnionId(String unionId) {
            this.unionId = unionId;
            return this;
        }
        public String getUnionId() {
            return this.unionId;
        }

    }

    public static class GetTicketResponseBodyTemplate extends TeaModel {
        /**
         * <p>OpenTemplateBizId</p>
         * 
         * <strong>example:</strong>
         * <p>OpenTemplateBizId</p>
         */
        @NameInMap("OpenTemplateBizId")
        public String openTemplateBizId;

        /**
         * <p>OpenTemplateBizId</p>
         * 
         * <strong>example:</strong>
         * <p>OpenTemplateBizId</p>
         */
        @NameInMap("OpenTemplateId")
        public String openTemplateId;

        @NameInMap("TemplateName")
        public String templateName;

        public static GetTicketResponseBodyTemplate build(java.util.Map<String, ?> map) throws Exception {
            GetTicketResponseBodyTemplate self = new GetTicketResponseBodyTemplate();
            return TeaModel.build(map, self);
        }

        public GetTicketResponseBodyTemplate setOpenTemplateBizId(String openTemplateBizId) {
            this.openTemplateBizId = openTemplateBizId;
            return this;
        }
        public String getOpenTemplateBizId() {
            return this.openTemplateBizId;
        }

        public GetTicketResponseBodyTemplate setOpenTemplateId(String openTemplateId) {
            this.openTemplateId = openTemplateId;
            return this;
        }
        public String getOpenTemplateId() {
            return this.openTemplateId;
        }

        public GetTicketResponseBodyTemplate setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

    }

}
