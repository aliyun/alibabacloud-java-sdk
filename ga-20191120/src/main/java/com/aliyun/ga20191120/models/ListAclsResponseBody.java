// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class ListAclsResponseBody extends TeaModel {
    @NameInMap("Acls")
    public java.util.List<ListAclsResponseBodyAcls> acls;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListAclsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAclsResponseBody self = new ListAclsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAclsResponseBody setAcls(java.util.List<ListAclsResponseBodyAcls> acls) {
        this.acls = acls;
        return this;
    }
    public java.util.List<ListAclsResponseBodyAcls> getAcls() {
        return this.acls;
    }

    public ListAclsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListAclsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListAclsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAclsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListAclsResponseBodyAcls extends TeaModel {
        @NameInMap("AclId")
        public String aclId;

        @NameInMap("AclName")
        public String aclName;

        @NameInMap("AclStatus")
        public String aclStatus;

        @NameInMap("AddressIPVersion")
        public String addressIPVersion;

        public static ListAclsResponseBodyAcls build(java.util.Map<String, ?> map) throws Exception {
            ListAclsResponseBodyAcls self = new ListAclsResponseBodyAcls();
            return TeaModel.build(map, self);
        }

        public ListAclsResponseBodyAcls setAclId(String aclId) {
            this.aclId = aclId;
            return this;
        }
        public String getAclId() {
            return this.aclId;
        }

        public ListAclsResponseBodyAcls setAclName(String aclName) {
            this.aclName = aclName;
            return this;
        }
        public String getAclName() {
            return this.aclName;
        }

        public ListAclsResponseBodyAcls setAclStatus(String aclStatus) {
            this.aclStatus = aclStatus;
            return this;
        }
        public String getAclStatus() {
            return this.aclStatus;
        }

        public ListAclsResponseBodyAcls setAddressIPVersion(String addressIPVersion) {
            this.addressIPVersion = addressIPVersion;
            return this;
        }
        public String getAddressIPVersion() {
            return this.addressIPVersion;
        }

    }

}
