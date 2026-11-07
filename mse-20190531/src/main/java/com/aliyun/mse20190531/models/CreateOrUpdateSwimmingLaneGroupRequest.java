// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class CreateOrUpdateSwimmingLaneGroupRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values:</p>
     * <ul>
     * <li>zh: Chinese.</li>
     * <li>en: English.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>The IDs of the applications. Separate multiple IDs with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>xxxxn1po62@492b8f98d4bxxxx,xxxxn1po62@2d8f5d1b7f2xxxx</p>
     */
    @NameInMap("AppIds")
    public String appIds;

    /**
     * <p>The end-to-end canary release mode. Valid values:</p>
     * <ul>
     * <li>0: Route by request content.</li>
     * <li>1: Route by proportion.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CanaryModel")
    public Integer canaryModel;

    /**
     * <p><strong>[Deprecated]</strong> Specifies whether to enable canary release for databases.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DbGrayEnable")
    public Boolean dbGrayEnable;

    /**
     * <p>The entry application. Format: Source system:ID. Examples:</p>
     * <ul>
     * <li>mse:${MSE application ID}</li>
     * <li>mse-gw:${MSE cloud-native gateway ID}</li>
     * <li>apig:${cloud-native API gateway ID}</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>mse-gw:gw-2b1407e050f1446xxxcd2a65fd9xxxx</p>
     */
    @NameInMap("EntryApp")
    public String entryApp;

    /**
     * <p>The ID of the swimlane group. A value of -1 indicates that a swimlane group is created. A value greater than 0 indicates that a specified swimlane group is updated.</p>
     * 
     * <strong>example:</strong>
     * <p>120</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The side where message queue canary release filtering is performed.</p>
     * 
     * <strong>example:</strong>
     * <p>Server</p>
     */
    @NameInMap("MessageQueueFilterSide")
    public String messageQueueFilterSide;

    /**
     * <p>Specifies whether to enable canary release for message queues.</p>
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
     * <p>The name of the swimlane group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>group1</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The name of the MSE namespace.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p><strong>[Deprecated]</strong> The paths. This parameter is required when a Java gateway is used as the entry point.</p>
     */
    @NameInMap("Paths")
    public java.util.List<String> paths;

    /**
     * <p>Specifies whether to record request details.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("RecordCanaryDetail")
    public Boolean recordCanaryDetail;

    /**
     * <p>The region.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("Region")
    public String region;

    /**
     * <p>The IDs of the routes. If a cloud-native gateway is used as the entry point, you must call this operation to pass the IDs of the selected cloud-native gateway routes before creating a swimlane for the swimlane group.</p>
     */
    @NameInMap("RouteIds")
    public java.util.List<Long> routeIds;

    /**
     * <p>The status of the swimlane group. Valid values:</p>
     * <ul>
     * <li>0: Inactive.</li>
     * <li>1: Active.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Status")
    public Integer status;

    /**
     * <p>The version of the end-to-end canary release. Valid values:</p>
     * <ul>
     * <li>0: Not recommended. Routes must be specified.</li>
     * <li>2: Recommended. Routes do not need to be specified.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("SwimVersion")
    public Integer swimVersion;

    public static CreateOrUpdateSwimmingLaneGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateOrUpdateSwimmingLaneGroupRequest self = new CreateOrUpdateSwimmingLaneGroupRequest();
        return TeaModel.build(map, self);
    }

    public CreateOrUpdateSwimmingLaneGroupRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public CreateOrUpdateSwimmingLaneGroupRequest setAppIds(String appIds) {
        this.appIds = appIds;
        return this;
    }
    public String getAppIds() {
        return this.appIds;
    }

    public CreateOrUpdateSwimmingLaneGroupRequest setCanaryModel(Integer canaryModel) {
        this.canaryModel = canaryModel;
        return this;
    }
    public Integer getCanaryModel() {
        return this.canaryModel;
    }

    public CreateOrUpdateSwimmingLaneGroupRequest setDbGrayEnable(Boolean dbGrayEnable) {
        this.dbGrayEnable = dbGrayEnable;
        return this;
    }
    public Boolean getDbGrayEnable() {
        return this.dbGrayEnable;
    }

    public CreateOrUpdateSwimmingLaneGroupRequest setEntryApp(String entryApp) {
        this.entryApp = entryApp;
        return this;
    }
    public String getEntryApp() {
        return this.entryApp;
    }

    public CreateOrUpdateSwimmingLaneGroupRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public CreateOrUpdateSwimmingLaneGroupRequest setMessageQueueFilterSide(String messageQueueFilterSide) {
        this.messageQueueFilterSide = messageQueueFilterSide;
        return this;
    }
    public String getMessageQueueFilterSide() {
        return this.messageQueueFilterSide;
    }

    public CreateOrUpdateSwimmingLaneGroupRequest setMessageQueueGrayEnable(Boolean messageQueueGrayEnable) {
        this.messageQueueGrayEnable = messageQueueGrayEnable;
        return this;
    }
    public Boolean getMessageQueueGrayEnable() {
        return this.messageQueueGrayEnable;
    }

    public CreateOrUpdateSwimmingLaneGroupRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateOrUpdateSwimmingLaneGroupRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public CreateOrUpdateSwimmingLaneGroupRequest setPaths(java.util.List<String> paths) {
        this.paths = paths;
        return this;
    }
    public java.util.List<String> getPaths() {
        return this.paths;
    }

    public CreateOrUpdateSwimmingLaneGroupRequest setRecordCanaryDetail(Boolean recordCanaryDetail) {
        this.recordCanaryDetail = recordCanaryDetail;
        return this;
    }
    public Boolean getRecordCanaryDetail() {
        return this.recordCanaryDetail;
    }

    public CreateOrUpdateSwimmingLaneGroupRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public CreateOrUpdateSwimmingLaneGroupRequest setRouteIds(java.util.List<Long> routeIds) {
        this.routeIds = routeIds;
        return this;
    }
    public java.util.List<Long> getRouteIds() {
        return this.routeIds;
    }

    public CreateOrUpdateSwimmingLaneGroupRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public CreateOrUpdateSwimmingLaneGroupRequest setSwimVersion(Integer swimVersion) {
        this.swimVersion = swimVersion;
        return this;
    }
    public Integer getSwimVersion() {
        return this.swimVersion;
    }

}
