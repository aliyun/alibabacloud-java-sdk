// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20200710.models;

import com.aliyun.tea.*;

public class ListTemplatePageResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("Data")
    public java.util.List<ListTemplatePageResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Msg")
    public String msg;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>11E66B29-9E5E-5C10-B64E-B5A0E0F26355</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("TotalSize")
    public Integer totalSize;

    public static ListTemplatePageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTemplatePageResponseBody self = new ListTemplatePageResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTemplatePageResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListTemplatePageResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListTemplatePageResponseBody setData(java.util.List<ListTemplatePageResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListTemplatePageResponseBodyData> getData() {
        return this.data;
    }

    public ListTemplatePageResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public ListTemplatePageResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListTemplatePageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTemplatePageResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListTemplatePageResponseBody setTotalSize(Integer totalSize) {
        this.totalSize = totalSize;
        return this;
    }
    public Integer getTotalSize() {
        return this.totalSize;
    }

    public static class ListTemplatePageResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Action")
        public String action;

        @NameInMap("Content")
        public String content;

        @NameInMap("DescInfo")
        public String descInfo;

        /**
         * <strong>example:</strong>
         * <p>1740479834</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <strong>example:</strong>
         * <p>1722564835000</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <strong>example:</strong>
         * <p>/</p>
         */
        @NameInMap("IconUrls")
        public String iconUrls;

        /**
         * <strong>example:</strong>
         * <p>10029984</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>/</p>
         */
        @NameInMap("ImageUrls")
        public String imageUrls;

        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("PushStyle")
        public String pushStyle;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ShowStyle")
        public String showStyle;

        @NameInMap("Title")
        public String title;

        /**
         * <strong>example:</strong>
         * <p>/</p>
         */
        @NameInMap("Uri")
        public String uri;

        /**
         * <strong>example:</strong>
         * <p>title,content</p>
         */
        @NameInMap("Variables")
        public String variables;

        public static ListTemplatePageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListTemplatePageResponseBodyData self = new ListTemplatePageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListTemplatePageResponseBodyData setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public ListTemplatePageResponseBodyData setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public ListTemplatePageResponseBodyData setDescInfo(String descInfo) {
            this.descInfo = descInfo;
            return this;
        }
        public String getDescInfo() {
            return this.descInfo;
        }

        public ListTemplatePageResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListTemplatePageResponseBodyData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListTemplatePageResponseBodyData setIconUrls(String iconUrls) {
            this.iconUrls = iconUrls;
            return this;
        }
        public String getIconUrls() {
            return this.iconUrls;
        }

        public ListTemplatePageResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListTemplatePageResponseBodyData setImageUrls(String imageUrls) {
            this.imageUrls = imageUrls;
            return this;
        }
        public String getImageUrls() {
            return this.imageUrls;
        }

        public ListTemplatePageResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListTemplatePageResponseBodyData setPushStyle(String pushStyle) {
            this.pushStyle = pushStyle;
            return this;
        }
        public String getPushStyle() {
            return this.pushStyle;
        }

        public ListTemplatePageResponseBodyData setShowStyle(String showStyle) {
            this.showStyle = showStyle;
            return this;
        }
        public String getShowStyle() {
            return this.showStyle;
        }

        public ListTemplatePageResponseBodyData setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public ListTemplatePageResponseBodyData setUri(String uri) {
            this.uri = uri;
            return this;
        }
        public String getUri() {
            return this.uri;
        }

        public ListTemplatePageResponseBodyData setVariables(String variables) {
            this.variables = variables;
            return this;
        }
        public String getVariables() {
            return this.variables;
        }

    }

}
