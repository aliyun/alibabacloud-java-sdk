// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class ListVpdGrantRulesResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Content")
    public ListVpdGrantRulesResponseBodyContent content;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static ListVpdGrantRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListVpdGrantRulesResponseBody self = new ListVpdGrantRulesResponseBody();
        return TeaModel.build(map, self);
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
        @NameInMap("Data")
        public java.util.List<ListVpdGrantRulesResponseBodyContentData> data;

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
