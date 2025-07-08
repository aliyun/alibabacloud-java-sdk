// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class QuerySmsPackageDetailNewResponseBody extends TeaModel {
    @NameInMap("List")
    public QuerySmsPackageDetailNewResponseBodyList list;

    @NameInMap("PageNo")
    public Integer pageNo;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RemainSmsCount")
    public Long remainSmsCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Total")
    public Long total;

    @NameInMap("TotalSmsCount")
    public Long totalSmsCount;

    public static QuerySmsPackageDetailNewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QuerySmsPackageDetailNewResponseBody self = new QuerySmsPackageDetailNewResponseBody();
        return TeaModel.build(map, self);
    }

    public QuerySmsPackageDetailNewResponseBody setList(QuerySmsPackageDetailNewResponseBodyList list) {
        this.list = list;
        return this;
    }
    public QuerySmsPackageDetailNewResponseBodyList getList() {
        return this.list;
    }

    public QuerySmsPackageDetailNewResponseBody setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public QuerySmsPackageDetailNewResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QuerySmsPackageDetailNewResponseBody setRemainSmsCount(Long remainSmsCount) {
        this.remainSmsCount = remainSmsCount;
        return this;
    }
    public Long getRemainSmsCount() {
        return this.remainSmsCount;
    }

    public QuerySmsPackageDetailNewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QuerySmsPackageDetailNewResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public QuerySmsPackageDetailNewResponseBody setTotalSmsCount(Long totalSmsCount) {
        this.totalSmsCount = totalSmsCount;
        return this;
    }
    public Long getTotalSmsCount() {
        return this.totalSmsCount;
    }

    public static class QuerySmsPackageDetailNewResponseBodyListSmsPackageDetailDTO extends TeaModel {
        @NameInMap("InvalidTime")
        public Long invalidTime;

        @NameInMap("OrderTime")
        public Long orderTime;

        @NameInMap("PackageType")
        public String packageType;

        @NameInMap("RemainCount")
        public Long remainCount;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("TotalCount")
        public Long totalCount;

        public static QuerySmsPackageDetailNewResponseBodyListSmsPackageDetailDTO build(java.util.Map<String, ?> map) throws Exception {
            QuerySmsPackageDetailNewResponseBodyListSmsPackageDetailDTO self = new QuerySmsPackageDetailNewResponseBodyListSmsPackageDetailDTO();
            return TeaModel.build(map, self);
        }

        public QuerySmsPackageDetailNewResponseBodyListSmsPackageDetailDTO setInvalidTime(Long invalidTime) {
            this.invalidTime = invalidTime;
            return this;
        }
        public Long getInvalidTime() {
            return this.invalidTime;
        }

        public QuerySmsPackageDetailNewResponseBodyListSmsPackageDetailDTO setOrderTime(Long orderTime) {
            this.orderTime = orderTime;
            return this;
        }
        public Long getOrderTime() {
            return this.orderTime;
        }

        public QuerySmsPackageDetailNewResponseBodyListSmsPackageDetailDTO setPackageType(String packageType) {
            this.packageType = packageType;
            return this;
        }
        public String getPackageType() {
            return this.packageType;
        }

        public QuerySmsPackageDetailNewResponseBodyListSmsPackageDetailDTO setRemainCount(Long remainCount) {
            this.remainCount = remainCount;
            return this;
        }
        public Long getRemainCount() {
            return this.remainCount;
        }

        public QuerySmsPackageDetailNewResponseBodyListSmsPackageDetailDTO setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public QuerySmsPackageDetailNewResponseBodyListSmsPackageDetailDTO setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

    public static class QuerySmsPackageDetailNewResponseBodyList extends TeaModel {
        @NameInMap("SmsPackageDetailDTO")
        public java.util.List<QuerySmsPackageDetailNewResponseBodyListSmsPackageDetailDTO> smsPackageDetailDTO;

        public static QuerySmsPackageDetailNewResponseBodyList build(java.util.Map<String, ?> map) throws Exception {
            QuerySmsPackageDetailNewResponseBodyList self = new QuerySmsPackageDetailNewResponseBodyList();
            return TeaModel.build(map, self);
        }

        public QuerySmsPackageDetailNewResponseBodyList setSmsPackageDetailDTO(java.util.List<QuerySmsPackageDetailNewResponseBodyListSmsPackageDetailDTO> smsPackageDetailDTO) {
            this.smsPackageDetailDTO = smsPackageDetailDTO;
            return this;
        }
        public java.util.List<QuerySmsPackageDetailNewResponseBodyListSmsPackageDetailDTO> getSmsPackageDetailDTO() {
            return this.smsPackageDetailDTO;
        }

    }

}
