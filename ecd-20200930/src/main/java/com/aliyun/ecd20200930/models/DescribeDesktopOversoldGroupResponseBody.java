// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeDesktopOversoldGroupResponseBody extends TeaModel {
    @NameInMap("Count")
    public Integer count;

    @NameInMap("Data")
    public java.util.List<DescribeDesktopOversoldGroupResponseBodyData> data;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDesktopOversoldGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDesktopOversoldGroupResponseBody self = new DescribeDesktopOversoldGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDesktopOversoldGroupResponseBody setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public DescribeDesktopOversoldGroupResponseBody setData(java.util.List<DescribeDesktopOversoldGroupResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeDesktopOversoldGroupResponseBodyData> getData() {
        return this.data;
    }

    public DescribeDesktopOversoldGroupResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeDesktopOversoldGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDesktopOversoldGroupResponseBodyData extends TeaModel {
        @NameInMap("ConcurrenceCount")
        public Integer concurrenceCount;

        @NameInMap("CurConcurrenceCount")
        public Integer curConcurrenceCount;

        @NameInMap("DataDiskSize")
        public Integer dataDiskSize;

        @NameInMap("Description")
        public String description;

        @NameInMap("DesktopType")
        public String desktopType;

        @NameInMap("DirectoryId")
        public String directoryId;

        @NameInMap("ExpireTime")
        public String expireTime;

        @NameInMap("ImageId")
        public String imageId;

        @NameInMap("Name")
        public String name;

        @NameInMap("OversoldGroupId")
        public String oversoldGroupId;

        @NameInMap("OversoldUserCount")
        public Integer oversoldUserCount;

        @NameInMap("OversoldWarn")
        public Integer oversoldWarn;

        @NameInMap("PolicyGroupId")
        public String policyGroupId;

        @NameInMap("SaleStatus")
        public String saleStatus;

        @NameInMap("Status")
        public String status;

        @NameInMap("StopDuration")
        public Long stopDuration;

        @NameInMap("SystemDiskSize")
        public Integer systemDiskSize;

        public static DescribeDesktopOversoldGroupResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeDesktopOversoldGroupResponseBodyData self = new DescribeDesktopOversoldGroupResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeDesktopOversoldGroupResponseBodyData setConcurrenceCount(Integer concurrenceCount) {
            this.concurrenceCount = concurrenceCount;
            return this;
        }
        public Integer getConcurrenceCount() {
            return this.concurrenceCount;
        }

        public DescribeDesktopOversoldGroupResponseBodyData setCurConcurrenceCount(Integer curConcurrenceCount) {
            this.curConcurrenceCount = curConcurrenceCount;
            return this;
        }
        public Integer getCurConcurrenceCount() {
            return this.curConcurrenceCount;
        }

        public DescribeDesktopOversoldGroupResponseBodyData setDataDiskSize(Integer dataDiskSize) {
            this.dataDiskSize = dataDiskSize;
            return this;
        }
        public Integer getDataDiskSize() {
            return this.dataDiskSize;
        }

        public DescribeDesktopOversoldGroupResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeDesktopOversoldGroupResponseBodyData setDesktopType(String desktopType) {
            this.desktopType = desktopType;
            return this;
        }
        public String getDesktopType() {
            return this.desktopType;
        }

        public DescribeDesktopOversoldGroupResponseBodyData setDirectoryId(String directoryId) {
            this.directoryId = directoryId;
            return this;
        }
        public String getDirectoryId() {
            return this.directoryId;
        }

        public DescribeDesktopOversoldGroupResponseBodyData setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public DescribeDesktopOversoldGroupResponseBodyData setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public DescribeDesktopOversoldGroupResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeDesktopOversoldGroupResponseBodyData setOversoldGroupId(String oversoldGroupId) {
            this.oversoldGroupId = oversoldGroupId;
            return this;
        }
        public String getOversoldGroupId() {
            return this.oversoldGroupId;
        }

        public DescribeDesktopOversoldGroupResponseBodyData setOversoldUserCount(Integer oversoldUserCount) {
            this.oversoldUserCount = oversoldUserCount;
            return this;
        }
        public Integer getOversoldUserCount() {
            return this.oversoldUserCount;
        }

        public DescribeDesktopOversoldGroupResponseBodyData setOversoldWarn(Integer oversoldWarn) {
            this.oversoldWarn = oversoldWarn;
            return this;
        }
        public Integer getOversoldWarn() {
            return this.oversoldWarn;
        }

        public DescribeDesktopOversoldGroupResponseBodyData setPolicyGroupId(String policyGroupId) {
            this.policyGroupId = policyGroupId;
            return this;
        }
        public String getPolicyGroupId() {
            return this.policyGroupId;
        }

        public DescribeDesktopOversoldGroupResponseBodyData setSaleStatus(String saleStatus) {
            this.saleStatus = saleStatus;
            return this;
        }
        public String getSaleStatus() {
            return this.saleStatus;
        }

        public DescribeDesktopOversoldGroupResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeDesktopOversoldGroupResponseBodyData setStopDuration(Long stopDuration) {
            this.stopDuration = stopDuration;
            return this;
        }
        public Long getStopDuration() {
            return this.stopDuration;
        }

        public DescribeDesktopOversoldGroupResponseBodyData setSystemDiskSize(Integer systemDiskSize) {
            this.systemDiskSize = systemDiskSize;
            return this;
        }
        public Integer getSystemDiskSize() {
            return this.systemDiskSize;
        }

    }

}
