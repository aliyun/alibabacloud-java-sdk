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
         * <p>Whether China Mainland.</p>
         */
        @NameInMap("ChinaMainland")
        public Boolean chinaMainland;

        /**
         * <p>The line types of EIPs in the acceleration region.</p>
         * <br>
         * <p>*   **BGP**: BGP (Multi-ISP) lines</p>
         * <p>*   **BGP_PRO**: BGP (Multi-ISP) Pro lines</p>
         * <br>
         * <p>If you have the permissions to use single-ISP bandwidth, one of the following values may be returned:</p>
         * <br>
         * <p>*   **ChinaTelecom**: China Telecom (single ISP)</p>
         * <p>*   **ChinaUnicom**: China Unicom (single ISP)</p>
         * <p>*   **ChinaMobile**: China Mobile (single ISP)</p>
         * <p>*   **ChinaTelecom_L2**: China Telecom_L2 (single ISP)</p>
         * <p>*   **ChinaUnicom_L2**: China Unicom_L2 (single ISP)</p>
         * <p>*   **ChinaMobile_L2**: China Mobile_L2 (single ISP)</p>
         * <br>
         * <p>> Different acceleration regions support different single-ISP BGP lines.</p>
         */
        @NameInMap("IspTypeList")
        public java.util.List<String> ispTypeList;

        /**
         * <p>The name of the acceleration region.</p>
         */
        @NameInMap("LocalName")
        public String localName;

        /**
         * <p>The ID of the acceleration region.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>Ipv6 supported, Valid values:</p>
         * <br>
         * <p>- true</p>
         * <p>- false</p>
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
         * <p>The name of the acceleration area.</p>
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
