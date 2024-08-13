// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class DescribeOpEntitiesResponseBody extends TeaModel {
    /**
     * <p>The details of the operation log.</p>
     */
    @NameInMap("OpEntities")
    public java.util.List<DescribeOpEntitiesResponseBodyOpEntities> opEntities;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>52C8ECB0-0B1A-4E66-A31C-B6A855120E82</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of operation logs.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

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

    public DescribeOpEntitiesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeOpEntitiesResponseBodyOpEntities extends TeaModel {
        /**
         * <p>The operation object, which is the ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>ddosbgp-cn-n6w1r7nz****</p>
         */
        @NameInMap("EntityObject")
        public String entityObject;

        /**
         * <p>The type of the operation object. The value is fixed as <strong>1</strong>, which indicates Anti-DDoS Origin instances.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("EntityType")
        public Integer entityType;

        /**
         * <p>The time when the log was generated. The value is a UNIX timestamp. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1635818114000</p>
         */
        @NameInMap("GmtCreate")
        public Long gmtCreate;

        /**
         * <p>The ID of the Alibaba Cloud account that performs the operation.</p>
         * <blockquote>
         * <p>If the value is <strong>system</strong>, the operation is performed by Anti-DDoS Origin.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>171986973287****</p>
         */
        @NameInMap("OpAccount")
        public String opAccount;

        /**
         * <p>The type of operation. Valid values:</p>
         * <ul>
         * <li><strong>3</strong>: indicates an operation to add an IP address to the Anti-DDoS Origin instance for protection.</li>
         * <li><strong>4</strong>: indicates an operation to remove a protected IP address from the Anti-DDoS Origin instance.</li>
         * <li><strong>5</strong>: indicates an operation to downgrade the Anti-DDoS Origin instance.</li>
         * <li><strong>6</strong>: indicates an operation to deactivate blackhole filtering for an IP address.</li>
         * <li><strong>7</strong>: indicates an operation to reset the number of times that you can deactivate blackhole filtering.</li>
         * <li><strong>8</strong>: indicates an operation to enable burstable protection.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("OpAction")
        public Integer opAction;

        /**
         * <p>The details of the operation. The value is a string that consists of a JSON struct. The JSON struct contains the following fields:</p>
         * <ul>
         * <li><p><strong>entity</strong>: the operation object. Data type: object. The fields that are included in the value of the <strong>entity</strong> parameter vary based on the value of the <strong>OpAction</strong> parameter. Valid values:</p>
         * <ul>
         * <li><p>If the value of the <strong>OpAction</strong> parameter is <strong>3</strong>, the value of the <strong>entity</strong> parameter consists of the following field:</p>
         * <ul>
         * <li><strong>ips</strong>: the public IP addresses that are protected by the Anti-DDoS Origin instance. Data type: array</li>
         * </ul>
         * </li>
         * <li><p>If the value of the <strong>OpAction</strong> parameter is <strong>4</strong>, the value of the <strong>entity</strong> parameter consists of the following field:</p>
         * <ul>
         * <li><strong>ips</strong>: the public IP addresses that are no longer protected by the Anti-DDoS Origin instance. Data type: array.</li>
         * </ul>
         * </li>
         * <li><p>If the value of the <strong>OpAction</strong> parameter is <strong>5</strong>, the value of the <strong>entity</strong> parameter consists of the following fields:</p>
         * <ul>
         * <li><strong>baseBandwidth</strong>: the basic protection bandwidth. Unit: Gbit/s. Data type: integer.</li>
         * <li><strong>elasticBandwidth</strong>: the burstable protection bandwidth. Unit: Gbit/s. Data type: integer.</li>
         * <li><strong>opSource</strong>: the source of the operation. The value is fixed as <strong>1</strong>, indicating that the operation is performed by Anti-DDoS Origin. Data type: integer.</li>
         * </ul>
         * </li>
         * <li><p>If the value of the <strong>OpAction</strong> parameter is <strong>6</strong>, the value of the <strong>entity</strong> parameter consists of the following field:</p>
         * <ul>
         * <li><strong>ips</strong>: the public IP addresses for which to deactivate blackhole filtering. Data type: array.</li>
         * </ul>
         * </li>
         * <li><p>If the value of the <strong>OpAction</strong> parameter is <strong>7</strong>, the <strong>entity</strong> parameter is not returned.</p>
         * </li>
         * <li><p>If the value of the <strong>OpAction</strong> parameter is <strong>8</strong>, the value of the <strong>entity</strong> parameter consists of the following fields:</p>
         * <ul>
         * <li><strong>baseBandwidth</strong>: the basic protection bandwidth. Unit: Gbit/s. Data type: integer.</li>
         * <li><strong>elasticBandwidth</strong>: the burstable protection bandwidth. Unit: Gbit/s. Data type: integer.</li>
         * </ul>
         * </li>
         * </ul>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;entity&quot;:{&quot;baseBandwidth&quot;:20,&quot;elasticBandwidth&quot;:20}}</p>
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
