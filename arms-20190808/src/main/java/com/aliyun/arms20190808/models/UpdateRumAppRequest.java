// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class UpdateRumAppRequest extends TeaModel {
    @NameInMap("AppConfig")
    public String appConfig;

    /**
     * <p>Specifies whether to restart the application the next day. Valid values: true and false.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoRestart")
    public Boolean autoRestart;

    /**
     * <p>The collection configurations of the mobile SDK. You can enable or disable collection configurations based on the app version.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;moduleConfig\&quot;:{\&quot;enable\&quot;:true,\&quot;defaultConfig\&quot;:{\&quot;network\&quot;:{\&quot;enable\&quot;:true},\&quot;h5\&quot;:{\&quot;enable\&quot;:true},\&quot;routechange\&quot;:{\&quot;enable\&quot;:true},\&quot;crash\&quot;:{\&quot;enable\&quot;:true},\&quot;view\&quot;:{\&quot;enable\&quot;:true},\&quot;coollaunch\&quot;:{\&quot;enable\&quot;:true},\&quot;hotlaunch\&quot;:{\&quot;enable\&quot;:true},\&quot;action\&quot;:{\&quot;enable\&quot;:true},\&quot;lagstuck\&quot;:{\&quot;enable\&quot;:true},\&quot;lagfps\&quot;:{\&quot;enable\&quot;:true},\&quot;statechange\&quot;:{\&quot;enable\&quot;:true},\&quot;anr\&quot;:{\&quot;enable\&quot;:true},\&quot;customlog\&quot;:{\&quot;enable\&quot;:true},\&quot;customevent\&quot;:{\&quot;enable\&quot;:true},\&quot;custommetric\&quot;:{\&quot;enable\&quot;:true}},\&quot;versionConfigs\&quot;:{\&quot;1.1.0\&quot;:{\&quot;useCustom\&quot;:true,\&quot;customConfig\&quot;:{\&quot;network\&quot;:{\&quot;enable\&quot;:true},\&quot;h5\&quot;:{\&quot;enable\&quot;:true},\&quot;routechange\&quot;:{\&quot;enable\&quot;:true},\&quot;crash\&quot;:{\&quot;enable\&quot;:true},\&quot;view\&quot;:{\&quot;enable\&quot;:true},\&quot;coollaunch\&quot;:{\&quot;enable\&quot;:true},\&quot;hotlaunch\&quot;:{\&quot;enable\&quot;:true},\&quot;action\&quot;:{\&quot;enable\&quot;:true},\&quot;lagstuck\&quot;:{\&quot;enable\&quot;:false},\&quot;lagfps\&quot;:{\&quot;enable\&quot;:false},\&quot;statechange\&quot;:{\&quot;enable\&quot;:true},\&quot;anr\&quot;:{\&quot;enable\&quot;:true},\&quot;customlog\&quot;:{\&quot;enable\&quot;:true},\&quot;customevent\&quot;:{\&quot;enable\&quot;:true},\&quot;custommetric\&quot;:{\&quot;enable\&quot;:true}}},\&quot;1.2.0\&quot;:{\&quot;useCustom\&quot;:false,\&quot;customConfig\&quot;:{}}}}}</p>
     */
    @NameInMap("BackendServiceTraceRegion")
    public String backendServiceTraceRegion;

    /**
     * <p>The collection configurations of the mobile SDK. You can enable or disable collection configurations based on the app version.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;moduleConfig\&quot;:{\&quot;enable\&quot;:true,\&quot;defaultConfig\&quot;:{\&quot;network\&quot;:{\&quot;enable\&quot;:true},\&quot;h5\&quot;:{\&quot;enable\&quot;:true},\&quot;routechange\&quot;:{\&quot;enable\&quot;:true},\&quot;crash\&quot;:{\&quot;enable\&quot;:true},\&quot;view\&quot;:{\&quot;enable\&quot;:true},\&quot;coollaunch\&quot;:{\&quot;enable\&quot;:true},\&quot;hotlaunch\&quot;:{\&quot;enable\&quot;:true},\&quot;action\&quot;:{\&quot;enable\&quot;:true},\&quot;lagstuck\&quot;:{\&quot;enable\&quot;:true},\&quot;lagfps\&quot;:{\&quot;enable\&quot;:true},\&quot;statechange\&quot;:{\&quot;enable\&quot;:true},\&quot;anr\&quot;:{\&quot;enable\&quot;:true},\&quot;customlog\&quot;:{\&quot;enable\&quot;:true},\&quot;customevent\&quot;:{\&quot;enable\&quot;:true},\&quot;custommetric\&quot;:{\&quot;enable\&quot;:true}},\&quot;versionConfigs\&quot;:{\&quot;1.1.0\&quot;:{\&quot;useCustom\&quot;:true,\&quot;customConfig\&quot;:{\&quot;network\&quot;:{\&quot;enable\&quot;:true},\&quot;h5\&quot;:{\&quot;enable\&quot;:true},\&quot;routechange\&quot;:{\&quot;enable\&quot;:true},\&quot;crash\&quot;:{\&quot;enable\&quot;:true},\&quot;view\&quot;:{\&quot;enable\&quot;:true},\&quot;coollaunch\&quot;:{\&quot;enable\&quot;:true},\&quot;hotlaunch\&quot;:{\&quot;enable\&quot;:true},\&quot;action\&quot;:{\&quot;enable\&quot;:true},\&quot;lagstuck\&quot;:{\&quot;enable\&quot;:false},\&quot;lagfps\&quot;:{\&quot;enable\&quot;:false},\&quot;statechange\&quot;:{\&quot;enable\&quot;:true},\&quot;anr\&quot;:{\&quot;enable\&quot;:true},\&quot;customlog\&quot;:{\&quot;enable\&quot;:true},\&quot;customevent\&quot;:{\&quot;enable\&quot;:true},\&quot;custommetric\&quot;:{\&quot;enable\&quot;:true}}},\&quot;1.2.0\&quot;:{\&quot;useCustom\&quot;:false,\&quot;customConfig\&quot;:{}}}}}</p>
     */
    @NameInMap("BonreeSDKConfigJson")
    public String bonreeSDKConfigJson;

    /**
     * <p>The description of the application.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Specifies whether you want to subscribe to the application. Valid values: true and false.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsSubscribe")
    public Boolean isSubscribe;

    /**
     * <p>The alias of the application.</p>
     * 
     * <strong>example:</strong>
     * <p>Android Test</p>
     */
    @NameInMap("Nickname")
    public String nickname;

    /**
     * <p>The application ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>b5xxxxs@d8deedfa9bf****</p>
     */
    @NameInMap("Pid")
    public String pid;

    /**
     * <p>Backend application deployment area (used in end-to-end link scenarios).</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RealRegionId")
    public String realRegionId;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>Specifies whether to restart the application. Valid values: true and false.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Restart")
    public Boolean restart;

    /**
     * <p>The service domain name of the application. You can create, modify, and delete service domain name configurations.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;Op\&quot;:\&quot;Update\&quot;,\&quot;Domain\&quot;:\&quot;example.com\&quot;,\&quot;Config\&quot;:{\&quot;Description\&quot;:\&quot;message\&quot;,\&quot;Tracing\&quot;:\&quot;true\&quot;,\&quot;PropagatorTypes\&quot;:[\&quot;sw8\&quot;]}}</p>
     */
    @NameInMap("ServiceDomainOperationJson")
    public String serviceDomainOperationJson;

    /**
     * <p>Specifies whether to stop the application. Valid values: true and false.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Stop")
    public Boolean stop;

    public static UpdateRumAppRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateRumAppRequest self = new UpdateRumAppRequest();
        return TeaModel.build(map, self);
    }

    public UpdateRumAppRequest setAppConfig(String appConfig) {
        this.appConfig = appConfig;
        return this;
    }
    public String getAppConfig() {
        return this.appConfig;
    }

    public UpdateRumAppRequest setAutoRestart(Boolean autoRestart) {
        this.autoRestart = autoRestart;
        return this;
    }
    public Boolean getAutoRestart() {
        return this.autoRestart;
    }

    public UpdateRumAppRequest setBackendServiceTraceRegion(String backendServiceTraceRegion) {
        this.backendServiceTraceRegion = backendServiceTraceRegion;
        return this;
    }
    public String getBackendServiceTraceRegion() {
        return this.backendServiceTraceRegion;
    }

    public UpdateRumAppRequest setBonreeSDKConfigJson(String bonreeSDKConfigJson) {
        this.bonreeSDKConfigJson = bonreeSDKConfigJson;
        return this;
    }
    public String getBonreeSDKConfigJson() {
        return this.bonreeSDKConfigJson;
    }

    public UpdateRumAppRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateRumAppRequest setIsSubscribe(Boolean isSubscribe) {
        this.isSubscribe = isSubscribe;
        return this;
    }
    public Boolean getIsSubscribe() {
        return this.isSubscribe;
    }

    public UpdateRumAppRequest setNickname(String nickname) {
        this.nickname = nickname;
        return this;
    }
    public String getNickname() {
        return this.nickname;
    }

    public UpdateRumAppRequest setPid(String pid) {
        this.pid = pid;
        return this;
    }
    public String getPid() {
        return this.pid;
    }

    public UpdateRumAppRequest setRealRegionId(String realRegionId) {
        this.realRegionId = realRegionId;
        return this;
    }
    public String getRealRegionId() {
        return this.realRegionId;
    }

    public UpdateRumAppRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateRumAppRequest setRestart(Boolean restart) {
        this.restart = restart;
        return this;
    }
    public Boolean getRestart() {
        return this.restart;
    }

    public UpdateRumAppRequest setServiceDomainOperationJson(String serviceDomainOperationJson) {
        this.serviceDomainOperationJson = serviceDomainOperationJson;
        return this;
    }
    public String getServiceDomainOperationJson() {
        return this.serviceDomainOperationJson;
    }

    public UpdateRumAppRequest setStop(Boolean stop) {
        this.stop = stop;
        return this;
    }
    public Boolean getStop() {
        return this.stop;
    }

}
