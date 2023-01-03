// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class GetSubnetResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Content")
    public GetSubnetResponseBodyContent content;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static GetSubnetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSubnetResponseBody self = new GetSubnetResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSubnetResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetSubnetResponseBody setContent(GetSubnetResponseBodyContent content) {
        this.content = content;
        return this;
    }
    public GetSubnetResponseBodyContent getContent() {
        return this.content;
    }

    public GetSubnetResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetSubnetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetSubnetResponseBodyContentVpdBaseInfo extends TeaModel {
        @NameInMap("Cidr")
        public String cidr;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("Name")
        public String name;

        @NameInMap("VpdId")
        public String vpdId;

        public static GetSubnetResponseBodyContentVpdBaseInfo build(java.util.Map<String, ?> map) throws Exception {
            GetSubnetResponseBodyContentVpdBaseInfo self = new GetSubnetResponseBodyContentVpdBaseInfo();
            return TeaModel.build(map, self);
        }

        public GetSubnetResponseBodyContentVpdBaseInfo setCidr(String cidr) {
            this.cidr = cidr;
            return this;
        }
        public String getCidr() {
            return this.cidr;
        }

        public GetSubnetResponseBodyContentVpdBaseInfo setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetSubnetResponseBodyContentVpdBaseInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetSubnetResponseBodyContentVpdBaseInfo setVpdId(String vpdId) {
            this.vpdId = vpdId;
            return this;
        }
        public String getVpdId() {
            return this.vpdId;
        }

    }

    public static class GetSubnetResponseBodyContent extends TeaModel {
        @NameInMap("Cidr")
        public String cidr;

        @NameInMap("Description")
        public String description;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        // ID
        @NameInMap("Id")
        public Long id;

        @NameInMap("LbCount")
        public Long lbCount;

        @NameInMap("Message")
        public String message;

        @NameInMap("Name")
        public String name;

        @NameInMap("NcCount")
        public Long ncCount;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("Status")
        public String status;

        @NameInMap("SubnetId")
        public String subnetId;

        @NameInMap("TenantId")
        public String tenantId;

        @NameInMap("Type")
        public String type;

        @NameInMap("VpdBaseInfo")
        public GetSubnetResponseBodyContentVpdBaseInfo vpdBaseInfo;

        @NameInMap("VpdId")
        public String vpdId;

        @NameInMap("ZoneId")
        public String zoneId;

        public static GetSubnetResponseBodyContent build(java.util.Map<String, ?> map) throws Exception {
            GetSubnetResponseBodyContent self = new GetSubnetResponseBodyContent();
            return TeaModel.build(map, self);
        }

        public GetSubnetResponseBodyContent setCidr(String cidr) {
            this.cidr = cidr;
            return this;
        }
        public String getCidr() {
            return this.cidr;
        }

        public GetSubnetResponseBodyContent setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetSubnetResponseBodyContent setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetSubnetResponseBodyContent setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetSubnetResponseBodyContent setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetSubnetResponseBodyContent setLbCount(Long lbCount) {
            this.lbCount = lbCount;
            return this;
        }
        public Long getLbCount() {
            return this.lbCount;
        }

        public GetSubnetResponseBodyContent setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public GetSubnetResponseBodyContent setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetSubnetResponseBodyContent setNcCount(Long ncCount) {
            this.ncCount = ncCount;
            return this;
        }
        public Long getNcCount() {
            return this.ncCount;
        }

        public GetSubnetResponseBodyContent setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetSubnetResponseBodyContent setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetSubnetResponseBodyContent setSubnetId(String subnetId) {
            this.subnetId = subnetId;
            return this;
        }
        public String getSubnetId() {
            return this.subnetId;
        }

        public GetSubnetResponseBodyContent setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public GetSubnetResponseBodyContent setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetSubnetResponseBodyContent setVpdBaseInfo(GetSubnetResponseBodyContentVpdBaseInfo vpdBaseInfo) {
            this.vpdBaseInfo = vpdBaseInfo;
            return this;
        }
        public GetSubnetResponseBodyContentVpdBaseInfo getVpdBaseInfo() {
            return this.vpdBaseInfo;
        }

        public GetSubnetResponseBodyContent setVpdId(String vpdId) {
            this.vpdId = vpdId;
            return this;
        }
        public String getVpdId() {
            return this.vpdId;
        }

        public GetSubnetResponseBodyContent setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
