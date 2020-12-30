// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class QueryDomainGroupListResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public QueryDomainGroupListResponseBodyData data;

    public static QueryDomainGroupListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryDomainGroupListResponseBody self = new QueryDomainGroupListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryDomainGroupListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryDomainGroupListResponseBody setData(QueryDomainGroupListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryDomainGroupListResponseBodyData getData() {
        return this.data;
    }

    public static class QueryDomainGroupListResponseBodyDataDomainGroup extends TeaModel {
        @NameInMap("BeingDeleted")
        public Boolean beingDeleted;

        @NameInMap("DomainGroupStatus")
        public String domainGroupStatus;

        @NameInMap("DomainGroupId")
        public String domainGroupId;

        @NameInMap("DomainGroupName")
        public String domainGroupName;

        @NameInMap("ModificationDate")
        public String modificationDate;

        @NameInMap("TotalNumber")
        public Integer totalNumber;

        @NameInMap("CreationDate")
        public String creationDate;

        public static QueryDomainGroupListResponseBodyDataDomainGroup build(java.util.Map<String, ?> map) throws Exception {
            QueryDomainGroupListResponseBodyDataDomainGroup self = new QueryDomainGroupListResponseBodyDataDomainGroup();
            return TeaModel.build(map, self);
        }

        public QueryDomainGroupListResponseBodyDataDomainGroup setBeingDeleted(Boolean beingDeleted) {
            this.beingDeleted = beingDeleted;
            return this;
        }
        public Boolean getBeingDeleted() {
            return this.beingDeleted;
        }

        public QueryDomainGroupListResponseBodyDataDomainGroup setDomainGroupStatus(String domainGroupStatus) {
            this.domainGroupStatus = domainGroupStatus;
            return this;
        }
        public String getDomainGroupStatus() {
            return this.domainGroupStatus;
        }

        public QueryDomainGroupListResponseBodyDataDomainGroup setDomainGroupId(String domainGroupId) {
            this.domainGroupId = domainGroupId;
            return this;
        }
        public String getDomainGroupId() {
            return this.domainGroupId;
        }

        public QueryDomainGroupListResponseBodyDataDomainGroup setDomainGroupName(String domainGroupName) {
            this.domainGroupName = domainGroupName;
            return this;
        }
        public String getDomainGroupName() {
            return this.domainGroupName;
        }

        public QueryDomainGroupListResponseBodyDataDomainGroup setModificationDate(String modificationDate) {
            this.modificationDate = modificationDate;
            return this;
        }
        public String getModificationDate() {
            return this.modificationDate;
        }

        public QueryDomainGroupListResponseBodyDataDomainGroup setTotalNumber(Integer totalNumber) {
            this.totalNumber = totalNumber;
            return this;
        }
        public Integer getTotalNumber() {
            return this.totalNumber;
        }

        public QueryDomainGroupListResponseBodyDataDomainGroup setCreationDate(String creationDate) {
            this.creationDate = creationDate;
            return this;
        }
        public String getCreationDate() {
            return this.creationDate;
        }

    }

    public static class QueryDomainGroupListResponseBodyData extends TeaModel {
        @NameInMap("DomainGroup")
        public java.util.List<QueryDomainGroupListResponseBodyDataDomainGroup> domainGroup;

        public static QueryDomainGroupListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryDomainGroupListResponseBodyData self = new QueryDomainGroupListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryDomainGroupListResponseBodyData setDomainGroup(java.util.List<QueryDomainGroupListResponseBodyDataDomainGroup> domainGroup) {
            this.domainGroup = domainGroup;
            return this;
        }
        public java.util.List<QueryDomainGroupListResponseBodyDataDomainGroup> getDomainGroup() {
            return this.domainGroup;
        }

    }

}
