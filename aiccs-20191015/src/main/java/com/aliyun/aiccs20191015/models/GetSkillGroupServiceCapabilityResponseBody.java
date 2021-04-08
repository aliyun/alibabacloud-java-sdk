// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetSkillGroupServiceCapabilityResponseBody extends TeaModel {
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
    public GetSkillGroupServiceCapabilityResponseBodyData data;

    public static GetSkillGroupServiceCapabilityResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSkillGroupServiceCapabilityResponseBody self = new GetSkillGroupServiceCapabilityResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSkillGroupServiceCapabilityResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSkillGroupServiceCapabilityResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetSkillGroupServiceCapabilityResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetSkillGroupServiceCapabilityResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public GetSkillGroupServiceCapabilityResponseBody setData(GetSkillGroupServiceCapabilityResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetSkillGroupServiceCapabilityResponseBodyData getData() {
        return this.data;
    }

    public static class GetSkillGroupServiceCapabilityResponseBodyData extends TeaModel {
        // 当前页数
        @NameInMap("PageNum")
        public Integer pageNum;

        // 页大小
        @NameInMap("PageSize")
        public Integer pageSize;

        // 总记录数
        @NameInMap("TotalNum")
        public Long totalNum;

        // 信息为list<map>类型的json字符串
        @NameInMap("Rows")
        public String rows;

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

        public GetSkillGroupServiceCapabilityResponseBodyData setTotalNum(Long totalNum) {
            this.totalNum = totalNum;
            return this;
        }
        public Long getTotalNum() {
            return this.totalNum;
        }

        public GetSkillGroupServiceCapabilityResponseBodyData setRows(String rows) {
            this.rows = rows;
            return this;
        }
        public String getRows() {
            return this.rows;
        }

    }

}
