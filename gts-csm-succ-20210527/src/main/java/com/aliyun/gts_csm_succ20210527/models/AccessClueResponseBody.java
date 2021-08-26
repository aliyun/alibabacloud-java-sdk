// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gts_csm_succ20210527.models;

import com.aliyun.tea.*;

public class AccessClueResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("code")
    public Integer code;

    @NameInMap("data")
    public AccessClueResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("msg")
    public String msg;

    @NameInMap("TraceId")
    public String traceId;

    public static AccessClueResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AccessClueResponseBody self = new AccessClueResponseBody();
        return TeaModel.build(map, self);
    }

    public AccessClueResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public AccessClueResponseBody setData(AccessClueResponseBodyData data) {
        this.data = data;
        return this;
    }
    public AccessClueResponseBodyData getData() {
        return this.data;
    }

    public AccessClueResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AccessClueResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public AccessClueResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class AccessClueResponseBodyData extends TeaModel {
        @NameInMap("clueId")
        public String clueId;

        @NameInMap("gmtCreate")
        public String gmtCreate;

        @NameInMap("gmtModified")
        public String gmtModified;

        @NameInMap("creator")
        public String creator;

        @NameInMap("modifier")
        public String modifier;

        @NameInMap("isDeleted")
        public Boolean isDeleted;

        @NameInMap("cid")
        public Long cid;

        @NameInMap("source")
        public String source;

        @NameInMap("serviceProduct")
        public String serviceProduct;

        @NameInMap("followerUid")
        public String followerUid;

        @NameInMap("followerTlUid")
        public String followerTlUid;

        @NameInMap("creatorUid")
        public String creatorUid;

        @NameInMap("followerType")
        public String followerType;

        @NameInMap("expectOrderTime")
        public String expectOrderTime;

        @NameInMap("expectAmount")
        public Long expectAmount;

        @NameInMap("createTime")
        public String createTime;

        @NameInMap("state")
        public String state;

        @NameInMap("remark")
        public String remark;

        @NameInMap("svcSaleUid")
        public String svcSaleUid;

        @NameInMap("svcRepresentUid")
        public String svcRepresentUid;

        @NameInMap("svcAuthUid")
        public String svcAuthUid;

        @NameInMap("svcPdUid")
        public String svcPdUid;

        @NameInMap("svcKeepUid")
        public String svcKeepUid;

        @NameInMap("clueToOppTime")
        public String clueToOppTime;

        @NameInMap("cidName")
        public String cidName;

        @NameInMap("expireTime")
        public String expireTime;

        @NameInMap("daysRemaining")
        public Integer daysRemaining;

        public static AccessClueResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            AccessClueResponseBodyData self = new AccessClueResponseBodyData();
            return TeaModel.build(map, self);
        }

        public AccessClueResponseBodyData setClueId(String clueId) {
            this.clueId = clueId;
            return this;
        }
        public String getClueId() {
            return this.clueId;
        }

        public AccessClueResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public AccessClueResponseBodyData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public AccessClueResponseBodyData setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public AccessClueResponseBodyData setModifier(String modifier) {
            this.modifier = modifier;
            return this;
        }
        public String getModifier() {
            return this.modifier;
        }

        public AccessClueResponseBodyData setIsDeleted(Boolean isDeleted) {
            this.isDeleted = isDeleted;
            return this;
        }
        public Boolean getIsDeleted() {
            return this.isDeleted;
        }

        public AccessClueResponseBodyData setCid(Long cid) {
            this.cid = cid;
            return this;
        }
        public Long getCid() {
            return this.cid;
        }

        public AccessClueResponseBodyData setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public AccessClueResponseBodyData setServiceProduct(String serviceProduct) {
            this.serviceProduct = serviceProduct;
            return this;
        }
        public String getServiceProduct() {
            return this.serviceProduct;
        }

        public AccessClueResponseBodyData setFollowerUid(String followerUid) {
            this.followerUid = followerUid;
            return this;
        }
        public String getFollowerUid() {
            return this.followerUid;
        }

        public AccessClueResponseBodyData setFollowerTlUid(String followerTlUid) {
            this.followerTlUid = followerTlUid;
            return this;
        }
        public String getFollowerTlUid() {
            return this.followerTlUid;
        }

        public AccessClueResponseBodyData setCreatorUid(String creatorUid) {
            this.creatorUid = creatorUid;
            return this;
        }
        public String getCreatorUid() {
            return this.creatorUid;
        }

        public AccessClueResponseBodyData setFollowerType(String followerType) {
            this.followerType = followerType;
            return this;
        }
        public String getFollowerType() {
            return this.followerType;
        }

        public AccessClueResponseBodyData setExpectOrderTime(String expectOrderTime) {
            this.expectOrderTime = expectOrderTime;
            return this;
        }
        public String getExpectOrderTime() {
            return this.expectOrderTime;
        }

        public AccessClueResponseBodyData setExpectAmount(Long expectAmount) {
            this.expectAmount = expectAmount;
            return this;
        }
        public Long getExpectAmount() {
            return this.expectAmount;
        }

        public AccessClueResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public AccessClueResponseBodyData setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public AccessClueResponseBodyData setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public AccessClueResponseBodyData setSvcSaleUid(String svcSaleUid) {
            this.svcSaleUid = svcSaleUid;
            return this;
        }
        public String getSvcSaleUid() {
            return this.svcSaleUid;
        }

        public AccessClueResponseBodyData setSvcRepresentUid(String svcRepresentUid) {
            this.svcRepresentUid = svcRepresentUid;
            return this;
        }
        public String getSvcRepresentUid() {
            return this.svcRepresentUid;
        }

        public AccessClueResponseBodyData setSvcAuthUid(String svcAuthUid) {
            this.svcAuthUid = svcAuthUid;
            return this;
        }
        public String getSvcAuthUid() {
            return this.svcAuthUid;
        }

        public AccessClueResponseBodyData setSvcPdUid(String svcPdUid) {
            this.svcPdUid = svcPdUid;
            return this;
        }
        public String getSvcPdUid() {
            return this.svcPdUid;
        }

        public AccessClueResponseBodyData setSvcKeepUid(String svcKeepUid) {
            this.svcKeepUid = svcKeepUid;
            return this;
        }
        public String getSvcKeepUid() {
            return this.svcKeepUid;
        }

        public AccessClueResponseBodyData setClueToOppTime(String clueToOppTime) {
            this.clueToOppTime = clueToOppTime;
            return this;
        }
        public String getClueToOppTime() {
            return this.clueToOppTime;
        }

        public AccessClueResponseBodyData setCidName(String cidName) {
            this.cidName = cidName;
            return this;
        }
        public String getCidName() {
            return this.cidName;
        }

        public AccessClueResponseBodyData setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public AccessClueResponseBodyData setDaysRemaining(Integer daysRemaining) {
            this.daysRemaining = daysRemaining;
            return this;
        }
        public Integer getDaysRemaining() {
            return this.daysRemaining;
        }

    }

}
