// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListCustomAgentsResponseBody extends TeaModel {
    @NameInMap("PagingInfo")
    public ListCustomAgentsResponseBodyPagingInfo pagingInfo;

    /**
     * <strong>example:</strong>
     * <p>824F80BA-1778-5D8A-BAFF-668A4D9C4CC7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListCustomAgentsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCustomAgentsResponseBody self = new ListCustomAgentsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCustomAgentsResponseBody setPagingInfo(ListCustomAgentsResponseBodyPagingInfo pagingInfo) {
        this.pagingInfo = pagingInfo;
        return this;
    }
    public ListCustomAgentsResponseBodyPagingInfo getPagingInfo() {
        return this.pagingInfo;
    }

    public ListCustomAgentsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListCustomAgentsResponseBodyPagingInfoAgents extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>123456</p>
         */
        @NameInMap("CreatorId")
        public String creatorId;

        @NameInMap("Description")
        public String description;

        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mmZ</p>
         * 
         * <strong>example:</strong>
         * <p>1780555634000</p>
         */
        @NameInMap("GmtCreateTime")
        public String gmtCreateTime;

        /**
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mmZ</p>
         * 
         * <strong>example:</strong>
         * <p>1780555634000</p>
         */
        @NameInMap("GmtModifiedTime")
        public String gmtModifiedTime;

        /**
         * <strong>example:</strong>
         * <p>123456</p>
         */
        @NameInMap("ModifierId")
        public String modifierId;

        /**
         * <strong>example:</strong>
         * <p>my-agent</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>TENANT</p>
         */
        @NameInMap("Visibility")
        public String visibility;

        public static ListCustomAgentsResponseBodyPagingInfoAgents build(java.util.Map<String, ?> map) throws Exception {
            ListCustomAgentsResponseBodyPagingInfoAgents self = new ListCustomAgentsResponseBodyPagingInfoAgents();
            return TeaModel.build(map, self);
        }

        public ListCustomAgentsResponseBodyPagingInfoAgents setCreatorId(String creatorId) {
            this.creatorId = creatorId;
            return this;
        }
        public String getCreatorId() {
            return this.creatorId;
        }

        public ListCustomAgentsResponseBodyPagingInfoAgents setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListCustomAgentsResponseBodyPagingInfoAgents setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ListCustomAgentsResponseBodyPagingInfoAgents setGmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }
        public String getGmtCreateTime() {
            return this.gmtCreateTime;
        }

        public ListCustomAgentsResponseBodyPagingInfoAgents setGmtModifiedTime(String gmtModifiedTime) {
            this.gmtModifiedTime = gmtModifiedTime;
            return this;
        }
        public String getGmtModifiedTime() {
            return this.gmtModifiedTime;
        }

        public ListCustomAgentsResponseBodyPagingInfoAgents setModifierId(String modifierId) {
            this.modifierId = modifierId;
            return this;
        }
        public String getModifierId() {
            return this.modifierId;
        }

        public ListCustomAgentsResponseBodyPagingInfoAgents setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListCustomAgentsResponseBodyPagingInfoAgents setVisibility(String visibility) {
            this.visibility = visibility;
            return this;
        }
        public String getVisibility() {
            return this.visibility;
        }

    }

    public static class ListCustomAgentsResponseBodyPagingInfo extends TeaModel {
        @NameInMap("Agents")
        public java.util.List<ListCustomAgentsResponseBodyPagingInfoAgents> agents;

        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("MaxResults")
        public Integer maxResults;

        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("NextToken")
        public String nextToken;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListCustomAgentsResponseBodyPagingInfo build(java.util.Map<String, ?> map) throws Exception {
            ListCustomAgentsResponseBodyPagingInfo self = new ListCustomAgentsResponseBodyPagingInfo();
            return TeaModel.build(map, self);
        }

        public ListCustomAgentsResponseBodyPagingInfo setAgents(java.util.List<ListCustomAgentsResponseBodyPagingInfoAgents> agents) {
            this.agents = agents;
            return this;
        }
        public java.util.List<ListCustomAgentsResponseBodyPagingInfoAgents> getAgents() {
            return this.agents;
        }

        public ListCustomAgentsResponseBodyPagingInfo setMaxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }
        public Integer getMaxResults() {
            return this.maxResults;
        }

        public ListCustomAgentsResponseBodyPagingInfo setNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }
        public String getNextToken() {
            return this.nextToken;
        }

        public ListCustomAgentsResponseBodyPagingInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
