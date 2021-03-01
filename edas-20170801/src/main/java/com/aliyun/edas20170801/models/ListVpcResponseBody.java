// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ListVpcResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("VpcList")
    public ListVpcResponseBodyVpcList vpcList;

    @NameInMap("Code")
    public Integer code;

    public static ListVpcResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListVpcResponseBody self = new ListVpcResponseBody();
        return TeaModel.build(map, self);
    }

    public ListVpcResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListVpcResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListVpcResponseBody setVpcList(ListVpcResponseBodyVpcList vpcList) {
        this.vpcList = vpcList;
        return this;
    }
    public ListVpcResponseBodyVpcList getVpcList() {
        return this.vpcList;
    }

    public ListVpcResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public static class ListVpcResponseBodyVpcListVpcEntity extends TeaModel {
        @NameInMap("VpcId")
        public String vpcId;

        @NameInMap("VpcName")
        public String vpcName;

        @NameInMap("Expired")
        public Boolean expired;

        @NameInMap("UserId")
        public String userId;

        @NameInMap("EcsNum")
        public Integer ecsNum;

        @NameInMap("RegionId")
        public String regionId;

        public static ListVpcResponseBodyVpcListVpcEntity build(java.util.Map<String, ?> map) throws Exception {
            ListVpcResponseBodyVpcListVpcEntity self = new ListVpcResponseBodyVpcListVpcEntity();
            return TeaModel.build(map, self);
        }

        public ListVpcResponseBodyVpcListVpcEntity setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public ListVpcResponseBodyVpcListVpcEntity setVpcName(String vpcName) {
            this.vpcName = vpcName;
            return this;
        }
        public String getVpcName() {
            return this.vpcName;
        }

        public ListVpcResponseBodyVpcListVpcEntity setExpired(Boolean expired) {
            this.expired = expired;
            return this;
        }
        public Boolean getExpired() {
            return this.expired;
        }

        public ListVpcResponseBodyVpcListVpcEntity setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public ListVpcResponseBodyVpcListVpcEntity setEcsNum(Integer ecsNum) {
            this.ecsNum = ecsNum;
            return this;
        }
        public Integer getEcsNum() {
            return this.ecsNum;
        }

        public ListVpcResponseBodyVpcListVpcEntity setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

    public static class ListVpcResponseBodyVpcList extends TeaModel {
        @NameInMap("VpcEntity")
        public java.util.List<ListVpcResponseBodyVpcListVpcEntity> vpcEntity;

        public static ListVpcResponseBodyVpcList build(java.util.Map<String, ?> map) throws Exception {
            ListVpcResponseBodyVpcList self = new ListVpcResponseBodyVpcList();
            return TeaModel.build(map, self);
        }

        public ListVpcResponseBodyVpcList setVpcEntity(java.util.List<ListVpcResponseBodyVpcListVpcEntity> vpcEntity) {
            this.vpcEntity = vpcEntity;
            return this;
        }
        public java.util.List<ListVpcResponseBodyVpcListVpcEntity> getVpcEntity() {
            return this.vpcEntity;
        }

    }

}
