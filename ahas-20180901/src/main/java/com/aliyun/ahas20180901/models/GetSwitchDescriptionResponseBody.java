// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class GetSwitchDescriptionResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetSwitchDescriptionResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetSwitchDescriptionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSwitchDescriptionResponseBody self = new GetSwitchDescriptionResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSwitchDescriptionResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetSwitchDescriptionResponseBody setData(GetSwitchDescriptionResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetSwitchDescriptionResponseBodyData getData() {
        return this.data;
    }

    public GetSwitchDescriptionResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetSwitchDescriptionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSwitchDescriptionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetSwitchDescriptionResponseBodyData extends TeaModel {
        @NameInMap("PageData")
        public java.util.List<String> pageData;

        @NameInMap("PageNo")
        public Integer pageNo;

        @NameInMap("TotalCount")
        public Long totalCount;

        @NameInMap("TotalPage")
        public Integer totalPage;

        public static GetSwitchDescriptionResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetSwitchDescriptionResponseBodyData self = new GetSwitchDescriptionResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetSwitchDescriptionResponseBodyData setPageData(java.util.List<String> pageData) {
            this.pageData = pageData;
            return this;
        }
        public java.util.List<String> getPageData() {
            return this.pageData;
        }

        public GetSwitchDescriptionResponseBodyData setPageNo(Integer pageNo) {
            this.pageNo = pageNo;
            return this;
        }
        public Integer getPageNo() {
            return this.pageNo;
        }

        public GetSwitchDescriptionResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

        public GetSwitchDescriptionResponseBodyData setTotalPage(Integer totalPage) {
            this.totalPage = totalPage;
            return this;
        }
        public Integer getTotalPage() {
            return this.totalPage;
        }

    }

}
