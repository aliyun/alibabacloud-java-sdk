// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeVpcAccessesResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("VpcAccessAttributes")
    public DescribeVpcAccessesResponseBodyVpcAccessAttributes vpcAccessAttributes;

    public static DescribeVpcAccessesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVpcAccessesResponseBody self = new DescribeVpcAccessesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVpcAccessesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeVpcAccessesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeVpcAccessesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVpcAccessesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeVpcAccessesResponseBody setVpcAccessAttributes(DescribeVpcAccessesResponseBodyVpcAccessAttributes vpcAccessAttributes) {
        this.vpcAccessAttributes = vpcAccessAttributes;
        return this;
    }
    public DescribeVpcAccessesResponseBodyVpcAccessAttributes getVpcAccessAttributes() {
        return this.vpcAccessAttributes;
    }

    public static class DescribeVpcAccessesResponseBodyVpcAccessAttributesVpcAccessAttribute extends TeaModel {
        // VPC授权的创建时间
        @NameInMap("CreatedTime")
        public String createdTime;

        // VPC授权的描述
        @NameInMap("Description")
        public String description;

        // VPC中的后端服务信息
        @NameInMap("InstanceId")
        public String instanceId;

        // VPC授权名称
        @NameInMap("Name")
        public String name;

        // VPC中的后端服务端口
        @NameInMap("Port")
        public Integer port;

        // 地域id
        @NameInMap("RegionId")
        public String regionId;

        // vpc授权ID
        @NameInMap("VpcAccessId")
        public String vpcAccessId;

        // VPC的ID
        @NameInMap("VpcId")
        public String vpcId;

        public static DescribeVpcAccessesResponseBodyVpcAccessAttributesVpcAccessAttribute build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpcAccessesResponseBodyVpcAccessAttributesVpcAccessAttribute self = new DescribeVpcAccessesResponseBodyVpcAccessAttributesVpcAccessAttribute();
            return TeaModel.build(map, self);
        }

        public DescribeVpcAccessesResponseBodyVpcAccessAttributesVpcAccessAttribute setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public DescribeVpcAccessesResponseBodyVpcAccessAttributesVpcAccessAttribute setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeVpcAccessesResponseBodyVpcAccessAttributesVpcAccessAttribute setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeVpcAccessesResponseBodyVpcAccessAttributesVpcAccessAttribute setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeVpcAccessesResponseBodyVpcAccessAttributesVpcAccessAttribute setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public DescribeVpcAccessesResponseBodyVpcAccessAttributesVpcAccessAttribute setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeVpcAccessesResponseBodyVpcAccessAttributesVpcAccessAttribute setVpcAccessId(String vpcAccessId) {
            this.vpcAccessId = vpcAccessId;
            return this;
        }
        public String getVpcAccessId() {
            return this.vpcAccessId;
        }

        public DescribeVpcAccessesResponseBodyVpcAccessAttributesVpcAccessAttribute setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

    public static class DescribeVpcAccessesResponseBodyVpcAccessAttributes extends TeaModel {
        @NameInMap("VpcAccessAttribute")
        public java.util.List<DescribeVpcAccessesResponseBodyVpcAccessAttributesVpcAccessAttribute> vpcAccessAttribute;

        public static DescribeVpcAccessesResponseBodyVpcAccessAttributes build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpcAccessesResponseBodyVpcAccessAttributes self = new DescribeVpcAccessesResponseBodyVpcAccessAttributes();
            return TeaModel.build(map, self);
        }

        public DescribeVpcAccessesResponseBodyVpcAccessAttributes setVpcAccessAttribute(java.util.List<DescribeVpcAccessesResponseBodyVpcAccessAttributesVpcAccessAttribute> vpcAccessAttribute) {
            this.vpcAccessAttribute = vpcAccessAttribute;
            return this;
        }
        public java.util.List<DescribeVpcAccessesResponseBodyVpcAccessAttributesVpcAccessAttribute> getVpcAccessAttribute() {
            return this.vpcAccessAttribute;
        }

    }

}
