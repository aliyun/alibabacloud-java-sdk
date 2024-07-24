// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class UpdateRumAppRequest extends TeaModel {
    /**
     * <p>Specifies whether to restart the application the next day. Valid values: true and false.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoRestart")
    public Boolean autoRestart;

    @NameInMap("BonreeSDKConfigJson")
    public String bonreeSDKConfigJson;

    /**
     * <p>The description of the application.</p>
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
     * <p>Set the application service domain name, support creation, modification, and deletion of service domain name configuration.</p>
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

    public UpdateRumAppRequest setAutoRestart(Boolean autoRestart) {
        this.autoRestart = autoRestart;
        return this;
    }
    public Boolean getAutoRestart() {
        return this.autoRestart;
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
