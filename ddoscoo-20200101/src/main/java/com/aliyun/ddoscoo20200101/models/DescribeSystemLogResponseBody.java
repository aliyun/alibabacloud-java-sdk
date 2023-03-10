// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeSystemLogResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>An array that consists of details of the billing logs for the burstable clean bandwidth.</p>
     */
    @NameInMap("SystemLog")
    public java.util.List<DescribeSystemLogResponseBodySystemLog> systemLog;

    /**
     * <p>The total number of billing logs for the burstable clean bandwidth.</p>
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
         * <p>The IP address of the instance.</p>
         */
        @NameInMap("EntityObject")
        public String entityObject;

        /**
         * <p>The type of the system log. The value is fixed as **20**, which indicates the billing logs for burstable clean bandwidth.</p>
         */
        @NameInMap("EntityType")
        public Integer entityType;

        /**
         * <p>The time when the bill was generated. The value is a UNIX timestamp. Unit: milliseconds.</p>
         */
        @NameInMap("GmtCreate")
        public Long gmtCreate;

        /**
         * <p>The time when the bill was last modified. The value is a UNIX timestamp. Unit: milliseconds.</p>
         */
        @NameInMap("GmtModified")
        public Long gmtModified;

        /**
         * <p>The ID of the Alibaba Cloud account to which the bill belongs.</p>
         */
        @NameInMap("OpAccount")
        public String opAccount;

        /**
         * <p>The operation type. The value is fixed as **100**, which indicates the billing logs for the burstable clean bandwidth that you increased.</p>
         */
        @NameInMap("OpAction")
        public Integer opAction;

        /**
         * <p>The details of the bill. The value is a string that consists of a JSON struct. The JSON struct contains the following fields:</p>
         * <br>
         * <p>*   **newEntity**: the bill record, which contains the following fields. Data type: object.</p>
         * <br>
         * <p>    *   **billValue**: the usage of the burstable clean bandwidth within a month. Unit: Mbit/s. Data type: integer.</p>
         * <p>    *   **instanceId**: the ID of the instance. Data type: string.</p>
         * <p>    *   **ip**: the IP address of the instance. Data type: string.</p>
         * <p>    *   **maxBw**: the peak service traffic (monthly 95th percentile bandwidth) within a month. Unit: Mbit/s. Data type: string.</p>
         * <p>    *   **month**: the month in which the bill of the previous calendar month is issued. This value is a UNIX timestamp. Unit: milliseconds. Data type: long.</p>
         * <p>    *   **overBandwidth**: the peak service traffic minus the clean bandwidth of the instance. Unit: Mbit/s. Data type: integer.</p>
         * <p>    *   **peakTime**: the time in point of the peak service traffic that is measured for billing. This value is a UNIX timestamp. Unit: seconds. Data type: long.</p>
         * <p>    *   **startTimestamp**: the beginning of the time range for the peak service traffic range. This value is a UNIX timestamp. Unit: seconds. Data type: long.</p>
         */
        @NameInMap("OpDesc")
        public String opDesc;

        /**
         * <p>The status of the bill. Valid values:</p>
         * <br>
         * <p>*   **0**: to be billed</p>
         * <p>*   **1**: billed</p>
         * <p>*   **2**: terminated</p>
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
