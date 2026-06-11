// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class ListWorkspaceCodeResponseBody extends TeaModel {
    /**
     * <p>The data returned in the response.</p>
     */
    @NameInMap("Data")
    public ListWorkspaceCodeResponseBodyData data;

    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>InvalidTid</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The error message returned if the request fails.</p>
     * 
     * <strong>example:</strong>
     * <p>This record is being collected, please wait for a moment.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>67E910F2-4B62-5B0C-ACA3-7547695C****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListWorkspaceCodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListWorkspaceCodeResponseBody self = new ListWorkspaceCodeResponseBody();
        return TeaModel.build(map, self);
    }

    public ListWorkspaceCodeResponseBody setData(ListWorkspaceCodeResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListWorkspaceCodeResponseBodyData getData() {
        return this.data;
    }

    public ListWorkspaceCodeResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListWorkspaceCodeResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListWorkspaceCodeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListWorkspaceCodeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListWorkspaceCodeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListWorkspaceCodeResponseBodyDataList extends TeaModel {
        /**
         * <p>Indicates whether the object is a directory.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsDir")
        public Boolean isDir;

        /**
         * <p>The modification time of the file.</p>
         * <p>The time is in the ISO 8601 format: <code>yyyy-MM-ddTHH:mm:ssZ</code>.</p>
         * <p>This parameter is returned only for files.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-01-01T10:11:12Z</p>
         */
        @NameInMap("Mtime")
        public String mtime;

        /**
         * <p>The name of the file or directory.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The file size in bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>59</p>
         */
        @NameInMap("Size")
        public Long size;

        /**
         * <p>The target of the symlink.</p>
         * 
         * <strong>example:</strong>
         * <p>../abc.py</p>
         */
        @NameInMap("Symlink")
        public String symlink;

        public static ListWorkspaceCodeResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            ListWorkspaceCodeResponseBodyDataList self = new ListWorkspaceCodeResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public ListWorkspaceCodeResponseBodyDataList setIsDir(Boolean isDir) {
            this.isDir = isDir;
            return this;
        }
        public Boolean getIsDir() {
            return this.isDir;
        }

        public ListWorkspaceCodeResponseBodyDataList setMtime(String mtime) {
            this.mtime = mtime;
            return this;
        }
        public String getMtime() {
            return this.mtime;
        }

        public ListWorkspaceCodeResponseBodyDataList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListWorkspaceCodeResponseBodyDataList setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

        public ListWorkspaceCodeResponseBodyDataList setSymlink(String symlink) {
            this.symlink = symlink;
            return this;
        }
        public String getSymlink() {
            return this.symlink;
        }

    }

    public static class ListWorkspaceCodeResponseBodyData extends TeaModel {
        /**
         * <p>An array of objects representing the files and directories.</p>
         */
        @NameInMap("List")
        public java.util.List<ListWorkspaceCodeResponseBodyDataList> list;

        public static ListWorkspaceCodeResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListWorkspaceCodeResponseBodyData self = new ListWorkspaceCodeResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListWorkspaceCodeResponseBodyData setList(java.util.List<ListWorkspaceCodeResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<ListWorkspaceCodeResponseBodyDataList> getList() {
            return this.list;
        }

    }

}
