// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListSnapshotsResponseBody extends TeaModel {
    /**
     * <p>The pagination information.</p>
     */
    @NameInMap("PagingInfo")
    public ListSnapshotsResponseBodyPagingInfo pagingInfo;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>0bc14115-1234-5678-ABCD-159376359</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListSnapshotsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSnapshotsResponseBody self = new ListSnapshotsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSnapshotsResponseBody setPagingInfo(ListSnapshotsResponseBodyPagingInfo pagingInfo) {
        this.pagingInfo = pagingInfo;
        return this;
    }
    public ListSnapshotsResponseBodyPagingInfo getPagingInfo() {
        return this.pagingInfo;
    }

    public ListSnapshotsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListSnapshotsResponseBodyPagingInfoSnapshots extends TeaModel {
        /**
         * <p>The snapshot comment.</p>
         * 
         * <strong>example:</strong>
         * <p>snapshot comment</p>
         */
        @NameInMap("Comment")
        public String comment;

        /**
         * <p>The snapshot creation time, in millisecond UNIX timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1782370983000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The employee ID of the submitter.</p>
         * 
         * <strong>example:</strong>
         * <p>209508679263509059</p>
         */
        @NameInMap("Creator")
        public String creator;

        /**
         * <p>The unique ID of the snapshot.</p>
         * 
         * <strong>example:</strong>
         * <p>8b723a9e8bd443af920b77e39aeb4f63</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The namespace.</p>
         * 
         * <strong>example:</strong>
         * <p>1389623</p>
         */
        @NameInMap("Namespace")
        public String namespace;

        /**
         * <p>The unique ID of the object to which the snapshot belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>8467231038932407294</p>
         */
        @NameInMap("ObjectId")
        public String objectId;

        /**
         * <p>The snapshot type.</p>
         * 
         * <strong>example:</strong>
         * <p>Saved</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The version number.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Version")
        public Integer version;

        public static ListSnapshotsResponseBodyPagingInfoSnapshots build(java.util.Map<String, ?> map) throws Exception {
            ListSnapshotsResponseBodyPagingInfoSnapshots self = new ListSnapshotsResponseBodyPagingInfoSnapshots();
            return TeaModel.build(map, self);
        }

        public ListSnapshotsResponseBodyPagingInfoSnapshots setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public ListSnapshotsResponseBodyPagingInfoSnapshots setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListSnapshotsResponseBodyPagingInfoSnapshots setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public ListSnapshotsResponseBodyPagingInfoSnapshots setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListSnapshotsResponseBodyPagingInfoSnapshots setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public ListSnapshotsResponseBodyPagingInfoSnapshots setObjectId(String objectId) {
            this.objectId = objectId;
            return this;
        }
        public String getObjectId() {
            return this.objectId;
        }

        public ListSnapshotsResponseBodyPagingInfoSnapshots setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListSnapshotsResponseBodyPagingInfoSnapshots setVersion(Integer version) {
            this.version = version;
            return this;
        }
        public Integer getVersion() {
            return this.version;
        }

    }

    public static class ListSnapshotsResponseBodyPagingInfo extends TeaModel {
        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>The page size.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The list of snapshots.</p>
         */
        @NameInMap("Snapshots")
        public java.util.List<ListSnapshotsResponseBodyPagingInfoSnapshots> snapshots;

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListSnapshotsResponseBodyPagingInfo build(java.util.Map<String, ?> map) throws Exception {
            ListSnapshotsResponseBodyPagingInfo self = new ListSnapshotsResponseBodyPagingInfo();
            return TeaModel.build(map, self);
        }

        public ListSnapshotsResponseBodyPagingInfo setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListSnapshotsResponseBodyPagingInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListSnapshotsResponseBodyPagingInfo setSnapshots(java.util.List<ListSnapshotsResponseBodyPagingInfoSnapshots> snapshots) {
            this.snapshots = snapshots;
            return this;
        }
        public java.util.List<ListSnapshotsResponseBodyPagingInfoSnapshots> getSnapshots() {
            return this.snapshots;
        }

        public ListSnapshotsResponseBodyPagingInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
