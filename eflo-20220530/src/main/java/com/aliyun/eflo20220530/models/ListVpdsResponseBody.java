// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class ListVpdsResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Content")
    public ListVpdsResponseBodyContent content;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static ListVpdsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListVpdsResponseBody self = new ListVpdsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListVpdsResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListVpdsResponseBody setContent(ListVpdsResponseBodyContent content) {
        this.content = content;
        return this;
    }
    public ListVpdsResponseBodyContent getContent() {
        return this.content;
    }

    public ListVpdsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListVpdsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListVpdsResponseBodyContentData extends TeaModel {
        @NameInMap("Cidr")
        public String cidr;

        @NameInMap("Dependence")
        public java.util.Map<String, ?> dependence;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("Message")
        public String message;

        @NameInMap("Name")
        public String name;

        @NameInMap("NcCount")
        public Integer ncCount;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("Route")
        public Integer route;

        @NameInMap("ServiceCidr")
        public String serviceCidr;

        @NameInMap("Status")
        public String status;

        @NameInMap("SubnetCount")
        public Integer subnetCount;

        // vpd id
        @NameInMap("VpdId")
        public String vpdId;

        public static ListVpdsResponseBodyContentData build(java.util.Map<String, ?> map) throws Exception {
            ListVpdsResponseBodyContentData self = new ListVpdsResponseBodyContentData();
            return TeaModel.build(map, self);
        }

        public ListVpdsResponseBodyContentData setCidr(String cidr) {
            this.cidr = cidr;
            return this;
        }
        public String getCidr() {
            return this.cidr;
        }

        public ListVpdsResponseBodyContentData setDependence(java.util.Map<String, ?> dependence) {
            this.dependence = dependence;
            return this;
        }
        public java.util.Map<String, ?> getDependence() {
            return this.dependence;
        }

        public ListVpdsResponseBodyContentData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListVpdsResponseBodyContentData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListVpdsResponseBodyContentData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ListVpdsResponseBodyContentData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListVpdsResponseBodyContentData setNcCount(Integer ncCount) {
            this.ncCount = ncCount;
            return this;
        }
        public Integer getNcCount() {
            return this.ncCount;
        }

        public ListVpdsResponseBodyContentData setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListVpdsResponseBodyContentData setRoute(Integer route) {
            this.route = route;
            return this;
        }
        public Integer getRoute() {
            return this.route;
        }

        public ListVpdsResponseBodyContentData setServiceCidr(String serviceCidr) {
            this.serviceCidr = serviceCidr;
            return this;
        }
        public String getServiceCidr() {
            return this.serviceCidr;
        }

        public ListVpdsResponseBodyContentData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListVpdsResponseBodyContentData setSubnetCount(Integer subnetCount) {
            this.subnetCount = subnetCount;
            return this;
        }
        public Integer getSubnetCount() {
            return this.subnetCount;
        }

        public ListVpdsResponseBodyContentData setVpdId(String vpdId) {
            this.vpdId = vpdId;
            return this;
        }
        public String getVpdId() {
            return this.vpdId;
        }

    }

    public static class ListVpdsResponseBodyContent extends TeaModel {
        @NameInMap("Data")
        public java.util.List<ListVpdsResponseBodyContentData> data;

        @NameInMap("Total")
        public Long total;

        public static ListVpdsResponseBodyContent build(java.util.Map<String, ?> map) throws Exception {
            ListVpdsResponseBodyContent self = new ListVpdsResponseBodyContent();
            return TeaModel.build(map, self);
        }

        public ListVpdsResponseBodyContent setData(java.util.List<ListVpdsResponseBodyContentData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<ListVpdsResponseBodyContentData> getData() {
            return this.data;
        }

        public ListVpdsResponseBodyContent setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
