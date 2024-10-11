// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbfs20200418.models;

import com.aliyun.tea.*;

public class ListSnapshotLinksResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SnapshotLinks")
    public java.util.List<ListSnapshotLinksResponseBodySnapshotLinks> snapshotLinks;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListSnapshotLinksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSnapshotLinksResponseBody self = new ListSnapshotLinksResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSnapshotLinksResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListSnapshotLinksResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListSnapshotLinksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSnapshotLinksResponseBody setSnapshotLinks(java.util.List<ListSnapshotLinksResponseBodySnapshotLinks> snapshotLinks) {
        this.snapshotLinks = snapshotLinks;
        return this;
    }
    public java.util.List<ListSnapshotLinksResponseBodySnapshotLinks> getSnapshotLinks() {
        return this.snapshotLinks;
    }

    public ListSnapshotLinksResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListSnapshotLinksResponseBodySnapshotLinksEcsList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>i-bp1f4eo2biro*******</p>
         */
        @NameInMap("EcsId")
        public String ecsId;

        public static ListSnapshotLinksResponseBodySnapshotLinksEcsList build(java.util.Map<String, ?> map) throws Exception {
            ListSnapshotLinksResponseBodySnapshotLinksEcsList self = new ListSnapshotLinksResponseBodySnapshotLinksEcsList();
            return TeaModel.build(map, self);
        }

        public ListSnapshotLinksResponseBodySnapshotLinksEcsList setEcsId(String ecsId) {
            this.ecsId = ecsId;
            return this;
        }
        public String getEcsId() {
            return this.ecsId;
        }

    }

    public static class ListSnapshotLinksResponseBodySnapshotLinks extends TeaModel {
        @NameInMap("EcsList")
        public java.util.List<ListSnapshotLinksResponseBodySnapshotLinksEcsList> ecsList;

        /**
         * <strong>example:</strong>
         * <p>dbfs-q7qsgyqptjk******</p>
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

        public static ListSnapshotLinksResponseBodySnapshotLinks build(java.util.Map<String, ?> map) throws Exception {
            ListSnapshotLinksResponseBodySnapshotLinks self = new ListSnapshotLinksResponseBodySnapshotLinks();
            return TeaModel.build(map, self);
        }

        public ListSnapshotLinksResponseBodySnapshotLinks setEcsList(java.util.List<ListSnapshotLinksResponseBodySnapshotLinksEcsList> ecsList) {
            this.ecsList = ecsList;
            return this;
        }
        public java.util.List<ListSnapshotLinksResponseBodySnapshotLinksEcsList> getEcsList() {
            return this.ecsList;
        }

        public ListSnapshotLinksResponseBodySnapshotLinks setFsId(String fsId) {
            this.fsId = fsId;
            return this;
        }
        public String getFsId() {
            return this.fsId;
        }

        public ListSnapshotLinksResponseBodySnapshotLinks setFsName(String fsName) {
            this.fsName = fsName;
            return this;
        }
        public String getFsName() {
            return this.fsName;
        }

        public ListSnapshotLinksResponseBodySnapshotLinks setLinkId(String linkId) {
            this.linkId = linkId;
            return this;
        }
        public String getLinkId() {
            return this.linkId;
        }

        public ListSnapshotLinksResponseBodySnapshotLinks setSnapshotCount(Integer snapshotCount) {
            this.snapshotCount = snapshotCount;
            return this;
        }
        public Integer getSnapshotCount() {
            return this.snapshotCount;
        }

        public ListSnapshotLinksResponseBodySnapshotLinks setSourceSize(Integer sourceSize) {
            this.sourceSize = sourceSize;
            return this;
        }
        public Integer getSourceSize() {
            return this.sourceSize;
        }

        public ListSnapshotLinksResponseBodySnapshotLinks setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListSnapshotLinksResponseBodySnapshotLinks setTotalSize(Long totalSize) {
            this.totalSize = totalSize;
            return this;
        }
        public Long getTotalSize() {
            return this.totalSize;
        }

    }

}
