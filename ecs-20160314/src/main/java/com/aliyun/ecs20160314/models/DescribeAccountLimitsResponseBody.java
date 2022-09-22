// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class DescribeAccountLimitsResponseBody extends TeaModel {
    @NameInMap("AccountLimitTypeSet")
    public AccountLimitTypeSet accountLimitTypeSet;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeAccountLimitsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAccountLimitsResponseBody self = new DescribeAccountLimitsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAccountLimitsResponseBody setAccountLimitTypeSet(AccountLimitTypeSet accountLimitTypeSet) {
        this.accountLimitTypeSet = accountLimitTypeSet;
        return this;
    }
    public AccountLimitTypeSet getAccountLimitTypeSet() {
        return this.accountLimitTypeSet;
    }

    public DescribeAccountLimitsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class LimitValueSet extends TeaModel {
        @NameInMap("LimitValue")
        public java.util.List<String> limitValue;

        public static LimitValueSet build(java.util.Map<String, ?> map) throws Exception {
            LimitValueSet self = new LimitValueSet();
            return TeaModel.build(map, self);
        }

        public LimitValueSet setLimitValue(java.util.List<String> limitValue) {
            this.limitValue = limitValue;
            return this;
        }
        public java.util.List<String> getLimitValue() {
            return this.limitValue;
        }

    }

    public static class AccountLimit extends TeaModel {
        @NameInMap("LimitName")
        public String limitName;

        @NameInMap("LimitValueSet")
        public LimitValueSet limitValueSet;

        public static AccountLimit build(java.util.Map<String, ?> map) throws Exception {
            AccountLimit self = new AccountLimit();
            return TeaModel.build(map, self);
        }

        public AccountLimit setLimitName(String limitName) {
            this.limitName = limitName;
            return this;
        }
        public String getLimitName() {
            return this.limitName;
        }

        public AccountLimit setLimitValueSet(LimitValueSet limitValueSet) {
            this.limitValueSet = limitValueSet;
            return this;
        }
        public LimitValueSet getLimitValueSet() {
            return this.limitValueSet;
        }

    }

    public static class AccountLimitTypeSet extends TeaModel {
        @NameInMap("AccountLimit")
        public java.util.List<AccountLimit> accountLimit;

        public static AccountLimitTypeSet build(java.util.Map<String, ?> map) throws Exception {
            AccountLimitTypeSet self = new AccountLimitTypeSet();
            return TeaModel.build(map, self);
        }

        public AccountLimitTypeSet setAccountLimit(java.util.List<AccountLimit> accountLimit) {
            this.accountLimit = accountLimit;
            return this;
        }
        public java.util.List<AccountLimit> getAccountLimit() {
            return this.accountLimit;
        }

    }

}
