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
    public String hostNameShrink;

    // 实例ID
    @NameInMap("InstanceId")
    public String instanceId;

    // 设备IP
    @NameInMap("Ip")
    public String ipShrink;

    // 模糊查询值
    @NameInMap("Keyword")
    public String keyword;

    // 设备MAC
    @NameInMap("Mac")
    public String macShrink;

    // 返回结果的最大个数。
    @NameInMap("MaxResults")
    public Integer maxResults;

    // 设备型号
    @NameInMap("Model")
    public String modelShrink;

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
    public String securityDomainShrink;

    // 设备服务状态
    @NameInMap("ServiceStatus")
    public String serviceStatusShrink;

    // 设备SN
    @NameInMap("Sn")
    public String snShrink;

    // 设备厂商
    @NameInMap("Vendor")
    public String vendorShrink;

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

    public ListDevicesShrinkRequest setHostNameShrink(String hostNameShrink) {
        this.hostNameShrink = hostNameShrink;
        return this;
    }
    public String getHostNameShrink() {
        return this.hostNameShrink;
    }

    public ListDevicesShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListDevicesShrinkRequest setIpShrink(String ipShrink) {
        this.ipShrink = ipShrink;
        return this;
    }
    public String getIpShrink() {
        return this.ipShrink;
    }

    public ListDevicesShrinkRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ListDevicesShrinkRequest setMacShrink(String macShrink) {
        this.macShrink = macShrink;
        return this;
    }
    public String getMacShrink() {
        return this.macShrink;
    }

    public ListDevicesShrinkRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListDevicesShrinkRequest setModelShrink(String modelShrink) {
        this.modelShrink = modelShrink;
        return this;
    }
    public String getModelShrink() {
        return this.modelShrink;
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

    public ListDevicesShrinkRequest setSecurityDomainShrink(String securityDomainShrink) {
        this.securityDomainShrink = securityDomainShrink;
        return this;
    }
    public String getSecurityDomainShrink() {
        return this.securityDomainShrink;
    }

    public ListDevicesShrinkRequest setServiceStatusShrink(String serviceStatusShrink) {
        this.serviceStatusShrink = serviceStatusShrink;
        return this;
    }
    public String getServiceStatusShrink() {
        return this.serviceStatusShrink;
    }

    public ListDevicesShrinkRequest setSnShrink(String snShrink) {
        this.snShrink = snShrink;
        return this;
    }
    public String getSnShrink() {
        return this.snShrink;
    }

    public ListDevicesShrinkRequest setVendorShrink(String vendorShrink) {
        this.vendorShrink = vendorShrink;
        return this;
    }
    public String getVendorShrink() {
        return this.vendorShrink;
    }

}
