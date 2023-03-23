// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeIpControlsResponseBody extends TeaModel {
    /**
     * <p>The information about the ACL. The information is an array that consists of IpControlInfo data. The information does not include specific policies.</p>
     */
    @NameInMap("IpControlInfos")
    public DescribeIpControlsResponseBodyIpControlInfos ipControlInfos;

    /**
     * <p>The page number of the returned page.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of returned entries.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeIpControlsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeIpControlsResponseBody self = new DescribeIpControlsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeIpControlsResponseBody setIpControlInfos(DescribeIpControlsResponseBodyIpControlInfos ipControlInfos) {
        this.ipControlInfos = ipControlInfos;
        return this;
    }
    public DescribeIpControlsResponseBodyIpControlInfos getIpControlInfos() {
        return this.ipControlInfos;
    }

    public DescribeIpControlsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeIpControlsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeIpControlsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeIpControlsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeIpControlsResponseBodyIpControlInfosIpControlInfo extends TeaModel {
        /**
         * <p>The time when the ACL was created. The time is displayed in UTC.</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The description of the ACL.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The ID of the ACL.</p>
         */
        @NameInMap("IpControlId")
        public String ipControlId;

        /**
         * <p>The name of the ACL.</p>
         */
        @NameInMap("IpControlName")
        public String ipControlName;

        /**
         * <p>The type of the ACL.</p>
         */
        @NameInMap("IpControlType")
        public String ipControlType;

        /**
         * <p>The time when the ACL was modified. The time is displayed in UTC.</p>
         */
        @NameInMap("ModifiedTime")
        public String modifiedTime;

        /**
         * <p>The ID of the region in which the ACL is deployed.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        public static DescribeIpControlsResponseBodyIpControlInfosIpControlInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeIpControlsResponseBodyIpControlInfosIpControlInfo self = new DescribeIpControlsResponseBodyIpControlInfosIpControlInfo();
            return TeaModel.build(map, self);
        }

        public DescribeIpControlsResponseBodyIpControlInfosIpControlInfo setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeIpControlsResponseBodyIpControlInfosIpControlInfo setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeIpControlsResponseBodyIpControlInfosIpControlInfo setIpControlId(String ipControlId) {
            this.ipControlId = ipControlId;
            return this;
        }
        public String getIpControlId() {
            return this.ipControlId;
        }

        public DescribeIpControlsResponseBodyIpControlInfosIpControlInfo setIpControlName(String ipControlName) {
            this.ipControlName = ipControlName;
            return this;
        }
        public String getIpControlName() {
            return this.ipControlName;
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
