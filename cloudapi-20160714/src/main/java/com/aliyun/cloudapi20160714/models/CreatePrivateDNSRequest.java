// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class CreatePrivateDNSRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>api.demo.com</p>
     */
    @NameInMap("IntranetDomain")
    public String intranetDomain;

    @NameInMap("Records")
    public java.util.List<CreatePrivateDNSRequestRecords> records;

    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>A</p>
     */
    @NameInMap("Type")
    public String type;

    public static CreatePrivateDNSRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePrivateDNSRequest self = new CreatePrivateDNSRequest();
        return TeaModel.build(map, self);
    }

    public CreatePrivateDNSRequest setIntranetDomain(String intranetDomain) {
        this.intranetDomain = intranetDomain;
        return this;
    }
    public String getIntranetDomain() {
        return this.intranetDomain;
    }

    public CreatePrivateDNSRequest setRecords(java.util.List<CreatePrivateDNSRequestRecords> records) {
        this.records = records;
        return this;
    }
    public java.util.List<CreatePrivateDNSRequestRecords> getRecords() {
        return this.records;
    }

    public CreatePrivateDNSRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public CreatePrivateDNSRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public static class CreatePrivateDNSRequestRecords extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>192.168.0.1</p>
         */
        @NameInMap("Record")
        public String record;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Weight")
        public Integer weight;

        public static CreatePrivateDNSRequestRecords build(java.util.Map<String, ?> map) throws Exception {
            CreatePrivateDNSRequestRecords self = new CreatePrivateDNSRequestRecords();
            return TeaModel.build(map, self);
        }

        public CreatePrivateDNSRequestRecords setRecord(String record) {
            this.record = record;
            return this;
        }
        public String getRecord() {
            return this.record;
        }

        public CreatePrivateDNSRequestRecords setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

    }

}
