// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ListSlbResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("Address")
        public String address;

        @NameInMap("AddressType")
        public String addressType;

        @NameInMap("Expired")
        public Boolean expired;

        @NameInMap("GroupId")
        public Integer groupId;

        @NameInMap("NetworkType")
        public String networkType;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("SlbId")
        public String slbId;

        @NameInMap("SlbName")
        public String slbName;

        @NameInMap("SlbStatus")
        public String slbStatus;

        @NameInMap("UserId")
        public String userId;

        @NameInMap("VpcId")
        public String vpcId;

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
