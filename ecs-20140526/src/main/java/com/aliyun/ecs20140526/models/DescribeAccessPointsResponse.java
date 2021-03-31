// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeAccessPointsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Integer totalCount;

    @NameInMap("AccessPointSet")
    @Validation(required = true)
    public DescribeAccessPointsResponseAccessPointSet accessPointSet;

    public static DescribeAccessPointsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAccessPointsResponse self = new DescribeAccessPointsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAccessPointsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAccessPointsResponse setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeAccessPointsResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeAccessPointsResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeAccessPointsResponse setAccessPointSet(DescribeAccessPointsResponseAccessPointSet accessPointSet) {
        this.accessPointSet = accessPointSet;
        return this;
    }
    public DescribeAccessPointsResponseAccessPointSet getAccessPointSet() {
        return this.accessPointSet;
    }

    public static class DescribeAccessPointsResponseAccessPointSetAccessPointType extends TeaModel {
        @NameInMap("AccessPointId")
        @Validation(required = true)
        public String accessPointId;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("Type")
        @Validation(required = true)
        public String type;

        @NameInMap("AttachedRegionNo")
        @Validation(required = true)
        public String attachedRegionNo;

        @NameInMap("Location")
        @Validation(required = true)
        public String location;

        @NameInMap("HostOperator")
        @Validation(required = true)
        public String hostOperator;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        public static DescribeAccessPointsResponseAccessPointSetAccessPointType build(java.util.Map<String, ?> map) throws Exception {
            DescribeAccessPointsResponseAccessPointSetAccessPointType self = new DescribeAccessPointsResponseAccessPointSetAccessPointType();
            return TeaModel.build(map, self);
        }

        public DescribeAccessPointsResponseAccessPointSetAccessPointType setAccessPointId(String accessPointId) {
            this.accessPointId = accessPointId;
            return this;
        }
        public String getAccessPointId() {
            return this.accessPointId;
        }

        public DescribeAccessPointsResponseAccessPointSetAccessPointType setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeAccessPointsResponseAccessPointSetAccessPointType setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeAccessPointsResponseAccessPointSetAccessPointType setAttachedRegionNo(String attachedRegionNo) {
            this.attachedRegionNo = attachedRegionNo;
            return this;
        }
        public String getAttachedRegionNo() {
            return this.attachedRegionNo;
        }

        public DescribeAccessPointsResponseAccessPointSetAccessPointType setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public DescribeAccessPointsResponseAccessPointSetAccessPointType setHostOperator(String hostOperator) {
            this.hostOperator = hostOperator;
            return this;
        }
        public String getHostOperator() {
            return this.hostOperator;
        }

        public DescribeAccessPointsResponseAccessPointSetAccessPointType setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeAccessPointsResponseAccessPointSetAccessPointType setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

    }

    public static class DescribeAccessPointsResponseAccessPointSet extends TeaModel {
        @NameInMap("AccessPointType")
        @Validation(required = true)
        public java.util.List<DescribeAccessPointsResponseAccessPointSetAccessPointType> accessPointType;

        public static DescribeAccessPointsResponseAccessPointSet build(java.util.Map<String, ?> map) throws Exception {
            DescribeAccessPointsResponseAccessPointSet self = new DescribeAccessPointsResponseAccessPointSet();
            return TeaModel.build(map, self);
        }

        public DescribeAccessPointsResponseAccessPointSet setAccessPointType(java.util.List<DescribeAccessPointsResponseAccessPointSetAccessPointType> accessPointType) {
            this.accessPointType = accessPointType;
            return this;
        }
        public java.util.List<DescribeAccessPointsResponseAccessPointSetAccessPointType> getAccessPointType() {
            return this.accessPointType;
        }

    }

}
