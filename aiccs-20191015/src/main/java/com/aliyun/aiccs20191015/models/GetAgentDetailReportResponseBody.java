// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetAgentDetailReportResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetAgentDetailReportResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>EE338D98-9BD3-4413-B165</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public String success;

    public static GetAgentDetailReportResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAgentDetailReportResponseBody self = new GetAgentDetailReportResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAgentDetailReportResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetAgentDetailReportResponseBody setData(GetAgentDetailReportResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetAgentDetailReportResponseBodyData getData() {
        return this.data;
    }

    public GetAgentDetailReportResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetAgentDetailReportResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAgentDetailReportResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class GetAgentDetailReportResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNum")
        public Long pageNum;

        /**
         * <strong>example:</strong>
         * <p>2000</p>
         */
        @NameInMap("PageSize")
        public Long pageSize;

        /**
         * <strong>example:</strong>
         * <p>{&quot;t_wait&quot;:379322.0,&quot;hotline_time_outcall_avg&quot;:&quot;32.00&quot;,&quot;n_ringing&quot;:0,&quot;t_outbound_40&quot;:0.0,&quot;hotline_time_incall_avg&quot;:-1,&quot;t_calldialing&quot;:0.0,&quot;n_inbound&quot;:276,&quot;servicer_id&quot;:&quot;-1&quot;,&quot;call_in_sep_sat_cnt&quot;:13,&quot;request_cnt&quot;:231,&quot;n_not_ready_99&quot;:811,&quot;t_work_outbound&quot;:49338.0,&quot;hotline_rate_handle_in_60s&quot;:&quot;96%&quot;,&quot;n_not_ready_login&quot;:811,&quot;t_not_ready_login&quot;:0.0,&quot;n_work_inbound&quot;:176,&quot;}</p>
         */
        @NameInMap("Rows")
        public String rows;

        /**
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("TotalNum")
        public Long totalNum;

        public static GetAgentDetailReportResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetAgentDetailReportResponseBodyData self = new GetAgentDetailReportResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetAgentDetailReportResponseBodyData setPageNum(Long pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Long getPageNum() {
            return this.pageNum;
        }

        public GetAgentDetailReportResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public GetAgentDetailReportResponseBodyData setRows(String rows) {
            this.rows = rows;
            return this;
        }
        public String getRows() {
            return this.rows;
        }

        public GetAgentDetailReportResponseBodyData setTotalNum(Long totalNum) {
            this.totalNum = totalNum;
            return this;
        }
        public Long getTotalNum() {
            return this.totalNum;
        }

    }

}
