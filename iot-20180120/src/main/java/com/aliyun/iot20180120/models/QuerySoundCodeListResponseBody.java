// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QuerySoundCodeListResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>iot.soundcodeservice.NotSigned</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QuerySoundCodeListResponseBodyData data;

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

    public static QuerySoundCodeListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QuerySoundCodeListResponseBody self = new QuerySoundCodeListResponseBody();
        return TeaModel.build(map, self);
    }

    public QuerySoundCodeListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QuerySoundCodeListResponseBody setData(QuerySoundCodeListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QuerySoundCodeListResponseBodyData getData() {
        return this.data;
    }

    public QuerySoundCodeListResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QuerySoundCodeListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QuerySoundCodeListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QuerySoundCodeListResponseBodyDataListItems extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Duration")
        public Integer duration;

        /**
         * <strong>example:</strong>
         * <p>1620634297000</p>
         */
        @NameInMap("GmtCreate")
        public Long gmtCreate;

        /**
         * <strong>example:</strong>
         * <p>test1</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>OPEN</p>
         */
        @NameInMap("OpenType")
        public String openType;

        /**
         * <strong>example:</strong>
         * <p>Md3ZiTL888K9llXDy7890***********</p>
         */
        @NameInMap("SoundCode")
        public String soundCode;

        /**
         * <strong>example:</strong>
         * <p><a href="http://www.taobao.com">www.taobao.com</a></p>
         */
        @NameInMap("SoundCodeContent")
        public String soundCodeContent;

        public static QuerySoundCodeListResponseBodyDataListItems build(java.util.Map<String, ?> map) throws Exception {
            QuerySoundCodeListResponseBodyDataListItems self = new QuerySoundCodeListResponseBodyDataListItems();
            return TeaModel.build(map, self);
        }

        public QuerySoundCodeListResponseBodyDataListItems setDuration(Integer duration) {
            this.duration = duration;
            return this;
        }
        public Integer getDuration() {
            return this.duration;
        }

        public QuerySoundCodeListResponseBodyDataListItems setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public QuerySoundCodeListResponseBodyDataListItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QuerySoundCodeListResponseBodyDataListItems setOpenType(String openType) {
            this.openType = openType;
            return this;
        }
        public String getOpenType() {
            return this.openType;
        }

        public QuerySoundCodeListResponseBodyDataListItems setSoundCode(String soundCode) {
            this.soundCode = soundCode;
            return this;
        }
        public String getSoundCode() {
            return this.soundCode;
        }

        public QuerySoundCodeListResponseBodyDataListItems setSoundCodeContent(String soundCodeContent) {
            this.soundCodeContent = soundCodeContent;
            return this;
        }
        public String getSoundCodeContent() {
            return this.soundCodeContent;
        }

    }

    public static class QuerySoundCodeListResponseBodyDataList extends TeaModel {
        @NameInMap("Items")
        public java.util.List<QuerySoundCodeListResponseBodyDataListItems> items;

        public static QuerySoundCodeListResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            QuerySoundCodeListResponseBodyDataList self = new QuerySoundCodeListResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public QuerySoundCodeListResponseBodyDataList setItems(java.util.List<QuerySoundCodeListResponseBodyDataListItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<QuerySoundCodeListResponseBodyDataListItems> getItems() {
            return this.items;
        }

    }

    public static class QuerySoundCodeListResponseBodyData extends TeaModel {
        @NameInMap("List")
        public QuerySoundCodeListResponseBodyDataList list;

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
         * <p>100</p>
         */
        @NameInMap("Total")
        public Integer total;

        public static QuerySoundCodeListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QuerySoundCodeListResponseBodyData self = new QuerySoundCodeListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QuerySoundCodeListResponseBodyData setList(QuerySoundCodeListResponseBodyDataList list) {
            this.list = list;
            return this;
        }
        public QuerySoundCodeListResponseBodyDataList getList() {
            return this.list;
        }

        public QuerySoundCodeListResponseBodyData setPageId(Integer pageId) {
            this.pageId = pageId;
            return this;
        }
        public Integer getPageId() {
            return this.pageId;
        }

        public QuerySoundCodeListResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QuerySoundCodeListResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
