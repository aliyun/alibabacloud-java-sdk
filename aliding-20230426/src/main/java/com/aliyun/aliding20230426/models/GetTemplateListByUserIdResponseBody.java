// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetTemplateListByUserIdResponseBody extends TeaModel {
    @NameInMap("nextCursor")
    public Long nextCursor;

    /**
     * <p>requestId</p>
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

        @NameInMap("ReportCode")
        public String reportCode;

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
