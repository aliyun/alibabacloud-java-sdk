// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetTemplateListByUserIdResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>12312131231</p>
     */
    @NameInMap("nextCursor")
    public Long nextCursor;

    /**
     * <p>requestId</p>
     * 
     * <strong>example:</strong>
     * <p>0FAAEC9C-C6C8-5C87-AF8E-1195889BBXXX</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("templateList")
    public java.util.List<GetTemplateListByUserIdResponseBodyTemplateList> templateList;

    public static GetTemplateListByUserIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTemplateListByUserIdResponseBody self = new GetTemplateListByUserIdResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTemplateListByUserIdResponseBody setNextCursor(Long nextCursor) {
        this.nextCursor = nextCursor;
        return this;
    }
    public Long getNextCursor() {
        return this.nextCursor;
    }

    public GetTemplateListByUserIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTemplateListByUserIdResponseBody setTemplateList(java.util.List<GetTemplateListByUserIdResponseBodyTemplateList> templateList) {
        this.templateList = templateList;
        return this;
    }
    public java.util.List<GetTemplateListByUserIdResponseBodyTemplateList> getTemplateList() {
        return this.templateList;
    }

    public static class GetTemplateListByUserIdResponseBodyTemplateList extends TeaModel {
        @NameInMap("IconUrl")
        public String iconUrl;

        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>11111</p>
         */
        @NameInMap("ReportCode")
        public String reportCode;

        /**
         * <strong>example:</strong>
         * <p><a href="https://scsss/sss">https://scsss/sss</a></p>
         */
        @NameInMap("Url")
        public String url;

        public static GetTemplateListByUserIdResponseBodyTemplateList build(java.util.Map<String, ?> map) throws Exception {
            GetTemplateListByUserIdResponseBodyTemplateList self = new GetTemplateListByUserIdResponseBodyTemplateList();
            return TeaModel.build(map, self);
        }

        public GetTemplateListByUserIdResponseBodyTemplateList setIconUrl(String iconUrl) {
            this.iconUrl = iconUrl;
            return this;
        }
        public String getIconUrl() {
            return this.iconUrl;
        }

        public GetTemplateListByUserIdResponseBodyTemplateList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetTemplateListByUserIdResponseBodyTemplateList setReportCode(String reportCode) {
            this.reportCode = reportCode;
            return this;
        }
        public String getReportCode() {
            return this.reportCode;
        }

        public GetTemplateListByUserIdResponseBodyTemplateList setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
