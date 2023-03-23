// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiearth_engine20220609.models;

import com.aliyun.tea.*;

public class ListDatasResponseBody extends TeaModel {
    @NameInMap("List")
    public java.util.List<ListDatasResponseBodyList> list;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListDatasResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDatasResponseBody self = new ListDatasResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDatasResponseBody setList(java.util.List<ListDatasResponseBodyList> list) {
        this.list = list;
        return this;
    }
    public java.util.List<ListDatasResponseBodyList> getList() {
        return this.list;
    }

    public ListDatasResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListDatasResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListDatasResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDatasResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListDatasResponseBodyListRasterBands extends TeaModel {
        @NameInMap("BandNo")
        public String bandNo;

        @NameInMap("Height")
        public Integer height;

        @NameInMap("Resolution")
        public Double resolution;

        @NameInMap("Width")
        public Integer width;

        public static ListDatasResponseBodyListRasterBands build(java.util.Map<String, ?> map) throws Exception {
            ListDatasResponseBodyListRasterBands self = new ListDatasResponseBodyListRasterBands();
            return TeaModel.build(map, self);
        }

        public ListDatasResponseBodyListRasterBands setBandNo(String bandNo) {
            this.bandNo = bandNo;
            return this;
        }
        public String getBandNo() {
            return this.bandNo;
        }

        public ListDatasResponseBodyListRasterBands setHeight(Integer height) {
            this.height = height;
            return this;
        }
        public Integer getHeight() {
            return this.height;
        }

        public ListDatasResponseBodyListRasterBands setResolution(Double resolution) {
            this.resolution = resolution;
            return this;
        }
        public Double getResolution() {
            return this.resolution;
        }

        public ListDatasResponseBodyListRasterBands setWidth(Integer width) {
            this.width = width;
            return this;
        }
        public Integer getWidth() {
            return this.width;
        }

    }

    public static class ListDatasResponseBodyListRaster extends TeaModel {
        @NameInMap("AcquisitionDateEnd")
        public String acquisitionDateEnd;

        @NameInMap("AcquisitionDateStart")
        public String acquisitionDateStart;

        @NameInMap("Bands")
        public java.util.List<ListDatasResponseBodyListRasterBands> bands;

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

        public static ListDatasResponseBodyListRaster build(java.util.Map<String, ?> map) throws Exception {
            ListDatasResponseBodyListRaster self = new ListDatasResponseBodyListRaster();
            return TeaModel.build(map, self);
        }

        public ListDatasResponseBodyListRaster setAcquisitionDateEnd(String acquisitionDateEnd) {
            this.acquisitionDateEnd = acquisitionDateEnd;
            return this;
        }
        public String getAcquisitionDateEnd() {
            return this.acquisitionDateEnd;
        }

        public ListDatasResponseBodyListRaster setAcquisitionDateStart(String acquisitionDateStart) {
            this.acquisitionDateStart = acquisitionDateStart;
            return this;
        }
        public String getAcquisitionDateStart() {
            return this.acquisitionDateStart;
        }

        public ListDatasResponseBodyListRaster setBands(java.util.List<ListDatasResponseBodyListRasterBands> bands) {
            this.bands = bands;
            return this;
        }
        public java.util.List<ListDatasResponseBodyListRasterBands> getBands() {
            return this.bands;
        }

        public ListDatasResponseBodyListRaster setBbox(java.util.List<Double> bbox) {
            this.bbox = bbox;
            return this;
        }
        public java.util.List<Double> getBbox() {
            return this.bbox;
        }

        public ListDatasResponseBodyListRaster setCloudCoverage(Integer cloudCoverage) {
            this.cloudCoverage = cloudCoverage;
            return this;
        }
        public Integer getCloudCoverage() {
            return this.cloudCoverage;
        }

        public ListDatasResponseBodyListRaster setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListDatasResponseBodyListRaster setPublishMsg(String publishMsg) {
            this.publishMsg = publishMsg;
            return this;
        }
        public String getPublishMsg() {
            return this.publishMsg;
        }

        public ListDatasResponseBodyListRaster setPublishStatus(String publishStatus) {
            this.publishStatus = publishStatus;
            return this;
        }
        public String getPublishStatus() {
            return this.publishStatus;
        }

        public ListDatasResponseBodyListRaster setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public ListDatasResponseBodyListRaster setStacId(String stacId) {
            this.stacId = stacId;
            return this;
        }
        public String getStacId() {
            return this.stacId;
        }

    }

    public static class ListDatasResponseBodyList extends TeaModel {
        @NameInMap("DataId")
        public String dataId;

        @NameInMap("Raster")
        public ListDatasResponseBodyListRaster raster;

        public static ListDatasResponseBodyList build(java.util.Map<String, ?> map) throws Exception {
            ListDatasResponseBodyList self = new ListDatasResponseBodyList();
            return TeaModel.build(map, self);
        }

        public ListDatasResponseBodyList setDataId(String dataId) {
            this.dataId = dataId;
            return this;
        }
        public String getDataId() {
            return this.dataId;
        }

        public ListDatasResponseBodyList setRaster(ListDatasResponseBodyListRaster raster) {
            this.raster = raster;
            return this;
        }
        public ListDatasResponseBodyListRaster getRaster() {
            return this.raster;
        }

    }

}
