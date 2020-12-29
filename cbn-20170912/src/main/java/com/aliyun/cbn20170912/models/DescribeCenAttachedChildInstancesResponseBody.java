// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DescribeCenAttachedChildInstancesResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("ChildInstances")
    public java.util.List<DescribeCenAttachedChildInstancesResponseBodyChildInstances> childInstances;

    public static DescribeCenAttachedChildInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCenAttachedChildInstancesResponseBody self = new DescribeCenAttachedChildInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCenAttachedChildInstancesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeCenAttachedChildInstancesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeCenAttachedChildInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCenAttachedChildInstancesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeCenAttachedChildInstancesResponseBody setChildInstances(java.util.List<DescribeCenAttachedChildInstancesResponseBodyChildInstances> childInstances) {
        this.childInstances = childInstances;
        return this;
    }
    public java.util.List<DescribeCenAttachedChildInstancesResponseBodyChildInstances> getChildInstances() {
        return this.childInstances;
    }

    public static class DescribeCenAttachedChildInstancesResponseBodyChildInstances extends TeaModel {
        @NameInMap("ChildInstanceType")
        public String childInstanceType;

        @NameInMap("Status")
        public String status;

        @NameInMap("ChildInstanceRegionId")
        public String childInstanceRegionId;

        @NameInMap("ChildInstanceOwnerId")
        public Long childInstanceOwnerId;

        @NameInMap("ChildInstanceId")
        public String childInstanceId;

        @NameInMap("CenId")
        public String cenId;

        @NameInMap("ChildInstanceAttachTime")
        public String childInstanceAttachTime;

        public static DescribeCenAttachedChildInstancesResponseBodyChildInstances build(java.util.Map<String, ?> map) throws Exception {
            DescribeCenAttachedChildInstancesResponseBodyChildInstances self = new DescribeCenAttachedChildInstancesResponseBodyChildInstances();
            return TeaModel.build(map, self);
        }

        public DescribeCenAttachedChildInstancesResponseBodyChildInstances setChildInstanceType(String childInstanceType) {
            this.childInstanceType = childInstanceType;
            return this;
        }
        public String getChildInstanceType() {
            return this.childInstanceType;
        }

        public DescribeCenAttachedChildInstancesResponseBodyChildInstances setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeCenAttachedChildInstancesResponseBodyChildInstances setChildInstanceRegionId(String childInstanceRegionId) {
            this.childInstanceRegionId = childInstanceRegionId;
            return this;
        }
        public String getChildInstanceRegionId() {
            return this.childInstanceRegionId;
        }

        public DescribeCenAttachedChildInstancesResponseBodyChildInstances setChildInstanceOwnerId(Long childInstanceOwnerId) {
            this.childInstanceOwnerId = childInstanceOwnerId;
            return this;
        }
        public Long getChildInstanceOwnerId() {
            return this.childInstanceOwnerId;
        }

        public DescribeCenAttachedChildInstancesResponseBodyChildInstances setChildInstanceId(String childInstanceId) {
            this.childInstanceId = childInstanceId;
            return this;
        }
        public String getChildInstanceId() {
            return this.childInstanceId;
        }

        public DescribeCenAttachedChildInstancesResponseBodyChildInstances setCenId(String cenId) {
            this.cenId = cenId;
            return this;
        }
        public String getCenId() {
            return this.cenId;
        }

        public DescribeCenAttachedChildInstancesResponseBodyChildInstances setChildInstanceAttachTime(String childInstanceAttachTime) {
            this.childInstanceAttachTime = childInstanceAttachTime;
            return this;
        }
        public String getChildInstanceAttachTime() {
            return this.childInstanceAttachTime;
        }

    }

}
