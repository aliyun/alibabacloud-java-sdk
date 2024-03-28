// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class ListAvailableAccelerateAreasResponseBody extends TeaModel {
    /**
     * <p>The information about acceleration areas.</p>
     */
    @NameInMap("Areas")
    public java.util.List<ListAvailableAccelerateAreasResponseBodyAreas> areas;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListAvailableAccelerateAreasResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAvailableAccelerateAreasResponseBody self = new ListAvailableAccelerateAreasResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAvailableAccelerateAreasResponseBody setAreas(java.util.List<ListAvailableAccelerateAreasResponseBodyAreas> areas) {
        this.areas = areas;
        return this;
    }
    public java.util.List<ListAvailableAccelerateAreasResponseBodyAreas> getAreas() {
        return this.areas;
    }

    public ListAvailableAccelerateAreasResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListAvailableAccelerateAreasResponseBodyAreasRegionList extends TeaModel {
        /**
         * <p>Indicates whether the region is in the Chinese mainland. Valid values:</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false**</p>
         */
        @NameInMap("ChinaMainland")
        public Boolean chinaMainland;

        /**
         * <p>The line type of the elastic IP address (EIP) in the acceleration region. Valid values:</p>
         * <br>
         * <p>*   **BGP**: BGP (Multi-ISP) lines.</p>
         * <p>*   **BGP_PRO**: BGP (Multi-ISP) Pro lines.</p>
         */
        @NameInMap("IspTypeList")
        public java.util.List<String> ispTypeList;

        /**
         * <p>The acceleration region name.</p>
         */
        @NameInMap("LocalName")
        public String localName;

        /**
         * <p>Indicates whether multiple zones are supported. Valid values:</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false**</p>
         */
        @NameInMap("MultiAz")
        public Boolean multiAz;

        /**
         * <p>The ID of the acceleration region.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>Indicates whether IPv6 is supported. Valid values:</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false**</p>
         */
        @NameInMap("SupportIpv6")
        public Boolean supportIpv6;

        public static ListAvailableAccelerateAreasResponseBodyAreasRegionList build(java.util.Map<String, ?> map) throws Exception {
            ListAvailableAccelerateAreasResponseBodyAreasRegionList self = new ListAvailableAccelerateAreasResponseBodyAreasRegionList();
            return TeaModel.build(map, self);
        }

        public ListAvailableAccelerateAreasResponseBodyAreasRegionList setChinaMainland(Boolean chinaMainland) {
            this.chinaMainland = chinaMainland;
            return this;
        }
        public Boolean getChinaMainland() {
            return this.chinaMainland;
        }

        public ListAvailableAccelerateAreasResponseBodyAreasRegionList setIspTypeList(java.util.List<String> ispTypeList) {
            this.ispTypeList = ispTypeList;
            return this;
        }
        public java.util.List<String> getIspTypeList() {
            return this.ispTypeList;
        }

        public ListAvailableAccelerateAreasResponseBodyAreasRegionList setLocalName(String localName) {
            this.localName = localName;
            return this;
        }
        public String getLocalName() {
            return this.localName;
        }

        public ListAvailableAccelerateAreasResponseBodyAreasRegionList setMultiAz(Boolean multiAz) {
            this.multiAz = multiAz;
            return this;
        }
        public Boolean getMultiAz() {
            return this.multiAz;
        }

        public ListAvailableAccelerateAreasResponseBodyAreasRegionList setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListAvailableAccelerateAreasResponseBodyAreasRegionList setSupportIpv6(Boolean supportIpv6) {
            this.supportIpv6 = supportIpv6;
            return this;
        }
        public Boolean getSupportIpv6() {
            return this.supportIpv6;
        }

    }

    public static class ListAvailableAccelerateAreasResponseBodyAreas extends TeaModel {
        /**
         * <p>The ID of the acceleration area.</p>
         */
        @NameInMap("AreaId")
        public String areaId;

        /**
         * <p>The acceleration area name.</p>
         */
        @NameInMap("LocalName")
        public String localName;

        /**
         * <p>The information about acceleration regions.</p>
         */
        @NameInMap("RegionList")
        public java.util.List<ListAvailableAccelerateAreasResponseBodyAreasRegionList> regionList;

        public static ListAvailableAccelerateAreasResponseBodyAreas build(java.util.Map<String, ?> map) throws Exception {
            ListAvailableAccelerateAreasResponseBodyAreas self = new ListAvailableAccelerateAreasResponseBodyAreas();
            return TeaModel.build(map, self);
        }

        public ListAvailableAccelerateAreasResponseBodyAreas setAreaId(String areaId) {
            this.areaId = areaId;
            return this;
        }
        public String getAreaId() {
            return this.areaId;
        }

        public ListAvailableAccelerateAreasResponseBodyAreas setLocalName(String localName) {
            this.localName = localName;
            return this;
        }
        public String getLocalName() {
            return this.localName;
        }

        public ListAvailableAccelerateAreasResponseBodyAreas setRegionList(java.util.List<ListAvailableAccelerateAreasResponseBodyAreasRegionList> regionList) {
            this.regionList = regionList;
            return this;
        }
        public java.util.List<ListAvailableAccelerateAreasResponseBodyAreasRegionList> getRegionList() {
            return this.regionList;
        }

    }

}
