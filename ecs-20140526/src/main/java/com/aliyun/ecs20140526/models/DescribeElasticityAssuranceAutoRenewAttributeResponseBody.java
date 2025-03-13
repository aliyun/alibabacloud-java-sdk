// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeElasticityAssuranceAutoRenewAttributeResponseBody extends TeaModel {
    /**
     * <p>The auto-renewal attribute of the elasticity assurances.</p>
     */
    @NameInMap("ElasticityAssuranceRenewAttributes")
    public DescribeElasticityAssuranceAutoRenewAttributeResponseBodyElasticityAssuranceRenewAttributes elasticityAssuranceRenewAttributes;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeElasticityAssuranceAutoRenewAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeElasticityAssuranceAutoRenewAttributeResponseBody self = new DescribeElasticityAssuranceAutoRenewAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeElasticityAssuranceAutoRenewAttributeResponseBody setElasticityAssuranceRenewAttributes(DescribeElasticityAssuranceAutoRenewAttributeResponseBodyElasticityAssuranceRenewAttributes elasticityAssuranceRenewAttributes) {
        this.elasticityAssuranceRenewAttributes = elasticityAssuranceRenewAttributes;
        return this;
    }
    public DescribeElasticityAssuranceAutoRenewAttributeResponseBodyElasticityAssuranceRenewAttributes getElasticityAssuranceRenewAttributes() {
        return this.elasticityAssuranceRenewAttributes;
    }

    public DescribeElasticityAssuranceAutoRenewAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeElasticityAssuranceAutoRenewAttributeResponseBodyElasticityAssuranceRenewAttributesElasticityAssuranceRenewAttribute extends TeaModel {
        /**
         * <p>The auto-renewal period. Valid values: Valid values: 1, 2, 3, 6, 12, 24, and 36.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Period")
        public Integer period;

        /**
         * <p>The unit of the auto-renewal period. Valid values:</p>
         * <ul>
         * <li>Month (default)</li>
         * <li>Year</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Month</p>
         */
        @NameInMap("PeriodUnit")
        public String periodUnit;

        /**
         * <p>The ID of the elasticity assurance.</p>
         * 
         * <strong>example:</strong>
         * <p>eap-bp67acfmxazb4****</p>
         */
        @NameInMap("PrivatePoolOptionsId")
        public String privatePoolOptionsId;

        /**
         * <p>Indicates whether auto-renewal is enabled for the elasticity assurance. Valid values:</p>
         * <ul>
         * <li>AutoRenewal: Auto-renewal is enabled for the elasticity assurance.</li>
         * <li>Normal: Auto-renewal is disabled for the elasticity assurance.</li>
         * <li>NotRenewal: The elasticity assurance is not renewed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("RenewalStatus")
        public String renewalStatus;

        public static DescribeElasticityAssuranceAutoRenewAttributeResponseBodyElasticityAssuranceRenewAttributesElasticityAssuranceRenewAttribute build(java.util.Map<String, ?> map) throws Exception {
            DescribeElasticityAssuranceAutoRenewAttributeResponseBodyElasticityAssuranceRenewAttributesElasticityAssuranceRenewAttribute self = new DescribeElasticityAssuranceAutoRenewAttributeResponseBodyElasticityAssuranceRenewAttributesElasticityAssuranceRenewAttribute();
            return TeaModel.build(map, self);
        }

        public DescribeElasticityAssuranceAutoRenewAttributeResponseBodyElasticityAssuranceRenewAttributesElasticityAssuranceRenewAttribute setPeriod(Integer period) {
            this.period = period;
            return this;
        }
        public Integer getPeriod() {
            return this.period;
        }

        public DescribeElasticityAssuranceAutoRenewAttributeResponseBodyElasticityAssuranceRenewAttributesElasticityAssuranceRenewAttribute setPeriodUnit(String periodUnit) {
            this.periodUnit = periodUnit;
            return this;
        }
        public String getPeriodUnit() {
            return this.periodUnit;
        }

        public DescribeElasticityAssuranceAutoRenewAttributeResponseBodyElasticityAssuranceRenewAttributesElasticityAssuranceRenewAttribute setPrivatePoolOptionsId(String privatePoolOptionsId) {
            this.privatePoolOptionsId = privatePoolOptionsId;
            return this;
        }
        public String getPrivatePoolOptionsId() {
            return this.privatePoolOptionsId;
        }

        public DescribeElasticityAssuranceAutoRenewAttributeResponseBodyElasticityAssuranceRenewAttributesElasticityAssuranceRenewAttribute setRenewalStatus(String renewalStatus) {
            this.renewalStatus = renewalStatus;
            return this;
        }
        public String getRenewalStatus() {
            return this.renewalStatus;
        }

    }

    public static class DescribeElasticityAssuranceAutoRenewAttributeResponseBodyElasticityAssuranceRenewAttributes extends TeaModel {
        @NameInMap("ElasticityAssuranceRenewAttribute")
        public java.util.List<DescribeElasticityAssuranceAutoRenewAttributeResponseBodyElasticityAssuranceRenewAttributesElasticityAssuranceRenewAttribute> elasticityAssuranceRenewAttribute;

        public static DescribeElasticityAssuranceAutoRenewAttributeResponseBodyElasticityAssuranceRenewAttributes build(java.util.Map<String, ?> map) throws Exception {
            DescribeElasticityAssuranceAutoRenewAttributeResponseBodyElasticityAssuranceRenewAttributes self = new DescribeElasticityAssuranceAutoRenewAttributeResponseBodyElasticityAssuranceRenewAttributes();
            return TeaModel.build(map, self);
        }

        public DescribeElasticityAssuranceAutoRenewAttributeResponseBodyElasticityAssuranceRenewAttributes setElasticityAssuranceRenewAttribute(java.util.List<DescribeElasticityAssuranceAutoRenewAttributeResponseBodyElasticityAssuranceRenewAttributesElasticityAssuranceRenewAttribute> elasticityAssuranceRenewAttribute) {
            this.elasticityAssuranceRenewAttribute = elasticityAssuranceRenewAttribute;
            return this;
        }
        public java.util.List<DescribeElasticityAssuranceAutoRenewAttributeResponseBodyElasticityAssuranceRenewAttributesElasticityAssuranceRenewAttribute> getElasticityAssuranceRenewAttribute() {
            return this.elasticityAssuranceRenewAttribute;
        }

    }

}
