// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20230516.models;

import com.aliyun.tea.*;

public class SmsTemplatePageListResponseBody extends TeaModel {
    @NameInMap("Code")
    public Long code;

    @NameInMap("Message")
    public String message;

    @NameInMap("Model")
    public SmsTemplatePageListResponseBodyModel model;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Timestamp")
    public Long timestamp;

    public static SmsTemplatePageListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SmsTemplatePageListResponseBody self = new SmsTemplatePageListResponseBody();
        return TeaModel.build(map, self);
    }

    public SmsTemplatePageListResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public SmsTemplatePageListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SmsTemplatePageListResponseBody setModel(SmsTemplatePageListResponseBodyModel model) {
        this.model = model;
        return this;
    }
    public SmsTemplatePageListResponseBodyModel getModel() {
        return this.model;
    }

    public SmsTemplatePageListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SmsTemplatePageListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public SmsTemplatePageListResponseBody setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    public Long getTimestamp() {
        return this.timestamp;
    }

    public static class SmsTemplatePageListResponseBodyModelList extends TeaModel {
        /**
         * <p>短信内容</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>创建时间</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>模板所需参数</p>
         */
        @NameInMap("Properties")
        public String properties;

        /**
         * <p>智能短链ID</p>
         */
        @NameInMap("ShortUrlTaskId")
        public Long shortUrlTaskId;

        /**
         * <p>短信签名</p>
         */
        @NameInMap("Sign")
        public String sign;

        /**
         * <p>短信类型</p>
         */
        @NameInMap("SmsType")
        public String smsType;

        /**
         * <p>模板状态</p>
         */
        @NameInMap("Status")
        public Long status;

        /**
         * <p>模板ID</p>
         */
        @NameInMap("TemplateId")
        public Long templateId;

        /**
         * <p>模板名称</p>
         */
        @NameInMap("TemplateName")
        public String templateName;

        /**
         * <p>模板类型</p>
         */
        @NameInMap("TemplateType")
        public Long templateType;

        public static SmsTemplatePageListResponseBodyModelList build(java.util.Map<String, ?> map) throws Exception {
            SmsTemplatePageListResponseBodyModelList self = new SmsTemplatePageListResponseBodyModelList();
            return TeaModel.build(map, self);
        }

        public SmsTemplatePageListResponseBodyModelList setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public SmsTemplatePageListResponseBodyModelList setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public SmsTemplatePageListResponseBodyModelList setProperties(String properties) {
            this.properties = properties;
            return this;
        }
        public String getProperties() {
            return this.properties;
        }

        public SmsTemplatePageListResponseBodyModelList setShortUrlTaskId(Long shortUrlTaskId) {
            this.shortUrlTaskId = shortUrlTaskId;
            return this;
        }
        public Long getShortUrlTaskId() {
            return this.shortUrlTaskId;
        }

        public SmsTemplatePageListResponseBodyModelList setSign(String sign) {
            this.sign = sign;
            return this;
        }
        public String getSign() {
            return this.sign;
        }

        public SmsTemplatePageListResponseBodyModelList setSmsType(String smsType) {
            this.smsType = smsType;
            return this;
        }
        public String getSmsType() {
            return this.smsType;
        }

        public SmsTemplatePageListResponseBodyModelList setStatus(Long status) {
            this.status = status;
            return this;
        }
        public Long getStatus() {
            return this.status;
        }

        public SmsTemplatePageListResponseBodyModelList setTemplateId(Long templateId) {
            this.templateId = templateId;
            return this;
        }
        public Long getTemplateId() {
            return this.templateId;
        }

        public SmsTemplatePageListResponseBodyModelList setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

        public SmsTemplatePageListResponseBodyModelList setTemplateType(Long templateType) {
            this.templateType = templateType;
            return this;
        }
        public Long getTemplateType() {
            return this.templateType;
        }

    }

    public static class SmsTemplatePageListResponseBodyModel extends TeaModel {
        @NameInMap("List")
        public java.util.List<SmsTemplatePageListResponseBodyModelList> list;

        @NameInMap("PageNo")
        public Long pageNo;

        @NameInMap("PageSize")
        public Long pageSize;

        @NameInMap("TotalCount")
        public Long totalCount;

        @NameInMap("TotalPage")
        public Long totalPage;

        public static SmsTemplatePageListResponseBodyModel build(java.util.Map<String, ?> map) throws Exception {
            SmsTemplatePageListResponseBodyModel self = new SmsTemplatePageListResponseBodyModel();
            return TeaModel.build(map, self);
        }

        public SmsTemplatePageListResponseBodyModel setList(java.util.List<SmsTemplatePageListResponseBodyModelList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<SmsTemplatePageListResponseBodyModelList> getList() {
            return this.list;
        }

        public SmsTemplatePageListResponseBodyModel setPageNo(Long pageNo) {
            this.pageNo = pageNo;
            return this;
        }
        public Long getPageNo() {
            return this.pageNo;
        }

        public SmsTemplatePageListResponseBodyModel setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public SmsTemplatePageListResponseBodyModel setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

        public SmsTemplatePageListResponseBodyModel setTotalPage(Long totalPage) {
            this.totalPage = totalPage;
            return this;
        }
        public Long getTotalPage() {
            return this.totalPage;
        }

    }

}
