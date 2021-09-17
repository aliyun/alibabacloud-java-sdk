// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspace20191128.models;

import com.aliyun.tea.*;

public class GetInstanceSaleResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public String success;

    @NameInMap("Data")
    public GetInstanceSaleResponseBodyData data;

    public static GetInstanceSaleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceSaleResponseBody self = new GetInstanceSaleResponseBody();
        return TeaModel.build(map, self);
    }

    public GetInstanceSaleResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetInstanceSaleResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetInstanceSaleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetInstanceSaleResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public GetInstanceSaleResponseBody setData(GetInstanceSaleResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetInstanceSaleResponseBodyData getData() {
        return this.data;
    }

    public static class GetInstanceSaleResponseBodyData extends TeaModel {
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

        public static GetInstanceSaleResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceSaleResponseBodyData self = new GetInstanceSaleResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetInstanceSaleResponseBodyData setPageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Integer getPageNum() {
            return this.pageNum;
        }

        public GetInstanceSaleResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public GetInstanceSaleResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public GetInstanceSaleResponseBodyData setHadSTS(Boolean hadSTS) {
            this.hadSTS = hadSTS;
            return this;
        }
        public Boolean getHadSTS() {
            return this.hadSTS;
        }

        public GetInstanceSaleResponseBodyData setTenantId(Long tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Long getTenantId() {
            return this.tenantId;
        }

        public GetInstanceSaleResponseBodyData setInstanceList(java.util.List<String> instanceList) {
            this.instanceList = instanceList;
            return this;
        }
        public java.util.List<String> getInstanceList() {
            return this.instanceList;
        }

    }

}
