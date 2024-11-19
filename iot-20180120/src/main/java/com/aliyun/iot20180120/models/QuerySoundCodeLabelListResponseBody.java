// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QuerySoundCodeLabelListResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>iot.soundcodeservice.NotSigned</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QuerySoundCodeLabelListResponseBodyData data;

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

    public static QuerySoundCodeLabelListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QuerySoundCodeLabelListResponseBody self = new QuerySoundCodeLabelListResponseBody();
        return TeaModel.build(map, self);
    }

    public QuerySoundCodeLabelListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QuerySoundCodeLabelListResponseBody setData(QuerySoundCodeLabelListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QuerySoundCodeLabelListResponseBodyData getData() {
        return this.data;
    }

    public QuerySoundCodeLabelListResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QuerySoundCodeLabelListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QuerySoundCodeLabelListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QuerySoundCodeLabelListResponseBodyDataListItems extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Label")
        public String label;

        /**
         * <strong>example:</strong>
         * <p>Md3ZiTL888K9llXDy7890***********</p>
         */
        @NameInMap("SoundCode")
        public String soundCode;

        public static QuerySoundCodeLabelListResponseBodyDataListItems build(java.util.Map<String, ?> map) throws Exception {
            QuerySoundCodeLabelListResponseBodyDataListItems self = new QuerySoundCodeLabelListResponseBodyDataListItems();
            return TeaModel.build(map, self);
        }

        public QuerySoundCodeLabelListResponseBodyDataListItems setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public QuerySoundCodeLabelListResponseBodyDataListItems setSoundCode(String soundCode) {
            this.soundCode = soundCode;
            return this;
        }
        public String getSoundCode() {
            return this.soundCode;
        }

    }

    public static class QuerySoundCodeLabelListResponseBodyDataList extends TeaModel {
        @NameInMap("Items")
        public java.util.List<QuerySoundCodeLabelListResponseBodyDataListItems> items;

        public static QuerySoundCodeLabelListResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            QuerySoundCodeLabelListResponseBodyDataList self = new QuerySoundCodeLabelListResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public QuerySoundCodeLabelListResponseBodyDataList setItems(java.util.List<QuerySoundCodeLabelListResponseBodyDataListItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<QuerySoundCodeLabelListResponseBodyDataListItems> getItems() {
            return this.items;
        }

    }

    public static class QuerySoundCodeLabelListResponseBodyData extends TeaModel {
        @NameInMap("List")
        public QuerySoundCodeLabelListResponseBodyDataList list;

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

        public static QuerySoundCodeLabelListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QuerySoundCodeLabelListResponseBodyData self = new QuerySoundCodeLabelListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QuerySoundCodeLabelListResponseBodyData setList(QuerySoundCodeLabelListResponseBodyDataList list) {
            this.list = list;
            return this;
        }
        public QuerySoundCodeLabelListResponseBodyDataList getList() {
            return this.list;
        }

        public QuerySoundCodeLabelListResponseBodyData setPageId(Integer pageId) {
            this.pageId = pageId;
            return this;
        }
        public Integer getPageId() {
            return this.pageId;
        }

        public QuerySoundCodeLabelListResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QuerySoundCodeLabelListResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
