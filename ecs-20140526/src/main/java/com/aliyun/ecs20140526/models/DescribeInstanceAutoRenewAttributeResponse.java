// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeInstanceAutoRenewAttributeResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Integer totalCount;

    @NameInMap("InstanceRenewAttributes")
    @Validation(required = true)
    public DescribeInstanceAutoRenewAttributeResponseInstanceRenewAttributes instanceRenewAttributes;

    public static DescribeInstanceAutoRenewAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceAutoRenewAttributeResponse self = new DescribeInstanceAutoRenewAttributeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceAutoRenewAttributeResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInstanceAutoRenewAttributeResponse setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeInstanceAutoRenewAttributeResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeInstanceAutoRenewAttributeResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeInstanceAutoRenewAttributeResponse setInstanceRenewAttributes(DescribeInstanceAutoRenewAttributeResponseInstanceRenewAttributes instanceRenewAttributes) {
        this.instanceRenewAttributes = instanceRenewAttributes;
        return this;
    }
    public DescribeInstanceAutoRenewAttributeResponseInstanceRenewAttributes getInstanceRenewAttributes() {
        return this.instanceRenewAttributes;
    }

    public static class DescribeInstanceAutoRenewAttributeResponseInstanceRenewAttributesInstanceRenewAttribute extends TeaModel {
        @NameInMap("InstanceId")
        @Validation(required = true)
        public String instanceId;

        @NameInMap("AutoRenewEnabled")
        @Validation(required = true)
        public Boolean autoRenewEnabled;

        @NameInMap("Duration")
        @Validation(required = true)
        public Integer duration;

        @NameInMap("PeriodUnit")
        @Validation(required = true)
        public String periodUnit;

        @NameInMap("RenewalStatus")
        @Validation(required = true)
        public String renewalStatus;

        public static DescribeInstanceAutoRenewAttributeResponseInstanceRenewAttributesInstanceRenewAttribute build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceAutoRenewAttributeResponseInstanceRenewAttributesInstanceRenewAttribute self = new DescribeInstanceAutoRenewAttributeResponseInstanceRenewAttributesInstanceRenewAttribute();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceAutoRenewAttributeResponseInstanceRenewAttributesInstanceRenewAttribute setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeInstanceAutoRenewAttributeResponseInstanceRenewAttributesInstanceRenewAttribute setAutoRenewEnabled(Boolean autoRenewEnabled) {
            this.autoRenewEnabled = autoRenewEnabled;
            return this;
        }
        public Boolean getAutoRenewEnabled() {
            return this.autoRenewEnabled;
        }

        public DescribeInstanceAutoRenewAttributeResponseInstanceRenewAttributesInstanceRenewAttribute setDuration(Integer duration) {
            this.duration = duration;
            return this;
        }
        public Integer getDuration() {
            return this.duration;
        }

        public DescribeInstanceAutoRenewAttributeResponseInstanceRenewAttributesInstanceRenewAttribute setPeriodUnit(String periodUnit) {
            this.periodUnit = periodUnit;
            return this;
        }
        public String getPeriodUnit() {
            return this.periodUnit;
        }

        public DescribeInstanceAutoRenewAttributeResponseInstanceRenewAttributesInstanceRenewAttribute setRenewalStatus(String renewalStatus) {
            this.renewalStatus = renewalStatus;
            return this;
        }
        public String getRenewalStatus() {
            return this.renewalStatus;
        }

    }

    public static class DescribeInstanceAutoRenewAttributeResponseInstanceRenewAttributes extends TeaModel {
        @NameInMap("InstanceRenewAttribute")
        @Validation(required = true)
        public java.util.List<DescribeInstanceAutoRenewAttributeResponseInstanceRenewAttributesInstanceRenewAttribute> instanceRenewAttribute;

        public static DescribeInstanceAutoRenewAttributeResponseInstanceRenewAttributes build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceAutoRenewAttributeResponseInstanceRenewAttributes self = new DescribeInstanceAutoRenewAttributeResponseInstanceRenewAttributes();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceAutoRenewAttributeResponseInstanceRenewAttributes setInstanceRenewAttribute(java.util.List<DescribeInstanceAutoRenewAttributeResponseInstanceRenewAttributesInstanceRenewAttribute> instanceRenewAttribute) {
            this.instanceRenewAttribute = instanceRenewAttribute;
            return this;
        }
        public java.util.List<DescribeInstanceAutoRenewAttributeResponseInstanceRenewAttributesInstanceRenewAttribute> getInstanceRenewAttribute() {
            return this.instanceRenewAttribute;
        }

    }

}
