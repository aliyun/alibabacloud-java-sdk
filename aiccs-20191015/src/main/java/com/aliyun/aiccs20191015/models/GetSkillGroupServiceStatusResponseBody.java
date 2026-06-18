// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetSkillGroupServiceStatusResponseBody extends TeaModel {
    /**
     * <p>Status code. A return value of 200 indicates that the request succeeded.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>List of data.</p>
     */
    @NameInMap("Data")
    public GetSkillGroupServiceStatusResponseBodyData data;

    /**
     * <p>Description of the status code.</p>
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
     * <p>Indicates whether the API was invoked successfully. Valid values:</p>
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

    public static GetSkillGroupServiceStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSkillGroupServiceStatusResponseBody self = new GetSkillGroupServiceStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSkillGroupServiceStatusResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetSkillGroupServiceStatusResponseBody setData(GetSkillGroupServiceStatusResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetSkillGroupServiceStatusResponseBodyData getData() {
        return this.data;
    }

    public GetSkillGroupServiceStatusResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetSkillGroupServiceStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSkillGroupServiceStatusResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class GetSkillGroupServiceStatusResponseBodyData extends TeaModel {
        /**
         * <p>Current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNum")
        public Integer pageNum;

        /**
         * <p>Page size. The value must be greater than <strong>0</strong>. Default value: <strong>20</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>2000</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>Information in the form of a JSON string of type List<Map>.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;online_40s_transfer_ready_cnt&quot;:382,&quot;minute_id&quot;:&quot;-1&quot;,&quot;online_unsatis_cnt&quot;:0,&quot;online_simple_cnt&quot;:0,&quot;average_queue_time&quot;:&quot;0.39&quot;,&quot;service_pickup&quot;:&quot;7752&quot;,&quot;online_service_time_len&quot;:220753,&quot;online_direct_give_up_len&quot;:1187,&quot;channel_instance_name&quot;:&quot;-1&quot;,&quot;servicer_id&quot;:&quot;-1&quot;,&quot;tenant_name&quot;:&quot;非单元测试化BU&quot;,&quot;group_name&quot;:&quot;-1&quot;,&quot;online_30s_transfer_ready_cnt&quot;:382}</p>
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

        public static GetSkillGroupServiceStatusResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetSkillGroupServiceStatusResponseBodyData self = new GetSkillGroupServiceStatusResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetSkillGroupServiceStatusResponseBodyData setPageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Integer getPageNum() {
            return this.pageNum;
        }

        public GetSkillGroupServiceStatusResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public GetSkillGroupServiceStatusResponseBodyData setRows(String rows) {
            this.rows = rows;
            return this;
        }
        public String getRows() {
            return this.rows;
        }

        public GetSkillGroupServiceStatusResponseBodyData setTotalNum(Integer totalNum) {
            this.totalNum = totalNum;
            return this;
        }
        public Integer getTotalNum() {
            return this.totalNum;
        }

    }

}
