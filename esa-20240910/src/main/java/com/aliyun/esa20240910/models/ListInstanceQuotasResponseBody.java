// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListInstanceQuotasResponseBody extends TeaModel {
    /**
     * <p>The plan ID.</p>
     * 
     * <strong>example:</strong>
     * <p>sp-xcdn-96wblslz****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The quotas in the plan.</p>
     */
    @NameInMap("Quotas")
    public java.util.List<ListInstanceQuotasResponseBodyQuotas> quotas;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>15C66C7B-671A-4297-9187-2C4477247B78</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The plan status. Valid values:</p>
     * <ul>
     * <li>online: The plan is in service.</li>
     * <li>offline: The plan has expired within an allowable period. In this state, the plan is unavailable.</li>
     * <li>disable: The plan is released.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>online</p>
     */
    @NameInMap("Status")
    public String status;

    public static ListInstanceQuotasResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListInstanceQuotasResponseBody self = new ListInstanceQuotasResponseBody();
        return TeaModel.build(map, self);
    }

    public ListInstanceQuotasResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListInstanceQuotasResponseBody setQuotas(java.util.List<ListInstanceQuotasResponseBodyQuotas> quotas) {
        this.quotas = quotas;
        return this;
    }
    public java.util.List<ListInstanceQuotasResponseBodyQuotas> getQuotas() {
        return this.quotas;
    }

    public ListInstanceQuotasResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListInstanceQuotasResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public static class ListInstanceQuotasResponseBodyQuotas extends TeaModel {
        /**
         * <p>The quota name.</p>
         * 
         * <strong>example:</strong>
         * <p>customHttpCert</p>
         */
        @NameInMap("QuotaName")
        public String quotaName;

        /**
         * <p>The quota value.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("QuotaValue")
        public String quotaValue;

        /**
         * <p>The threshold type of the quota. Valid values:</p>
         * <ul>
         * <li>value: enumerates the values of the quota.</li>
         * <li>bool: specifies whether the quota is available.</li>
         * <li>num: the upper limit of the quota.</li>
         * <li>range: the value range for the quota.</li>
         * <li>custom: other types than the preceding four quota threshold types.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>bool</p>
         */
        @NameInMap("QuotaValueType")
        public String quotaValueType;

        public static ListInstanceQuotasResponseBodyQuotas build(java.util.Map<String, ?> map) throws Exception {
            ListInstanceQuotasResponseBodyQuotas self = new ListInstanceQuotasResponseBodyQuotas();
            return TeaModel.build(map, self);
        }

        public ListInstanceQuotasResponseBodyQuotas setQuotaName(String quotaName) {
            this.quotaName = quotaName;
            return this;
        }
        public String getQuotaName() {
            return this.quotaName;
        }

        public ListInstanceQuotasResponseBodyQuotas setQuotaValue(String quotaValue) {
            this.quotaValue = quotaValue;
            return this;
        }
        public String getQuotaValue() {
            return this.quotaValue;
        }

        public ListInstanceQuotasResponseBodyQuotas setQuotaValueType(String quotaValueType) {
            this.quotaValueType = quotaValueType;
            return this;
        }
        public String getQuotaValueType() {
            return this.quotaValueType;
        }

    }

}
