// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class GetAppMachinesResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetAppMachinesResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetAppMachinesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAppMachinesResponseBody self = new GetAppMachinesResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAppMachinesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetAppMachinesResponseBody setData(GetAppMachinesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetAppMachinesResponseBodyData getData() {
        return this.data;
    }

    public GetAppMachinesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetAppMachinesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAppMachinesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetAppMachinesResponseBodyData extends TeaModel {
        @NameInMap("Data")
        public java.util.List<String> data;

        @NameInMap("PageNo")
        public Long pageNo;

        @NameInMap("TotalCount")
        public Long totalCount;

        @NameInMap("TotalPage")
        public Long totalPage;

        public static GetAppMachinesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetAppMachinesResponseBodyData self = new GetAppMachinesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetAppMachinesResponseBodyData setData(java.util.List<String> data) {
            this.data = data;
            return this;
        }
        public java.util.List<String> getData() {
            return this.data;
        }

        public GetAppMachinesResponseBodyData setPageNo(Long pageNo) {
            this.pageNo = pageNo;
            return this;
        }
        public Long getPageNo() {
            return this.pageNo;
        }

        public GetAppMachinesResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

        public GetAppMachinesResponseBodyData setTotalPage(Long totalPage) {
            this.totalPage = totalPage;
            return this;
        }
        public Long getTotalPage() {
            return this.totalPage;
        }

    }

}
