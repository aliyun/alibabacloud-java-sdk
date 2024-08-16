// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class ListTransitRouterPrefixListAssociationResponseBody extends TeaModel {
    /**
     * <p>The page number of the returned page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>A list of prefix lists.</p>
     */
    @NameInMap("PrefixLists")
    public java.util.List<ListTransitRouterPrefixListAssociationResponseBodyPrefixLists> prefixLists;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>6005CA94-676E-1FEE-985E-7602EFAADD6A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListTransitRouterPrefixListAssociationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTransitRouterPrefixListAssociationResponseBody self = new ListTransitRouterPrefixListAssociationResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTransitRouterPrefixListAssociationResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListTransitRouterPrefixListAssociationResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListTransitRouterPrefixListAssociationResponseBody setPrefixLists(java.util.List<ListTransitRouterPrefixListAssociationResponseBodyPrefixLists> prefixLists) {
        this.prefixLists = prefixLists;
        return this;
    }
    public java.util.List<ListTransitRouterPrefixListAssociationResponseBodyPrefixLists> getPrefixLists() {
        return this.prefixLists;
    }

    public ListTransitRouterPrefixListAssociationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTransitRouterPrefixListAssociationResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListTransitRouterPrefixListAssociationResponseBodyPrefixLists extends TeaModel {
        /**
         * <p>The ID of the next hop.</p>
         * <blockquote>
         * <p>A value of <strong>BlackHole</strong> indicates that all the CIDR blocks in the prefix list are blackhole routes. Packets destined for the CIDR blocks are dropped.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>tr-attach-flbq507rg2ckrj****</p>
         */
        @NameInMap("NextHop")
        public String nextHop;

        /**
         * <p>The ID of the network instance associated with the next hop connection.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-6eh7fp9hdqa2wv85t****</p>
         */
        @NameInMap("NextHopInstanceId")
        public String nextHopInstanceId;

        /**
         * <p>The type of the next hop. Valid values:</p>
         * <ul>
         * <li><strong>BlackHole</strong>: All the CIDR blocks in the prefix list are blackhole routes. Packets destined for the CIDR blocks are dropped.</li>
         * <li><strong>VPC</strong>: The next hop of the CIDR blocks in the prefix list is a VPC connection.</li>
         * <li><strong>VBR</strong>: The next hop of the CIDR blocks in the prefix list is a VBR connection.</li>
         * <li><strong>TR</strong>: The next hop of the CIDR blocks in the prefix list is an inter-region connection.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>VPC</p>
         */
        @NameInMap("NextHopType")
        public String nextHopType;

        /**
         * <p>The ID of the Alibaba Cloud account to which the prefix list belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>1210123456123456</p>
         */
        @NameInMap("OwnerUid")
        public Long ownerUid;

        /**
         * <p>The ID of the prefix list.</p>
         * 
         * <strong>example:</strong>
         * <p>pl-6ehtn5kqxgeyy08fi****</p>
         */
        @NameInMap("PrefixListId")
        public String prefixListId;

        /**
         * <p>The status of the prefix list. Valid values:</p>
         * <ul>
         * <li><strong>Active</strong>: The prefix list is effective.</li>
         * <li><strong>Updating</strong>: The prefix list is being updated.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Active</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The ID of the transit router.</p>
         * 
         * <strong>example:</strong>
         * <p>tr-6ehx7q2jze8ch5ji0****</p>
         */
        @NameInMap("TransitRouterId")
        public String transitRouterId;

        /**
         * <p>The ID of the route table of the transit router.</p>
         * 
         * <strong>example:</strong>
         * <p>vtb-6ehgc262hr170qgyc****</p>
         */
        @NameInMap("TransitRouterTableId")
        public String transitRouterTableId;

        public static ListTransitRouterPrefixListAssociationResponseBodyPrefixLists build(java.util.Map<String, ?> map) throws Exception {
            ListTransitRouterPrefixListAssociationResponseBodyPrefixLists self = new ListTransitRouterPrefixListAssociationResponseBodyPrefixLists();
            return TeaModel.build(map, self);
        }

        public ListTransitRouterPrefixListAssociationResponseBodyPrefixLists setNextHop(String nextHop) {
            this.nextHop = nextHop;
            return this;
        }
        public String getNextHop() {
            return this.nextHop;
        }

        public ListTransitRouterPrefixListAssociationResponseBodyPrefixLists setNextHopInstanceId(String nextHopInstanceId) {
            this.nextHopInstanceId = nextHopInstanceId;
            return this;
        }
        public String getNextHopInstanceId() {
            return this.nextHopInstanceId;
        }

        public ListTransitRouterPrefixListAssociationResponseBodyPrefixLists setNextHopType(String nextHopType) {
            this.nextHopType = nextHopType;
            return this;
        }
        public String getNextHopType() {
            return this.nextHopType;
        }

        public ListTransitRouterPrefixListAssociationResponseBodyPrefixLists setOwnerUid(Long ownerUid) {
            this.ownerUid = ownerUid;
            return this;
        }
        public Long getOwnerUid() {
            return this.ownerUid;
        }

        public ListTransitRouterPrefixListAssociationResponseBodyPrefixLists setPrefixListId(String prefixListId) {
            this.prefixListId = prefixListId;
            return this;
        }
        public String getPrefixListId() {
            return this.prefixListId;
        }

        public ListTransitRouterPrefixListAssociationResponseBodyPrefixLists setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListTransitRouterPrefixListAssociationResponseBodyPrefixLists setTransitRouterId(String transitRouterId) {
            this.transitRouterId = transitRouterId;
            return this;
        }
        public String getTransitRouterId() {
            return this.transitRouterId;
        }

        public ListTransitRouterPrefixListAssociationResponseBodyPrefixLists setTransitRouterTableId(String transitRouterTableId) {
            this.transitRouterTableId = transitRouterTableId;
            return this;
        }
        public String getTransitRouterTableId() {
            return this.transitRouterTableId;
        }

    }

}
