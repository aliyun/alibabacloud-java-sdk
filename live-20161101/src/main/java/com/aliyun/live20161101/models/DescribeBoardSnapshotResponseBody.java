// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeBoardSnapshotResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Snapshot")
    public DescribeBoardSnapshotResponseBodySnapshot snapshot;

    public static DescribeBoardSnapshotResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBoardSnapshotResponseBody self = new DescribeBoardSnapshotResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeBoardSnapshotResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeBoardSnapshotResponseBody setSnapshot(DescribeBoardSnapshotResponseBodySnapshot snapshot) {
        this.snapshot = snapshot;
        return this;
    }
    public DescribeBoardSnapshotResponseBodySnapshot getSnapshot() {
        return this.snapshot;
    }

    public static class DescribeBoardSnapshotResponseBodySnapshotBoardPagesElements extends TeaModel {
        @NameInMap("ElementIndex")
        public String elementIndex;

        @NameInMap("OwnerId")
        public String ownerId;

        @NameInMap("ElementType")
        public Integer elementType;

        @NameInMap("UpdateTimestamp")
        public Long updateTimestamp;

        @NameInMap("Data")
        public String data;

        public static DescribeBoardSnapshotResponseBodySnapshotBoardPagesElements build(java.util.Map<String, ?> map) throws Exception {
            DescribeBoardSnapshotResponseBodySnapshotBoardPagesElements self = new DescribeBoardSnapshotResponseBodySnapshotBoardPagesElements();
            return TeaModel.build(map, self);
        }

        public DescribeBoardSnapshotResponseBodySnapshotBoardPagesElements setElementIndex(String elementIndex) {
            this.elementIndex = elementIndex;
            return this;
        }
        public String getElementIndex() {
            return this.elementIndex;
        }

        public DescribeBoardSnapshotResponseBodySnapshotBoardPagesElements setOwnerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public String getOwnerId() {
            return this.ownerId;
        }

        public DescribeBoardSnapshotResponseBodySnapshotBoardPagesElements setElementType(Integer elementType) {
            this.elementType = elementType;
            return this;
        }
        public Integer getElementType() {
            return this.elementType;
        }

        public DescribeBoardSnapshotResponseBodySnapshotBoardPagesElements setUpdateTimestamp(Long updateTimestamp) {
            this.updateTimestamp = updateTimestamp;
            return this;
        }
        public Long getUpdateTimestamp() {
            return this.updateTimestamp;
        }

        public DescribeBoardSnapshotResponseBodySnapshotBoardPagesElements setData(String data) {
            this.data = data;
            return this;
        }
        public String getData() {
            return this.data;
        }

    }

    public static class DescribeBoardSnapshotResponseBodySnapshotBoardPages extends TeaModel {
        @NameInMap("PageIndex")
        public Integer pageIndex;

        @NameInMap("Elements")
        public java.util.List<DescribeBoardSnapshotResponseBodySnapshotBoardPagesElements> elements;

        public static DescribeBoardSnapshotResponseBodySnapshotBoardPages build(java.util.Map<String, ?> map) throws Exception {
            DescribeBoardSnapshotResponseBodySnapshotBoardPages self = new DescribeBoardSnapshotResponseBodySnapshotBoardPages();
            return TeaModel.build(map, self);
        }

        public DescribeBoardSnapshotResponseBodySnapshotBoardPages setPageIndex(Integer pageIndex) {
            this.pageIndex = pageIndex;
            return this;
        }
        public Integer getPageIndex() {
            return this.pageIndex;
        }

        public DescribeBoardSnapshotResponseBodySnapshotBoardPages setElements(java.util.List<DescribeBoardSnapshotResponseBodySnapshotBoardPagesElements> elements) {
            this.elements = elements;
            return this;
        }
        public java.util.List<DescribeBoardSnapshotResponseBodySnapshotBoardPagesElements> getElements() {
            return this.elements;
        }

    }

    public static class DescribeBoardSnapshotResponseBodySnapshotBoardConfigs extends TeaModel {
        @NameInMap("AppUid")
        public String appUid;

        @NameInMap("Data")
        public String data;

        public static DescribeBoardSnapshotResponseBodySnapshotBoardConfigs build(java.util.Map<String, ?> map) throws Exception {
            DescribeBoardSnapshotResponseBodySnapshotBoardConfigs self = new DescribeBoardSnapshotResponseBodySnapshotBoardConfigs();
            return TeaModel.build(map, self);
        }

        public DescribeBoardSnapshotResponseBodySnapshotBoardConfigs setAppUid(String appUid) {
            this.appUid = appUid;
            return this;
        }
        public String getAppUid() {
            return this.appUid;
        }

        public DescribeBoardSnapshotResponseBodySnapshotBoardConfigs setData(String data) {
            this.data = data;
            return this;
        }
        public String getData() {
            return this.data;
        }

    }

    public static class DescribeBoardSnapshotResponseBodySnapshotBoard extends TeaModel {
        @NameInMap("BoardId")
        public String boardId;

        @NameInMap("AppUid")
        public String appUid;

        @NameInMap("EventTimestamp")
        public Long eventTimestamp;

        @NameInMap("CreateTimestamp")
        public Long createTimestamp;

        @NameInMap("UpdateTimestamp")
        public Long updateTimestamp;

        @NameInMap("Pages")
        public java.util.List<DescribeBoardSnapshotResponseBodySnapshotBoardPages> pages;

        @NameInMap("Configs")
        public java.util.List<DescribeBoardSnapshotResponseBodySnapshotBoardConfigs> configs;

        public static DescribeBoardSnapshotResponseBodySnapshotBoard build(java.util.Map<String, ?> map) throws Exception {
            DescribeBoardSnapshotResponseBodySnapshotBoard self = new DescribeBoardSnapshotResponseBodySnapshotBoard();
            return TeaModel.build(map, self);
        }

        public DescribeBoardSnapshotResponseBodySnapshotBoard setBoardId(String boardId) {
            this.boardId = boardId;
            return this;
        }
        public String getBoardId() {
            return this.boardId;
        }

        public DescribeBoardSnapshotResponseBodySnapshotBoard setAppUid(String appUid) {
            this.appUid = appUid;
            return this;
        }
        public String getAppUid() {
            return this.appUid;
        }

        public DescribeBoardSnapshotResponseBodySnapshotBoard setEventTimestamp(Long eventTimestamp) {
            this.eventTimestamp = eventTimestamp;
            return this;
        }
        public Long getEventTimestamp() {
            return this.eventTimestamp;
        }

        public DescribeBoardSnapshotResponseBodySnapshotBoard setCreateTimestamp(Long createTimestamp) {
            this.createTimestamp = createTimestamp;
            return this;
        }
        public Long getCreateTimestamp() {
            return this.createTimestamp;
        }

        public DescribeBoardSnapshotResponseBodySnapshotBoard setUpdateTimestamp(Long updateTimestamp) {
            this.updateTimestamp = updateTimestamp;
            return this;
        }
        public Long getUpdateTimestamp() {
            return this.updateTimestamp;
        }

        public DescribeBoardSnapshotResponseBodySnapshotBoard setPages(java.util.List<DescribeBoardSnapshotResponseBodySnapshotBoardPages> pages) {
            this.pages = pages;
            return this;
        }
        public java.util.List<DescribeBoardSnapshotResponseBodySnapshotBoardPages> getPages() {
            return this.pages;
        }

        public DescribeBoardSnapshotResponseBodySnapshotBoard setConfigs(java.util.List<DescribeBoardSnapshotResponseBodySnapshotBoardConfigs> configs) {
            this.configs = configs;
            return this;
        }
        public java.util.List<DescribeBoardSnapshotResponseBodySnapshotBoardConfigs> getConfigs() {
            return this.configs;
        }

    }

    public static class DescribeBoardSnapshotResponseBodySnapshot extends TeaModel {
        @NameInMap("Board")
        public DescribeBoardSnapshotResponseBodySnapshotBoard board;

        public static DescribeBoardSnapshotResponseBodySnapshot build(java.util.Map<String, ?> map) throws Exception {
            DescribeBoardSnapshotResponseBodySnapshot self = new DescribeBoardSnapshotResponseBodySnapshot();
            return TeaModel.build(map, self);
        }

        public DescribeBoardSnapshotResponseBodySnapshot setBoard(DescribeBoardSnapshotResponseBodySnapshotBoard board) {
            this.board = board;
            return this;
        }
        public DescribeBoardSnapshotResponseBodySnapshotBoard getBoard() {
            return this.board;
        }

    }

}
