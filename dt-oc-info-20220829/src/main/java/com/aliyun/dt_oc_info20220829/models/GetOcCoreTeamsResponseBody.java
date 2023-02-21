// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dt_oc_info20220829.models;

import com.aliyun.tea.*;

public class GetOcCoreTeamsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<GetOcCoreTeamsResponseBodyData> data;

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

    public static GetOcCoreTeamsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetOcCoreTeamsResponseBody self = new GetOcCoreTeamsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetOcCoreTeamsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetOcCoreTeamsResponseBody setData(java.util.List<GetOcCoreTeamsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetOcCoreTeamsResponseBodyData> getData() {
        return this.data;
    }

    public GetOcCoreTeamsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetOcCoreTeamsResponseBody setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public GetOcCoreTeamsResponseBody setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public GetOcCoreTeamsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetOcCoreTeamsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetOcCoreTeamsResponseBody setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
        return this;
    }
    public Integer getTotalNum() {
        return this.totalNum;
    }

    public static class GetOcCoreTeamsResponseBodyData extends TeaModel {
        @NameInMap("EntName")
        public String entName;

        @NameInMap("MemberIntroduction")
        public String memberIntroduction;

        @NameInMap("MemberName")
        public String memberName;

        @NameInMap("MemberPosition")
        public String memberPosition;

        public static GetOcCoreTeamsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetOcCoreTeamsResponseBodyData self = new GetOcCoreTeamsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetOcCoreTeamsResponseBodyData setEntName(String entName) {
            this.entName = entName;
            return this;
        }
        public String getEntName() {
            return this.entName;
        }

        public GetOcCoreTeamsResponseBodyData setMemberIntroduction(String memberIntroduction) {
            this.memberIntroduction = memberIntroduction;
            return this;
        }
        public String getMemberIntroduction() {
            return this.memberIntroduction;
        }

        public GetOcCoreTeamsResponseBodyData setMemberName(String memberName) {
            this.memberName = memberName;
            return this;
        }
        public String getMemberName() {
            return this.memberName;
        }

        public GetOcCoreTeamsResponseBodyData setMemberPosition(String memberPosition) {
            this.memberPosition = memberPosition;
            return this;
        }
        public String getMemberPosition() {
            return this.memberPosition;
        }

    }

}
