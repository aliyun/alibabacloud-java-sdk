// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbfs20200418.models;

import com.aliyun.tea.*;

public class ListSnapshotLinksResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SnapshotLinks")
    public java.util.List<ListSnapshotLinksResponseBodySnapshotLinks> snapshotLinks;

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
