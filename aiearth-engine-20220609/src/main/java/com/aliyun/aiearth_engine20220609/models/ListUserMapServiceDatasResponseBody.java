// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiearth_engine20220609.models;

import com.aliyun.tea.*;

public class ListUserMapServiceDatasResponseBody extends TeaModel {
    @NameInMap("List")
    public java.util.List<ListUserMapServiceDatasResponseBodyList> list;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListUserMapServiceDatasResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListUserMapServiceDatasResponseBody self = new ListUserMapServiceDatasResponseBody();
        return TeaModel.build(map, self);
    }

    public ListUserMapServiceDatasResponseBody setList(java.util.List<ListUserMapServiceDatasResponseBodyList> list) {
        this.list = list;
        return this;
    }
    public java.util.List<ListUserMapServiceDatasResponseBodyList> getList() {
        return this.list;
    }

    public ListUserMapServiceDatasResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListUserMapServiceDatasResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListUserMapServiceDatasResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListUserMapServiceDatasResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListUserMapServiceDatasResponseBodyList extends TeaModel {
        @NameInMap("Address")
        public String address;

        @NameInMap("DataId")
        public String dataId;

        @NameInMap("MapType")
        public String mapType;

        @NameInMap("Name")
        public String name;

        @NameInMap("ProjectionType")
        public String projectionType;

        @NameInMap("PublishMsg")
        public String publishMsg;

        @NameInMap("PublishStatus")
        public String publishStatus;

        @NameInMap("ZoomLevelMax")
        public Integer zoomLevelMax;

        @NameInMap("ZoomLevelMin")
        public Integer zoomLevelMin;

        public static ListUserMapServiceDatasResponseBodyList build(java.util.Map<String, ?> map) throws Exception {
            ListUserMapServiceDatasResponseBodyList self = new ListUserMapServiceDatasResponseBodyList();
            return TeaModel.build(map, self);
        }

        public ListUserMapServiceDatasResponseBodyList setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public ListUserMapServiceDatasResponseBodyList setDataId(String dataId) {
            this.dataId = dataId;
            return this;
        }
        public String getDataId() {
            return this.dataId;
        }

        public ListUserMapServiceDatasResponseBodyList setMapType(String mapType) {
            this.mapType = mapType;
            return this;
        }
        public String getMapType() {
            return this.mapType;
        }

        public ListUserMapServiceDatasResponseBodyList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListUserMapServiceDatasResponseBodyList setProjectionType(String projectionType) {
            this.projectionType = projectionType;
            return this;
        }
        public String getProjectionType() {
            return this.projectionType;
        }

        public ListUserMapServiceDatasResponseBodyList setPublishMsg(String publishMsg) {
            this.publishMsg = publishMsg;
            return this;
        }
        public String getPublishMsg() {
            return this.publishMsg;
        }

        public ListUserMapServiceDatasResponseBodyList setPublishStatus(String publishStatus) {
            this.publishStatus = publishStatus;
            return this;
        }
        public String getPublishStatus() {
            return this.publishStatus;
        }

        public ListUserMapServiceDatasResponseBodyList setZoomLevelMax(Integer zoomLevelMax) {
            this.zoomLevelMax = zoomLevelMax;
            return this;
        }
        public Integer getZoomLevelMax() {
            return this.zoomLevelMax;
        }

        public ListUserMapServiceDatasResponseBodyList setZoomLevelMin(Integer zoomLevelMin) {
            this.zoomLevelMin = zoomLevelMin;
            return this;
        }
        public Integer getZoomLevelMin() {
            return this.zoomLevelMin;
        }

    }

}
