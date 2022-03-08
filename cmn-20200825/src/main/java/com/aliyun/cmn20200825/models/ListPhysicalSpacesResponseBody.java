// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class ListPhysicalSpacesResponseBody extends TeaModel {
    // 每页数量。
    @NameInMap("MaxResults")
    public Integer maxResults;

    // 当总结果个数大于MaxResults时，用于翻页的token。
    @NameInMap("NextToken")
    public Integer nextToken;

    // 数组，返回示例目录。
    @NameInMap("PhysicalSpaces")
    public java.util.List<ListPhysicalSpacesResponseBodyPhysicalSpaces> physicalSpaces;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // 总记录数。
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListPhysicalSpacesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPhysicalSpacesResponseBody self = new ListPhysicalSpacesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPhysicalSpacesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListPhysicalSpacesResponseBody setNextToken(Integer nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public Integer getNextToken() {
        return this.nextToken;
    }

    public ListPhysicalSpacesResponseBody setPhysicalSpaces(java.util.List<ListPhysicalSpacesResponseBodyPhysicalSpaces> physicalSpaces) {
        this.physicalSpaces = physicalSpaces;
        return this;
    }
    public java.util.List<ListPhysicalSpacesResponseBodyPhysicalSpaces> getPhysicalSpaces() {
        return this.physicalSpaces;
    }

    public ListPhysicalSpacesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListPhysicalSpacesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListPhysicalSpacesResponseBodyPhysicalSpaces extends TeaModel {
        // 具体地址
        @NameInMap("Address")
        public String address;

        // 所属城市
        @NameInMap("City")
        public String city;

        // 所属国家
        @NameInMap("Country")
        public String country;

        // 实例
        @NameInMap("Instance")
        public String instance;

        // 负责人
        @NameInMap("Owner")
        public String owner;

        // 物理空间ID
        @NameInMap("PhysicalSpaceId")
        public String physicalSpaceId;

        // 物理空间名称
        @NameInMap("PhysicalSpaceName")
        public String physicalSpaceName;

        // 所属省份
        @NameInMap("Province")
        public String province;

        // 备注
        @NameInMap("Remark")
        public String remark;

        // 缩写
        @NameInMap("SpaceAbbreviation")
        public String spaceAbbreviation;

        // 模型
        @NameInMap("SpaceType")
        public String spaceType;

        public static ListPhysicalSpacesResponseBodyPhysicalSpaces build(java.util.Map<String, ?> map) throws Exception {
            ListPhysicalSpacesResponseBodyPhysicalSpaces self = new ListPhysicalSpacesResponseBodyPhysicalSpaces();
            return TeaModel.build(map, self);
        }

        public ListPhysicalSpacesResponseBodyPhysicalSpaces setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public ListPhysicalSpacesResponseBodyPhysicalSpaces setCity(String city) {
            this.city = city;
            return this;
        }
        public String getCity() {
            return this.city;
        }

        public ListPhysicalSpacesResponseBodyPhysicalSpaces setCountry(String country) {
            this.country = country;
            return this;
        }
        public String getCountry() {
            return this.country;
        }

        public ListPhysicalSpacesResponseBodyPhysicalSpaces setInstance(String instance) {
            this.instance = instance;
            return this;
        }
        public String getInstance() {
            return this.instance;
        }

        public ListPhysicalSpacesResponseBodyPhysicalSpaces setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public ListPhysicalSpacesResponseBodyPhysicalSpaces setPhysicalSpaceId(String physicalSpaceId) {
            this.physicalSpaceId = physicalSpaceId;
            return this;
        }
        public String getPhysicalSpaceId() {
            return this.physicalSpaceId;
        }

        public ListPhysicalSpacesResponseBodyPhysicalSpaces setPhysicalSpaceName(String physicalSpaceName) {
            this.physicalSpaceName = physicalSpaceName;
            return this;
        }
        public String getPhysicalSpaceName() {
            return this.physicalSpaceName;
        }

        public ListPhysicalSpacesResponseBodyPhysicalSpaces setProvince(String province) {
            this.province = province;
            return this;
        }
        public String getProvince() {
            return this.province;
        }

        public ListPhysicalSpacesResponseBodyPhysicalSpaces setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public ListPhysicalSpacesResponseBodyPhysicalSpaces setSpaceAbbreviation(String spaceAbbreviation) {
            this.spaceAbbreviation = spaceAbbreviation;
            return this;
        }
        public String getSpaceAbbreviation() {
            return this.spaceAbbreviation;
        }

        public ListPhysicalSpacesResponseBodyPhysicalSpaces setSpaceType(String spaceType) {
            this.spaceType = spaceType;
            return this;
        }
        public String getSpaceType() {
            return this.spaceType;
        }

    }

}
