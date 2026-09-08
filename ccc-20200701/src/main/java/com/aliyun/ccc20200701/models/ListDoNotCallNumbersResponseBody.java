// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListDoNotCallNumbersResponseBody extends TeaModel {
    /**
     * <p>Response code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Data.</p>
     */
    @NameInMap("Data")
    public ListDoNotCallNumbersResponseBodyData data;

    /**
     * <p>HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>Response message.</p>
     * 
     * <strong>example:</strong>
     * <p>无</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>List of response parameters.</p>
     */
    @NameInMap("Params")
    public java.util.List<String> params;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>BA03159C-E808-4FF1-B27E-A61B6E888D7F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListDoNotCallNumbersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDoNotCallNumbersResponseBody self = new ListDoNotCallNumbersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDoNotCallNumbersResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListDoNotCallNumbersResponseBody setData(ListDoNotCallNumbersResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListDoNotCallNumbersResponseBodyData getData() {
        return this.data;
    }

    public ListDoNotCallNumbersResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListDoNotCallNumbersResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListDoNotCallNumbersResponseBody setParams(java.util.List<String> params) {
        this.params = params;
        return this;
    }
    public java.util.List<String> getParams() {
        return this.params;
    }

    public ListDoNotCallNumbersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListDoNotCallNumbersResponseBodyDataList extends TeaModel {
        /**
         * <p>Creation time of the Do Not Call number configuration, in Unix timestamp format with millisecond precision. (Deprecated)</p>
         * 
         * <strong>example:</strong>
         * <p>1626962425000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>Creation time of the prohibited outbound call number configuration, in Unix timestamp format, in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1631440860000</p>
         */
        @NameInMap("CreatedTime")
        public Long createdTime;

        /**
         * <p>Creator, which is the agent logon name of the agent who created this record.</p>
         * 
         * <strong>example:</strong>
         * <p>agent</p>
         */
        @NameInMap("Creator")
        public String creator;

        /**
         * <p>Phone number.</p>
         * 
         * <strong>example:</strong>
         * <p>1900000****</p>
         */
        @NameInMap("Number")
        public String number;

        /**
         * <p>Remark.</p>
         * 
         * <strong>example:</strong>
         * <p>测试</p>
         */
        @NameInMap("Remark")
        public String remark;

        /**
         * <p>Scope of application.</p>
         * 
         * <strong>example:</strong>
         * <p>INSTANCE</p>
         */
        @NameInMap("Scope")
        public String scope;

        public static ListDoNotCallNumbersResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            ListDoNotCallNumbersResponseBodyDataList self = new ListDoNotCallNumbersResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public ListDoNotCallNumbersResponseBodyDataList setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListDoNotCallNumbersResponseBodyDataList setCreatedTime(Long createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public Long getCreatedTime() {
            return this.createdTime;
        }

        public ListDoNotCallNumbersResponseBodyDataList setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public ListDoNotCallNumbersResponseBodyDataList setNumber(String number) {
            this.number = number;
            return this;
        }
        public String getNumber() {
            return this.number;
        }

        public ListDoNotCallNumbersResponseBodyDataList setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public ListDoNotCallNumbersResponseBodyDataList setScope(String scope) {
            this.scope = scope;
            return this;
        }
        public String getScope() {
            return this.scope;
        }

    }

    public static class ListDoNotCallNumbersResponseBodyData extends TeaModel {
        /**
         * <p>List of prohibited outbound call numbers.</p>
         */
        @NameInMap("List")
        public java.util.List<ListDoNotCallNumbersResponseBodyDataList> list;

        /**
         * <p>Page number, ranging from 1 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>Page size, ranging from 1 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>Total count.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListDoNotCallNumbersResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListDoNotCallNumbersResponseBodyData self = new ListDoNotCallNumbersResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListDoNotCallNumbersResponseBodyData setList(java.util.List<ListDoNotCallNumbersResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<ListDoNotCallNumbersResponseBodyDataList> getList() {
            return this.list;
        }

        public ListDoNotCallNumbersResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListDoNotCallNumbersResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListDoNotCallNumbersResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
