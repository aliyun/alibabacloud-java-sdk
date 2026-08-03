// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class ListDataAgentMemoryResponseBody extends TeaModel {
    /**
     * <p>The status code. A value of Success indicates success.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The response struct.</p>
     */
    @NameInMap("Data")
    public ListDataAgentMemoryResponseBodyData data;

    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>InvalidTid</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message returned if the call failed.</p>
     * 
     * <strong>example:</strong>
     * <p>Specified parameter Tid is not valid.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>67E910F2-4B62-5B0C-ACA3-7547695C****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The request was successful.                                 </li>
     * <li><strong>false</strong>: The request failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The operation timestamp.</p>
     * 
     * <strong>example:</strong>
     * <p>1768270172</p>
     */
    @NameInMap("Timestamp")
    public String timestamp;

    public static ListDataAgentMemoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDataAgentMemoryResponseBody self = new ListDataAgentMemoryResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDataAgentMemoryResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListDataAgentMemoryResponseBody setData(ListDataAgentMemoryResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListDataAgentMemoryResponseBodyData getData() {
        return this.data;
    }

    public ListDataAgentMemoryResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListDataAgentMemoryResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListDataAgentMemoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDataAgentMemoryResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListDataAgentMemoryResponseBody setTimestamp(String timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    public String getTimestamp() {
        return this.timestamp;
    }

    public static class ListDataAgentMemoryResponseBodyDataData extends TeaModel {
        /**
         * <p>The memory content.</p>
         * 
         * <strong>example:</strong>
         * <p>Diamond pricing analysis requires examining the skewness and outliers of the distribution of each feature.</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The memory source ID.</p>
         * 
         * <strong>example:</strong>
         * <p>w3xa1********x6y8zm</p>
         */
        @NameInMap("FromId")
        public String fromId;

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-07-29T07:11:23Z</p>
         */
        @NameInMap("GmtCreated")
        public String gmtCreated;

        /**
         * <p>The modification time.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-07-29T07:11:23Z</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The memory hit level (hotness).</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("HintLevel")
        public Long hintLevel;

        /**
         * <p>The memory source.</p>
         * 
         * <strong>example:</strong>
         * <p>session</p>
         */
        @NameInMap("MemFrom")
        public String memFrom;

        /**
         * <p>The memory status.</p>
         * 
         * <strong>example:</strong>
         * <p>memorized</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The memory UUID.</p>
         * 
         * <strong>example:</strong>
         * <p>8zm3w********g3yxa1</p>
         */
        @NameInMap("Uuid")
        public String uuid;

        public static ListDataAgentMemoryResponseBodyDataData build(java.util.Map<String, ?> map) throws Exception {
            ListDataAgentMemoryResponseBodyDataData self = new ListDataAgentMemoryResponseBodyDataData();
            return TeaModel.build(map, self);
        }

        public ListDataAgentMemoryResponseBodyDataData setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public ListDataAgentMemoryResponseBodyDataData setFromId(String fromId) {
            this.fromId = fromId;
            return this;
        }
        public String getFromId() {
            return this.fromId;
        }

        public ListDataAgentMemoryResponseBodyDataData setGmtCreated(String gmtCreated) {
            this.gmtCreated = gmtCreated;
            return this;
        }
        public String getGmtCreated() {
            return this.gmtCreated;
        }

        public ListDataAgentMemoryResponseBodyDataData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListDataAgentMemoryResponseBodyDataData setHintLevel(Long hintLevel) {
            this.hintLevel = hintLevel;
            return this;
        }
        public Long getHintLevel() {
            return this.hintLevel;
        }

        public ListDataAgentMemoryResponseBodyDataData setMemFrom(String memFrom) {
            this.memFrom = memFrom;
            return this;
        }
        public String getMemFrom() {
            return this.memFrom;
        }

        public ListDataAgentMemoryResponseBodyDataData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListDataAgentMemoryResponseBodyDataData setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

    public static class ListDataAgentMemoryResponseBodyData extends TeaModel {
        /**
         * <p>The response struct.</p>
         */
        @NameInMap("Data")
        public java.util.List<ListDataAgentMemoryResponseBodyDataData> data;

        /**
         * <p>The current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNum")
        public Long pageNum;

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("PageSize")
        public Long pageSize;

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("Total")
        public Long total;

        public static ListDataAgentMemoryResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListDataAgentMemoryResponseBodyData self = new ListDataAgentMemoryResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListDataAgentMemoryResponseBodyData setData(java.util.List<ListDataAgentMemoryResponseBodyDataData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<ListDataAgentMemoryResponseBodyDataData> getData() {
            return this.data;
        }

        public ListDataAgentMemoryResponseBodyData setPageNum(Long pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Long getPageNum() {
            return this.pageNum;
        }

        public ListDataAgentMemoryResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public ListDataAgentMemoryResponseBodyData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
