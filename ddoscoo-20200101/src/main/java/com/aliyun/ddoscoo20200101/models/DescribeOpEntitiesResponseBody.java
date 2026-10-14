// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeOpEntitiesResponseBody extends TeaModel {
    /**
     * <p>The operation log records.</p>
     */
    @NameInMap("OpEntities")
    public java.util.List<DescribeOpEntitiesResponseBodyOpEntities> opEntities;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>FB24D70C-71F5-4000-8CD8-22CDA0C53CD1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of operation records.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
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
         * 
         * <strong>example:</strong>
         * <p>203.<em><strong>.</strong></em>.132</p>
         */
        @NameInMap("EntityObject")
        public String entityObject;

        /**
         * <p>The type of the operation object. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: IP Address of Anti-DDoS Proxy instance</li>
         * <li><strong>2</strong>: Anti-DDoS Pro and Anti-DDoS Premium mitigation plan</li>
         * <li><strong>3</strong>: ECS instance</li>
         * <li><strong>4</strong>: full logs</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("EntityType")
        public Integer entityType;

        /**
         * <p>The time when the operation was performed. This value is a UNIX timestamp. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1584451769000</p>
         */
        @NameInMap("GmtCreate")
        public Long gmtCreate;

        /**
         * <p>The Alibaba Cloud account ID that performed the operation.</p>
         * 
         * <strong>example:</strong>
         * <p>128965410602****</p>
         */
        @NameInMap("OpAccount")
        public String opAccount;

        /**
         * <p>The type of the operation. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: Settings for the burstable protection bandwidth.</li>
         * <li><strong>5</strong>: Offset with an anti-DDoS mitigation plan.</li>
         * <li><strong>8</strong>: Change an ECS IP address.</li>
         * <li><strong>9</strong>: Unblock (deactivation of blackhole filtering).</li>
         * <li><strong>10</strong>: Settings for near-origin traffic diversion.</li>
         * <li><strong>11</strong>: Clear full logs.</li>
         * <li><strong>12</strong>: Downgrade instance specifications. This indicates that the burstable protection bandwidth is reduced when the instance expires or the account has an overdue payment.</li>
         * <li><strong>13</strong>: Recover instance specifications. This indicates that the burstable protection bandwidth is recovered when the instance renewal is completed or the overdue payment is settled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>9</p>
         */
        @NameInMap("OpAction")
        public Integer opAction;

        /**
         * <p>The description of the operation, expressed as a JSON format character string with the following structure:</p>
         * <ul>
         * <li><strong>newEntity</strong>: String. The parameters after the operation.</li>
         * <li><strong>oldEntity</strong>: String. The parameters before the operation.</li>
         * </ul>
         * <p>Both <strong>newEntity</strong> and <strong>oldEntity</strong> are expressed as JSON format character strings. The operation parameters vary based on the operation type (<strong>OpAction</strong>).</p>
         * <p>When <strong>OpAction</strong> is <strong>1</strong>, <strong>12</strong>, or <strong>13</strong>, the operation parameters have the following structure:</p>
         * <ul>
         * <li><p><strong>elasticBandwidth</strong>: Integer. The burstable protection bandwidth. Unit: Gbit/s.</p>
         * <p>  Example: <code>{&quot;newEntity&quot;:{&quot;elasticBandwidth&quot;:300},&quot;oldEntity&quot;:{&quot;elasticBandwidth&quot;:300}}</code></p>
         * </li>
         * </ul>
         * <p>When <strong>OpAction</strong> is <strong>5</strong>, the operation parameters have the following structure:</p>
         * <ul>
         * <li><p><strong>bandwidth</strong>: Integer. The burstable protection bandwidth. Unit: Gbit/s.</p>
         * </li>
         * <li><p><strong>count</strong>: Integer. The number of anti-DDoS mitigation plans.</p>
         * </li>
         * <li><p><strong>deductCount</strong>: Integer. The number of offset anti-DDoS mitigation plans.</p>
         * </li>
         * <li><p><strong>expireTime</strong>: Long. The expiration time of the anti-DDoS mitigation plan. This value is a UNIX timestamp. Unit: milliseconds.</p>
         * </li>
         * <li><p><strong>instanceId</strong>: String. The instance ID of the Anti-DDoS Pro and Anti-DDoS Premium instance.</p>
         * </li>
         * <li><p><strong>peakFlow</strong>: Integer. The peak traffic. Unit: bit/s.</p>
         * <p>  Example: <code>{&quot;newEntity&quot;:{&quot;bandwidth&quot;:100,&quot;count&quot;:4,&quot;deductCount&quot;:1,&quot;expireTime&quot;:1616299196000,&quot;instanceId&quot;:&quot;ddoscoo-cn-v641kpmq****&quot;,&quot;peakFlow&quot;:751427000}}</code></p>
         * </li>
         * </ul>
         * <p>When <strong>OpAction</strong> is <strong>8</strong>, the operation parameters have the following structure:</p>
         * <ul>
         * <li><p><strong>instanceId</strong>: String. The instance ID of the ECS instance whose IP address is changed.</p>
         * <p>  Example: <code>{&quot;newEntity&quot;:{&quot;instanceId&quot;:&quot;i-wz9h6nc313zptbqn****&quot;}}</code></p>
         * </li>
         * </ul>
         * <p>	</p>
         * <p>When <strong>OpAction</strong> is <strong>9</strong>, the operation parameters have the following structure:</p>
         * <ul>
         * <li><p><strong>actionMethod</strong>: String. The operation method. Value: <strong>undo</strong>, which indicates Unblock (deactivation of blackhole filtering).</p>
         * <p>  Example: <code>{&quot;newEntity&quot;:{&quot;actionMethod&quot;:&quot;undo&quot;}}</code></p>
         * </li>
         * </ul>
         * <p>	</p>
         * <p>When <strong>OpAction</strong> is <strong>10</strong>, the operation parameters have the following structure:</p>
         * <ul>
         * <li><p><strong>actionMethod</strong>: String. The operation method. Valid values:</p>
         * <ul>
         * <li><strong>do</strong>: Enable near-origin traffic diversion.</li>
         * <li><strong>undo</strong>: Disable near-origin traffic diversion.</li>
         * </ul>
         * </li>
         * <li><p><strong>lines</strong>: Array. The line types. Valid values:</p>
         * <ul>
         * <li><strong>ct</strong>: China Telecom outside China line</li>
         * <li><strong>cut</strong>: China Unicom outside China line</li>
         * </ul>
         * <p>  Example: <code>{&quot;newEntity&quot;:{&quot;actionMethod&quot;:&quot;undo&quot;,&quot;lines&quot;:[&quot;ct&quot;]}}</code></p>
         * </li>
         * </ul>
         * <p>When <strong>OpAction</strong> is <strong>11</strong>, there are no operation parameters and the operation description is empty.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;newEntity&quot;:{&quot;actionMethod&quot;:&quot;undo&quot;}}</p>
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
