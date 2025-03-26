// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class ListVpdGrantRulesResponseBody extends TeaModel {
    /**
     * <p>The details about the access denial.</p>
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>The HTTP status code.</p>
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
    public ListVpdGrantRulesResponseBodyContent content;

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
     * <p>A56F7D3C-8850-5AF4-A342-2D71C9A9D1CC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListVpdGrantRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListVpdGrantRulesResponseBody self = new ListVpdGrantRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListVpdGrantRulesResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public ListVpdGrantRulesResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListVpdGrantRulesResponseBody setContent(ListVpdGrantRulesResponseBodyContent content) {
        this.content = content;
        return this;
    }
    public ListVpdGrantRulesResponseBodyContent getContent() {
        return this.content;
    }

    public ListVpdGrantRulesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListVpdGrantRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListVpdGrantRulesResponseBodyContentData extends TeaModel {
        /**
         * <p>The time when the data address was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1643013506000</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The current network sample is authorized to the specified Lingjun HUB sample ID.</p>
         * 
         * <strong>example:</strong>
         * <p>er-kkopgtne</p>
         */
        @NameInMap("ErId")
        public String erId;

        /**
         * <p>Authorization Entry ID</p>
         * 
         * <strong>example:</strong>
         * <p>grant-rule-8rgvqazb</p>
         */
        @NameInMap("GrantRuleId")
        public String grantRuleId;

        /**
         * <p>The ID of the tenant to which the current instance is authorized.</p>
         * 
         * <strong>example:</strong>
         * <p>1672372231790</p>
         */
        @NameInMap("GrantTenantId")
        public String grantTenantId;

        /**
         * <p>Lingjun CIDR block instance ID</p>
         * 
         * <strong>example:</strong>
         * <p>vpd-8rgvqazb</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The name of the ECU.</p>
         * 
         * <strong>example:</strong>
         * <p>vpd-1</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The type of the authorized product. Valid values:</p>
         * <ul>
         * <li><strong>VPD</strong>: indicates a VPD instance of the Lingjun network segment.</li>
         * <li><strong>VCC</strong>: indicates that Lingjun connects to the VCC instance.</li>
         * </ul>
         * <p>The caller does not need to specify.</p>
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
         * <p>rg-aek2l4sq6l7unhi</p>
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
         * <p>Whether the current authorized instance has been bound</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Used")
        public Boolean used;

        public static ListVpdGrantRulesResponseBodyContentData build(java.util.Map<String, ?> map) throws Exception {
            ListVpdGrantRulesResponseBodyContentData self = new ListVpdGrantRulesResponseBodyContentData();
            return TeaModel.build(map, self);
        }

        public ListVpdGrantRulesResponseBodyContentData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListVpdGrantRulesResponseBodyContentData setErId(String erId) {
            this.erId = erId;
            return this;
        }
        public String getErId() {
            return this.erId;
        }

        public ListVpdGrantRulesResponseBodyContentData setGrantRuleId(String grantRuleId) {
            this.grantRuleId = grantRuleId;
            return this;
        }
        public String getGrantRuleId() {
            return this.grantRuleId;
        }

        public ListVpdGrantRulesResponseBodyContentData setGrantTenantId(String grantTenantId) {
            this.grantTenantId = grantTenantId;
            return this;
        }
        public String getGrantTenantId() {
            return this.grantTenantId;
        }

        public ListVpdGrantRulesResponseBodyContentData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListVpdGrantRulesResponseBodyContentData setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public ListVpdGrantRulesResponseBodyContentData setProduct(String product) {
            this.product = product;
            return this;
        }
        public String getProduct() {
            return this.product;
        }

        public ListVpdGrantRulesResponseBodyContentData setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListVpdGrantRulesResponseBodyContentData setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public ListVpdGrantRulesResponseBodyContentData setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public ListVpdGrantRulesResponseBodyContentData setUsed(Boolean used) {
            this.used = used;
            return this;
        }
        public Boolean getUsed() {
            return this.used;
        }

    }

    public static class ListVpdGrantRulesResponseBodyContent extends TeaModel {
        /**
         * <p>Lingjun CIDR block authorization information list</p>
         */
        @NameInMap("Data")
        public java.util.List<ListVpdGrantRulesResponseBodyContentData> data;

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Total")
        public Long total;

        public static ListVpdGrantRulesResponseBodyContent build(java.util.Map<String, ?> map) throws Exception {
            ListVpdGrantRulesResponseBodyContent self = new ListVpdGrantRulesResponseBodyContent();
            return TeaModel.build(map, self);
        }

        public ListVpdGrantRulesResponseBodyContent setData(java.util.List<ListVpdGrantRulesResponseBodyContentData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<ListVpdGrantRulesResponseBodyContentData> getData() {
            return this.data;
        }

        public ListVpdGrantRulesResponseBodyContent setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
