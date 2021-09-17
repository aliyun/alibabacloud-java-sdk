// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspace20191128.models;

import com.aliyun.tea.*;

public class GetInstanceListSaleResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public String success;

    @NameInMap("Data")
    public GetInstanceListSaleResponseBodyData data;

    public static GetInstanceListSaleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceListSaleResponseBody self = new GetInstanceListSaleResponseBody();
        return TeaModel.build(map, self);
    }

    public GetInstanceListSaleResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetInstanceListSaleResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetInstanceListSaleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetInstanceListSaleResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public GetInstanceListSaleResponseBody setData(GetInstanceListSaleResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetInstanceListSaleResponseBodyData getData() {
        return this.data;
    }

    public static class GetInstanceListSaleResponseBodyData extends TeaModel {
        @NameInMap("PageNum")
        public Integer pageNum;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        @NameInMap("HadSTS")
        public Boolean hadSTS;

        @NameInMap("TenantId")
        public Long tenantId;

        @NameInMap("InstanceList")
        public java.util.List<String> instanceList;

        public static GetInstanceListSaleResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceListSaleResponseBodyData self = new GetInstanceListSaleResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetInstanceListSaleResponseBodyData setPageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Integer getPageNum() {
            return this.pageNum;
        }

        public GetInstanceListSaleResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public GetInstanceListSaleResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public GetInstanceListSaleResponseBodyData setHadSTS(Boolean hadSTS) {
            this.hadSTS = hadSTS;
            return this;
        }
        public Boolean getHadSTS() {
            return this.hadSTS;
        }

        public GetInstanceListSaleResponseBodyData setTenantId(Long tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Long getTenantId() {
            return this.tenantId;
        }

        public GetInstanceListSaleResponseBodyData setInstanceList(java.util.List<String> instanceList) {
            this.instanceList = instanceList;
            return this;
        }
        public java.util.List<String> getInstanceList() {
            return this.instanceList;
        }

    }

}
