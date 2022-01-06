// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspace20191128.models;

import com.aliyun.tea.*;

public class GetInstanceListResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetInstanceListResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public String success;

    public static GetInstanceListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceListResponseBody self = new GetInstanceListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetInstanceListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetInstanceListResponseBody setData(GetInstanceListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetInstanceListResponseBodyData getData() {
        return this.data;
    }

    public GetInstanceListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetInstanceListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetInstanceListResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class GetInstanceListResponseBodyData extends TeaModel {
        @NameInMap("HadSTS")
        public Boolean hadSTS;

        @NameInMap("InstanceList")
        public java.util.List<String> instanceList;

        @NameInMap("PageNum")
        public Integer pageNum;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TenantId")
        public Long tenantId;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static GetInstanceListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceListResponseBodyData self = new GetInstanceListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetInstanceListResponseBodyData setHadSTS(Boolean hadSTS) {
            this.hadSTS = hadSTS;
            return this;
        }
        public Boolean getHadSTS() {
            return this.hadSTS;
        }

        public GetInstanceListResponseBodyData setInstanceList(java.util.List<String> instanceList) {
            this.instanceList = instanceList;
            return this;
        }
        public java.util.List<String> getInstanceList() {
            return this.instanceList;
        }

        public GetInstanceListResponseBodyData setPageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Integer getPageNum() {
            return this.pageNum;
        }

        public GetInstanceListResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public GetInstanceListResponseBodyData setTenantId(Long tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Long getTenantId() {
            return this.tenantId;
        }

        public GetInstanceListResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
