// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListRecognitionLibsResponseBody extends TeaModel {
    @NameInMap("Libs")
    public ListRecognitionLibsResponseBodyLibs libs;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p><strong><strong><strong>11-DB8D-4A9A-875B-275798</strong></strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>180</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListRecognitionLibsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRecognitionLibsResponseBody self = new ListRecognitionLibsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRecognitionLibsResponseBody setLibs(ListRecognitionLibsResponseBodyLibs libs) {
        this.libs = libs;
        return this;
    }
    public ListRecognitionLibsResponseBodyLibs getLibs() {
        return this.libs;
    }

    public ListRecognitionLibsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListRecognitionLibsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListRecognitionLibsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListRecognitionLibsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListRecognitionLibsResponseBodyLibsLib extends TeaModel {
        @NameInMap("LibDescription")
        public String libDescription;

        /**
         * <strong>example:</strong>
         * <p><em><strong><strong><strong><strong><strong><strong>24b47865c6</strong></strong></strong></strong></strong></strong></em>*</p>
         */
        @NameInMap("LibId")
        public String libId;

        @NameInMap("LibName")
        public String libName;

        public static ListRecognitionLibsResponseBodyLibsLib build(java.util.Map<String, ?> map) throws Exception {
            ListRecognitionLibsResponseBodyLibsLib self = new ListRecognitionLibsResponseBodyLibsLib();
            return TeaModel.build(map, self);
        }

        public ListRecognitionLibsResponseBodyLibsLib setLibDescription(String libDescription) {
            this.libDescription = libDescription;
            return this;
        }
        public String getLibDescription() {
            return this.libDescription;
        }

        public ListRecognitionLibsResponseBodyLibsLib setLibId(String libId) {
            this.libId = libId;
            return this;
        }
        public String getLibId() {
            return this.libId;
        }

        public ListRecognitionLibsResponseBodyLibsLib setLibName(String libName) {
            this.libName = libName;
            return this;
        }
        public String getLibName() {
            return this.libName;
        }

    }

    public static class ListRecognitionLibsResponseBodyLibs extends TeaModel {
        @NameInMap("Lib")
        public java.util.List<ListRecognitionLibsResponseBodyLibsLib> lib;

        public static ListRecognitionLibsResponseBodyLibs build(java.util.Map<String, ?> map) throws Exception {
            ListRecognitionLibsResponseBodyLibs self = new ListRecognitionLibsResponseBodyLibs();
            return TeaModel.build(map, self);
        }

        public ListRecognitionLibsResponseBodyLibs setLib(java.util.List<ListRecognitionLibsResponseBodyLibsLib> lib) {
            this.lib = lib;
            return this;
        }
        public java.util.List<ListRecognitionLibsResponseBodyLibsLib> getLib() {
            return this.lib;
        }

    }

}
