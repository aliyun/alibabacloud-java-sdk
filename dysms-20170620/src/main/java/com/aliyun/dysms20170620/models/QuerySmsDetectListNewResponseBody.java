// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class QuerySmsDetectListNewResponseBody extends TeaModel {
    @NameInMap("List")
    public java.util.List<QuerySmsDetectListNewResponseBodyList> list;

    @NameInMap("PageNo")
    public Integer pageNo;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Total")
    public Long total;

    public static QuerySmsDetectListNewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QuerySmsDetectListNewResponseBody self = new QuerySmsDetectListNewResponseBody();
        return TeaModel.build(map, self);
    }

    public QuerySmsDetectListNewResponseBody setList(java.util.List<QuerySmsDetectListNewResponseBodyList> list) {
        this.list = list;
        return this;
    }
    public java.util.List<QuerySmsDetectListNewResponseBodyList> getList() {
        return this.list;
    }

    public QuerySmsDetectListNewResponseBody setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public QuerySmsDetectListNewResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QuerySmsDetectListNewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QuerySmsDetectListNewResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public static class QuerySmsDetectListNewResponseBodyList extends TeaModel {
        @NameInMap("DetectContent")
        public String detectContent;

        @NameInMap("DetectSignName")
        public String detectSignName;

        @NameInMap("DetectTime")
        public String detectTime;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("SuccessRate")
        public String successRate;

        @NameInMap("TemplateCode")
        public String templateCode;

        @NameInMap("TemplateParam")
        public String templateParam;

        public static QuerySmsDetectListNewResponseBodyList build(java.util.Map<String, ?> map) throws Exception {
            QuerySmsDetectListNewResponseBodyList self = new QuerySmsDetectListNewResponseBodyList();
            return TeaModel.build(map, self);
        }

        public QuerySmsDetectListNewResponseBodyList setDetectContent(String detectContent) {
            this.detectContent = detectContent;
            return this;
        }
        public String getDetectContent() {
            return this.detectContent;
        }

        public QuerySmsDetectListNewResponseBodyList setDetectSignName(String detectSignName) {
            this.detectSignName = detectSignName;
            return this;
        }
        public String getDetectSignName() {
            return this.detectSignName;
        }

        public QuerySmsDetectListNewResponseBodyList setDetectTime(String detectTime) {
            this.detectTime = detectTime;
            return this;
        }
        public String getDetectTime() {
            return this.detectTime;
        }

        public QuerySmsDetectListNewResponseBodyList setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public QuerySmsDetectListNewResponseBodyList setSuccessRate(String successRate) {
            this.successRate = successRate;
            return this;
        }
        public String getSuccessRate() {
            return this.successRate;
        }

        public QuerySmsDetectListNewResponseBodyList setTemplateCode(String templateCode) {
            this.templateCode = templateCode;
            return this;
        }
        public String getTemplateCode() {
            return this.templateCode;
        }

        public QuerySmsDetectListNewResponseBodyList setTemplateParam(String templateParam) {
            this.templateParam = templateParam;
            return this;
        }
        public String getTemplateParam() {
            return this.templateParam;
        }

    }

}
