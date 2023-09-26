// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160701.models;

import com.aliyun.tea.*;

public class VpcDescribeAccessesResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("VpcAccessAttributes")
    public VpcDescribeAccessesResponseBodyVpcAccessAttributes vpcAccessAttributes;

    public static VpcDescribeAccessesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        VpcDescribeAccessesResponseBody self = new VpcDescribeAccessesResponseBody();
        return TeaModel.build(map, self);
    }

    public VpcDescribeAccessesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public VpcDescribeAccessesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public VpcDescribeAccessesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public VpcDescribeAccessesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public VpcDescribeAccessesResponseBody setVpcAccessAttributes(VpcDescribeAccessesResponseBodyVpcAccessAttributes vpcAccessAttributes) {
        this.vpcAccessAttributes = vpcAccessAttributes;
        return this;
    }
    public VpcDescribeAccessesResponseBodyVpcAccessAttributes getVpcAccessAttributes() {
        return this.vpcAccessAttributes;
    }

    public static class VpcDescribeAccessesResponseBodyVpcAccessAttributesVpcAccessAttribute extends TeaModel {
        @NameInMap("CreatedTime")
        public String createdTime;

        @NameInMap("Id")
        public String id;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("ModifiedTime")
        public String modifiedTime;

        @NameInMap("Name")
        public String name;

        @NameInMap("Port")
        public String port;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("Status")
        public String status;

        @NameInMap("UserId")
        public String userId;

        @NameInMap("VpcId")
        public String vpcId;

        public static VpcDescribeAccessesResponseBodyVpcAccessAttributesVpcAccessAttribute build(java.util.Map<String, ?> map) throws Exception {
            VpcDescribeAccessesResponseBodyVpcAccessAttributesVpcAccessAttribute self = new VpcDescribeAccessesResponseBodyVpcAccessAttributesVpcAccessAttribute();
            return TeaModel.build(map, self);
        }

        public VpcDescribeAccessesResponseBodyVpcAccessAttributesVpcAccessAttribute setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public VpcDescribeAccessesResponseBodyVpcAccessAttributesVpcAccessAttribute setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public VpcDescribeAccessesResponseBodyVpcAccessAttributesVpcAccessAttribute setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public VpcDescribeAccessesResponseBodyVpcAccessAttributesVpcAccessAttribute setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public VpcDescribeAccessesResponseBodyVpcAccessAttributesVpcAccessAttribute setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public VpcDescribeAccessesResponseBodyVpcAccessAttributesVpcAccessAttribute setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public VpcDescribeAccessesResponseBodyVpcAccessAttributesVpcAccessAttribute setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public VpcDescribeAccessesResponseBodyVpcAccessAttributesVpcAccessAttribute setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public VpcDescribeAccessesResponseBodyVpcAccessAttributesVpcAccessAttribute setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public VpcDescribeAccessesResponseBodyVpcAccessAttributesVpcAccessAttribute setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

    public static class VpcDescribeAccessesResponseBodyVpcAccessAttributes extends TeaModel {
        @NameInMap("VpcAccessAttribute")
        public java.util.List<VpcDescribeAccessesResponseBodyVpcAccessAttributesVpcAccessAttribute> vpcAccessAttribute;

        public static VpcDescribeAccessesResponseBodyVpcAccessAttributes build(java.util.Map<String, ?> map) throws Exception {
            VpcDescribeAccessesResponseBodyVpcAccessAttributes self = new VpcDescribeAccessesResponseBodyVpcAccessAttributes();
            return TeaModel.build(map, self);
        }

        public VpcDescribeAccessesResponseBodyVpcAccessAttributes setVpcAccessAttribute(java.util.List<VpcDescribeAccessesResponseBodyVpcAccessAttributesVpcAccessAttribute> vpcAccessAttribute) {
            this.vpcAccessAttribute = vpcAccessAttribute;
            return this;
        }
        public java.util.List<VpcDescribeAccessesResponseBodyVpcAccessAttributesVpcAccessAttribute> getVpcAccessAttribute() {
            return this.vpcAccessAttribute;
        }

    }

}
