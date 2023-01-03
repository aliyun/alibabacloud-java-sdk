// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class GetVpdResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Content")
    public GetVpdResponseBodyContent content;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static GetVpdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetVpdResponseBody self = new GetVpdResponseBody();
        return TeaModel.build(map, self);
    }

    public GetVpdResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetVpdResponseBody setContent(GetVpdResponseBodyContent content) {
        this.content = content;
        return this;
    }
    public GetVpdResponseBodyContent getContent() {
        return this.content;
    }

    public GetVpdResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetVpdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetVpdResponseBodyContent extends TeaModel {
        @NameInMap("Cidr")
        public String cidr;

        @NameInMap("Description")
        public String description;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

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

        @NameInMap("Route")
        public Integer route;

        @NameInMap("ServiceCidr")
        public String serviceCidr;

        @NameInMap("Status")
        public String status;

        @NameInMap("SubnetCount")
        public Long subnetCount;

        @NameInMap("VccCount")
        public Long vccCount;

        @NameInMap("VpdId")
        public String vpdId;

        public static GetVpdResponseBodyContent build(java.util.Map<String, ?> map) throws Exception {
            GetVpdResponseBodyContent self = new GetVpdResponseBodyContent();
            return TeaModel.build(map, self);
        }

        public GetVpdResponseBodyContent setCidr(String cidr) {
            this.cidr = cidr;
            return this;
        }
        public String getCidr() {
            return this.cidr;
        }

        public GetVpdResponseBodyContent setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetVpdResponseBodyContent setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetVpdResponseBodyContent setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetVpdResponseBodyContent setLbCount(Long lbCount) {
            this.lbCount = lbCount;
            return this;
        }
        public Long getLbCount() {
            return this.lbCount;
        }

        public GetVpdResponseBodyContent setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public GetVpdResponseBodyContent setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetVpdResponseBodyContent setNcCount(Long ncCount) {
            this.ncCount = ncCount;
            return this;
        }
        public Long getNcCount() {
            return this.ncCount;
        }

        public GetVpdResponseBodyContent setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetVpdResponseBodyContent setRoute(Integer route) {
            this.route = route;
            return this;
        }
        public Integer getRoute() {
            return this.route;
        }

        public GetVpdResponseBodyContent setServiceCidr(String serviceCidr) {
            this.serviceCidr = serviceCidr;
            return this;
        }
        public String getServiceCidr() {
            return this.serviceCidr;
        }

        public GetVpdResponseBodyContent setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetVpdResponseBodyContent setSubnetCount(Long subnetCount) {
            this.subnetCount = subnetCount;
            return this;
        }
        public Long getSubnetCount() {
            return this.subnetCount;
        }

        public GetVpdResponseBodyContent setVccCount(Long vccCount) {
            this.vccCount = vccCount;
            return this;
        }
        public Long getVccCount() {
            return this.vccCount;
        }

        public GetVpdResponseBodyContent setVpdId(String vpdId) {
            this.vpdId = vpdId;
            return this;
        }
        public String getVpdId() {
            return this.vpdId;
        }

    }

}
