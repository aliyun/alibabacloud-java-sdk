// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20200324.models;

import com.aliyun.tea.*;

public class GetCustomerRebateTypeResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("FxUserInfoExt")
    public GetCustomerRebateTypeResponseBodyFxUserInfoExt fxUserInfoExt;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetCustomerRebateTypeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCustomerRebateTypeResponseBody self = new GetCustomerRebateTypeResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCustomerRebateTypeResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetCustomerRebateTypeResponseBody setFxUserInfoExt(GetCustomerRebateTypeResponseBodyFxUserInfoExt fxUserInfoExt) {
        this.fxUserInfoExt = fxUserInfoExt;
        return this;
    }
    public GetCustomerRebateTypeResponseBodyFxUserInfoExt getFxUserInfoExt() {
        return this.fxUserInfoExt;
    }

    public GetCustomerRebateTypeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetCustomerRebateTypeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetCustomerRebateTypeResponseBodyFxUserInfoExt extends TeaModel {
        @NameInMap("CustomerRebateType")
        public Integer customerRebateType;

        @NameInMap("DistributionRebateType")
        public Integer distributionRebateType;

        @NameInMap("IsSub")
        public Integer isSub;

        @NameInMap("KpId")
        public Long kpId;

        @NameInMap("Level")
        public Integer level;

        @NameInMap("ParentUid")
        public Long parentUid;

        @NameInMap("SubUserCount")
        public Integer subUserCount;

        public static GetCustomerRebateTypeResponseBodyFxUserInfoExt build(java.util.Map<String, ?> map) throws Exception {
            GetCustomerRebateTypeResponseBodyFxUserInfoExt self = new GetCustomerRebateTypeResponseBodyFxUserInfoExt();
            return TeaModel.build(map, self);
        }

        public GetCustomerRebateTypeResponseBodyFxUserInfoExt setCustomerRebateType(Integer customerRebateType) {
            this.customerRebateType = customerRebateType;
            return this;
        }
        public Integer getCustomerRebateType() {
            return this.customerRebateType;
        }

        public GetCustomerRebateTypeResponseBodyFxUserInfoExt setDistributionRebateType(Integer distributionRebateType) {
            this.distributionRebateType = distributionRebateType;
            return this;
        }
        public Integer getDistributionRebateType() {
            return this.distributionRebateType;
        }

        public GetCustomerRebateTypeResponseBodyFxUserInfoExt setIsSub(Integer isSub) {
            this.isSub = isSub;
            return this;
        }
        public Integer getIsSub() {
            return this.isSub;
        }

        public GetCustomerRebateTypeResponseBodyFxUserInfoExt setKpId(Long kpId) {
            this.kpId = kpId;
            return this;
        }
        public Long getKpId() {
            return this.kpId;
        }

        public GetCustomerRebateTypeResponseBodyFxUserInfoExt setLevel(Integer level) {
            this.level = level;
            return this;
        }
        public Integer getLevel() {
            return this.level;
        }

        public GetCustomerRebateTypeResponseBodyFxUserInfoExt setParentUid(Long parentUid) {
            this.parentUid = parentUid;
            return this;
        }
        public Long getParentUid() {
            return this.parentUid;
        }

        public GetCustomerRebateTypeResponseBodyFxUserInfoExt setSubUserCount(Integer subUserCount) {
            this.subUserCount = subUserCount;
            return this;
        }
        public Integer getSubUserCount() {
            return this.subUserCount;
        }

    }

}
