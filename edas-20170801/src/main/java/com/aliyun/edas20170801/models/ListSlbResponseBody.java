// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ListSlbResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code that is returned.</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The additional information that is returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of SLB instances.</p>
     */
    @NameInMap("SlbList")
    public ListSlbResponseBodySlbList slbList;

    public static ListSlbResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSlbResponseBody self = new ListSlbResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSlbResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListSlbResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListSlbResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSlbResponseBody setSlbList(ListSlbResponseBodySlbList slbList) {
        this.slbList = slbList;
        return this;
    }
    public ListSlbResponseBodySlbList getSlbList() {
        return this.slbList;
    }

    public static class ListSlbResponseBodySlbListSlbEntity extends TeaModel {
        /**
         * <p>The IP address of the SLB instance.</p>
         */
        @NameInMap("Address")
        public String address;

        /**
         * <p>The type of the IP addresses. Valid values:</p>
         * <br>
         * <p>*   internet: Users can connect to the SLB instance over the Internet.</p>
         * <p>*   intranet: Users can connect to the SLB instance over the internal network.</p>
         */
        @NameInMap("AddressType")
        public String addressType;

        /**
         * <p>Indicates whether the SLB instance has expired. Valid values:</p>
         * <br>
         * <p>*   true: The SLB instance has expired.</p>
         * <p>*   false: The SLB instance has not expired.</p>
         */
        @NameInMap("Expired")
        public Boolean expired;

        /**
         * <p>The ID of the resource group in Enterprise Distributed Application Service (EDAS).</p>
         */
        @NameInMap("GroupId")
        public Integer groupId;

        /**
         * <p>The type of the network.</p>
         */
        @NameInMap("NetworkType")
        public String networkType;

        /**
         * <p>The ID of the region.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>Indicates whether Kubernetes applications can be reused. Valid values:</p>
         * <br>
         * <p>*   true: Kubernetes applications can be reused.</p>
         * <p>*   false: Kubernetes applications cannot be reused.</p>
         */
        @NameInMap("Reusable")
        public Boolean reusable;

        /**
         * <p>The ID of the SLB instance.</p>
         */
        @NameInMap("SlbId")
        public String slbId;

        /**
         * <p>The name of the SLB instance.</p>
         */
        @NameInMap("SlbName")
        public String slbName;

        /**
         * <p>The status of the SLB instance.</p>
         */
        @NameInMap("SlbStatus")
        public String slbStatus;

        /**
         * <p>The tag of the SLB instance.</p>
         */
        @NameInMap("Tags")
        public String tags;

        /**
         * <p>The ID of the user.</p>
         */
        @NameInMap("UserId")
        public String userId;

        /**
         * <p>The ID of the VPC.</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <p>The ID of the vSwitch in the VPC.</p>
         */
        @NameInMap("VswitchId")
        public String vswitchId;

        public static ListSlbResponseBodySlbListSlbEntity build(java.util.Map<String, ?> map) throws Exception {
            ListSlbResponseBodySlbListSlbEntity self = new ListSlbResponseBodySlbListSlbEntity();
            return TeaModel.build(map, self);
        }

        public ListSlbResponseBodySlbListSlbEntity setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public ListSlbResponseBodySlbListSlbEntity setAddressType(String addressType) {
            this.addressType = addressType;
            return this;
        }
        public String getAddressType() {
            return this.addressType;
        }

        public ListSlbResponseBodySlbListSlbEntity setExpired(Boolean expired) {
            this.expired = expired;
            return this;
        }
        public Boolean getExpired() {
            return this.expired;
        }

        public ListSlbResponseBodySlbListSlbEntity setGroupId(Integer groupId) {
            this.groupId = groupId;
            return this;
        }
        public Integer getGroupId() {
            return this.groupId;
        }

        public ListSlbResponseBodySlbListSlbEntity setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

        public ListSlbResponseBodySlbListSlbEntity setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListSlbResponseBodySlbListSlbEntity setReusable(Boolean reusable) {
            this.reusable = reusable;
            return this;
        }
        public Boolean getReusable() {
            return this.reusable;
        }

        public ListSlbResponseBodySlbListSlbEntity setSlbId(String slbId) {
            this.slbId = slbId;
            return this;
        }
        public String getSlbId() {
            return this.slbId;
        }

        public ListSlbResponseBodySlbListSlbEntity setSlbName(String slbName) {
            this.slbName = slbName;
            return this;
        }
        public String getSlbName() {
            return this.slbName;
        }

        public ListSlbResponseBodySlbListSlbEntity setSlbStatus(String slbStatus) {
            this.slbStatus = slbStatus;
            return this;
        }
        public String getSlbStatus() {
            return this.slbStatus;
        }

        public ListSlbResponseBodySlbListSlbEntity setTags(String tags) {
            this.tags = tags;
            return this;
        }
        public String getTags() {
            return this.tags;
        }

        public ListSlbResponseBodySlbListSlbEntity setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public ListSlbResponseBodySlbListSlbEntity setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public ListSlbResponseBodySlbListSlbEntity setVswitchId(String vswitchId) {
            this.vswitchId = vswitchId;
            return this;
        }
        public String getVswitchId() {
            return this.vswitchId;
        }

    }

    public static class ListSlbResponseBodySlbList extends TeaModel {
        @NameInMap("SlbEntity")
        public java.util.List<ListSlbResponseBodySlbListSlbEntity> slbEntity;

        public static ListSlbResponseBodySlbList build(java.util.Map<String, ?> map) throws Exception {
            ListSlbResponseBodySlbList self = new ListSlbResponseBodySlbList();
            return TeaModel.build(map, self);
        }

        public ListSlbResponseBodySlbList setSlbEntity(java.util.List<ListSlbResponseBodySlbListSlbEntity> slbEntity) {
            this.slbEntity = slbEntity;
            return this;
        }
        public java.util.List<ListSlbResponseBodySlbListSlbEntity> getSlbEntity() {
            return this.slbEntity;
        }

    }

}
