// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeIpControlsResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("IpControlInfos")
    public DescribeIpControlsResponseBodyIpControlInfos ipControlInfos;

    public static DescribeIpControlsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeIpControlsResponseBody self = new DescribeIpControlsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeIpControlsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeIpControlsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeIpControlsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeIpControlsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeIpControlsResponseBody setIpControlInfos(DescribeIpControlsResponseBodyIpControlInfos ipControlInfos) {
        this.ipControlInfos = ipControlInfos;
        return this;
    }
    public DescribeIpControlsResponseBodyIpControlInfos getIpControlInfos() {
        return this.ipControlInfos;
    }

    public static class DescribeIpControlsResponseBodyIpControlInfosIpControlInfo extends TeaModel {
        @NameInMap("IpControlId")
        public String ipControlId;

        @NameInMap("IpControlType")
        public String ipControlType;

        @NameInMap("ModifiedTime")
        public String modifiedTime;

        @NameInMap("IpControlName")
        public String ipControlName;

        @NameInMap("Description")
        public String description;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("RegionId")
        public String regionId;

        public static DescribeIpControlsResponseBodyIpControlInfosIpControlInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeIpControlsResponseBodyIpControlInfosIpControlInfo self = new DescribeIpControlsResponseBodyIpControlInfosIpControlInfo();
            return TeaModel.build(map, self);
        }

        public DescribeIpControlsResponseBodyIpControlInfosIpControlInfo setIpControlId(String ipControlId) {
            this.ipControlId = ipControlId;
            return this;
        }
        public String getIpControlId() {
            return this.ipControlId;
        }

        public DescribeIpControlsResponseBodyIpControlInfosIpControlInfo setIpControlType(String ipControlType) {
            this.ipControlType = ipControlType;
            return this;
        }
        public String getIpControlType() {
            return this.ipControlType;
        }

        public DescribeIpControlsResponseBodyIpControlInfosIpControlInfo setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public DescribeIpControlsResponseBodyIpControlInfosIpControlInfo setIpControlName(String ipControlName) {
            this.ipControlName = ipControlName;
            return this;
        }
        public String getIpControlName() {
            return this.ipControlName;
        }

        public DescribeIpControlsResponseBodyIpControlInfosIpControlInfo setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeIpControlsResponseBodyIpControlInfosIpControlInfo setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeIpControlsResponseBodyIpControlInfosIpControlInfo setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

    public static class DescribeIpControlsResponseBodyIpControlInfos extends TeaModel {
        @NameInMap("IpControlInfo")
        public java.util.List<DescribeIpControlsResponseBodyIpControlInfosIpControlInfo> ipControlInfo;

        public static DescribeIpControlsResponseBodyIpControlInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeIpControlsResponseBodyIpControlInfos self = new DescribeIpControlsResponseBodyIpControlInfos();
            return TeaModel.build(map, self);
        }

        public DescribeIpControlsResponseBodyIpControlInfos setIpControlInfo(java.util.List<DescribeIpControlsResponseBodyIpControlInfosIpControlInfo> ipControlInfo) {
            this.ipControlInfo = ipControlInfo;
            return this;
        }
        public java.util.List<DescribeIpControlsResponseBodyIpControlInfosIpControlInfo> getIpControlInfo() {
            return this.ipControlInfo;
        }

    }

}
