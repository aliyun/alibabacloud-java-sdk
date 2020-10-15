// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeInstanceAutoRenewAttributeResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Code")
    @Validation(required = true)
    public Integer code;

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

    public DescribeInstanceAutoRenewAttributeResponse setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
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

        @NameInMap("AutoRenewal")
        @Validation(required = true)
        public Boolean autoRenewal;

        @NameInMap("Duration")
        @Validation(required = true)
        public String duration;

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

        public DescribeInstanceAutoRenewAttributeResponseInstanceRenewAttributesInstanceRenewAttribute setAutoRenewal(Boolean autoRenewal) {
            this.autoRenewal = autoRenewal;
            return this;
        }
        public Boolean getAutoRenewal() {
            return this.autoRenewal;
        }

        public DescribeInstanceAutoRenewAttributeResponseInstanceRenewAttributesInstanceRenewAttribute setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
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
