// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiearth_engine20220609.models;

import com.aliyun.tea.*;

public class ListUserVectorDatasResponseBody extends TeaModel {
    @NameInMap("List")
    public java.util.List<ListUserVectorDatasResponseBodyList> list;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListUserVectorDatasResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListUserVectorDatasResponseBody self = new ListUserVectorDatasResponseBody();
        return TeaModel.build(map, self);
    }

    public ListUserVectorDatasResponseBody setList(java.util.List<ListUserVectorDatasResponseBodyList> list) {
        this.list = list;
        return this;
    }
    public java.util.List<ListUserVectorDatasResponseBodyList> getList() {
        return this.list;
    }

    public ListUserVectorDatasResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListUserVectorDatasResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListUserVectorDatasResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListUserVectorDatasResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListUserVectorDatasResponseBodyListVector extends TeaModel {
        @NameInMap("Bbox")
        public java.util.List<Double> bbox;

        @NameInMap("Name")
        public String name;

        @NameInMap("PublishMsg")
        public String publishMsg;

        @NameInMap("PublishStatus")
        public String publishStatus;

        @NameInMap("StacId")
        public String stacId;

        public static ListUserVectorDatasResponseBodyListVector build(java.util.Map<String, ?> map) throws Exception {
            ListUserVectorDatasResponseBodyListVector self = new ListUserVectorDatasResponseBodyListVector();
            return TeaModel.build(map, self);
        }

        public ListUserVectorDatasResponseBodyListVector setBbox(java.util.List<Double> bbox) {
            this.bbox = bbox;
            return this;
        }
        public java.util.List<Double> getBbox() {
            return this.bbox;
        }

        public ListUserVectorDatasResponseBodyListVector setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListUserVectorDatasResponseBodyListVector setPublishMsg(String publishMsg) {
            this.publishMsg = publishMsg;
            return this;
        }
        public String getPublishMsg() {
            return this.publishMsg;
        }

        public ListUserVectorDatasResponseBodyListVector setPublishStatus(String publishStatus) {
            this.publishStatus = publishStatus;
            return this;
        }
        public String getPublishStatus() {
            return this.publishStatus;
        }

        public ListUserVectorDatasResponseBodyListVector setStacId(String stacId) {
            this.stacId = stacId;
            return this;
        }
        public String getStacId() {
            return this.stacId;
        }

    }

    public static class ListUserVectorDatasResponseBodyList extends TeaModel {
        @NameInMap("DataId")
        public String dataId;

        @NameInMap("Vector")
        public ListUserVectorDatasResponseBodyListVector vector;

        public static ListUserVectorDatasResponseBodyList build(java.util.Map<String, ?> map) throws Exception {
            ListUserVectorDatasResponseBodyList self = new ListUserVectorDatasResponseBodyList();
            return TeaModel.build(map, self);
        }

        public ListUserVectorDatasResponseBodyList setDataId(String dataId) {
            this.dataId = dataId;
            return this;
        }
        public String getDataId() {
            return this.dataId;
        }

        public ListUserVectorDatasResponseBodyList setVector(ListUserVectorDatasResponseBodyListVector vector) {
            this.vector = vector;
            return this;
        }
        public ListUserVectorDatasResponseBodyListVector getVector() {
            return this.vector;
        }

    }

}
