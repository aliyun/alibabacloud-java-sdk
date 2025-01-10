// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class ListVccGrantRulesResponseBody extends TeaModel {
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
    public ListVccGrantRulesResponseBodyContent content;

    /**
     * <p>The returned message.</p>
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

    public static ListVccGrantRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListVccGrantRulesResponseBody self = new ListVccGrantRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListVccGrantRulesResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListVccGrantRulesResponseBody setContent(ListVccGrantRulesResponseBodyContent content) {
        this.content = content;
        return this;
    }
    public ListVccGrantRulesResponseBodyContent getContent() {
        return this.content;
    }

    public ListVccGrantRulesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListVccGrantRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListVccGrantRulesResponseBodyContentData extends TeaModel {
        /**
         * <p>The time when the data address was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1678273219000</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>Lingjun HUB ID</p>
         * 
         * <strong>example:</strong>
         * <p>er-kkopgtne</p>
         */
        @NameInMap("ErId")
        public String erId;

        /**
         * <p>Cross-account authorization information Instance ID</p>
         * 
         * <strong>example:</strong>
         * <p>grant-rule-jpumgwvp</p>
         */
        @NameInMap("GrantRuleId")
        public String grantRuleId;

        /**
         * <p>Authorized Tenant ID</p>
         * 
         * <strong>example:</strong>
         * <p>1013666993027780</p>
         */
        @NameInMap("GrantTenantId")
        public String grantTenantId;

        /**
         * <p>Network Instance ID</p>
         * 
         * <strong>example:</strong>
         * <p>vcc-cn-jaj33d1kb05</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The name of the ECU.</p>
         * 
         * <strong>example:</strong>
         * <p>vcc-1</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The type of the authorized product. Valid values:</p>
         * <ul>
         * <li><strong>VPD</strong>: indicates a VPD instance of the Lingjun network segment.</li>
         * <li><strong>VCC</strong>: indicates that Lingjun connects to the VCC instance.</li>
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
         * <p>1655449505171</p>
         */
        @NameInMap("TenantId")
        public String tenantId;

        /**
         * <p>Whether the current cross-account resource has been bound to the cross-account Lingjun HUB. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Used</li>
         * <li><strong>false</strong>: Not used</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Used")
        public Boolean used;

        public static ListVccGrantRulesResponseBodyContentData build(java.util.Map<String, ?> map) throws Exception {
            ListVccGrantRulesResponseBodyContentData self = new ListVccGrantRulesResponseBodyContentData();
            return TeaModel.build(map, self);
        }

        public ListVccGrantRulesResponseBodyContentData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListVccGrantRulesResponseBodyContentData setErId(String erId) {
            this.erId = erId;
            return this;
        }
        public String getErId() {
            return this.erId;
        }

        public ListVccGrantRulesResponseBodyContentData setGrantRuleId(String grantRuleId) {
            this.grantRuleId = grantRuleId;
            return this;
        }
        public String getGrantRuleId() {
            return this.grantRuleId;
        }

        public ListVccGrantRulesResponseBodyContentData setGrantTenantId(String grantTenantId) {
            this.grantTenantId = grantTenantId;
            return this;
        }
        public String getGrantTenantId() {
            return this.grantTenantId;
        }

        public ListVccGrantRulesResponseBodyContentData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListVccGrantRulesResponseBodyContentData setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public ListVccGrantRulesResponseBodyContentData setProduct(String product) {
            this.product = product;
            return this;
        }
        public String getProduct() {
            return this.product;
        }

        public ListVccGrantRulesResponseBodyContentData setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListVccGrantRulesResponseBodyContentData setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public ListVccGrantRulesResponseBodyContentData setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public ListVccGrantRulesResponseBodyContentData setUsed(Boolean used) {
            this.used = used;
            return this;
        }
        public Boolean getUsed() {
            return this.used;
        }

    }

    public static class ListVccGrantRulesResponseBodyContent extends TeaModel {
        /**
         * <p>List of cross-account authorization information of Lingjun connection</p>
         */
        @NameInMap("Data")
        public java.util.List<ListVccGrantRulesResponseBodyContentData> data;

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Total")
        public Long total;

        public static ListVccGrantRulesResponseBodyContent build(java.util.Map<String, ?> map) throws Exception {
            ListVccGrantRulesResponseBodyContent self = new ListVccGrantRulesResponseBodyContent();
            return TeaModel.build(map, self);
        }

        public ListVccGrantRulesResponseBodyContent setData(java.util.List<ListVccGrantRulesResponseBodyContentData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<ListVccGrantRulesResponseBodyContentData> getData() {
            return this.data;
        }

        public ListVccGrantRulesResponseBodyContent setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
