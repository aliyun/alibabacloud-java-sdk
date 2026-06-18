// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetOnlineSeatInformationResponseBody extends TeaModel {
    /**
     * <p>Status code. A return value of 200 indicates that the request succeeded.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Data list.</p>
     */
    @NameInMap("Data")
    public GetOnlineSeatInformationResponseBodyData data;

    /**
     * <p>Status code description.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>EE338D98-9BD3-4413-B165</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the API call succeeded. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Succeeded.</li>
     * <li><strong>false</strong>: Failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public String success;

    public static GetOnlineSeatInformationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetOnlineSeatInformationResponseBody self = new GetOnlineSeatInformationResponseBody();
        return TeaModel.build(map, self);
    }

    public GetOnlineSeatInformationResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetOnlineSeatInformationResponseBody setData(GetOnlineSeatInformationResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetOnlineSeatInformationResponseBodyData getData() {
        return this.data;
    }

    public GetOnlineSeatInformationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetOnlineSeatInformationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetOnlineSeatInformationResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class GetOnlineSeatInformationResponseBodyData extends TeaModel {
        /**
         * <p>Current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNum")
        public Integer pageNum;

        /**
         * <p>Page size.</p>
         * 
         * <strong>example:</strong>
         * <p>2000</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The information is a JSON string of the List<Map> type.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;tenant_id&quot;:&quot;905&quot;,&quot;max_service_num&quot;:&quot;3&quot;,&quot;servicer_id&quot;:&quot;36****&quot;,&quot;tenant_name&quot;:&quot;非单元测试化BU&quot;,&quot;record_gmt_modified&quot;:&quot;2021-04-01 23:20:03&quot;,&quot;pk_id&quot;:&quot;3690012021****&quot;,&quot;record_gmt_create&quot;:&quot;2021-04-01 23:19:55&quot;,&quot;department_id&quot;:&quot;10****&quot;}</p>
         */
        @NameInMap("Rows")
        public String rows;

        /**
         * <p>Total number of records.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("TotalNum")
        public Integer totalNum;

        public static GetOnlineSeatInformationResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetOnlineSeatInformationResponseBodyData self = new GetOnlineSeatInformationResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetOnlineSeatInformationResponseBodyData setPageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Integer getPageNum() {
            return this.pageNum;
        }

        public GetOnlineSeatInformationResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public GetOnlineSeatInformationResponseBodyData setRows(String rows) {
            this.rows = rows;
            return this;
        }
        public String getRows() {
            return this.rows;
        }

        public GetOnlineSeatInformationResponseBodyData setTotalNum(Integer totalNum) {
            this.totalNum = totalNum;
            return this;
        }
        public Integer getTotalNum() {
            return this.totalNum;
        }

    }

}
