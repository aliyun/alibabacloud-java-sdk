// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class ListRecentlyRecycledDirectoriesResponseBody extends TeaModel {
    /**
     * <p>The information about the directories that are recently deleted.</p>
     */
    @NameInMap("Entries")
    public java.util.List<ListRecentlyRecycledDirectoriesResponseBodyEntries> entries;

    /**
     * <p>A pagination token.</p>
     * <br>
     * <p>If not all directories are returned in a query, the return value of the NextToken parameter is not empty. In this case, you can specify a valid value for the NextToken parameter to continue the query.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListRecentlyRecycledDirectoriesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRecentlyRecycledDirectoriesResponseBody self = new ListRecentlyRecycledDirectoriesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRecentlyRecycledDirectoriesResponseBody setEntries(java.util.List<ListRecentlyRecycledDirectoriesResponseBodyEntries> entries) {
        this.entries = entries;
        return this;
    }
    public java.util.List<ListRecentlyRecycledDirectoriesResponseBodyEntries> getEntries() {
        return this.entries;
    }

    public ListRecentlyRecycledDirectoriesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListRecentlyRecycledDirectoriesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListRecentlyRecycledDirectoriesResponseBodyEntries extends TeaModel {
        /**
         * <p>The ID of the directory.</p>
         */
        @NameInMap("FileId")
        public String fileId;

        /**
         * <p>The time when the directory was last deleted.</p>
         */
        @NameInMap("LastDeleteTime")
        public String lastDeleteTime;

        /**
         * <p>The name of the directory.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The absolute path to the directory.</p>
         */
        @NameInMap("Path")
        public String path;

        public static ListRecentlyRecycledDirectoriesResponseBodyEntries build(java.util.Map<String, ?> map) throws Exception {
            ListRecentlyRecycledDirectoriesResponseBodyEntries self = new ListRecentlyRecycledDirectoriesResponseBodyEntries();
            return TeaModel.build(map, self);
        }

        public ListRecentlyRecycledDirectoriesResponseBodyEntries setFileId(String fileId) {
            this.fileId = fileId;
            return this;
        }
        public String getFileId() {
            return this.fileId;
        }

        public ListRecentlyRecycledDirectoriesResponseBodyEntries setLastDeleteTime(String lastDeleteTime) {
            this.lastDeleteTime = lastDeleteTime;
            return this;
        }
        public String getLastDeleteTime() {
            return this.lastDeleteTime;
        }

        public ListRecentlyRecycledDirectoriesResponseBodyEntries setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListRecentlyRecycledDirectoriesResponseBodyEntries setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

    }

}
