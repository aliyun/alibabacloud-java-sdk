// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class CreateDynamicTagGroupRequest extends TeaModel {
    /**
     * <p>The alert contact groups. Valid values of N: 1 to 100. Alert notifications for the application group are sent to the alert contacts in the alert contact groups.</p>
     * <p>An alert contact group contains one or more alert contacts. For more information about how to create alert contacts and alert contact groups, see <a href="https://help.aliyun.com/document_detail/114923.html">PutContact</a> and <a href="https://help.aliyun.com/document_detail/114929.html">PutContactGroup</a>. For more information about how to query alert contact groups, see <a href="https://help.aliyun.com/document_detail/114922.html">DescribeContactGroupList</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ECS_Group</p>
     */
    @NameInMap("ContactGroupList")
    public java.util.List<String> contactGroupList;

    /**
     * <p>Specifies whether to perform only a dry run on the request. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Performs a dry run without creating the application group. The system checks whether required parameters are specified, the request format is valid, and service limits are met. If the request fails the dry run, an error is returned. If the request passes the dry run, the <code>DryRunOperation</code> error code is returned.</li>
     * <li><strong>false</strong>: Performs a dry run and sends the actual request. If the request passes the dry run, the application group is created. This is the default value.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>Specifies whether to enable automatic installation of the CloudMonitor agent for the application group. CloudMonitor automatically installs the CloudMonitor agent on the hosts in the application group. Valid values:</p>
     * <ul>
     * <li><p>true: Enables automatic installation.</p>
     * </li>
     * <li><p>false: Disables automatic installation. This is the default value.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableInstallAgent")
    public Boolean enableInstallAgent;

    /**
     * <p>Specifies whether to enable automatic subscription to event notifications for the application group. When critical or warning events occur on resources in the application group, CloudMonitor sends alert notifications. Valid values:</p>
     * <ul>
     * <li><p>true: Enables automatic subscription.</p>
     * </li>
     * <li><p>false: Disables automatic subscription. This is the default value.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableSubscribeEvent")
    public Boolean enableSubscribeEvent;

    /**
     * <p>The matching expression used to generate the application group based on tags.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("MatchExpress")
    public java.util.List<CreateDynamicTagGroupRequestMatchExpress> matchExpress;

    /**
     * <p>The relationship between the conditional expressions of the resource tag values. Valid values:</p>
     * <ul>
     * <li>and: Uses the AND logical operator. This is the default value.</li>
     * <li>or: Uses the OR logical operator.</li>
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
     * <p>The tag key of the resource.</p>
     * <p>For more information about how to query the tag keys of resources, see <a href="https://help.aliyun.com/document_detail/145558.html">DescribeTagKeyList</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ecs_instance</p>
     */
    @NameInMap("TagKey")
    public String tagKey;

    /**
     * <p>The region ID of the tag.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("TagRegionId")
    public String tagRegionId;

    /**
     * <p>The IDs of the alert templates.</p>
     * <p>For more information about how to query the IDs of alert templates, see <a href="https://help.aliyun.com/document_detail/114982.html">DescribeMetricRuleTemplateList</a>.</p>
     * 
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

    public CreateDynamicTagGroupRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
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
         * <p>The tag key used to create the group. If multiple resources contain this key, the resources that meet the filter conditions are added to the same group based on the same key-value pair.</p>
         * 
         * <strong>example:</strong>
         * <p>appname</p>
         */
        @NameInMap("TagName")
        public String tagName;

        /**
         * <p>The tag value of the resource. Valid values of N: 1.</p>
         * <blockquote>
         * <p>You must specify both the <code>MatchExpress.N.TagValueMatchFunction</code> and <code>MatchExpress.N.TagValue</code> parameters.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>instance</p>
         */
        @NameInMap("TagValue")
        public String tagValue;

        /**
         * <p>The matching method for the tag value of the resource. Valid values of N: 1. Valid values:</p>
         * <ul>
         * <li>contains: includes the specified value</li>
         * <li>startWith: starts with the specified value</li>
         * <li>endWith: ends with the specified value</li>
         * <li>notContains: does not include the specified value</li>
         * <li>equals: equals the specified value</li>
         * <li>all: all values</li>
         * </ul>
         * <blockquote>
         * <p>You must specify both the <code>MatchExpress.N.TagValueMatchFunction</code> and <code>MatchExpress.N.TagValue</code> parameters.</p>
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
