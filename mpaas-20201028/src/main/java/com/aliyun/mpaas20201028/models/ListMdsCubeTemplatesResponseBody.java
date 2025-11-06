// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class ListMdsCubeTemplatesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>11E66B29-9E5E-5C10-B64E-B5A0E0F26355</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultContent")
    public ListMdsCubeTemplatesResponseBodyResultContent resultContent;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("ResultMessage")
    public String resultMessage;

    public static ListMdsCubeTemplatesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMdsCubeTemplatesResponseBody self = new ListMdsCubeTemplatesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMdsCubeTemplatesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListMdsCubeTemplatesResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListMdsCubeTemplatesResponseBody setResultContent(ListMdsCubeTemplatesResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public ListMdsCubeTemplatesResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public ListMdsCubeTemplatesResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public static class ListMdsCubeTemplatesResponseBodyResultContentDataContentList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>570DA89281533-default</p>
         */
        @NameInMap("AppCode")
        public String appCode;

        /**
         * <strong>example:</strong>
         * <p>2025-10-24 11:24:34</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <strong>example:</strong>
         * <p>2025-10-24 11:24:34</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <strong>example:</strong>
         * <p>template desc</p>
         */
        @NameInMap("TemplateDesc")
        public String templateDesc;

        /**
         * <strong>example:</strong>
         * <p>template_test</p>
         */
        @NameInMap("TemplateId")
        public String templateId;

        /**
         * <strong>example:</strong>
         * <p>template_test</p>
         */
        @NameInMap("TemplateName")
        public String templateName;

        public static ListMdsCubeTemplatesResponseBodyResultContentDataContentList build(java.util.Map<String, ?> map) throws Exception {
            ListMdsCubeTemplatesResponseBodyResultContentDataContentList self = new ListMdsCubeTemplatesResponseBodyResultContentDataContentList();
            return TeaModel.build(map, self);
        }

        public ListMdsCubeTemplatesResponseBodyResultContentDataContentList setAppCode(String appCode) {
            this.appCode = appCode;
            return this;
        }
        public String getAppCode() {
            return this.appCode;
        }

        public ListMdsCubeTemplatesResponseBodyResultContentDataContentList setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListMdsCubeTemplatesResponseBodyResultContentDataContentList setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListMdsCubeTemplatesResponseBodyResultContentDataContentList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListMdsCubeTemplatesResponseBodyResultContentDataContentList setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListMdsCubeTemplatesResponseBodyResultContentDataContentList setTemplateDesc(String templateDesc) {
            this.templateDesc = templateDesc;
            return this;
        }
        public String getTemplateDesc() {
            return this.templateDesc;
        }

        public ListMdsCubeTemplatesResponseBodyResultContentDataContentList setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public ListMdsCubeTemplatesResponseBodyResultContentDataContentList setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

    }

    public static class ListMdsCubeTemplatesResponseBodyResultContentDataContent extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("FirstPage")
        public Boolean firstPage;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("FirstResult")
        public Long firstResult;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("LastPage")
        public Boolean lastPage;

        @NameInMap("List")
        public java.util.List<ListMdsCubeTemplatesResponseBodyResultContentDataContentList> list;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("NextPage")
        public Long nextPage;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNo")
        public Integer pageNo;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PrePage")
        public Long prePage;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TotalPage")
        public Long totalPage;

        public static ListMdsCubeTemplatesResponseBodyResultContentDataContent build(java.util.Map<String, ?> map) throws Exception {
            ListMdsCubeTemplatesResponseBodyResultContentDataContent self = new ListMdsCubeTemplatesResponseBodyResultContentDataContent();
            return TeaModel.build(map, self);
        }

        public ListMdsCubeTemplatesResponseBodyResultContentDataContent setFirstPage(Boolean firstPage) {
            this.firstPage = firstPage;
            return this;
        }
        public Boolean getFirstPage() {
            return this.firstPage;
        }

        public ListMdsCubeTemplatesResponseBodyResultContentDataContent setFirstResult(Long firstResult) {
            this.firstResult = firstResult;
            return this;
        }
        public Long getFirstResult() {
            return this.firstResult;
        }

        public ListMdsCubeTemplatesResponseBodyResultContentDataContent setLastPage(Boolean lastPage) {
            this.lastPage = lastPage;
            return this;
        }
        public Boolean getLastPage() {
            return this.lastPage;
        }

        public ListMdsCubeTemplatesResponseBodyResultContentDataContent setList(java.util.List<ListMdsCubeTemplatesResponseBodyResultContentDataContentList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<ListMdsCubeTemplatesResponseBodyResultContentDataContentList> getList() {
            return this.list;
        }

        public ListMdsCubeTemplatesResponseBodyResultContentDataContent setNextPage(Long nextPage) {
            this.nextPage = nextPage;
            return this;
        }
        public Long getNextPage() {
            return this.nextPage;
        }

        public ListMdsCubeTemplatesResponseBodyResultContentDataContent setPageNo(Integer pageNo) {
            this.pageNo = pageNo;
            return this;
        }
        public Integer getPageNo() {
            return this.pageNo;
        }

        public ListMdsCubeTemplatesResponseBodyResultContentDataContent setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListMdsCubeTemplatesResponseBodyResultContentDataContent setPrePage(Long prePage) {
            this.prePage = prePage;
            return this;
        }
        public Long getPrePage() {
            return this.prePage;
        }

        public ListMdsCubeTemplatesResponseBodyResultContentDataContent setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public ListMdsCubeTemplatesResponseBodyResultContentDataContent setTotalPage(Long totalPage) {
            this.totalPage = totalPage;
            return this;
        }
        public Long getTotalPage() {
            return this.totalPage;
        }

    }

    public static class ListMdsCubeTemplatesResponseBodyResultContentData extends TeaModel {
        @NameInMap("Content")
        public ListMdsCubeTemplatesResponseBodyResultContentDataContent content;

        /**
         * <strong>example:</strong>
         * <p>NONE</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <strong>example:</strong>
         * <p>11E66B29-9E5E-5C10-B64E-B5A0E0F26355</p>
         */
        @NameInMap("RequestId")
        public String requestId;

        /**
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("ResultMsg")
        public String resultMsg;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Success")
        public Boolean success;

        public static ListMdsCubeTemplatesResponseBodyResultContentData build(java.util.Map<String, ?> map) throws Exception {
            ListMdsCubeTemplatesResponseBodyResultContentData self = new ListMdsCubeTemplatesResponseBodyResultContentData();
            return TeaModel.build(map, self);
        }

        public ListMdsCubeTemplatesResponseBodyResultContentData setContent(ListMdsCubeTemplatesResponseBodyResultContentDataContent content) {
            this.content = content;
            return this;
        }
        public ListMdsCubeTemplatesResponseBodyResultContentDataContent getContent() {
            return this.content;
        }

        public ListMdsCubeTemplatesResponseBodyResultContentData setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public ListMdsCubeTemplatesResponseBodyResultContentData setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public ListMdsCubeTemplatesResponseBodyResultContentData setResultMsg(String resultMsg) {
            this.resultMsg = resultMsg;
            return this;
        }
        public String getResultMsg() {
            return this.resultMsg;
        }

        public ListMdsCubeTemplatesResponseBodyResultContentData setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

    public static class ListMdsCubeTemplatesResponseBodyResultContent extends TeaModel {
        @NameInMap("Data")
        public ListMdsCubeTemplatesResponseBodyResultContentData data;

        /**
         * <strong>example:</strong>
         * <p>11E66B29-9E5E-5C10-B64E-B5A0E0F26355</p>
         */
        @NameInMap("RequestId")
        public String requestId;

        public static ListMdsCubeTemplatesResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            ListMdsCubeTemplatesResponseBodyResultContent self = new ListMdsCubeTemplatesResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public ListMdsCubeTemplatesResponseBodyResultContent setData(ListMdsCubeTemplatesResponseBodyResultContentData data) {
            this.data = data;
            return this;
        }
        public ListMdsCubeTemplatesResponseBodyResultContentData getData() {
            return this.data;
        }

        public ListMdsCubeTemplatesResponseBodyResultContent setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

    }

}
