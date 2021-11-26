// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eipanycast20200309.models;

import com.aliyun.tea.*;

public class AssociateAnycastEipAddressRequest extends TeaModel {
    @NameInMap("AnycastId")
    public String anycastId;

    // 关联模式，默认模式、普通模式Default/Normal
    @NameInMap("AssociationMode")
    public String associationMode;

    @NameInMap("BindInstanceId")
    public String bindInstanceId;

    @NameInMap("BindInstanceRegionId")
    public String bindInstanceRegionId;

    @NameInMap("BindInstanceType")
    public String bindInstanceType;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DryRun")
    public Boolean dryRun;

    // 绑定时关联的pop location，如果是绑定的第一个实例，该参数会忽略，会下发到全部pop点
    @NameInMap("PopLocations")
    public java.util.List<AssociateAnycastEipAddressRequestPopLocations> popLocations;

    // 私网ip地址
    @NameInMap("PrivateIpAddress")
    public String privateIpAddress;

    public static AssociateAnycastEipAddressRequest build(java.util.Map<String, ?> map) throws Exception {
        AssociateAnycastEipAddressRequest self = new AssociateAnycastEipAddressRequest();
        return TeaModel.build(map, self);
    }

    public AssociateAnycastEipAddressRequest setAnycastId(String anycastId) {
        this.anycastId = anycastId;
        return this;
    }
    public String getAnycastId() {
        return this.anycastId;
    }

    public AssociateAnycastEipAddressRequest setAssociationMode(String associationMode) {
        this.associationMode = associationMode;
        return this;
    }
    public String getAssociationMode() {
        return this.associationMode;
    }

    public AssociateAnycastEipAddressRequest setBindInstanceId(String bindInstanceId) {
        this.bindInstanceId = bindInstanceId;
        return this;
    }
    public String getBindInstanceId() {
        return this.bindInstanceId;
    }

    public AssociateAnycastEipAddressRequest setBindInstanceRegionId(String bindInstanceRegionId) {
        this.bindInstanceRegionId = bindInstanceRegionId;
        return this;
    }
    public String getBindInstanceRegionId() {
        return this.bindInstanceRegionId;
    }

    public AssociateAnycastEipAddressRequest setBindInstanceType(String bindInstanceType) {
        this.bindInstanceType = bindInstanceType;
        return this;
    }
    public String getBindInstanceType() {
        return this.bindInstanceType;
    }

    public AssociateAnycastEipAddressRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public AssociateAnycastEipAddressRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public AssociateAnycastEipAddressRequest setPopLocations(java.util.List<AssociateAnycastEipAddressRequestPopLocations> popLocations) {
        this.popLocations = popLocations;
        return this;
    }
    public java.util.List<AssociateAnycastEipAddressRequestPopLocations> getPopLocations() {
        return this.popLocations;
    }

    public AssociateAnycastEipAddressRequest setPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
        return this;
    }
    public String getPrivateIpAddress() {
        return this.privateIpAddress;
    }

    public static class AssociateAnycastEipAddressRequestPopLocations extends TeaModel {
        // pop location
        @NameInMap("PopLocation")
        public String popLocation;

        public static AssociateAnycastEipAddressRequestPopLocations build(java.util.Map<String, ?> map) throws Exception {
            AssociateAnycastEipAddressRequestPopLocations self = new AssociateAnycastEipAddressRequestPopLocations();
            return TeaModel.build(map, self);
        }

        public AssociateAnycastEipAddressRequestPopLocations setPopLocation(String popLocation) {
            this.popLocation = popLocation;
            return this;
        }
        public String getPopLocation() {
            return this.popLocation;
        }

    }

}
