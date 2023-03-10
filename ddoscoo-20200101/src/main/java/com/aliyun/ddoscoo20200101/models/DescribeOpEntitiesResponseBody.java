// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeOpEntitiesResponseBody extends TeaModel {
    /**
     * <p>An array that consists of the details of the operation log.</p>
     */
    @NameInMap("OpEntities")
    public java.util.List<DescribeOpEntitiesResponseBodyOpEntities> opEntities;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of returned operation records.</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribeOpEntitiesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeOpEntitiesResponseBody self = new DescribeOpEntitiesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeOpEntitiesResponseBody setOpEntities(java.util.List<DescribeOpEntitiesResponseBodyOpEntities> opEntities) {
        this.opEntities = opEntities;
        return this;
    }
    public java.util.List<DescribeOpEntitiesResponseBodyOpEntities> getOpEntities() {
        return this.opEntities;
    }

    public DescribeOpEntitiesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeOpEntitiesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeOpEntitiesResponseBodyOpEntities extends TeaModel {
        /**
         * <p>The operation object.</p>
         */
        @NameInMap("EntityObject")
        public String entityObject;

        /**
         * <p>The type of the operation object. Valid values:</p>
         * <br>
         * <p>*   **1**: the IP address of the Anti-DDoS Pro or Anti-DDoS Premium instance</p>
         * <p>*   **2**: Anti-DDoS plans</p>
         * <p>*   **3**: ECS instances</p>
         * <p>*   **4**: all logs</p>
         */
        @NameInMap("EntityType")
        public Integer entityType;

        /**
         * <p>The time when the operation was performed. The value is a UNIX timestamp. Unit: milliseconds.</p>
         */
        @NameInMap("GmtCreate")
        public Long gmtCreate;

        /**
         * <p>The ID of the Alibaba Cloud account that is used to call the API operation.</p>
         */
        @NameInMap("OpAccount")
        public String opAccount;

        /**
         * <p>The type of the operation. Valid values:</p>
         * <br>
         * <p>*   **1**: configuring burstable protection bandwidth.</p>
         * <p>*   **5**: using Anti-DDoS plans.</p>
         * <p>*   **8**: changing IP addresses of ECS instances.</p>
         * <p>*   **9**: deactivating blackhole filtering.</p>
         * <p>*   **10**: configuring the Diversion from Origin Server policy.</p>
         * <p>*   **11**: clearing all logs.</p>
         * <p>*   **12**: downgrading the specifications of instances. If the instance expires or the account has overdue payments, this operation is performed to downgrade the burstable protection bandwidth.</p>
         * <p>*   **13**: restoring the specifications of instances. If the instance is renewed or you have paid the overdue payments within your account, this operation is performed to restore the burstable protection bandwidth.</p>
         */
        @NameInMap("OpAction")
        public Integer opAction;

        /**
         * <p>The details of the operation. This parameter is a JSON string. The string contains the following fields:</p>
         * <br>
         * <p>*   **newEntity**: the values of the parameters after the operation. This field must be of the STRING type.</p>
         * <p>*   **oldEntity**: the values of the parameters before the operation. This field must be of the STRING type.</p>
         * <br>
         * <p>Both **newEntity** and **oldEntity** are JSON strings. The returned parameters vary with **OpAtion**.</p>
         * <br>
         * <p>If **OpAction** is **1**, **12**, or **13**, the following parameter is returned:</p>
         * <br>
         * <p>*   **elasticBandwidth**: the burstable protection bandwidth. The value is of the INTEGER type.</p>
         * <br>
         * <p>    For example: `{"newEntity":{"elasticBandwidth":300},"oldEntity":{"elasticBandwidth":300}}`</p>
         * <br>
         * <p>If **OpAction** is **5**, the following parameters are returned:</p>
         * <br>
         * <p>*   **bandwidth**: the burstable protection bandwidth. The value is of the INTEGER type. Unit: Gbit/s.</p>
         * <br>
         * <p>*   **count**: the number of Anti-DDoS plans. The value is of the INTEGER type.</p>
         * <br>
         * <p>*   **deductCount**: the number of used Anti-DDoS plans. The value is of the INTEGER type.</p>
         * <br>
         * <p>*   **expireTime**: the expiration time of the Anti-DDoS plans. The value is of the LONG type. The value is a UNIX timestamp. Unit: milliseconds.</p>
         * <br>
         * <p>*   **instanceId**: the ID of the instance. The value is of the STRING type.</p>
         * <br>
         * <p>*   **peakFlow**: the peak throughput on the instance. The value is of the INTEGER type. Unit: bit/s.</p>
         * <br>
         * <p>    For example: `{"newEntity":{"bandwidth":100,"count":4,"deductCount":1,"expireTime":1616299196000,"instanceId":"ddoscoo-cn-v641kpmq****","peakFlow":751427000}}`</p>
         * <br>
         * <p>If **OpAction** is **8**, the following parameter is returned:</p>
         * <br>
         * <p>*   **instanceId**: the ID of the ECS instance whose IP address is changed. The value is of the STRING type.</p>
         * <br>
         * <p>    For example: `{"newEntity":{"instanceId":"i-wz9h6nc313zptbqn****"}}`</p>
         * <br>
         * <p>If **OpAction** is **9**, the following parameter is returned:</p>
         * <br>
         * <p>*   **actionMethod**: the operation method. The value is of the STRING type. Valid value: **undo**, which indicates that you deactivated blackhole filtering.</p>
         * <br>
         * <p>    For example: `{"newEntity":{"actionMethod":"undo"}}`</p>
         * <br>
         * <p>If **OpAction** is **10**, the following parameters are returned:</p>
         * <br>
         * <p>*   **actionMethod**: the operation method. The value is of the STRING type. Valid values:</p>
         * <br>
         * <p>    *   **do**: The Diversion from Origin Server policy is enabled.</p>
         * <p>    *   **undo**: The Diversion from Origin Server policy is disabled.</p>
         * <br>
         * <p>*   **lines**: The Internet service provider (ISP) line from which the traffic is blocked. Valid values:</p>
         * <br>
         * <p>    *   **ct**: China Telecom (International)</p>
         * <p>    *   **cut**: China Unicom (International)</p>
         * <br>
         * <p>    For example: `{"newEntity":{"actionMethod":"undo","lines":["ct"]}}`</p>
         * <br>
         * <p>If **OpAction** is **11**, no parameter is returned, and the description is empty.</p>
         */
        @NameInMap("OpDesc")
        public String opDesc;

        public static DescribeOpEntitiesResponseBodyOpEntities build(java.util.Map<String, ?> map) throws Exception {
            DescribeOpEntitiesResponseBodyOpEntities self = new DescribeOpEntitiesResponseBodyOpEntities();
            return TeaModel.build(map, self);
        }

        public DescribeOpEntitiesResponseBodyOpEntities setEntityObject(String entityObject) {
            this.entityObject = entityObject;
            return this;
        }
        public String getEntityObject() {
            return this.entityObject;
        }

        public DescribeOpEntitiesResponseBodyOpEntities setEntityType(Integer entityType) {
            this.entityType = entityType;
            return this;
        }
        public Integer getEntityType() {
            return this.entityType;
        }

        public DescribeOpEntitiesResponseBodyOpEntities setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeOpEntitiesResponseBodyOpEntities setOpAccount(String opAccount) {
            this.opAccount = opAccount;
            return this;
        }
        public String getOpAccount() {
            return this.opAccount;
        }

        public DescribeOpEntitiesResponseBodyOpEntities setOpAction(Integer opAction) {
            this.opAction = opAction;
            return this;
        }
        public Integer getOpAction() {
            return this.opAction;
        }

        public DescribeOpEntitiesResponseBodyOpEntities setOpDesc(String opDesc) {
            this.opDesc = opDesc;
            return this;
        }
        public String getOpDesc() {
            return this.opDesc;
        }

    }

}
