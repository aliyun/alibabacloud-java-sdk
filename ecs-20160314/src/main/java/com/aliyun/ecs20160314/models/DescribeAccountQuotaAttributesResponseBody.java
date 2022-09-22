// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class DescribeAccountQuotaAttributesResponseBody extends TeaModel {
    @NameInMap("QuotaAttributes")
    public QuotaAttributes quotaAttributes;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeAccountQuotaAttributesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAccountQuotaAttributesResponseBody self = new DescribeAccountQuotaAttributesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAccountQuotaAttributesResponseBody setQuotaAttributes(QuotaAttributes quotaAttributes) {
        this.quotaAttributes = quotaAttributes;
        return this;
    }
    public QuotaAttributes getQuotaAttributes() {
        return this.quotaAttributes;
    }

    public DescribeAccountQuotaAttributesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QuotaAttributes extends TeaModel {
        @NameInMap("EcsElasticQuotaEnable")
        public Boolean ecsElasticQuotaEnable;

        public static QuotaAttributes build(java.util.Map<String, ?> map) throws Exception {
            QuotaAttributes self = new QuotaAttributes();
            return TeaModel.build(map, self);
        }

        public QuotaAttributes setEcsElasticQuotaEnable(Boolean ecsElasticQuotaEnable) {
            this.ecsElasticQuotaEnable = ecsElasticQuotaEnable;
            return this;
        }
        public Boolean getEcsElasticQuotaEnable() {
            return this.ecsElasticQuotaEnable;
        }

    }

}
