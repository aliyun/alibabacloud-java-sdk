// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ListVpcResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The information about VPCs.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The name of the VPC.</p>
     * 
     * <strong>example:</strong>
     * <p>b197-40ab-9155-7ca7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the VPC is available. Valid values:</p>
     * <ul>
     * <li>true: The VPC is available.</li>
     * <li>false: The VPC is unavailable.</li>
     * </ul>
     */
    @NameInMap("VpcList")
    public ListVpcResponseBodyVpcList vpcList;

    public static ListVpcResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListVpcResponseBody self = new ListVpcResponseBody();
        return TeaModel.build(map, self);
    }

    public ListVpcResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
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

    public static class ListVpcResponseBodyVpcListVpcEntity extends TeaModel {
        /**
         * <p>This operation uses only common request headers. For more information, see <a href="https://help.aliyun.com/document_detail/123488.html">Common parameters for API calls</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("EcsNum")
        public Integer ecsNum;

        /**
         * <p>The region ID of the VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Expired")
        public Boolean expired;

        /**
         * <p>No request parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shenzhen</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>GET /pop/v5/vpc_list HTTP/1.1
         * Common request headers</p>
         * 
         * <strong>example:</strong>
         * <p>edas_****_test@aliyun-****.com</p>
         */
        @NameInMap("UserId")
        public String userId;

        /**
         * <p>The ID of the Alibaba Cloud account to which the VPC belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-wz9pcq3jofczwpujq****</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <p>The number of ECS instances associated with the VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>edas-default-vpc4</p>
         */
        @NameInMap("VpcName")
        public String vpcName;

        public static ListVpcResponseBodyVpcListVpcEntity build(java.util.Map<String, ?> map) throws Exception {
            ListVpcResponseBodyVpcListVpcEntity self = new ListVpcResponseBodyVpcListVpcEntity();
            return TeaModel.build(map, self);
        }

        public ListVpcResponseBodyVpcListVpcEntity setEcsNum(Integer ecsNum) {
            this.ecsNum = ecsNum;
            return this;
        }
        public Integer getEcsNum() {
            return this.ecsNum;
        }

        public ListVpcResponseBodyVpcListVpcEntity setExpired(Boolean expired) {
            this.expired = expired;
            return this;
        }
        public Boolean getExpired() {
            return this.expired;
        }

        public ListVpcResponseBodyVpcListVpcEntity setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListVpcResponseBodyVpcListVpcEntity setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
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
