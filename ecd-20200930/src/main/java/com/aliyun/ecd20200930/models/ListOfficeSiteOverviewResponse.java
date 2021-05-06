// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ListOfficeSiteOverviewResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("NextToken")
    @Validation(required = true)
    public String nextToken;

    @NameInMap("OfficeSiteOverviewResults")
    @Validation(required = true)
    public java.util.List<ListOfficeSiteOverviewResponseOfficeSiteOverviewResults> officeSiteOverviewResults;

    public static ListOfficeSiteOverviewResponse build(java.util.Map<String, ?> map) throws Exception {
        ListOfficeSiteOverviewResponse self = new ListOfficeSiteOverviewResponse();
        return TeaModel.build(map, self);
    }

    public ListOfficeSiteOverviewResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListOfficeSiteOverviewResponse setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListOfficeSiteOverviewResponse setOfficeSiteOverviewResults(java.util.List<ListOfficeSiteOverviewResponseOfficeSiteOverviewResults> officeSiteOverviewResults) {
        this.officeSiteOverviewResults = officeSiteOverviewResults;
        return this;
    }
    public java.util.List<ListOfficeSiteOverviewResponseOfficeSiteOverviewResults> getOfficeSiteOverviewResults() {
        return this.officeSiteOverviewResults;
    }

    public static class ListOfficeSiteOverviewResponseOfficeSiteOverviewResults extends TeaModel {
        @NameInMap("RegionId")
        @Validation(required = true)
        public String regionId;

        @NameInMap("OfficeSiteId")
        @Validation(required = true)
        public String officeSiteId;

        @NameInMap("OfficeSiteName")
        @Validation(required = true)
        public String officeSiteName;

        @NameInMap("OfficeSiteStatus")
        @Validation(required = true)
        public String officeSiteStatus;

        @NameInMap("TotalEdsCount")
        @Validation(required = true)
        public Integer totalEdsCount;

        @NameInMap("RunningEdsCount")
        @Validation(required = true)
        public Integer runningEdsCount;

        @NameInMap("WillExpiredEdsCount")
        @Validation(required = true)
        public Integer willExpiredEdsCount;

        @NameInMap("HasExpiredEdsCount")
        @Validation(required = true)
        public Integer hasExpiredEdsCount;

        public static ListOfficeSiteOverviewResponseOfficeSiteOverviewResults build(java.util.Map<String, ?> map) throws Exception {
            ListOfficeSiteOverviewResponseOfficeSiteOverviewResults self = new ListOfficeSiteOverviewResponseOfficeSiteOverviewResults();
            return TeaModel.build(map, self);
        }

        public ListOfficeSiteOverviewResponseOfficeSiteOverviewResults setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListOfficeSiteOverviewResponseOfficeSiteOverviewResults setOfficeSiteId(String officeSiteId) {
            this.officeSiteId = officeSiteId;
            return this;
        }
        public String getOfficeSiteId() {
            return this.officeSiteId;
        }

        public ListOfficeSiteOverviewResponseOfficeSiteOverviewResults setOfficeSiteName(String officeSiteName) {
            this.officeSiteName = officeSiteName;
            return this;
        }
        public String getOfficeSiteName() {
            return this.officeSiteName;
        }

        public ListOfficeSiteOverviewResponseOfficeSiteOverviewResults setOfficeSiteStatus(String officeSiteStatus) {
            this.officeSiteStatus = officeSiteStatus;
            return this;
        }
        public String getOfficeSiteStatus() {
            return this.officeSiteStatus;
        }

        public ListOfficeSiteOverviewResponseOfficeSiteOverviewResults setTotalEdsCount(Integer totalEdsCount) {
            this.totalEdsCount = totalEdsCount;
            return this;
        }
        public Integer getTotalEdsCount() {
            return this.totalEdsCount;
        }

        public ListOfficeSiteOverviewResponseOfficeSiteOverviewResults setRunningEdsCount(Integer runningEdsCount) {
            this.runningEdsCount = runningEdsCount;
            return this;
        }
        public Integer getRunningEdsCount() {
            return this.runningEdsCount;
        }

        public ListOfficeSiteOverviewResponseOfficeSiteOverviewResults setWillExpiredEdsCount(Integer willExpiredEdsCount) {
            this.willExpiredEdsCount = willExpiredEdsCount;
            return this;
        }
        public Integer getWillExpiredEdsCount() {
            return this.willExpiredEdsCount;
        }

        public ListOfficeSiteOverviewResponseOfficeSiteOverviewResults setHasExpiredEdsCount(Integer hasExpiredEdsCount) {
            this.hasExpiredEdsCount = hasExpiredEdsCount;
            return this;
        }
        public Integer getHasExpiredEdsCount() {
            return this.hasExpiredEdsCount;
        }

    }

}
