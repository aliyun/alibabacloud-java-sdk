// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class ListVswitchResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("VswitchList")
    public ListVswitchResponseBodyVswitchList vswitchList;

    public static ListVswitchResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListVswitchResponseBody self = new ListVswitchResponseBody();
        return TeaModel.build(map, self);
    }

    public ListVswitchResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListVswitchResponseBody setVswitchList(ListVswitchResponseBodyVswitchList vswitchList) {
        this.vswitchList = vswitchList;
        return this;
    }
    public ListVswitchResponseBodyVswitchList getVswitchList() {
        return this.vswitchList;
    }

    public static class ListVswitchResponseBodyVswitchListVswitch extends TeaModel {
        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("Status")
        public String status;

        @NameInMap("VpcId")
        public String vpcId;

        @NameInMap("IsDefault")
        public Boolean isDefault;

        @NameInMap("VSwitchId")
        public String vSwitchId;

        @NameInMap("CidrBlock")
        public String cidrBlock;

        @NameInMap("Description")
        public String description;

        @NameInMap("AvailableIpAddressCount")
        public String availableIpAddressCount;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("ZoneId")
        public String zoneId;

        @NameInMap("VSwitchName")
        public String vSwitchName;

        public static ListVswitchResponseBodyVswitchListVswitch build(java.util.Map<String, ?> map) throws Exception {
            ListVswitchResponseBodyVswitchListVswitch self = new ListVswitchResponseBodyVswitchListVswitch();
            return TeaModel.build(map, self);
        }

        public ListVswitchResponseBodyVswitchListVswitch setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public ListVswitchResponseBodyVswitchListVswitch setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListVswitchResponseBodyVswitchListVswitch setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public ListVswitchResponseBodyVswitchListVswitch setIsDefault(Boolean isDefault) {
            this.isDefault = isDefault;
            return this;
        }
        public Boolean getIsDefault() {
            return this.isDefault;
        }

        public ListVswitchResponseBodyVswitchListVswitch setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public ListVswitchResponseBodyVswitchListVswitch setCidrBlock(String cidrBlock) {
            this.cidrBlock = cidrBlock;
            return this;
        }
        public String getCidrBlock() {
            return this.cidrBlock;
        }

        public ListVswitchResponseBodyVswitchListVswitch setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListVswitchResponseBodyVswitchListVswitch setAvailableIpAddressCount(String availableIpAddressCount) {
            this.availableIpAddressCount = availableIpAddressCount;
            return this;
        }
        public String getAvailableIpAddressCount() {
            return this.availableIpAddressCount;
        }

        public ListVswitchResponseBodyVswitchListVswitch setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public ListVswitchResponseBodyVswitchListVswitch setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

        public ListVswitchResponseBodyVswitchListVswitch setVSwitchName(String vSwitchName) {
            this.vSwitchName = vSwitchName;
            return this;
        }
        public String getVSwitchName() {
            return this.vSwitchName;
        }

    }

    public static class ListVswitchResponseBodyVswitchList extends TeaModel {
        @NameInMap("Vswitch")
        public java.util.List<ListVswitchResponseBodyVswitchListVswitch> vswitch;

        public static ListVswitchResponseBodyVswitchList build(java.util.Map<String, ?> map) throws Exception {
            ListVswitchResponseBodyVswitchList self = new ListVswitchResponseBodyVswitchList();
            return TeaModel.build(map, self);
        }

        public ListVswitchResponseBodyVswitchList setVswitch(java.util.List<ListVswitchResponseBodyVswitchListVswitch> vswitch) {
            this.vswitch = vswitch;
            return this;
        }
        public java.util.List<ListVswitchResponseBodyVswitchListVswitch> getVswitch() {
            return this.vswitch;
        }

    }

}
