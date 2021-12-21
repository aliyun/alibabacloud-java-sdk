// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DescribeCenAttachedChildInstancesResponseBody extends TeaModel {
    @NameInMap("ChildInstances")
    public DescribeCenAttachedChildInstancesResponseBodyChildInstances childInstances;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeCenAttachedChildInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCenAttachedChildInstancesResponseBody self = new DescribeCenAttachedChildInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCenAttachedChildInstancesResponseBody setChildInstances(DescribeCenAttachedChildInstancesResponseBodyChildInstances childInstances) {
        this.childInstances = childInstances;
        return this;
    }
    public DescribeCenAttachedChildInstancesResponseBodyChildInstances getChildInstances() {
        return this.childInstances;
    }

    public DescribeCenAttachedChildInstancesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
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

    public DescribeCenAttachedChildInstancesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeCenAttachedChildInstancesResponseBodyChildInstancesChildInstance extends TeaModel {
        @NameInMap("CenId")
        public String cenId;

        @NameInMap("ChildInstanceAttachTime")
        public String childInstanceAttachTime;

        @NameInMap("ChildInstanceId")
        public String childInstanceId;

        @NameInMap("ChildInstanceOwnerId")
        public Long childInstanceOwnerId;

        @NameInMap("ChildInstanceRegionId")
        public String childInstanceRegionId;

        @NameInMap("ChildInstanceType")
        public String childInstanceType;

        @NameInMap("Status")
        public String status;

        public static DescribeCenAttachedChildInstancesResponseBodyChildInstancesChildInstance build(java.util.Map<String, ?> map) throws Exception {
            DescribeCenAttachedChildInstancesResponseBodyChildInstancesChildInstance self = new DescribeCenAttachedChildInstancesResponseBodyChildInstancesChildInstance();
            return TeaModel.build(map, self);
        }

        public DescribeCenAttachedChildInstancesResponseBodyChildInstancesChildInstance setCenId(String cenId) {
            this.cenId = cenId;
            return this;
        }
        public String getCenId() {
            return this.cenId;
        }

        public DescribeCenAttachedChildInstancesResponseBodyChildInstancesChildInstance setChildInstanceAttachTime(String childInstanceAttachTime) {
            this.childInstanceAttachTime = childInstanceAttachTime;
            return this;
        }
        public String getChildInstanceAttachTime() {
            return this.childInstanceAttachTime;
        }

        public DescribeCenAttachedChildInstancesResponseBodyChildInstancesChildInstance setChildInstanceId(String childInstanceId) {
            this.childInstanceId = childInstanceId;
            return this;
        }
        public String getChildInstanceId() {
            return this.childInstanceId;
        }

        public DescribeCenAttachedChildInstancesResponseBodyChildInstancesChildInstance setChildInstanceOwnerId(Long childInstanceOwnerId) {
            this.childInstanceOwnerId = childInstanceOwnerId;
            return this;
        }
        public Long getChildInstanceOwnerId() {
            return this.childInstanceOwnerId;
        }

        public DescribeCenAttachedChildInstancesResponseBodyChildInstancesChildInstance setChildInstanceRegionId(String childInstanceRegionId) {
            this.childInstanceRegionId = childInstanceRegionId;
            return this;
        }
        public String getChildInstanceRegionId() {
            return this.childInstanceRegionId;
        }

        public DescribeCenAttachedChildInstancesResponseBodyChildInstancesChildInstance setChildInstanceType(String childInstanceType) {
            this.childInstanceType = childInstanceType;
            return this;
        }
        public String getChildInstanceType() {
            return this.childInstanceType;
        }

        public DescribeCenAttachedChildInstancesResponseBodyChildInstancesChildInstance setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeCenAttachedChildInstancesResponseBodyChildInstances extends TeaModel {
        @NameInMap("ChildInstance")
        public java.util.List<DescribeCenAttachedChildInstancesResponseBodyChildInstancesChildInstance> childInstance;

        public static DescribeCenAttachedChildInstancesResponseBodyChildInstances build(java.util.Map<String, ?> map) throws Exception {
            DescribeCenAttachedChildInstancesResponseBodyChildInstances self = new DescribeCenAttachedChildInstancesResponseBodyChildInstances();
            return TeaModel.build(map, self);
        }

        public DescribeCenAttachedChildInstancesResponseBodyChildInstances setChildInstance(java.util.List<DescribeCenAttachedChildInstancesResponseBodyChildInstancesChildInstance> childInstance) {
            this.childInstance = childInstance;
            return this;
        }
        public java.util.List<DescribeCenAttachedChildInstancesResponseBodyChildInstancesChildInstance> getChildInstance() {
            return this.childInstance;
        }

    }

}
