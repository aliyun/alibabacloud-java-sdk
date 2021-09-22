// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class ListSmsTemplatesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("SmsTemplates")
    public java.util.List<ListSmsTemplatesResponseBodySmsTemplates> smsTemplates;

    public static ListSmsTemplatesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSmsTemplatesResponseBody self = new ListSmsTemplatesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSmsTemplatesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSmsTemplatesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListSmsTemplatesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListSmsTemplatesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListSmsTemplatesResponseBody setSmsTemplates(java.util.List<ListSmsTemplatesResponseBodySmsTemplates> smsTemplates) {
        this.smsTemplates = smsTemplates;
        return this;
    }
    public java.util.List<ListSmsTemplatesResponseBodySmsTemplates> getSmsTemplates() {
        return this.smsTemplates;
    }

    public static class ListSmsTemplatesResponseBodySmsTemplates extends TeaModel {
        @NameInMap("UpdateTime")
        public String updateTime;

        @NameInMap("TemplateContent")
        public String templateContent;

        @NameInMap("Remark")
        public String remark;

        @NameInMap("TemplateCode")
        public String templateCode;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("TemplateType")
        public Integer templateType;

        @NameInMap("TemplateName")
        public String templateName;

        public static ListSmsTemplatesResponseBodySmsTemplates build(java.util.Map<String, ?> map) throws Exception {
            ListSmsTemplatesResponseBodySmsTemplates self = new ListSmsTemplatesResponseBodySmsTemplates();
            return TeaModel.build(map, self);
        }

        public ListSmsTemplatesResponseBodySmsTemplates setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public ListSmsTemplatesResponseBodySmsTemplates setTemplateContent(String templateContent) {
            this.templateContent = templateContent;
            return this;
        }
        public String getTemplateContent() {
            return this.templateContent;
        }

        public ListSmsTemplatesResponseBodySmsTemplates setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public ListSmsTemplatesResponseBodySmsTemplates setTemplateCode(String templateCode) {
            this.templateCode = templateCode;
            return this;
        }
        public String getTemplateCode() {
            return this.templateCode;
        }

        public ListSmsTemplatesResponseBodySmsTemplates setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListSmsTemplatesResponseBodySmsTemplates setTemplateType(Integer templateType) {
            this.templateType = templateType;
            return this;
        }
        public Integer getTemplateType() {
            return this.templateType;
        }

        public ListSmsTemplatesResponseBodySmsTemplates setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

    }

}
