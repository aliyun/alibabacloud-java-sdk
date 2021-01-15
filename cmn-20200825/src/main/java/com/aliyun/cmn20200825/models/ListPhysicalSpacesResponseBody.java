// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class ListPhysicalSpacesResponseBody extends TeaModel {
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

    // 每页数量。
    @NameInMap("MaxResults")
    public Integer maxResults;

    public static ListPhysicalSpacesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPhysicalSpacesResponseBody self = new ListPhysicalSpacesResponseBody();
        return TeaModel.build(map, self);
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

    public ListPhysicalSpacesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public static class ListPhysicalSpacesResponseBodyPhysicalSpaces extends TeaModel {
        // 物理空间ID
        @NameInMap("PhysicalSpaceId")
        public String physicalSpaceId;

        // 物理空间名称
        @NameInMap("PhysicalSpaceName")
        public String physicalSpaceName;

        // 所属国家
        @NameInMap("Country")
        public String country;

        // 所属省份
        @NameInMap("Province")
        public String province;

        // 所属城市
        @NameInMap("City")
        public String city;

        // 具体地址
        @NameInMap("Address")
        public String address;

        public static ListPhysicalSpacesResponseBodyPhysicalSpaces build(java.util.Map<String, ?> map) throws Exception {
            ListPhysicalSpacesResponseBodyPhysicalSpaces self = new ListPhysicalSpacesResponseBodyPhysicalSpaces();
            return TeaModel.build(map, self);
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

        public ListPhysicalSpacesResponseBodyPhysicalSpaces setCountry(String country) {
            this.country = country;
            return this;
        }
        public String getCountry() {
            return this.country;
        }

        public ListPhysicalSpacesResponseBodyPhysicalSpaces setProvince(String province) {
            this.province = province;
            return this;
        }
        public String getProvince() {
            return this.province;
        }

        public ListPhysicalSpacesResponseBodyPhysicalSpaces setCity(String city) {
            this.city = city;
            return this;
        }
        public String getCity() {
            return this.city;
        }

        public ListPhysicalSpacesResponseBodyPhysicalSpaces setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

    }

}
