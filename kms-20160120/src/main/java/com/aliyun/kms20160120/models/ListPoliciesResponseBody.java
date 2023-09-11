// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class ListPoliciesResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("Policies")
    public ListPoliciesResponseBodyPolicies policies;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListPoliciesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPoliciesResponseBody self = new ListPoliciesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPoliciesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListPoliciesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListPoliciesResponseBody setPolicies(ListPoliciesResponseBodyPolicies policies) {
        this.policies = policies;
        return this;
    }
    public ListPoliciesResponseBodyPolicies getPolicies() {
        return this.policies;
    }

    public ListPoliciesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListPoliciesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListPoliciesResponseBodyPoliciesPolicy extends TeaModel {
        @NameInMap("Name")
        public String name;

        public static ListPoliciesResponseBodyPoliciesPolicy build(java.util.Map<String, ?> map) throws Exception {
            ListPoliciesResponseBodyPoliciesPolicy self = new ListPoliciesResponseBodyPoliciesPolicy();
            return TeaModel.build(map, self);
        }

        public ListPoliciesResponseBodyPoliciesPolicy setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ListPoliciesResponseBodyPolicies extends TeaModel {
        @NameInMap("Policy")
        public java.util.List<ListPoliciesResponseBodyPoliciesPolicy> policy;

        public static ListPoliciesResponseBodyPolicies build(java.util.Map<String, ?> map) throws Exception {
            ListPoliciesResponseBodyPolicies self = new ListPoliciesResponseBodyPolicies();
            return TeaModel.build(map, self);
        }

        public ListPoliciesResponseBodyPolicies setPolicy(java.util.List<ListPoliciesResponseBodyPoliciesPolicy> policy) {
            this.policy = policy;
            return this;
        }
        public java.util.List<ListPoliciesResponseBodyPoliciesPolicy> getPolicy() {
            return this.policy;
        }

    }

}
