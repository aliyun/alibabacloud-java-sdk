// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateCloudGtmInstanceConfigBasicRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>en-US</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <strong>example:</strong>
     * <p>1ae05db4-10e7-11ef-b126-00163e24**22</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <strong>example:</strong>
     * <p>Config-000**11</p>
     */
    @NameInMap("ConfigId")
    public String configId;

    /**
     * <strong>example:</strong>
     * <p>gtm-cn-wwo3a3hbz**</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>www</p>
     */
    @NameInMap("ScheduleHostname")
    public String scheduleHostname;

    /**
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("ScheduleZoneName")
    public String scheduleZoneName;

    @NameInMap("Ttl")
    public Integer ttl;

    public static UpdateCloudGtmInstanceConfigBasicRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateCloudGtmInstanceConfigBasicRequest self = new UpdateCloudGtmInstanceConfigBasicRequest();
        return TeaModel.build(map, self);
    }

    public UpdateCloudGtmInstanceConfigBasicRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public UpdateCloudGtmInstanceConfigBasicRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateCloudGtmInstanceConfigBasicRequest setConfigId(String configId) {
        this.configId = configId;
        return this;
    }
    public String getConfigId() {
        return this.configId;
    }

    public UpdateCloudGtmInstanceConfigBasicRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateCloudGtmInstanceConfigBasicRequest setScheduleHostname(String scheduleHostname) {
        this.scheduleHostname = scheduleHostname;
        return this;
    }
    public String getScheduleHostname() {
        return this.scheduleHostname;
    }

    public UpdateCloudGtmInstanceConfigBasicRequest setScheduleZoneName(String scheduleZoneName) {
        this.scheduleZoneName = scheduleZoneName;
        return this;
    }
    public String getScheduleZoneName() {
        return this.scheduleZoneName;
    }

    public UpdateCloudGtmInstanceConfigBasicRequest setTtl(Integer ttl) {
        this.ttl = ttl;
        return this;
    }
    public Integer getTtl() {
        return this.ttl;
    }

}
