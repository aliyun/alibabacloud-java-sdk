// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class CreateDynamicTagGroupRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("TagKey")
    public String tagKey;

    @NameInMap("EnableSubscribeEvent")
    public Boolean enableSubscribeEvent;

    @NameInMap("EnableInstallAgent")
    public Boolean enableInstallAgent;

    @NameInMap("MatchExpressFilterRelation")
    public String matchExpressFilterRelation;

    @NameInMap("MatchExpress")
    public java.util.List<CreateDynamicTagGroupRequestMatchExpress> matchExpress;

    @NameInMap("ContactGroupList")
    public java.util.List<String> contactGroupList;

    @NameInMap("TemplateIdList")
    public java.util.List<String> templateIdList;

    public static CreateDynamicTagGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDynamicTagGroupRequest self = new CreateDynamicTagGroupRequest();
        return TeaModel.build(map, self);
    }

    public CreateDynamicTagGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateDynamicTagGroupRequest setTagKey(String tagKey) {
        this.tagKey = tagKey;
        return this;
    }
    public String getTagKey() {
        return this.tagKey;
    }

    public CreateDynamicTagGroupRequest setEnableSubscribeEvent(Boolean enableSubscribeEvent) {
        this.enableSubscribeEvent = enableSubscribeEvent;
        return this;
    }
    public Boolean getEnableSubscribeEvent() {
        return this.enableSubscribeEvent;
    }

    public CreateDynamicTagGroupRequest setEnableInstallAgent(Boolean enableInstallAgent) {
        this.enableInstallAgent = enableInstallAgent;
        return this;
    }
    public Boolean getEnableInstallAgent() {
        return this.enableInstallAgent;
    }

    public CreateDynamicTagGroupRequest setMatchExpressFilterRelation(String matchExpressFilterRelation) {
        this.matchExpressFilterRelation = matchExpressFilterRelation;
        return this;
    }
    public String getMatchExpressFilterRelation() {
        return this.matchExpressFilterRelation;
    }

    public CreateDynamicTagGroupRequest setMatchExpress(java.util.List<CreateDynamicTagGroupRequestMatchExpress> matchExpress) {
        this.matchExpress = matchExpress;
        return this;
    }
    public java.util.List<CreateDynamicTagGroupRequestMatchExpress> getMatchExpress() {
        return this.matchExpress;
    }

    public CreateDynamicTagGroupRequest setContactGroupList(java.util.List<String> contactGroupList) {
        this.contactGroupList = contactGroupList;
        return this;
    }
    public java.util.List<String> getContactGroupList() {
        return this.contactGroupList;
    }

    public CreateDynamicTagGroupRequest setTemplateIdList(java.util.List<String> templateIdList) {
        this.templateIdList = templateIdList;
        return this;
    }
    public java.util.List<String> getTemplateIdList() {
        return this.templateIdList;
    }

    public static class CreateDynamicTagGroupRequestMatchExpress extends TeaModel {
        @NameInMap("TagValueMatchFunction")
        public String tagValueMatchFunction;

        @NameInMap("TagValue")
        public String tagValue;

        public static CreateDynamicTagGroupRequestMatchExpress build(java.util.Map<String, ?> map) throws Exception {
            CreateDynamicTagGroupRequestMatchExpress self = new CreateDynamicTagGroupRequestMatchExpress();
            return TeaModel.build(map, self);
        }

        public CreateDynamicTagGroupRequestMatchExpress setTagValueMatchFunction(String tagValueMatchFunction) {
            this.tagValueMatchFunction = tagValueMatchFunction;
            return this;
        }
        public String getTagValueMatchFunction() {
            return this.tagValueMatchFunction;
        }

        public CreateDynamicTagGroupRequestMatchExpress setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

}
