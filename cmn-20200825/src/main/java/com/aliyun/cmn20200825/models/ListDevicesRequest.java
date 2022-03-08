// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class ListDevicesRequest extends TeaModel {
    // 设备形态ID
    @NameInMap("DeviceFormId")
    public String deviceFormId;

    // 设备形态名称
    @NameInMap("DeviceFormName")
    public String deviceFormName;

    // 设备Id列表
    @NameInMap("DeviceIds")
    public java.util.List<String> deviceIds;

    // 设备额外属性
    @NameInMap("ExtAttributes")
    public String extAttributes;

    // 设备主机名
    @NameInMap("HostName")
    public java.util.List<String> hostName;

    // 实例ID
    @NameInMap("InstanceId")
    public String instanceId;

    // 设备IP
    @NameInMap("Ip")
    public java.util.List<String> ip;

    // 模糊查询值
    @NameInMap("Keyword")
    public String keyword;

    // 设备MAC
    @NameInMap("Mac")
    public java.util.List<String> mac;

    // 返回结果的最大个数。
    @NameInMap("MaxResults")
    public Integer maxResults;

    // 设备型号
    @NameInMap("Model")
    public java.util.List<String> model;

    // 当总结果个数大于MaxResults时，用于翻页的token。
    @NameInMap("NextToken")
    public String nextToken;

    // 物理空间ID
    @NameInMap("PhysicalSpaceId")
    public String physicalSpaceId;

    // 物理空间IDS
    @NameInMap("PhysicalSpaceIds")
    public java.util.List<String> physicalSpaceIds;

    // 安全域
    @NameInMap("SecurityDomain")
    public java.util.List<String> securityDomain;

    // 设备服务状态
    @NameInMap("ServiceStatus")
    public java.util.List<String> serviceStatus;

    // 设备SN
    @NameInMap("Sn")
    public java.util.List<String> sn;

    // 设备厂商
    @NameInMap("Vendor")
    public java.util.List<String> vendor;

    public static ListDevicesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDevicesRequest self = new ListDevicesRequest();
        return TeaModel.build(map, self);
    }

    public ListDevicesRequest setDeviceFormId(String deviceFormId) {
        this.deviceFormId = deviceFormId;
        return this;
    }
    public String getDeviceFormId() {
        return this.deviceFormId;
    }

    public ListDevicesRequest setDeviceFormName(String deviceFormName) {
        this.deviceFormName = deviceFormName;
        return this;
    }
    public String getDeviceFormName() {
        return this.deviceFormName;
    }

    public ListDevicesRequest setDeviceIds(java.util.List<String> deviceIds) {
        this.deviceIds = deviceIds;
        return this;
    }
    public java.util.List<String> getDeviceIds() {
        return this.deviceIds;
    }

    public ListDevicesRequest setExtAttributes(String extAttributes) {
        this.extAttributes = extAttributes;
        return this;
    }
    public String getExtAttributes() {
        return this.extAttributes;
    }

    public ListDevicesRequest setHostName(java.util.List<String> hostName) {
        this.hostName = hostName;
        return this;
    }
    public java.util.List<String> getHostName() {
        return this.hostName;
    }

    public ListDevicesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListDevicesRequest setIp(java.util.List<String> ip) {
        this.ip = ip;
        return this;
    }
    public java.util.List<String> getIp() {
        return this.ip;
    }

    public ListDevicesRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ListDevicesRequest setMac(java.util.List<String> mac) {
        this.mac = mac;
        return this;
    }
    public java.util.List<String> getMac() {
        return this.mac;
    }

    public ListDevicesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListDevicesRequest setModel(java.util.List<String> model) {
        this.model = model;
        return this;
    }
    public java.util.List<String> getModel() {
        return this.model;
    }

    public ListDevicesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListDevicesRequest setPhysicalSpaceId(String physicalSpaceId) {
        this.physicalSpaceId = physicalSpaceId;
        return this;
    }
    public String getPhysicalSpaceId() {
        return this.physicalSpaceId;
    }

    public ListDevicesRequest setPhysicalSpaceIds(java.util.List<String> physicalSpaceIds) {
        this.physicalSpaceIds = physicalSpaceIds;
        return this;
    }
    public java.util.List<String> getPhysicalSpaceIds() {
        return this.physicalSpaceIds;
    }

    public ListDevicesRequest setSecurityDomain(java.util.List<String> securityDomain) {
        this.securityDomain = securityDomain;
        return this;
    }
    public java.util.List<String> getSecurityDomain() {
        return this.securityDomain;
    }

    public ListDevicesRequest setServiceStatus(java.util.List<String> serviceStatus) {
        this.serviceStatus = serviceStatus;
        return this;
    }
    public java.util.List<String> getServiceStatus() {
        return this.serviceStatus;
    }

    public ListDevicesRequest setSn(java.util.List<String> sn) {
        this.sn = sn;
        return this;
    }
    public java.util.List<String> getSn() {
        return this.sn;
    }

    public ListDevicesRequest setVendor(java.util.List<String> vendor) {
        this.vendor = vendor;
        return this;
    }
    public java.util.List<String> getVendor() {
        return this.vendor;
    }

}
