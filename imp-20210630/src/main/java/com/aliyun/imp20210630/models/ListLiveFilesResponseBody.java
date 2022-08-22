// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class ListLiveFilesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public ListLiveFilesResponseBodyResult result;

    public static ListLiveFilesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListLiveFilesResponseBody self = new ListLiveFilesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListLiveFilesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListLiveFilesResponseBody setResult(ListLiveFilesResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public ListLiveFilesResponseBodyResult getResult() {
        return this.result;
    }

    public static class ListLiveFilesResponseBodyResultFileList extends TeaModel {
        @NameInMap("FileName")
        public String fileName;

        @NameInMap("Url")
        public String url;

        public static ListLiveFilesResponseBodyResultFileList build(java.util.Map<String, ?> map) throws Exception {
            ListLiveFilesResponseBodyResultFileList self = new ListLiveFilesResponseBodyResultFileList();
            return TeaModel.build(map, self);
        }

        public ListLiveFilesResponseBodyResultFileList setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public ListLiveFilesResponseBodyResultFileList setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class ListLiveFilesResponseBodyResult extends TeaModel {
        @NameInMap("FileList")
        public java.util.List<ListLiveFilesResponseBodyResultFileList> fileList;

        public static ListLiveFilesResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListLiveFilesResponseBodyResult self = new ListLiveFilesResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListLiveFilesResponseBodyResult setFileList(java.util.List<ListLiveFilesResponseBodyResultFileList> fileList) {
            this.fileList = fileList;
            return this;
        }
        public java.util.List<ListLiveFilesResponseBodyResultFileList> getFileList() {
            return this.fileList;
        }

    }

}
