// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeInstanceAutoRenewAttributeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("InstanceRenewAttributes")
    public DescribeInstanceAutoRenewAttributeResponseBodyInstanceRenewAttributes instanceRenewAttributes;

    public static DescribeInstanceAutoRenewAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceAutoRenewAttributeResponseBody self = new DescribeInstanceAutoRenewAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceAutoRenewAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInstanceAutoRenewAttributeResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeInstanceAutoRenewAttributeResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeInstanceAutoRenewAttributeResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeInstanceAutoRenewAttributeResponseBody setInstanceRenewAttributes(DescribeInstanceAutoRenewAttributeResponseBodyInstanceRenewAttributes instanceRenewAttributes) {
        this.instanceRenewAttributes = instanceRenewAttributes;
        return this;
    }
    public DescribeInstanceAutoRenewAttributeResponseBodyInstanceRenewAttributes getInstanceRenewAttributes() {
        return this.instanceRenewAttributes;
    }

    public static class DescribeInstanceAutoRenewAttributeResponseBodyInstanceRenewAttributesInstanceRenewAttribute extends TeaModel {
        @NameInMap("PeriodUnit")
        public String periodUnit;

        @NameInMap("Duration")
        public Integer duration;

        @NameInMap("RenewalStatus")
        public String renewalStatus;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("AutoRenewEnabled")
        public Boolean autoRenewEnabled;

        public static DescribeInstanceAutoRenewAttributeResponseBodyInstanceRenewAttributesInstanceRenewAttribute build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceAutoRenewAttributeResponseBodyInstanceRenewAttributesInstanceRenewAttribute self = new DescribeInstanceAutoRenewAttributeResponseBodyInstanceRenewAttributesInstanceRenewAttribute();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceAutoRenewAttributeResponseBodyInstanceRenewAttributesInstanceRenewAttribute setPeriodUnit(String periodUnit) {
            this.periodUnit = periodUnit;
            return this;
        }
        public String getPeriodUnit() {
            return this.periodUnit;
        }

        public DescribeInstanceAutoRenewAttributeResponseBodyInstanceRenewAttributesInstanceRenewAttribute setDuration(Integer duration) {
            this.duration = duration;
            return this;
        }
        public Integer getDuration() {
            return this.duration;
        }

        public DescribeInstanceAutoRenewAttributeResponseBodyInstanceRenewAttributesInstanceRenewAttribute setRenewalStatus(String renewalStatus) {
            this.renewalStatus = renewalStatus;
            return this;
        }
        public String getRenewalStatus() {
            return this.renewalStatus;
        }

        public DescribeInstanceAutoRenewAttributeResponseBodyInstanceRenewAttributesInstanceRenewAttribute setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeInstanceAutoRenewAttributeResponseBodyInstanceRenewAttributesInstanceRenewAttribute setAutoRenewEnabled(Boolean autoRenewEnabled) {
            this.autoRenewEnabled = autoRenewEnabled;
            return this;
        }
        public Boolean getAutoRenewEnabled() {
            return this.autoRenewEnabled;
        }

    }

    public static class DescribeInstanceAutoRenewAttributeResponseBodyInstanceRenewAttributes extends TeaModel {
        @NameInMap("InstanceRenewAttribute")
        public java.util.List<DescribeInstanceAutoRenewAttributeResponseBodyInstanceRenewAttributesInstanceRenewAttribute> instanceRenewAttribute;

        public static DescribeInstanceAutoRenewAttributeResponseBodyInstanceRenewAttributes build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceAutoRenewAttributeResponseBodyInstanceRenewAttributes self = new DescribeInstanceAutoRenewAttributeResponseBodyInstanceRenewAttributes();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceAutoRenewAttributeResponseBodyInstanceRenewAttributes setInstanceRenewAttribute(java.util.List<DescribeInstanceAutoRenewAttributeResponseBodyInstanceRenewAttributesInstanceRenewAttribute> instanceRenewAttribute) {
            this.instanceRenewAttribute = instanceRenewAttribute;
            return this;
        }
        public java.util.List<DescribeInstanceAutoRenewAttributeResponseBodyInstanceRenewAttributesInstanceRenewAttribute> getInstanceRenewAttribute() {
            return this.instanceRenewAttribute;
        }

    }

}
