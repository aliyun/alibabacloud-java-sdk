// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetSeatInformationResponseBody extends TeaModel {
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
    public GetSeatInformationResponseBodyData data;

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

    public static GetSeatInformationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSeatInformationResponseBody self = new GetSeatInformationResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSeatInformationResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetSeatInformationResponseBody setData(GetSeatInformationResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetSeatInformationResponseBodyData getData() {
        return this.data;
    }

    public GetSeatInformationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetSeatInformationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSeatInformationResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class GetSeatInformationResponseBodyData extends TeaModel {
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
         * <p>{&quot;tenant_id&quot;: &quot;905&quot;, &quot;tenant_name&quot;: &quot;非单元测试化BU&quot;, &quot;department_id&quot;: &quot;-1&quot;, &quot;svc_avai_capacity&quot;: 7,      &quot;svc_current_capacity&quot;: 0, &quot;department_name&quot;: &quot;-1&quot;,  &quot;svc_online_cnt&quot;: 3, &quot;svc_ask_offline_servicer_num&quot;: 0,      &quot;date_id&quot;: &quot;20210401&quot;,  &quot;svc_max_capacity&quot;: 7, &quot;svc_rest_cnt&quot;: 0, &quot;current_speci_ability_num&quot;: 0, &quot;servicer_rest_cnt&quot;: 122, &quot;max_speci_ability_num&quot;: 3,      &quot;svc_offline_cnt&quot;: 0,  &quot;svc_no_client_cnt&quot;: 3, &quot;svc_ask_rest_servicer_num&quot;: 0}</p>
         */
        @NameInMap("Rowr")
        public String rowr;

        /**
         * <p>Total number of records.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("TotalNum")
        public Integer totalNum;

        public static GetSeatInformationResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetSeatInformationResponseBodyData self = new GetSeatInformationResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetSeatInformationResponseBodyData setPageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Integer getPageNum() {
            return this.pageNum;
        }

        public GetSeatInformationResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public GetSeatInformationResponseBodyData setRowr(String rowr) {
            this.rowr = rowr;
            return this;
        }
        public String getRowr() {
            return this.rowr;
        }

        public GetSeatInformationResponseBodyData setTotalNum(Integer totalNum) {
            this.totalNum = totalNum;
            return this;
        }
        public Integer getTotalNum() {
            return this.totalNum;
        }

    }

}
