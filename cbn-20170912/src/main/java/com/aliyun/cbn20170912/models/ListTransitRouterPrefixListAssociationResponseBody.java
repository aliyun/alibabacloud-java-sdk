// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class ListTransitRouterPrefixListAssociationResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PrefixLists")
    public java.util.List<ListTransitRouterPrefixListAssociationResponseBodyPrefixLists> prefixLists;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("NextHop")
        public String nextHop;

        @NameInMap("NextHopInstanceId")
        public String nextHopInstanceId;

        @NameInMap("NextHopType")
        public String nextHopType;

        @NameInMap("OwnerUid")
        public Long ownerUid;

        @NameInMap("PrefixListId")
        public String prefixListId;

        @NameInMap("Status")
        public String status;

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

        public ListTransitRouterPrefixListAssociationResponseBodyPrefixLists setTransitRouterTableId(String transitRouterTableId) {
            this.transitRouterTableId = transitRouterTableId;
            return this;
        }
        public String getTransitRouterTableId() {
            return this.transitRouterTableId;
        }

    }

}
