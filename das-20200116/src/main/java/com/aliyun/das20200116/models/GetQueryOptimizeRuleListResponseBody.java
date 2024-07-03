// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetQueryOptimizeRuleListResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code returned.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The detailed information.</p>
     */
    @NameInMap("Data")
    public GetQueryOptimizeRuleListResponseBodyData data;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>Successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>B6D17591-B48B-4D31-9CD6-9B9796B2****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public String success;

    public static GetQueryOptimizeRuleListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetQueryOptimizeRuleListResponseBody self = new GetQueryOptimizeRuleListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetQueryOptimizeRuleListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetQueryOptimizeRuleListResponseBody setData(GetQueryOptimizeRuleListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetQueryOptimizeRuleListResponseBodyData getData() {
        return this.data;
    }

    public GetQueryOptimizeRuleListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetQueryOptimizeRuleListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetQueryOptimizeRuleListResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class GetQueryOptimizeRuleListResponseBodyDataList extends TeaModel {
        /**
         * <p>The name of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>LARGE_ROWS_EXAMINED</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>A reserved parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        @NameInMap("RuleId")
        public String ruleId;

        /**
         * <p>The type of the tag. <strong>Predefined</strong> is returned, which indicates that the tag is added by the system.</p>
         * 
         * <strong>example:</strong>
         * <p>Predefined</p>
         */
        @NameInMap("Type")
        public String type;

        public static GetQueryOptimizeRuleListResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            GetQueryOptimizeRuleListResponseBodyDataList self = new GetQueryOptimizeRuleListResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public GetQueryOptimizeRuleListResponseBodyDataList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetQueryOptimizeRuleListResponseBodyDataList setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

        public GetQueryOptimizeRuleListResponseBodyDataList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetQueryOptimizeRuleListResponseBodyData extends TeaModel {
        /**
         * <p>A reserved parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        @NameInMap("Extra")
        public String extra;

        /**
         * <p>The information about tags.</p>
         */
        @NameInMap("List")
        public java.util.List<GetQueryOptimizeRuleListResponseBodyDataList> list;

        /**
         * <p>A reserved parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        @NameInMap("PageNo")
        public Integer pageNo;

        /**
         * <p>A reserved parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Total")
        public Long total;

        public static GetQueryOptimizeRuleListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetQueryOptimizeRuleListResponseBodyData self = new GetQueryOptimizeRuleListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetQueryOptimizeRuleListResponseBodyData setExtra(String extra) {
            this.extra = extra;
            return this;
        }
        public String getExtra() {
            return this.extra;
        }

        public GetQueryOptimizeRuleListResponseBodyData setList(java.util.List<GetQueryOptimizeRuleListResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<GetQueryOptimizeRuleListResponseBodyDataList> getList() {
            return this.list;
        }

        public GetQueryOptimizeRuleListResponseBodyData setPageNo(Integer pageNo) {
            this.pageNo = pageNo;
            return this;
        }
        public Integer getPageNo() {
            return this.pageNo;
        }

        public GetQueryOptimizeRuleListResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public GetQueryOptimizeRuleListResponseBodyData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
