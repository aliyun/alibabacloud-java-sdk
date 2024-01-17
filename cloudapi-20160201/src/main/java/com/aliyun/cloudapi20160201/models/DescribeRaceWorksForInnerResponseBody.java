// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160201.models;

import com.aliyun.tea.*;

public class DescribeRaceWorksForInnerResponseBody extends TeaModel {
    @NameInMap("ApiWorks")
    public DescribeRaceWorksForInnerResponseBodyApiWorks apiWorks;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeRaceWorksForInnerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRaceWorksForInnerResponseBody self = new DescribeRaceWorksForInnerResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRaceWorksForInnerResponseBody setApiWorks(DescribeRaceWorksForInnerResponseBodyApiWorks apiWorks) {
        this.apiWorks = apiWorks;
        return this;
    }
    public DescribeRaceWorksForInnerResponseBodyApiWorks getApiWorks() {
        return this.apiWorks;
    }

    public DescribeRaceWorksForInnerResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeRaceWorksForInnerResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeRaceWorksForInnerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRaceWorksForInnerResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeRaceWorksForInnerResponseBodyApiWorksApiWork extends TeaModel {
        @NameInMap("CommodityCode")
        public String commodityCode;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("GroupId")
        public String groupId;

        @NameInMap("Keywords")
        public String keywords;

        @NameInMap("LogoUrl")
        public String logoUrl;

        @NameInMap("ModifiedTime")
        public String modifiedTime;

        @NameInMap("ShortDescription")
        public String shortDescription;

        @NameInMap("WorkName")
        public String workName;

        public static DescribeRaceWorksForInnerResponseBodyApiWorksApiWork build(java.util.Map<String, ?> map) throws Exception {
            DescribeRaceWorksForInnerResponseBodyApiWorksApiWork self = new DescribeRaceWorksForInnerResponseBodyApiWorksApiWork();
            return TeaModel.build(map, self);
        }

        public DescribeRaceWorksForInnerResponseBodyApiWorksApiWork setCommodityCode(String commodityCode) {
            this.commodityCode = commodityCode;
            return this;
        }
        public String getCommodityCode() {
            return this.commodityCode;
        }

        public DescribeRaceWorksForInnerResponseBodyApiWorksApiWork setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeRaceWorksForInnerResponseBodyApiWorksApiWork setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public DescribeRaceWorksForInnerResponseBodyApiWorksApiWork setKeywords(String keywords) {
            this.keywords = keywords;
            return this;
        }
        public String getKeywords() {
            return this.keywords;
        }

        public DescribeRaceWorksForInnerResponseBodyApiWorksApiWork setLogoUrl(String logoUrl) {
            this.logoUrl = logoUrl;
            return this;
        }
        public String getLogoUrl() {
            return this.logoUrl;
        }

        public DescribeRaceWorksForInnerResponseBodyApiWorksApiWork setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public DescribeRaceWorksForInnerResponseBodyApiWorksApiWork setShortDescription(String shortDescription) {
            this.shortDescription = shortDescription;
            return this;
        }
        public String getShortDescription() {
            return this.shortDescription;
        }

        public DescribeRaceWorksForInnerResponseBodyApiWorksApiWork setWorkName(String workName) {
            this.workName = workName;
            return this;
        }
        public String getWorkName() {
            return this.workName;
        }

    }

    public static class DescribeRaceWorksForInnerResponseBodyApiWorks extends TeaModel {
        @NameInMap("ApiWork")
        public java.util.List<DescribeRaceWorksForInnerResponseBodyApiWorksApiWork> apiWork;

        public static DescribeRaceWorksForInnerResponseBodyApiWorks build(java.util.Map<String, ?> map) throws Exception {
            DescribeRaceWorksForInnerResponseBodyApiWorks self = new DescribeRaceWorksForInnerResponseBodyApiWorks();
            return TeaModel.build(map, self);
        }

        public DescribeRaceWorksForInnerResponseBodyApiWorks setApiWork(java.util.List<DescribeRaceWorksForInnerResponseBodyApiWorksApiWork> apiWork) {
            this.apiWork = apiWork;
            return this;
        }
        public java.util.List<DescribeRaceWorksForInnerResponseBodyApiWorksApiWork> getApiWork() {
            return this.apiWork;
        }

    }

}
