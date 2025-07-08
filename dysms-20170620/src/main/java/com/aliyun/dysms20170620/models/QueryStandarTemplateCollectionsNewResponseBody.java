// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class QueryStandarTemplateCollectionsNewResponseBody extends TeaModel {
    @NameInMap("List")
    public QueryStandarTemplateCollectionsNewResponseBodyList list;

    @NameInMap("RequestId")
    public String requestId;

    public static QueryStandarTemplateCollectionsNewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryStandarTemplateCollectionsNewResponseBody self = new QueryStandarTemplateCollectionsNewResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryStandarTemplateCollectionsNewResponseBody setList(QueryStandarTemplateCollectionsNewResponseBodyList list) {
        this.list = list;
        return this;
    }
    public QueryStandarTemplateCollectionsNewResponseBodyList getList() {
        return this.list;
    }

    public QueryStandarTemplateCollectionsNewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QueryStandarTemplateCollectionsNewResponseBodyListFcPartnerTemplateDTO extends TeaModel {
        @NameInMap("BusinessType")
        public Integer businessType;

        @NameInMap("FcTag")
        public Long fcTag;

        @NameInMap("I18n")
        public String i18n;

        @NameInMap("Id")
        public Long id;

        @NameInMap("IsDeleted")
        public Integer isDeleted;

        @NameInMap("McBusinessType")
        public Integer mcBusinessType;

        @NameInMap("McCategory")
        public Integer mcCategory;

        @NameInMap("McSignature")
        public String mcSignature;

        @NameInMap("MessageTypeId")
        public Long messageTypeId;

        @NameInMap("OpNick")
        public String opNick;

        @NameInMap("PartnerId")
        public Long partnerId;

        @NameInMap("QualificationId")
        public Long qualificationId;

        @NameInMap("Remark")
        public String remark;

        @NameInMap("SignTemplateId")
        public Long signTemplateId;

        @NameInMap("SignType")
        public Integer signType;

        @NameInMap("SourceId")
        public String sourceId;

        @NameInMap("SpeedLevel")
        public Integer speedLevel;

        @NameInMap("State")
        public Integer state;

        @NameInMap("TemplateCode")
        public String templateCode;

        @NameInMap("TemplateContent")
        public String templateContent;

        @NameInMap("TemplateId")
        public Long templateId;

        @NameInMap("TemplateName")
        public String templateName;

        @NameInMap("TemplateParamRule")
        public String templateParamRule;

        @NameInMap("TemplateSenderType")
        public Integer templateSenderType;

        @NameInMap("TemplateType")
        public Integer templateType;

        @NameInMap("TotalCountLimit")
        public Long totalCountLimit;

        @NameInMap("VoiceType")
        public Integer voiceType;

        public static QueryStandarTemplateCollectionsNewResponseBodyListFcPartnerTemplateDTO build(java.util.Map<String, ?> map) throws Exception {
            QueryStandarTemplateCollectionsNewResponseBodyListFcPartnerTemplateDTO self = new QueryStandarTemplateCollectionsNewResponseBodyListFcPartnerTemplateDTO();
            return TeaModel.build(map, self);
        }

        public QueryStandarTemplateCollectionsNewResponseBodyListFcPartnerTemplateDTO setBusinessType(Integer businessType) {
            this.businessType = businessType;
            return this;
        }
        public Integer getBusinessType() {
            return this.businessType;
        }

        public QueryStandarTemplateCollectionsNewResponseBodyListFcPartnerTemplateDTO setFcTag(Long fcTag) {
            this.fcTag = fcTag;
            return this;
        }
        public Long getFcTag() {
            return this.fcTag;
        }

        public QueryStandarTemplateCollectionsNewResponseBodyListFcPartnerTemplateDTO setI18n(String i18n) {
            this.i18n = i18n;
            return this;
        }
        public String getI18n() {
            return this.i18n;
        }

        public QueryStandarTemplateCollectionsNewResponseBodyListFcPartnerTemplateDTO setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryStandarTemplateCollectionsNewResponseBodyListFcPartnerTemplateDTO setIsDeleted(Integer isDeleted) {
            this.isDeleted = isDeleted;
            return this;
        }
        public Integer getIsDeleted() {
            return this.isDeleted;
        }

        public QueryStandarTemplateCollectionsNewResponseBodyListFcPartnerTemplateDTO setMcBusinessType(Integer mcBusinessType) {
            this.mcBusinessType = mcBusinessType;
            return this;
        }
        public Integer getMcBusinessType() {
            return this.mcBusinessType;
        }

        public QueryStandarTemplateCollectionsNewResponseBodyListFcPartnerTemplateDTO setMcCategory(Integer mcCategory) {
            this.mcCategory = mcCategory;
            return this;
        }
        public Integer getMcCategory() {
            return this.mcCategory;
        }

        public QueryStandarTemplateCollectionsNewResponseBodyListFcPartnerTemplateDTO setMcSignature(String mcSignature) {
            this.mcSignature = mcSignature;
            return this;
        }
        public String getMcSignature() {
            return this.mcSignature;
        }

        public QueryStandarTemplateCollectionsNewResponseBodyListFcPartnerTemplateDTO setMessageTypeId(Long messageTypeId) {
            this.messageTypeId = messageTypeId;
            return this;
        }
        public Long getMessageTypeId() {
            return this.messageTypeId;
        }

        public QueryStandarTemplateCollectionsNewResponseBodyListFcPartnerTemplateDTO setOpNick(String opNick) {
            this.opNick = opNick;
            return this;
        }
        public String getOpNick() {
            return this.opNick;
        }

        public QueryStandarTemplateCollectionsNewResponseBodyListFcPartnerTemplateDTO setPartnerId(Long partnerId) {
            this.partnerId = partnerId;
            return this;
        }
        public Long getPartnerId() {
            return this.partnerId;
        }

        public QueryStandarTemplateCollectionsNewResponseBodyListFcPartnerTemplateDTO setQualificationId(Long qualificationId) {
            this.qualificationId = qualificationId;
            return this;
        }
        public Long getQualificationId() {
            return this.qualificationId;
        }

        public QueryStandarTemplateCollectionsNewResponseBodyListFcPartnerTemplateDTO setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public QueryStandarTemplateCollectionsNewResponseBodyListFcPartnerTemplateDTO setSignTemplateId(Long signTemplateId) {
            this.signTemplateId = signTemplateId;
            return this;
        }
        public Long getSignTemplateId() {
            return this.signTemplateId;
        }

        public QueryStandarTemplateCollectionsNewResponseBodyListFcPartnerTemplateDTO setSignType(Integer signType) {
            this.signType = signType;
            return this;
        }
        public Integer getSignType() {
            return this.signType;
        }

        public QueryStandarTemplateCollectionsNewResponseBodyListFcPartnerTemplateDTO setSourceId(String sourceId) {
            this.sourceId = sourceId;
            return this;
        }
        public String getSourceId() {
            return this.sourceId;
        }

        public QueryStandarTemplateCollectionsNewResponseBodyListFcPartnerTemplateDTO setSpeedLevel(Integer speedLevel) {
            this.speedLevel = speedLevel;
            return this;
        }
        public Integer getSpeedLevel() {
            return this.speedLevel;
        }

        public QueryStandarTemplateCollectionsNewResponseBodyListFcPartnerTemplateDTO setState(Integer state) {
            this.state = state;
            return this;
        }
        public Integer getState() {
            return this.state;
        }

        public QueryStandarTemplateCollectionsNewResponseBodyListFcPartnerTemplateDTO setTemplateCode(String templateCode) {
            this.templateCode = templateCode;
            return this;
        }
        public String getTemplateCode() {
            return this.templateCode;
        }

        public QueryStandarTemplateCollectionsNewResponseBodyListFcPartnerTemplateDTO setTemplateContent(String templateContent) {
            this.templateContent = templateContent;
            return this;
        }
        public String getTemplateContent() {
            return this.templateContent;
        }

        public QueryStandarTemplateCollectionsNewResponseBodyListFcPartnerTemplateDTO setTemplateId(Long templateId) {
            this.templateId = templateId;
            return this;
        }
        public Long getTemplateId() {
            return this.templateId;
        }

        public QueryStandarTemplateCollectionsNewResponseBodyListFcPartnerTemplateDTO setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

        public QueryStandarTemplateCollectionsNewResponseBodyListFcPartnerTemplateDTO setTemplateParamRule(String templateParamRule) {
            this.templateParamRule = templateParamRule;
            return this;
        }
        public String getTemplateParamRule() {
            return this.templateParamRule;
        }

        public QueryStandarTemplateCollectionsNewResponseBodyListFcPartnerTemplateDTO setTemplateSenderType(Integer templateSenderType) {
            this.templateSenderType = templateSenderType;
            return this;
        }
        public Integer getTemplateSenderType() {
            return this.templateSenderType;
        }

        public QueryStandarTemplateCollectionsNewResponseBodyListFcPartnerTemplateDTO setTemplateType(Integer templateType) {
            this.templateType = templateType;
            return this;
        }
        public Integer getTemplateType() {
            return this.templateType;
        }

        public QueryStandarTemplateCollectionsNewResponseBodyListFcPartnerTemplateDTO setTotalCountLimit(Long totalCountLimit) {
            this.totalCountLimit = totalCountLimit;
            return this;
        }
        public Long getTotalCountLimit() {
            return this.totalCountLimit;
        }

        public QueryStandarTemplateCollectionsNewResponseBodyListFcPartnerTemplateDTO setVoiceType(Integer voiceType) {
            this.voiceType = voiceType;
            return this;
        }
        public Integer getVoiceType() {
            return this.voiceType;
        }

    }

    public static class QueryStandarTemplateCollectionsNewResponseBodyList extends TeaModel {
        @NameInMap("FcPartnerTemplateDTO")
        public java.util.List<QueryStandarTemplateCollectionsNewResponseBodyListFcPartnerTemplateDTO> fcPartnerTemplateDTO;

        public static QueryStandarTemplateCollectionsNewResponseBodyList build(java.util.Map<String, ?> map) throws Exception {
            QueryStandarTemplateCollectionsNewResponseBodyList self = new QueryStandarTemplateCollectionsNewResponseBodyList();
            return TeaModel.build(map, self);
        }

        public QueryStandarTemplateCollectionsNewResponseBodyList setFcPartnerTemplateDTO(java.util.List<QueryStandarTemplateCollectionsNewResponseBodyListFcPartnerTemplateDTO> fcPartnerTemplateDTO) {
            this.fcPartnerTemplateDTO = fcPartnerTemplateDTO;
            return this;
        }
        public java.util.List<QueryStandarTemplateCollectionsNewResponseBodyListFcPartnerTemplateDTO> getFcPartnerTemplateDTO() {
            return this.fcPartnerTemplateDTO;
        }

    }

}
