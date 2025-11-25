// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeLocationInfoResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>340</p>
     */
    @NameInMap("CnCount")
    public Integer cnCount;

    @NameInMap("CnList")
    public java.util.List<DescribeLocationInfoResponseBodyCnList> cnList;

    @NameInMap("CnProvinceList")
    public java.util.List<DescribeLocationInfoResponseBodyCnProvinceList> cnProvinceList;

    /**
     * <strong>example:</strong>
     * <p>238</p>
     */
    @NameInMap("OverseasCount")
    public Integer overseasCount;

    @NameInMap("OverseasList")
    public java.util.List<DescribeLocationInfoResponseBodyOverseasList> overseasList;

    /**
     * <strong>example:</strong>
     * <p>CD3BE433-FAB0-55D8-918A-69B306****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeLocationInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLocationInfoResponseBody self = new DescribeLocationInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLocationInfoResponseBody setCnCount(Integer cnCount) {
        this.cnCount = cnCount;
        return this;
    }
    public Integer getCnCount() {
        return this.cnCount;
    }

    public DescribeLocationInfoResponseBody setCnList(java.util.List<DescribeLocationInfoResponseBodyCnList> cnList) {
        this.cnList = cnList;
        return this;
    }
    public java.util.List<DescribeLocationInfoResponseBodyCnList> getCnList() {
        return this.cnList;
    }

    public DescribeLocationInfoResponseBody setCnProvinceList(java.util.List<DescribeLocationInfoResponseBodyCnProvinceList> cnProvinceList) {
        this.cnProvinceList = cnProvinceList;
        return this;
    }
    public java.util.List<DescribeLocationInfoResponseBodyCnProvinceList> getCnProvinceList() {
        return this.cnProvinceList;
    }

    public DescribeLocationInfoResponseBody setOverseasCount(Integer overseasCount) {
        this.overseasCount = overseasCount;
        return this;
    }
    public Integer getOverseasCount() {
        return this.overseasCount;
    }

    public DescribeLocationInfoResponseBody setOverseasList(java.util.List<DescribeLocationInfoResponseBodyOverseasList> overseasList) {
        this.overseasList = overseasList;
        return this;
    }
    public java.util.List<DescribeLocationInfoResponseBodyOverseasList> getOverseasList() {
        return this.overseasList;
    }

    public DescribeLocationInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeLocationInfoResponseBodyCnList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>3301</p>
         */
        @NameInMap("LocId")
        public String locId;

        @NameInMap("LocName")
        public String locName;

        public static DescribeLocationInfoResponseBodyCnList build(java.util.Map<String, ?> map) throws Exception {
            DescribeLocationInfoResponseBodyCnList self = new DescribeLocationInfoResponseBodyCnList();
            return TeaModel.build(map, self);
        }

        public DescribeLocationInfoResponseBodyCnList setLocId(String locId) {
            this.locId = locId;
            return this;
        }
        public String getLocId() {
            return this.locId;
        }

        public DescribeLocationInfoResponseBodyCnList setLocName(String locName) {
            this.locName = locName;
            return this;
        }
        public String getLocName() {
            return this.locName;
        }

    }

    public static class DescribeLocationInfoResponseBodyCnProvinceListCities extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("LocId")
        public String locId;

        @NameInMap("LocName")
        public String locName;

        public static DescribeLocationInfoResponseBodyCnProvinceListCities build(java.util.Map<String, ?> map) throws Exception {
            DescribeLocationInfoResponseBodyCnProvinceListCities self = new DescribeLocationInfoResponseBodyCnProvinceListCities();
            return TeaModel.build(map, self);
        }

        public DescribeLocationInfoResponseBodyCnProvinceListCities setLocId(String locId) {
            this.locId = locId;
            return this;
        }
        public String getLocId() {
            return this.locId;
        }

        public DescribeLocationInfoResponseBodyCnProvinceListCities setLocName(String locName) {
            this.locName = locName;
            return this;
        }
        public String getLocName() {
            return this.locName;
        }

    }

    public static class DescribeLocationInfoResponseBodyCnProvinceList extends TeaModel {
        @NameInMap("Cities")
        public java.util.List<DescribeLocationInfoResponseBodyCnProvinceListCities> cities;

        @NameInMap("ProvinceName")
        public String provinceName;

        public static DescribeLocationInfoResponseBodyCnProvinceList build(java.util.Map<String, ?> map) throws Exception {
            DescribeLocationInfoResponseBodyCnProvinceList self = new DescribeLocationInfoResponseBodyCnProvinceList();
            return TeaModel.build(map, self);
        }

        public DescribeLocationInfoResponseBodyCnProvinceList setCities(java.util.List<DescribeLocationInfoResponseBodyCnProvinceListCities> cities) {
            this.cities = cities;
            return this;
        }
        public java.util.List<DescribeLocationInfoResponseBodyCnProvinceListCities> getCities() {
            return this.cities;
        }

        public DescribeLocationInfoResponseBodyCnProvinceList setProvinceName(String provinceName) {
            this.provinceName = provinceName;
            return this;
        }
        public String getProvinceName() {
            return this.provinceName;
        }

    }

    public static class DescribeLocationInfoResponseBodyOverseasList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>US</p>
         */
        @NameInMap("LocId")
        public String locId;

        @NameInMap("LocName")
        public String locName;

        public static DescribeLocationInfoResponseBodyOverseasList build(java.util.Map<String, ?> map) throws Exception {
            DescribeLocationInfoResponseBodyOverseasList self = new DescribeLocationInfoResponseBodyOverseasList();
            return TeaModel.build(map, self);
        }

        public DescribeLocationInfoResponseBodyOverseasList setLocId(String locId) {
            this.locId = locId;
            return this;
        }
        public String getLocId() {
            return this.locId;
        }

        public DescribeLocationInfoResponseBodyOverseasList setLocName(String locName) {
            this.locName = locName;
            return this;
        }
        public String getLocName() {
            return this.locName;
        }

    }

}
