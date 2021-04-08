// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetSeatInformationResponseBody extends TeaModel {
    // 请求ID，用于跟踪错误原因
    @NameInMap("RequestId")
    public String requestId;

    // 错误描述
    @NameInMap("Message")
    public String message;

    // 错误编码
    @NameInMap("Code")
    public String code;

    // 调用接口是否成功
    @NameInMap("Success")
    public String success;

    // data
    @NameInMap("Data")
    public GetSeatInformationResponseBodyData data;

    public static GetSeatInformationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSeatInformationResponseBody self = new GetSeatInformationResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSeatInformationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSeatInformationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetSeatInformationResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetSeatInformationResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public GetSeatInformationResponseBody setData(GetSeatInformationResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetSeatInformationResponseBodyData getData() {
        return this.data;
    }

    public static class GetSeatInformationResponseBodyData extends TeaModel {
        // 当前页数
        @NameInMap("PageNum")
        public Integer pageNum;

        // 页大小
        @NameInMap("PageSize")
        public Integer pageSize;

        // 总记录数
        @NameInMap("TotalNum")
        public Integer totalNum;

        // 信息为list<map>类型的json字符串
        @NameInMap("Rowr")
        public String rowr;

        public static GetSeatInformationResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetSeatInformationResponseBodyData self = new GetSeatInformationResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetSeatInformationResponseBodyData setPageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Integer getPageNum() {
            return this.pageNum;
        }

        public GetSeatInformationResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public GetSeatInformationResponseBodyData setTotalNum(Integer totalNum) {
            this.totalNum = totalNum;
            return this;
        }
        public Integer getTotalNum() {
            return this.totalNum;
        }

        public GetSeatInformationResponseBodyData setRowr(String rowr) {
            this.rowr = rowr;
            return this;
        }
        public String getRowr() {
            return this.rowr;
        }

    }

}
