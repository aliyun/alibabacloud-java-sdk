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

    }

    public static class DescribeInstanceAutoRenewAttributeResponseInstanceRenewAttributes extends TeaModel {
        @NameInMap("InstanceRenewAttribute")
        @Validation(required = true)
        public java.util.List<DescribeInstanceAutoRenewAttributeResponseInstanceRenewAttributesInstanceRenewAttribute> instanceRenewAttribute;

        public static DescribeInstanceAutoRenewAttributeResponseInstanceRenewAttributes build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceAutoRenewAttributeResponseInstanceRenewAttributes self = new DescribeInstanceAutoRenewAttributeResponseInstanceRenewAttributes();
            return TeaModel.build(map, self);
        }

    }

}
