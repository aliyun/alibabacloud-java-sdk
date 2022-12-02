// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class ListDevicesShrinkRequest extends TeaModel {
    @NameInMap("CalculateAmount")
    public Boolean calculateAmount;

    @NameInMap("DeviceFormId")
    public String deviceFormId;

    @NameInMap("DeviceFormName")
    public String deviceFormName;

    @NameInMap("DeviceIds")
    public String deviceIdsShrink;

    @NameInMap("ExtAttributes")
    public String extAttributes;

    @NameInMap("HostName")
    public String hostNameShrink;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Ip")
    public String ipShrink;

    @NameInMap("Keyword")
    public String keyword;

    @NameInMap("Mac")
    public String macShrink;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("Model")
    public String modelShrink;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("PhysicalSpaceId")
    public String physicalSpaceId;

    @NameInMap("PhysicalSpaceIds")
    public String physicalSpaceIdsShrink;

    @NameInMap("SecurityDomain")
    public String securityDomainShrink;

    @NameInMap("ServiceStatus")
    public String serviceStatusShrink;

    @NameInMap("Sn")
    public String snShrink;

    @NameInMap("Vendor")
    public String vendorShrink;

    public static ListDevicesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDevicesShrinkRequest self = new ListDevicesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListDevicesShrinkRequest setCalculateAmount(Boolean calculateAmount) {
        this.calculateAmount = calculateAmount;
        return this;
    }
    public Boolean getCalculateAmount() {
        return this.calculateAmount;
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
