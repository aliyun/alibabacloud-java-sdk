// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class GetVpdGrantRuleResponseBody extends TeaModel {
    /**
     * <p>The response status code.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The response parameters.</p>
     */
    @NameInMap("Content")
    public GetVpdGrantRuleResponseBodyContent content;

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
     * <p>9C50C9CD-E799-54DA-BA7A-1FAF3DF80857</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetVpdGrantRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetVpdGrantRuleResponseBody self = new GetVpdGrantRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public GetVpdGrantRuleResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetVpdGrantRuleResponseBody setContent(GetVpdGrantRuleResponseBodyContent content) {
        this.content = content;
        return this;
    }
    public GetVpdGrantRuleResponseBodyContent getContent() {
        return this.content;
    }

    public GetVpdGrantRuleResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetVpdGrantRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetVpdGrantRuleResponseBodyContent extends TeaModel {
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
         * <p>er-kkopgtne</p>
         */
        @NameInMap("ErId")
        public String erId;

        /**
         * <p>Authorized Resource ID</p>
         * 
         * <strong>example:</strong>
         * <p>grant-rule-xxxxxx</p>
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
         * <p>vpd-xxxxxxxxxx</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>Network Instance Name</p>
         * 
         * <strong>example:</strong>
         * <p>vpd-lingjun</p>
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
         * <p>VPD</p>
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
         * <p>rg-aek2l4sq6l7u***</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The ID of the tenant.</p>
         * 
         * <strong>example:</strong>
         * <p>1655449505171</p>
         */
        @NameInMap("TenantId")
        public String tenantId;

        /**
         * <p>Whether the current authorization information has been used; default is false</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Used")
        public Boolean used;

        public static GetVpdGrantRuleResponseBodyContent build(java.util.Map<String, ?> map) throws Exception {
            GetVpdGrantRuleResponseBodyContent self = new GetVpdGrantRuleResponseBodyContent();
            return TeaModel.build(map, self);
        }

        public GetVpdGrantRuleResponseBodyContent setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetVpdGrantRuleResponseBodyContent setErId(String erId) {
            this.erId = erId;
            return this;
        }
        public String getErId() {
            return this.erId;
        }

        public GetVpdGrantRuleResponseBodyContent setGrantRuleId(String grantRuleId) {
            this.grantRuleId = grantRuleId;
            return this;
        }
        public String getGrantRuleId() {
            return this.grantRuleId;
        }

        public GetVpdGrantRuleResponseBodyContent setGrantTenantId(String grantTenantId) {
            this.grantTenantId = grantTenantId;
            return this;
        }
        public String getGrantTenantId() {
            return this.grantTenantId;
        }

        public GetVpdGrantRuleResponseBodyContent setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetVpdGrantRuleResponseBodyContent setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public GetVpdGrantRuleResponseBodyContent setProduct(String product) {
            this.product = product;
            return this;
        }
        public String getProduct() {
            return this.product;
        }

        public GetVpdGrantRuleResponseBodyContent setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetVpdGrantRuleResponseBodyContent setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public GetVpdGrantRuleResponseBodyContent setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public GetVpdGrantRuleResponseBodyContent setUsed(Boolean used) {
            this.used = used;
            return this;
        }
        public Boolean getUsed() {
            return this.used;
        }

    }

}
