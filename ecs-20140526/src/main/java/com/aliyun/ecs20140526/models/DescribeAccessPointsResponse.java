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

    }

    public static class DescribeAccessPointsResponseAccessPointSet extends TeaModel {
        @NameInMap("AccessPointType")
        @Validation(required = true)
        public java.util.List<DescribeAccessPointsResponseAccessPointSetAccessPointType> accessPointType;

        public static DescribeAccessPointsResponseAccessPointSet build(java.util.Map<String, ?> map) throws Exception {
            DescribeAccessPointsResponseAccessPointSet self = new DescribeAccessPointsResponseAccessPointSet();
            return TeaModel.build(map, self);
        }

    }

}
