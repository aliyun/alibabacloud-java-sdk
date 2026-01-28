// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class ModifyAppRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>app-xxx</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <strong>example:</strong>
     * <p>App1</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("AppTags")
    public java.util.List<ModifyAppRequestAppTags> appTags;

    /**
     * <strong>example:</strong>
     * <p>0c593ea1-3bea-11e9-b96b-88e9fe63****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <strong>example:</strong>
     * <p>This is description.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <strong>example:</strong>
     * <p>dev789`</p>
     */
    @NameInMap("Owner")
    public String owner;

    /**
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ReportSendEnabled")
    public Boolean reportSendEnabled;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Weekly</p>
     */
    @NameInMap("SubscribePeriod")
    public String subscribePeriod;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Subscribe</p>
     */
    @NameInMap("SubscribeStatus")
    public String subscribeStatus;

    public static ModifyAppRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyAppRequest self = new ModifyAppRequest();
        return TeaModel.build(map, self);
    }

    public ModifyAppRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ModifyAppRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public ModifyAppRequest setAppTags(java.util.List<ModifyAppRequestAppTags> appTags) {
        this.appTags = appTags;
        return this;
    }
    public java.util.List<ModifyAppRequestAppTags> getAppTags() {
        return this.appTags;
    }

    public ModifyAppRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ModifyAppRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyAppRequest setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public ModifyAppRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyAppRequest setReportSendEnabled(Boolean reportSendEnabled) {
        this.reportSendEnabled = reportSendEnabled;
        return this;
    }
    public Boolean getReportSendEnabled() {
        return this.reportSendEnabled;
    }

    public ModifyAppRequest setSubscribePeriod(String subscribePeriod) {
        this.subscribePeriod = subscribePeriod;
        return this;
    }
    public String getSubscribePeriod() {
        return this.subscribePeriod;
    }

    public ModifyAppRequest setSubscribeStatus(String subscribeStatus) {
        this.subscribeStatus = subscribeStatus;
        return this;
    }
    public String getSubscribeStatus() {
        return this.subscribeStatus;
    }

    public static class ModifyAppRequestAppTags extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>key</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <strong>example:</strong>
         * <p>value</p>
         */
        @NameInMap("TagValue")
        public String tagValue;

        public static ModifyAppRequestAppTags build(java.util.Map<String, ?> map) throws Exception {
            ModifyAppRequestAppTags self = new ModifyAppRequestAppTags();
            return TeaModel.build(map, self);
        }

        public ModifyAppRequestAppTags setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public ModifyAppRequestAppTags setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

}
