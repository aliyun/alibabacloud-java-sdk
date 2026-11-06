// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieiap_1_0.models;

import com.aliyun.tea.*;

public class GetAccountForAppResponseBody extends TeaModel {
    /**
     * <p>Error code returned. A value of <code>0</code> indicates success.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("RetCode")
    public Integer retCode;

    /**
     * <p>Error message returned. No message is returned upon success.</p>
     * 
     * <strong>example:</strong>
     * <p>请求异常</p>
     */
    @NameInMap("RetMsg")
    public String retMsg;

    /**
     * <p>List of result objects returned.</p>
     */
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
        /**
         * <p>Indicates whether the user is an authorized member.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsVip")
        public Boolean isVip;

        /**
         * <p>Membership expiration time.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-05-12 15:22:18</p>
         */
        @NameInMap("StrVipExpire")
        public String strVipExpire;

        /**
         * <p>Millisecond-level UNIX timestamp.</p>
         * <ul>
         * <li>If the user has activated membership, returns the membership expiration time.</li>
         * <li>If the user has never activated membership, the value is always <code>0</code>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1652340138347</p>
         */
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
