// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class ListQuotasResponseBody extends TeaModel {
    @NameInMap("Quotas")
    public java.util.List<ListQuotasResponseBodyQuotas> quotas;

    /**
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListQuotasResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListQuotasResponseBody self = new ListQuotasResponseBody();
        return TeaModel.build(map, self);
    }

    public ListQuotasResponseBody setQuotas(java.util.List<ListQuotasResponseBodyQuotas> quotas) {
        this.quotas = quotas;
        return this;
    }
    public java.util.List<ListQuotasResponseBodyQuotas> getQuotas() {
        return this.quotas;
    }

    public ListQuotasResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListQuotasResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListQuotasResponseBodyQuotasSpecs extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>cu</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>string</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <strong>example:</strong>
         * <p>11500</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListQuotasResponseBodyQuotasSpecs build(java.util.Map<String, ?> map) throws Exception {
            ListQuotasResponseBodyQuotasSpecs self = new ListQuotasResponseBodyQuotasSpecs();
            return TeaModel.build(map, self);
        }

        public ListQuotasResponseBodyQuotasSpecs setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListQuotasResponseBodyQuotasSpecs setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListQuotasResponseBodyQuotasSpecs setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListQuotasResponseBodyQuotas extends TeaModel {
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <strong>example:</strong>
         * <p>1828233</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>isolate</p>
         */
        @NameInMap("Mode")
        public String mode;

        /**
         * <strong>example:</strong>
         * <p>quota-name</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>MaxCompute_share</p>
         */
        @NameInMap("ProductCode")
        public String productCode;

        /**
         * <strong>example:</strong>
         * <p>MaxCompute</p>
         */
        @NameInMap("QuotaType")
        public String quotaType;

        /**
         * <strong>example:</strong>
         * <p>{\&quot;cu\&quot;:\&quot;11500\&quot;,\&quot;minCu\&quot;:\&quot;2300\&quot;,\&quot;parentId\&quot;:\&quot;0\&quot;}</p>
         */
        @NameInMap("Specs")
        public java.util.List<ListQuotasResponseBodyQuotasSpecs> specs;

        public static ListQuotasResponseBodyQuotas build(java.util.Map<String, ?> map) throws Exception {
            ListQuotasResponseBodyQuotas self = new ListQuotasResponseBodyQuotas();
            return TeaModel.build(map, self);
        }

        public ListQuotasResponseBodyQuotas setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ListQuotasResponseBodyQuotas setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListQuotasResponseBodyQuotas setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public ListQuotasResponseBodyQuotas setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListQuotasResponseBodyQuotas setProductCode(String productCode) {
            this.productCode = productCode;
            return this;
        }
        public String getProductCode() {
            return this.productCode;
        }

        public ListQuotasResponseBodyQuotas setQuotaType(String quotaType) {
            this.quotaType = quotaType;
            return this;
        }
        public String getQuotaType() {
            return this.quotaType;
        }

        public ListQuotasResponseBodyQuotas setSpecs(java.util.List<ListQuotasResponseBodyQuotasSpecs> specs) {
            this.specs = specs;
            return this;
        }
        public java.util.List<ListQuotasResponseBodyQuotasSpecs> getSpecs() {
            return this.specs;
        }

    }

}
