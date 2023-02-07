// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetSkillGroupServiceCapabilityResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetSkillGroupServiceCapabilityResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public String success;

    public static GetSkillGroupServiceCapabilityResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSkillGroupServiceCapabilityResponseBody self = new GetSkillGroupServiceCapabilityResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSkillGroupServiceCapabilityResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetSkillGroupServiceCapabilityResponseBody setData(GetSkillGroupServiceCapabilityResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetSkillGroupServiceCapabilityResponseBodyData getData() {
        return this.data;
    }

    public GetSkillGroupServiceCapabilityResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetSkillGroupServiceCapabilityResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSkillGroupServiceCapabilityResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class GetSkillGroupServiceCapabilityResponseBodyData extends TeaModel {
        @NameInMap("PageNum")
        public Integer pageNum;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("Rows")
        public String rows;

        @NameInMap("TotalNum")
        public Long totalNum;

        public static GetSkillGroupServiceCapabilityResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetSkillGroupServiceCapabilityResponseBodyData self = new GetSkillGroupServiceCapabilityResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetSkillGroupServiceCapabilityResponseBodyData setPageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Integer getPageNum() {
            return this.pageNum;
        }

        public GetSkillGroupServiceCapabilityResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public GetSkillGroupServiceCapabilityResponseBodyData setRows(String rows) {
            this.rows = rows;
            return this;
        }
        public String getRows() {
            return this.rows;
        }

        public GetSkillGroupServiceCapabilityResponseBodyData setTotalNum(Long totalNum) {
            this.totalNum = totalNum;
            return this;
        }
        public Long getTotalNum() {
            return this.totalNum;
        }

    }

}
