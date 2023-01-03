// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class ListSubnetsResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Content")
    public ListSubnetsResponseBodyContent content;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static ListSubnetsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSubnetsResponseBody self = new ListSubnetsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSubnetsResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListSubnetsResponseBody setContent(ListSubnetsResponseBodyContent content) {
        this.content = content;
        return this;
    }
    public ListSubnetsResponseBodyContent getContent() {
        return this.content;
    }

    public ListSubnetsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListSubnetsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListSubnetsResponseBodyContentDataVpdBaseInfo extends TeaModel {
        @NameInMap("Cidr")
        public String cidr;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("Name")
        public String name;

        @NameInMap("VpdId")
        public String vpdId;

        public static ListSubnetsResponseBodyContentDataVpdBaseInfo build(java.util.Map<String, ?> map) throws Exception {
            ListSubnetsResponseBodyContentDataVpdBaseInfo self = new ListSubnetsResponseBodyContentDataVpdBaseInfo();
            return TeaModel.build(map, self);
        }

        public ListSubnetsResponseBodyContentDataVpdBaseInfo setCidr(String cidr) {
            this.cidr = cidr;
            return this;
        }
        public String getCidr() {
            return this.cidr;
        }

        public ListSubnetsResponseBodyContentDataVpdBaseInfo setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListSubnetsResponseBodyContentDataVpdBaseInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListSubnetsResponseBodyContentDataVpdBaseInfo setVpdId(String vpdId) {
            this.vpdId = vpdId;
            return this;
        }
        public String getVpdId() {
            return this.vpdId;
        }

    }

    public static class ListSubnetsResponseBodyContentData extends TeaModel {
        @NameInMap("Cidr")
        public String cidr;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("Id")
        public Long id;

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
        public ListSubnetsResponseBodyContentDataVpdBaseInfo vpdBaseInfo;

        @NameInMap("VpdId")
        public String vpdId;

        @NameInMap("ZoneId")
        public String zoneId;

        public static ListSubnetsResponseBodyContentData build(java.util.Map<String, ?> map) throws Exception {
            ListSubnetsResponseBodyContentData self = new ListSubnetsResponseBodyContentData();
            return TeaModel.build(map, self);
        }

        public ListSubnetsResponseBodyContentData setCidr(String cidr) {
            this.cidr = cidr;
            return this;
        }
        public String getCidr() {
            return this.cidr;
        }

        public ListSubnetsResponseBodyContentData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListSubnetsResponseBodyContentData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListSubnetsResponseBodyContentData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListSubnetsResponseBodyContentData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ListSubnetsResponseBodyContentData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListSubnetsResponseBodyContentData setNcCount(Long ncCount) {
            this.ncCount = ncCount;
            return this;
        }
        public Long getNcCount() {
            return this.ncCount;
        }

        public ListSubnetsResponseBodyContentData setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListSubnetsResponseBodyContentData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListSubnetsResponseBodyContentData setSubnetId(String subnetId) {
            this.subnetId = subnetId;
            return this;
        }
        public String getSubnetId() {
            return this.subnetId;
        }

        public ListSubnetsResponseBodyContentData setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public ListSubnetsResponseBodyContentData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListSubnetsResponseBodyContentData setVpdBaseInfo(ListSubnetsResponseBodyContentDataVpdBaseInfo vpdBaseInfo) {
            this.vpdBaseInfo = vpdBaseInfo;
            return this;
        }
        public ListSubnetsResponseBodyContentDataVpdBaseInfo getVpdBaseInfo() {
            return this.vpdBaseInfo;
        }

        public ListSubnetsResponseBodyContentData setVpdId(String vpdId) {
            this.vpdId = vpdId;
            return this;
        }
        public String getVpdId() {
            return this.vpdId;
        }

        public ListSubnetsResponseBodyContentData setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class ListSubnetsResponseBodyContent extends TeaModel {
        @NameInMap("Data")
        public java.util.List<ListSubnetsResponseBodyContentData> data;

        @NameInMap("Total")
        public Long total;

        public static ListSubnetsResponseBodyContent build(java.util.Map<String, ?> map) throws Exception {
            ListSubnetsResponseBodyContent self = new ListSubnetsResponseBodyContent();
            return TeaModel.build(map, self);
        }

        public ListSubnetsResponseBodyContent setData(java.util.List<ListSubnetsResponseBodyContentData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<ListSubnetsResponseBodyContentData> getData() {
            return this.data;
        }

        public ListSubnetsResponseBodyContent setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
