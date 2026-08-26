// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class ListMessageGroupResponseBody extends TeaModel {
    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>16A96B9A-****-CB92E68F4CD8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Return result.</p>
     */
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
        /**
         * <p>Interactive Messages application ID.</p>
         * 
         * <strong>example:</strong>
         * <p>VKL3***</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>UTC timestamp when the message group was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1502280113</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>Creator ID.</p>
         * 
         * <strong>example:</strong>
         * <p>as****hs</p>
         */
        @NameInMap("CreatorId")
        public String creatorId;

        /**
         * <p>Extension field.</p>
         */
        @NameInMap("Extension")
        public java.util.Map<String, String> extension;

        /**
         * <p>Message group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>AE35-****-T95F</p>
         */
        @NameInMap("GroupId")
        public String groupId;

        /**
         * <p>Message group status. The default value is <strong>1</strong>, indicating that the message group status is normal.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Status")
        public Integer status;

        public static ListMessageGroupResponseBodyResultGroupList build(java.util.Map<String, ?> map) throws Exception {
            ListMessageGroupResponseBodyResultGroupList self = new ListMessageGroupResponseBodyResultGroupList();
            return TeaModel.build(map, self);
        }

        public ListMessageGroupResponseBodyResultGroupList setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
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
        /**
         * <p>Message group list.</p>
         */
        @NameInMap("GroupList")
        public java.util.List<ListMessageGroupResponseBodyResultGroupList> groupList;

        /**
         * <p>Indicates whether there is a next page. Valid values:</p>
         * <ul>
         * <li>true: There is a next page.</li>
         * <li>false: There is no next page.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("HasMore")
        public Boolean hasMore;

        /**
         * <p>Total number of message groups.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
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
