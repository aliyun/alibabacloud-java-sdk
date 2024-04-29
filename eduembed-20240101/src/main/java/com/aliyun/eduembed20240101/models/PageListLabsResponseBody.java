// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eduembed20240101.models;

import com.aliyun.tea.*;

public class PageListLabsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Labs")
    public java.util.List<PageListLabsResponseBodyLabs> labs;

    @NameInMap("Message")
    public String message;

    @NameInMap("Page")
    public Long page;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static PageListLabsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PageListLabsResponseBody self = new PageListLabsResponseBody();
        return TeaModel.build(map, self);
    }

    public PageListLabsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public PageListLabsResponseBody setLabs(java.util.List<PageListLabsResponseBodyLabs> labs) {
        this.labs = labs;
        return this;
    }
    public java.util.List<PageListLabsResponseBodyLabs> getLabs() {
        return this.labs;
    }

    public PageListLabsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public PageListLabsResponseBody setPage(Long page) {
        this.page = page;
        return this;
    }
    public Long getPage() {
        return this.page;
    }

    public PageListLabsResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public PageListLabsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PageListLabsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public PageListLabsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class PageListLabsResponseBodyLabs extends TeaModel {
        @NameInMap("Duration")
        public Long duration;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Introduction")
        public String introduction;

        @NameInMap("SubTitle")
        public String subTitle;

        @NameInMap("Title")
        public String title;

        public static PageListLabsResponseBodyLabs build(java.util.Map<String, ?> map) throws Exception {
            PageListLabsResponseBodyLabs self = new PageListLabsResponseBodyLabs();
            return TeaModel.build(map, self);
        }

        public PageListLabsResponseBodyLabs setDuration(Long duration) {
            this.duration = duration;
            return this;
        }
        public Long getDuration() {
            return this.duration;
        }

        public PageListLabsResponseBodyLabs setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public PageListLabsResponseBodyLabs setIntroduction(String introduction) {
            this.introduction = introduction;
            return this;
        }
        public String getIntroduction() {
            return this.introduction;
        }

        public PageListLabsResponseBodyLabs setSubTitle(String subTitle) {
            this.subTitle = subTitle;
            return this;
        }
        public String getSubTitle() {
            return this.subTitle;
        }

        public PageListLabsResponseBodyLabs setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

}
