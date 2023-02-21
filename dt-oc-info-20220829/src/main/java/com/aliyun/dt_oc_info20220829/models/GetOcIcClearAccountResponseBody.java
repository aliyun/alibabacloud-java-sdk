// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dt_oc_info20220829.models;

import com.aliyun.tea.*;

public class GetOcIcClearAccountResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<GetOcIcClearAccountResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("PageIndex")
    public Integer pageIndex;

    @NameInMap("PageNum")
    public Integer pageNum;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TotalNum")
    public Integer totalNum;

    public static GetOcIcClearAccountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetOcIcClearAccountResponseBody self = new GetOcIcClearAccountResponseBody();
        return TeaModel.build(map, self);
    }

    public GetOcIcClearAccountResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetOcIcClearAccountResponseBody setData(java.util.List<GetOcIcClearAccountResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetOcIcClearAccountResponseBodyData> getData() {
        return this.data;
    }

    public GetOcIcClearAccountResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetOcIcClearAccountResponseBody setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public GetOcIcClearAccountResponseBody setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public GetOcIcClearAccountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetOcIcClearAccountResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetOcIcClearAccountResponseBody setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
        return this;
    }
    public Integer getTotalNum() {
        return this.totalNum;
    }

    public static class GetOcIcClearAccountResponseBodyData extends TeaModel {
        @NameInMap("Leader")
        public String leader;

        @NameInMap("Member")
        public String member;

        public static GetOcIcClearAccountResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetOcIcClearAccountResponseBodyData self = new GetOcIcClearAccountResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetOcIcClearAccountResponseBodyData setLeader(String leader) {
            this.leader = leader;
            return this;
        }
        public String getLeader() {
            return this.leader;
        }

        public GetOcIcClearAccountResponseBodyData setMember(String member) {
            this.member = member;
            return this;
        }
        public String getMember() {
            return this.member;
        }

    }

}
