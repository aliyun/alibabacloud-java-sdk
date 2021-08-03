// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ListOfficeSiteOverviewResponseBody extends TeaModel {
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("OfficeSiteOverviewResults")
    public java.util.List<ListOfficeSiteOverviewResponseBodyOfficeSiteOverviewResults> officeSiteOverviewResults;

    public static ListOfficeSiteOverviewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListOfficeSiteOverviewResponseBody self = new ListOfficeSiteOverviewResponseBody();
        return TeaModel.build(map, self);
    }

    public ListOfficeSiteOverviewResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListOfficeSiteOverviewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListOfficeSiteOverviewResponseBody setOfficeSiteOverviewResults(java.util.List<ListOfficeSiteOverviewResponseBodyOfficeSiteOverviewResults> officeSiteOverviewResults) {
        this.officeSiteOverviewResults = officeSiteOverviewResults;
        return this;
    }
    public java.util.List<ListOfficeSiteOverviewResponseBodyOfficeSiteOverviewResults> getOfficeSiteOverviewResults() {
        return this.officeSiteOverviewResults;
    }

    public static class ListOfficeSiteOverviewResponseBodyOfficeSiteOverviewResults extends TeaModel {
        @NameInMap("OfficeSiteStatus")
        public String officeSiteStatus;

        @NameInMap("TotalEdsCount")
        public Integer totalEdsCount;

        @NameInMap("WillExpiredEdsCount")
        public Integer willExpiredEdsCount;

        @NameInMap("OfficeSiteId")
        public String officeSiteId;

        @NameInMap("RunningEdsCount")
        public Integer runningEdsCount;

        @NameInMap("OfficeSiteName")
        public String officeSiteName;

        @NameInMap("HasExpiredEdsCount")
        public Integer hasExpiredEdsCount;

        @NameInMap("RegionId")
        public String regionId;

        public static ListOfficeSiteOverviewResponseBodyOfficeSiteOverviewResults build(java.util.Map<String, ?> map) throws Exception {
            ListOfficeSiteOverviewResponseBodyOfficeSiteOverviewResults self = new ListOfficeSiteOverviewResponseBodyOfficeSiteOverviewResults();
            return TeaModel.build(map, self);
        }

        public ListOfficeSiteOverviewResponseBodyOfficeSiteOverviewResults setOfficeSiteStatus(String officeSiteStatus) {
            this.officeSiteStatus = officeSiteStatus;
            return this;
        }
        public String getOfficeSiteStatus() {
            return this.officeSiteStatus;
        }

        public ListOfficeSiteOverviewResponseBodyOfficeSiteOverviewResults setTotalEdsCount(Integer totalEdsCount) {
            this.totalEdsCount = totalEdsCount;
            return this;
        }
        public Integer getTotalEdsCount() {
            return this.totalEdsCount;
        }

        public ListOfficeSiteOverviewResponseBodyOfficeSiteOverviewResults setWillExpiredEdsCount(Integer willExpiredEdsCount) {
            this.willExpiredEdsCount = willExpiredEdsCount;
            return this;
        }
        public Integer getWillExpiredEdsCount() {
            return this.willExpiredEdsCount;
        }

        public ListOfficeSiteOverviewResponseBodyOfficeSiteOverviewResults setOfficeSiteId(String officeSiteId) {
            this.officeSiteId = officeSiteId;
            return this;
        }
        public String getOfficeSiteId() {
            return this.officeSiteId;
        }

        public ListOfficeSiteOverviewResponseBodyOfficeSiteOverviewResults setRunningEdsCount(Integer runningEdsCount) {
            this.runningEdsCount = runningEdsCount;
            return this;
        }
        public Integer getRunningEdsCount() {
            return this.runningEdsCount;
        }

        public ListOfficeSiteOverviewResponseBodyOfficeSiteOverviewResults setOfficeSiteName(String officeSiteName) {
            this.officeSiteName = officeSiteName;
            return this;
        }
        public String getOfficeSiteName() {
            return this.officeSiteName;
        }

        public ListOfficeSiteOverviewResponseBodyOfficeSiteOverviewResults setHasExpiredEdsCount(Integer hasExpiredEdsCount) {
            this.hasExpiredEdsCount = hasExpiredEdsCount;
            return this;
        }
        public Integer getHasExpiredEdsCount() {
            return this.hasExpiredEdsCount;
        }

        public ListOfficeSiteOverviewResponseBodyOfficeSiteOverviewResults setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

}
