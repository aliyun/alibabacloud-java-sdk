// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudwifi_pop20191118.models;

import com.aliyun.tea.*;

public class GetNetDeviceInfoRequest extends TeaModel {
    @NameInMap("AppCode")
    public String appCode;

    @NameInMap("AppName")
    public String appName;

    @NameInMap("Cursor")
    public Long cursor;

    @NameInMap("HostName")
    public String hostName;

    @NameInMap("Id")
    public Long id;

    @NameInMap("Idc")
    public String idc;

    @NameInMap("LogicNetPod")
    public String logicNetPod;

    @NameInMap("Manufacturer")
    public String manufacturer;

    @NameInMap("MgnIp")
    public String mgnIp;

    @NameInMap("Model")
    public String model;

    @NameInMap("NetPod")
    public String netPod;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("Password")
    public String password;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Role")
    public String role;

    @NameInMap("ServiceTag")
    public String serviceTag;

    @NameInMap("Username")
    public String username;

    public static GetNetDeviceInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetNetDeviceInfoRequest self = new GetNetDeviceInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetNetDeviceInfoRequest setAppCode(String appCode) {
        this.appCode = appCode;
        return this;
    }
    public String getAppCode() {
        return this.appCode;
    }

    public GetNetDeviceInfoRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public GetNetDeviceInfoRequest setCursor(Long cursor) {
        this.cursor = cursor;
        return this;
    }
    public Long getCursor() {
        return this.cursor;
    }

    public GetNetDeviceInfoRequest setHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }
    public String getHostName() {
        return this.hostName;
    }

    public GetNetDeviceInfoRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public GetNetDeviceInfoRequest setIdc(String idc) {
        this.idc = idc;
        return this;
    }
    public String getIdc() {
        return this.idc;
    }

    public GetNetDeviceInfoRequest setLogicNetPod(String logicNetPod) {
        this.logicNetPod = logicNetPod;
        return this;
    }
    public String getLogicNetPod() {
        return this.logicNetPod;
    }

    public GetNetDeviceInfoRequest setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
        return this;
    }
    public String getManufacturer() {
        return this.manufacturer;
    }

    public GetNetDeviceInfoRequest setMgnIp(String mgnIp) {
        this.mgnIp = mgnIp;
        return this;
    }
    public String getMgnIp() {
        return this.mgnIp;
    }

    public GetNetDeviceInfoRequest setModel(String model) {
        this.model = model;
        return this;
    }
    public String getModel() {
        return this.model;
    }

    public GetNetDeviceInfoRequest setNetPod(String netPod) {
        this.netPod = netPod;
        return this;
    }
    public String getNetPod() {
        return this.netPod;
    }

    public GetNetDeviceInfoRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetNetDeviceInfoRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public GetNetDeviceInfoRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetNetDeviceInfoRequest setRole(String role) {
        this.role = role;
        return this;
    }
    public String getRole() {
        return this.role;
    }

    public GetNetDeviceInfoRequest setServiceTag(String serviceTag) {
        this.serviceTag = serviceTag;
        return this;
    }
    public String getServiceTag() {
        return this.serviceTag;
    }

    public GetNetDeviceInfoRequest setUsername(String username) {
        this.username = username;
        return this;
    }
    public String getUsername() {
        return this.username;
    }

}
