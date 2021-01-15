// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class DeviceTask extends TeaModel {
    // 设备id
    @NameInMap("DeviceId")
    public String deviceId;

    // 设备ip
    @NameInMap("DeviceIp")
    public String deviceIp;

    // 设备名
    @NameInMap("DeviceName")
    public String deviceName;

    // 设备任务id
    @NameInMap("DeviceTaskId")
    public String deviceTaskId;

    // 创建时间
    @NameInMap("GmtCreate")
    public String gmtCreate;

    // 修改时间
    @NameInMap("GmtModify")
    public String gmtModify;

    // 设备任务回显
    @NameInMap("Output")
    public String output;

    // 设备任务参数
    @NameInMap("Params")
    public String params;

    // 设备任务错误码
    @NameInMap("ResponseCode")
    public String responseCode;

    // 设备任务返回
    @NameInMap("Result")
    public String result;

    // 脚本id
    @NameInMap("ScriptId")
    public String scriptId;

    // 版本id
    @NameInMap("ScriptVersion")
    public String scriptVersion;

    // 设备任务状态
    @NameInMap("Status")
    public String status;

    // 模板id
    @NameInMap("TemplateId")
    public String templateId;

    // 模板名称
    @NameInMap("TemplateName")
    public String templateName;

    public static DeviceTask build(java.util.Map<String, ?> map) throws Exception {
        DeviceTask self = new DeviceTask();
        return TeaModel.build(map, self);
    }

    public DeviceTask setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public DeviceTask setDeviceIp(String deviceIp) {
        this.deviceIp = deviceIp;
        return this;
    }
    public String getDeviceIp() {
        return this.deviceIp;
    }

    public DeviceTask setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public String getDeviceName() {
        return this.deviceName;
    }

    public DeviceTask setDeviceTaskId(String deviceTaskId) {
        this.deviceTaskId = deviceTaskId;
        return this;
    }
    public String getDeviceTaskId() {
        return this.deviceTaskId;
    }

    public DeviceTask setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public DeviceTask setGmtModify(String gmtModify) {
        this.gmtModify = gmtModify;
        return this;
    }
    public String getGmtModify() {
        return this.gmtModify;
    }

    public DeviceTask setOutput(String output) {
        this.output = output;
        return this;
    }
    public String getOutput() {
        return this.output;
    }

    public DeviceTask setParams(String params) {
        this.params = params;
        return this;
    }
    public String getParams() {
        return this.params;
    }

    public DeviceTask setResponseCode(String responseCode) {
        this.responseCode = responseCode;
        return this;
    }
    public String getResponseCode() {
        return this.responseCode;
    }

    public DeviceTask setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

    public DeviceTask setScriptId(String scriptId) {
        this.scriptId = scriptId;
        return this;
    }
    public String getScriptId() {
        return this.scriptId;
    }

    public DeviceTask setScriptVersion(String scriptVersion) {
        this.scriptVersion = scriptVersion;
        return this;
    }
    public String getScriptVersion() {
        return this.scriptVersion;
    }

    public DeviceTask setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DeviceTask setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public DeviceTask setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

}
