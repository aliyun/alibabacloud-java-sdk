// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class ListVccGrantRulesResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Content")
    public ListVccGrantRulesResponseBodyContent content;

    @NameInMap("Message")
    public String message;

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
        @NameInMap("Data")
        public java.util.List<ListVccGrantRulesResponseBodyContentData> data;

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
