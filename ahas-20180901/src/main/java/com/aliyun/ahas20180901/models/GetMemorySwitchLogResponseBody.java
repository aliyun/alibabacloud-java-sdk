// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class GetMemorySwitchLogResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetMemorySwitchLogResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetMemorySwitchLogResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMemorySwitchLogResponseBody self = new GetMemorySwitchLogResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMemorySwitchLogResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetMemorySwitchLogResponseBody setData(GetMemorySwitchLogResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetMemorySwitchLogResponseBodyData getData() {
        return this.data;
    }

    public GetMemorySwitchLogResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetMemorySwitchLogResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetMemorySwitchLogResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetMemorySwitchLogResponseBodyData extends TeaModel {
        @NameInMap("Data")
        public java.util.List<String> data;

        @NameInMap("PageNo")
        public Long pageNo;

        @NameInMap("TotalPage")
        public Long totalPage;

        public static GetMemorySwitchLogResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetMemorySwitchLogResponseBodyData self = new GetMemorySwitchLogResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetMemorySwitchLogResponseBodyData setData(java.util.List<String> data) {
            this.data = data;
            return this;
        }
        public java.util.List<String> getData() {
            return this.data;
        }

        public GetMemorySwitchLogResponseBodyData setPageNo(Long pageNo) {
            this.pageNo = pageNo;
            return this;
        }
        public Long getPageNo() {
            return this.pageNo;
        }

        public GetMemorySwitchLogResponseBodyData setTotalPage(Long totalPage) {
            this.totalPage = totalPage;
            return this;
        }
        public Long getTotalPage() {
            return this.totalPage;
        }

    }

}
