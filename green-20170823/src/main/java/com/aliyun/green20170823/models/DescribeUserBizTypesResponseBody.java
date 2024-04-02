// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class DescribeUserBizTypesResponseBody extends TeaModel {
    @NameInMap("BizTypeList")
    public java.util.List<DescribeUserBizTypesResponseBodyBizTypeList> bizTypeList;

    @NameInMap("BizTypeListImport")
    public java.util.List<DescribeUserBizTypesResponseBodyBizTypeListImport> bizTypeListImport;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeUserBizTypesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserBizTypesResponseBody self = new DescribeUserBizTypesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeUserBizTypesResponseBody setBizTypeList(java.util.List<DescribeUserBizTypesResponseBodyBizTypeList> bizTypeList) {
        this.bizTypeList = bizTypeList;
        return this;
    }
    public java.util.List<DescribeUserBizTypesResponseBodyBizTypeList> getBizTypeList() {
        return this.bizTypeList;
    }

    public DescribeUserBizTypesResponseBody setBizTypeListImport(java.util.List<DescribeUserBizTypesResponseBodyBizTypeListImport> bizTypeListImport) {
        this.bizTypeListImport = bizTypeListImport;
        return this;
    }
    public java.util.List<DescribeUserBizTypesResponseBodyBizTypeListImport> getBizTypeListImport() {
        return this.bizTypeListImport;
    }

    public DescribeUserBizTypesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeUserBizTypesResponseBodyBizTypeList extends TeaModel {
        @NameInMap("BizType")
        public String bizType;

        @NameInMap("CiteTemplate")
        public Boolean citeTemplate;

        @NameInMap("Description")
        public String description;

        @NameInMap("Gray")
        public Boolean gray;

        @NameInMap("IndustryInfo")
        public String industryInfo;

        @NameInMap("Source")
        public String source;

        @NameInMap("SourceBizType")
        public String sourceBizType;

        public static DescribeUserBizTypesResponseBodyBizTypeList build(java.util.Map<String, ?> map) throws Exception {
            DescribeUserBizTypesResponseBodyBizTypeList self = new DescribeUserBizTypesResponseBodyBizTypeList();
            return TeaModel.build(map, self);
        }

        public DescribeUserBizTypesResponseBodyBizTypeList setBizType(String bizType) {
            this.bizType = bizType;
            return this;
        }
        public String getBizType() {
            return this.bizType;
        }

        public DescribeUserBizTypesResponseBodyBizTypeList setCiteTemplate(Boolean citeTemplate) {
            this.citeTemplate = citeTemplate;
            return this;
        }
        public Boolean getCiteTemplate() {
            return this.citeTemplate;
        }

        public DescribeUserBizTypesResponseBodyBizTypeList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeUserBizTypesResponseBodyBizTypeList setGray(Boolean gray) {
            this.gray = gray;
            return this;
        }
        public Boolean getGray() {
            return this.gray;
        }

        public DescribeUserBizTypesResponseBodyBizTypeList setIndustryInfo(String industryInfo) {
            this.industryInfo = industryInfo;
            return this;
        }
        public String getIndustryInfo() {
            return this.industryInfo;
        }

        public DescribeUserBizTypesResponseBodyBizTypeList setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public DescribeUserBizTypesResponseBodyBizTypeList setSourceBizType(String sourceBizType) {
            this.sourceBizType = sourceBizType;
            return this;
        }
        public String getSourceBizType() {
            return this.sourceBizType;
        }

    }

    public static class DescribeUserBizTypesResponseBodyBizTypeListImport extends TeaModel {
        @NameInMap("BizType")
        public String bizType;

        @NameInMap("CiteTemplate")
        public Boolean citeTemplate;

        @NameInMap("Description")
        public String description;

        @NameInMap("Gray")
        public Boolean gray;

        @NameInMap("IndustryInfo")
        public String industryInfo;

        @NameInMap("Source")
        public String source;

        @NameInMap("SourceBizType")
        public String sourceBizType;

        public static DescribeUserBizTypesResponseBodyBizTypeListImport build(java.util.Map<String, ?> map) throws Exception {
            DescribeUserBizTypesResponseBodyBizTypeListImport self = new DescribeUserBizTypesResponseBodyBizTypeListImport();
            return TeaModel.build(map, self);
        }

        public DescribeUserBizTypesResponseBodyBizTypeListImport setBizType(String bizType) {
            this.bizType = bizType;
            return this;
        }
        public String getBizType() {
            return this.bizType;
        }

        public DescribeUserBizTypesResponseBodyBizTypeListImport setCiteTemplate(Boolean citeTemplate) {
            this.citeTemplate = citeTemplate;
            return this;
        }
        public Boolean getCiteTemplate() {
            return this.citeTemplate;
        }

        public DescribeUserBizTypesResponseBodyBizTypeListImport setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeUserBizTypesResponseBodyBizTypeListImport setGray(Boolean gray) {
            this.gray = gray;
            return this;
        }
        public Boolean getGray() {
            return this.gray;
        }

        public DescribeUserBizTypesResponseBodyBizTypeListImport setIndustryInfo(String industryInfo) {
            this.industryInfo = industryInfo;
            return this;
        }
        public String getIndustryInfo() {
            return this.industryInfo;
        }

        public DescribeUserBizTypesResponseBodyBizTypeListImport setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public DescribeUserBizTypesResponseBodyBizTypeListImport setSourceBizType(String sourceBizType) {
            this.sourceBizType = sourceBizType;
            return this;
        }
        public String getSourceBizType() {
            return this.sourceBizType;
        }

    }

}
