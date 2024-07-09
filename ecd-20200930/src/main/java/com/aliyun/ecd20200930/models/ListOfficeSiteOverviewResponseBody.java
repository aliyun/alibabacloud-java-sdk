// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ListOfficeSiteOverviewResponseBody extends TeaModel {
    /**
     * <p>The token that is used to start the next query. If this parameter is empty, all results are returned.</p>
     * 
     * <strong>example:</strong>
     * <p>caeba0bbb2be03f84eb48b699f0a4883</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The office network information.</p>
     */
    @NameInMap("OfficeSiteOverviewResults")
    public java.util.List<ListOfficeSiteOverviewResponseBodyOfficeSiteOverviewResults> officeSiteOverviewResults;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
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
         * <p>The number of expired cloud computers in the office network.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("HasExpiredEdsCount")
        public Integer hasExpiredEdsCount;

        /**
         * <p>The number of expired cloud computers in the cloud computer pool.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("HasExpiredEdsCountForGroup")
        public Integer hasExpiredEdsCountForGroup;

        /**
         * <p>The office network ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou+dir-363353****</p>
         */
        @NameInMap("OfficeSiteId")
        public String officeSiteId;

        /**
         * <p>The office network name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("OfficeSiteName")
        public String officeSiteName;

        /**
         * <p>The office network status.</p>
         * <p>Default values:</p>
         * <ul>
         * <li><p>CONFIGUSERFAILED</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>REGISTERING</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>REGISTERED</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>NEEDCONFIGTRUST</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>CONFIGUSERING</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>CONFIGTRUSTFAILED</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>ERROR</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>CONFIGTRUSTING</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>NEEDCONFIGUSER</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- --></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>REGISTERED</p>
         */
        @NameInMap("OfficeSiteStatus")
        public String officeSiteStatus;

        /**
         * <p>The ID of the region where the office network resides.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The number of cloud computers that are running in the office network.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RunningEdsCount")
        public Integer runningEdsCount;

        /**
         * <p>The number of running cloud computers in the cloud computer pool.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RunningEdsCountForGroup")
        public Integer runningEdsCountForGroup;

        /**
         * <p>The total number of cloud computers in the office network.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TotalEdsCount")
        public Integer totalEdsCount;

        /**
         * <p>The total number of cloud computers in the cloud computer pool.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TotalEdsCountForGroup")
        public Integer totalEdsCountForGroup;

        /**
         * <p>The office network type and its suitable VPC type.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>standard (default): standard, exclusive VPC</li>
         * <li>customized: custom, user VPC</li>
         * <li>basic: basic, shared VPC</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>standard</p>
         */
        @NameInMap("VpcType")
        public String vpcType;

        /**
         * <p>The number of cloud computers that are about to expire in the office network.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("WillExpiredEdsCount")
        public Integer willExpiredEdsCount;

        /**
         * <p>The number of cloud computers that are about to expire in the cloud computer pool.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
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
