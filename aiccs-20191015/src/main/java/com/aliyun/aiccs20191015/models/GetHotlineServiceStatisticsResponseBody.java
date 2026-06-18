// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetHotlineServiceStatisticsResponseBody extends TeaModel {
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
    public GetHotlineServiceStatisticsResponseBodyData data;

    /**
     * <p>Status description.</p>
     * 
     * <strong>example:</strong>
     * <p>message</p>
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
     * <p>Indicates whether the API invocation succeeded. Valid values:</p>
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

    public static GetHotlineServiceStatisticsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetHotlineServiceStatisticsResponseBody self = new GetHotlineServiceStatisticsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetHotlineServiceStatisticsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetHotlineServiceStatisticsResponseBody setData(GetHotlineServiceStatisticsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetHotlineServiceStatisticsResponseBodyData getData() {
        return this.data;
    }

    public GetHotlineServiceStatisticsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetHotlineServiceStatisticsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetHotlineServiceStatisticsResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class GetHotlineServiceStatisticsResponseBodyData extends TeaModel {
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
         * <p>A JSON string of type List<Map>.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;tenant_id&quot;:&quot;905&quot;,&quot;n_resttype_now&quot;:0,&quot;tenant_name&quot;:&quot;非单元测试化BU&quot;,&quot;n_resttype1_now&quot;:0,&quot;group_name&quot;:&quot;-1&quot;,&quot;department_id&quot;:&quot;-1&quot;,&quot;department_name&quot;:&quot;-1&quot;,&quot;n_resttype98_now&quot;:0,&quot;n_online_now&quot;:0,&quot;date_id&quot;:&quot;20210401&quot;,&quot;n_resttype3_now&quot;:0,&quot;n_resttype5_now&quot;:0,&quot;n_busy_now&quot;:0,&quot;n_resttype2_now&quot;:0,&quot;group_id&quot;:&quot;-1&quot;,&quot;n_idle_now&quot;:0,&quot;n_resttype4_now&quot;:0,&quot;n_ack_now&quot;:0,&quot;n_resttype99_now&quot;:0}</p>
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

        public static GetHotlineServiceStatisticsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetHotlineServiceStatisticsResponseBodyData self = new GetHotlineServiceStatisticsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetHotlineServiceStatisticsResponseBodyData setPageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Integer getPageNum() {
            return this.pageNum;
        }

        public GetHotlineServiceStatisticsResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public GetHotlineServiceStatisticsResponseBodyData setRows(String rows) {
            this.rows = rows;
            return this;
        }
        public String getRows() {
            return this.rows;
        }

        public GetHotlineServiceStatisticsResponseBodyData setTotalNum(Integer totalNum) {
            this.totalNum = totalNum;
            return this;
        }
        public Integer getTotalNum() {
            return this.totalNum;
        }

    }

}
