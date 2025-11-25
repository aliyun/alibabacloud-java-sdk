// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribePostpayEnabledProtectionResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>6</p>
     */
    @NameInMap("DisabledDays")
    public Long disabledDays;

    /**
     * <strong>example:</strong>
     * <p>nat</p>
     */
    @NameInMap("DisabledType")
    public String disabledType;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IsEnabledProtection")
    public Boolean isEnabledProtection;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IsOpenButDisabled")
    public Boolean isOpenButDisabled;

    /**
     * <strong>example:</strong>
     * <p>95CA5E2B-E5FB-5838-BC50-6A2C763C****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribePostpayEnabledProtectionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePostpayEnabledProtectionResponseBody self = new DescribePostpayEnabledProtectionResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePostpayEnabledProtectionResponseBody setDisabledDays(Long disabledDays) {
        this.disabledDays = disabledDays;
        return this;
    }
    public Long getDisabledDays() {
        return this.disabledDays;
    }

    public DescribePostpayEnabledProtectionResponseBody setDisabledType(String disabledType) {
        this.disabledType = disabledType;
        return this;
    }
    public String getDisabledType() {
        return this.disabledType;
    }

    public DescribePostpayEnabledProtectionResponseBody setIsEnabledProtection(Boolean isEnabledProtection) {
        this.isEnabledProtection = isEnabledProtection;
        return this;
    }
    public Boolean getIsEnabledProtection() {
        return this.isEnabledProtection;
    }

    public DescribePostpayEnabledProtectionResponseBody setIsOpenButDisabled(Boolean isOpenButDisabled) {
        this.isOpenButDisabled = isOpenButDisabled;
        return this;
    }
    public Boolean getIsOpenButDisabled() {
        return this.isOpenButDisabled;
    }

    public DescribePostpayEnabledProtectionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
