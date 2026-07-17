// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListInstancesQuotaResponseBody extends TeaModel {
    /**
     * <p>The quota name.</p>
     * 
     * <strong>example:</strong>
     * <p>siteCount</p>
     */
    @NameInMap("QuotaName")
    public String quotaName;

    /**
     * <p>The threshold type of the quota. Valid values:</p>
     * <ul>
     * <li><strong>value</strong>: Enumeration type. The enumeration range of quota values.</li>
     * <li><strong>bool</strong>: Boolean type. Indicates whether the quota is available.</li>
     * <li><strong>num</strong>: Numeric type. The upper limit of the quota usage.</li>
     * <li><strong>range</strong>: Range type. The value range of the quota.</li>
     * <li><strong>custom</strong>: Custom type. Other types beyond the four threshold types above.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>bool</p>
     */
    @NameInMap("QuotaValueType")
    public String quotaValueType;

    /**
     * <p>The list of quota values.</p>
     */
    @NameInMap("QuotaValues")
    public java.util.List<ListInstancesQuotaResponseBodyQuotaValues> quotaValues;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>156A6B-677B1A-4297B7-9187B7-2B44792</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListInstancesQuotaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListInstancesQuotaResponseBody self = new ListInstancesQuotaResponseBody();
        return TeaModel.build(map, self);
    }

    public ListInstancesQuotaResponseBody setQuotaName(String quotaName) {
        this.quotaName = quotaName;
        return this;
    }
    public String getQuotaName() {
        return this.quotaName;
    }

    public ListInstancesQuotaResponseBody setQuotaValueType(String quotaValueType) {
        this.quotaValueType = quotaValueType;
        return this;
    }
    public String getQuotaValueType() {
        return this.quotaValueType;
    }

    public ListInstancesQuotaResponseBody setQuotaValues(java.util.List<ListInstancesQuotaResponseBodyQuotaValues> quotaValues) {
        this.quotaValues = quotaValues;
        return this;
    }
    public java.util.List<ListInstancesQuotaResponseBodyQuotaValues> getQuotaValues() {
        return this.quotaValues;
    }

    public ListInstancesQuotaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListInstancesQuotaResponseBodyQuotaValues extends TeaModel {
        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>esa-site-blea5hv7m0ow</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The quota value.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("QuotaValue")
        public String quotaValue;

        public static ListInstancesQuotaResponseBodyQuotaValues build(java.util.Map<String, ?> map) throws Exception {
            ListInstancesQuotaResponseBodyQuotaValues self = new ListInstancesQuotaResponseBodyQuotaValues();
            return TeaModel.build(map, self);
        }

        public ListInstancesQuotaResponseBodyQuotaValues setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListInstancesQuotaResponseBodyQuotaValues setQuotaValue(String quotaValue) {
            this.quotaValue = quotaValue;
            return this;
        }
        public String getQuotaValue() {
            return this.quotaValue;
        }

    }

}
