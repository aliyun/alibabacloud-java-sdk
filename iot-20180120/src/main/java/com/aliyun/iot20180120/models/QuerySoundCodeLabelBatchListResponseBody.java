// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QuerySoundCodeLabelBatchListResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>iot.soundcodeservice.NotSigned</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QuerySoundCodeLabelBatchListResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>sound code service has not been signed</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <strong>example:</strong>
     * <p>66FF51D3-<em><strong>-49F1-B1A2-</strong></em></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QuerySoundCodeLabelBatchListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QuerySoundCodeLabelBatchListResponseBody self = new QuerySoundCodeLabelBatchListResponseBody();
        return TeaModel.build(map, self);
    }

    public QuerySoundCodeLabelBatchListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QuerySoundCodeLabelBatchListResponseBody setData(QuerySoundCodeLabelBatchListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QuerySoundCodeLabelBatchListResponseBodyData getData() {
        return this.data;
    }

    public QuerySoundCodeLabelBatchListResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QuerySoundCodeLabelBatchListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QuerySoundCodeLabelBatchListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QuerySoundCodeLabelBatchListResponseBodyDataListItems extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>Md3ZiTL888K9llXDy7890***********</p>
         */
        @NameInMap("BatchCode")
        public String batchCode;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>1620634297000</p>
         */
        @NameInMap("GmtCreate")
        public Long gmtCreate;

        /**
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SuccessNum")
        public Integer successNum;

        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("Total")
        public Integer total;

        public static QuerySoundCodeLabelBatchListResponseBodyDataListItems build(java.util.Map<String, ?> map) throws Exception {
            QuerySoundCodeLabelBatchListResponseBodyDataListItems self = new QuerySoundCodeLabelBatchListResponseBodyDataListItems();
            return TeaModel.build(map, self);
        }

        public QuerySoundCodeLabelBatchListResponseBodyDataListItems setBatchCode(String batchCode) {
            this.batchCode = batchCode;
            return this;
        }
        public String getBatchCode() {
            return this.batchCode;
        }

        public QuerySoundCodeLabelBatchListResponseBodyDataListItems setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QuerySoundCodeLabelBatchListResponseBodyDataListItems setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public QuerySoundCodeLabelBatchListResponseBodyDataListItems setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QuerySoundCodeLabelBatchListResponseBodyDataListItems setSuccessNum(Integer successNum) {
            this.successNum = successNum;
            return this;
        }
        public Integer getSuccessNum() {
            return this.successNum;
        }

        public QuerySoundCodeLabelBatchListResponseBodyDataListItems setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

    public static class QuerySoundCodeLabelBatchListResponseBodyDataList extends TeaModel {
        @NameInMap("Items")
        public java.util.List<QuerySoundCodeLabelBatchListResponseBodyDataListItems> items;

        public static QuerySoundCodeLabelBatchListResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            QuerySoundCodeLabelBatchListResponseBodyDataList self = new QuerySoundCodeLabelBatchListResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public QuerySoundCodeLabelBatchListResponseBodyDataList setItems(java.util.List<QuerySoundCodeLabelBatchListResponseBodyDataListItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<QuerySoundCodeLabelBatchListResponseBodyDataListItems> getItems() {
            return this.items;
        }

    }

    public static class QuerySoundCodeLabelBatchListResponseBodyData extends TeaModel {
        @NameInMap("List")
        public QuerySoundCodeLabelBatchListResponseBodyDataList list;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageId")
        public Integer pageId;

        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("Total")
        public Integer total;

        public static QuerySoundCodeLabelBatchListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QuerySoundCodeLabelBatchListResponseBodyData self = new QuerySoundCodeLabelBatchListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QuerySoundCodeLabelBatchListResponseBodyData setList(QuerySoundCodeLabelBatchListResponseBodyDataList list) {
            this.list = list;
            return this;
        }
        public QuerySoundCodeLabelBatchListResponseBodyDataList getList() {
            return this.list;
        }

        public QuerySoundCodeLabelBatchListResponseBodyData setPageId(Integer pageId) {
            this.pageId = pageId;
            return this;
        }
        public Integer getPageId() {
            return this.pageId;
        }

        public QuerySoundCodeLabelBatchListResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QuerySoundCodeLabelBatchListResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
