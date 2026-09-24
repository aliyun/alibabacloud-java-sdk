// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class QueryAuthUserConnectDurationListResponseBody extends TeaModel {
    /**
     * <p>The connection duration list of authorized users.</p>
     */
    @NameInMap("AuthUserConnectDurationList")
    public java.util.List<QueryAuthUserConnectDurationListResponseBodyAuthUserConnectDurationList> authUserConnectDurationList;

    /**
     * <p>The pagination token for the next page. This parameter is returned when the results span multiple pages. Pass this value as the NextToken in the next request to retrieve the next page. This parameter is returned only when statistics are collected by individual session details.</p>
     * 
     * <strong>example:</strong>
     * <p>d129c6c0e8c04c8a9f0e2b7c1a3f5e6d</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F0F0F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of records that match the specified conditions.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static QueryAuthUserConnectDurationListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryAuthUserConnectDurationListResponseBody self = new QueryAuthUserConnectDurationListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryAuthUserConnectDurationListResponseBody setAuthUserConnectDurationList(java.util.List<QueryAuthUserConnectDurationListResponseBodyAuthUserConnectDurationList> authUserConnectDurationList) {
        this.authUserConnectDurationList = authUserConnectDurationList;
        return this;
    }
    public java.util.List<QueryAuthUserConnectDurationListResponseBodyAuthUserConnectDurationList> getAuthUserConnectDurationList() {
        return this.authUserConnectDurationList;
    }

    public QueryAuthUserConnectDurationListResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public QueryAuthUserConnectDurationListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryAuthUserConnectDurationListResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class QueryAuthUserConnectDurationListResponseBodyAuthUserConnectDurationList extends TeaModel {
        /**
         * <p>The connection duration of the user, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>3600</p>
         */
        @NameInMap("ConnectDuration")
        public Long connectDuration;

        /**
         * <p>The end time of the connection, as a UNIX timestamp in milliseconds. This parameter is returned only when statistics are collected by individual session details (StatisticType=SingleSession).</p>
         * 
         * <strong>example:</strong>
         * <p>1719208800000</p>
         */
        @NameInMap("ConnectEndTime")
        public String connectEndTime;

        /**
         * <p>The start time of the connection, as a UNIX timestamp in milliseconds. This parameter is returned only when statistics are collected by individual session details (StatisticType=SingleSession).</p>
         * 
         * <strong>example:</strong>
         * <p>1719205200000</p>
         */
        @NameInMap("ConnectStartTime")
        public String connectStartTime;

        /**
         * <p>The remarks of the user. This parameter is returned only for convenience users when WithDetail is set to true.</p>
         * 
         * <strong>example:</strong>
         * <p>R&amp;D department employee</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The cloud desktop ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ecd-gx2x1dhsmusr2****</p>
         */
        @NameInMap("DesktopId")
        public String desktopId;

        /**
         * <p>The cloud desktop name.</p>
         * 
         * <strong>example:</strong>
         * <p>test-desktop</p>
         */
        @NameInMap("DesktopName")
        public String desktopName;

        /**
         * <p>The type of the directory to which the user belongs. Valid values:</p>
         * <ul>
         * <li>1: convenience account.</li>
         * <li>2: RAM account.</li>
         * <li>3: AD account.</li>
         * <li>4: personal edition.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("DirectoryType")
        public Integer directoryType;

        /**
         * <p>The display name of the user. This parameter is returned only for AD users when WithDetail is set to true.</p>
         * 
         * <strong>example:</strong>
         * <p>Zhang San</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <p>The new display name of the user. This parameter is returned only for AD users when WithDetail is set to true.</p>
         * 
         * <strong>example:</strong>
         * <p>Zhang San</p>
         */
        @NameInMap("DisplayNameNew")
        public String displayNameNew;

        /**
         * <p>The AD domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        @NameInMap("DomainName")
        public String domainName;

        /**
         * <p>The end user ID.</p>
         * 
         * <strong>example:</strong>
         * <p>alice</p>
         */
        @NameInMap("EndUserId")
        public String endUserId;

        /**
         * <p>The nickname of the user. This parameter is returned only for convenience users when WithDetail is set to true.</p>
         * 
         * <strong>example:</strong>
         * <p>Xiao Zhang</p>
         */
        @NameInMap("NickName")
        public String nickName;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The user principal name (UPN). This parameter is returned only for AD users when WithDetail is set to true.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:alice@example.com">alice@example.com</a></p>
         */
        @NameInMap("UserPrincipalName")
        public String userPrincipalName;

        public static QueryAuthUserConnectDurationListResponseBodyAuthUserConnectDurationList build(java.util.Map<String, ?> map) throws Exception {
            QueryAuthUserConnectDurationListResponseBodyAuthUserConnectDurationList self = new QueryAuthUserConnectDurationListResponseBodyAuthUserConnectDurationList();
            return TeaModel.build(map, self);
        }

        public QueryAuthUserConnectDurationListResponseBodyAuthUserConnectDurationList setConnectDuration(Long connectDuration) {
            this.connectDuration = connectDuration;
            return this;
        }
        public Long getConnectDuration() {
            return this.connectDuration;
        }

        public QueryAuthUserConnectDurationListResponseBodyAuthUserConnectDurationList setConnectEndTime(String connectEndTime) {
            this.connectEndTime = connectEndTime;
            return this;
        }
        public String getConnectEndTime() {
            return this.connectEndTime;
        }

        public QueryAuthUserConnectDurationListResponseBodyAuthUserConnectDurationList setConnectStartTime(String connectStartTime) {
            this.connectStartTime = connectStartTime;
            return this;
        }
        public String getConnectStartTime() {
            return this.connectStartTime;
        }

        public QueryAuthUserConnectDurationListResponseBodyAuthUserConnectDurationList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QueryAuthUserConnectDurationListResponseBodyAuthUserConnectDurationList setDesktopId(String desktopId) {
            this.desktopId = desktopId;
            return this;
        }
        public String getDesktopId() {
            return this.desktopId;
        }

        public QueryAuthUserConnectDurationListResponseBodyAuthUserConnectDurationList setDesktopName(String desktopName) {
            this.desktopName = desktopName;
            return this;
        }
        public String getDesktopName() {
            return this.desktopName;
        }

        public QueryAuthUserConnectDurationListResponseBodyAuthUserConnectDurationList setDirectoryType(Integer directoryType) {
            this.directoryType = directoryType;
            return this;
        }
        public Integer getDirectoryType() {
            return this.directoryType;
        }

        public QueryAuthUserConnectDurationListResponseBodyAuthUserConnectDurationList setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public QueryAuthUserConnectDurationListResponseBodyAuthUserConnectDurationList setDisplayNameNew(String displayNameNew) {
            this.displayNameNew = displayNameNew;
            return this;
        }
        public String getDisplayNameNew() {
            return this.displayNameNew;
        }

        public QueryAuthUserConnectDurationListResponseBodyAuthUserConnectDurationList setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public QueryAuthUserConnectDurationListResponseBodyAuthUserConnectDurationList setEndUserId(String endUserId) {
            this.endUserId = endUserId;
            return this;
        }
        public String getEndUserId() {
            return this.endUserId;
        }

        public QueryAuthUserConnectDurationListResponseBodyAuthUserConnectDurationList setNickName(String nickName) {
            this.nickName = nickName;
            return this;
        }
        public String getNickName() {
            return this.nickName;
        }

        public QueryAuthUserConnectDurationListResponseBodyAuthUserConnectDurationList setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public QueryAuthUserConnectDurationListResponseBodyAuthUserConnectDurationList setUserPrincipalName(String userPrincipalName) {
            this.userPrincipalName = userPrincipalName;
            return this;
        }
        public String getUserPrincipalName() {
            return this.userPrincipalName;
        }

    }

}
