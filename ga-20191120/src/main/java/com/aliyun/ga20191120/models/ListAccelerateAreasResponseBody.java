// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class ListAccelerateAreasResponseBody extends TeaModel {
    /**
     * <p>The information about the areas.</p>
     */
    @NameInMap("Areas")
    public java.util.List<ListAccelerateAreasResponseBodyAreas> areas;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListAccelerateAreasResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAccelerateAreasResponseBody self = new ListAccelerateAreasResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAccelerateAreasResponseBody setAreas(java.util.List<ListAccelerateAreasResponseBodyAreas> areas) {
        this.areas = areas;
        return this;
    }
    public java.util.List<ListAccelerateAreasResponseBodyAreas> getAreas() {
        return this.areas;
    }

    public ListAccelerateAreasResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListAccelerateAreasResponseBodyAreasRegionList extends TeaModel {
        /**
         * <p>The region name.</p>
         */
        @NameInMap("LocalName")
        public String localName;

        /**
         * <p>The region ID.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        public static ListAccelerateAreasResponseBodyAreasRegionList build(java.util.Map<String, ?> map) throws Exception {
            ListAccelerateAreasResponseBodyAreasRegionList self = new ListAccelerateAreasResponseBodyAreasRegionList();
            return TeaModel.build(map, self);
        }

        public ListAccelerateAreasResponseBodyAreasRegionList setLocalName(String localName) {
            this.localName = localName;
            return this;
        }
        public String getLocalName() {
            return this.localName;
        }

        public ListAccelerateAreasResponseBodyAreasRegionList setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

    public static class ListAccelerateAreasResponseBodyAreas extends TeaModel {
        /**
         * <p>The area ID.</p>
         */
        @NameInMap("AreaId")
        public String areaId;

        /**
         * <p>The area name.</p>
         */
        @NameInMap("LocalName")
        public String localName;

        /**
         * <p>The regions in the acceleration area.</p>
         */
        @NameInMap("RegionList")
        public java.util.List<ListAccelerateAreasResponseBodyAreasRegionList> regionList;

        public static ListAccelerateAreasResponseBodyAreas build(java.util.Map<String, ?> map) throws Exception {
            ListAccelerateAreasResponseBodyAreas self = new ListAccelerateAreasResponseBodyAreas();
            return TeaModel.build(map, self);
        }

        public ListAccelerateAreasResponseBodyAreas setAreaId(String areaId) {
            this.areaId = areaId;
            return this;
        }
        public String getAreaId() {
            return this.areaId;
        }

        public ListAccelerateAreasResponseBodyAreas setLocalName(String localName) {
            this.localName = localName;
            return this;
        }
        public String getLocalName() {
            return this.localName;
        }

        public ListAccelerateAreasResponseBodyAreas setRegionList(java.util.List<ListAccelerateAreasResponseBodyAreasRegionList> regionList) {
            this.regionList = regionList;
            return this;
        }
        public java.util.List<ListAccelerateAreasResponseBodyAreasRegionList> getRegionList() {
            return this.regionList;
        }

    }

}
