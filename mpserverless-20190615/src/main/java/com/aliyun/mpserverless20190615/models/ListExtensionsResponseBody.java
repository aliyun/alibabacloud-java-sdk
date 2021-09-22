// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class ListExtensionsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("Extensions")
    public java.util.List<ListExtensionsResponseBodyExtensions> extensions;

    public static ListExtensionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListExtensionsResponseBody self = new ListExtensionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListExtensionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListExtensionsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListExtensionsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListExtensionsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListExtensionsResponseBody setExtensions(java.util.List<ListExtensionsResponseBodyExtensions> extensions) {
        this.extensions = extensions;
        return this;
    }
    public java.util.List<ListExtensionsResponseBodyExtensions> getExtensions() {
        return this.extensions;
    }

    public static class ListExtensionsResponseBodyExtensions extends TeaModel {
        @NameInMap("ExtensionDocumentationLink")
        public String extensionDocumentationLink;

        @NameInMap("ExtensionId")
        public String extensionId;

        @NameInMap("ExtensionDesc")
        public String extensionDesc;

        @NameInMap("ExtensionName")
        public String extensionName;

        @NameInMap("Enabled")
        public String enabled;

        public static ListExtensionsResponseBodyExtensions build(java.util.Map<String, ?> map) throws Exception {
            ListExtensionsResponseBodyExtensions self = new ListExtensionsResponseBodyExtensions();
            return TeaModel.build(map, self);
        }

        public ListExtensionsResponseBodyExtensions setExtensionDocumentationLink(String extensionDocumentationLink) {
            this.extensionDocumentationLink = extensionDocumentationLink;
            return this;
        }
        public String getExtensionDocumentationLink() {
            return this.extensionDocumentationLink;
        }

        public ListExtensionsResponseBodyExtensions setExtensionId(String extensionId) {
            this.extensionId = extensionId;
            return this;
        }
        public String getExtensionId() {
            return this.extensionId;
        }

        public ListExtensionsResponseBodyExtensions setExtensionDesc(String extensionDesc) {
            this.extensionDesc = extensionDesc;
            return this;
        }
        public String getExtensionDesc() {
            return this.extensionDesc;
        }

        public ListExtensionsResponseBodyExtensions setExtensionName(String extensionName) {
            this.extensionName = extensionName;
            return this;
        }
        public String getExtensionName() {
            return this.extensionName;
        }

        public ListExtensionsResponseBodyExtensions setEnabled(String enabled) {
            this.enabled = enabled;
            return this;
        }
        public String getEnabled() {
            return this.enabled;
        }

    }

}
