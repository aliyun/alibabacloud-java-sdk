// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeMembersResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public DescribeMembersResponseBodyResult result;

    public static DescribeMembersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMembersResponseBody self = new DescribeMembersResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeMembersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeMembersResponseBody setResult(DescribeMembersResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DescribeMembersResponseBodyResult getResult() {
        return this.result;
    }

    public static class DescribeMembersResponseBodyResultPagination extends TeaModel {
        @NameInMap("Current")
        public Integer current;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("Total")
        public Integer total;

        public static DescribeMembersResponseBodyResultPagination build(java.util.Map<String, ?> map) throws Exception {
            DescribeMembersResponseBodyResultPagination self = new DescribeMembersResponseBodyResultPagination();
            return TeaModel.build(map, self);
        }

        public DescribeMembersResponseBodyResultPagination setCurrent(Integer current) {
            this.current = current;
            return this;
        }
        public Integer getCurrent() {
            return this.current;
        }

        public DescribeMembersResponseBodyResultPagination setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public DescribeMembersResponseBodyResultPagination setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

    public static class DescribeMembersResponseBodyResult extends TeaModel {
        @NameInMap("MemberList")
        public java.util.List<String> memberList;

        @NameInMap("Pagination")
        public DescribeMembersResponseBodyResultPagination pagination;

        public static DescribeMembersResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeMembersResponseBodyResult self = new DescribeMembersResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeMembersResponseBodyResult setMemberList(java.util.List<String> memberList) {
            this.memberList = memberList;
            return this;
        }
        public java.util.List<String> getMemberList() {
            return this.memberList;
        }

        public DescribeMembersResponseBodyResult setPagination(DescribeMembersResponseBodyResultPagination pagination) {
            this.pagination = pagination;
            return this;
        }
        public DescribeMembersResponseBodyResultPagination getPagination() {
            return this.pagination;
        }

    }

}
