// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetAgentStatisticsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetAgentStatisticsResponseBodyData data;

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

    public static GetAgentStatisticsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAgentStatisticsResponseBody self = new GetAgentStatisticsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAgentStatisticsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetAgentStatisticsResponseBody setData(GetAgentStatisticsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetAgentStatisticsResponseBodyData getData() {
        return this.data;
    }

    public GetAgentStatisticsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetAgentStatisticsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAgentStatisticsResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class GetAgentStatisticsResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNum")
        public Integer pageNum;

        /**
         * <strong>example:</strong>
         * <p>2000</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <strong>example:</strong>
         * <p>{&quot;n_resttype_1&quot;:15,&quot;t_outcall_speak&quot;:829747,&quot;average_incoming_time&quot;:&quot;8451.29&quot;,&quot;n_resttype_3&quot;:0,&quot;minute_id&quot;:&quot;-1&quot;,&quot;n_conference_speak&quot;:0,&quot;n_resttype_2&quot;:0,&quot;n_resttype_5&quot;:0,&quot;n_resttype_4&quot;:0,&quot;n_resttype_7&quot;:0,&quot;n_resttype_6&quot;:0,&quot;n_resttype_9&quot;:0,&quot;n_resttype_8&quot;:0,&quot;n_outcall_dial&quot;:25,&quot;total_break_time&quot;:&quot;58555&quot;,&quot;n_internal_speak&quot;:0,&quot;n_send_step_transfer&quot;:7,&quot;n_consulted_internal_speak&quot;:0}</p>
         */
        @NameInMap("Rows")
        public String rows;

        /**
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("TotalNum")
        public Integer totalNum;

        public static GetAgentStatisticsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetAgentStatisticsResponseBodyData self = new GetAgentStatisticsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetAgentStatisticsResponseBodyData setPageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Integer getPageNum() {
            return this.pageNum;
        }

        public GetAgentStatisticsResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public GetAgentStatisticsResponseBodyData setRows(String rows) {
            this.rows = rows;
            return this;
        }
        public String getRows() {
            return this.rows;
        }

        public GetAgentStatisticsResponseBodyData setTotalNum(Integer totalNum) {
            this.totalNum = totalNum;
            return this;
        }
        public Integer getTotalNum() {
            return this.totalNum;
        }

    }

}
