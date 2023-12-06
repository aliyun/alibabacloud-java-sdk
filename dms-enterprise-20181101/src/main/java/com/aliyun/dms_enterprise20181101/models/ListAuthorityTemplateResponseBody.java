// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListAuthorityTemplateResponseBody extends TeaModel {
    @NameInMap("AuthorityTemplateViewList")
    public ListAuthorityTemplateResponseBodyAuthorityTemplateViewList authorityTemplateViewList;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Tid")
    public Long tid;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListAuthorityTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAuthorityTemplateResponseBody self = new ListAuthorityTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAuthorityTemplateResponseBody setAuthorityTemplateViewList(ListAuthorityTemplateResponseBodyAuthorityTemplateViewList authorityTemplateViewList) {
        this.authorityTemplateViewList = authorityTemplateViewList;
        return this;
    }
    public ListAuthorityTemplateResponseBodyAuthorityTemplateViewList getAuthorityTemplateViewList() {
        return this.authorityTemplateViewList;
    }

    public ListAuthorityTemplateResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListAuthorityTemplateResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListAuthorityTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAuthorityTemplateResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListAuthorityTemplateResponseBody setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

    public ListAuthorityTemplateResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListAuthorityTemplateResponseBodyAuthorityTemplateViewListAuthorityTemplateView extends TeaModel {
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("CreatorId")
        public Long creatorId;

        @NameInMap("Description")
        public String description;

        @NameInMap("Name")
        public String name;

        @NameInMap("TemplateId")
        public Long templateId;

        public static ListAuthorityTemplateResponseBodyAuthorityTemplateViewListAuthorityTemplateView build(java.util.Map<String, ?> map) throws Exception {
            ListAuthorityTemplateResponseBodyAuthorityTemplateViewListAuthorityTemplateView self = new ListAuthorityTemplateResponseBodyAuthorityTemplateViewListAuthorityTemplateView();
            return TeaModel.build(map, self);
        }

        public ListAuthorityTemplateResponseBodyAuthorityTemplateViewListAuthorityTemplateView setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListAuthorityTemplateResponseBodyAuthorityTemplateViewListAuthorityTemplateView setCreatorId(Long creatorId) {
            this.creatorId = creatorId;
            return this;
        }
        public Long getCreatorId() {
            return this.creatorId;
        }

        public ListAuthorityTemplateResponseBodyAuthorityTemplateViewListAuthorityTemplateView setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListAuthorityTemplateResponseBodyAuthorityTemplateViewListAuthorityTemplateView setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListAuthorityTemplateResponseBodyAuthorityTemplateViewListAuthorityTemplateView setTemplateId(Long templateId) {
            this.templateId = templateId;
            return this;
        }
        public Long getTemplateId() {
            return this.templateId;
        }

    }

    public static class ListAuthorityTemplateResponseBodyAuthorityTemplateViewList extends TeaModel {
        @NameInMap("AuthorityTemplateView")
        public java.util.List<ListAuthorityTemplateResponseBodyAuthorityTemplateViewListAuthorityTemplateView> authorityTemplateView;

        public static ListAuthorityTemplateResponseBodyAuthorityTemplateViewList build(java.util.Map<String, ?> map) throws Exception {
            ListAuthorityTemplateResponseBodyAuthorityTemplateViewList self = new ListAuthorityTemplateResponseBodyAuthorityTemplateViewList();
            return TeaModel.build(map, self);
        }

        public ListAuthorityTemplateResponseBodyAuthorityTemplateViewList setAuthorityTemplateView(java.util.List<ListAuthorityTemplateResponseBodyAuthorityTemplateViewListAuthorityTemplateView> authorityTemplateView) {
            this.authorityTemplateView = authorityTemplateView;
            return this;
        }
        public java.util.List<ListAuthorityTemplateResponseBodyAuthorityTemplateViewListAuthorityTemplateView> getAuthorityTemplateView() {
            return this.authorityTemplateView;
        }

    }

}
