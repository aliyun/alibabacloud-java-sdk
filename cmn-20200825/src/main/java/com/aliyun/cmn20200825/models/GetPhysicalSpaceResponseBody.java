// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class GetPhysicalSpaceResponseBody extends TeaModel {
    @NameInMap("PhysicalSpace")
    public GetPhysicalSpaceResponseBodyPhysicalSpace physicalSpace;

    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetPhysicalSpaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPhysicalSpaceResponseBody self = new GetPhysicalSpaceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPhysicalSpaceResponseBody setPhysicalSpace(GetPhysicalSpaceResponseBodyPhysicalSpace physicalSpace) {
        this.physicalSpace = physicalSpace;
        return this;
    }
    public GetPhysicalSpaceResponseBodyPhysicalSpace getPhysicalSpace() {
        return this.physicalSpace;
    }

    public GetPhysicalSpaceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetPhysicalSpaceResponseBodyPhysicalSpace extends TeaModel {
        @NameInMap("Address")
        public String address;

        @NameInMap("City")
        public String city;

        @NameInMap("Country")
        public String country;

        @NameInMap("Owner")
        public String owner;

        @NameInMap("PhysicalSpaceId")
        public String physicalSpaceId;

        @NameInMap("PhysicalSpaceName")
        public String physicalSpaceName;

        @NameInMap("Province")
        public String province;

        @NameInMap("Remark")
        public String remark;

        @NameInMap("SecurityDomainList")
        public java.util.List<String> securityDomainList;

        @NameInMap("SpaceAbbreviation")
        public String spaceAbbreviation;

        @NameInMap("SpaceType")
        public String spaceType;

        public static GetPhysicalSpaceResponseBodyPhysicalSpace build(java.util.Map<String, ?> map) throws Exception {
            GetPhysicalSpaceResponseBodyPhysicalSpace self = new GetPhysicalSpaceResponseBodyPhysicalSpace();
            return TeaModel.build(map, self);
        }

        public GetPhysicalSpaceResponseBodyPhysicalSpace setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public GetPhysicalSpaceResponseBodyPhysicalSpace setCity(String city) {
            this.city = city;
            return this;
        }
        public String getCity() {
            return this.city;
        }

        public GetPhysicalSpaceResponseBodyPhysicalSpace setCountry(String country) {
            this.country = country;
            return this;
        }
        public String getCountry() {
            return this.country;
        }

        public GetPhysicalSpaceResponseBodyPhysicalSpace setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public GetPhysicalSpaceResponseBodyPhysicalSpace setPhysicalSpaceId(String physicalSpaceId) {
            this.physicalSpaceId = physicalSpaceId;
            return this;
        }
        public String getPhysicalSpaceId() {
            return this.physicalSpaceId;
        }

        public GetPhysicalSpaceResponseBodyPhysicalSpace setPhysicalSpaceName(String physicalSpaceName) {
            this.physicalSpaceName = physicalSpaceName;
            return this;
        }
        public String getPhysicalSpaceName() {
            return this.physicalSpaceName;
        }

        public GetPhysicalSpaceResponseBodyPhysicalSpace setProvince(String province) {
            this.province = province;
            return this;
        }
        public String getProvince() {
            return this.province;
        }

        public GetPhysicalSpaceResponseBodyPhysicalSpace setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public GetPhysicalSpaceResponseBodyPhysicalSpace setSecurityDomainList(java.util.List<String> securityDomainList) {
            this.securityDomainList = securityDomainList;
            return this;
        }
        public java.util.List<String> getSecurityDomainList() {
            return this.securityDomainList;
        }

        public GetPhysicalSpaceResponseBodyPhysicalSpace setSpaceAbbreviation(String spaceAbbreviation) {
            this.spaceAbbreviation = spaceAbbreviation;
            return this;
        }
        public String getSpaceAbbreviation() {
            return this.spaceAbbreviation;
        }

        public GetPhysicalSpaceResponseBodyPhysicalSpace setSpaceType(String spaceType) {
            this.spaceType = spaceType;
            return this;
        }
        public String getSpaceType() {
            return this.spaceType;
        }

    }

}
