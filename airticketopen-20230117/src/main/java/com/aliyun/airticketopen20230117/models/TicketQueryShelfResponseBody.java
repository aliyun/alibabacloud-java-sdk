// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class TicketQueryShelfResponseBody extends TeaModel {
    @NameInMap("Data")
    public TicketQueryShelfResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>ScenicIdInvalid</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <strong>example:</strong>
     * <p>ScenicId不合法</p>
     */
    @NameInMap("ErrorMsg")
    public String errorMsg;

    /**
     * <strong>example:</strong>
     * <p>51593418-8C73-5E47-8BA8-3F1D4A00CC0B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static TicketQueryShelfResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TicketQueryShelfResponseBody self = new TicketQueryShelfResponseBody();
        return TeaModel.build(map, self);
    }

    public TicketQueryShelfResponseBody setData(TicketQueryShelfResponseBodyData data) {
        this.data = data;
        return this;
    }
    public TicketQueryShelfResponseBodyData getData() {
        return this.data;
    }

    public TicketQueryShelfResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public TicketQueryShelfResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public TicketQueryShelfResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public TicketQueryShelfResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class TicketQueryShelfResponseBodyDataShelvesTabsCells extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>3507</p>
         */
        @NameInMap("SpuId")
        public Long spuId;

        /**
         * <strong>example:</strong>
         * <p>60484007</p>
         */
        @NameInMap("TicketKindId")
        public Long ticketKindId;

        public static TicketQueryShelfResponseBodyDataShelvesTabsCells build(java.util.Map<String, ?> map) throws Exception {
            TicketQueryShelfResponseBodyDataShelvesTabsCells self = new TicketQueryShelfResponseBodyDataShelvesTabsCells();
            return TeaModel.build(map, self);
        }

        public TicketQueryShelfResponseBodyDataShelvesTabsCells setSpuId(Long spuId) {
            this.spuId = spuId;
            return this;
        }
        public Long getSpuId() {
            return this.spuId;
        }

        public TicketQueryShelfResponseBodyDataShelvesTabsCells setTicketKindId(Long ticketKindId) {
            this.ticketKindId = ticketKindId;
            return this;
        }
        public Long getTicketKindId() {
            return this.ticketKindId;
        }

    }

    public static class TicketQueryShelfResponseBodyDataShelvesTabs extends TeaModel {
        @NameInMap("Cells")
        public java.util.List<TicketQueryShelfResponseBodyDataShelvesTabsCells> cells;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TabIndex")
        public Integer tabIndex;

        /**
         * <strong>example:</strong>
         * <p>景点门票</p>
         */
        @NameInMap("TabName")
        public String tabName;

        public static TicketQueryShelfResponseBodyDataShelvesTabs build(java.util.Map<String, ?> map) throws Exception {
            TicketQueryShelfResponseBodyDataShelvesTabs self = new TicketQueryShelfResponseBodyDataShelvesTabs();
            return TeaModel.build(map, self);
        }

        public TicketQueryShelfResponseBodyDataShelvesTabs setCells(java.util.List<TicketQueryShelfResponseBodyDataShelvesTabsCells> cells) {
            this.cells = cells;
            return this;
        }
        public java.util.List<TicketQueryShelfResponseBodyDataShelvesTabsCells> getCells() {
            return this.cells;
        }

        public TicketQueryShelfResponseBodyDataShelvesTabs setTabIndex(Integer tabIndex) {
            this.tabIndex = tabIndex;
            return this;
        }
        public Integer getTabIndex() {
            return this.tabIndex;
        }

        public TicketQueryShelfResponseBodyDataShelvesTabs setTabName(String tabName) {
            this.tabName = tabName;
            return this;
        }
        public String getTabName() {
            return this.tabName;
        }

    }

    public static class TicketQueryShelfResponseBodyDataShelves extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1951890</p>
         */
        @NameInMap("ShelfId")
        public Long shelfId;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ShelfIndex")
        public Integer shelfIndex;

        /**
         * <strong>example:</strong>
         * <p>1日门票</p>
         */
        @NameInMap("ShelfName")
        public String shelfName;

        @NameInMap("Tabs")
        public java.util.List<TicketQueryShelfResponseBodyDataShelvesTabs> tabs;

        public static TicketQueryShelfResponseBodyDataShelves build(java.util.Map<String, ?> map) throws Exception {
            TicketQueryShelfResponseBodyDataShelves self = new TicketQueryShelfResponseBodyDataShelves();
            return TeaModel.build(map, self);
        }

        public TicketQueryShelfResponseBodyDataShelves setShelfId(Long shelfId) {
            this.shelfId = shelfId;
            return this;
        }
        public Long getShelfId() {
            return this.shelfId;
        }

        public TicketQueryShelfResponseBodyDataShelves setShelfIndex(Integer shelfIndex) {
            this.shelfIndex = shelfIndex;
            return this;
        }
        public Integer getShelfIndex() {
            return this.shelfIndex;
        }

        public TicketQueryShelfResponseBodyDataShelves setShelfName(String shelfName) {
            this.shelfName = shelfName;
            return this;
        }
        public String getShelfName() {
            return this.shelfName;
        }

        public TicketQueryShelfResponseBodyDataShelves setTabs(java.util.List<TicketQueryShelfResponseBodyDataShelvesTabs> tabs) {
            this.tabs = tabs;
            return this;
        }
        public java.util.List<TicketQueryShelfResponseBodyDataShelvesTabs> getTabs() {
            return this.tabs;
        }

    }

    public static class TicketQueryShelfResponseBodyData extends TeaModel {
        @NameInMap("Shelves")
        public java.util.List<TicketQueryShelfResponseBodyDataShelves> shelves;

        public static TicketQueryShelfResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            TicketQueryShelfResponseBodyData self = new TicketQueryShelfResponseBodyData();
            return TeaModel.build(map, self);
        }

        public TicketQueryShelfResponseBodyData setShelves(java.util.List<TicketQueryShelfResponseBodyDataShelves> shelves) {
            this.shelves = shelves;
            return this;
        }
        public java.util.List<TicketQueryShelfResponseBodyDataShelves> getShelves() {
            return this.shelves;
        }

    }

}
