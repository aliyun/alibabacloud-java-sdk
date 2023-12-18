// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class RunServiceScheduleRequest extends TeaModel {
    /**
     * <p>The ID of the application.</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The IP address of the client.</p>
     */
    @NameInMap("ClientIp")
    public String clientIp;

    /**
     * <p>The directory to which the data file is mounted. The value must be a full path and cannot be \"/../\". Example: \["/data/app01", "/data/user"]. Specify the relative path of the virtual device for this parameter. For example, specify /data for this parameter when the actual path of the virtual device is /data/{input path}.</p>
     */
    @NameInMap("Directorys")
    public String directorys;

    /**
     * <p>The parameter does not take effect.</p>
     */
    @NameInMap("PodConfigName")
    public String podConfigName;

    /**
     * <p>The maximum duration for locking an idle device. Unit: seconds. This parameter takes effect only if you set ServiceAction to PreSchedule. Default value: 300.</p>
     */
    @NameInMap("PreLockedTimeout")
    public Integer preLockedTimeout;

    /**
     * <p>The scheduling policy of the device. The value must be a JSON string.</p>
     */
    @NameInMap("ScheduleStrategy")
    public String scheduleStrategy;

    /**
     * <p>The scheduling operation. The value must be of the enumeration type. Valid values:</p>
     * <br>
     * <p>Container scenario:</p>
     * <br>
     * <p>*   Start: selects and activates an idle cloud device.</p>
     * <p>*   Stop: stops and releases the cloud device.</p>
     * <p>*   Console: performs the scheduling operation when the device is in the scheduling state.</p>
     * <br>
     * <p>Bare metal instance or virtual machine scenario:</p>
     * <br>
     * <p>*   PreSchedule: locks a virtual machine instance for scheduling.</p>
     * <p>*   Confirm: confirms the scheduling operation.</p>
     * <p>*   Cancel: cancels the scheduling operation.</p>
     * <p>*   Console: performs the scheduling operation when the device is in the scheduling state.</p>
     */
    @NameInMap("ServiceAction")
    public String serviceAction;

    /**
     * <p>The service commands. The value must be a JSON string.</p>
     */
    @NameInMap("ServiceCommands")
    public String serviceCommands;

    /**
     * <p>The UUID of the device.</p>
     */
    @NameInMap("Uuid")
    public String uuid;

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

    public RunServiceScheduleRequest setClientIp(String clientIp) {
        this.clientIp = clientIp;
        return this;
    }
    public String getClientIp() {
        return this.clientIp;
    }

    public RunServiceScheduleRequest setDirectorys(String directorys) {
        this.directorys = directorys;
        return this;
    }
    public String getDirectorys() {
        return this.directorys;
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

    public RunServiceScheduleRequest setScheduleStrategy(String scheduleStrategy) {
        this.scheduleStrategy = scheduleStrategy;
        return this;
    }
    public String getScheduleStrategy() {
        return this.scheduleStrategy;
    }

    public RunServiceScheduleRequest setServiceAction(String serviceAction) {
        this.serviceAction = serviceAction;
        return this;
    }
    public String getServiceAction() {
        return this.serviceAction;
    }

    public RunServiceScheduleRequest setServiceCommands(String serviceCommands) {
        this.serviceCommands = serviceCommands;
        return this;
    }
    public String getServiceCommands() {
        return this.serviceCommands;
    }

    public RunServiceScheduleRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

}
