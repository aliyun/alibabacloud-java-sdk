// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class ListRecentlyRecycledDirectoriesResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // Id of the request
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("Entries")
    public java.util.List<ListRecentlyRecycledDirectoriesResponseBodyEntries> entries;

    public static ListRecentlyRecycledDirectoriesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRecentlyRecycledDirectoriesResponseBody self = new ListRecentlyRecycledDirectoriesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRecentlyRecycledDirectoriesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListRecentlyRecycledDirectoriesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListRecentlyRecycledDirectoriesResponseBody setEntries(java.util.List<ListRecentlyRecycledDirectoriesResponseBodyEntries> entries) {
        this.entries = entries;
        return this;
    }
    public java.util.List<ListRecentlyRecycledDirectoriesResponseBodyEntries> getEntries() {
        return this.entries;
    }

    public static class ListRecentlyRecycledDirectoriesResponseBodyEntries extends TeaModel {
        @NameInMap("FileId")
        public String fileId;

        @NameInMap("Path")
        public String path;

        @NameInMap("Name")
        public String name;

        @NameInMap("LastDeleteTime")
        public String lastDeleteTime;

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

        public ListRecentlyRecycledDirectoriesResponseBodyEntries setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public ListRecentlyRecycledDirectoriesResponseBodyEntries setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListRecentlyRecycledDirectoriesResponseBodyEntries setLastDeleteTime(String lastDeleteTime) {
            this.lastDeleteTime = lastDeleteTime;
            return this;
        }
        public String getLastDeleteTime() {
            return this.lastDeleteTime;
        }

    }

}
