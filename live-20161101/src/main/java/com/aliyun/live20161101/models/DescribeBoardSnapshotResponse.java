// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeBoardSnapshotResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Snapshot")
    @Validation(required = true)
    public DescribeBoardSnapshotResponseSnapshot snapshot;

    public static DescribeBoardSnapshotResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeBoardSnapshotResponse self = new DescribeBoardSnapshotResponse();
        return TeaModel.build(map, self);
    }

    public DescribeBoardSnapshotResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeBoardSnapshotResponse setSnapshot(DescribeBoardSnapshotResponseSnapshot snapshot) {
        this.snapshot = snapshot;
        return this;
    }
    public DescribeBoardSnapshotResponseSnapshot getSnapshot() {
        return this.snapshot;
    }

    public static class DescribeBoardSnapshotResponseSnapshotBoardPagesElements extends TeaModel {
        @NameInMap("ElementIndex")
        @Validation(required = true)
        public String elementIndex;

        @NameInMap("OwnerId")
        @Validation(required = true)
        public String ownerId;

        @NameInMap("ElementType")
        @Validation(required = true)
        public Integer elementType;

        @NameInMap("UpdateTimestamp")
        @Validation(required = true)
        public Long updateTimestamp;

        @NameInMap("Data")
        @Validation(required = true)
        public String data;

        public static DescribeBoardSnapshotResponseSnapshotBoardPagesElements build(java.util.Map<String, ?> map) throws Exception {
            DescribeBoardSnapshotResponseSnapshotBoardPagesElements self = new DescribeBoardSnapshotResponseSnapshotBoardPagesElements();
            return TeaModel.build(map, self);
        }

        public DescribeBoardSnapshotResponseSnapshotBoardPagesElements setElementIndex(String elementIndex) {
            this.elementIndex = elementIndex;
            return this;
        }
        public String getElementIndex() {
            return this.elementIndex;
        }

        public DescribeBoardSnapshotResponseSnapshotBoardPagesElements setOwnerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public String getOwnerId() {
            return this.ownerId;
        }

        public DescribeBoardSnapshotResponseSnapshotBoardPagesElements setElementType(Integer elementType) {
            this.elementType = elementType;
            return this;
        }
        public Integer getElementType() {
            return this.elementType;
        }

        public DescribeBoardSnapshotResponseSnapshotBoardPagesElements setUpdateTimestamp(Long updateTimestamp) {
            this.updateTimestamp = updateTimestamp;
            return this;
        }
        public Long getUpdateTimestamp() {
            return this.updateTimestamp;
        }

        public DescribeBoardSnapshotResponseSnapshotBoardPagesElements setData(String data) {
            this.data = data;
            return this;
        }
        public String getData() {
            return this.data;
        }

    }

    public static class DescribeBoardSnapshotResponseSnapshotBoardPages extends TeaModel {
        @NameInMap("PageIndex")
        @Validation(required = true)
        public Integer pageIndex;

        @NameInMap("Elements")
        @Validation(required = true)
        public java.util.List<DescribeBoardSnapshotResponseSnapshotBoardPagesElements> elements;

        public static DescribeBoardSnapshotResponseSnapshotBoardPages build(java.util.Map<String, ?> map) throws Exception {
            DescribeBoardSnapshotResponseSnapshotBoardPages self = new DescribeBoardSnapshotResponseSnapshotBoardPages();
            return TeaModel.build(map, self);
        }

        public DescribeBoardSnapshotResponseSnapshotBoardPages setPageIndex(Integer pageIndex) {
            this.pageIndex = pageIndex;
            return this;
        }
        public Integer getPageIndex() {
            return this.pageIndex;
        }

        public DescribeBoardSnapshotResponseSnapshotBoardPages setElements(java.util.List<DescribeBoardSnapshotResponseSnapshotBoardPagesElements> elements) {
            this.elements = elements;
            return this;
        }
        public java.util.List<DescribeBoardSnapshotResponseSnapshotBoardPagesElements> getElements() {
            return this.elements;
        }

    }

    public static class DescribeBoardSnapshotResponseSnapshotBoardConfigs extends TeaModel {
        @NameInMap("AppUid")
        @Validation(required = true)
        public String appUid;

        @NameInMap("Data")
        @Validation(required = true)
        public String data;

        public static DescribeBoardSnapshotResponseSnapshotBoardConfigs build(java.util.Map<String, ?> map) throws Exception {
            DescribeBoardSnapshotResponseSnapshotBoardConfigs self = new DescribeBoardSnapshotResponseSnapshotBoardConfigs();
            return TeaModel.build(map, self);
        }

        public DescribeBoardSnapshotResponseSnapshotBoardConfigs setAppUid(String appUid) {
            this.appUid = appUid;
            return this;
        }
        public String getAppUid() {
            return this.appUid;
        }

        public DescribeBoardSnapshotResponseSnapshotBoardConfigs setData(String data) {
            this.data = data;
            return this;
        }
        public String getData() {
            return this.data;
        }

    }

    public static class DescribeBoardSnapshotResponseSnapshotBoard extends TeaModel {
        @NameInMap("BoardId")
        @Validation(required = true)
        public String boardId;

        @NameInMap("AppUid")
        @Validation(required = true)
        public String appUid;

        @NameInMap("EventTimestamp")
        @Validation(required = true)
        public Long eventTimestamp;

        @NameInMap("CreateTimestamp")
        @Validation(required = true)
        public Long createTimestamp;

        @NameInMap("UpdateTimestamp")
        @Validation(required = true)
        public Long updateTimestamp;

        @NameInMap("Pages")
        @Validation(required = true)
        public java.util.List<DescribeBoardSnapshotResponseSnapshotBoardPages> pages;

        @NameInMap("Configs")
        @Validation(required = true)
        public java.util.List<DescribeBoardSnapshotResponseSnapshotBoardConfigs> configs;

        public static DescribeBoardSnapshotResponseSnapshotBoard build(java.util.Map<String, ?> map) throws Exception {
            DescribeBoardSnapshotResponseSnapshotBoard self = new DescribeBoardSnapshotResponseSnapshotBoard();
            return TeaModel.build(map, self);
        }

        public DescribeBoardSnapshotResponseSnapshotBoard setBoardId(String boardId) {
            this.boardId = boardId;
            return this;
        }
        public String getBoardId() {
            return this.boardId;
        }

        public DescribeBoardSnapshotResponseSnapshotBoard setAppUid(String appUid) {
            this.appUid = appUid;
            return this;
        }
        public String getAppUid() {
            return this.appUid;
        }

        public DescribeBoardSnapshotResponseSnapshotBoard setEventTimestamp(Long eventTimestamp) {
            this.eventTimestamp = eventTimestamp;
            return this;
        }
        public Long getEventTimestamp() {
            return this.eventTimestamp;
        }

        public DescribeBoardSnapshotResponseSnapshotBoard setCreateTimestamp(Long createTimestamp) {
            this.createTimestamp = createTimestamp;
            return this;
        }
        public Long getCreateTimestamp() {
            return this.createTimestamp;
        }

        public DescribeBoardSnapshotResponseSnapshotBoard setUpdateTimestamp(Long updateTimestamp) {
            this.updateTimestamp = updateTimestamp;
            return this;
        }
        public Long getUpdateTimestamp() {
            return this.updateTimestamp;
        }

        public DescribeBoardSnapshotResponseSnapshotBoard setPages(java.util.List<DescribeBoardSnapshotResponseSnapshotBoardPages> pages) {
            this.pages = pages;
            return this;
        }
        public java.util.List<DescribeBoardSnapshotResponseSnapshotBoardPages> getPages() {
            return this.pages;
        }

        public DescribeBoardSnapshotResponseSnapshotBoard setConfigs(java.util.List<DescribeBoardSnapshotResponseSnapshotBoardConfigs> configs) {
            this.configs = configs;
            return this;
        }
        public java.util.List<DescribeBoardSnapshotResponseSnapshotBoardConfigs> getConfigs() {
            return this.configs;
        }

    }

    public static class DescribeBoardSnapshotResponseSnapshot extends TeaModel {
        @NameInMap("Board")
        @Validation(required = true)
        public DescribeBoardSnapshotResponseSnapshotBoard board;

        public static DescribeBoardSnapshotResponseSnapshot build(java.util.Map<String, ?> map) throws Exception {
            DescribeBoardSnapshotResponseSnapshot self = new DescribeBoardSnapshotResponseSnapshot();
            return TeaModel.build(map, self);
        }

        public DescribeBoardSnapshotResponseSnapshot setBoard(DescribeBoardSnapshotResponseSnapshotBoard board) {
            this.board = board;
            return this;
        }
        public DescribeBoardSnapshotResponseSnapshotBoard getBoard() {
            return this.board;
        }

    }

}
