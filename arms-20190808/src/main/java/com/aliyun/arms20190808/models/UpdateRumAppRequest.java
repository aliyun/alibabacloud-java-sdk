// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class UpdateRumAppRequest extends TeaModel {
    /**
     * <p>The legacy application configuration in JSON format. This parameter is deprecated.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;apiRequestOfH5&quot;:300,&quot;apiRequestOfOriginal&quot;:500,&quot;coldStart&quot;:5000,&quot;hotStart&quot;:3000,&quot;staticResourceLoad&quot;:300,&quot;stutter&quot;:1000,&quot;viewLoadOfH5&quot;:1000,&quot;viewLoadOfOriginal&quot;:2000}</p>
     */
    @NameInMap("AppConfig")
    public String appConfig;

    /**
     * <p>Specifies whether to restart the application the next day. Valid values:</p>
     * <ul>
     * <li>true: Restart.</li>
     * <li>false: Do not restart.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoRestart")
    public Boolean autoRestart;

    /**
     * <p>The region where the backend application is deployed. This parameter is used in end-to-end tracing scenarios.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("BackendServiceTraceRegion")
    public String backendServiceTraceRegion;

    /**
     * <p>The mobile SDK collection configuration. You can enable or disable collection items by app version.</p>
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
     * <p>测试</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Specifies whether to add the application to favorites. Valid values:</p>
     * <ul>
     * <li>true: Add to favorites.</li>
     * <li>false: Do not add to favorites.</li>
     * </ul>
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
     * <p>应用别名。</p>
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
     * <p>The region where the application is actually connected. This parameter is used only in the China (Shanghai) Finance Cloud scenario.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai-finance-1</p>
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
     * <p>Specifies whether to restart the application. Valid values:</p>
     * <ul>
     * <li>true: Restart.</li>
     * <li>false: Do not restart.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Restart")
    public Boolean restart;

    /**
     * <p>The service domain name settings for the application. You can create, update, or delete service domain name configurations.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;Op\&quot;:\&quot;Update\&quot;,\&quot;Domain\&quot;:\&quot;example.com\&quot;,\&quot;Config\&quot;:{\&quot;Description\&quot;:\&quot;这是描述bbb\&quot;,\&quot;Tracing\&quot;:\&quot;true\&quot;,\&quot;PropagatorTypes\&quot;:[\&quot;sw8\&quot;]}}</p>
     */
    @NameInMap("ServiceDomainOperationJson")
    public String serviceDomainOperationJson;

    /**
     * <p>Specifies whether to stop the application. Valid values:</p>
     * <ul>
     * <li>true: Stop.</li>
     * <li>false: Do not stop.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Stop")
    public Boolean stop;

    @NameInMap("WebSDKConfigJson")
    public String webSDKConfigJson;

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

    public UpdateRumAppRequest setWebSDKConfigJson(String webSDKConfigJson) {
        this.webSDKConfigJson = webSDKConfigJson;
        return this;
    }
    public String getWebSDKConfigJson() {
        return this.webSDKConfigJson;
    }

}
