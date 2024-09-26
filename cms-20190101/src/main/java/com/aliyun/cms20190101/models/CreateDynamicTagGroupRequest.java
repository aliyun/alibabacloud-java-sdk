// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class CreateDynamicTagGroupRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ECS_Group</p>
     */
    @NameInMap("ContactGroupList")
    public java.util.List<String> contactGroupList;

    /**
     * <p>Specifies whether the CloudMonitor agent is automatically installed for the application group. CloudMonitor determines whether to automatically install the CloudMonitor agent for the hosts in an application group based on the value of this parameter. Valid values:</p>
     * <ul>
     * <li>true: The CloudMonitor agent is automatically installed.</li>
     * <li>false (default value): The CloudMonitor agent is not automatically installed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableInstallAgent")
    public Boolean enableInstallAgent;

    /**
     * <p>Specifies whether the application group automatically subscribes to event notifications. If events whose severity level is critical or warning occur on resources in an application group, CloudMonitor sends alert notifications. Valid values:</p>
     * <ul>
     * <li>true: The application group automatically subscribes to event notifications.</li>
     * <li>false (default value): The application group does not automatically subscribe to event notifications.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableSubscribeEvent")
    public Boolean enableSubscribeEvent;

    /**
     * <p>The conditional expressions used to create an application group based on the tag.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("MatchExpress")
    public java.util.List<CreateDynamicTagGroupRequestMatchExpress> matchExpress;

    /**
     * <p>The relationship between the conditional expressions for the tag values of the cloud resources. Valid values:</p>
     * <ul>
     * <li>and (default value)</li>
     * <li>or</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>and</p>
     */
    @NameInMap("MatchExpressFilterRelation")
    public String matchExpressFilterRelation;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The tag keys of the cloud resources.</p>
     * <p>For more information about how to obtain tag keys, see <a href="https://help.aliyun.com/document_detail/145558.html">DescribeTagKeyList</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ecs_instance</p>
     */
    @NameInMap("TagKey")
    public String tagKey;

    /**
     * <p>The ID of the region to which the tags belong.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("TagRegionId")
    public String tagRegionId;

    /**
     * <strong>example:</strong>
     * <p>85****</p>
     */
    @NameInMap("TemplateIdList")
    public java.util.List<String> templateIdList;

    public static CreateDynamicTagGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDynamicTagGroupRequest self = new CreateDynamicTagGroupRequest();
        return TeaModel.build(map, self);
    }

    public CreateDynamicTagGroupRequest setContactGroupList(java.util.List<String> contactGroupList) {
        this.contactGroupList = contactGroupList;
        return this;
    }
    public java.util.List<String> getContactGroupList() {
        return this.contactGroupList;
    }

    public CreateDynamicTagGroupRequest setEnableInstallAgent(Boolean enableInstallAgent) {
        this.enableInstallAgent = enableInstallAgent;
        return this;
    }
    public Boolean getEnableInstallAgent() {
        return this.enableInstallAgent;
    }

    public CreateDynamicTagGroupRequest setEnableSubscribeEvent(Boolean enableSubscribeEvent) {
        this.enableSubscribeEvent = enableSubscribeEvent;
        return this;
    }
    public Boolean getEnableSubscribeEvent() {
        return this.enableSubscribeEvent;
    }

    public CreateDynamicTagGroupRequest setMatchExpress(java.util.List<CreateDynamicTagGroupRequestMatchExpress> matchExpress) {
        this.matchExpress = matchExpress;
        return this;
    }
    public java.util.List<CreateDynamicTagGroupRequestMatchExpress> getMatchExpress() {
        return this.matchExpress;
    }

    public CreateDynamicTagGroupRequest setMatchExpressFilterRelation(String matchExpressFilterRelation) {
        this.matchExpressFilterRelation = matchExpressFilterRelation;
        return this;
    }
    public String getMatchExpressFilterRelation() {
        return this.matchExpressFilterRelation;
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

    public CreateDynamicTagGroupRequest setTagRegionId(String tagRegionId) {
        this.tagRegionId = tagRegionId;
        return this;
    }
    public String getTagRegionId() {
        return this.tagRegionId;
    }

    public CreateDynamicTagGroupRequest setTemplateIdList(java.util.List<String> templateIdList) {
        this.templateIdList = templateIdList;
        return this;
    }
    public java.util.List<String> getTemplateIdList() {
        return this.templateIdList;
    }

    public static class CreateDynamicTagGroupRequestMatchExpress extends TeaModel {
        /**
         * <p>The keys of the tags that are used to create the application group. If a specified key is attached to multiple resources, the resources that have the same key-value pair are added to the same group.</p>
         * 
         * <strong>example:</strong>
         * <p>appname</p>
         */
        @NameInMap("TagName")
        public String tagName;

        /**
         * <p>The tag values of the cloud resources. Set the value of N to 1.</p>
         * <blockquote>
         * <p> If you set the <code>MatchExpress.N.TagValueMatchFunction</code> parameter, you must also set the <code>MatchExpress.N.TagValue</code> parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>instance</p>
         */
        @NameInMap("TagValue")
        public String tagValue;

        /**
         * <p>The method that is used to match the tag values of the cloud resources. Set the value of N to 1. Valid values:</p>
         * <ul>
         * <li>contains: contains</li>
         * <li>startWith: starts with a prefix</li>
         * <li>endWith: ends with a suffix</li>
         * <li>notContains: does not contain</li>
         * <li>equals: equals</li>
         * <li>all: matches all</li>
         * </ul>
         * <blockquote>
         * <p> If you set the <code>MatchExpress.N.TagValueMatchFunction</code> parameter, you must also set the <code>MatchExpress.N.TagValue</code> parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>contains</p>
         */
        @NameInMap("TagValueMatchFunction")
        public String tagValueMatchFunction;

        public static CreateDynamicTagGroupRequestMatchExpress build(java.util.Map<String, ?> map) throws Exception {
            CreateDynamicTagGroupRequestMatchExpress self = new CreateDynamicTagGroupRequestMatchExpress();
            return TeaModel.build(map, self);
        }

        public CreateDynamicTagGroupRequestMatchExpress setTagName(String tagName) {
            this.tagName = tagName;
            return this;
        }
        public String getTagName() {
            return this.tagName;
        }

        public CreateDynamicTagGroupRequestMatchExpress setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

        public CreateDynamicTagGroupRequestMatchExpress setTagValueMatchFunction(String tagValueMatchFunction) {
            this.tagValueMatchFunction = tagValueMatchFunction;
            return this;
        }
        public String getTagValueMatchFunction() {
            return this.tagValueMatchFunction;
        }

    }

}
