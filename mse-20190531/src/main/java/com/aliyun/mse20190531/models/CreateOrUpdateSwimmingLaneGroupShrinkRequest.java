// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class CreateOrUpdateSwimmingLaneGroupShrinkRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values:</p>
     * <ul>
     * <li>zh: Chinese</li>
     * <li>en: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>The IDs of applications. Separate application IDs with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>hkhon1po62@c3df23522baa898,hkhon1po62@66e5235415730a5,hkhon1po62@958bba95910341f</p>
     */
    @NameInMap("AppIds")
    public String appIds;

    @NameInMap("CanaryModel")
    public Integer canaryModel;

    /**
     * <p>Specifies whether to enable database canary release.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DbGrayEnable")
    public Boolean dbGrayEnable;

    /**
     * <p>The ingress application.</p>
     * 
     * <strong>example:</strong>
     * <p>Ingress</p>
     */
    @NameInMap("EntryApp")
    public String entryApp;

    /**
     * <p>The ID of the lane group. A value of -1 is used to create a lane group. A value greater than 0 is used to modify the specified lane group.</p>
     * 
     * <strong>example:</strong>
     * <p>120</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The side for message filtering when the canary release for messaging feature is enabled.</p>
     * 
     * <strong>example:</strong>
     * <p>Server</p>
     */
    @NameInMap("MessageQueueFilterSide")
    public String messageQueueFilterSide;

    /**
     * <p>Specifies whether to enable canary release for messaging.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("MessageQueueGrayEnable")
    public Boolean messageQueueGrayEnable;

    /**
     * <p>The name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>group1</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The name of the Microservices Engine (MSE) namespace.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("Paths")
    public String pathsShrink;

    /**
     * <p>Specifies whether to record request details.</p>
     */
    @NameInMap("RecordCanaryDetail")
    public Boolean recordCanaryDetail;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("Region")
    public String region;

    @NameInMap("RouteIds")
    public String routeIdsShrink;

    /**
     * <p>The status of the lane group. The value 0 specifies that the lane group is disabled. The value 1 specifies that the lane group is enabled.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Status")
    public Integer status;

    public static CreateOrUpdateSwimmingLaneGroupShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateOrUpdateSwimmingLaneGroupShrinkRequest self = new CreateOrUpdateSwimmingLaneGroupShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateOrUpdateSwimmingLaneGroupShrinkRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public CreateOrUpdateSwimmingLaneGroupShrinkRequest setAppIds(String appIds) {
        this.appIds = appIds;
        return this;
    }
    public String getAppIds() {
        return this.appIds;
    }

    public CreateOrUpdateSwimmingLaneGroupShrinkRequest setCanaryModel(Integer canaryModel) {
        this.canaryModel = canaryModel;
        return this;
    }
    public Integer getCanaryModel() {
        return this.canaryModel;
    }

    public CreateOrUpdateSwimmingLaneGroupShrinkRequest setDbGrayEnable(Boolean dbGrayEnable) {
        this.dbGrayEnable = dbGrayEnable;
        return this;
    }
    public Boolean getDbGrayEnable() {
        return this.dbGrayEnable;
    }

    public CreateOrUpdateSwimmingLaneGroupShrinkRequest setEntryApp(String entryApp) {
        this.entryApp = entryApp;
        return this;
    }
    public String getEntryApp() {
        return this.entryApp;
    }

    public CreateOrUpdateSwimmingLaneGroupShrinkRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public CreateOrUpdateSwimmingLaneGroupShrinkRequest setMessageQueueFilterSide(String messageQueueFilterSide) {
        this.messageQueueFilterSide = messageQueueFilterSide;
        return this;
    }
    public String getMessageQueueFilterSide() {
        return this.messageQueueFilterSide;
    }

    public CreateOrUpdateSwimmingLaneGroupShrinkRequest setMessageQueueGrayEnable(Boolean messageQueueGrayEnable) {
        this.messageQueueGrayEnable = messageQueueGrayEnable;
        return this;
    }
    public Boolean getMessageQueueGrayEnable() {
        return this.messageQueueGrayEnable;
    }

    public CreateOrUpdateSwimmingLaneGroupShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateOrUpdateSwimmingLaneGroupShrinkRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public CreateOrUpdateSwimmingLaneGroupShrinkRequest setPathsShrink(String pathsShrink) {
        this.pathsShrink = pathsShrink;
        return this;
    }
    public String getPathsShrink() {
        return this.pathsShrink;
    }

    public CreateOrUpdateSwimmingLaneGroupShrinkRequest setRecordCanaryDetail(Boolean recordCanaryDetail) {
        this.recordCanaryDetail = recordCanaryDetail;
        return this;
    }
    public Boolean getRecordCanaryDetail() {
        return this.recordCanaryDetail;
    }

    public CreateOrUpdateSwimmingLaneGroupShrinkRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public CreateOrUpdateSwimmingLaneGroupShrinkRequest setRouteIdsShrink(String routeIdsShrink) {
        this.routeIdsShrink = routeIdsShrink;
        return this;
    }
    public String getRouteIdsShrink() {
        return this.routeIdsShrink;
    }

    public CreateOrUpdateSwimmingLaneGroupShrinkRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

}
