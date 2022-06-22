// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class GetSwitchAppListResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetSwitchAppListResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetSwitchAppListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSwitchAppListResponseBody self = new GetSwitchAppListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSwitchAppListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetSwitchAppListResponseBody setData(GetSwitchAppListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetSwitchAppListResponseBodyData getData() {
        return this.data;
    }

    public GetSwitchAppListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetSwitchAppListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSwitchAppListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetSwitchAppListResponseBodyData extends TeaModel {
        @NameInMap("Data")
        public java.util.List<String> data;

        @NameInMap("PageNo")
        public Long pageNo;

        @NameInMap("TotalCount")
        public Long totalCount;

        @NameInMap("TotalPage")
        public Long totalPage;

        public static GetSwitchAppListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetSwitchAppListResponseBodyData self = new GetSwitchAppListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetSwitchAppListResponseBodyData setData(java.util.List<String> data) {
            this.data = data;
            return this;
        }
        public java.util.List<String> getData() {
            return this.data;
        }

        public GetSwitchAppListResponseBodyData setPageNo(Long pageNo) {
            this.pageNo = pageNo;
            return this;
        }
        public Long getPageNo() {
            return this.pageNo;
        }

        public GetSwitchAppListResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

        public GetSwitchAppListResponseBodyData setTotalPage(Long totalPage) {
            this.totalPage = totalPage;
            return this;
        }
        public Long getTotalPage() {
            return this.totalPage;
        }

    }

}
