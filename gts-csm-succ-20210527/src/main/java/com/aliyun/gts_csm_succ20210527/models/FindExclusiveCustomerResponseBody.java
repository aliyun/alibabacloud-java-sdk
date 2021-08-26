// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gts_csm_succ20210527.models;

import com.aliyun.tea.*;

public class FindExclusiveCustomerResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Code")
    public Integer code;

    @NameInMap("Msg")
    public String msg;

    @NameInMap("TraceId")
    public String traceId;

    @NameInMap("Data")
    public java.util.List<FindExclusiveCustomerResponseBodyData> data;

    public static FindExclusiveCustomerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        FindExclusiveCustomerResponseBody self = new FindExclusiveCustomerResponseBody();
        return TeaModel.build(map, self);
    }

    public FindExclusiveCustomerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public FindExclusiveCustomerResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public FindExclusiveCustomerResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public FindExclusiveCustomerResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public FindExclusiveCustomerResponseBody setData(java.util.List<FindExclusiveCustomerResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<FindExclusiveCustomerResponseBodyData> getData() {
        return this.data;
    }

    public static class FindExclusiveCustomerResponseBodyData extends TeaModel {
        @NameInMap("Cid")
        public Long cid;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("Creator")
        public String creator;

        @NameInMap("Modifier")
        public String modifier;

        @NameInMap("IsDeleted")
        public Boolean isDeleted;

        @NameInMap("TenantCode")
        public String tenantCode;

        @NameInMap("IsDeepService")
        public String isDeepService;

        @NameInMap("Remark")
        public String remark;

        @NameInMap("CustomerNickname")
        public String customerNickname;

        @NameInMap("CsmBelongUid")
        public String csmBelongUid;

        @NameInMap("CsmTlBelongUid")
        public String csmTlBelongUid;

        @NameInMap("IndustryNickname")
        public String industryNickname;

        @NameInMap("PostCsmBelongUid")
        public String postCsmBelongUid;

        public static FindExclusiveCustomerResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            FindExclusiveCustomerResponseBodyData self = new FindExclusiveCustomerResponseBodyData();
            return TeaModel.build(map, self);
        }

        public FindExclusiveCustomerResponseBodyData setCid(Long cid) {
            this.cid = cid;
            return this;
        }
        public Long getCid() {
            return this.cid;
        }

        public FindExclusiveCustomerResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public FindExclusiveCustomerResponseBodyData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public FindExclusiveCustomerResponseBodyData setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public FindExclusiveCustomerResponseBodyData setModifier(String modifier) {
            this.modifier = modifier;
            return this;
        }
        public String getModifier() {
            return this.modifier;
        }

        public FindExclusiveCustomerResponseBodyData setIsDeleted(Boolean isDeleted) {
            this.isDeleted = isDeleted;
            return this;
        }
        public Boolean getIsDeleted() {
            return this.isDeleted;
        }

        public FindExclusiveCustomerResponseBodyData setTenantCode(String tenantCode) {
            this.tenantCode = tenantCode;
            return this;
        }
        public String getTenantCode() {
            return this.tenantCode;
        }

        public FindExclusiveCustomerResponseBodyData setIsDeepService(String isDeepService) {
            this.isDeepService = isDeepService;
            return this;
        }
        public String getIsDeepService() {
            return this.isDeepService;
        }

        public FindExclusiveCustomerResponseBodyData setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public FindExclusiveCustomerResponseBodyData setCustomerNickname(String customerNickname) {
            this.customerNickname = customerNickname;
            return this;
        }
        public String getCustomerNickname() {
            return this.customerNickname;
        }

        public FindExclusiveCustomerResponseBodyData setCsmBelongUid(String csmBelongUid) {
            this.csmBelongUid = csmBelongUid;
            return this;
        }
        public String getCsmBelongUid() {
            return this.csmBelongUid;
        }

        public FindExclusiveCustomerResponseBodyData setCsmTlBelongUid(String csmTlBelongUid) {
            this.csmTlBelongUid = csmTlBelongUid;
            return this;
        }
        public String getCsmTlBelongUid() {
            return this.csmTlBelongUid;
        }

        public FindExclusiveCustomerResponseBodyData setIndustryNickname(String industryNickname) {
            this.industryNickname = industryNickname;
            return this;
        }
        public String getIndustryNickname() {
            return this.industryNickname;
        }

        public FindExclusiveCustomerResponseBodyData setPostCsmBelongUid(String postCsmBelongUid) {
            this.postCsmBelongUid = postCsmBelongUid;
            return this;
        }
        public String getPostCsmBelongUid() {
            return this.postCsmBelongUid;
        }

    }

}
