// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class SearchLogResponseBody extends TeaModel {
    @NameInMap("SlsLogItemList")
    public SearchLogResponseBodySlsLogItemList slsLogItemList;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Completed")
    public Boolean completed;

    public static SearchLogResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SearchLogResponseBody self = new SearchLogResponseBody();
        return TeaModel.build(map, self);
    }

    public SearchLogResponseBody setSlsLogItemList(SearchLogResponseBodySlsLogItemList slsLogItemList) {
        this.slsLogItemList = slsLogItemList;
        return this;
    }
    public SearchLogResponseBodySlsLogItemList getSlsLogItemList() {
        return this.slsLogItemList;
    }

    public SearchLogResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SearchLogResponseBody setCompleted(Boolean completed) {
        this.completed = completed;
        return this;
    }
    public Boolean getCompleted() {
        return this.completed;
    }

    public static class SearchLogResponseBodySlsLogItemListSlsLogItem extends TeaModel {
        @NameInMap("SourceIp")
        public String sourceIp;

        @NameInMap("PackId")
        public String packId;

        @NameInMap("Path")
        public String path;

        @NameInMap("HostName")
        public String hostName;

        @NameInMap("Timestamp")
        public Integer timestamp;

        @NameInMap("Content")
        public String content;

        @NameInMap("PackMeta")
        public String packMeta;

        public static SearchLogResponseBodySlsLogItemListSlsLogItem build(java.util.Map<String, ?> map) throws Exception {
            SearchLogResponseBodySlsLogItemListSlsLogItem self = new SearchLogResponseBodySlsLogItemListSlsLogItem();
            return TeaModel.build(map, self);
        }

        public SearchLogResponseBodySlsLogItemListSlsLogItem setSourceIp(String sourceIp) {
            this.sourceIp = sourceIp;
            return this;
        }
        public String getSourceIp() {
            return this.sourceIp;
        }

        public SearchLogResponseBodySlsLogItemListSlsLogItem setPackId(String packId) {
            this.packId = packId;
            return this;
        }
        public String getPackId() {
            return this.packId;
        }

        public SearchLogResponseBodySlsLogItemListSlsLogItem setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public SearchLogResponseBodySlsLogItemListSlsLogItem setHostName(String hostName) {
            this.hostName = hostName;
            return this;
        }
        public String getHostName() {
            return this.hostName;
        }

        public SearchLogResponseBodySlsLogItemListSlsLogItem setTimestamp(Integer timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Integer getTimestamp() {
            return this.timestamp;
        }

        public SearchLogResponseBodySlsLogItemListSlsLogItem setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public SearchLogResponseBodySlsLogItemListSlsLogItem setPackMeta(String packMeta) {
            this.packMeta = packMeta;
            return this;
        }
        public String getPackMeta() {
            return this.packMeta;
        }

    }

    public static class SearchLogResponseBodySlsLogItemList extends TeaModel {
        @NameInMap("SlsLogItem")
        public java.util.List<SearchLogResponseBodySlsLogItemListSlsLogItem> slsLogItem;

        public static SearchLogResponseBodySlsLogItemList build(java.util.Map<String, ?> map) throws Exception {
            SearchLogResponseBodySlsLogItemList self = new SearchLogResponseBodySlsLogItemList();
            return TeaModel.build(map, self);
        }

        public SearchLogResponseBodySlsLogItemList setSlsLogItem(java.util.List<SearchLogResponseBodySlsLogItemListSlsLogItem> slsLogItem) {
            this.slsLogItem = slsLogItem;
            return this;
        }
        public java.util.List<SearchLogResponseBodySlsLogItemListSlsLogItem> getSlsLogItem() {
            return this.slsLogItem;
        }

    }

}
