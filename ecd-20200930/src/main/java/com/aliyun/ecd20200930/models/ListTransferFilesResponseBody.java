// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ListTransferFilesResponseBody extends TeaModel {
    @NameInMap("Files")
    public java.util.List<ListTransferFilesResponseBodyFiles> files;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>caeba0bbb2be03f84eb48b699f0a****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListTransferFilesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTransferFilesResponseBody self = new ListTransferFilesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTransferFilesResponseBody setFiles(java.util.List<ListTransferFilesResponseBodyFiles> files) {
        this.files = files;
        return this;
    }
    public java.util.List<ListTransferFilesResponseBodyFiles> getFiles() {
        return this.files;
    }

    public ListTransferFilesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListTransferFilesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListTransferFilesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListTransferFilesResponseBodyFiles extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p><a href="https://app-center-icon-pre-hangzhou.oss-cn-hangzhou.aliyuncs.com/tenant">https://app-center-icon-pre-hangzhou.oss-cn-hangzhou.aliyuncs.com/tenant</a>****</p>
         */
        @NameInMap("IconUrl")
        public String iconUrl;

        /**
         * <strong>example:</strong>
         * <p>trf-a213msf****</p>
         */
        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        @NameInMap("OssFileName")
        public String ossFileName;

        /**
         * <strong>example:</strong>
         * <p>transfer/1244234/****</p>
         */
        @NameInMap("OssFilePath")
        public String ossFilePath;

        /**
         * <strong>example:</strong>
         * <p>10853079</p>
         */
        @NameInMap("Size")
        public String size;

        /**
         * <strong>example:</strong>
         * <p>DELETED</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>txt</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListTransferFilesResponseBodyFiles build(java.util.Map<String, ?> map) throws Exception {
            ListTransferFilesResponseBodyFiles self = new ListTransferFilesResponseBodyFiles();
            return TeaModel.build(map, self);
        }

        public ListTransferFilesResponseBodyFiles setIconUrl(String iconUrl) {
            this.iconUrl = iconUrl;
            return this;
        }
        public String getIconUrl() {
            return this.iconUrl;
        }

        public ListTransferFilesResponseBodyFiles setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListTransferFilesResponseBodyFiles setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListTransferFilesResponseBodyFiles setOssFileName(String ossFileName) {
            this.ossFileName = ossFileName;
            return this;
        }
        public String getOssFileName() {
            return this.ossFileName;
        }

        public ListTransferFilesResponseBodyFiles setOssFilePath(String ossFilePath) {
            this.ossFilePath = ossFilePath;
            return this;
        }
        public String getOssFilePath() {
            return this.ossFilePath;
        }

        public ListTransferFilesResponseBodyFiles setSize(String size) {
            this.size = size;
            return this;
        }
        public String getSize() {
            return this.size;
        }

        public ListTransferFilesResponseBodyFiles setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListTransferFilesResponseBodyFiles setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
