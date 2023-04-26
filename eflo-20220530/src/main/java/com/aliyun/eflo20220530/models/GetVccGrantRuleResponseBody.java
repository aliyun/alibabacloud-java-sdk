// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class GetVccGrantRuleResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Content")
    public GetVccGrantRuleResponseBodyContent content;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static GetVccGrantRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetVccGrantRuleResponseBody self = new GetVccGrantRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public GetVccGrantRuleResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetVccGrantRuleResponseBody setContent(GetVccGrantRuleResponseBodyContent content) {
        this.content = content;
        return this;
    }
    public GetVccGrantRuleResponseBodyContent getContent() {
        return this.content;
    }

    public GetVccGrantRuleResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetVccGrantRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetVccGrantRuleResponseBodyContent extends TeaModel {
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("ErId")
        public String erId;

        @NameInMap("GrantRuleId")
        public String grantRuleId;

        @NameInMap("GrantTenantId")
        public String grantTenantId;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("Product")
        public String product;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("TenantId")
        public String tenantId;

        @NameInMap("Used")
        public Boolean used;

        public static GetVccGrantRuleResponseBodyContent build(java.util.Map<String, ?> map) throws Exception {
            GetVccGrantRuleResponseBodyContent self = new GetVccGrantRuleResponseBodyContent();
            return TeaModel.build(map, self);
        }

        public GetVccGrantRuleResponseBodyContent setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetVccGrantRuleResponseBodyContent setErId(String erId) {
            this.erId = erId;
            return this;
        }
        public String getErId() {
            return this.erId;
        }

        public GetVccGrantRuleResponseBodyContent setGrantRuleId(String grantRuleId) {
            this.grantRuleId = grantRuleId;
            return this;
        }
        public String getGrantRuleId() {
            return this.grantRuleId;
        }

        public GetVccGrantRuleResponseBodyContent setGrantTenantId(String grantTenantId) {
            this.grantTenantId = grantTenantId;
            return this;
        }
        public String getGrantTenantId() {
            return this.grantTenantId;
        }

        public GetVccGrantRuleResponseBodyContent setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetVccGrantRuleResponseBodyContent setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public GetVccGrantRuleResponseBodyContent setProduct(String product) {
            this.product = product;
            return this;
        }
        public String getProduct() {
            return this.product;
        }

        public GetVccGrantRuleResponseBodyContent setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetVccGrantRuleResponseBodyContent setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public GetVccGrantRuleResponseBodyContent setUsed(Boolean used) {
            this.used = used;
            return this;
        }
        public Boolean getUsed() {
            return this.used;
        }

    }

}
