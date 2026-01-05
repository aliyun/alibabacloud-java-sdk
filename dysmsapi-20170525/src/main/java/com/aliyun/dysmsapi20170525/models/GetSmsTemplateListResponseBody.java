// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class GetSmsTemplateListResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>示例值示例值</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetSmsTemplateListResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>示例值示例值</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>示例值</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetSmsTemplateListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSmsTemplateListResponseBody self = new GetSmsTemplateListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSmsTemplateListResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public GetSmsTemplateListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetSmsTemplateListResponseBody setData(GetSmsTemplateListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetSmsTemplateListResponseBodyData getData() {
        return this.data;
    }

    public GetSmsTemplateListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetSmsTemplateListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSmsTemplateListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetSmsTemplateListResponseBodyDataListTemplateTag extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>示例值</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        @NameInMap("TagValue")
        public String tagValue;

        public static GetSmsTemplateListResponseBodyDataListTemplateTag build(java.util.Map<String, ?> map) throws Exception {
            GetSmsTemplateListResponseBodyDataListTemplateTag self = new GetSmsTemplateListResponseBodyDataListTemplateTag();
            return TeaModel.build(map, self);
        }

        public GetSmsTemplateListResponseBodyDataListTemplateTag setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public GetSmsTemplateListResponseBodyDataListTemplateTag setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class GetSmsTemplateListResponseBodyDataList extends TeaModel {
        /**
         * <p>模板审核状态</p>
         * 
         * <strong>example:</strong>
         * <p>88</p>
         */
        @NameInMap("AuditStatus")
        public Long auditStatus;

        /**
         * <p>创建时间</p>
         * 
         * <strong>example:</strong>
         * <p>示例值</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>签名</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        @NameInMap("SignName")
        public String signName;

        /**
         * <p>模板code</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值示例值</p>
         */
        @NameInMap("TemplateCode")
        public String templateCode;

        /**
         * <p>模板名称</p>
         * 
         * <strong>example:</strong>
         * <p>示例值</p>
         */
        @NameInMap("TemplateName")
        public String templateName;

        /**
         * <p>模板标签</p>
         */
        @NameInMap("TemplateTag")
        public java.util.List<GetSmsTemplateListResponseBodyDataListTemplateTag> templateTag;

        /**
         * <p>模板类型</p>
         * 
         * <strong>example:</strong>
         * <p>43</p>
         */
        @NameInMap("TemplateType")
        public Long templateType;

        /**
         * <p>模板可用状态</p>
         */
        @NameInMap("UsableStateList")
        public java.util.List<String> usableStateList;

        /**
         * <p>工单号</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        @NameInMap("WorkOrderId")
        public String workOrderId;

        public static GetSmsTemplateListResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            GetSmsTemplateListResponseBodyDataList self = new GetSmsTemplateListResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public GetSmsTemplateListResponseBodyDataList setAuditStatus(Long auditStatus) {
            this.auditStatus = auditStatus;
            return this;
        }
        public Long getAuditStatus() {
            return this.auditStatus;
        }

        public GetSmsTemplateListResponseBodyDataList setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetSmsTemplateListResponseBodyDataList setSignName(String signName) {
            this.signName = signName;
            return this;
        }
        public String getSignName() {
            return this.signName;
        }

        public GetSmsTemplateListResponseBodyDataList setTemplateCode(String templateCode) {
            this.templateCode = templateCode;
            return this;
        }
        public String getTemplateCode() {
            return this.templateCode;
        }

        public GetSmsTemplateListResponseBodyDataList setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

        public GetSmsTemplateListResponseBodyDataList setTemplateTag(java.util.List<GetSmsTemplateListResponseBodyDataListTemplateTag> templateTag) {
            this.templateTag = templateTag;
            return this;
        }
        public java.util.List<GetSmsTemplateListResponseBodyDataListTemplateTag> getTemplateTag() {
            return this.templateTag;
        }

        public GetSmsTemplateListResponseBodyDataList setTemplateType(Long templateType) {
            this.templateType = templateType;
            return this;
        }
        public Long getTemplateType() {
            return this.templateType;
        }

        public GetSmsTemplateListResponseBodyDataList setUsableStateList(java.util.List<String> usableStateList) {
            this.usableStateList = usableStateList;
            return this;
        }
        public java.util.List<String> getUsableStateList() {
            return this.usableStateList;
        }

        public GetSmsTemplateListResponseBodyDataList setWorkOrderId(String workOrderId) {
            this.workOrderId = workOrderId;
            return this;
        }
        public String getWorkOrderId() {
            return this.workOrderId;
        }

    }

    public static class GetSmsTemplateListResponseBodyData extends TeaModel {
        @NameInMap("List")
        public java.util.List<GetSmsTemplateListResponseBodyDataList> list;

        /**
         * <strong>example:</strong>
         * <p>97</p>
         */
        @NameInMap("PageNo")
        public Long pageNo;

        /**
         * <strong>example:</strong>
         * <p>78</p>
         */
        @NameInMap("PageSize")
        public Long pageSize;

        /**
         * <strong>example:</strong>
         * <p>64</p>
         */
        @NameInMap("Total")
        public Long total;

        public static GetSmsTemplateListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetSmsTemplateListResponseBodyData self = new GetSmsTemplateListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetSmsTemplateListResponseBodyData setList(java.util.List<GetSmsTemplateListResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<GetSmsTemplateListResponseBodyDataList> getList() {
            return this.list;
        }

        public GetSmsTemplateListResponseBodyData setPageNo(Long pageNo) {
            this.pageNo = pageNo;
            return this;
        }
        public Long getPageNo() {
            return this.pageNo;
        }

        public GetSmsTemplateListResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public GetSmsTemplateListResponseBodyData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
