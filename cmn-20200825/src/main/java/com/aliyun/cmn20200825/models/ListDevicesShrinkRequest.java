// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class ListDevicesShrinkRequest extends TeaModel {
    // 设备形态ID
    @NameInMap("DeviceFormId")
    public String deviceFormId;

    // 设备形态名称
    @NameInMap("DeviceFormName")
    public String deviceFormName;

    // 设备Id列表
    @NameInMap("DeviceIds")
    public String deviceIdsShrink;

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
    public String physicalSpaceIdsShrink;

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

    public static ListDevicesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDevicesShrinkRequest self = new ListDevicesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListDevicesShrinkRequest setDeviceFormId(String deviceFormId) {
        this.deviceFormId = deviceFormId;
        return this;
    }
    public String getDeviceFormId() {
        return this.deviceFormId;
    }

    public ListDevicesShrinkRequest setDeviceFormName(String deviceFormName) {
        this.deviceFormName = deviceFormName;
        return this;
    }
    public String getDeviceFormName() {
        return this.deviceFormName;
    }

    public ListDevicesShrinkRequest setDeviceIdsShrink(String deviceIdsShrink) {
        this.deviceIdsShrink = deviceIdsShrink;
        return this;
    }
    public String getDeviceIdsShrink() {
        return this.deviceIdsShrink;
    }

    public ListDevicesShrinkRequest setExtAttributes(String extAttributes) {
        this.extAttributes = extAttributes;
        return this;
    }
    public String getExtAttributes() {
        return this.extAttributes;
    }

    public ListDevicesShrinkRequest setHostName(java.util.List<String> hostName) {
        this.hostName = hostName;
        return this;
    }
    public java.util.List<String> getHostName() {
        return this.hostName;
    }

    public ListDevicesShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListDevicesShrinkRequest setIp(java.util.List<String> ip) {
        this.ip = ip;
        return this;
    }
    public java.util.List<String> getIp() {
        return this.ip;
    }

    public ListDevicesShrinkRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ListDevicesShrinkRequest setMac(java.util.List<String> mac) {
        this.mac = mac;
        return this;
    }
    public java.util.List<String> getMac() {
        return this.mac;
    }

    public ListDevicesShrinkRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListDevicesShrinkRequest setModel(java.util.List<String> model) {
        this.model = model;
        return this;
    }
    public java.util.List<String> getModel() {
        return this.model;
    }

    public ListDevicesShrinkRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListDevicesShrinkRequest setPhysicalSpaceId(String physicalSpaceId) {
        this.physicalSpaceId = physicalSpaceId;
        return this;
    }
    public String getPhysicalSpaceId() {
        return this.physicalSpaceId;
    }

    public ListDevicesShrinkRequest setPhysicalSpaceIdsShrink(String physicalSpaceIdsShrink) {
        this.physicalSpaceIdsShrink = physicalSpaceIdsShrink;
        return this;
    }
    public String getPhysicalSpaceIdsShrink() {
        return this.physicalSpaceIdsShrink;
    }

    public ListDevicesShrinkRequest setSecurityDomain(java.util.List<String> securityDomain) {
        this.securityDomain = securityDomain;
        return this;
    }
    public java.util.List<String> getSecurityDomain() {
        return this.securityDomain;
    }

    public ListDevicesShrinkRequest setServiceStatus(java.util.List<String> serviceStatus) {
        this.serviceStatus = serviceStatus;
        return this;
    }
    public java.util.List<String> getServiceStatus() {
        return this.serviceStatus;
    }

    public ListDevicesShrinkRequest setSn(java.util.List<String> sn) {
        this.sn = sn;
        return this;
    }
    public java.util.List<String> getSn() {
        return this.sn;
    }

    public ListDevicesShrinkRequest setVendor(java.util.List<String> vendor) {
        this.vendor = vendor;
        return this;
    }
    public java.util.List<String> getVendor() {
        return this.vendor;
    }

}
