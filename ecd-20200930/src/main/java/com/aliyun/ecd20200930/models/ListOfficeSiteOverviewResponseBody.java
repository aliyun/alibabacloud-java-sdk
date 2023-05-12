// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ListOfficeSiteOverviewResponseBody extends TeaModel {
    /**
     * <p>The status of the workspace.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>Specifies whether to refresh the cache.</p>
     */
    @NameInMap("OfficeSiteOverviewResults")
    public java.util.List<ListOfficeSiteOverviewResponseBodyOfficeSiteOverviewResults> officeSiteOverviewResults;

    /**
     * <p>The information that is returned.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

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

    public ListOfficeSiteOverviewResponseBody setOfficeSiteOverviewResults(java.util.List<ListOfficeSiteOverviewResponseBodyOfficeSiteOverviewResults> officeSiteOverviewResults) {
        this.officeSiteOverviewResults = officeSiteOverviewResults;
        return this;
    }
    public java.util.List<ListOfficeSiteOverviewResponseBodyOfficeSiteOverviewResults> getOfficeSiteOverviewResults() {
        return this.officeSiteOverviewResults;
    }

    public ListOfficeSiteOverviewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListOfficeSiteOverviewResponseBodyOfficeSiteOverviewResults extends TeaModel {
        /**
         * <p>153021</p>
         */
        @NameInMap("HasExpiredEdsCount")
        public Integer hasExpiredEdsCount;

        @NameInMap("HasExpiredEdsCountForGroup")
        public Integer hasExpiredEdsCountForGroup;

        /**
         * <p>The name of the workspace.</p>
         */
        @NameInMap("OfficeSiteId")
        public String officeSiteId;

        /**
         * <p>Queries the overview information about workspaces in Elastic Desktop Service (EDS).</p>
         */
        @NameInMap("OfficeSiteName")
        public String officeSiteName;

        /**
         * <p>The number of running cloud desktops in the workspace.</p>
         */
        @NameInMap("OfficeSiteStatus")
        public String officeSiteStatus;

        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The number of running cloud desktops in the desktop group.</p>
         */
        @NameInMap("RunningEdsCount")
        public Integer runningEdsCount;

        /**
         * <p>The ID of the request.</p>
         */
        @NameInMap("RunningEdsCountForGroup")
        public Integer runningEdsCountForGroup;

        /**
         * <p>The ID of the workspace.</p>
         */
        @NameInMap("TotalEdsCount")
        public Integer totalEdsCount;

        /**
         * <p>The number of cloud desktops that are about to expire in the workspace.</p>
         */
        @NameInMap("TotalEdsCountForGroup")
        public Integer totalEdsCountForGroup;

        /**
         * <p>ListOfficeSiteOverview</p>
         */
        @NameInMap("VpcType")
        public String vpcType;

        /**
         * <p>The virtual private cloud (VPC) type of the workspace.</p>
         */
        @NameInMap("WillExpiredEdsCount")
        public Integer willExpiredEdsCount;

        /**
         * <p>The token that determines the start point of the next query. If this is your first query or no next query is to be sent, skip this parameter. If a next query is to be sent, set the parameter to the value of NextToken that is returned from the last call.</p>
         */
        @NameInMap("WillExpiredEdsCountForGroup")
        public Integer willExpiredEdsCountForGroup;

        public static ListOfficeSiteOverviewResponseBodyOfficeSiteOverviewResults build(java.util.Map<String, ?> map) throws Exception {
            ListOfficeSiteOverviewResponseBodyOfficeSiteOverviewResults self = new ListOfficeSiteOverviewResponseBodyOfficeSiteOverviewResults();
            return TeaModel.build(map, self);
        }

        public ListOfficeSiteOverviewResponseBodyOfficeSiteOverviewResults setHasExpiredEdsCount(Integer hasExpiredEdsCount) {
            this.hasExpiredEdsCount = hasExpiredEdsCount;
            return this;
        }
        public Integer getHasExpiredEdsCount() {
            return this.hasExpiredEdsCount;
        }

        public ListOfficeSiteOverviewResponseBodyOfficeSiteOverviewResults setHasExpiredEdsCountForGroup(Integer hasExpiredEdsCountForGroup) {
            this.hasExpiredEdsCountForGroup = hasExpiredEdsCountForGroup;
            return this;
        }
        public Integer getHasExpiredEdsCountForGroup() {
            return this.hasExpiredEdsCountForGroup;
        }

        public ListOfficeSiteOverviewResponseBodyOfficeSiteOverviewResults setOfficeSiteId(String officeSiteId) {
            this.officeSiteId = officeSiteId;
            return this;
        }
        public String getOfficeSiteId() {
            return this.officeSiteId;
        }

        public ListOfficeSiteOverviewResponseBodyOfficeSiteOverviewResults setOfficeSiteName(String officeSiteName) {
            this.officeSiteName = officeSiteName;
            return this;
        }
        public String getOfficeSiteName() {
            return this.officeSiteName;
        }

        public ListOfficeSiteOverviewResponseBodyOfficeSiteOverviewResults setOfficeSiteStatus(String officeSiteStatus) {
            this.officeSiteStatus = officeSiteStatus;
            return this;
        }
        public String getOfficeSiteStatus() {
            return this.officeSiteStatus;
        }

        public ListOfficeSiteOverviewResponseBodyOfficeSiteOverviewResults setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListOfficeSiteOverviewResponseBodyOfficeSiteOverviewResults setRunningEdsCount(Integer runningEdsCount) {
            this.runningEdsCount = runningEdsCount;
            return this;
        }
        public Integer getRunningEdsCount() {
            return this.runningEdsCount;
        }

        public ListOfficeSiteOverviewResponseBodyOfficeSiteOverviewResults setRunningEdsCountForGroup(Integer runningEdsCountForGroup) {
            this.runningEdsCountForGroup = runningEdsCountForGroup;
            return this;
        }
        public Integer getRunningEdsCountForGroup() {
            return this.runningEdsCountForGroup;
        }

        public ListOfficeSiteOverviewResponseBodyOfficeSiteOverviewResults setTotalEdsCount(Integer totalEdsCount) {
            this.totalEdsCount = totalEdsCount;
            return this;
        }
        public Integer getTotalEdsCount() {
            return this.totalEdsCount;
        }

        public ListOfficeSiteOverviewResponseBodyOfficeSiteOverviewResults setTotalEdsCountForGroup(Integer totalEdsCountForGroup) {
            this.totalEdsCountForGroup = totalEdsCountForGroup;
            return this;
        }
        public Integer getTotalEdsCountForGroup() {
            return this.totalEdsCountForGroup;
        }

        public ListOfficeSiteOverviewResponseBodyOfficeSiteOverviewResults setVpcType(String vpcType) {
            this.vpcType = vpcType;
            return this;
        }
        public String getVpcType() {
            return this.vpcType;
        }

        public ListOfficeSiteOverviewResponseBodyOfficeSiteOverviewResults setWillExpiredEdsCount(Integer willExpiredEdsCount) {
            this.willExpiredEdsCount = willExpiredEdsCount;
            return this;
        }
        public Integer getWillExpiredEdsCount() {
            return this.willExpiredEdsCount;
        }

        public ListOfficeSiteOverviewResponseBodyOfficeSiteOverviewResults setWillExpiredEdsCountForGroup(Integer willExpiredEdsCountForGroup) {
            this.willExpiredEdsCountForGroup = willExpiredEdsCountForGroup;
            return this;
        }
        public Integer getWillExpiredEdsCountForGroup() {
            return this.willExpiredEdsCountForGroup;
        }

    }

}
