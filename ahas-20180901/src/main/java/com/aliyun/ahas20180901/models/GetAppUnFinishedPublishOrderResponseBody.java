// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class GetAppUnFinishedPublishOrderResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetAppUnFinishedPublishOrderResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetAppUnFinishedPublishOrderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAppUnFinishedPublishOrderResponseBody self = new GetAppUnFinishedPublishOrderResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAppUnFinishedPublishOrderResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetAppUnFinishedPublishOrderResponseBody setData(GetAppUnFinishedPublishOrderResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetAppUnFinishedPublishOrderResponseBodyData getData() {
        return this.data;
    }

    public GetAppUnFinishedPublishOrderResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetAppUnFinishedPublishOrderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAppUnFinishedPublishOrderResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetAppUnFinishedPublishOrderResponseBodyData extends TeaModel {
        @NameInMap("Data")
        public java.util.List<String> data;

        @NameInMap("PageNo")
        public Long pageNo;

        @NameInMap("TotalCount")
        public Long totalCount;

        @NameInMap("TotalPage")
        public Long totalPage;

        public static GetAppUnFinishedPublishOrderResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetAppUnFinishedPublishOrderResponseBodyData self = new GetAppUnFinishedPublishOrderResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetAppUnFinishedPublishOrderResponseBodyData setData(java.util.List<String> data) {
            this.data = data;
            return this;
        }
        public java.util.List<String> getData() {
            return this.data;
        }

        public GetAppUnFinishedPublishOrderResponseBodyData setPageNo(Long pageNo) {
            this.pageNo = pageNo;
            return this;
        }
        public Long getPageNo() {
            return this.pageNo;
        }

        public GetAppUnFinishedPublishOrderResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

        public GetAppUnFinishedPublishOrderResponseBodyData setTotalPage(Long totalPage) {
            this.totalPage = totalPage;
            return this;
        }
        public Long getTotalPage() {
            return this.totalPage;
        }

    }

}
