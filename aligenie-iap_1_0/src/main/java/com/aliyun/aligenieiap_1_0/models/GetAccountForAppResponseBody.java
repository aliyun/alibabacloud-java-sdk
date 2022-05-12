// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieiap_1_0.models;

import com.aliyun.tea.*;

public class GetAccountForAppResponseBody extends TeaModel {
    // 错误码
    @NameInMap("RetCode")
    public Integer retCode;

    // 错误信息
    @NameInMap("RetMsg")
    public String retMsg;

    // 用户信息
    @NameInMap("RetValue")
    public GetAccountForAppResponseBodyRetValue retValue;

    public static GetAccountForAppResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAccountForAppResponseBody self = new GetAccountForAppResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAccountForAppResponseBody setRetCode(Integer retCode) {
        this.retCode = retCode;
        return this;
    }
    public Integer getRetCode() {
        return this.retCode;
    }

    public GetAccountForAppResponseBody setRetMsg(String retMsg) {
        this.retMsg = retMsg;
        return this;
    }
    public String getRetMsg() {
        return this.retMsg;
    }

    public GetAccountForAppResponseBody setRetValue(GetAccountForAppResponseBodyRetValue retValue) {
        this.retValue = retValue;
        return this;
    }
    public GetAccountForAppResponseBodyRetValue getRetValue() {
        return this.retValue;
    }

    public static class GetAccountForAppResponseBodyRetValue extends TeaModel {
        // 是否VIP
        @NameInMap("IsVip")
        public Boolean isVip;

        // 日期格式，到期时间
        @NameInMap("StrVipExpire")
        public String strVipExpire;

        // 若以前开通过会员，返回会员失效时间，若从未开通过会员，此字段为0
        @NameInMap("VipExpireAt")
        public Long vipExpireAt;

        public static GetAccountForAppResponseBodyRetValue build(java.util.Map<String, ?> map) throws Exception {
            GetAccountForAppResponseBodyRetValue self = new GetAccountForAppResponseBodyRetValue();
            return TeaModel.build(map, self);
        }

        public GetAccountForAppResponseBodyRetValue setIsVip(Boolean isVip) {
            this.isVip = isVip;
            return this;
        }
        public Boolean getIsVip() {
            return this.isVip;
        }

        public GetAccountForAppResponseBodyRetValue setStrVipExpire(String strVipExpire) {
            this.strVipExpire = strVipExpire;
            return this;
        }
        public String getStrVipExpire() {
            return this.strVipExpire;
        }

        public GetAccountForAppResponseBodyRetValue setVipExpireAt(Long vipExpireAt) {
            this.vipExpireAt = vipExpireAt;
            return this;
        }
        public Long getVipExpireAt() {
            return this.vipExpireAt;
        }

    }

}
