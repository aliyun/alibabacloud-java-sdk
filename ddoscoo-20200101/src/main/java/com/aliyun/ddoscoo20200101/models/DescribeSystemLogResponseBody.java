// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeSystemLogResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>8BC3A33A-F832-58DB-952F-7682A25AD14C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The details of the billing logs for burstable clean bandwidth.</p>
     */
    @NameInMap("SystemLog")
    public java.util.List<DescribeSystemLogResponseBodySystemLog> systemLog;

    /**
     * <p>The total number of billing logs for burstable clean bandwidth that are queried.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Total")
    public Long total;

    public static DescribeSystemLogResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSystemLogResponseBody self = new DescribeSystemLogResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSystemLogResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSystemLogResponseBody setSystemLog(java.util.List<DescribeSystemLogResponseBodySystemLog> systemLog) {
        this.systemLog = systemLog;
        return this;
    }
    public java.util.List<DescribeSystemLogResponseBodySystemLog> getSystemLog() {
        return this.systemLog;
    }

    public DescribeSystemLogResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public static class DescribeSystemLogResponseBodySystemLog extends TeaModel {
        /**
         * <p>The IP address of the Anti-DDoS instance.</p>
         * 
         * <strong>example:</strong>
         * <p>203.107.XX.XX</p>
         */
        @NameInMap("EntityObject")
        public String entityObject;

        /**
         * <p>The type of the system log. The value is fixed at <strong>20</strong>, which indicates the billing log of burstable clean bandwidth.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("EntityType")
        public Integer entityType;

        /**
         * <p>The time when the bill was created. This value is a timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1631793531000</p>
         */
        @NameInMap("GmtCreate")
        public Long gmtCreate;

        /**
         * <p>The time when the bill was last modified. This value is a timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1635425407000</p>
         */
        @NameInMap("GmtModified")
        public Long gmtModified;

        /**
         * <p>The ID of the Alibaba Cloud account to which the bill belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>171986973287****</p>
         */
        @NameInMap("OpAccount")
        public String opAccount;

        /**
         * <p>The operation type. The value is fixed at <strong>100</strong>, which indicates that a billing record for burstable clean bandwidth is added.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("OpAction")
        public Integer opAction;

        /**
         * <p>The details of the bill. This value is a string that is converted from a JSON struct. The JSON struct contains the following fields:</p>
         * <ul>
         * <li><p><strong>newEntity</strong>: Object type, which indicates the bill record and contains the following fields:</p>
         * <ul>
         * <li><strong>billValue</strong>: Integer type | The usage of burstable clean bandwidth in the billing month. Unit: Mbit/s.</li>
         * <li><strong>instanceId</strong>: String type | The ID of the Anti-DDoS instance.</li>
         * <li><strong>ip</strong>: String type | The IP address of the Anti-DDoS instance.</li>
         * <li><strong>maxBw</strong>: String type | The actual peak value of service traffic in the billing month (monthly 95th percentile). Unit: Mbit/s.</li>
         * <li><strong>month</strong>: Long type | The month when the bill is generated (the billing month is the calendar month before the month when the bill is generated). This value is a timestamp in milliseconds.</li>
         * <li><strong>overBandwidth</strong>: Integer type | The bandwidth that exceeds the clean bandwidth specification of the instance. Unit: Mbit/s.</li>
         * <li><strong>peakTime</strong>: Long type | The time when the actual peak value of service traffic is measured. This value is a timestamp in seconds.</li>
         * <li><strong>startTimestamp</strong>: Long type | The start time of the period when the peak value of instance service traffic is measured. This value is a timestamp in seconds.</li>
         * </ul>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;newEntity&quot;:{&quot;billValue&quot;:&quot;60&quot;,&quot;instanceId&quot;:&quot;ddoscoo-cn-zz121ogz****&quot;,&quot;ip&quot;:&quot;203.107.XX.XX&quot;,&quot;maxBw&quot;:&quot;300&quot;,&quot;month&quot;:1627747200000,&quot;overBandwidth&quot;:&quot;120&quot;,&quot;peakTime&quot;:1629871200,&quot;startTimestamp&quot;:1629871200}}</p>
         */
        @NameInMap("OpDesc")
        public String opDesc;

        /**
         * <p>The status of the bill. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: indicates that the bill is pending.</li>
         * <li><strong>1</strong>: indicates that the bill is generated.</li>
         * <li><strong>2</strong>: indicates that the bill is terminated.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Status")
        public Integer status;

        public static DescribeSystemLogResponseBodySystemLog build(java.util.Map<String, ?> map) throws Exception {
            DescribeSystemLogResponseBodySystemLog self = new DescribeSystemLogResponseBodySystemLog();
            return TeaModel.build(map, self);
        }

        public DescribeSystemLogResponseBodySystemLog setEntityObject(String entityObject) {
            this.entityObject = entityObject;
            return this;
        }
        public String getEntityObject() {
            return this.entityObject;
        }

        public DescribeSystemLogResponseBodySystemLog setEntityType(Integer entityType) {
            this.entityType = entityType;
            return this;
        }
        public Integer getEntityType() {
            return this.entityType;
        }

        public DescribeSystemLogResponseBodySystemLog setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeSystemLogResponseBodySystemLog setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public DescribeSystemLogResponseBodySystemLog setOpAccount(String opAccount) {
            this.opAccount = opAccount;
            return this;
        }
        public String getOpAccount() {
            return this.opAccount;
        }

        public DescribeSystemLogResponseBodySystemLog setOpAction(Integer opAction) {
            this.opAction = opAction;
            return this;
        }
        public Integer getOpAction() {
            return this.opAction;
        }

        public DescribeSystemLogResponseBodySystemLog setOpDesc(String opDesc) {
            this.opDesc = opDesc;
            return this;
        }
        public String getOpDesc() {
            return this.opDesc;
        }

        public DescribeSystemLogResponseBodySystemLog setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

    }

}
