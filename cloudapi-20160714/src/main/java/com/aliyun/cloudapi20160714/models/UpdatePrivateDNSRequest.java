// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class UpdatePrivateDNSRequest extends TeaModel {
    /**
     * <p>The internal domain name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>api.demo.com</p>
     */
    @NameInMap("IntranetDomain")
    public String intranetDomain;

    /**
     * <p>The resolution records. This parameter is valid only when Type is set to A.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Records")
    public java.util.List<UpdatePrivateDNSRequestRecords> records;

    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>The internal domain name resolution type. Valid values:</p>
     * <ul>
     * <li>VPC: resolution for virtual private cloud (VPC) access authorizations. A resolution of this type can be bound only to traditional dedicated instances.</li>
     * <li>A: resolution that supports A records. A resolution of this type can be bound only to VPC integration dedicated instances.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>A</p>
     */
    @NameInMap("Type")
    public String type;

    public static UpdatePrivateDNSRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdatePrivateDNSRequest self = new UpdatePrivateDNSRequest();
        return TeaModel.build(map, self);
    }

    public UpdatePrivateDNSRequest setIntranetDomain(String intranetDomain) {
        this.intranetDomain = intranetDomain;
        return this;
    }
    public String getIntranetDomain() {
        return this.intranetDomain;
    }

    public UpdatePrivateDNSRequest setRecords(java.util.List<UpdatePrivateDNSRequestRecords> records) {
        this.records = records;
        return this;
    }
    public java.util.List<UpdatePrivateDNSRequestRecords> getRecords() {
        return this.records;
    }

    public UpdatePrivateDNSRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public UpdatePrivateDNSRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public static class UpdatePrivateDNSRequestRecords extends TeaModel {
        /**
         * <p>The resolution record.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.0.2</p>
         */
        @NameInMap("Record")
        public String record;

        /**
         * <p>The weight of the record.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Weight")
        public Integer weight;

        public static UpdatePrivateDNSRequestRecords build(java.util.Map<String, ?> map) throws Exception {
            UpdatePrivateDNSRequestRecords self = new UpdatePrivateDNSRequestRecords();
            return TeaModel.build(map, self);
        }

        public UpdatePrivateDNSRequestRecords setRecord(String record) {
            this.record = record;
            return this;
        }
        public String getRecord() {
            return this.record;
        }

        public UpdatePrivateDNSRequestRecords setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

    }

}
