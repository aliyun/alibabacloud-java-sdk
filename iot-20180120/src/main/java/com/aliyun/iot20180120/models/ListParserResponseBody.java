// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class ListParserResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>iot.system.SystemException</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ListParserResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <strong>example:</strong>
     * <p>E4C0FF92-2A86-41DB-92D3-73B60310D25E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("Total")
    public Integer total;

    public static ListParserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListParserResponseBody self = new ListParserResponseBody();
        return TeaModel.build(map, self);
    }

    public ListParserResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListParserResponseBody setData(ListParserResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListParserResponseBodyData getData() {
        return this.data;
    }

    public ListParserResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListParserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListParserResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListParserResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class ListParserResponseBodyDataParserList extends TeaModel {
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>DataParser</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>1001</p>
         */
        @NameInMap("ParserId")
        public Long parserId;

        /**
         * <strong>example:</strong>
         * <p>STOP</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>2022-03-21T12:45:43.000Z</p>
         */
        @NameInMap("UtcCreated")
        public String utcCreated;

        /**
         * <strong>example:</strong>
         * <p>2022-03-25T12:45:43.000Z</p>
         */
        @NameInMap("UtcModified")
        public String utcModified;

        public static ListParserResponseBodyDataParserList build(java.util.Map<String, ?> map) throws Exception {
            ListParserResponseBodyDataParserList self = new ListParserResponseBodyDataParserList();
            return TeaModel.build(map, self);
        }

        public ListParserResponseBodyDataParserList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListParserResponseBodyDataParserList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListParserResponseBodyDataParserList setParserId(Long parserId) {
            this.parserId = parserId;
            return this;
        }
        public Long getParserId() {
            return this.parserId;
        }

        public ListParserResponseBodyDataParserList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListParserResponseBodyDataParserList setUtcCreated(String utcCreated) {
            this.utcCreated = utcCreated;
            return this;
        }
        public String getUtcCreated() {
            return this.utcCreated;
        }

        public ListParserResponseBodyDataParserList setUtcModified(String utcModified) {
            this.utcModified = utcModified;
            return this;
        }
        public String getUtcModified() {
            return this.utcModified;
        }

    }

    public static class ListParserResponseBodyData extends TeaModel {
        @NameInMap("ParserList")
        public java.util.List<ListParserResponseBodyDataParserList> parserList;

        public static ListParserResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListParserResponseBodyData self = new ListParserResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListParserResponseBodyData setParserList(java.util.List<ListParserResponseBodyDataParserList> parserList) {
            this.parserList = parserList;
            return this;
        }
        public java.util.List<ListParserResponseBodyDataParserList> getParserList() {
            return this.parserList;
        }

    }

}
