// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class QueryPhoneWhiteListNewResponseBody extends TeaModel {
    @NameInMap("List")
    public java.util.List<QueryPhoneWhiteListNewResponseBodyList> list;

    @NameInMap("PageNo")
    public Integer pageNo;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Total")
    public Long total;

    @NameInMap("TotalWithoutFilter")
    public Long totalWithoutFilter;

    public static QueryPhoneWhiteListNewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryPhoneWhiteListNewResponseBody self = new QueryPhoneWhiteListNewResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryPhoneWhiteListNewResponseBody setList(java.util.List<QueryPhoneWhiteListNewResponseBodyList> list) {
        this.list = list;
        return this;
    }
    public java.util.List<QueryPhoneWhiteListNewResponseBodyList> getList() {
        return this.list;
    }

    public QueryPhoneWhiteListNewResponseBody setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public QueryPhoneWhiteListNewResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryPhoneWhiteListNewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryPhoneWhiteListNewResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public QueryPhoneWhiteListNewResponseBody setTotalWithoutFilter(Long totalWithoutFilter) {
        this.totalWithoutFilter = totalWithoutFilter;
        return this;
    }
    public Long getTotalWithoutFilter() {
        return this.totalWithoutFilter;
    }

    public static class QueryPhoneWhiteListNewResponseBodyList extends TeaModel {
        @NameInMap("Id")
        public Long id;

        @NameInMap("PhoneNumber")
        public String phoneNumber;

        @NameInMap("Remark")
        public String remark;

        public static QueryPhoneWhiteListNewResponseBodyList build(java.util.Map<String, ?> map) throws Exception {
            QueryPhoneWhiteListNewResponseBodyList self = new QueryPhoneWhiteListNewResponseBodyList();
            return TeaModel.build(map, self);
        }

        public QueryPhoneWhiteListNewResponseBodyList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryPhoneWhiteListNewResponseBodyList setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }
        public String getPhoneNumber() {
            return this.phoneNumber;
        }

        public QueryPhoneWhiteListNewResponseBodyList setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

    }

}
