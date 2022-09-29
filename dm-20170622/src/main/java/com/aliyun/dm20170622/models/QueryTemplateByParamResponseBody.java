// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20170622.models;

import com.aliyun.tea.*;

public class QueryTemplateByParamResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("data")
    public QueryTemplateByParamResponseBodyData data;

    public static QueryTemplateByParamResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryTemplateByParamResponseBody self = new QueryTemplateByParamResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryTemplateByParamResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public QueryTemplateByParamResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryTemplateByParamResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryTemplateByParamResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public QueryTemplateByParamResponseBody setData(QueryTemplateByParamResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryTemplateByParamResponseBodyData getData() {
        return this.data;
    }

    public static class QueryTemplateByParamResponseBodyDataTemplate extends TeaModel {
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("SmsStatus")
        public Integer smsStatus;

        @NameInMap("SmsTemplateCode")
        public Integer smsTemplateCode;

        @NameInMap("Smsrejectinfo")
        public Integer smsrejectinfo;

        @NameInMap("TemplateComment")
        public String templateComment;

        @NameInMap("TemplateId")
        public String templateId;

        @NameInMap("TemplateName")
        public String templateName;

        @NameInMap("TemplateStatus")
        public String templateStatus;

        @NameInMap("TemplateType")
        public Integer templateType;

        @NameInMap("UtcCreatetime")
        public Long utcCreatetime;

        public static QueryTemplateByParamResponseBodyDataTemplate build(java.util.Map<String, ?> map) throws Exception {
            QueryTemplateByParamResponseBodyDataTemplate self = new QueryTemplateByParamResponseBodyDataTemplate();
            return TeaModel.build(map, self);
        }

        public QueryTemplateByParamResponseBodyDataTemplate setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public QueryTemplateByParamResponseBodyDataTemplate setSmsStatus(Integer smsStatus) {
            this.smsStatus = smsStatus;
            return this;
        }
        public Integer getSmsStatus() {
            return this.smsStatus;
        }

        public QueryTemplateByParamResponseBodyDataTemplate setSmsTemplateCode(Integer smsTemplateCode) {
            this.smsTemplateCode = smsTemplateCode;
            return this;
        }
        public Integer getSmsTemplateCode() {
            return this.smsTemplateCode;
        }

        public QueryTemplateByParamResponseBodyDataTemplate setSmsrejectinfo(Integer smsrejectinfo) {
            this.smsrejectinfo = smsrejectinfo;
            return this;
        }
        public Integer getSmsrejectinfo() {
            return this.smsrejectinfo;
        }

        public QueryTemplateByParamResponseBodyDataTemplate setTemplateComment(String templateComment) {
            this.templateComment = templateComment;
            return this;
        }
        public String getTemplateComment() {
            return this.templateComment;
        }

        public QueryTemplateByParamResponseBodyDataTemplate setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public QueryTemplateByParamResponseBodyDataTemplate setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

        public QueryTemplateByParamResponseBodyDataTemplate setTemplateStatus(String templateStatus) {
            this.templateStatus = templateStatus;
            return this;
        }
        public String getTemplateStatus() {
            return this.templateStatus;
        }

        public QueryTemplateByParamResponseBodyDataTemplate setTemplateType(Integer templateType) {
            this.templateType = templateType;
            return this;
        }
        public Integer getTemplateType() {
            return this.templateType;
        }

        public QueryTemplateByParamResponseBodyDataTemplate setUtcCreatetime(Long utcCreatetime) {
            this.utcCreatetime = utcCreatetime;
            return this;
        }
        public Long getUtcCreatetime() {
            return this.utcCreatetime;
        }

    }

    public static class QueryTemplateByParamResponseBodyData extends TeaModel {
        @NameInMap("template")
        public java.util.List<QueryTemplateByParamResponseBodyDataTemplate> template;

        public static QueryTemplateByParamResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryTemplateByParamResponseBodyData self = new QueryTemplateByParamResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryTemplateByParamResponseBodyData setTemplate(java.util.List<QueryTemplateByParamResponseBodyDataTemplate> template) {
            this.template = template;
            return this;
        }
        public java.util.List<QueryTemplateByParamResponseBodyDataTemplate> getTemplate() {
            return this.template;
        }

    }

}
