// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeAccessPointsResponseBody extends TeaModel {
    @NameInMap("AccessPointSet")
    public DescribeAccessPointsResponseBodyAccessPointSet accessPointSet;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    public static DescribeAccessPointsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAccessPointsResponseBody self = new DescribeAccessPointsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAccessPointsResponseBody setAccessPointSet(DescribeAccessPointsResponseBodyAccessPointSet accessPointSet) {
        this.accessPointSet = accessPointSet;
        return this;
    }
    public DescribeAccessPointsResponseBodyAccessPointSet getAccessPointSet() {
        return this.accessPointSet;
    }

    public DescribeAccessPointsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeAccessPointsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAccessPointsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeAccessPointsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public static class DescribeAccessPointsResponseBodyAccessPointSetAccessPointType extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("Type")
        public String type;

        @NameInMap("HostOperator")
        public String hostOperator;

        @NameInMap("Description")
        public String description;

        @NameInMap("AttachedRegionNo")
        public String attachedRegionNo;

        @NameInMap("Name")
        public String name;

        @NameInMap("AccessPointId")
        public String accessPointId;

        @NameInMap("Location")
        public String location;

        public static DescribeAccessPointsResponseBodyAccessPointSetAccessPointType build(java.util.Map<String, ?> map) throws Exception {
            DescribeAccessPointsResponseBodyAccessPointSetAccessPointType self = new DescribeAccessPointsResponseBodyAccessPointSetAccessPointType();
            return TeaModel.build(map, self);
        }

        public DescribeAccessPointsResponseBodyAccessPointSetAccessPointType setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeAccessPointsResponseBodyAccessPointSetAccessPointType setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeAccessPointsResponseBodyAccessPointSetAccessPointType setHostOperator(String hostOperator) {
            this.hostOperator = hostOperator;
            return this;
        }
        public String getHostOperator() {
            return this.hostOperator;
        }

        public DescribeAccessPointsResponseBodyAccessPointSetAccessPointType setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeAccessPointsResponseBodyAccessPointSetAccessPointType setAttachedRegionNo(String attachedRegionNo) {
            this.attachedRegionNo = attachedRegionNo;
            return this;
        }
        public String getAttachedRegionNo() {
            return this.attachedRegionNo;
        }

        public DescribeAccessPointsResponseBodyAccessPointSetAccessPointType setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeAccessPointsResponseBodyAccessPointSetAccessPointType setAccessPointId(String accessPointId) {
            this.accessPointId = accessPointId;
            return this;
        }
        public String getAccessPointId() {
            return this.accessPointId;
        }

        public DescribeAccessPointsResponseBodyAccessPointSetAccessPointType setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

    }

    public static class DescribeAccessPointsResponseBodyAccessPointSet extends TeaModel {
        @NameInMap("AccessPointType")
        public java.util.List<DescribeAccessPointsResponseBodyAccessPointSetAccessPointType> accessPointType;

        public static DescribeAccessPointsResponseBodyAccessPointSet build(java.util.Map<String, ?> map) throws Exception {
            DescribeAccessPointsResponseBodyAccessPointSet self = new DescribeAccessPointsResponseBodyAccessPointSet();
            return TeaModel.build(map, self);
        }

        public DescribeAccessPointsResponseBodyAccessPointSet setAccessPointType(java.util.List<DescribeAccessPointsResponseBodyAccessPointSetAccessPointType> accessPointType) {
            this.accessPointType = accessPointType;
            return this;
        }
        public java.util.List<DescribeAccessPointsResponseBodyAccessPointSetAccessPointType> getAccessPointType() {
            return this.accessPointType;
        }

    }

}
