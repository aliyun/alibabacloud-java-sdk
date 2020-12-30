// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class QueryDomainSuffixResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SuffixList")
    public QueryDomainSuffixResponseBodySuffixList suffixList;

    public static QueryDomainSuffixResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryDomainSuffixResponseBody self = new QueryDomainSuffixResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryDomainSuffixResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryDomainSuffixResponseBody setSuffixList(QueryDomainSuffixResponseBodySuffixList suffixList) {
        this.suffixList = suffixList;
        return this;
    }
    public QueryDomainSuffixResponseBodySuffixList getSuffixList() {
        return this.suffixList;
    }

    public static class QueryDomainSuffixResponseBodySuffixList extends TeaModel {
        @NameInMap("Suffix")
        public java.util.List<String> suffix;

        public static QueryDomainSuffixResponseBodySuffixList build(java.util.Map<String, ?> map) throws Exception {
            QueryDomainSuffixResponseBodySuffixList self = new QueryDomainSuffixResponseBodySuffixList();
            return TeaModel.build(map, self);
        }

        public QueryDomainSuffixResponseBodySuffixList setSuffix(java.util.List<String> suffix) {
            this.suffix = suffix;
            return this;
        }
        public java.util.List<String> getSuffix() {
            return this.suffix;
        }

    }

}
