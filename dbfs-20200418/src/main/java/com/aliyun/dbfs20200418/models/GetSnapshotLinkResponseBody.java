// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbfs20200418.models;

import com.aliyun.tea.*;

public class GetSnapshotLinkResponseBody extends TeaModel {
    @NameInMap("Data")
    public GetSnapshotLinkResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static GetSnapshotLinkResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSnapshotLinkResponseBody self = new GetSnapshotLinkResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSnapshotLinkResponseBody setData(GetSnapshotLinkResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetSnapshotLinkResponseBodyData getData() {
        return this.data;
    }

    public GetSnapshotLinkResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetSnapshotLinkResponseBodyDataEcsList extends TeaModel {
        @NameInMap("EcsId")
        public String ecsId;

        public static GetSnapshotLinkResponseBodyDataEcsList build(java.util.Map<String, ?> map) throws Exception {
            GetSnapshotLinkResponseBodyDataEcsList self = new GetSnapshotLinkResponseBodyDataEcsList();
            return TeaModel.build(map, self);
        }

        public GetSnapshotLinkResponseBodyDataEcsList setEcsId(String ecsId) {
            this.ecsId = ecsId;
            return this;
        }
        public String getEcsId() {
            return this.ecsId;
        }

    }

    public static class GetSnapshotLinkResponseBodyData extends TeaModel {
        @NameInMap("Category")
        public String category;

        @NameInMap("EcsList")
        public java.util.List<GetSnapshotLinkResponseBodyDataEcsList> ecsList;

        @NameInMap("FsId")
        public String fsId;

        @NameInMap("FsName")
        public String fsName;

        @NameInMap("LinkId")
        public String linkId;

        @NameInMap("SnapshotCount")
        public Integer snapshotCount;

        @NameInMap("SourceSize")
        public Integer sourceSize;

        @NameInMap("Status")
        public String status;

        @NameInMap("TotalSize")
        public Long totalSize;

        public static GetSnapshotLinkResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetSnapshotLinkResponseBodyData self = new GetSnapshotLinkResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetSnapshotLinkResponseBodyData setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public GetSnapshotLinkResponseBodyData setEcsList(java.util.List<GetSnapshotLinkResponseBodyDataEcsList> ecsList) {
            this.ecsList = ecsList;
            return this;
        }
        public java.util.List<GetSnapshotLinkResponseBodyDataEcsList> getEcsList() {
            return this.ecsList;
        }

        public GetSnapshotLinkResponseBodyData setFsId(String fsId) {
            this.fsId = fsId;
            return this;
        }
        public String getFsId() {
            return this.fsId;
        }

        public GetSnapshotLinkResponseBodyData setFsName(String fsName) {
            this.fsName = fsName;
            return this;
        }
        public String getFsName() {
            return this.fsName;
        }

        public GetSnapshotLinkResponseBodyData setLinkId(String linkId) {
            this.linkId = linkId;
            return this;
        }
        public String getLinkId() {
            return this.linkId;
        }

        public GetSnapshotLinkResponseBodyData setSnapshotCount(Integer snapshotCount) {
            this.snapshotCount = snapshotCount;
            return this;
        }
        public Integer getSnapshotCount() {
            return this.snapshotCount;
        }

        public GetSnapshotLinkResponseBodyData setSourceSize(Integer sourceSize) {
            this.sourceSize = sourceSize;
            return this;
        }
        public Integer getSourceSize() {
            return this.sourceSize;
        }

        public GetSnapshotLinkResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetSnapshotLinkResponseBodyData setTotalSize(Long totalSize) {
            this.totalSize = totalSize;
            return this;
        }
        public Long getTotalSize() {
            return this.totalSize;
        }

    }

}
