// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class DescribeOpEntitiesResponseBody extends TeaModel {
    /**
     * <p>The list of Operation logs details.</p>
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
     * <p>The total number of queried operation logs.</p>
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
         * <p>The operation object, which is the ID of the Anti-DDoS Origin instance.</p>
         * 
         * <strong>example:</strong>
         * <p>ddosbgp-cn-n6w1r7nz****</p>
         */
        @NameInMap("EntityObject")
        public String entityObject;

        /**
         * <p>The object type of the operation. The value is fixed as <strong>1</strong>, which indicates an Anti-DDoS Origin instance.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("EntityType")
        public Integer entityType;

        /**
         * <p>The time when the log was created. The value is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1635818114000</p>
         */
        @NameInMap("GmtCreate")
        public Long gmtCreate;

        /**
         * <p>The Alibaba Cloud account ID used to execute the operation.</p>
         * <blockquote>
         * <p>If the value is <strong>system</strong>, the Anti-DDoS Origin service will automatically execute the operation.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>171986973287****</p>
         */
        @NameInMap("OpAccount")
        public String opAccount;

        /**
         * <p>The operation type. Valid values:</p>
         * <ul>
         * <li><strong>3</strong>: add protected IP addresses to the Anti-DDoS Origin instance</li>
         * <li><strong>4</strong>: unbind protected IP addresses from the Anti-DDoS Origin instance</li>
         * <li><strong>5</strong>: downgrade the Anti-DDoS Origin instance</li>
         * <li><strong>6</strong>: deactivate blackhole filtering</li>
         * <li><strong>7</strong>: reset the quota on blackhole filtering deactivation</li>
         * <li><strong>8</strong>: resume burstable protection</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("OpAction")
        public Integer opAction;

        /**
         * <p>The operation details. Use a JSON struct to transform the data into a character string representation. The JSON structure contains the following fields:</p>
         * <ul>
         * <li><p><strong>entity</strong>: Object | The operation object. The fields contained in <strong>entity</strong> vary based on the operation type (<strong>OpAction</strong>). Details:</p>
         * <ul>
         * <li><p>If <strong>OpAction</strong> is <strong>3</strong> (add protected IP addresses), <strong>entity</strong> contains the following fields:</p>
         * <ul>
         * <li><strong>ips</strong>: Array | The list of assets that are assigned public IP addresses that are attached to the Anti-DDoS Origin instance for protection.</li>
         * </ul>
         * </li>
         * <li><p>If <strong>OpAction</strong> is <strong>4</strong> (unbind protected IP addresses), <strong>entity</strong> contains the following fields:</p>
         * <ul>
         * <li><strong>ips</strong>: Array | The list of assets that are assigned public IP addresses that are unbound from the Anti-DDoS Origin instance.</li>
         * </ul>
         * </li>
         * <li><p>If <strong>OpAction</strong> is <strong>5</strong> (decrease the quota of the instance), <strong>entity</strong> contains the following fields:</p>
         * <ul>
         * <li><strong>baseBandwidth</strong>: Integer | The basic protection bandwidth. Unit: Gbit/s.</li>
         * <li><strong>elasticBandwidth</strong>: Integer | The burstable protection bandwidth. Unit: Gbit/s.</li>
         * <li><strong>opSource</strong>: Integer | The source of the operation. The value is fixed as <strong>1</strong>, which indicates that the Anti-DDoS Origin service will automatically execute the operation.</li>
         * </ul>
         * </li>
         * <li><p>If <strong>OpAction</strong> is <strong>6</strong> (deactivate blackhole filtering), <strong>entity</strong> contains the following fields:</p>
         * <ul>
         * <li><strong>ips</strong>: Array | The list of assets that are assigned public IP addresses for which the blackhole filtering status is deactivated.</li>
         * </ul>
         * </li>
         * <li><p>If <strong>OpAction</strong> is <strong>7</strong> (Reset quota on blackhole filtering deactivation), <strong>entity</strong> is empty.</p>
         * </li>
         * <li><p>If <strong>OpAction</strong> is <strong>8</strong> (recover burstable protection), <strong>entity</strong> contains the following fields:</p>
         * <ul>
         * <li><strong>baseBandwidth</strong>: Integer | The basic protection bandwidth. Unit: Gbit/s.</li>
         * <li><strong>elasticBandwidth</strong>: Integer | The burstable protection bandwidth. Unit: Gbit/s.</li>
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
