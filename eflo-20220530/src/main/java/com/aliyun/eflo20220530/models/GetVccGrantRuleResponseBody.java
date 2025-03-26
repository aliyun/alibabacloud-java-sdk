// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class GetVccGrantRuleResponseBody extends TeaModel {
    /**
     * <p>The details about the access denial.</p>
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>The response status code.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Content")
    public GetVccGrantRuleResponseBodyContent content;

    /**
     * <p>The error message. (If the instance is in the Exception state, the exception cause is prompted.)</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Request ID of the current request</p>
     * 
     * <strong>example:</strong>
     * <p>0901F411-28FA-5B9C-BAEE-7776463FF0DC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetVccGrantRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetVccGrantRuleResponseBody self = new GetVccGrantRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public GetVccGrantRuleResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
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
        /**
         * <p>The time when the data address was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1648085472000</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>Lingjun HUB Instance ID</p>
         * 
         * <strong>example:</strong>
         * <p>er-aueyxxsy</p>
         */
        @NameInMap("ErId")
        public String erId;

        /**
         * <p>Authorized Resource ID</p>
         * 
         * <strong>example:</strong>
         * <p>grant-rule-jaj34d75h01</p>
         */
        @NameInMap("GrantRuleId")
        public String grantRuleId;

        /**
         * <p>Authorized Tenant ID</p>
         * 
         * <strong>example:</strong>
         * <p>1620939556166277</p>
         */
        @NameInMap("GrantTenantId")
        public String grantTenantId;

        /**
         * <p>Network Instance ID</p>
         * 
         * <strong>example:</strong>
         * <p>vcc-cn-jaj34d75h01</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>Network Instance Name</p>
         * 
         * <strong>example:</strong>
         * <p>vcc-1</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>Network Product Code:</p>
         * <ul>
         * <li><strong>VPD</strong>: Lingjun CIDR block</li>
         * <li><strong>VCC</strong>: Lingjun Connection</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>VCC</p>
         */
        @NameInMap("Product")
        public String product;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-wulanchabu</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>Resource group instance ID</p>
         * 
         * <strong>example:</strong>
         * <p>rg-aek2l4sq6l7unhi</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The ID of the tenant.</p>
         * 
         * <strong>example:</strong>
         * <p>1620939556166279</p>
         */
        @NameInMap("TenantId")
        public String tenantId;

        /**
         * <p>Whether the current authorization information has been used; optional values:</p>
         * <ul>
         * <li><strong>true</strong>: Used</li>
         * <li><strong>false</strong>: Not used</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
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

        public GetVccGrantRuleResponseBodyContent setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
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
