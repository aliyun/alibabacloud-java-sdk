// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetDepartmentalLatitudeAgentStatusResponseBody extends TeaModel {
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
    public GetDepartmentalLatitudeAgentStatusResponseBodyData data;

    /**
     * <p>Status code description.</p>
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
    public Boolean success;

    public static GetDepartmentalLatitudeAgentStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDepartmentalLatitudeAgentStatusResponseBody self = new GetDepartmentalLatitudeAgentStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDepartmentalLatitudeAgentStatusResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetDepartmentalLatitudeAgentStatusResponseBody setData(GetDepartmentalLatitudeAgentStatusResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetDepartmentalLatitudeAgentStatusResponseBodyData getData() {
        return this.data;
    }

    public GetDepartmentalLatitudeAgentStatusResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetDepartmentalLatitudeAgentStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDepartmentalLatitudeAgentStatusResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetDepartmentalLatitudeAgentStatusResponseBodyData extends TeaModel {
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
         * <p>The information is a JSON string of type List<Map>.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;tenant_id&quot;:905,&quot;n_resttype_now&quot;:0,&quot;tenant_name&quot;:&quot;非单元测试化BU&quot;,&quot;n_resttype1_now&quot;:0,&quot;department_id&quot;:-1,&quot;department_name&quot;:-1,&quot;n_resttype98_now&quot;:0,&quot;n_online_now&quot;:0,&quot;date_id&quot;:20210329,&quot;n_resttype3_now&quot;:0,&quot;n_resttype5_now&quot;:0,&quot;n_busy_now&quot;:0,&quot;n_resttype2_now&quot;:0,&quot;n_idle_now&quot;:0,&quot;n_resttype4_now&quot;:0,&quot;n_ack_now&quot;:0,&quot;n_resttype99_now&quot;:0}</p>
         */
        @NameInMap("Rows")
        public String rows;

        /**
         * <p>Total number of pages.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("TotalNum")
        public Integer totalNum;

        public static GetDepartmentalLatitudeAgentStatusResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetDepartmentalLatitudeAgentStatusResponseBodyData self = new GetDepartmentalLatitudeAgentStatusResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetDepartmentalLatitudeAgentStatusResponseBodyData setPageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Integer getPageNum() {
            return this.pageNum;
        }

        public GetDepartmentalLatitudeAgentStatusResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public GetDepartmentalLatitudeAgentStatusResponseBodyData setRows(String rows) {
            this.rows = rows;
            return this;
        }
        public String getRows() {
            return this.rows;
        }

        public GetDepartmentalLatitudeAgentStatusResponseBodyData setTotalNum(Integer totalNum) {
            this.totalNum = totalNum;
            return this;
        }
        public Integer getTotalNum() {
            return this.totalNum;
        }

    }

}
