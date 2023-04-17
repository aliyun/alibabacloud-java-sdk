// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeReservedInstanceAutoRenewAttributeResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Details about the auto-renewal settings of the reserved instances.</p>
     */
    @NameInMap("ReservedInstanceRenewAttributes")
    public DescribeReservedInstanceAutoRenewAttributeResponseBodyReservedInstanceRenewAttributes reservedInstanceRenewAttributes;

    public static DescribeReservedInstanceAutoRenewAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeReservedInstanceAutoRenewAttributeResponseBody self = new DescribeReservedInstanceAutoRenewAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeReservedInstanceAutoRenewAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeReservedInstanceAutoRenewAttributeResponseBody setReservedInstanceRenewAttributes(DescribeReservedInstanceAutoRenewAttributeResponseBodyReservedInstanceRenewAttributes reservedInstanceRenewAttributes) {
        this.reservedInstanceRenewAttributes = reservedInstanceRenewAttributes;
        return this;
    }
    public DescribeReservedInstanceAutoRenewAttributeResponseBodyReservedInstanceRenewAttributes getReservedInstanceRenewAttributes() {
        return this.reservedInstanceRenewAttributes;
    }

    public static class DescribeReservedInstanceAutoRenewAttributeResponseBodyReservedInstanceRenewAttributesReservedInstanceRenewAttribute extends TeaModel {
        /**
         * <p>The auto-renewal duration.</p>
         */
        @NameInMap("Duration")
        public Integer duration;

        /**
         * <p>The unit of the auto-renewal duration.</p>
         * <br>
         * <p>Valid value: Year.</p>
         */
        @NameInMap("PeriodUnit")
        public String periodUnit;

        /**
         * <p>The auto-renewal state of the reserved instance. Valid values:</p>
         * <br>
         * <p>*   AutoRenewal: The reserved instance is automatically renewed.</p>
         * <p>*   Normal: You must manually renew the reserved instance.</p>
         */
        @NameInMap("RenewalStatus")
        public String renewalStatus;

        /**
         * <p>The ID of the reserved instance.</p>
         */
        @NameInMap("ReservedInstanceId")
        public String reservedInstanceId;

        public static DescribeReservedInstanceAutoRenewAttributeResponseBodyReservedInstanceRenewAttributesReservedInstanceRenewAttribute build(java.util.Map<String, ?> map) throws Exception {
            DescribeReservedInstanceAutoRenewAttributeResponseBodyReservedInstanceRenewAttributesReservedInstanceRenewAttribute self = new DescribeReservedInstanceAutoRenewAttributeResponseBodyReservedInstanceRenewAttributesReservedInstanceRenewAttribute();
            return TeaModel.build(map, self);
        }

        public DescribeReservedInstanceAutoRenewAttributeResponseBodyReservedInstanceRenewAttributesReservedInstanceRenewAttribute setDuration(Integer duration) {
            this.duration = duration;
            return this;
        }
        public Integer getDuration() {
            return this.duration;
        }

        public DescribeReservedInstanceAutoRenewAttributeResponseBodyReservedInstanceRenewAttributesReservedInstanceRenewAttribute setPeriodUnit(String periodUnit) {
            this.periodUnit = periodUnit;
            return this;
        }
        public String getPeriodUnit() {
            return this.periodUnit;
        }

        public DescribeReservedInstanceAutoRenewAttributeResponseBodyReservedInstanceRenewAttributesReservedInstanceRenewAttribute setRenewalStatus(String renewalStatus) {
            this.renewalStatus = renewalStatus;
            return this;
        }
        public String getRenewalStatus() {
            return this.renewalStatus;
        }

        public DescribeReservedInstanceAutoRenewAttributeResponseBodyReservedInstanceRenewAttributesReservedInstanceRenewAttribute setReservedInstanceId(String reservedInstanceId) {
            this.reservedInstanceId = reservedInstanceId;
            return this;
        }
        public String getReservedInstanceId() {
            return this.reservedInstanceId;
        }

    }

    public static class DescribeReservedInstanceAutoRenewAttributeResponseBodyReservedInstanceRenewAttributes extends TeaModel {
        @NameInMap("ReservedInstanceRenewAttribute")
        public java.util.List<DescribeReservedInstanceAutoRenewAttributeResponseBodyReservedInstanceRenewAttributesReservedInstanceRenewAttribute> reservedInstanceRenewAttribute;

        public static DescribeReservedInstanceAutoRenewAttributeResponseBodyReservedInstanceRenewAttributes build(java.util.Map<String, ?> map) throws Exception {
            DescribeReservedInstanceAutoRenewAttributeResponseBodyReservedInstanceRenewAttributes self = new DescribeReservedInstanceAutoRenewAttributeResponseBodyReservedInstanceRenewAttributes();
            return TeaModel.build(map, self);
        }

        public DescribeReservedInstanceAutoRenewAttributeResponseBodyReservedInstanceRenewAttributes setReservedInstanceRenewAttribute(java.util.List<DescribeReservedInstanceAutoRenewAttributeResponseBodyReservedInstanceRenewAttributesReservedInstanceRenewAttribute> reservedInstanceRenewAttribute) {
            this.reservedInstanceRenewAttribute = reservedInstanceRenewAttribute;
            return this;
        }
        public java.util.List<DescribeReservedInstanceAutoRenewAttributeResponseBodyReservedInstanceRenewAttributesReservedInstanceRenewAttribute> getReservedInstanceRenewAttribute() {
            return this.reservedInstanceRenewAttribute;
        }

    }

}
