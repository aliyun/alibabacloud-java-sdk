// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class CreateCloudGtmInstanceConfigRequest extends TeaModel {
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
     * <p>enable</p>
     */
    @NameInMap("EnableStatus")
    public String enableStatus;

    /**
     * <strong>example:</strong>
     * <p>gtm-cn-jmp3qnw**03</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Remark")
    public String remark;

    /**
     * <strong>example:</strong>
     * <p>www</p>
     */
    @NameInMap("ScheduleHostname")
    public String scheduleHostname;

    /**
     * <strong>example:</strong>
     * <p>A</p>
     */
    @NameInMap("ScheduleRrType")
    public String scheduleRrType;

    /**
     * <strong>example:</strong>
     * <p>custom</p>
     */
    @NameInMap("ScheduleZoneMode")
    public String scheduleZoneMode;

    /**
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("ScheduleZoneName")
    public String scheduleZoneName;

    /**
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("Ttl")
    public Integer ttl;

    public static CreateCloudGtmInstanceConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCloudGtmInstanceConfigRequest self = new CreateCloudGtmInstanceConfigRequest();
        return TeaModel.build(map, self);
    }

    public CreateCloudGtmInstanceConfigRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public CreateCloudGtmInstanceConfigRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateCloudGtmInstanceConfigRequest setEnableStatus(String enableStatus) {
        this.enableStatus = enableStatus;
        return this;
    }
    public String getEnableStatus() {
        return this.enableStatus;
    }

    public CreateCloudGtmInstanceConfigRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateCloudGtmInstanceConfigRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public CreateCloudGtmInstanceConfigRequest setScheduleHostname(String scheduleHostname) {
        this.scheduleHostname = scheduleHostname;
        return this;
    }
    public String getScheduleHostname() {
        return this.scheduleHostname;
    }

    public CreateCloudGtmInstanceConfigRequest setScheduleRrType(String scheduleRrType) {
        this.scheduleRrType = scheduleRrType;
        return this;
    }
    public String getScheduleRrType() {
        return this.scheduleRrType;
    }

    public CreateCloudGtmInstanceConfigRequest setScheduleZoneMode(String scheduleZoneMode) {
        this.scheduleZoneMode = scheduleZoneMode;
        return this;
    }
    public String getScheduleZoneMode() {
        return this.scheduleZoneMode;
    }

    public CreateCloudGtmInstanceConfigRequest setScheduleZoneName(String scheduleZoneName) {
        this.scheduleZoneName = scheduleZoneName;
        return this;
    }
    public String getScheduleZoneName() {
        return this.scheduleZoneName;
    }

    public CreateCloudGtmInstanceConfigRequest setTtl(Integer ttl) {
        this.ttl = ttl;
        return this;
    }
    public Integer getTtl() {
        return this.ttl;
    }

}
