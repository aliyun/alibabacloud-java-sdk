// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class ListCommonAreasResponseBody extends TeaModel {
    /**
     * <p>The information about the areas.</p>
     */
    @NameInMap("Areas")
    public java.util.List<ListCommonAreasResponseBodyAreas> areas;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListCommonAreasResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCommonAreasResponseBody self = new ListCommonAreasResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCommonAreasResponseBody setAreas(java.util.List<ListCommonAreasResponseBodyAreas> areas) {
        this.areas = areas;
        return this;
    }
    public java.util.List<ListCommonAreasResponseBodyAreas> getAreas() {
        return this.areas;
    }

    public ListCommonAreasResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListCommonAreasResponseBodyAreasRegionList extends TeaModel {
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

        public static ListCommonAreasResponseBodyAreasRegionList build(java.util.Map<String, ?> map) throws Exception {
            ListCommonAreasResponseBodyAreasRegionList self = new ListCommonAreasResponseBodyAreasRegionList();
            return TeaModel.build(map, self);
        }

        public ListCommonAreasResponseBodyAreasRegionList setLocalName(String localName) {
            this.localName = localName;
            return this;
        }
        public String getLocalName() {
            return this.localName;
        }

        public ListCommonAreasResponseBodyAreasRegionList setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

    public static class ListCommonAreasResponseBodyAreas extends TeaModel {
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
         * <p>The information about the regions.</p>
         */
        @NameInMap("RegionList")
        public java.util.List<ListCommonAreasResponseBodyAreasRegionList> regionList;

        public static ListCommonAreasResponseBodyAreas build(java.util.Map<String, ?> map) throws Exception {
            ListCommonAreasResponseBodyAreas self = new ListCommonAreasResponseBodyAreas();
            return TeaModel.build(map, self);
        }

        public ListCommonAreasResponseBodyAreas setAreaId(String areaId) {
            this.areaId = areaId;
            return this;
        }
        public String getAreaId() {
            return this.areaId;
        }

        public ListCommonAreasResponseBodyAreas setLocalName(String localName) {
            this.localName = localName;
            return this;
        }
        public String getLocalName() {
            return this.localName;
        }

        public ListCommonAreasResponseBodyAreas setRegionList(java.util.List<ListCommonAreasResponseBodyAreasRegionList> regionList) {
            this.regionList = regionList;
            return this;
        }
        public java.util.List<ListCommonAreasResponseBodyAreasRegionList> getRegionList() {
            return this.regionList;
        }

    }

}
