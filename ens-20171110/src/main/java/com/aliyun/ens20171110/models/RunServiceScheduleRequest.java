// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class RunServiceScheduleRequest extends TeaModel {
    /**
     * <p>The ID of the application.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>474bdef0-d149-4695-abfb-52912d9143f0</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The IP address of the client.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>180.166.45.146</p>
     */
    @NameInMap("ClientIp")
    public String clientIp;

    /**
     * <p>The directory to which the data file is mounted. The value must be a full path and cannot be \&quot;/../\&quot;. Example: [&quot;/data/app01&quot;, &quot;/data/user&quot;]. Specify the relative path of the virtual device for this parameter. For example, specify /data for this parameter when the actual path of the virtual device is /data/{input path}.</p>
     * 
     * <strong>example:</strong>
     * <p>[\&quot;/data/app01\&quot;, \&quot;/data/user\&quot;]</p>
     */
    @NameInMap("Directorys")
    public String directorys;

    /**
     * <p>The parameter does not take effect.</p>
     * 
     * <strong>example:</strong>
     * <p>android</p>
     */
    @NameInMap("PodConfigName")
    public String podConfigName;

    /**
     * <p>The maximum duration for locking an idle device. Unit: seconds. This parameter takes effect only if you set ServiceAction to PreSchedule. Default value: 300.</p>
     * 
     * <strong>example:</strong>
     * <p>300</p>
     */
    @NameInMap("PreLockedTimeout")
    public Integer preLockedTimeout;

    /**
     * <p>The scheduling policy of the device. The value must be a JSON string.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;selectLevel\&quot;: \&quot;RegionId\&quot;, \&quot;values\&quot;: [\&quot;cn-chengdu-telecom-2\&quot;]  }</p>
     */
    @NameInMap("ScheduleStrategy")
    public String scheduleStrategy;

    /**
     * <p>The scheduling operation. The value must be of the enumeration type. Valid values:</p>
     * <p>Container scenario:</p>
     * <ul>
     * <li>Start: selects and activates an idle cloud device.</li>
     * <li>Stop: stops and releases the cloud device.</li>
     * <li>Console: performs the scheduling operation when the device is in the scheduling state.</li>
     * </ul>
     * <p>Bare metal instance or virtual machine scenario:</p>
     * <ul>
     * <li>PreSchedule: locks a virtual machine instance for scheduling.</li>
     * <li>Confirm: confirms the scheduling operation.</li>
     * <li>Cancel: cancels the scheduling operation.</li>
     * <li>Console: performs the scheduling operation when the device is in the scheduling state.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Start</p>
     */
    @NameInMap("ServiceAction")
    public String serviceAction;

    /**
     * <p>The service commands. The value must be a JSON string.</p>
     * 
     * <strong>example:</strong>
     * <p>[{\&quot;containerName\&quot;: \&quot;android\&quot;,       \&quot;commands\&quot;:[\&quot;cat /tmp/token.json\&quot;]    },    {      \&quot;commands\&quot;:[\&quot;ls -l /data/data\&quot;]    }]</p>
     */
    @NameInMap("ServiceCommands")
    public String serviceCommands;

    /**
     * <p>The UUID of the device.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>hdm_d4f1059a8e1afc0956bd71b497faa433</p>
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
