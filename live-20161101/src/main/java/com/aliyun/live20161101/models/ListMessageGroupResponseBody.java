// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class ListMessageGroupResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public ListMessageGroupResponseBodyResult result;

    public static ListMessageGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMessageGroupResponseBody self = new ListMessageGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMessageGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListMessageGroupResponseBody setResult(ListMessageGroupResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public ListMessageGroupResponseBodyResult getResult() {
        return this.result;
    }

    public static class ListMessageGroupResponseBodyResultGroupList extends TeaModel {
        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("CreatorId")
        public String creatorId;

        @NameInMap("Extension")
        public java.util.Map<String, String> extension;

        @NameInMap("GroupId")
        public String groupId;

        @NameInMap("Status")
        public Integer status;

        public static ListMessageGroupResponseBodyResultGroupList build(java.util.Map<String, ?> map) throws Exception {
            ListMessageGroupResponseBodyResultGroupList self = new ListMessageGroupResponseBodyResultGroupList();
            return TeaModel.build(map, self);
        }

        public ListMessageGroupResponseBodyResultGroupList setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListMessageGroupResponseBodyResultGroupList setCreatorId(String creatorId) {
            this.creatorId = creatorId;
            return this;
        }
        public String getCreatorId() {
            return this.creatorId;
        }

        public ListMessageGroupResponseBodyResultGroupList setExtension(java.util.Map<String, String> extension) {
            this.extension = extension;
            return this;
        }
        public java.util.Map<String, String> getExtension() {
            return this.extension;
        }

        public ListMessageGroupResponseBodyResultGroupList setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public ListMessageGroupResponseBodyResultGroupList setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

    }

    public static class ListMessageGroupResponseBodyResult extends TeaModel {
        @NameInMap("GroupList")
        public java.util.List<ListMessageGroupResponseBodyResultGroupList> groupList;

        @NameInMap("HasMore")
        public Boolean hasMore;

        @NameInMap("Total")
        public Integer total;

        public static ListMessageGroupResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListMessageGroupResponseBodyResult self = new ListMessageGroupResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListMessageGroupResponseBodyResult setGroupList(java.util.List<ListMessageGroupResponseBodyResultGroupList> groupList) {
            this.groupList = groupList;
            return this;
        }
        public java.util.List<ListMessageGroupResponseBodyResultGroupList> getGroupList() {
            return this.groupList;
        }

        public ListMessageGroupResponseBodyResult setHasMore(Boolean hasMore) {
            this.hasMore = hasMore;
            return this;
        }
        public Boolean getHasMore() {
            return this.hasMore;
        }

        public ListMessageGroupResponseBodyResult setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
