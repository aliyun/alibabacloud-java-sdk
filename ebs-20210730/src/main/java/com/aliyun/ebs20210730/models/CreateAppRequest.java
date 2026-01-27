// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class CreateAppRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
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
    public java.util.List<CreateAppRequestAppTags> appTags;

    /**
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-42665544****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <strong>example:</strong>
     * <p>1/0</p>
     */
    @NameInMap("Owner")
    public String owner;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>false</p>
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

    public static CreateAppRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAppRequest self = new CreateAppRequest();
        return TeaModel.build(map, self);
    }

    public CreateAppRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public CreateAppRequest setAppTags(java.util.List<CreateAppRequestAppTags> appTags) {
        this.appTags = appTags;
        return this;
    }
    public java.util.List<CreateAppRequestAppTags> getAppTags() {
        return this.appTags;
    }

    public CreateAppRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateAppRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateAppRequest setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public CreateAppRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateAppRequest setReportSendEnabled(Boolean reportSendEnabled) {
        this.reportSendEnabled = reportSendEnabled;
        return this;
    }
    public Boolean getReportSendEnabled() {
        return this.reportSendEnabled;
    }

    public CreateAppRequest setSubscribePeriod(String subscribePeriod) {
        this.subscribePeriod = subscribePeriod;
        return this;
    }
    public String getSubscribePeriod() {
        return this.subscribePeriod;
    }

    public CreateAppRequest setSubscribeStatus(String subscribeStatus) {
        this.subscribeStatus = subscribeStatus;
        return this;
    }
    public String getSubscribeStatus() {
        return this.subscribeStatus;
    }

    public static class CreateAppRequestAppTags extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>controlledBy</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <strong>example:</strong>
         * <p>ear</p>
         */
        @NameInMap("TagValue")
        public String tagValue;

        public static CreateAppRequestAppTags build(java.util.Map<String, ?> map) throws Exception {
            CreateAppRequestAppTags self = new CreateAppRequestAppTags();
            return TeaModel.build(map, self);
        }

        public CreateAppRequestAppTags setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public CreateAppRequestAppTags setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

}
