// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class ListVccsResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Content")
    public ListVccsResponseBodyContent content;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static ListVccsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListVccsResponseBody self = new ListVccsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListVccsResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListVccsResponseBody setContent(ListVccsResponseBodyContent content) {
        this.content = content;
        return this;
    }
    public ListVccsResponseBodyContent getContent() {
        return this.content;
    }

    public ListVccsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListVccsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListVccsResponseBodyContentDataVpdBaseInfo extends TeaModel {
        @NameInMap("Cidr")
        public String cidr;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("Name")
        public String name;

        @NameInMap("VpdId")
        public String vpdId;

        public static ListVccsResponseBodyContentDataVpdBaseInfo build(java.util.Map<String, ?> map) throws Exception {
            ListVccsResponseBodyContentDataVpdBaseInfo self = new ListVccsResponseBodyContentDataVpdBaseInfo();
            return TeaModel.build(map, self);
        }

        public ListVccsResponseBodyContentDataVpdBaseInfo setCidr(String cidr) {
            this.cidr = cidr;
            return this;
        }
        public String getCidr() {
            return this.cidr;
        }

        public ListVccsResponseBodyContentDataVpdBaseInfo setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListVccsResponseBodyContentDataVpdBaseInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListVccsResponseBodyContentDataVpdBaseInfo setVpdId(String vpdId) {
            this.vpdId = vpdId;
            return this;
        }
        public String getVpdId() {
            return this.vpdId;
        }

    }

    public static class ListVccsResponseBodyContentData extends TeaModel {
        @NameInMap("AccessPointId")
        public String accessPointId;

        @NameInMap("BandwidthStr")
        public String bandwidthStr;

        @NameInMap("BgpCidr")
        public String bgpCidr;

        @NameInMap("CenId")
        public String cenId;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("LineOperator")
        public String lineOperator;

        @NameInMap("Message")
        public String message;

        @NameInMap("PortType")
        public String portType;

        @NameInMap("Rate")
        public Double rate;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("Spec")
        public String spec;

        @NameInMap("Status")
        public String status;

        @NameInMap("TenantId")
        public String tenantId;

        @NameInMap("VccId")
        public String vccId;

        @NameInMap("VccName")
        public String vccName;

        @NameInMap("VpcId")
        public String vpcId;

        @NameInMap("VpdBaseInfo")
        public ListVccsResponseBodyContentDataVpdBaseInfo vpdBaseInfo;

        @NameInMap("VpdId")
        public String vpdId;

        public static ListVccsResponseBodyContentData build(java.util.Map<String, ?> map) throws Exception {
            ListVccsResponseBodyContentData self = new ListVccsResponseBodyContentData();
            return TeaModel.build(map, self);
        }

        public ListVccsResponseBodyContentData setAccessPointId(String accessPointId) {
            this.accessPointId = accessPointId;
            return this;
        }
        public String getAccessPointId() {
            return this.accessPointId;
        }

        public ListVccsResponseBodyContentData setBandwidthStr(String bandwidthStr) {
            this.bandwidthStr = bandwidthStr;
            return this;
        }
        public String getBandwidthStr() {
            return this.bandwidthStr;
        }

        public ListVccsResponseBodyContentData setBgpCidr(String bgpCidr) {
            this.bgpCidr = bgpCidr;
            return this;
        }
        public String getBgpCidr() {
            return this.bgpCidr;
        }

        public ListVccsResponseBodyContentData setCenId(String cenId) {
            this.cenId = cenId;
            return this;
        }
        public String getCenId() {
            return this.cenId;
        }

        public ListVccsResponseBodyContentData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListVccsResponseBodyContentData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListVccsResponseBodyContentData setLineOperator(String lineOperator) {
            this.lineOperator = lineOperator;
            return this;
        }
        public String getLineOperator() {
            return this.lineOperator;
        }

        public ListVccsResponseBodyContentData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ListVccsResponseBodyContentData setPortType(String portType) {
            this.portType = portType;
            return this;
        }
        public String getPortType() {
            return this.portType;
        }

        public ListVccsResponseBodyContentData setRate(Double rate) {
            this.rate = rate;
            return this;
        }
        public Double getRate() {
            return this.rate;
        }

        public ListVccsResponseBodyContentData setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListVccsResponseBodyContentData setSpec(String spec) {
            this.spec = spec;
            return this;
        }
        public String getSpec() {
            return this.spec;
        }

        public ListVccsResponseBodyContentData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListVccsResponseBodyContentData setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public ListVccsResponseBodyContentData setVccId(String vccId) {
            this.vccId = vccId;
            return this;
        }
        public String getVccId() {
            return this.vccId;
        }

        public ListVccsResponseBodyContentData setVccName(String vccName) {
            this.vccName = vccName;
            return this;
        }
        public String getVccName() {
            return this.vccName;
        }

        public ListVccsResponseBodyContentData setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public ListVccsResponseBodyContentData setVpdBaseInfo(ListVccsResponseBodyContentDataVpdBaseInfo vpdBaseInfo) {
            this.vpdBaseInfo = vpdBaseInfo;
            return this;
        }
        public ListVccsResponseBodyContentDataVpdBaseInfo getVpdBaseInfo() {
            return this.vpdBaseInfo;
        }

        public ListVccsResponseBodyContentData setVpdId(String vpdId) {
            this.vpdId = vpdId;
            return this;
        }
        public String getVpdId() {
            return this.vpdId;
        }

    }

    public static class ListVccsResponseBodyContent extends TeaModel {
        @NameInMap("Data")
        public java.util.List<ListVccsResponseBodyContentData> data;

        @NameInMap("Total")
        public Long total;

        public static ListVccsResponseBodyContent build(java.util.Map<String, ?> map) throws Exception {
            ListVccsResponseBodyContent self = new ListVccsResponseBodyContent();
            return TeaModel.build(map, self);
        }

        public ListVccsResponseBodyContent setData(java.util.List<ListVccsResponseBodyContentData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<ListVccsResponseBodyContentData> getData() {
            return this.data;
        }

        public ListVccsResponseBodyContent setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
