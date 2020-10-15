// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class RunServiceScheduleRequest extends TeaModel {
    @NameInMap("AppId")
    @Validation(required = true)
    public String appId;

    @NameInMap("Uuid")
    @Validation(required = true)
    public String uuid;

    @NameInMap("ClientIp")
    @Validation(required = true)
    public String clientIp;

    @NameInMap("ServiceAction")
    @Validation(required = true)
    public String serviceAction;

    @NameInMap("PodConfigName")
    public String podConfigName;

    @NameInMap("PreLockedTimeout")
    public Integer preLockedTimeout;

    @NameInMap("Directorys")
    public String directorys;

    @NameInMap("ServiceCommands")
    public String serviceCommands;

    @NameInMap("ScheduleStrategy")
    public String scheduleStrategy;

    public static RunServiceScheduleRequest build(java.util.Map<String, ?> map) throws Exception {
        RunServiceScheduleRequest self = new RunServiceScheduleRequest();
        return TeaModel.build(map, self);
    }

    public RunServiceScheduleRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public RunServiceScheduleRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

    public RunServiceScheduleRequest setClientIp(String clientIp) {
        this.clientIp = clientIp;
        return this;
    }
    public String getClientIp() {
        return this.clientIp;
    }

    public RunServiceScheduleRequest setServiceAction(String serviceAction) {
        this.serviceAction = serviceAction;
        return this;
    }
    public String getServiceAction() {
        return this.serviceAction;
    }

    public RunServiceScheduleRequest setPodConfigName(String podConfigName) {
        this.podConfigName = podConfigName;
        return this;
    }
    public String getPodConfigName() {
        return this.podConfigName;
    }

    public RunServiceScheduleRequest setPreLockedTimeout(Integer preLockedTimeout) {
        this.preLockedTimeout = preLockedTimeout;
        return this;
    }
    public Integer getPreLockedTimeout() {
        return this.preLockedTimeout;
    }

    public RunServiceScheduleRequest setDirectorys(String directorys) {
        this.directorys = directorys;
        return this;
    }
    public String getDirectorys() {
        return this.directorys;
    }

    public RunServiceScheduleRequest setServiceCommands(String serviceCommands) {
        this.serviceCommands = serviceCommands;
        return this;
    }
    public String getServiceCommands() {
        return this.serviceCommands;
    }

    public RunServiceScheduleRequest setScheduleStrategy(String scheduleStrategy) {
        this.scheduleStrategy = scheduleStrategy;
        return this;
    }
    public String getScheduleStrategy() {
        return this.scheduleStrategy;
    }

}
