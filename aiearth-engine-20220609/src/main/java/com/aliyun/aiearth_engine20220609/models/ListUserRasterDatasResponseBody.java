// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiearth_engine20220609.models;

import com.aliyun.tea.*;

public class ListUserRasterDatasResponseBody extends TeaModel {
    @NameInMap("List")
    public java.util.List<ListUserRasterDatasResponseBodyList> list;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListUserRasterDatasResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListUserRasterDatasResponseBody self = new ListUserRasterDatasResponseBody();
        return TeaModel.build(map, self);
    }

    public ListUserRasterDatasResponseBody setList(java.util.List<ListUserRasterDatasResponseBodyList> list) {
        this.list = list;
        return this;
    }
    public java.util.List<ListUserRasterDatasResponseBodyList> getList() {
        return this.list;
    }

    public ListUserRasterDatasResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListUserRasterDatasResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListUserRasterDatasResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListUserRasterDatasResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListUserRasterDatasResponseBodyListRasterBands extends TeaModel {
        @NameInMap("BandNo")
        public String bandNo;

        @NameInMap("Height")
        public Integer height;

        @NameInMap("Resolution")
        public Double resolution;

        @NameInMap("Width")
        public Integer width;

        public static ListUserRasterDatasResponseBodyListRasterBands build(java.util.Map<String, ?> map) throws Exception {
            ListUserRasterDatasResponseBodyListRasterBands self = new ListUserRasterDatasResponseBodyListRasterBands();
            return TeaModel.build(map, self);
        }

        public ListUserRasterDatasResponseBodyListRasterBands setBandNo(String bandNo) {
            this.bandNo = bandNo;
            return this;
        }
        public String getBandNo() {
            return this.bandNo;
        }

        public ListUserRasterDatasResponseBodyListRasterBands setHeight(Integer height) {
            this.height = height;
            return this;
        }
        public Integer getHeight() {
            return this.height;
        }

        public ListUserRasterDatasResponseBodyListRasterBands setResolution(Double resolution) {
            this.resolution = resolution;
            return this;
        }
        public Double getResolution() {
            return this.resolution;
        }

        public ListUserRasterDatasResponseBodyListRasterBands setWidth(Integer width) {
            this.width = width;
            return this;
        }
        public Integer getWidth() {
            return this.width;
        }

    }

    public static class ListUserRasterDatasResponseBodyListRaster extends TeaModel {
        @NameInMap("AcquisitionDateEnd")
        public String acquisitionDateEnd;

        @NameInMap("AcquisitionDateStart")
        public String acquisitionDateStart;

        @NameInMap("Bands")
        public java.util.List<ListUserRasterDatasResponseBodyListRasterBands> bands;

        @NameInMap("Bbox")
        public java.util.List<Double> bbox;

        @NameInMap("CloudCoverage")
        public Integer cloudCoverage;

        @NameInMap("Name")
        public String name;

        @NameInMap("PublishMsg")
        public String publishMsg;

        @NameInMap("PublishStatus")
        public String publishStatus;

        @NameInMap("SourceType")
        public String sourceType;

        @NameInMap("StacId")
        public String stacId;

        public static ListUserRasterDatasResponseBodyListRaster build(java.util.Map<String, ?> map) throws Exception {
            ListUserRasterDatasResponseBodyListRaster self = new ListUserRasterDatasResponseBodyListRaster();
            return TeaModel.build(map, self);
        }

        public ListUserRasterDatasResponseBodyListRaster setAcquisitionDateEnd(String acquisitionDateEnd) {
            this.acquisitionDateEnd = acquisitionDateEnd;
            return this;
        }
        public String getAcquisitionDateEnd() {
            return this.acquisitionDateEnd;
        }

        public ListUserRasterDatasResponseBodyListRaster setAcquisitionDateStart(String acquisitionDateStart) {
            this.acquisitionDateStart = acquisitionDateStart;
            return this;
        }
        public String getAcquisitionDateStart() {
            return this.acquisitionDateStart;
        }

        public ListUserRasterDatasResponseBodyListRaster setBands(java.util.List<ListUserRasterDatasResponseBodyListRasterBands> bands) {
            this.bands = bands;
            return this;
        }
        public java.util.List<ListUserRasterDatasResponseBodyListRasterBands> getBands() {
            return this.bands;
        }

        public ListUserRasterDatasResponseBodyListRaster setBbox(java.util.List<Double> bbox) {
            this.bbox = bbox;
            return this;
        }
        public java.util.List<Double> getBbox() {
            return this.bbox;
        }

        public ListUserRasterDatasResponseBodyListRaster setCloudCoverage(Integer cloudCoverage) {
            this.cloudCoverage = cloudCoverage;
            return this;
        }
        public Integer getCloudCoverage() {
            return this.cloudCoverage;
        }

        public ListUserRasterDatasResponseBodyListRaster setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListUserRasterDatasResponseBodyListRaster setPublishMsg(String publishMsg) {
            this.publishMsg = publishMsg;
            return this;
        }
        public String getPublishMsg() {
            return this.publishMsg;
        }

        public ListUserRasterDatasResponseBodyListRaster setPublishStatus(String publishStatus) {
            this.publishStatus = publishStatus;
            return this;
        }
        public String getPublishStatus() {
            return this.publishStatus;
        }

        public ListUserRasterDatasResponseBodyListRaster setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public ListUserRasterDatasResponseBodyListRaster setStacId(String stacId) {
            this.stacId = stacId;
            return this;
        }
        public String getStacId() {
            return this.stacId;
        }

    }

    public static class ListUserRasterDatasResponseBodyList extends TeaModel {
        @NameInMap("DataId")
        public String dataId;

        @NameInMap("Raster")
        public ListUserRasterDatasResponseBodyListRaster raster;

        public static ListUserRasterDatasResponseBodyList build(java.util.Map<String, ?> map) throws Exception {
            ListUserRasterDatasResponseBodyList self = new ListUserRasterDatasResponseBodyList();
            return TeaModel.build(map, self);
        }

        public ListUserRasterDatasResponseBodyList setDataId(String dataId) {
            this.dataId = dataId;
            return this;
        }
        public String getDataId() {
            return this.dataId;
        }

        public ListUserRasterDatasResponseBodyList setRaster(ListUserRasterDatasResponseBodyListRaster raster) {
            this.raster = raster;
            return this;
        }
        public ListUserRasterDatasResponseBodyListRaster getRaster() {
            return this.raster;
        }

    }

}
