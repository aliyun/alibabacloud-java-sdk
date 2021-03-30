// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudwifi_pop20191118.models;

import com.aliyun.tea.*;

public class GetNetDeviceInfoWithSizeRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("AppCode")
    public String appCode;

    @NameInMap("Cursor")
    public Long cursor;

    @NameInMap("Role")
    public String role;

    @NameInMap("ServiceTag")
    public String serviceTag;

    @NameInMap("Idc")
    public String idc;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("MgnIp")
    public String mgnIp;

    @NameInMap("Manufacturer")
    public String manufacturer;

    @NameInMap("LogicNetPod")
    public String logicNetPod;

    @NameInMap("Password")
    public String password;

    @NameInMap("NetPod")
    public String netPod;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Model")
    public String model;

    @NameInMap("Id")
    public Long id;

    @NameInMap("HostName")
    public String hostName;

    @NameInMap("Username")
    public String username;

    public static GetNetDeviceInfoWithSizeRequest build(java.util.Map<String, ?> map) throws Exception {
        GetNetDeviceInfoWithSizeRequest self = new GetNetDeviceInfoWithSizeRequest();
        return TeaModel.build(map, self);
    }

    public GetNetDeviceInfoWithSizeRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public GetNetDeviceInfoWithSizeRequest setAppCode(String appCode) {
        this.appCode = appCode;
        return this;
    }
    public String getAppCode() {
        return this.appCode;
    }

    public GetNetDeviceInfoWithSizeRequest setCursor(Long cursor) {
        this.cursor = cursor;
        return this;
    }
    public Long getCursor() {
        return this.cursor;
    }

    public GetNetDeviceInfoWithSizeRequest setRole(String role) {
        this.role = role;
        return this;
    }
    public String getRole() {
        return this.role;
    }

    public GetNetDeviceInfoWithSizeRequest setServiceTag(String serviceTag) {
        this.serviceTag = serviceTag;
        return this;
    }
    public String getServiceTag() {
        return this.serviceTag;
    }

    public GetNetDeviceInfoWithSizeRequest setIdc(String idc) {
        this.idc = idc;
        return this;
    }
    public String getIdc() {
        return this.idc;
    }

    public GetNetDeviceInfoWithSizeRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetNetDeviceInfoWithSizeRequest setMgnIp(String mgnIp) {
        this.mgnIp = mgnIp;
        return this;
    }
    public String getMgnIp() {
        return this.mgnIp;
    }

    public GetNetDeviceInfoWithSizeRequest setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
        return this;
    }
    public String getManufacturer() {
        return this.manufacturer;
    }

    public GetNetDeviceInfoWithSizeRequest setLogicNetPod(String logicNetPod) {
        this.logicNetPod = logicNetPod;
        return this;
    }
    public String getLogicNetPod() {
        return this.logicNetPod;
    }

    public GetNetDeviceInfoWithSizeRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public GetNetDeviceInfoWithSizeRequest setNetPod(String netPod) {
        this.netPod = netPod;
        return this;
    }
    public String getNetPod() {
        return this.netPod;
    }

    public GetNetDeviceInfoWithSizeRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetNetDeviceInfoWithSizeRequest setModel(String model) {
        this.model = model;
        return this;
    }
    public String getModel() {
        return this.model;
    }

    public GetNetDeviceInfoWithSizeRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public GetNetDeviceInfoWithSizeRequest setHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }
    public String getHostName() {
        return this.hostName;
    }

    public GetNetDeviceInfoWithSizeRequest setUsername(String username) {
        this.username = username;
        return this;
    }
    public String getUsername() {
        return this.username;
    }

}
