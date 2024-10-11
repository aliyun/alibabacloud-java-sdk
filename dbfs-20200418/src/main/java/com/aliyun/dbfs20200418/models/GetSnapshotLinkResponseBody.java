// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbfs20200418.models;

import com.aliyun.tea.*;

public class GetSnapshotLinkResponseBody extends TeaModel {
    @NameInMap("Data")
    public GetSnapshotLinkResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>i-bp19mogqud1w1*******</p>
         */
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
        /**
         * <strong>example:</strong>
         * <p>standard</p>
         */
        @NameInMap("Category")
        public String category;

        @NameInMap("EcsList")
        public java.util.List<GetSnapshotLinkResponseBodyDataEcsList> ecsList;

        /**
         * <strong>example:</strong>
         * <p>dbfs-194j6u20sp2gisx*******</p>
         */
        @NameInMap("FsId")
        public String fsId;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("FsName")
        public String fsName;

        /**
         * <strong>example:</strong>
         * <p>sl-b3zlgraysgcs9jy*******</p>
         */
        @NameInMap("LinkId")
        public String linkId;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SnapshotCount")
        public Integer snapshotCount;

        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("SourceSize")
        public Integer sourceSize;

        /**
         * <strong>example:</strong>
         * <p>attached</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>50331648</p>
         */
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
