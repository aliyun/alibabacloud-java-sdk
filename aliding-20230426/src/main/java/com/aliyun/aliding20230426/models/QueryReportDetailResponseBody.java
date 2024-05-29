// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class QueryReportDetailResponseBody extends TeaModel {
    @NameInMap("content")
    public java.util.List<QueryReportDetailResponseBodyContent> content;

    @NameInMap("createTime")
    public Long createTime;

    @NameInMap("creatorId")
    public String creatorId;

    @NameInMap("creatorName")
    public String creatorName;

    @NameInMap("deptName")
    public String deptName;

    @NameInMap("modifiedTime")
    public Long modifiedTime;

    @NameInMap("remark")
    public String remark;

    @NameInMap("reportId")
    public String reportId;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("templateName")
    public String templateName;

    @NameInMap("vendorRequestId")
    public String vendorRequestId;

    @NameInMap("vendorType")
    public String vendorType;

    public static QueryReportDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryReportDetailResponseBody self = new QueryReportDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryReportDetailResponseBody setContent(java.util.List<QueryReportDetailResponseBodyContent> content) {
        this.content = content;
        return this;
    }
    public java.util.List<QueryReportDetailResponseBodyContent> getContent() {
        return this.content;
    }

    public QueryReportDetailResponseBody setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
    }

    public QueryReportDetailResponseBody setCreatorId(String creatorId) {
        this.creatorId = creatorId;
        return this;
    }
    public String getCreatorId() {
        return this.creatorId;
    }

    public QueryReportDetailResponseBody setCreatorName(String creatorName) {
        this.creatorName = creatorName;
        return this;
    }
    public String getCreatorName() {
        return this.creatorName;
    }

    public QueryReportDetailResponseBody setDeptName(String deptName) {
        this.deptName = deptName;
        return this;
    }
    public String getDeptName() {
        return this.deptName;
    }

    public QueryReportDetailResponseBody setModifiedTime(Long modifiedTime) {
        this.modifiedTime = modifiedTime;
        return this;
    }
    public Long getModifiedTime() {
        return this.modifiedTime;
    }

    public QueryReportDetailResponseBody setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public QueryReportDetailResponseBody setReportId(String reportId) {
        this.reportId = reportId;
        return this;
    }
    public String getReportId() {
        return this.reportId;
    }

    public QueryReportDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryReportDetailResponseBody setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public QueryReportDetailResponseBody setVendorRequestId(String vendorRequestId) {
        this.vendorRequestId = vendorRequestId;
        return this;
    }
    public String getVendorRequestId() {
        return this.vendorRequestId;
    }

    public QueryReportDetailResponseBody setVendorType(String vendorType) {
        this.vendorType = vendorType;
        return this;
    }
    public String getVendorType() {
        return this.vendorType;
    }

    public static class QueryReportDetailResponseBodyContent extends TeaModel {
        @NameInMap("Images")
        public java.util.List<String> images;

        @NameInMap("Key")
        public String key;

        @NameInMap("Sort")
        public String sort;

        @NameInMap("Type")
        public String type;

        @NameInMap("Value")
        public String value;

        public static QueryReportDetailResponseBodyContent build(java.util.Map<String, ?> map) throws Exception {
            QueryReportDetailResponseBodyContent self = new QueryReportDetailResponseBodyContent();
            return TeaModel.build(map, self);
        }

        public QueryReportDetailResponseBodyContent setImages(java.util.List<String> images) {
            this.images = images;
            return this;
        }
        public java.util.List<String> getImages() {
            return this.images;
        }

        public QueryReportDetailResponseBodyContent setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public QueryReportDetailResponseBodyContent setSort(String sort) {
            this.sort = sort;
            return this;
        }
        public String getSort() {
            return this.sort;
        }

        public QueryReportDetailResponseBodyContent setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public QueryReportDetailResponseBodyContent setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
